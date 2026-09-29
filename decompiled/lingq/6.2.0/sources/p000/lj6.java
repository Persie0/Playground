package p000;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class lj6 {

    /* JADX INFO: renamed from: b */
    public static final LinkedHashMap f49741b = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f49742a = new LinkedHashMap();

    /* JADX INFO: renamed from: a */
    public final void m16258a(kj6 kj6Var) {
        String strM18283w = AbstractC3423or.m18283w(kj6Var.getClass());
        if (strM18283w.length() <= 0) {
            C3386nv.m17626m("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.f49742a;
        kj6 kj6Var2 = (kj6) linkedHashMap.get(strM18283w);
        if (fa4.m11650l(kj6Var2, kj6Var)) {
            return;
        }
        if (kj6Var2 != null && kj6Var2.f47396b) {
            ij6.m13955m("Navigator ", kj6Var, " is replacing an already attached ", kj6Var2);
        } else if (kj6Var.f47396b) {
            C3386nv.m17634u("Navigator ", kj6Var, " is already attached to another NavController");
        }
    }

    /* JADX INFO: renamed from: b */
    public final kj6 m16259b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            C3386nv.m17626m("navigator name cannot be an empty string");
            return null;
        }
        kj6 kj6Var = (kj6) this.f49742a.get(str);
        if (kj6Var != null) {
            return kj6Var;
        }
        C3386nv.m17633t(wq1.m24118n("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
