package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gzk {
    ON(0),
    ON_LOCKED(1),
    OFF_NEAR(2),
    OFF_FAR(3),
    OFF_INFINITY(4);


    /* JADX INFO: renamed from: f */
    public final int f26932f;

    gzk(int i) {
        this.f26932f = i;
    }

    /* JADX INFO: renamed from: a */
    public static gzk m10013a(int i) {
        switch (i) {
            case 1:
                return ON_LOCKED;
            case 2:
                return OFF_NEAR;
            case 3:
                return OFF_FAR;
            case 4:
                return OFF_INFINITY;
            default:
                return ON;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m10014b() {
        jxp jxpVar = jxp.RES_UNKNOWN;
        switch (this) {
            case ON:
                return 2;
            case ON_LOCKED:
                return 3;
            case OFF_NEAR:
                return 4;
            case OFF_FAR:
                return 5;
            case OFF_INFINITY:
                return 6;
            default:
                return 1;
        }
    }
}
