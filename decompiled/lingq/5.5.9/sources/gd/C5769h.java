package gd;

/* JADX INFO: renamed from: gd.h */
/* JADX INFO: loaded from: classes.dex */
public final class C5769h extends C5766e {

    /* JADX INFO: renamed from: a */
    public final C5766e f34891a;

    /* JADX INFO: renamed from: b */
    public final float f34892b;

    public C5769h(C5767f c5767f, float f3) {
        this.f34891a = c5767f;
        this.f34892b = f3;
    }

    @Override // gd.C5766e
    /* JADX INFO: renamed from: b */
    public final boolean mo12128b() {
        return this.f34891a.mo12128b();
    }

    @Override // gd.C5766e
    /* JADX INFO: renamed from: c */
    public final void mo12129c(float f3, float f10, float f11, C5775n c5775n) {
        this.f34891a.mo12129c(f3, f10 - this.f34892b, f11, c5775n);
    }
}
