package p000;

import androidx.compose.material3.AbstractC0262s;
import androidx.compose.p002ui.node.InterfaceC0354d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class d06 extends d16 implements tf1, InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public LinkedHashMap f34805J;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        float f = ((xj2) thb.m22050i(this, AbstractC0262s.f3629c)).f68285a;
        if (f < 0.0f) {
            f = 0.0f;
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(j);
        boolean z = this.f34836I && !Float.isNaN(f) && xj2.m24559a(f, 0.0f) > 0;
        int iMo916w0 = !Float.isNaN(f) ? jt5Var.mo916w0(f) : 0;
        int iMax = l87VarMo1514r.f49301a;
        if (z) {
            iMax = Math.max(iMax, iMo916w0);
        }
        int iMax2 = l87VarMo1514r.f49302b;
        if (z) {
            iMax2 = Math.max(iMax2, iMo916w0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.f34805J;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.f34805J = linkedHashMap;
            }
            qpa qpaVar = AbstractC0262s.f3628b;
            int iRound = Math.round((iMo916w0 - l87VarMo1514r.f49301a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(qpaVar, Integer.valueOf(iRound));
            iv3 iv3Var = AbstractC0262s.f3627a;
            int iRound2 = Math.round((iMo916w0 - l87VarMo1514r.f49302b) / 2.0f);
            linkedHashMap.put(iv3Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map mapM15360M = this.f34805J;
        if (mapM15360M == null) {
            mapM15360M = AbstractC3194a.m15360M();
        }
        return jt5Var.mo9895M0(iMax, iMax2, mapM15360M, new s64(iMax, iMax2, l87VarMo1514r));
    }
}
