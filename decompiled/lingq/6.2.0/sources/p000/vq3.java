package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class vq3 implements ph7 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3571se f65778a;

    /* JADX INFO: renamed from: b */
    public final oq6 f65779b;

    /* JADX INFO: renamed from: c */
    public long f65780c = 0;

    public vq3(InterfaceC3571se interfaceC3571se, oq6 oq6Var) {
        this.f65778a = interfaceC3571se;
        this.f65779b = oq6Var;
    }

    @Override // p000.ph7
    /* JADX INFO: renamed from: f */
    public final long mo12788f(j84 j84Var, long j, LayoutDirection layoutDirection, long j2) {
        long jMo18206a = this.f65779b.mo18206a();
        if ((9223372034707292159L & jMo18206a) == 9205357640488583168L) {
            jMo18206a = this.f65780c;
        }
        this.f65780c = jMo18206a;
        return f84.m11595d(f84.m11595d(j84Var.m14323c(), pvc.m19495C(jMo18206a)), this.f65778a.mo10276a(j2, 0L, layoutDirection));
    }
}
