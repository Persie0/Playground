package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class qx2 {

    /* JADX INFO: renamed from: a */
    public static volatile qx2 f58332a;

    /* JADX INFO: renamed from: b */
    public static final qx2 f58333b;

    static {
        qx2 qx2Var = new qx2();
        Map map = Collections.EMPTY_MAP;
        f58333b = qx2Var;
    }

    /* JADX INFO: renamed from: a */
    public static qx2 m20191a() {
        qx2 qx2Var;
        ho7 ho7Var = ho7.f42713c;
        qx2 qx2Var2 = f58332a;
        if (qx2Var2 != null) {
            return qx2Var2;
        }
        synchronized (qx2.class) {
            try {
                qx2Var = f58332a;
                if (qx2Var == null) {
                    Class cls = nx2.f53357a;
                    qx2 qx2Var3 = null;
                    if (cls != null) {
                        try {
                            qx2Var3 = (qx2) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    qx2Var = qx2Var3 != null ? qx2Var3 : f58333b;
                    f58332a = qx2Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return qx2Var;
    }
}
