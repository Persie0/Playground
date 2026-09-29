package cc;

import android.util.Log;
import com.google.android.gms.internal.measurement.C2599b2;
import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2641e2;
import com.google.android.gms.internal.measurement.C2656f3;
import com.google.android.gms.internal.measurement.C2711j2;
import com.google.android.gms.internal.measurement.C2760m9;
import com.google.android.gms.internal.measurement.C2922z1;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.v7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1963v7 extends AbstractC1972w7 {

    /* JADX INFO: renamed from: g */
    public final C2922z1 f10264g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1775b f10265h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1963v7(C1775b c1775b, String str, int i10, C2922z1 c2922z1) {
        super(str, i10);
        this.f10265h = c1775b;
        this.f10264g = c2922z1;
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: a */
    public final int mo5903a() {
        return this.f10264g.m8452u();
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: b */
    public final boolean mo5904b() {
        return this.f10264g.m8448G();
    }

    @Override // cc.AbstractC1972w7
    /* JADX INFO: renamed from: c */
    public final boolean mo5905c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:104:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:119:0x030a  */
    /* JADX WARN: Code duplicated, block: B:122:0x0333  */
    /* JADX WARN: Code duplicated, block: B:128:0x0350  */
    /* JADX WARN: Code duplicated, block: B:131:0x035a  */
    /* JADX WARN: Code duplicated, block: B:133:0x035e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0364  */
    /* JADX WARN: Code duplicated, block: B:136:0x0377  */
    /* JADX WARN: Code duplicated, block: B:138:0x037d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0385  */
    /* JADX WARN: Code duplicated, block: B:142:0x038f  */
    /* JADX WARN: Code duplicated, block: B:146:0x039f  */
    /* JADX WARN: Code duplicated, block: B:152:0x03f1 A[EDGE_INSN: B:152:0x03f1->B:155:0x043a BREAK  A[LOOP:1: B:60:0x0196->B:65:0x01c6]] */
    /* JADX WARN: Code duplicated, block: B:153:0x0415  */
    /* JADX WARN: Code duplicated, block: B:195:0x0392 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x01ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x023f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0356 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x03ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:218:0x03cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:219:0x03a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x03a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x0438 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:224:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:225:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:226:0x02ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:227:0x0310 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:0x02aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0303 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0189  */
    /* JADX WARN: Code duplicated, block: B:62:0x019c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c6 A[LOOP:1: B:60:0x0196->B:65:0x01c6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0201  */
    /* JADX WARN: Code duplicated, block: B:76:0x020a  */
    /* JADX WARN: Code duplicated, block: B:82:0x021f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0228  */
    /* JADX WARN: Code duplicated, block: B:87:0x0233  */
    /* JADX WARN: Code duplicated, block: B:92:0x0273  */
    /* JADX WARN: Code duplicated, block: B:97:0x0287  */
    /* JADX INFO: renamed from: g */
    public final boolean m5906g(Long l10, Long l11, C2600b3 c2600b3, long j10, C1901p c1901p, boolean z10) {
        HashSet hashSet;
        Iterator it;
        C8446b c8446b;
        Iterator it2;
        Iterator it3;
        Boolean bool;
        C2599b2 c2599b2;
        boolean z11;
        String strM7662x;
        Object orDefault;
        String str;
        C2641e2 c2641e2M7660v;
        Boolean boolM5909d;
        Boolean boolM5909d2;
        Boolean boolM5909d3;
        C2656f3 c2656f3;
        Long lValueOf;
        Double dValueOf;
        C2599b2 c2599b3;
        Boolean boolM5909d4;
        C2760m9.m8070a();
        C1775b c1775b = this.f10265h;
        C1802e c1802e = ((C1897o4) c1775b.f10430a).f10084g;
        C1976x2 c1976x2 = C1985y2.f10337Y;
        String str2 = this.f10281a;
        boolean zM5582q = c1802e.m5582q(str2, c1976x2);
        C2922z1 c2922z1 = this.f10264g;
        long j11 = c2922z1.m8447F() ? c1901p.f10109e : j10;
        InterfaceC1781b5 interfaceC1781b5 = c1775b.f10430a;
        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k3);
        boolean zIsLoggable = Log.isLoggable(c1860k3.m5709u(), 2);
        boolean z12 = true;
        int i10 = this.f10282b;
        if (zIsLoggable) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9938I.m5626d("Evaluating filter. audience, filter, event", Integer.valueOf(i10), c2922z1.m8449H() ? Integer.valueOf(c2922z1.m8452u()) : null, ((C1897o4) interfaceC1781b5).f10057H.m5603d(c2922z1.m8455z()));
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            C1864k7 c1864k7 = c1775b.f10436b.f9897g;
            C1846i7.m5629H(c1864k7);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (c2922z1.m8449H()) {
                C1864k7.m5721s(sb2, 0, "filter_id", Integer.valueOf(c2922z1.m8452u()));
            }
            C1864k7.m5721s(sb2, 0, "event_name", ((C1897o4) c1864k7.f10430a).f10057H.m5603d(c2922z1.m8455z()));
            String strM5719q = C1864k7.m5719q(c2922z1.m8445D(), c2922z1.m8446E(), c2922z1.m8447F());
            if (!strM5719q.isEmpty()) {
                C1864k7.m5721s(sb2, 0, "filter_type", strM5719q);
            }
            if (c2922z1.m8448G()) {
                C1864k7.m5722t(sb2, 1, "event_count_filter", c2922z1.m8454y());
            }
            if (c2922z1.m8451t() > 0) {
                sb2.append("  filters {\n");
                Iterator it4 = c2922z1.m8444A().iterator();
                while (it4.hasNext()) {
                    c1864k7.m5734o(sb2, 2, (C2599b2) it4.next());
                }
            }
            C1864k7.m5718p(1, sb2);
            sb2.append("}\n}\n");
            c1860k5.f9938I.m5624b(sb2.toString(), "Filter definition");
        }
        if (!c2922z1.m8449H() || c2922z1.m8452u() > 256) {
            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9945i.m5625c(C1860k3.m5700q(str2), String.valueOf(c2922z1.m8449H() ? Integer.valueOf(c2922z1.m8452u()) : null), "Invalid event filter ID. appId, id");
            return false;
        }
        boolean z13 = c2922z1.m8445D() || c2922z1.m8446E() || c2922z1.m8447F();
        if (z10 && !z13) {
            C1860k3 c1860k7 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k7);
            c1860k7.f9938I.m5625c(Integer.valueOf(i10), c2922z1.m8449H() ? Integer.valueOf(c2922z1.m8452u()) : null, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        String strM7674A = c2600b3.m7674A();
        if (!c2922z1.m8448G()) {
            hashSet = new HashSet();
            it = c2922z1.m8444A().iterator();
            while (true) {
                if (it.hasNext()) {
                    c8446b = new C8446b();
                    it2 = c2600b3.m7675B().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c2922z1.m8444A().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c2599b2 = (C2599b2) it3.next();
                                if (c2599b2.m7655A()) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                strM7662x = c2599b2.m7662x();
                                if (strM7662x.isEmpty()) {
                                    C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k8);
                                    c1860k8.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), "Event has empty param name. event");
                                } else {
                                    orDefault = c8446b.getOrDefault(strM7662x, null);
                                    if (orDefault instanceof Long) {
                                        if (c2599b2.m7656B()) {
                                            boolM5909d3 = AbstractC1972w7.m5909d(new BigDecimal(((Long) orDefault).longValue()), c2599b2.m7660v(), 0.0d);
                                            if (boolM5909d3 == null) {
                                                if (boolM5909d3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                        } else {
                                            C1860k3 c1860k9 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k9);
                                            c1860k9.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No number filter for long param. event, param");
                                        }
                                    } else if (orDefault instanceof Double) {
                                        if (c2599b2.m7656B()) {
                                            double dDoubleValue = ((Double) orDefault).doubleValue();
                                            boolM5909d2 = AbstractC1972w7.m5909d(new BigDecimal(dDoubleValue), c2599b2.m7660v(), Math.ulp(dDoubleValue));
                                            if (boolM5909d2 == null) {
                                                if (boolM5909d2.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                        } else {
                                            C1860k3 c1860k10 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k10);
                                            c1860k10.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No number filter for double param. event, param");
                                        }
                                    } else if (orDefault instanceof String) {
                                        if (c2599b2.m7658D()) {
                                            C2711j2 c2711j2M7661w = c2599b2.m7661w();
                                            C1860k3 c1860k11 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k11);
                                            boolM5909d = AbstractC1972w7.m5910e((String) orDefault, c2711j2M7661w, c1860k11);
                                        } else if (c2599b2.m7656B()) {
                                            str = (String) orDefault;
                                            if (C1864k7.m5714I(str)) {
                                                c2641e2M7660v = c2599b2.m7660v();
                                                if (C1864k7.m5714I(str)) {
                                                    boolM5909d = AbstractC1972w7.m5909d(new BigDecimal(str), c2641e2M7660v, 0.0d);
                                                } else {
                                                    boolM5909d = null;
                                                }
                                            } else {
                                                C1860k3 c1860k12 = ((C1897o4) interfaceC1781b5).f10086i;
                                                C1897o4.m5776k(c1860k12);
                                                c1860k12.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Invalid param value for number filter. event, param");
                                            }
                                        } else {
                                            C1860k3 c1860k13 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k13);
                                            c1860k13.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No filter for String param. event, param");
                                        }
                                        if (boolM5909d == null) {
                                            if (boolM5909d.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            z12 = true;
                                        }
                                    } else {
                                        if (orDefault == null) {
                                            C1860k3 c1860k14 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k14);
                                            c1860k14.f9938I.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Missing param for filter. event, param");
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        C1860k3 c1860k15 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k15);
                                        c1860k15.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Unknown param type. event, param");
                                    }
                                }
                            }
                        } else {
                            c2656f3 = (C2656f3) it2.next();
                            if (!hashSet.contains(c2656f3.m7824z())) {
                                if (c2656f3.m7817O()) {
                                    String strM7824z = c2656f3.m7824z();
                                    if (c2656f3.m7817O()) {
                                        lValueOf = Long.valueOf(c2656f3.m7823w());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c8446b.put(strM7824z, lValueOf);
                                } else if (c2656f3.m7815M()) {
                                    String strM7824z2 = c2656f3.m7824z();
                                    if (c2656f3.m7815M()) {
                                        dValueOf = Double.valueOf(c2656f3.m7820t());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c8446b.put(strM7824z2, dValueOf);
                                } else if (c2656f3.m7819Q()) {
                                    c8446b.put(c2656f3.m7824z(), c2656f3.m7813A());
                                } else {
                                    C1860k3 c1860k16 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k16);
                                    c1860k16.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(c2656f3.m7824z()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c2599b3 = (C2599b2) it.next();
                    if (c2599b3.m7662x().isEmpty()) {
                        C1860k3 c1860k17 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k17);
                        c1860k17.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c2599b3.m7662x());
                    }
                }
                bool = null;
                break;
            }
        }
        try {
            boolM5909d4 = AbstractC1972w7.m5909d(new BigDecimal(j11), c2922z1.m8454y(), 0.0d);
        } catch (NumberFormatException unused) {
            boolM5909d4 = null;
        }
        if (boolM5909d4 == null) {
            bool = null;
            break;
        }
        if (boolM5909d4.booleanValue()) {
            hashSet = new HashSet();
            it = c2922z1.m8444A().iterator();
            while (true) {
                if (it.hasNext()) {
                    c8446b = new C8446b();
                    it2 = c2600b3.m7675B().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = c2922z1.m8444A().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                c2599b2 = (C2599b2) it3.next();
                                if (c2599b2.m7655A() || !c2599b2.m7663z()) {
                                    z11 = false;
                                } else {
                                    z11 = z12;
                                }
                                strM7662x = c2599b2.m7662x();
                                if (strM7662x.isEmpty()) {
                                    C1860k3 c1860k18 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k18);
                                    c1860k18.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), "Event has empty param name. event");
                                } else {
                                    orDefault = c8446b.getOrDefault(strM7662x, null);
                                    if (orDefault instanceof Long) {
                                        if (c2599b2.m7656B()) {
                                            C1860k3 c1860k19 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k19);
                                            c1860k19.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No number filter for long param. event, param");
                                        } else {
                                            try {
                                                boolM5909d3 = AbstractC1972w7.m5909d(new BigDecimal(((Long) orDefault).longValue()), c2599b2.m7660v(), 0.0d);
                                            } catch (NumberFormatException unused2) {
                                                boolM5909d3 = null;
                                            }
                                            if (boolM5909d3 == null) {
                                                if (boolM5909d3.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                        }
                                    } else if (orDefault instanceof Double) {
                                        if (c2599b2.m7656B()) {
                                            C1860k3 c1860k110 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k110);
                                            c1860k110.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No number filter for double param. event, param");
                                        } else {
                                            double dDoubleValue2 = ((Double) orDefault).doubleValue();
                                            try {
                                                boolM5909d2 = AbstractC1972w7.m5909d(new BigDecimal(dDoubleValue2), c2599b2.m7660v(), Math.ulp(dDoubleValue2));
                                            } catch (NumberFormatException unused3) {
                                                boolM5909d2 = null;
                                            }
                                            if (boolM5909d2 == null) {
                                                if (boolM5909d2.booleanValue() == z11) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                                z12 = true;
                                            }
                                        }
                                    } else if (orDefault instanceof String) {
                                        if (c2599b2.m7658D()) {
                                            C2711j2 c2711j2M7661w2 = c2599b2.m7661w();
                                            C1860k3 c1860k111 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k111);
                                            boolM5909d = AbstractC1972w7.m5910e((String) orDefault, c2711j2M7661w2, c1860k111);
                                        } else if (c2599b2.m7656B()) {
                                            str = (String) orDefault;
                                            if (C1864k7.m5714I(str)) {
                                                c2641e2M7660v = c2599b2.m7660v();
                                                if (C1864k7.m5714I(str)) {
                                                    boolM5909d = null;
                                                } else {
                                                    try {
                                                        boolM5909d = AbstractC1972w7.m5909d(new BigDecimal(str), c2641e2M7660v, 0.0d);
                                                    } catch (NumberFormatException unused4) {
                                                        boolM5909d = null;
                                                    }
                                                }
                                            } else {
                                                C1860k3 c1860k112 = ((C1897o4) interfaceC1781b5).f10086i;
                                                C1897o4.m5776k(c1860k112);
                                                c1860k112.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Invalid param value for number filter. event, param");
                                            }
                                        } else {
                                            C1860k3 c1860k113 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k113);
                                            c1860k113.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "No filter for String param. event, param");
                                        }
                                        if (boolM5909d == null) {
                                            if (boolM5909d.booleanValue() == z11) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            z12 = true;
                                        }
                                    } else {
                                        if (orDefault == null) {
                                            C1860k3 c1860k114 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k114);
                                            c1860k114.f9938I.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Missing param for filter. event, param");
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        C1860k3 c1860k115 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k115);
                                        c1860k115.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(strM7662x), "Unknown param type. event, param");
                                    }
                                }
                            }
                        } else {
                            c2656f3 = (C2656f3) it2.next();
                            if (!hashSet.contains(c2656f3.m7824z())) {
                                if (c2656f3.m7817O()) {
                                    String strM7824z3 = c2656f3.m7824z();
                                    if (c2656f3.m7817O()) {
                                        lValueOf = Long.valueOf(c2656f3.m7823w());
                                    } else {
                                        lValueOf = null;
                                    }
                                    c8446b.put(strM7824z3, lValueOf);
                                } else if (c2656f3.m7815M()) {
                                    String strM7824z4 = c2656f3.m7824z();
                                    if (c2656f3.m7815M()) {
                                        dValueOf = Double.valueOf(c2656f3.m7820t());
                                    } else {
                                        dValueOf = null;
                                    }
                                    c8446b.put(strM7824z4, dValueOf);
                                } else if (c2656f3.m7819Q()) {
                                    c8446b.put(c2656f3.m7824z(), c2656f3.m7813A());
                                } else {
                                    C1860k3 c1860k116 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k116);
                                    c1860k116.f9945i.m5625c(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), ((C1897o4) interfaceC1781b5).f10057H.m5604e(c2656f3.m7824z()), "Unknown value for param. event, param");
                                }
                            }
                        }
                    }
                } else {
                    c2599b3 = (C2599b2) it.next();
                    if (c2599b3.m7662x().isEmpty()) {
                        C1860k3 c1860k117 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k117);
                        c1860k117.f9945i.m5624b(((C1897o4) interfaceC1781b5).f10057H.m5603d(strM7674A), "null or empty param name in filter. event");
                    } else {
                        hashSet.add(c2599b3.m7662x());
                    }
                }
                bool = null;
                break;
            }
        }
        bool = Boolean.FALSE;
        C1860k3 c1860k20 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k20);
        c1860k20.f9938I.m5624b(bool == null ? "null" : bool, "Event filter result");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f10283c = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f10284d = bool2;
        if (z13 && c2600b3.m7678M()) {
            Long lValueOf2 = Long.valueOf(c2600b3.m7683w());
            if (c2922z1.m8446E()) {
                if (zM5582q && c2922z1.m8448G()) {
                    lValueOf2 = l10;
                }
                this.f10286f = lValueOf2;
            } else {
                if (zM5582q && c2922z1.m8448G()) {
                    lValueOf2 = l11;
                }
                this.f10285e = lValueOf2;
            }
        }
        return true;
    }
}
