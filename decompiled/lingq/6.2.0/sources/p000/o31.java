package p000;

import android.view.KeyEvent;
import androidx.compose.foundation.AbstractC0075a;
import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.platform.AbstractC0402n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class o31 extends AbstractC0075a {

    /* JADX INFO: renamed from: f0 */
    public kg7 f53758f0;

    /* JADX INFO: renamed from: g0 */
    public a44 f53759g0;

    @Override // androidx.compose.foundation.AbstractC0075a, p000.ng7
    /* JADX INFO: renamed from: D */
    public final void mo786D(fg7 fg7Var, PointerEventPass pointerEventPass, long j) {
        super.mo786D(fg7Var, pointerEventPass, j);
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                if (this.f53758f0 != null) {
                    List list = fg7Var.f39071a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        kg7 kg7Var = (kg7) list.get(i);
                        if (kg7Var.m15191c() && kg7Var != this.f53758f0) {
                            m17774p1(false);
                            break;
                        }
                    }
                }
                if (fa4.m11650l(this.f1727V, "recognized")) {
                    this.f1727V = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f53758f0 == null) {
            if (AbstractC0117w.m943f(fg7Var, true)) {
                kg7 kg7Var2 = (kg7) fg7Var.f39071a.get(0);
                kg7Var2.m15189a();
                this.f53758f0 = kg7Var2;
                if (this.f1722Q) {
                    this.f1727V = "waiting";
                    m797j1(kg7Var2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = fg7Var.f39071a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!ci8.m4724i((kg7) list2.get(i2))) {
                long jM793f1 = m793f1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    kg7 kg7Var3 = (kg7) list2.get(i3);
                    if (kg7Var3.m15191c() || ci8.m4696I(kg7Var3, j, jM793f1)) {
                        m17774p1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((kg7) list2.get(0)).m15189a();
        if (this.f1722Q) {
            this.f1727V = "recognized";
            kg7 kg7Var4 = this.f53758f0;
            kg7Var4.getClass();
            m795h1(kg7Var4.f47237c, false);
            this.f1723R.mo0a();
        }
        this.f53758f0 = null;
    }

    @Override // p000.ng7
    /* JADX INFO: renamed from: K */
    public final void mo818K() {
        rv3 rv3Var;
        v56 v56Var = this.f1717L;
        if (v56Var != null && (rv3Var = this.f1730Y) != null) {
            v56Var.m23126b(new sv3(rv3Var));
        }
        this.f1730Y = null;
        m17774p1(false);
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: e0 */
    public final void mo819e0(C3299li c3299li, PointerEventPass pointerEventPass) {
        m798k1();
        if (this.f1722Q && this.f1726U == null) {
            jl3 jl3Var = new jl3(this);
            m11624Z0(jl3Var);
            this.f1726U = jl3Var;
        }
        if (pointerEventPass != PointerEventPass.Main) {
            if (pointerEventPass == PointerEventPass.Final) {
                if (this.f53759g0 != null) {
                    List listM16226d = c3299li.m16226d();
                    int size = listM16226d.size();
                    for (int i = 0; i < size; i++) {
                        a44 a44Var = (a44) ((ArrayList) listM16226d).get(i);
                        if (a44Var.m108h() && a44Var != this.f53759g0) {
                            m17774p1(true);
                            break;
                        }
                    }
                }
                if (fa4.m11650l(this.f1727V, "recognized")) {
                    this.f1727V = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.f53759g0 == null) {
            List listM16226d2 = c3299li.m16226d();
            int size2 = listM16226d2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (x74.m24352i((a44) ((ArrayList) listM16226d2).get(i2))) {
                    a44 a44Var2 = (a44) ((ArrayList) c3299li.m16226d()).get(0);
                    a44Var2.m101a();
                    this.f53759g0 = a44Var2;
                    if (this.f1722Q) {
                        this.f1727V = "waiting";
                        m796i1(a44Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        List listM16226d3 = c3299li.m16226d();
        int size3 = listM16226d3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            a44 a44Var3 = (a44) ((ArrayList) listM16226d3).get(i3);
            if (a44Var3.m108h() || !a44Var3.m106f() || a44Var3.m104d()) {
                float fMo13460f = ((hta) thb.m22050i(this, AbstractC0402n.f4829u)).mo13460f();
                List listM16226d4 = c3299li.m16226d();
                int size4 = listM16226d4.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    a44 a44Var4 = (a44) ((ArrayList) listM16226d4).get(i4);
                    long jM103c = a44Var4.m103c();
                    a44 a44Var5 = this.f53759g0;
                    a44Var5.getClass();
                    boolean z = Math.abs(gq6.m12822c(gq6.m12824e(jM103c, a44Var5.m103c()))) > fMo13460f;
                    if (a44Var4.m108h() || z) {
                        m17774p1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((a44) ((ArrayList) c3299li.m16226d()).get(0)).m101a();
        if (this.f1722Q) {
            this.f1727V = "recognized";
            a44 a44Var6 = this.f53759g0;
            a44Var6.getClass();
            m795h1(a44Var6.m103c(), true);
            this.f1723R.mo0a();
        }
        this.f53759g0 = null;
    }

    @Override // p000.h44
    /* JADX INFO: renamed from: k0 */
    public final void mo820k0() {
        m17774p1(true);
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: m1 */
    public final boolean mo800m1(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractC0075a
    /* JADX INFO: renamed from: n1 */
    public final void mo802n1(KeyEvent keyEvent) {
        this.f1723R.mo0a();
    }

    /* JADX INFO: renamed from: p1 */
    public final void m17774p1(boolean z) {
        if (z) {
            this.f53759g0 = null;
        } else {
            this.f53758f0 = null;
        }
        m794g1(z);
        this.f1727V = "idle";
    }
}
