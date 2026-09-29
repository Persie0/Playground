package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x */
/* JADX INFO: loaded from: classes.dex */
public final class C2894x extends AbstractC2881w {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f14504b;

    public C2894x(int i10) {
        this.f14504b = i10;
        if (i10 != 1) {
            ArrayList arrayList = this.f14483a;
            arrayList.add(zzbl.EQUALS);
            arrayList.add(zzbl.GREATER_THAN);
            arrayList.add(zzbl.GREATER_THAN_EQUALS);
            arrayList.add(zzbl.IDENTITY_EQUALS);
            arrayList.add(zzbl.IDENTITY_NOT_EQUALS);
            arrayList.add(zzbl.LESS_THAN);
            arrayList.add(zzbl.LESS_THAN_EQUALS);
            arrayList.add(zzbl.NOT_EQUALS);
            return;
        }
        ArrayList arrayList2 = this.f14483a;
        arrayList2.add(zzbl.ASSIGN);
        arrayList2.add(zzbl.CONST);
        arrayList2.add(zzbl.CREATE_ARRAY);
        arrayList2.add(zzbl.CREATE_OBJECT);
        arrayList2.add(zzbl.EXPRESSION_LIST);
        arrayList2.add(zzbl.GET);
        arrayList2.add(zzbl.GET_INDEX);
        arrayList2.add(zzbl.GET_PROPERTY);
        arrayList2.add(zzbl.NULL);
        arrayList2.add(zzbl.SET_PROPERTY);
        arrayList2.add(zzbl.TYPEOF);
        arrayList2.add(zzbl.UNDEFINED);
        arrayList2.add(zzbl.VAR);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m8381c(InterfaceC2790p interfaceC2790p, InterfaceC2790p interfaceC2790p2) {
        if (interfaceC2790p.getClass().equals(interfaceC2790p2.getClass())) {
            if ((interfaceC2790p instanceof C2855u) || (interfaceC2790p instanceof C2764n)) {
                return true;
            }
            if (interfaceC2790p instanceof C2694i) {
                return (Double.isNaN(interfaceC2790p.mo7783e().doubleValue()) || Double.isNaN(interfaceC2790p2.mo7783e().doubleValue()) || interfaceC2790p.mo7783e().doubleValue() != interfaceC2790p2.mo7783e().doubleValue()) ? false : true;
            }
            if (interfaceC2790p instanceof C2842t) {
                return interfaceC2790p.mo7784f().equals(interfaceC2790p2.mo7784f());
            }
            if (interfaceC2790p instanceof C2666g) {
                return interfaceC2790p.mo7786i().equals(interfaceC2790p2.mo7786i());
            }
            return interfaceC2790p == interfaceC2790p2;
        }
        if ((interfaceC2790p instanceof C2855u) || (interfaceC2790p instanceof C2764n)) {
            if ((interfaceC2790p2 instanceof C2855u) || (interfaceC2790p2 instanceof C2764n)) {
                return true;
            }
        }
        boolean z10 = interfaceC2790p instanceof C2694i;
        if (z10 && (interfaceC2790p2 instanceof C2842t)) {
            return m8381c(interfaceC2790p, new C2694i(interfaceC2790p2.mo7783e()));
        }
        boolean z11 = interfaceC2790p instanceof C2842t;
        if ((!z11 || !(interfaceC2790p2 instanceof C2694i)) && !(interfaceC2790p instanceof C2666g)) {
            if (interfaceC2790p2 instanceof C2666g) {
                return m8381c(interfaceC2790p, new C2694i(interfaceC2790p2.mo7783e()));
            }
            if ((z11 || z10) && (interfaceC2790p2 instanceof InterfaceC2736l)) {
                return m8381c(interfaceC2790p, new C2842t(interfaceC2790p2.mo7784f()));
            }
            if (!(interfaceC2790p instanceof InterfaceC2736l) || (!(interfaceC2790p2 instanceof C2842t) && !(interfaceC2790p2 instanceof C2694i))) {
                return false;
            }
            return m8381c(new C2842t(interfaceC2790p.mo7784f()), interfaceC2790p2);
        }
        return m8381c(new C2694i(interfaceC2790p.mo7783e()), interfaceC2790p2);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m8382d(InterfaceC2790p interfaceC2790p, InterfaceC2790p interfaceC2790p2) {
        InterfaceC2790p c2842t = interfaceC2790p;
        if (c2842t instanceof InterfaceC2736l) {
            c2842t = new C2842t(c2842t.mo7784f());
        }
        if (interfaceC2790p2 instanceof InterfaceC2736l) {
            interfaceC2790p2 = new C2842t(interfaceC2790p2.mo7784f());
        }
        if ((c2842t instanceof C2842t) && (interfaceC2790p2 instanceof C2842t)) {
            return c2842t.mo7784f().compareTo(interfaceC2790p2.mo7784f()) < 0;
        }
        double dDoubleValue = c2842t.mo7783e().doubleValue();
        double dDoubleValue2 = interfaceC2790p2.mo7783e().doubleValue();
        if (!Double.isNaN(dDoubleValue)) {
            if (!Double.isNaN(dDoubleValue2)) {
                if ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d)) {
                    return false;
                }
                if (Double.compare(dDoubleValue, dDoubleValue2) < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX INFO: renamed from: e */
    public static boolean m8383e(InterfaceC2790p interfaceC2790p, InterfaceC2790p interfaceC2790p2) {
        if (interfaceC2790p instanceof InterfaceC2736l) {
            interfaceC2790p = new C2842t(interfaceC2790p.mo7784f());
        }
        if (interfaceC2790p2 instanceof InterfaceC2736l) {
            interfaceC2790p2 = new C2842t(interfaceC2790p2.mo7784f());
        }
        if ((interfaceC2790p instanceof C2842t) && (interfaceC2790p2 instanceof C2842t)) {
            if (!m8382d(interfaceC2790p2, interfaceC2790p)) {
                return true;
            }
        } else if (!Double.isNaN(interfaceC2790p.mo7783e().doubleValue()) && !Double.isNaN(interfaceC2790p2.mo7783e().doubleValue())) {
            if (!m8382d(interfaceC2790p2, interfaceC2790p)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v116 */
    /* JADX WARN: Type inference failed for: r12v117 */
    /* JADX WARN: Type inference failed for: r12v13, types: [com.google.android.gms.internal.measurement.p] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v57, types: [com.google.android.gms.internal.measurement.f] */
    /* JADX WARN: Type inference failed for: r12v64, types: [com.google.android.gms.internal.measurement.m] */
    /* JADX WARN: Unreachable blocks removed: 8, instructions: 8 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2881w
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7739a(String str, C2684h3 c2684h3, ArrayList arrayList) {
        InterfaceC2790p interfaceC2790pM7863b;
        ?? c2652f;
        InterfaceC2790p interfaceC2790pM7863b2;
        String str2;
        boolean zM8381c;
        boolean zM8381c2;
        int i10 = 0;
        switch (this.f14504b) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C2601b4.m7692h(2, C2601b4.m7689e(str).name(), arrayList);
                InterfaceC2790p interfaceC2790pM7863b3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                InterfaceC2790p interfaceC2790pM7863b4 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                int iOrdinal = C2601b4.m7689e(str).ordinal();
                if (iOrdinal != 23) {
                    if (iOrdinal == 48) {
                        zM8381c2 = m8381c(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                    } else if (iOrdinal == 42) {
                        zM8381c = m8382d(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                    } else if (iOrdinal != 43) {
                        switch (iOrdinal) {
                            case 37:
                                zM8381c = m8382d(interfaceC2790pM7863b4, interfaceC2790pM7863b3);
                                break;
                            case 38:
                                zM8381c = m8383e(interfaceC2790pM7863b4, interfaceC2790pM7863b3);
                                break;
                            case 39:
                                zM8381c = C2601b4.m7696l(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                                break;
                            case 40:
                                zM8381c2 = C2601b4.m7696l(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                                break;
                            default:
                                m8326b(str);
                                throw null;
                        }
                    } else {
                        zM8381c = m8383e(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                    }
                    zM8381c = !zM8381c2;
                } else {
                    zM8381c = m8381c(interfaceC2790pM7863b3, interfaceC2790pM7863b4);
                }
                return zM8381c ? InterfaceC2790p.f14380w : InterfaceC2790p.f14381x;
            default:
                zzbl zzblVar = zzbl.ADD;
                int iOrdinal2 = C2601b4.m7689e(str).ordinal();
                if (iOrdinal2 != 3) {
                    if (iOrdinal2 == 14) {
                        C2601b4.m7693i(2, zzbl.CONST.name(), arrayList);
                        if (arrayList.size() % 2 != 0) {
                            throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                        }
                        for (int i11 = 0; i11 < arrayList.size() - 1; i11 += 2) {
                            InterfaceC2790p interfaceC2790pM7863b5 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(i11));
                            if (!(interfaceC2790pM7863b5 instanceof C2842t)) {
                                throw new IllegalArgumentException(String.format("Expected string for const name. got %s", interfaceC2790pM7863b5.getClass().getCanonicalName()));
                            }
                            String strMo7784f = interfaceC2790pM7863b5.mo7784f();
                            c2684h3.m7866e(strMo7784f, c2684h3.m7863b((InterfaceC2790p) arrayList.get(i11 + 1)));
                            c2684h3.f14229d.put(strMo7784f, Boolean.TRUE);
                        }
                        return InterfaceC2790p.f14375r;
                    }
                    if (iOrdinal2 != 24) {
                        if (iOrdinal2 == 33) {
                            InterfaceC2790p interfaceC2790pM7863b6 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.GET, 1, arrayList, 0));
                            if (interfaceC2790pM7863b6 instanceof C2842t) {
                                return c2684h3.m7865d(interfaceC2790pM7863b6.mo7784f());
                            }
                            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", interfaceC2790pM7863b6.getClass().getCanonicalName()));
                        }
                        if (iOrdinal2 == 49) {
                            C2601b4.m7692h(0, zzbl.NULL.name(), arrayList);
                            return InterfaceC2790p.f14376s;
                        }
                        if (iOrdinal2 == 58) {
                            InterfaceC2790p interfaceC2790pM7863b7 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.SET_PROPERTY, 3, arrayList, 0));
                            InterfaceC2790p interfaceC2790pM7863b8 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                            interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(2));
                            if (interfaceC2790pM7863b7 == InterfaceC2790p.f14375r || interfaceC2790pM7863b7 == InterfaceC2790p.f14376s) {
                                throw new IllegalStateException(String.format("Can't set property %s of %s", interfaceC2790pM7863b8.mo7784f(), interfaceC2790pM7863b7.mo7784f()));
                            }
                            if ((interfaceC2790pM7863b7 instanceof C2652f) && (interfaceC2790pM7863b8 instanceof C2694i)) {
                                ((C2652f) interfaceC2790pM7863b7).m7780B(interfaceC2790pM7863b8.mo7783e().intValue(), interfaceC2790pM7863b2);
                            } else if (interfaceC2790pM7863b7 instanceof InterfaceC2736l) {
                                ((InterfaceC2736l) interfaceC2790pM7863b7).mo7788m(interfaceC2790pM7863b8.mo7784f(), interfaceC2790pM7863b2);
                            }
                        } else if (iOrdinal2 == 17) {
                            if (arrayList.isEmpty()) {
                                return new C2652f();
                            }
                            c2652f = new C2652f();
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                InterfaceC2790p interfaceC2790pM7863b9 = c2684h3.m7863b((InterfaceC2790p) it.next());
                                if (interfaceC2790pM7863b9 instanceof C2680h) {
                                    throw new IllegalStateException("Failed to evaluate array element");
                                }
                                c2652f.m7780B(i10, interfaceC2790pM7863b9);
                                i10++;
                            }
                        } else if (iOrdinal2 != 18) {
                            if (iOrdinal2 == 35 || iOrdinal2 == 36) {
                                InterfaceC2790p interfaceC2790pM7863b10 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.GET_PROPERTY, 2, arrayList, 0));
                                InterfaceC2790p interfaceC2790pM7863b11 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                                if ((interfaceC2790pM7863b10 instanceof C2652f) && C2601b4.m7695k(interfaceC2790pM7863b11)) {
                                    return ((C2652f) interfaceC2790pM7863b10).m7792s(interfaceC2790pM7863b11.mo7783e().intValue());
                                }
                                if (interfaceC2790pM7863b10 instanceof InterfaceC2736l) {
                                    return ((InterfaceC2736l) interfaceC2790pM7863b10).mo7789o(interfaceC2790pM7863b11.mo7784f());
                                }
                                if (interfaceC2790pM7863b10 instanceof C2842t) {
                                    if ("length".equals(interfaceC2790pM7863b11.mo7784f())) {
                                        interfaceC2790pM7863b2 = new C2694i(Double.valueOf(interfaceC2790pM7863b10.mo7784f().length()));
                                    } else if (C2601b4.m7695k(interfaceC2790pM7863b11) && interfaceC2790pM7863b11.mo7783e().doubleValue() < interfaceC2790pM7863b10.mo7784f().length()) {
                                        interfaceC2790pM7863b = new C2842t(String.valueOf(interfaceC2790pM7863b10.mo7784f().charAt(interfaceC2790pM7863b11.mo7783e().intValue())));
                                    }
                                }
                                return InterfaceC2790p.f14375r;
                            }
                            switch (iOrdinal2) {
                                case 62:
                                    InterfaceC2790p interfaceC2790pM7863b12 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.TYPEOF, 1, arrayList, 0));
                                    if (interfaceC2790pM7863b12 instanceof C2855u) {
                                        str2 = "undefined";
                                    } else if (interfaceC2790pM7863b12 instanceof C2666g) {
                                        str2 = "boolean";
                                    } else if (interfaceC2790pM7863b12 instanceof C2694i) {
                                        str2 = "number";
                                    } else if (interfaceC2790pM7863b12 instanceof C2842t) {
                                        str2 = "string";
                                    } else if (interfaceC2790pM7863b12 instanceof C2777o) {
                                        str2 = "function";
                                    } else {
                                        if ((interfaceC2790pM7863b12 instanceof C2803q) || (interfaceC2790pM7863b12 instanceof C2680h)) {
                                            throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", interfaceC2790pM7863b12));
                                        }
                                        str2 = "object";
                                    }
                                    interfaceC2790pM7863b2 = new C2842t(str2);
                                    break;
                                case 63:
                                    C2601b4.m7692h(0, zzbl.UNDEFINED.name(), arrayList);
                                    return InterfaceC2790p.f14375r;
                                case 64:
                                    C2601b4.m7693i(1, zzbl.VAR.name(), arrayList);
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        InterfaceC2790p interfaceC2790pM7863b13 = c2684h3.m7863b((InterfaceC2790p) it2.next());
                                        if (!(interfaceC2790pM7863b13 instanceof C2842t)) {
                                            throw new IllegalArgumentException(String.format("Expected string for var name. got %s", interfaceC2790pM7863b13.getClass().getCanonicalName()));
                                        }
                                        c2684h3.m7866e(interfaceC2790pM7863b13.mo7784f(), InterfaceC2790p.f14375r);
                                    }
                                    return InterfaceC2790p.f14375r;
                                default:
                                    m8326b(str);
                                    throw null;
                            }
                        } else {
                            if (arrayList.isEmpty()) {
                                return new C2750m();
                            }
                            if (arrayList.size() % 2 != 0) {
                                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(arrayList.size())));
                            }
                            c2652f = new C2750m();
                            while (i10 < arrayList.size() - 1) {
                                InterfaceC2790p interfaceC2790pM7863b14 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(i10));
                                InterfaceC2790p interfaceC2790pM7863b15 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(i10 + 1));
                                if ((interfaceC2790pM7863b14 instanceof C2680h) || (interfaceC2790pM7863b15 instanceof C2680h)) {
                                    throw new IllegalStateException("Failed to evaluate map entry");
                                }
                                c2652f.mo7788m(interfaceC2790pM7863b14.mo7784f(), interfaceC2790pM7863b15);
                                i10 += 2;
                            }
                        }
                        return interfaceC2790pM7863b2;
                    }
                    C2601b4.m7693i(1, zzbl.EXPRESSION_LIST.name(), arrayList);
                    c2652f = InterfaceC2790p.f14375r;
                    while (i10 < arrayList.size()) {
                        InterfaceC2790p interfaceC2790pM7863b16 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(i10));
                        if (interfaceC2790pM7863b16 instanceof C2680h) {
                            throw new IllegalStateException("ControlValue cannot be in an expression list");
                        }
                        i10++;
                        c2652f = interfaceC2790pM7863b16;
                    }
                    return c2652f;
                }
                InterfaceC2790p interfaceC2790pM7863b17 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.ASSIGN, 2, arrayList, 0));
                if (!(interfaceC2790pM7863b17 instanceof C2842t)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", interfaceC2790pM7863b17.getClass().getCanonicalName()));
                }
                if (!c2684h3.m7868g(interfaceC2790pM7863b17.mo7784f())) {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", interfaceC2790pM7863b17.mo7784f()));
                }
                interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                c2684h3.m7867f(interfaceC2790pM7863b17.mo7784f(), interfaceC2790pM7863b);
                c2652f = interfaceC2790pM7863b;
                return c2652f;
        }
    }
}
