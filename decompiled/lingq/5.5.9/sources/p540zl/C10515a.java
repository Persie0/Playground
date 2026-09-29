package p540zl;

import dm.C5207g;
import java.lang.reflect.InvocationTargetException;
import p515yl.C10414a;

/* JADX INFO: renamed from: zl.a */
/* JADX INFO: loaded from: classes2.dex */
public class C10515a extends C10414a {

    /* JADX INFO: renamed from: zl.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Integer f52496a;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
                num = obj instanceof Integer ? (Integer) obj : null;
            } catch (Throwable unused) {
            }
            if (num != null) {
                if (num.intValue() > 0) {
                    num2 = num;
                }
            }
            f52496a = num2;
        }
    }

    @Override // p515yl.C10414a
    /* JADX INFO: renamed from: a */
    public final void mo19395a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        C5207g.m11111f(th2, "cause");
        C5207g.m11111f(th3, "exception");
        Integer num = a.f52496a;
        if (num == null || num.intValue() >= 19) {
            th2.addSuppressed(th3);
        } else {
            super.mo19395a(th2, th3);
        }
    }
}
