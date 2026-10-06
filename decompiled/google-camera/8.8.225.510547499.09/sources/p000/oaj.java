package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum oaj {
    DOUBLE(oak.DOUBLE, 1),
    FLOAT(oak.FLOAT, 5),
    f45133c(oak.LONG, 0),
    UINT64(oak.LONG, 0),
    INT32(oak.INT, 0),
    FIXED64(oak.LONG, 1),
    FIXED32(oak.INT, 5),
    BOOL(oak.BOOLEAN, 0),
    STRING(oak.STRING, 2),
    GROUP(oak.MESSAGE, 3),
    f45141k(oak.MESSAGE, 2),
    BYTES(oak.BYTE_STRING, 2),
    UINT32(oak.INT, 0),
    ENUM(oak.ENUM, 0),
    SFIXED32(oak.INT, 5),
    SFIXED64(oak.LONG, 1),
    f45147q(oak.INT, 0),
    SINT64(oak.LONG, 0);


    /* JADX INFO: renamed from: s */
    public final oak f45150s;

    /* JADX INFO: renamed from: t */
    public final int f45151t;

    oaj(oak oakVar, int i) {
        this.f45150s = oakVar;
        this.f45151t = i;
    }
}
