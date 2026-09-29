package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.semantics.C0685a;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import p210k1.C6563a;
import p210k1.C6572j;
import sl.InterfaceC9068a;

/* JADX INFO: renamed from: i1.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6156l0 {
    /* JADX INFO: renamed from: a */
    public static final C6572j m12666a(InterfaceC6154k0 interfaceC6154k0) {
        C5207g.m11111f(interfaceC6154k0, "<this>");
        InterfaceC0500b.c cVar = interfaceC6154k0.mo1934v().f3330e;
        Object obj = null;
        if (cVar == null || (cVar.f3328c & 8) == 0) {
            cVar = null;
            break;
        }
        while (true) {
            if (cVar == null) {
                cVar = null;
                break;
            }
            if ((cVar.f3327b & 8) != 0) {
                break;
            }
            cVar = cVar.f3330e;
        }
        if (cVar instanceof InterfaceC6154k0) {
            obj = cVar;
        }
        InterfaceC6154k0 interfaceC6154k1 = (InterfaceC6154k0) obj;
        if (interfaceC6154k1 == null || interfaceC6154k0.mo2078C().f37393c) {
            return interfaceC6154k0.mo2078C();
        }
        C6572j c6572jMo2078C = interfaceC6154k0.mo2078C();
        c6572jMo2078C.getClass();
        C6572j c6572j = new C6572j();
        c6572j.f37392b = c6572jMo2078C.f37392b;
        c6572j.f37393c = c6572jMo2078C.f37393c;
        c6572j.f37391a.putAll(c6572jMo2078C.f37391a);
        C6572j c6572jM12666a = m12666a(interfaceC6154k1);
        C5207g.m11111f(c6572jM12666a, "peer");
        if (c6572jM12666a.f37392b) {
            c6572j.f37392b = true;
        }
        if (c6572jM12666a.f37393c) {
            c6572j.f37393c = true;
        }
        while (true) {
            for (Map.Entry entry : c6572jM12666a.f37391a.entrySet()) {
                C0685a c0685a = (C0685a) entry.getKey();
                Object value = entry.getValue();
                LinkedHashMap linkedHashMap = c6572j.f37391a;
                if (!linkedHashMap.containsKey(c0685a)) {
                    linkedHashMap.put(c0685a, value);
                } else if (value instanceof C6563a) {
                    Object obj2 = linkedHashMap.get(c0685a);
                    C5207g.m11109d(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                    C6563a c6563a = (C6563a) obj2;
                    String str = c6563a.f37362a;
                    if (str == null) {
                        str = ((C6563a) value).f37362a;
                    }
                    InterfaceC9068a interfaceC9068a = c6563a.f37363b;
                    if (interfaceC9068a == null) {
                        interfaceC9068a = ((C6563a) value).f37363b;
                    }
                    linkedHashMap.put(c0685a, new C6563a(str, interfaceC9068a));
                }
            }
            return c6572j;
        }
    }
}
