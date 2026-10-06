package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class imw {

    /* JADX INFO: renamed from: b */
    private final float f31557b;

    /* JADX INFO: renamed from: c */
    private float f31558c = 0.0f;

    /* JADX INFO: renamed from: a */
    public float f31556a = 0.0f;

    public imw(int i) {
        this.f31557b = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m11498a(float f) {
        float f2 = this.f31558c;
        float f3 = this.f31557b;
        if (f2 != f3) {
            f3 = f2 + 1.0f;
        }
        this.f31558c = f3;
        float f4 = 1.0f / f3;
        this.f31556a = (this.f31556a * (1.0f - f4)) + (f * f4);
    }

    /* JADX INFO: renamed from: b */
    public final void m11499b() {
        this.f31558c = 0.0f;
        this.f31556a = 0.0f;
    }
}
