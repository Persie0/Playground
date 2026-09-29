package p000;

import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class xw4 implements tl8 {
    /* JADX INFO: renamed from: a */
    public final void m24725a(vl8 vl8Var) {
        if (!(vl8Var instanceof dua)) {
            ij6.m13951i(vl8Var, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ");
            return;
        }
        cua cuaVarMo2116r = ((dua) vl8Var).mo2116r();
        fs6 fs6VarMo2118t = vl8Var.mo2118t();
        cuaVarMo2116r.getClass();
        LinkedHashMap linkedHashMap = cuaVarMo2116r.f34560a;
        for (String str : new HashSet(linkedHashMap.keySet())) {
            str.getClass();
            wta wtaVar = (wta) linkedHashMap.get(str);
            if (wtaVar != null) {
                lid.m16235a(wtaVar, fs6VarMo2118t, vl8Var.mo256K());
            }
        }
        if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
            return;
        }
        fs6VarMo2118t.m12096K();
    }
}
