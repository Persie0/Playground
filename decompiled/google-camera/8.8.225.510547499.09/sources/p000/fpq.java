package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpq implements fpx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f23129a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f23130b;

    public fpq(fpr fprVar, int i) {
        this.f23130b = i;
        this.f23129a = fprVar;
    }

    public fpq(gth gthVar, int i) {
        this.f23130b = i;
        this.f23129a = gthVar;
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: d */
    public final gth mo8671d() {
        switch (this.f23130b) {
            case 0:
                return (gth) ((fpr) this.f23129a).f23133c;
            default:
                return (gth) this.f23129a;
        }
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: a */
    public final float mo8668a() {
        switch (this.f23130b) {
            case 0:
                return ((gth) ((fpr) this.f23129a).f23133c).f26340b;
            default:
                return ((gth) this.f23129a).f26340b;
        }
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: b */
    public final float mo8669b() {
        switch (this.f23130b) {
            case 0:
                return ((fpr) this.f23129a).f23132b;
            default:
                return ((gth) this.f23129a).f26340b;
        }
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: c */
    public final long mo8670c() {
        switch (this.f23130b) {
            case 0:
                return ((gth) ((fpr) this.f23129a).f23133c).f26339a;
            default:
                return ((gth) this.f23129a).f26339a;
        }
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: e */
    public final mrm mo8672e() {
        switch (this.f23130b) {
            case 0:
                return ((gth) ((fpr) this.f23129a).f23133c).f26356r;
            default:
                return ((gth) this.f23129a).f26356r;
        }
    }

    @Override // p000.fpx
    /* JADX INFO: renamed from: f */
    public final mrm mo8673f() {
        switch (this.f23130b) {
            case 0:
                return ((gth) ((fpr) this.f23129a).f23133c).f26354p;
            default:
                return ((gth) this.f23129a).f26354p;
        }
    }
}
