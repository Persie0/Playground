package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class g62 {

    /* JADX INFO: renamed from: a */
    public static final ca2 f40259a;

    static {
        String property;
        xq3 xq3Var;
        ca2 ca2Var;
        int i = zp9.f71940a;
        try {
            property = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null ? Boolean.parseBoolean(property) : false) {
            v72 v72Var = ph2.f56212a;
            xq3Var = dp5.f36000a;
            xq3 xq3Var2 = xq3Var.f68538f;
            if (xq3Var == null) {
                ca2Var = xq3Var;
                ca2Var = f62.f38512l;
            }
        } else {
            ca2Var = f62.f38512l;
        }
        ca2Var = xq3Var;
        f40259a = ca2Var;
    }
}
