package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2757m6 extends C2750m {

    /* JADX INFO: renamed from: b */
    public final C2610c f14312b;

    public C2757m6(C2610c c2610c) {
        this.f14312b = c2610c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    @Override // com.google.android.gms.internal.measurement.C2750m, com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        byte b10;
        switch (str) {
            case "getEventName":
                b10 = 0;
            case "getTimestamp":
                b10 = 3;
                break;
            case "getParamValue":
                b10 = 1;
                break;
            case "getParams":
                b10 = 2;
                break;
            case "setParamValue":
                b10 = 5;
            case "setEventName":
                b10 = 4;
                break;
            default:
                b10 = -1;
        }
        C2610c c2610c = this.f14312b;
        if (b10 == 0) {
            C2601b4.m7692h(0, "getEventName", arrayList);
            return new C2842t(c2610c.f14075b.f14059a);
        }
        if (b10 == 1) {
            C2601b4.m7692h(1, "getParamValue", arrayList);
            String strMo7784f = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
            HashMap map = c2610c.f14075b.f14061c;
            return C2873v4.m8307b(map.containsKey(strMo7784f) ? map.get(strMo7784f) : null);
        }
        if (b10 == 2) {
            C2601b4.m7692h(0, "getParams", arrayList);
            HashMap map2 = c2610c.f14075b.f14061c;
            C2750m c2750m = new C2750m();
            for (String str2 : map2.keySet()) {
                c2750m.mo7788m(str2, C2873v4.m8307b(map2.get(str2)));
            }
            return c2750m;
        }
        if (b10 == 3) {
            C2601b4.m7692h(0, "getTimestamp", arrayList);
            return new C2694i(Double.valueOf(c2610c.f14075b.f14060b));
        }
        if (b10 == 4) {
            C2601b4.m7692h(1, "setEventName", arrayList);
            InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
            if (InterfaceC2790p.f14375r.equals(interfaceC2790pM7863b) || InterfaceC2790p.f14376s.equals(interfaceC2790pM7863b)) {
                throw new IllegalArgumentException("Illegal event name");
            }
            c2610c.f14075b.f14059a = interfaceC2790pM7863b.mo7784f();
            return new C2842t(interfaceC2790pM7863b.mo7784f());
        }
        if (b10 != 5) {
            return super.mo7790p(str, c2684h3, arrayList);
        }
        C2601b4.m7692h(2, "setParamValue", arrayList);
        String strMo7784f2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7784f();
        InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
        C2596b c2596b = c2610c.f14075b;
        Object objM7690f = C2601b4.m7690f(interfaceC2790pM7863b2);
        HashMap map3 = c2596b.f14061c;
        if (objM7690f == null) {
            map3.remove(strMo7784f2);
        } else {
            map3.put(strMo7784f2, objM7690f);
        }
        return interfaceC2790pM7863b2;
    }
}
