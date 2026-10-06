package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum oyz implements nxt {
    UNKNOWN(0),
    FOREGROUND_TO_BACKGROUND(1),
    BACKGROUND_TO_FOREGROUND(2),
    f46895d(3),
    FOREGROUND_SERVICE_STOP(4),
    CUSTOM_MEASURE_START(5),
    CUSTOM_MEASURE_STOP(6);


    /* JADX INFO: renamed from: h */
    public final int f46900h;

    oyz(int i) {
        this.f46900h = i;
    }

    /* JADX INFO: renamed from: b */
    public static oyz m19210b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FOREGROUND_TO_BACKGROUND;
            case 2:
                return BACKGROUND_TO_FOREGROUND;
            case 3:
                return f46895d;
            case 4:
                return FOREGROUND_SERVICE_STOP;
            case 5:
                return CUSTOM_MEASURE_START;
            case 6:
                return CUSTOM_MEASURE_STOP;
            default:
                return null;
        }
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f46900h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f46900h);
    }
}
