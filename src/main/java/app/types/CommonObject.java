package app.types;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class CommonObject {
    private final Lines lines;
    private final Connections connections;
}
