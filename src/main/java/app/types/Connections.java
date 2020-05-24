package app.types;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Connections {
    @Getter
    private List<Connection> connectionList;
}