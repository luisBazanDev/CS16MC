package pe.bazan.luis.plugins.cs16mc.domain.enums;

public enum MapType {
    DUST2,
    ASSAULT,
    HIGHRISE,
    INFERNO,
    OFFICE,
    VERTIGO,
    OTHER;

    public static MapType resolveType(String name) {
        if (name.toLowerCase().contains("dust2")) {
            return DUST2;
        } else if (name.toLowerCase().contains("assult")) {
            return ASSAULT;
        } else if (name.toLowerCase().contains("highrise")) {
            return HIGHRISE;
        } else if (name.toLowerCase().contains("inferno")) {
            return INFERNO;
        } else if (name.toLowerCase().contains("office")) {
            return OFFICE;
        } else if (name.toLowerCase().contains("vertigo")) {
            return VERTIGO;
        }
        return OTHER;
    }
}
