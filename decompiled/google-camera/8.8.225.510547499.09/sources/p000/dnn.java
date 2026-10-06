package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dnn {

    /* JADX INFO: renamed from: a */
    private static final nbh f12110a = nbh.m17259h("com/google/android/apps/camera/device/DeviceUtils");

    /* JADX INFO: renamed from: b */
    private final float f12111b;

    public dnn(dhv dhvVar) {
        this.f12111b = ((Float) dhvVar.mo6180h(dib.f11302bI).orElse(Float.valueOf(0.0f))).floatValue();
    }

    /* JADX INFO: renamed from: a */
    public final float m6438a(kmd kmdVar) {
        double dM14868g = kua.m14868g(kmdVar);
        List listMo14567t = kmdVar.mo14567t();
        float f = this.f12111b;
        double dM14868g2 = kua.m14868g(kmdVar);
        float fFloatValue = -1.0f;
        double d = -100.0d;
        for (Float f2 : kmdVar.mo14567t()) {
            double dM14866e = kua.m14866e(f2.floatValue(), dM14868g2);
            double d2 = f;
            Double.isNaN(d2);
            double d3 = dM14866e - d2;
            Double.isNaN(d2);
            if (Math.abs(d3) < Math.abs(d - d2)) {
                fFloatValue = f2.floatValue();
                d = dM14866e;
            }
        }
        return (float) (dM14868g / kua.m14867f(kua.m14866e(fFloatValue, dM14868g), ((Float) Collections.min(listMo14567t)).floatValue()));
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    /* JADX WARN: Code duplicated, block: B:22:0x0062  */
    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kdf] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kdf] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kdf] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, kdf] */
    /* JADX INFO: renamed from: b */
    public final kmg m6439b(kme kmeVar, dhv dhvVar, kmq kmqVar) {
        String string;
        kmg kmgVar;
        Iterator it;
        if (kmqVar != null) {
            Integer num = (Integer) dhvVar.mo6173a(dib.f11217D).get();
            Integer num2 = (Integer) dhvVar.mo6173a(dib.f11218E).get();
            switch (kmqVar) {
                case f36557a:
                    string = num2.intValue() != -1 ? num2.toString() : null;
                    if (string != null) {
                        it = kmeVar.mo13861h(kmqVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((nbe) ((nbe) f12110a.m17252c()).mo17276G((char) 1030)).mo17293r("TestOnly Camera id %s is not supported", string);
                                kmgVar = null;
                            } else {
                                kmgVar = (kmg) it.next();
                            }
                        } while (!kmgVar.f36540a.equals(string));
                    } else {
                        kmgVar = null;
                    }
                    break;
                case BACK:
                    string = num.intValue() != -1 ? num.toString() : null;
                    if (string != null) {
                        it = kmeVar.mo13861h(kmqVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((nbe) ((nbe) f12110a.m17252c()).mo17276G((char) 1030)).mo17293r("TestOnly Camera id %s is not supported", string);
                                kmgVar = null;
                            } else {
                                kmgVar = (kmg) it.next();
                            }
                        } while (!kmgVar.f36540a.equals(string));
                    } else {
                        kmgVar = null;
                    }
                    break;
                case EXTERNAL:
                    ((nbe) ((nbe) f12110a.m17252c()).mo17276G((char) 1031)).mo17293r("TestOnly camera facing %s is not supported", kmqVar);
                    kmgVar = null;
                    break;
                default:
                    string = null;
                    if (string != null) {
                        it = kmeVar.mo13861h(kmqVar).iterator();
                        do {
                            if (!it.hasNext()) {
                                ((nbe) ((nbe) f12110a.m17252c()).mo17276G((char) 1030)).mo17293r("TestOnly Camera id %s is not supported", string);
                                kmgVar = null;
                            } else {
                                kmgVar = (kmg) it.next();
                            }
                        } while (!kmgVar.f36540a.equals(string));
                    } else {
                        kmgVar = null;
                    }
                    break;
            }
        } else {
            kmgVar = null;
        }
        if (kmgVar != null) {
            ((nbe) ((nbe) f12110a.m17252c()).mo17276G((char) 1029)).mo17293r("Set TestOnly camera id (%s)", kmgVar);
            return kmgVar;
        }
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        dhvVar.mo6175c();
        kon konVar = new kon(new kde(kmeVar), kmeVar);
        konVar.f36702b = new kdg(konVar.f36702b, new kdd(kmqVar, 0));
        konVar.f36702b = new kdg(konVar.f36702b, new kdd(konVar, 1, null));
        konVar.f36702b.mo13995b();
        kmd kmdVarMo13994a = konVar.f36702b.mo13994a();
        if (kmdVarMo13994a == null) {
            return null;
        }
        return ((kmc) kmdVarMo13994a).f36525a;
    }
}
