package p000;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class klc {

    /* JADX INFO: renamed from: a */
    public static volatile klc f47499a;

    /* JADX INFO: renamed from: b */
    public static volatile klc f47500b;

    /* JADX INFO: renamed from: c */
    public static final klc f47501c;

    static {
        klc klcVar = new klc();
        Map map = Collections.EMPTY_MAP;
        f47501c = klcVar;
    }

    /* JADX INFO: renamed from: a */
    public static void m15332a() {
        if (f47499a == null) {
            synchronized (klc.class) {
                try {
                    if (f47499a == null) {
                        f47499a = f47501c;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
