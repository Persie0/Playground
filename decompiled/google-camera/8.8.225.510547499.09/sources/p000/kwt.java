package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum kwt implements nxt {
    UNKNOWN_DYNAMIC_LOADING_MODE(0),
    ENABLED(1),
    DISABLED(2),
    ARCORE_ONLY(3),
    PLAYGROUND_ONLY(4);


    /* JADX INFO: renamed from: f */
    public final int f37537f;

    kwt(int i) {
        this.f37537f = i;
    }

    /* JADX INFO: renamed from: b */
    public static kwt m14949b(int i) {
        switch (i) {
            case 0:
                return UNKNOWN_DYNAMIC_LOADING_MODE;
            case 1:
                return ENABLED;
            case 2:
                return DISABLED;
            case 3:
                return ARCORE_ONLY;
            case 4:
                return PLAYGROUND_ONLY;
            default:
                return null;
        }
    }

    @Override // p000.nxt
    /* JADX INFO: renamed from: a */
    public final int mo14936a() {
        return this.f37537f;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f37537f);
    }
}
