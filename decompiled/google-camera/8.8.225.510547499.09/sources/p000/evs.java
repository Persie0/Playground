package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class evs implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f20478a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20479b;

    public evs(oju ojuVar, int i) {
        this.f20479b = i;
        this.f20478a = ojuVar;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f20479b) {
            case 0:
                break;
        }
        return m7932a();
    }

    /* JADX INFO: renamed from: a */
    public final fmy m7932a() {
        switch (this.f20479b) {
            case 0:
                return ((fms) this.f20478a).get().m8593a("PortraitCaptureSess", gyw.PORTRAIT);
            default:
                return ((fms) this.f20478a).get().m8593a("MotionBlurCaptureSess", gyw.MOTION_BLUR);
        }
    }
}
