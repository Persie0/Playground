package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gzl {
    OFF(0),
    ON_LIGHT(1),
    ON_STRONG(2),
    DEBUG_MAX(3),
    ON_ADAPTIVE(4);


    /* JADX INFO: renamed from: f */
    public final int f26939f;

    gzl(int i) {
        this.f26939f = i;
    }

    /* JADX INFO: renamed from: a */
    public static gzl m10015a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return ON_LIGHT;
            case 2:
                return ON_STRONG;
            case 3:
                return DEBUG_MAX;
            case 4:
                return ON_ADAPTIVE;
            default:
                throw new IllegalArgumentException("Unknown beautification level");
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10016b() {
        return this != OFF;
    }
}
