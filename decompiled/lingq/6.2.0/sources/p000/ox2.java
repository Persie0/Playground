package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ox2 {

    /* JADX INFO: renamed from: a */
    public static volatile ox2 f55122a;

    /* JADX INFO: renamed from: b */
    public static final ox2 f55123b;

    static {
        ox2 ox2Var = new ox2();
        Map map = Collections.EMPTY_MAP;
        f55123b = ox2Var;
    }

    /* JADX INFO: renamed from: a */
    public static ox2 m18561a() {
        ox2 ox2Var;
        ox2 ox2Var2 = f55122a;
        if (ox2Var2 != null) {
            return ox2Var2;
        }
        synchronized (ox2.class) {
            try {
                ox2Var = f55122a;
                if (ox2Var == null) {
                    Class cls = lx2.f50238a;
                    ox2 ox2Var3 = null;
                    if (cls != null) {
                        try {
                            ox2Var3 = (ox2) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    ox2Var = ox2Var3 != null ? ox2Var3 : f55123b;
                    f55122a = ox2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ox2Var;
    }
}
