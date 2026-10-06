package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gzo {
    OFF(0),
    ON(1);


    /* JADX INFO: renamed from: c */
    public final int f26952c;

    gzo(int i) {
        this.f26952c = i;
    }

    /* JADX INFO: renamed from: a */
    public static gzo m10018a(int i) {
        switch (i) {
            case 0:
                return OFF;
            case 1:
                return ON;
            default:
                return OFF;
        }
    }
}
