package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
enum neh {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    /* JADX INFO: renamed from: a */
    public static neh m17415a(Object obj) {
        if (obj instanceof String) {
            return STRING;
        }
        if (obj instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj instanceof Long) {
            return LONG;
        }
        if (obj instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(String.valueOf(obj.getClass()))));
    }
}
