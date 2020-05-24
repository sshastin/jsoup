package app.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Connection {
    @Getter
    private List<ConnectedStation> connectedStationList = new ArrayList<>();

    public void addConnectedStation(ConnectedStation connectedStation) {
        connectedStationList.add(connectedStation);
        connectedStationList.sort(Comparator.comparing(ConnectedStation::getLine));
    }
}
