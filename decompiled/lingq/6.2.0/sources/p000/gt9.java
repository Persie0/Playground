package p000;

import androidx.compose.foundation.text.contextmenu.modifier.AbstractC0173b;

/* JADX INFO: loaded from: classes.dex */
public final class gt9 implements dt9 {

    /* JADX INFO: renamed from: a */
    public final long f41307a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ht9 f41308b;

    public gt9(ht9 ht9Var, long j) {
        this.f41308b = ht9Var;
        this.f41307a = j;
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: U */
    public final ct9 mo10627U() {
        return AbstractC0173b.m1065a(this.f41308b);
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: l */
    public final long mo10628l(aq4 aq4Var) {
        aq4 aq4Var2 = (aq4) ((xc9) this.f41308b.f42933M).getValue();
        if (aq4Var2 != null) {
            if (aq4Var2.mo1691n()) {
                return aq4Var.mo1668L(aq4Var2.mo1695q(this.f41307a));
            }
            return 0L;
        }
        l54.m15817d("Tried to open context menu before the anchor was placed.");
        C3386nv.m17631r();
        return 0L;
    }

    @Override // p000.dt9
    /* JADX INFO: renamed from: p */
    public final e28 mo10629p(aq4 aq4Var) {
        return wfb.m23907b(mo10628l(aq4Var), 0L);
    }
}
