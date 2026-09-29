package p000;

/* JADX INFO: loaded from: classes.dex */
public final class aj8 implements eg7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ float f727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ float f728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f729c;

    public aj8(float f, float f2, float f3) {
        this.f727a = f;
        this.f728b = f2;
        this.f729c = f3;
    }

    @Override // p000.eg7
    /* JADX INFO: renamed from: b */
    public final long mo505b(float f, float f2) {
        float f3 = f + this.f727a;
        float f4 = this.f728b;
        return i73.m13710a(f3 / f4, (f2 + this.f729c) / f4);
    }
}
