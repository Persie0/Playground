package p000;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class jga {
    /* JADX INFO: renamed from: a */
    public static int m14441a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: b */
    public static int m14442b(int i, int i2) {
        return Integer.rotateLeft((i2 * (-2048144777)) + i, 13) * (-1640531535);
    }

    /* JADX INFO: renamed from: c */
    public static void m14443c(Activity activity) {
        View viewM23508s;
        int iHashCode = activity.hashCode();
        HashMap map = eua.f37916d;
        HashMap map2 = null;
        if (!lp1.f49971a.contains(eua.class)) {
            try {
                map2 = eua.f37916d;
            } catch (Throwable th) {
                lp1.m16420a(eua.class, th);
            }
        }
        Integer numValueOf = Integer.valueOf(iHashCode);
        Object euaVar = map2.get(numValueOf);
        if (euaVar == null) {
            euaVar = new eua(activity);
            map2.put(numValueOf, euaVar);
        }
        eua euaVar2 = (eua) euaVar;
        Set set = lp1.f49971a;
        if (set.contains(eua.class)) {
            return;
        }
        try {
            if (set.contains(euaVar2)) {
                return;
            }
            try {
                if (!euaVar2.f37919c.getAndSet(true) && (viewM23508s = AbstractC3695vr.m23508s((Activity) euaVar2.f37917a.get())) != null) {
                    ViewTreeObserver viewTreeObserver = viewM23508s.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(euaVar2);
                        euaVar2.m11351a();
                        return;
                    }
                    return;
                    lp1.m16420a(eua.class, th);
                }
            } catch (Throwable th2) {
                lp1.m16420a(euaVar2, th2);
            }
        } catch (Throwable th3) {
            lp1.m16420a(eua.class, th3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m14444d(Activity activity) {
        View viewM23508s;
        int iHashCode = activity.hashCode();
        HashMap map = eua.f37916d;
        HashMap map2 = null;
        if (!lp1.f49971a.contains(eua.class)) {
            try {
                map2 = eua.f37916d;
            } catch (Throwable th) {
                lp1.m16420a(eua.class, th);
            }
        }
        eua euaVar = (eua) map2.remove(Integer.valueOf(iHashCode));
        if (euaVar != null) {
            Set set = lp1.f49971a;
            if (set.contains(eua.class)) {
                return;
            }
            try {
                if (!set.contains(euaVar)) {
                    try {
                        if (euaVar.f37919c.getAndSet(false) && (viewM23508s = AbstractC3695vr.m23508s((Activity) euaVar.f37917a.get())) != null) {
                            ViewTreeObserver viewTreeObserver = viewM23508s.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.removeOnGlobalLayoutListener(euaVar);
                            }
                        }
                    } catch (Throwable th2) {
                        lp1.m16420a(euaVar, th2);
                    }
                }
            } catch (Throwable th3) {
                lp1.m16420a(eua.class, th3);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final j88 m14445e(j88 j88Var) {
        j88Var.getClass();
        h88 h88VarM14326b = j88Var.m14326b();
        m88 m88Var = j88Var.f45207g;
        h88VarM14326b.f41985g = new iga(m88Var.mo3002c(), m88Var.mo3001b());
        return h88VarM14326b.m13143a();
    }
}
