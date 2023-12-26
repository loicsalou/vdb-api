package ch.admin.zas.vdb.dto;

public record Data(
        Integer id, // Nullable pour représenter l'optionalité
        Vulnerability vuln,
        Server server
) {
    // Constructeur surchargé pour les instances sans 'id'
    public Data(Vulnerability vuln, Server server) {
        this(null, vuln, server);
    }
}

