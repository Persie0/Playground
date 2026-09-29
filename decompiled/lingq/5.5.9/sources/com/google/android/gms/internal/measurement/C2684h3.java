package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import p081e0.C5298b1;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2684h3 {

    /* JADX INFO: renamed from: a */
    public final C2684h3 f14226a;

    /* JADX INFO: renamed from: b */
    public final C5298b1 f14227b;

    /* JADX INFO: renamed from: c */
    public final HashMap f14228c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f14229d = new HashMap();

    public C2684h3(C2684h3 c2684h3, C5298b1 c5298b1) {
        this.f14226a = c2684h3;
        this.f14227b = c5298b1;
    }

    /* JADX INFO: renamed from: a */
    public final C2684h3 m7862a() {
        return new C2684h3(this, this.f14227b);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2790p m7863b(InterfaceC2790p interfaceC2790p) {
        return this.f14227b.m11440i(this, interfaceC2790p);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2790p m7864c(C2652f c2652f) {
        InterfaceC2790p interfaceC2790pM11440i = InterfaceC2790p.f14375r;
        Iterator itM7794u = c2652f.m7794u();
        while (itM7794u.hasNext()) {
            interfaceC2790pM11440i = this.f14227b.m11440i(this, c2652f.m7792s(((Integer) itM7794u.next()).intValue()));
            if (interfaceC2790pM11440i instanceof C2680h) {
                break;
            }
        }
        return interfaceC2790pM11440i;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2790p m7865d(String str) {
        HashMap map = this.f14228c;
        if (map.containsKey(str)) {
            return (InterfaceC2790p) map.get(str);
        }
        C2684h3 c2684h3 = this.f14226a;
        if (c2684h3 != null) {
            return c2684h3.m7865d(str);
        }
        throw new IllegalArgumentException(String.format("%s is not defined", str));
    }

    /* JADX INFO: renamed from: e */
    public final void m7866e(String str, InterfaceC2790p interfaceC2790p) {
        if (this.f14229d.containsKey(str)) {
            return;
        }
        HashMap map = this.f14228c;
        if (interfaceC2790p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2790p);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m7867f(String str, InterfaceC2790p interfaceC2790p) {
        C2684h3 c2684h3;
        HashMap map = this.f14228c;
        if (!map.containsKey(str) && (c2684h3 = this.f14226a) != null && c2684h3.m7868g(str)) {
            c2684h3.m7867f(str, interfaceC2790p);
            return;
        }
        if (this.f14229d.containsKey(str)) {
            return;
        }
        if (interfaceC2790p == null) {
            map.remove(str);
        } else {
            map.put(str, interfaceC2790p);
        }
    }

    /* JADX INFO: renamed from: g */
    public final boolean m7868g(String str) {
        if (this.f14228c.containsKey(str)) {
            return true;
        }
        C2684h3 c2684h3 = this.f14226a;
        if (c2684h3 != null) {
            return c2684h3.m7868g(str);
        }
        return false;
    }
}
