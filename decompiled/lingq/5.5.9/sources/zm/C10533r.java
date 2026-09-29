package zm;

import ae.C0062b;
import dm.C5207g;
import mn.C7645b;
import mn.C7646c;
import mo.C7661i;

/* JADX INFO: renamed from: zm.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C10533r {

    /* JADX INFO: renamed from: a */
    public static final C7646c f52532a;

    /* JADX INFO: renamed from: b */
    public static final C7645b f52533b;

    static {
        C7646c c7646c = new C7646c("kotlin.jvm.JvmField");
        f52532a = c7646c;
        C7645b.m15203l(c7646c);
        C7645b.m15203l(new C7646c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f52533b = C7645b.m15202f("kotlin/jvm/internal/RepeatableContainer", false);
    }

    /* JADX INFO: renamed from: a */
    public static final String m19507a(String str) {
        C5207g.m11111f(str, "propertyName");
        if (m19509c(str)) {
            return str;
        }
        return "get" + C0062b.m336c0(str);
    }

    /* JADX INFO: renamed from: b */
    public static final String m19508b(String str) {
        String strM336c0;
        StringBuilder sb2 = new StringBuilder("set");
        if (m19509c(str)) {
            strM336c0 = str.substring(2);
            C5207g.m11110e(strM336c0, "this as java.lang.String).substring(startIndex)");
        } else {
            strM336c0 = C0062b.m336c0(str);
        }
        sb2.append(strM336c0);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m19509c(String str) {
        C5207g.m11111f(str, "name");
        if (!C7661i.m15256V2(str, "is", false) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return C5207g.m11113h(97, cCharAt) > 0 || C5207g.m11113h(cCharAt, 122) > 0;
    }
}
