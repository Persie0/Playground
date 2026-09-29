package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.kc */
/* JADX INFO: loaded from: classes.dex */
public final class C2735kc extends AbstractC2708j {

    /* JADX INFO: renamed from: c */
    public final C2700i5 f14296c;

    /* JADX INFO: renamed from: d */
    public final HashMap f14297d;

    public C2735kc(C2700i5 c2700i5) {
        super("require");
        this.f14297d = new HashMap();
        this.f14296c = c2700i5;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2708j
    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p mo7646b(C2684h3 c2684h3, List list) {
        InterfaceC2790p interfaceC2790p;
        C2601b4.m7692h(1, "require", list);
        String strMo7784f = c2684h3.m7863b((InterfaceC2790p) list.get(0)).mo7784f();
        HashMap map = this.f14297d;
        if (map.containsKey(strMo7784f)) {
            return (InterfaceC2790p) map.get(strMo7784f);
        }
        C2700i5 c2700i5 = this.f14296c;
        if (c2700i5.f14251a.containsKey(strMo7784f)) {
            try {
                interfaceC2790p = (InterfaceC2790p) ((Callable) c2700i5.f14251a.get(strMo7784f)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strMo7784f)));
            }
        } else {
            interfaceC2790p = InterfaceC2790p.f14375r;
        }
        if (interfaceC2790p instanceof AbstractC2708j) {
            map.put(strMo7784f, (AbstractC2708j) interfaceC2790p);
        }
        return interfaceC2790p;
    }
}
