package p000;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xr6 {

    /* JADX INFO: renamed from: a */
    public static final xr6 f68583a = new xr6();

    /* JADX INFO: renamed from: b */
    public static final Set f68584b = AbstractC3550rv.m20855w0(new String[]{"fb_mobile_purchase", "StartTrial", "Subscribe"});

    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX INFO: renamed from: a */
    public static final boolean m24659a() {
        boolean zBooleanValue;
        Set set = lp1.f49971a;
        if (set.contains(xr6.class)) {
            return false;
        }
        try {
            if (sy2.m21771f(sy2.m21766a()) || bna.m3941b0()) {
                return false;
            }
            p58 p58Var = p58.f55608b;
            if (set.contains(p58.class)) {
                zBooleanValue = false;
            } else {
                try {
                    if (p58.f55609c == null) {
                        p58.f55609c = Boolean.valueOf(p58.f55608b.m18907k(sy2.m21766a()) != null);
                    }
                    Boolean bool = p58.f55609c;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                } catch (Throwable th) {
                    lp1.m16420a(p58.class, th);
                }
            }
            return zBooleanValue;
        } catch (Throwable th2) {
            lp1.m16420a(xr6.class, th2);
            return false;
        }
    }
}
