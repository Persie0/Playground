package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xk3 implements q47 {
    static {
        if (px2.f56941a == null) {
            synchronized (px2.class) {
                try {
                    if (px2.f56941a == null) {
                        Class cls = mx2.f51990a;
                        px2 px2Var = null;
                        if (cls != null) {
                            try {
                                px2Var = (px2) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (px2Var == null) {
                            px2Var = px2.f56942b;
                        }
                        px2.f56941a = px2Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
