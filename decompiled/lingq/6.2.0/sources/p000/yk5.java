package p000;

import androidx.compose.p002ui.node.AbstractC0359i;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0360j;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class yk5 extends AbstractC0359i implements ct5 {

    /* JADX INFO: renamed from: J */
    public final AbstractC0362l f69928J;

    /* JADX INFO: renamed from: L */
    public LinkedHashMap f69930L;

    /* JADX INFO: renamed from: N */
    public it5 f69932N;

    /* JADX INFO: renamed from: O */
    public final d66 f69933O;

    /* JADX INFO: renamed from: K */
    public long f69929K = 0;

    /* JADX INFO: renamed from: M */
    public final zk5 f69931M = new zk5(this);

    public yk5(AbstractC0362l abstractC0362l) {
        this.f69928J = abstractC0362l;
        d66 d66Var = hp6.f42737a;
        this.f69933O = new d66();
    }

    /* JADX INFO: renamed from: U0 */
    public static final void m25166U0(yk5 yk5Var, it5 it5Var) {
        LinkedHashMap linkedHashMap;
        if (it5Var != null) {
            yk5Var.m16025k0((((long) it5Var.mo10623a()) & 4294967295L) | (((long) it5Var.mo10626d()) << 32));
        } else {
            yk5Var.m16025k0(0L);
        }
        if (!fa4.m11650l(yk5Var.f69932N, it5Var) && it5Var != null && ((((linkedHashMap = yk5Var.f69930L) != null && !linkedHashMap.isEmpty()) || !it5Var.mo10624b().isEmpty()) && !fa4.m11650l(it5Var.mo10624b(), yk5Var.f69930L))) {
            C0360j c0360j = yk5Var.f69928J.f4432J.f4337b0.f58071q;
            c0360j.getClass();
            c0360j.f4375N.m1538g();
            LinkedHashMap linkedHashMap2 = yk5Var.f69930L;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                yk5Var.f69930L = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(it5Var.mo10624b());
        }
        yk5Var.f69932N = it5Var;
    }

    @Override // p000.l87, p000.ct5
    /* JADX INFO: renamed from: A */
    public final Object mo1509A() {
        return this.f69928J.mo1509A();
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: E0 */
    public final AbstractC0359i mo1618E0() {
        AbstractC0362l abstractC0362l = this.f69928J.f4433K;
        if (abstractC0362l != null) {
            return abstractC0362l.mo1542d1();
        }
        return null;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: H0 */
    public final aq4 mo1620H0() {
        return this.f69931M;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: I0 */
    public final boolean mo1621I0() {
        return this.f69932N != null;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: J0 */
    public final C0357g mo1622J0() {
        return this.f69928J.f4432J;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: N0 */
    public final it5 mo1624N0() {
        it5 it5Var = this.f69932N;
        if (it5Var != null) {
            return it5Var;
        }
        throw AbstractC3393o1.m17745t("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: O0 */
    public final AbstractC0359i mo1625O0() {
        AbstractC0362l abstractC0362l = this.f69928J.f4434L;
        if (abstractC0362l != null) {
            return abstractC0362l.mo1542d1();
        }
        return null;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: P0 */
    public final long mo1626P0() {
        return this.f69929K;
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i
    /* JADX INFO: renamed from: T0 */
    public final void mo1629T0() {
        mo1544i0(this.f69929K, 0.0f, null);
    }

    /* JADX INFO: renamed from: V0 */
    public void mo23124V0() {
        mo1624N0().mo10625c();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m25167W0(long j) {
        if (!f84.m11593b(this.f69929K, j)) {
            this.f69929K = j;
            AbstractC0362l abstractC0362l = this.f69928J;
            C0360j c0360j = abstractC0362l.f4432J.f4337b0.f58071q;
            if (c0360j != null) {
                c0360j.m1633B0();
            }
            AbstractC0359i.m1616R0(abstractC0362l);
        }
        if (this.f4367k) {
            return;
        }
        m1617B0(mo1624N0());
    }

    /* JADX INFO: renamed from: X0 */
    public final long m25168X0(yk5 yk5Var, boolean z) {
        long jM11595d = 0;
        while (!this.equals(yk5Var)) {
            if (!this.f4365i || !z) {
                jM11595d = f84.m11595d(jM11595d, this.f69929K);
            }
            AbstractC0362l abstractC0362l = this.f69928J.f4434L;
            abstractC0362l.getClass();
            this = abstractC0362l.mo1542d1();
            this.getClass();
        }
        return jM11595d;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f69928J.mo594a();
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f69928J.mo597d0();
    }

    @Override // androidx.compose.p002ui.node.AbstractC0359i, p000.aa4
    /* JADX INFO: renamed from: f0 */
    public final boolean mo211f0() {
        return true;
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f69928J.f4432J.f4328U;
    }

    @Override // p000.l87
    /* JADX INFO: renamed from: i0 */
    public final void mo1544i0(long j, float f, vi3 vi3Var) {
        m25167W0(j);
        if (this.f4366j) {
            return;
        }
        mo23124V0();
    }
}
