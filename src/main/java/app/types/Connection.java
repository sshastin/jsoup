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
    private List<ConnectedStation> connection = new ArrayList<>();

    public void addConnectedStation(ConnectedStation connectedStation) {
        connection.add(connectedStation);
        connection.sort(Comparator.comparing(ConnectedStation::getLine));
    }
}
