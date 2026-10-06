package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum hyn {
    OFF(0),
    THREE_BY_THREE(1),
    FOUR_BY_FOUR(2),
    GOLDEN_RATIO(3);


    /* JADX INFO: renamed from: e */
    public final int f29942e;

    hyn(int i) {
        this.f29942e = i;
    }

    /* JADX INFO: renamed from: a */
    public static hyn m10873a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return THREE_BY_THREE;
            case 2:
                return FOUR_BY_FOUR;
            case 3:
                return GOLDEN_RATIO;
            default:
                return OFF;
        }
    }
}
