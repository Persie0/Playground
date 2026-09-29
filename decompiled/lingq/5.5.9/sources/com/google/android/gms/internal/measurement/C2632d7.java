package com.google.android.gms.internal.measurement;

import cc.C1834h4;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p290o6.C7968m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d7 */
/* JADX INFO: loaded from: classes.dex */
public final class C2632d7 extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f14153c = 1;

    /* JADX INFO: renamed from: d */
    public final Object f14154d;

    public C2632d7(C2763mc c2763mc) {
        super("internal.registerCallback");
        this.f14154d = c2763mc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2632d7(C7968m c7968m) {
        super("getValue");
        this.f14154d = c7968m;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        TreeMap treeMap;
        int i10 = this.f14153c;
        Object obj = this.f14154d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2601b4.m7692h(2, "getValue", list);
                InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) list.get(0));
                InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) list.get(1));
                String strMo7784f = interfaceC2790pM7863b.mo7784f();
                C7968m c7968m = (C7968m) obj;
                String str = null;
                Map map = (Map) ((C1834h4) c7968m.f43384b).f9840d.getOrDefault((String) c7968m.f43383a, null);
                if (map != null && map.containsKey(strMo7784f)) {
                    str = (String) map.get(strMo7784f);
                }
                if (str != null) {
                    interfaceC2790pM7863b2 = new C2842t(str);
                }
                return interfaceC2790pM7863b2;
            default:
                C2601b4.m7692h(3, this.f14260a, list);
                c2684h3.m7863b((InterfaceC2790p) list.get(0)).mo7784f();
                InterfaceC2790p interfaceC2790pM7863b3 = c2684h3.m7863b((InterfaceC2790p) list.get(1));
                if (!(interfaceC2790pM7863b3 instanceof C2777o)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC2790p interfaceC2790pM7863b4 = c2684h3.m7863b((InterfaceC2790p) list.get(2));
                if (!(interfaceC2790pM7863b4 instanceof C2750m)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C2750m c2750m = (C2750m) interfaceC2790pM7863b4;
                if (!c2750m.mo7785g("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strMo7784f2 = c2750m.mo7789o("type").mo7784f();
                int iM7686b = c2750m.mo7785g("priority") ? C2601b4.m7686b(c2750m.mo7789o("priority").mo7783e().doubleValue()) : 1000;
                C2763mc c2763mc = (C2763mc) obj;
                C2777o c2777o = (C2777o) interfaceC2790pM7863b3;
                c2763mc.getClass();
                if ("create".equals(strMo7784f2)) {
                    treeMap = c2763mc.f14320b;
                } else {
                    if (!"edit".equals(strMo7784f2)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strMo7784f2)));
                    }
                    treeMap = c2763mc.f14319a;
                }
                if (treeMap.containsKey(Integer.valueOf(iM7686b))) {
                    iM7686b = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iM7686b), c2777o);
                return InterfaceC2790p.f14375r;
        }
    }
}
