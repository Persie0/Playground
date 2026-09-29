package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2601b4 {
    /* JADX INFO: renamed from: a */
    public static double m7685a(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    /* JADX INFO: renamed from: b */
    public static int m7686b(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static void m7687c(C2684h3 c2684h3) {
        int iM7686b = m7686b(c2684h3.m7865d("runtime.counter").mo7783e().doubleValue() + 1.0d);
        if (iM7686b > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c2684h3.m7867f("runtime.counter", new C2694i(Double.valueOf(iM7686b)));
    }

    /* JADX INFO: renamed from: d */
    public static long m7688d(double d10) {
        return ((long) m7686b(d10)) & 4294967295L;
    }

    /* JADX INFO: renamed from: e */
    public static zzbl m7689e(String str) {
        zzbl zzblVarZza = null;
        if (str != null && !str.isEmpty()) {
            zzblVarZza = zzbl.zza(Integer.parseInt(str));
        }
        if (zzblVarZza != null) {
            return zzblVarZza;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static Object m7690f(InterfaceC2790p interfaceC2790p) {
        if (InterfaceC2790p.f14376s.equals(interfaceC2790p)) {
            return null;
        }
        if (InterfaceC2790p.f14375r.equals(interfaceC2790p)) {
            return "";
        }
        if (interfaceC2790p instanceof C2750m) {
            return m7691g((C2750m) interfaceC2790p);
        }
        if (!(interfaceC2790p instanceof C2652f)) {
            return !interfaceC2790p.mo7783e().isNaN() ? interfaceC2790p.mo7783e() : interfaceC2790p.mo7784f();
        }
        ArrayList arrayList = new ArrayList();
        C2652f c2652f = (C2652f) interfaceC2790p;
        c2652f.getClass();
        int i10 = 0;
        while (true) {
            if (!(i10 < c2652f.m7791q())) {
                return arrayList;
            }
            if (i10 >= c2652f.m7791q()) {
                throw new NoSuchElementException(C0166e.m761g("Out of bounds index: ", i10));
            }
            int i11 = i10 + 1;
            Object objM7690f = m7690f(c2652f.m7792s(i10));
            if (objM7690f != null) {
                arrayList.add(objM7690f);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: g */
    public static HashMap m7691g(C2750m c2750m) {
        HashMap map = new HashMap();
        c2750m.getClass();
        for (String str : new ArrayList(c2750m.f14304a.keySet())) {
            Object objM7690f = m7690f(c2750m.mo7789o(str));
            if (objM7690f != null) {
                map.put(str, objM7690f);
            }
        }
        return map;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public static void m7692h(int i10, String str, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m7693i(int i10, String str, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static void m7694j(int i10, String str, ArrayList arrayList) {
        if (arrayList.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(arrayList.size())));
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m7695k(InterfaceC2790p interfaceC2790p) {
        if (interfaceC2790p == null) {
            return false;
        }
        Double dMo7783e = interfaceC2790p.mo7783e();
        return !dMo7783e.isNaN() && dMo7783e.doubleValue() >= 0.0d && dMo7783e.equals(Double.valueOf(Math.floor(dMo7783e.doubleValue())));
    }

    /* JADX INFO: renamed from: l */
    public static boolean m7696l(InterfaceC2790p interfaceC2790p, InterfaceC2790p interfaceC2790p2) {
        if (!interfaceC2790p.getClass().equals(interfaceC2790p2.getClass())) {
            return false;
        }
        if (!(interfaceC2790p instanceof C2855u) && !(interfaceC2790p instanceof C2764n)) {
            if (interfaceC2790p instanceof C2694i) {
                if (Double.isNaN(interfaceC2790p.mo7783e().doubleValue()) || Double.isNaN(interfaceC2790p2.mo7783e().doubleValue())) {
                    return false;
                }
                return interfaceC2790p.mo7783e().equals(interfaceC2790p2.mo7783e());
            }
            if (interfaceC2790p instanceof C2842t) {
                return interfaceC2790p.mo7784f().equals(interfaceC2790p2.mo7784f());
            }
            if (interfaceC2790p instanceof C2666g) {
                return interfaceC2790p.mo7786i().equals(interfaceC2790p2.mo7786i());
            }
            return interfaceC2790p == interfaceC2790p2;
        }
        return true;
    }
}
