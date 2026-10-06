package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum ikw {
    UNINITIALIZED(0, false, false),
    PHOTO(1, true, true),
    VIDEO(2, true, true),
    IMAX(3, false, false),
    PHOTO_SPHERE(4, false, false),
    SLOW_MOTION(5, true, true),
    PORTRAIT(7, true, true),
    IMAGE_INTENT(8, true, true),
    VIDEO_INTENT(9, true, true),
    ORNAMENT(10, false, false),
    LENS(11, false, false),
    MOTION_BLUR(13, true, true),
    LONG_EXPOSURE(14, true, true),
    TIME_LAPSE(15, true, true),
    SETTINGS(16, true, true),
    MORE_MODES(17, true, false),
    MEASURE(18, false, false),
    REWIND(19, false, false),
    TIARA(20, false, false),
    AMBER(21, true, true);


    /* JADX INFO: renamed from: u */
    public final int f31412u;

    /* JADX INFO: renamed from: v */
    public final boolean f31413v;

    /* JADX INFO: renamed from: w */
    public final boolean f31414w;

    ikw(int i, boolean z, boolean z2) {
        if (!z && z2) {
            throw new IllegalArgumentException("illegal mode configuration");
        }
        this.f31412u = i;
        this.f31413v = z;
        this.f31414w = z2;
    }
}
