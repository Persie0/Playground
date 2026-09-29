package p000;

import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.p002ui.node.LayoutNode$UsageByParent;

/* JADX INFO: loaded from: classes.dex */
public final class v54 extends yk5 {
    @Override // p000.ct5
    /* JADX INFO: renamed from: U */
    public final int mo1510U(int i) {
        bl2 bl2VarM1609v = this.f69928J.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo741e((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1600m(), i);
    }

    @Override // p000.yk5
    /* JADX INFO: renamed from: V0 */
    public final void mo23124V0() {
        C0360j c0360j = this.f69928J.f4432J.f4337b0.f58071q;
        c0360j.getClass();
        c0360j.m1635H0();
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: c */
    public final int mo1511c(int i) {
        bl2 bl2VarM1609v = this.f69928J.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo740d((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1600m(), i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: l */
    public final int mo1512l(int i) {
        bl2 bl2VarM1609v = this.f69928J.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo739c((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1600m(), i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: p */
    public final int mo1513p(int i) {
        bl2 bl2VarM1609v = this.f69928J.f4432J.m1609v();
        ht5 ht5VarM3830K = bl2VarM1609v.m3830K();
        C0357g c0357g = (C0357g) bl2VarM1609v.f8655a;
        return ht5VarM3830K.mo737a((AbstractC0362l) c0357g.f4335a0.f46677e, c0357g.m1600m(), i);
    }

    @Override // p000.ct5
    /* JADX INFO: renamed from: r */
    public final l87 mo1514r(long j) {
        m16026m0(j);
        AbstractC0362l abstractC0362l = this.f69928J;
        x66 x66VarM1559B = abstractC0362l.f4432J.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            C0360j c0360j = ((C0357g) objArr[i2]).f4337b0.f58071q;
            c0360j.getClass();
            c0360j.f4390j = LayoutNode$UsageByParent.NotUsed;
        }
        C0357g c0357g = abstractC0362l.f4432J;
        yk5.m25166U0(this, c0357g.f4325R.mo738b(this, c0357g.m1600m(), j));
        return this;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: r0 */
    public final int mo1547r0(AbstractC3608te abstractC3608te) {
        C0360j c0360j = this.f69928J.f4432J.f4337b0.f58071q;
        c0360j.getClass();
        oq4 oq4Var = c0360j.f4375N;
        if (!c0360j.f4391k) {
            qq4 qq4Var = c0360j.f4386f;
            if (qq4Var.f58058d == LayoutNode$LayoutState.LookaheadMeasuring) {
                oq4Var.f4294f = true;
                if (oq4Var.f4290b) {
                    qq4Var.f58060f = true;
                    qq4Var.f58061g = true;
                }
            } else {
                oq4Var.f4295g = true;
            }
        }
        v54 v54Var = c0360j.mo1643e().f4308o0;
        Boolean boolValueOf = v54Var != null ? Boolean.valueOf(v54Var.f4367k) : null;
        v54 v54Var2 = c0360j.mo1643e().f4308o0;
        if (v54Var2 != null) {
            v54Var2.f4367k = true;
        }
        c0360j.mo1636I();
        v54 v54Var3 = c0360j.mo1643e().f4308o0;
        if (v54Var3 != null) {
            v54Var3.f4367k = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) oq4Var.f4297i.get(abstractC3608te);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.f69933O.m10128g(iIntValue, abstractC3608te);
        return iIntValue;
    }
}
