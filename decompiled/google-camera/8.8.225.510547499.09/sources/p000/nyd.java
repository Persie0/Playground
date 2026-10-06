package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nyd {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(nwr.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);


    /* JADX INFO: renamed from: k */
    public final Class f45015k;

    static {
        nwr nwrVar = nwr.f44839b;
    }

    nyd(Class cls) {
        this.f45015k = cls;
    }
}
