package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2873v4 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC2790p m8306a(C2924z3 c2924z3) {
        if (c2924z3 == null) {
            return InterfaceC2790p.f14375r;
        }
        int iM8467C = c2924z3.m8467C() - 1;
        if (iM8467C == 1) {
            return c2924z3.m8466B() ? new C2842t(c2924z3.m8470w()) : InterfaceC2790p.f14382y;
        }
        if (iM8467C == 2) {
            return c2924z3.m8465A() ? new C2694i(Double.valueOf(c2924z3.m8468t())) : new C2694i(null);
        }
        if (iM8467C == 3) {
            return c2924z3.m8473z() ? new C2666g(Boolean.valueOf(c2924z3.m8472y())) : new C2666g(null);
        }
        if (iM8467C != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        InterfaceC2836s6 interfaceC2836s6M8471x = c2924z3.m8471x();
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC2836s6M8471x.iterator();
        while (it.hasNext()) {
            arrayList.add(m8306a((C2924z3) it.next()));
        }
        return new C2803q(arrayList, c2924z3.m8469v());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static InterfaceC2790p m8307b(Object obj) {
        if (obj == null) {
            return InterfaceC2790p.f14376s;
        }
        if (obj instanceof String) {
            return new C2842t((String) obj);
        }
        if (obj instanceof Double) {
            return new C2694i((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2694i(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2694i(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2666g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C2652f c2652f = new C2652f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2652f.m7780B(c2652f.m7791q(), m8307b(it.next()));
            }
            return c2652f;
        }
        C2750m c2750m = new C2750m();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2790p interfaceC2790pM8307b = m8307b(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c2750m.mo7788m((String) string, interfaceC2790pM8307b);
            }
        }
        return c2750m;
    }
}
