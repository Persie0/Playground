package am;

import hm.C6080b;
import im.C6356a;
import kotlin.random.Random;
import p540zl.C10515a;

/* JADX INFO: renamed from: am.a */
/* JADX INFO: loaded from: classes2.dex */
public class C0126a extends C10515a {

    /* JADX INFO: renamed from: am.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final Integer f327a;

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
            f327a = num2;
        }
    }

    @Override // p515yl.C10414a
    /* JADX INFO: renamed from: b */
    public final Random mo523b() {
        Integer num = a.f327a;
        return num == null || num.intValue() >= 34 ? new C6356a() : new C6080b();
    }
}
