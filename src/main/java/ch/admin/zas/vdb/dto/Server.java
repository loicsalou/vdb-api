package ch.admin.zas.vdb.dto;

public record Server(
        Integer id, // Nullable pour représenter l'optionalité
        String ip,
        String name
) {
    // Constructeur surchargé pour les instances sans 'id'
    public Server(String ip, String name) {
        this(null, ip, name);
    }
}
