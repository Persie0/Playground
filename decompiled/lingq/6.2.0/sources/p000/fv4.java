package p000;

import androidx.compose.foundation.lazy.C0127b;

/* JADX INFO: loaded from: classes.dex */
public final class fv4 extends AbstractC3572sf {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ long f39736H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ C0127b f39737I;

    /* JADX INFO: renamed from: b */
    public final wu4 f39738b;

    /* JADX INFO: renamed from: c */
    public final cu4 f39739c;

    /* JADX INFO: renamed from: d */
    public final long f39740d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f39741e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ cu4 f39742f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f39743g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f39744h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC3457pe f39745i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ fc0 f39746j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f39747k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f39748l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv4(long j, boolean z, wu4 wu4Var, cu4 cu4Var, int i, int i2, InterfaceC3457pe interfaceC3457pe, fc0 fc0Var, int i3, int i4, long j2, C0127b c0127b) {
        super(5);
        this.f39741e = z;
        this.f39742f = cu4Var;
        this.f39743g = i;
        this.f39744h = i2;
        this.f39745i = interfaceC3457pe;
        this.f39746j = fc0Var;
        this.f39747k = i3;
        this.f39748l = i4;
        this.f39736H = j2;
        this.f39737I = c0127b;
        this.f39738b = wu4Var;
        this.f39739c = cu4Var;
        this.f39740d = dk1.m10424b(0, z ? bk1.m3801i(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : bk1.m3800h(j), 5);
    }

    /* JADX INFO: renamed from: E */
    public final iv4 m12210E(int i, long j) {
        wu4 wu4Var = this.f39738b;
        Object objMo15747c = wu4Var.mo15747c(i);
        Object objM996c = wu4Var.f67299b.m996c(i);
        return new iv4(i, m21328r(this.f39739c, i, j), this.f39741e, this.f39745i, this.f39746j, this.f39742f.f34541b.getLayoutDirection(), this.f39747k, this.f39748l, i == this.f39743g + (-1) ? 0 : this.f39744h, this.f39736H, objMo15747c, objM996c, this.f39737I.f2450o, j);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: p */
    public final du4 mo12211p(int i, int i2, int i3, long j) {
        return m12210E(i, j);
    }
}
