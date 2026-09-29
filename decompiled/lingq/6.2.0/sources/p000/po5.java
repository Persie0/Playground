package p000;

import androidx.compose.foundation.C0124k;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class po5 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56587a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0124k f56588b;

    public /* synthetic */ po5(C0124k c0124k, int i) {
        this.f56587a = i;
        this.f56588b = c0124k;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f56587a;
        C0124k c0124k = this.f56588b;
        switch (i) {
            case 0:
                c0124k.m963b1();
                return xfa.f68157a;
            case 1:
                return new gq6(c0124k.f2406R);
            default:
                aq4 aq4Var = (aq4) ((xc9) c0124k.f2404P).getValue();
                return new gq6(aq4Var != null ? aq4Var.mo1671R(0L) : 9205357640488583168L);
        }
    }
}
