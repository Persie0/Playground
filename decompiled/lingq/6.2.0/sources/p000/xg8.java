package p000;

import androidx.compose.p002ui.graphics.colorspace.C0308a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xg8 implements aj2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68185a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0308a f68186b;

    public /* synthetic */ xg8(C0308a c0308a, int i) {
        this.f68185a = i;
        this.f68186b = c0308a;
    }

    @Override // p000.aj2
    /* JADX INFO: renamed from: c */
    public final double mo503c(double d) {
        int i = this.f68185a;
        C0308a c0308a = this.f68186b;
        switch (i) {
            case 0:
                return l70.m15943f(c0308a.f3948k.mo503c(d), c0308a.f3942e, c0308a.f3943f);
            default:
                return c0308a.f3951n.mo503c(l70.m15943f(d, c0308a.f3942e, c0308a.f3943f));
        }
    }
}
