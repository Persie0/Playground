package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2868v extends AbstractC2881w {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f14464b;

    public C2868v(int i10) {
        this.f14464b = i10;
        if (i10 != 1) {
            ArrayList arrayList = this.f14483a;
            arrayList.add(zzbl.BITWISE_AND);
            arrayList.add(zzbl.BITWISE_LEFT_SHIFT);
            arrayList.add(zzbl.BITWISE_NOT);
            arrayList.add(zzbl.BITWISE_OR);
            arrayList.add(zzbl.BITWISE_RIGHT_SHIFT);
            arrayList.add(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT);
            arrayList.add(zzbl.BITWISE_XOR);
            return;
        }
        ArrayList arrayList2 = this.f14483a;
        arrayList2.add(zzbl.ADD);
        arrayList2.add(zzbl.DIVIDE);
        arrayList2.add(zzbl.MODULUS);
        arrayList2.add(zzbl.MULTIPLY);
        arrayList2.add(zzbl.NEGATE);
        arrayList2.add(zzbl.POST_DECREMENT);
        arrayList2.add(zzbl.POST_INCREMENT);
        arrayList2.add(zzbl.PRE_DECREMENT);
        arrayList2.add(zzbl.PRE_INCREMENT);
        arrayList2.add(zzbl.SUBTRACT);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2881w
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7739a(String str, C2684h3 c2684h3, ArrayList arrayList) {
        InterfaceC2790p c2842t;
        switch (this.f14464b) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                zzbl zzblVar = zzbl.ADD;
                switch (C2601b4.m7689e(str).ordinal()) {
                    case 4:
                        return new C2694i(Double.valueOf(C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_AND, 2, arrayList, 0)).mo7783e().doubleValue()) & C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue())));
                    case 5:
                        return new C2694i(Double.valueOf(C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_LEFT_SHIFT, 2, arrayList, 0)).mo7783e().doubleValue()) << ((int) (C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()) & 31))));
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        return new C2694i(Double.valueOf(~C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_NOT, 1, arrayList, 0)).mo7783e().doubleValue())));
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        return new C2694i(Double.valueOf(C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_OR, 2, arrayList, 0)).mo7783e().doubleValue()) | C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue())));
                    case 8:
                        return new C2694i(Double.valueOf(C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_RIGHT_SHIFT, 2, arrayList, 0)).mo7783e().doubleValue()) >> ((int) (C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()) & 31))));
                    case 9:
                        return new C2694i(Double.valueOf(C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, arrayList, 0)).mo7783e().doubleValue()) >>> ((int) (C2601b4.m7688d(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()) & 31))));
                    case 10:
                        return new C2694i(Double.valueOf(C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.BITWISE_XOR, 2, arrayList, 0)).mo7783e().doubleValue()) ^ C2601b4.m7686b(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue())));
                    default:
                        m8326b(str);
                        throw null;
                }
            default:
                zzbl zzblVar2 = zzbl.ADD;
                int iOrdinal = C2601b4.m7689e(str).ordinal();
                if (iOrdinal == 0) {
                    InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.ADD, 2, arrayList, 0));
                    InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                    if ((interfaceC2790pM7863b instanceof InterfaceC2736l) || (interfaceC2790pM7863b instanceof C2842t) || (interfaceC2790pM7863b2 instanceof InterfaceC2736l) || (interfaceC2790pM7863b2 instanceof C2842t)) {
                        c2842t = new C2842t(String.valueOf(interfaceC2790pM7863b.mo7784f()).concat(String.valueOf(interfaceC2790pM7863b2.mo7784f())));
                    } else {
                        c2842t = new C2694i(Double.valueOf(interfaceC2790pM7863b2.mo7783e().doubleValue() + interfaceC2790pM7863b.mo7783e().doubleValue()));
                    }
                } else {
                    if (iOrdinal == 21) {
                        return new C2694i(Double.valueOf(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.DIVIDE, 2, arrayList, 0)).mo7783e().doubleValue() / c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()));
                    }
                    if (iOrdinal == 59) {
                        InterfaceC2790p interfaceC2790pM7863b3 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.SUBTRACT, 2, arrayList, 0));
                        Double dValueOf = Double.valueOf(-c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                        if (dValueOf == null) {
                            dValueOf = Double.valueOf(Double.NaN);
                        }
                        c2842t = new C2694i(Double.valueOf(dValueOf.doubleValue() + interfaceC2790pM7863b3.mo7783e().doubleValue()));
                    } else {
                        if (iOrdinal == 52 || iOrdinal == 53) {
                            C2601b4.m7692h(2, str, arrayList);
                            InterfaceC2790p interfaceC2790pM7863b4 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                            c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                            return interfaceC2790pM7863b4;
                        }
                        if (iOrdinal == 55 || iOrdinal == 56) {
                            C2601b4.m7692h(1, str, arrayList);
                            return c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                        }
                        switch (iOrdinal) {
                            case 44:
                                return new C2694i(Double.valueOf(c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.MODULUS, 2, arrayList, 0)).mo7783e().doubleValue() % c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()));
                            case 45:
                                c2842t = new C2694i(Double.valueOf(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue() * c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.MULTIPLY, 2, arrayList, 0)).mo7783e().doubleValue()));
                                break;
                            case 46:
                                return new C2694i(Double.valueOf(-c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.NEGATE, 1, arrayList, 0)).mo7783e().doubleValue()));
                            default:
                                m8326b(str);
                                throw null;
                        }
                    }
                }
                return c2842t;
        }
    }
}
