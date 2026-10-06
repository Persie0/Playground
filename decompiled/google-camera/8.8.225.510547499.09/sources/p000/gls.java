package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class gls {
    /* JADX INFO: renamed from: a */
    public static mws m9439a(kmd kmdVar) {
        Iterator it = kmdVar.mo14532A().iterator();
        while (it.hasNext()) {
            if (((CaptureRequest.Key) it.next()).getName().equals(fvv.f23717a.getName())) {
                return mws.m17097l(kgq.m14215e(fvv.f23717a, 1));
            }
        }
        int i = mws.f41739d;
        return mzr.f41857a;
    }

    /* JADX INFO: renamed from: b */
    public static mxk m9440b(ikw ikwVar) {
        int i;
        HashSet hashSet = new HashSet();
        if (ivu.f32383k != null) {
            ikw ikwVar2 = ikw.UNINITIALIZED;
            switch (ikwVar.ordinal()) {
                case 3:
                    i = 101;
                    break;
                case 6:
                    i = 3;
                    break;
                case 12:
                    i = 5;
                    break;
                case 13:
                    i = 100;
                    break;
                default:
                    return mzx.f41874a;
            }
            hashSet.add(kgq.m14215e(ivu.f32383k, true));
            hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(i)));
        }
        return mxk.m17134F(hashSet);
    }

    /* JADX INFO: renamed from: c */
    public static mxk m9441c(ikw ikwVar, kmd kmdVar) {
        mxi mxiVarM17132D = mxk.m17132D();
        mxiVarM17132D.m17129h(m9439a(kmdVar));
        mxiVarM17132D.m17129h(m9440b(ikwVar));
        return mxiVarM17132D.mo17127f();
    }

    /* JADX INFO: renamed from: d */
    public static void m9442d(Set set, kfm kfmVar, kmd kmdVar) {
        if (set.isEmpty()) {
            return;
        }
        Set setM14216f = kgq.m14216f(kmdVar.mo14532A());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kfy kfyVar = (kfy) it.next();
            if (setM14216f.contains(kfyVar.f35858a.getName())) {
                kfmVar.m14141b().mo17072d(kfyVar);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m9443e(kfk kfkVar, kfc kfcVar) {
        Iterator it = kfcVar.mo9417q().f36067c.iterator();
        while (it.hasNext()) {
            kfkVar.mo14118e((kgg) it.next());
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m9444f(kgg kggVar) {
        long jMo14191a = kggVar.mo14191a();
        return jMo14191a == 257 || jMo14191a == 4098 || jMo14191a == 4099;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9445g(kgg kggVar) {
        long jMo14191a = kggVar.mo14191a();
        return jMo14191a == 37 || jMo14191a == 38;
    }

    /* JADX INFO: renamed from: h */
    public static fvu m9446h(kmg kmgVar, kme kmeVar, fve fveVar, dhv dhvVar) {
        kmd kmdVarMo13854a = kmeVar.mo13854a(kmgVar);
        if (kmdVarMo13854a.mo14558k() == kmq.f36557a) {
            if (dhvVar.mo6184l(dib.f11275ai)) {
                kmdVarMo13854a = m9447i(kmdVarMo13854a, kmeVar);
            } else if (dhvVar.mo6184l(dib.f11358cl)) {
                kmg kmgVarMo8823a = fveVar.mo8823a();
                if (kmgVarMo8823a == null) {
                    kmgVarMo8823a = ((kmc) kmdVarMo13854a).f36525a;
                }
                kmdVarMo13854a = new fvu(kmeVar.mo13854a(kmgVarMo8823a));
            }
        }
        return new fvu(kmdVarMo13854a);
    }

    /* JADX INFO: renamed from: i */
    public static fvu m9447i(kmd kmdVar, kme kmeVar) {
        Iterator it = kmdVar.mo14533B().iterator();
        while (it.hasNext()) {
            kmd kmdVarMo13854a = kmeVar.mo13854a((kmg) it.next());
            if (kmdVarMo13854a.mo14555h().width() > kmdVar.mo14555h().width()) {
                kmdVar = kmdVarMo13854a;
            }
        }
        return new fvu(kmdVar);
    }
}
