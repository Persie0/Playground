package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fpr {

    /* JADX INFO: renamed from: a */
    public float f23131a;

    /* JADX INFO: renamed from: b */
    public float f23132b;

    /* JADX INFO: renamed from: c */
    public final Object f23133c;

    public fpr() {
        this.f23131a = -4.2f;
        this.f23133c = new aio();
    }

    public fpr(gth gthVar) {
        this.f23133c = gthVar;
        float f = gthVar.f26340b;
        float f2 = gthVar.f26344f;
        float f3 = -1000.0f;
        if ((f2 <= 0.0f || !gthVar.f26352n) && (f2 >= 1.0f || !gthVar.f26353o)) {
            f3 = 0.0f;
        }
        float f4 = f + f3;
        this.f23131a = f4;
        this.f23132b = f4;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m8674a(float f) {
        return Math.abs(f) < this.f23132b;
    }
}
