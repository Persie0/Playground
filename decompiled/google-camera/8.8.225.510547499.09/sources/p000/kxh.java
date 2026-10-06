package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kxh implements nxt {
    UNKNOWN(0),
    OPEN(1),
    WPA(2),
    WEP(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: f */
    private final int f37643f;

    kxh(int i) {
        this.f37643f = i;
    }

    /* JADX INFO: renamed from: b */
    public static kxh m14954b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return OPEN;
            case 2:
                return WPA;
            case 3:
                return WEP;
            default:
                return null;
        }
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        if (this != UNRECOGNIZED) {
            return this.f37643f;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(mo14936a());
    }
}
