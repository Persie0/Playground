package com.google.android.gms.internal.measurement;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2630d5 {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static int m7748a(int i10) {
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return 7;
            default:
                return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2588a5 m7749b(InterfaceC2588a5 interfaceC2588a5) {
        if ((interfaceC2588a5 instanceof C2616c5) || (interfaceC2588a5 instanceof zzin)) {
            return interfaceC2588a5;
        }
        return interfaceC2588a5 instanceof Serializable ? new zzin(interfaceC2588a5) : new C2616c5(interfaceC2588a5);
    }

    /* JADX INFO: renamed from: c */
    public static C2652f m7750c(C2652f c2652f, C2684h3 c2684h3, C2777o c2777o, Boolean bool, Boolean bool2) {
        C2652f c2652f2 = new C2652f();
        Iterator itM7794u = c2652f.m7794u();
        while (true) {
            while (itM7794u.hasNext()) {
                int iIntValue = ((Integer) itM7794u.next()).intValue();
                if (c2652f.m7781C(iIntValue)) {
                    InterfaceC2790p interfaceC2790pMo7646b = c2777o.mo7646b(c2684h3, Arrays.asList(c2652f.m7792s(iIntValue), new C2694i(Double.valueOf(iIntValue)), c2652f));
                    if (interfaceC2790pMo7646b.mo7786i().equals(bool)) {
                        return c2652f2;
                    }
                    if (bool2 != null && !interfaceC2790pMo7646b.mo7786i().equals(bool2)) {
                    }
                    c2652f2.m7780B(iIntValue, interfaceC2790pMo7646b);
                }
            }
            return c2652f2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    /* JADX INFO: renamed from: d */
    public static InterfaceC2790p m7751d(C2652f c2652f, C2684h3 c2684h3, ArrayList arrayList, boolean z10) {
        InterfaceC2790p interfaceC2790pMo7646b;
        C2601b4.m7693i(1, "reduce", arrayList);
        C2601b4.m7694j(2, "reduce", arrayList);
        InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
        if (!(interfaceC2790pM7863b instanceof AbstractC2708j)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            interfaceC2790pMo7646b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
            if (interfaceC2790pMo7646b instanceof C2680h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c2652f.m7791q() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            interfaceC2790pMo7646b = null;
        }
        AbstractC2708j abstractC2708j = (AbstractC2708j) interfaceC2790pM7863b;
        int iM7791q = c2652f.m7791q();
        int i10 = z10 ? 0 : iM7791q - 1;
        int i11 = -1;
        int i12 = z10 ? iM7791q - 1 : 0;
        if (true == z10) {
            i11 = 1;
        }
        if (interfaceC2790pMo7646b == null) {
            interfaceC2790pMo7646b = c2652f.m7792s(i10);
            i10 += i11;
        }
        while ((i12 - i10) * i11 >= 0) {
            if (c2652f.m7781C(i10)) {
                interfaceC2790pMo7646b = abstractC2708j.mo7646b(c2684h3, Arrays.asList(interfaceC2790pMo7646b, c2652f.m7792s(i10), new C2694i(Double.valueOf(i10)), c2652f));
                if (interfaceC2790pMo7646b instanceof C2680h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i10 += i11;
            } else {
                i10 += i11;
            }
        }
        return interfaceC2790pMo7646b;
    }
}
