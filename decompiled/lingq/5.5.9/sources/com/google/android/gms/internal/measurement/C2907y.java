package com.google.android.gms.internal.measurement;

import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p081e0.C5298b1;
import p290o6.C7968m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2907y extends AbstractC2881w {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f14511b;

    public C2907y(int i10) {
        this.f14511b = i10;
        if (i10 == 1) {
            ArrayList arrayList = this.f14483a;
            arrayList.add(zzbl.AND);
            arrayList.add(zzbl.NOT);
            arrayList.add(zzbl.OR);
            return;
        }
        if (i10 == 2) {
            ArrayList arrayList2 = this.f14483a;
            arrayList2.add(zzbl.FOR_IN);
            arrayList2.add(zzbl.FOR_IN_CONST);
            arrayList2.add(zzbl.FOR_IN_LET);
            arrayList2.add(zzbl.FOR_LET);
            arrayList2.add(zzbl.FOR_OF);
            arrayList2.add(zzbl.FOR_OF_CONST);
            arrayList2.add(zzbl.FOR_OF_LET);
            arrayList2.add(zzbl.WHILE);
            return;
        }
        ArrayList arrayList3 = this.f14483a;
        arrayList3.add(zzbl.APPLY);
        arrayList3.add(zzbl.BLOCK);
        arrayList3.add(zzbl.BREAK);
        arrayList3.add(zzbl.CASE);
        arrayList3.add(zzbl.DEFAULT);
        arrayList3.add(zzbl.CONTINUE);
        arrayList3.add(zzbl.DEFINE_FUNCTION);
        arrayList3.add(zzbl.FN);
        arrayList3.add(zzbl.IF);
        arrayList3.add(zzbl.QUOTE);
        arrayList3.add(zzbl.RETURN);
        arrayList3.add(zzbl.SWITCH);
        arrayList3.add(zzbl.TERNARY);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public static C2777o m8432c(C2684h3 c2684h3, ArrayList arrayList) {
        C2601b4.m7693i(2, zzbl.FN.name(), arrayList);
        InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
        InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
        if (!(interfaceC2790pM7863b2 instanceof C2652f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", interfaceC2790pM7863b2.getClass().getCanonicalName()));
        }
        ArrayList arrayListM7795v = ((C2652f) interfaceC2790pM7863b2).m7795v();
        List arrayList2 = new ArrayList();
        if (arrayList.size() > 2) {
            arrayList2 = arrayList.subList(2, arrayList.size());
        }
        return new C2777o(interfaceC2790pM7863b.mo7784f(), arrayListM7795v, arrayList2, c2684h3);
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC2790p m8433d(InterfaceC2597b0 interfaceC2597b0, Iterator it, InterfaceC2790p interfaceC2790p) {
        if (it != null) {
            while (it.hasNext()) {
                InterfaceC2790p interfaceC2790pM7864c = interfaceC2597b0.mo1214b((InterfaceC2790p) it.next()).m7864c((C2652f) interfaceC2790p);
                if (interfaceC2790pM7864c instanceof C2680h) {
                    C2680h c2680h = (C2680h) interfaceC2790pM7864c;
                    if ("break".equals(c2680h.f14221b)) {
                        return InterfaceC2790p.f14375r;
                    }
                    if ("return".equals(c2680h.f14221b)) {
                        return c2680h;
                    }
                }
            }
        }
        return InterfaceC2790p.f14375r;
    }

    /* JADX INFO: renamed from: e */
    public static InterfaceC2790p m8434e(InterfaceC2597b0 interfaceC2597b0, InterfaceC2790p interfaceC2790p, InterfaceC2790p interfaceC2790p2) {
        if (interfaceC2790p instanceof Iterable) {
            return m8433d(interfaceC2597b0, ((Iterable) interfaceC2790p).iterator(), interfaceC2790p2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    /* JADX WARN: Code duplicated, block: B:215:0x0676  */
    /* JADX WARN: Code duplicated, block: B:217:0x0684  */
    /* JADX WARN: Code duplicated, block: B:220:0x0695  */
    /* JADX WARN: Code duplicated, block: B:232:0x0690 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x0664 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x06a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x06a0 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0662, code lost:
    
        if ("return".equals(r3.f14221b) != false) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01fb, code lost:
    
        if (r14.equals("continue") == false) goto L85;
     */
    /* JADX WARN: Unreachable blocks removed: 10, instructions: 10 */
    @Override // com.google.android.gms.internal.measurement.AbstractC2881w
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2790p mo7739a(String str, C2684h3 c2684h3, ArrayList arrayList) {
        InterfaceC2790p interfaceC2790pMo7790p;
        InterfaceC2790p interfaceC2790pM7864c;
        C2680h c2680h;
        switch (this.f14511b) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                zzbl zzblVar = zzbl.ADD;
                int iOrdinal = C2601b4.m7689e(str).ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal == 15) {
                        C2601b4.m7692h(0, zzbl.BREAK.name(), arrayList);
                        return InterfaceC2790p.f14377t;
                    }
                    if (iOrdinal == 25) {
                        return m8432c(c2684h3, arrayList);
                    }
                    if (iOrdinal == 41) {
                        C2601b4.m7693i(2, zzbl.IF.name(), arrayList);
                        InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                        InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                        InterfaceC2790p interfaceC2790pM7863b3 = arrayList.size() > 2 ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)) : null;
                        InterfaceC2790p interfaceC2790p = InterfaceC2790p.f14375r;
                        InterfaceC2790p interfaceC2790pM7864c2 = interfaceC2790pM7863b.mo7786i().booleanValue() ? c2684h3.m7864c((C2652f) interfaceC2790pM7863b2) : interfaceC2790pM7863b3 != null ? c2684h3.m7864c((C2652f) interfaceC2790pM7863b3) : interfaceC2790p;
                        return interfaceC2790pM7864c2 instanceof C2680h ? interfaceC2790pM7864c2 : interfaceC2790p;
                    }
                    if (iOrdinal == 54) {
                        return new C2652f(arrayList);
                    }
                    if (iOrdinal == 57) {
                        return arrayList.isEmpty() ? InterfaceC2790p.f14379v : new C2680h("return", c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.RETURN, 1, arrayList, 0)));
                    }
                    if (iOrdinal != 19) {
                        if (iOrdinal == 20) {
                            C2601b4.m7693i(2, zzbl.DEFINE_FUNCTION.name(), arrayList);
                            C2777o c2777oM8432c = m8432c(c2684h3, arrayList);
                            String str2 = c2777oM8432c.f14260a;
                            if (str2 == null) {
                                c2684h3.m7867f("", c2777oM8432c);
                                return c2777oM8432c;
                            }
                            c2684h3.m7867f(str2, c2777oM8432c);
                            return c2777oM8432c;
                        }
                        if (iOrdinal == 60) {
                            InterfaceC2790p interfaceC2790pM7863b4 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.SWITCH, 3, arrayList, 0));
                            InterfaceC2790p interfaceC2790pM7863b5 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                            InterfaceC2790p interfaceC2790pM7863b6 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(2));
                            if (!(interfaceC2790pM7863b5 instanceof C2652f)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                            }
                            if (!(interfaceC2790pM7863b6 instanceof C2652f)) {
                                throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                            }
                            C2652f c2652f = (C2652f) interfaceC2790pM7863b5;
                            C2652f c2652f2 = (C2652f) interfaceC2790pM7863b6;
                            boolean z10 = false;
                            for (int i10 = 0; i10 < c2652f.m7791q(); i10++) {
                                if (z10 || interfaceC2790pM7863b4.equals(c2684h3.m7863b(c2652f.m7792s(i10)))) {
                                    InterfaceC2790p interfaceC2790pM7863b7 = c2684h3.m7863b(c2652f2.m7792s(i10));
                                    if (interfaceC2790pM7863b7 instanceof C2680h) {
                                        return ((C2680h) interfaceC2790pM7863b7).f14221b.equals("break") ? InterfaceC2790p.f14375r : interfaceC2790pM7863b7;
                                    }
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                            }
                            if (c2652f.m7791q() + 1 == c2652f2.m7791q()) {
                                interfaceC2790pMo7790p = c2684h3.m7863b(c2652f2.m7792s(c2652f.m7791q()));
                                if (interfaceC2790pMo7790p instanceof C2680h) {
                                    String str3 = ((C2680h) interfaceC2790pMo7790p).f14221b;
                                    if (!str3.equals("return")) {
                                    }
                                }
                                break;
                            }
                            return InterfaceC2790p.f14375r;
                        }
                        if (iOrdinal == 61) {
                            return c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.TERNARY, 3, arrayList, 0)).mo7786i().booleanValue() ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)) : c2684h3.m7863b((InterfaceC2790p) arrayList.get(2));
                        }
                        switch (iOrdinal) {
                            case 11:
                                return c2684h3.m7862a().m7864c(new C2652f(arrayList));
                            case 12:
                                C2601b4.m7692h(0, zzbl.BREAK.name(), arrayList);
                                return InterfaceC2790p.f14378u;
                            case 13:
                                break;
                            default:
                                m8326b(str);
                                throw null;
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return InterfaceC2790p.f14375r;
                    }
                    InterfaceC2790p interfaceC2790pM7863b8 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                    return interfaceC2790pM7863b8 instanceof C2652f ? c2684h3.m7864c((C2652f) interfaceC2790pM7863b8) : InterfaceC2790p.f14375r;
                }
                InterfaceC2790p interfaceC2790pM7863b9 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.APPLY, 3, arrayList, 0));
                String strMo7784f = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7784f();
                InterfaceC2790p interfaceC2790pM7863b10 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(2));
                if (!(interfaceC2790pM7863b10 instanceof C2652f)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", interfaceC2790pM7863b10.getClass().getCanonicalName()));
                }
                if (strMo7784f.isEmpty()) {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
                interfaceC2790pMo7790p = interfaceC2790pM7863b9.mo7790p(strMo7784f, c2684h3, ((C2652f) interfaceC2790pM7863b10).m7795v());
                return interfaceC2790pMo7790p;
            case 1:
                zzbl zzblVar2 = zzbl.ADD;
                int iOrdinal2 = C2601b4.m7689e(str).ordinal();
                if (iOrdinal2 == 1) {
                    InterfaceC2790p interfaceC2790pM7863b11 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.AND, 2, arrayList, 0));
                    return !interfaceC2790pM7863b11.mo7786i().booleanValue() ? interfaceC2790pM7863b11 : c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                }
                if (iOrdinal2 == 47) {
                    return new C2666g(Boolean.valueOf(!c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.NOT, 1, arrayList, 0)).mo7786i().booleanValue()));
                }
                if (iOrdinal2 == 50) {
                    InterfaceC2790p interfaceC2790pM7863b12 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.OR, 2, arrayList, 0));
                    return interfaceC2790pM7863b12.mo7786i().booleanValue() ? interfaceC2790pM7863b12 : c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                }
                m8326b(str);
                throw null;
            default:
                zzbl zzblVar3 = zzbl.ADD;
                int iOrdinal3 = C2601b4.m7689e(str).ordinal();
                if (iOrdinal3 == 65) {
                    InterfaceC2790p interfaceC2790p2 = (InterfaceC2790p) C0166e.m760f(zzbl.WHILE, 4, arrayList, 0);
                    InterfaceC2790p interfaceC2790p3 = (InterfaceC2790p) arrayList.get(1);
                    InterfaceC2790p interfaceC2790p4 = (InterfaceC2790p) arrayList.get(2);
                    InterfaceC2790p interfaceC2790pM7863b13 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(3));
                    if (!c2684h3.m7863b(interfaceC2790p4).mo7786i().booleanValue()) {
                        while (c2684h3.m7863b(interfaceC2790p2).mo7786i().booleanValue()) {
                            interfaceC2790pM7864c = c2684h3.m7864c((C2652f) interfaceC2790pM7863b13);
                            if (interfaceC2790pM7864c instanceof C2680h) {
                                c2680h = (C2680h) interfaceC2790pM7864c;
                                if ("break".equals(c2680h.f14221b)) {
                                    return InterfaceC2790p.f14375r;
                                }
                                if ("return".equals(c2680h.f14221b)) {
                                }
                            }
                            c2684h3.m7863b(interfaceC2790p3);
                        }
                        return InterfaceC2790p.f14375r;
                    }
                    InterfaceC2790p interfaceC2790pM7864c3 = c2684h3.m7864c((C2652f) interfaceC2790pM7863b13);
                    if (interfaceC2790pM7864c3 instanceof C2680h) {
                        c2680h = (C2680h) interfaceC2790pM7864c3;
                        if ("break".equals(c2680h.f14221b)) {
                            return InterfaceC2790p.f14375r;
                        }
                        break;
                    }
                    while (c2684h3.m7863b(interfaceC2790p2).mo7786i().booleanValue()) {
                        interfaceC2790pM7864c = c2684h3.m7864c((C2652f) interfaceC2790pM7863b13);
                        if (interfaceC2790pM7864c instanceof C2680h) {
                            c2680h = (C2680h) interfaceC2790pM7864c;
                            if ("break".equals(c2680h.f14221b)) {
                                return InterfaceC2790p.f14375r;
                            }
                            if ("return".equals(c2680h.f14221b)) {
                            }
                        }
                        c2684h3.m7863b(interfaceC2790p3);
                    }
                    return InterfaceC2790p.f14375r;
                    return c2680h;
                }
                switch (iOrdinal3) {
                    case 26:
                        if (C0166e.m760f(zzbl.FOR_IN, 3, arrayList, 0) instanceof C2842t) {
                            return m8433d(new C7968m(c2684h3, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7787l(), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                    case 27:
                        if (C0166e.m760f(zzbl.FOR_IN_CONST, 3, arrayList, 0) instanceof C2842t) {
                            return m8433d(new C0322j(c2684h3, 5, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7787l(), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                    case 28:
                        if (C0166e.m760f(zzbl.FOR_IN_LET, 3, arrayList, 0) instanceof C2842t) {
                            return m8433d(new C5298b1(c2684h3, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7787l(), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                    case 29:
                        InterfaceC2790p interfaceC2790pM7863b14 = c2684h3.m7863b((InterfaceC2790p) C0166e.m760f(zzbl.FOR_LET, 4, arrayList, 0));
                        if (!(interfaceC2790pM7863b14 instanceof C2652f)) {
                            throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                        }
                        C2652f c2652f3 = (C2652f) interfaceC2790pM7863b14;
                        InterfaceC2790p interfaceC2790p5 = (InterfaceC2790p) arrayList.get(1);
                        InterfaceC2790p interfaceC2790p6 = (InterfaceC2790p) arrayList.get(2);
                        InterfaceC2790p interfaceC2790pM7863b15 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(3));
                        C2684h3 c2684h3M7862a = c2684h3.m7862a();
                        for (int i11 = 0; i11 < c2652f3.m7791q(); i11++) {
                            String strMo7784f2 = c2652f3.m7792s(i11).mo7784f();
                            c2684h3M7862a.m7867f(strMo7784f2, c2684h3.m7865d(strMo7784f2));
                        }
                        while (c2684h3.m7863b(interfaceC2790p5).mo7786i().booleanValue()) {
                            InterfaceC2790p interfaceC2790pM7864c4 = c2684h3.m7864c((C2652f) interfaceC2790pM7863b15);
                            if (interfaceC2790pM7864c4 instanceof C2680h) {
                                C2680h c2680h2 = (C2680h) interfaceC2790pM7864c4;
                                if ("break".equals(c2680h2.f14221b)) {
                                    return InterfaceC2790p.f14375r;
                                }
                                if ("return".equals(c2680h2.f14221b)) {
                                    return c2680h2;
                                }
                            }
                            C2684h3 c2684h3M7862a2 = c2684h3.m7862a();
                            for (int i12 = 0; i12 < c2652f3.m7791q(); i12++) {
                                String strMo7784f3 = c2652f3.m7792s(i12).mo7784f();
                                c2684h3M7862a2.m7867f(strMo7784f3, c2684h3M7862a.m7865d(strMo7784f3));
                            }
                            c2684h3M7862a2.m7863b(interfaceC2790p6);
                            c2684h3M7862a = c2684h3M7862a2;
                        }
                        return InterfaceC2790p.f14375r;
                    case 30:
                        if (C0166e.m760f(zzbl.FOR_OF, 3, arrayList, 0) instanceof C2842t) {
                            return m8434e(new C7968m(c2684h3, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                    case 31:
                        if (C0166e.m760f(zzbl.FOR_OF_CONST, 3, arrayList, 0) instanceof C2842t) {
                            return m8434e(new C0322j(c2684h3, 5, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                    case 32:
                        if (C0166e.m760f(zzbl.FOR_OF_LET, 3, arrayList, 0) instanceof C2842t) {
                            return m8434e(new C5298b1(c2684h3, ((InterfaceC2790p) arrayList.get(0)).mo7784f()), c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)), c2684h3.m7863b((InterfaceC2790p) arrayList.get(2)));
                        }
                        throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                    default:
                        m8326b(str);
                        throw null;
                }
        }
    }
}
