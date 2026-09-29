package p000;

import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.LayoutNode$LayoutState;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class uq4 implements qm9 {

    /* JADX INFO: renamed from: a */
    public LayoutDirection f64210a = LayoutDirection.Rtl;

    /* JADX INFO: renamed from: b */
    public float f64211b;

    /* JADX INFO: renamed from: c */
    public float f64212c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0339f f64213d;

    public uq4(C0339f c0339f) {
        this.f64213d = c0339f;
    }

    @Override // p000.qm9
    /* JADX INFO: renamed from: J */
    public final List mo20032J(Object obj, zi3 zi3Var) {
        C0339f c0339f = this.f64213d;
        c0339f.m1501h();
        C0357g c0357g = c0339f.f4193a;
        LayoutNode$LayoutState layoutNode$LayoutState = c0357g.f4337b0.f58058d;
        LayoutNode$LayoutState layoutNode$LayoutState2 = LayoutNode$LayoutState.Measuring;
        if (layoutNode$LayoutState != layoutNode$LayoutState2 && layoutNode$LayoutState != LayoutNode$LayoutState.LayingOut && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadMeasuring && layoutNode$LayoutState != LayoutNode$LayoutState.LookaheadLayingOut) {
            i54.m13663b("subcompose can only be used inside the measure or layout blocks");
        }
        n66 n66Var = c0339f.f4199g;
        Object objM17255g = n66Var.m17255g(obj);
        if (objM17255g == null) {
            objM17255g = (C0357g) c0339f.f4202j.m17259k(obj);
            if (objM17255g != null) {
                if (c0339f.f4191J <= 0) {
                    i54.m13663b("Check failed.");
                }
                c0339f.f4191J--;
            } else {
                objM17255g = c0339f.m1508o(obj);
                if (objM17255g == null) {
                    int i = c0339f.f4196d;
                    C0357g c0357g2 = new C0357g(2);
                    c0357g.f4319L = true;
                    c0357g.m1561D(i, c0357g2);
                    c0357g.f4319L = false;
                    objM17255g = c0357g2;
                }
            }
            n66Var.m17261m(obj, objM17255g);
        }
        C0357g c0357g3 = (C0357g) objM17255g;
        if (u91.m22592J0(c0339f.f4196d, c0357g.m1603p()) != c0357g3) {
            int iM24312j = ((x66) ((f66) c0357g.m1603p()).f38520b).m24312j(c0357g3);
            if (iM24312j < c0339f.f4196d) {
                i54.m13662a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = c0339f.f4196d;
            if (i2 != iM24312j) {
                c0339f.m1504k(iM24312j, i2);
            }
        }
        c0339f.f4196d++;
        c0339f.m1507n(c0357g3, obj, false, zi3Var);
        return (layoutNode$LayoutState == layoutNode$LayoutState2 || layoutNode$LayoutState == LayoutNode$LayoutState.LayingOut) ? c0357g3.m1601n() : c0357g3.m1600m();
    }

    @Override // p000.jt5
    /* JADX INFO: renamed from: M */
    public final it5 mo1623M(int i, int i2, Map map, vi3 vi3Var, vi3 vi3Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            i54.m13663b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new tq4(i, i2, map, vi3Var, this, this.f64213d, vi3Var2);
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: a */
    public final float mo594a() {
        return this.f64211b;
    }

    @Override // p000.fb2
    /* JADX INFO: renamed from: d0 */
    public final float mo597d0() {
        return this.f64212c;
    }

    @Override // p000.aa4
    /* JADX INFO: renamed from: f0 */
    public final boolean mo211f0() {
        LayoutNode$LayoutState layoutNode$LayoutState = this.f64213d.f4193a.f4337b0.f58058d;
        return layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadLayingOut || layoutNode$LayoutState == LayoutNode$LayoutState.LookaheadMeasuring;
    }

    @Override // p000.aa4
    public final LayoutDirection getLayoutDirection() {
        return this.f64210a;
    }
}
