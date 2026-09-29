package p000;

import java.util.Iterator;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n54 {

    /* JADX INFO: renamed from: a */
    public static final List f52360a;

    /* JADX INFO: renamed from: b */
    public static final List f52361b;

    /* JADX INFO: renamed from: c */
    public static final Regex f52362c;

    static {
        bc3 bc3Var = bc3.f8324j;
        f52360a = vz1.m23605K(new q54("**", new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531)), new q54("__", new he9(0L, 0L, bc3Var, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531)), new q54("*", new he9(0L, 0L, null, new wb3(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527)), new q54("_", new he9(0L, 0L, null, new wb3(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527)));
        f52361b = vz1.m23605K("**", "__", "~~");
        f52362c = new Regex("\\n{2,}");
    }

    /* JADX INFO: renamed from: a */
    public static final String m17228a(String str) {
        str.getClass();
        Iterator it = f52361b.iterator();
        while (it.hasNext()) {
            str = cl9.m4839V(str, (String) it.next(), "");
        }
        return f52362c.m15428g(str, "\n");
    }

    /* JADX INFO: renamed from: b */
    public static final C3419on m17229b(String str) {
        Object next;
        str.getClass();
        C3341mn c3341mn = new C3341mn();
        int length = 0;
        while (length < str.length()) {
            Iterator it = f52360a.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!cl9.m4841X(str, length, ((q54) next).f57290a, false));
            q54 q54Var = (q54) next;
            if (q54Var == null) {
                c3341mn.f51543a.append(str.charAt(length));
                length++;
            } else {
                String str2 = q54Var.f57290a;
                int length2 = str2.length() + length;
                int iM23389l0 = vk9.m23389l0(str, str2, length2, false, 4);
                if (iM23389l0 > length2) {
                    int iM16932g = c3341mn.m16932g(q54Var.f57291b);
                    try {
                        c3341mn.m16929d(str.substring(length2, iM23389l0));
                        c3341mn.m16931f(iM16932g);
                        length = str2.length() + iM23389l0;
                    } catch (Throwable th) {
                        c3341mn.m16931f(iM16932g);
                        throw th;
                    }
                } else {
                    c3341mn.m16929d(str2);
                    length += str2.length();
                }
            }
        }
        return c3341mn.m16933h();
    }
}
