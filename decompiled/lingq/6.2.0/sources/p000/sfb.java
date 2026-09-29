package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class sfb {

    /* JADX INFO: renamed from: a */
    public static final tfb f60802a;

    static {
        tfb tfbVar;
        try {
            tfbVar = yfb.f69800a;
        } catch (NoClassDefFoundError unused) {
            tfbVar = null;
        }
        if (tfbVar == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 3; i++) {
                String str = tfb.f62237a[i];
                try {
                    tfbVar = (tfb) Class.forName(str).getConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    th = th;
                    sb.append('\n');
                    sb.append(str);
                    sb.append(": ");
                    if (th instanceof InvocationTargetException) {
                        th = th.getCause();
                    }
                    sb.append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        f60802a = tfbVar;
    }
}
