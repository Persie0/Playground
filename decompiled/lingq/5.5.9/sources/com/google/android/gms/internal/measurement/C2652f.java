package com.google.android.gms.internal.measurement;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2652f implements Iterable, InterfaceC2790p, InterfaceC2736l {

    /* JADX INFO: renamed from: a */
    public final TreeMap f14184a;

    /* JADX INFO: renamed from: b */
    public final TreeMap f14185b;

    public C2652f() {
        this.f14184a = new TreeMap();
        this.f14185b = new TreeMap();
    }

    public C2652f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                m7780B(i10, (InterfaceC2790p) list.get(i10));
            }
        }
    }

    @RequiresNonNull({"elements"})
    /* JADX INFO: renamed from: B */
    public final void m7780B(int i10, InterfaceC2790p interfaceC2790p) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(C0166e.m761g("Out of bounds index: ", i10));
        }
        TreeMap treeMap = this.f14184a;
        if (interfaceC2790p == null) {
            treeMap.remove(Integer.valueOf(i10));
        } else {
            treeMap.put(Integer.valueOf(i10), interfaceC2790p);
        }
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7781C(int i10) {
        if (i10 >= 0) {
            TreeMap treeMap = this.f14184a;
            if (i10 <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i10));
            }
        }
        throw new IndexOutOfBoundsException(C0166e.m761g("Out of bounds index: ", i10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: a */
    public final InterfaceC2790p mo7782a() {
        C2652f c2652f = new C2652f();
        for (Map.Entry entry : this.f14184a.entrySet()) {
            boolean z10 = entry.getValue() instanceof InterfaceC2736l;
            TreeMap treeMap = c2652f.f14184a;
            if (z10) {
                treeMap.put((Integer) entry.getKey(), (InterfaceC2790p) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((InterfaceC2790p) entry.getValue()).mo7782a());
            }
        }
        return c2652f;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: e */
    public final Double mo7783e() {
        TreeMap treeMap = this.f14184a;
        if (treeMap.size() == 1) {
            return m7792s(0).mo7783e();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2652f)) {
            return false;
        }
        C2652f c2652f = (C2652f) obj;
        if (m7791q() != c2652f.m7791q()) {
            return false;
        }
        TreeMap treeMap = this.f14184a;
        if (treeMap.isEmpty()) {
            return c2652f.f14184a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m7792s(iIntValue).equals(c2652f.m7792s(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: f */
    public final String mo7784f() {
        return m7793t(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: g */
    public final boolean mo7785g(String str) {
        if (!"length".equals(str) && !this.f14185b.containsKey(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f14184a.hashCode() * 31;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: i */
    public final Boolean mo7786i() {
        return Boolean.TRUE;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2638e(this);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: l */
    public final Iterator mo7787l() {
        return new C2624d(this.f14184a.keySet().iterator(), this.f14185b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: m */
    public final void mo7788m(String str, InterfaceC2790p interfaceC2790p) {
        TreeMap treeMap = this.f14185b;
        if (interfaceC2790p == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, interfaceC2790p);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2736l
    /* JADX INFO: renamed from: o */
    public final InterfaceC2790p mo7789o(String str) {
        InterfaceC2790p interfaceC2790p;
        if ("length".equals(str)) {
            return new C2694i(Double.valueOf(m7791q()));
        }
        return (!mo7785g(str) || (interfaceC2790p = (InterfaceC2790p) this.f14185b.get(str)) == null) ? InterfaceC2790p.f14375r : interfaceC2790p;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.InterfaceC2790p
    /* JADX INFO: renamed from: p */
    public final InterfaceC2790p mo7790p(String str, C2684h3 c2684h3, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        String str5;
        Object obj;
        String str6;
        String str7;
        String str8;
        InterfaceC2790p interfaceC2790pMo7782a;
        double dM7791q;
        AbstractC2708j abstractC2708j;
        byte b10;
        String str9 = "toString";
        if ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str)) {
            str2 = "unshift";
            str3 = "filter";
            str4 = "join";
            str5 = "sort";
            obj = "splice";
            str6 = "some";
        } else if ("some".equals(str)) {
            str4 = "join";
            str5 = "sort";
            obj = "splice";
            str6 = "some";
            str2 = "unshift";
            str3 = "filter";
        } else {
            str5 = "sort";
            if (str5.equals(str)) {
                obj = "splice";
                str6 = "some";
                str2 = "unshift";
                str3 = "filter";
                str4 = "join";
            } else if ("splice".equals(str)) {
                str6 = "some";
                str2 = "unshift";
                str3 = "filter";
                str4 = "join";
                obj = "splice";
                str5 = str5;
            } else {
                str9 = str9;
                if (str9.equals(str)) {
                    str2 = "unshift";
                } else {
                    str2 = "unshift";
                    if (!str2.equals(str)) {
                        return C0062b.m259D2(this, new C2842t(str), c2684h3, arrayList);
                    }
                }
                str3 = "filter";
                str4 = "join";
                obj = "splice";
                str5 = str5;
                str6 = "some";
            }
        }
        byte b11 = -1;
        switch (str.hashCode()) {
            case -1776922004:
                str7 = str3;
                str8 = str9;
                if (str.equals(str8)) {
                    b11 = 18;
                }
                break;
            case -1354795244:
                str7 = str3;
                if (str.equals("concat")) {
                    b11 = 0;
                }
                str8 = str9;
                break;
            case -1274492040:
                str7 = str3;
                if (str.equals(str7)) {
                    b11 = 2;
                }
                str8 = str9;
                break;
            case -934873754:
                if (str.equals("reduce")) {
                    b10 = 10;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case -895859076:
                if (str.equals(obj)) {
                    b10 = 17;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case -678635926:
                if (str.equals("forEach")) {
                    b11 = 3;
                }
                str7 = str3;
                str8 = str9;
                break;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    b10 = 6;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case -277637751:
                if (str.equals(str2)) {
                    b10 = 19;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 107868:
                if (str.equals("map")) {
                    b10 = 7;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 111185:
                if (str.equals("pop")) {
                    b10 = 8;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 3267882:
                if (str.equals(str4)) {
                    b10 = 5;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 3452698:
                if (str.equals("push")) {
                    b10 = 9;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 3536116:
                if (str.equals(str6)) {
                    b10 = 15;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 3536286:
                if (str.equals(str5)) {
                    b10 = 16;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 96891675:
                if (str.equals("every")) {
                    b11 = 1;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 109407362:
                if (str.equals("shift")) {
                    b10 = 13;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 109526418:
                if (str.equals("slice")) {
                    b10 = 14;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 965561430:
                if (str.equals("reduceRight")) {
                    b10 = 11;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 1099846370:
                if (str.equals("reverse")) {
                    b10 = 12;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            case 1943291465:
                if (str.equals("indexOf")) {
                    b10 = 4;
                    b11 = b10;
                }
                str7 = str3;
                str8 = str9;
                break;
            default:
                str7 = str3;
                str8 = str9;
                break;
        }
        C2855u c2855u = InterfaceC2790p.f14375r;
        String strMo7784f = ",";
        TreeMap treeMap = this.f14184a;
        C2666g c2666g = InterfaceC2790p.f14381x;
        C2666g c2666g2 = InterfaceC2790p.f14380w;
        String str10 = str7;
        String str11 = str4;
        double dM7791q2 = 0.0d;
        switch (b11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                interfaceC2790pMo7782a = mo7782a();
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        InterfaceC2790p interfaceC2790pM7863b = c2684h3.m7863b((InterfaceC2790p) it.next());
                        if (interfaceC2790pM7863b instanceof C2680h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        C2652f c2652f = (C2652f) interfaceC2790pMo7782a;
                        int iM7791q = c2652f.m7791q();
                        if (interfaceC2790pM7863b instanceof C2652f) {
                            C2652f c2652f2 = (C2652f) interfaceC2790pM7863b;
                            Iterator itM7794u = c2652f2.m7794u();
                            while (itM7794u.hasNext()) {
                                Integer num = (Integer) itM7794u.next();
                                c2652f.m7780B(num.intValue() + iM7791q, c2652f2.m7792s(num.intValue()));
                            }
                        } else {
                            c2652f.m7780B(iM7791q, interfaceC2790pM7863b);
                        }
                    }
                }
                return interfaceC2790pMo7782a;
            case 1:
                C2601b4.m7692h(1, "every", arrayList);
                InterfaceC2790p interfaceC2790pM7863b2 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                if (!(interfaceC2790pM7863b2 instanceof C2777o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (m7791q() == 0 || C2630d5.m7750c(this, c2684h3, (C2777o) interfaceC2790pM7863b2, Boolean.FALSE, Boolean.TRUE).m7791q() == m7791q()) {
                    return c2666g2;
                }
                return c2666g;
            case 2:
                C2601b4.m7692h(1, str10, arrayList);
                InterfaceC2790p interfaceC2790pM7863b3 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                if (!(interfaceC2790pM7863b3 instanceof C2777o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (treeMap.size() == 0) {
                    return new C2652f();
                }
                InterfaceC2790p interfaceC2790pMo7782a2 = mo7782a();
                C2652f c2652fM7750c = C2630d5.m7750c(this, c2684h3, (C2777o) interfaceC2790pM7863b3, null, Boolean.TRUE);
                C2652f c2652f3 = new C2652f();
                Iterator itM7794u2 = c2652fM7750c.m7794u();
                while (itM7794u2.hasNext()) {
                    c2652f3.m7780B(c2652f3.m7791q(), ((C2652f) interfaceC2790pMo7782a2).m7792s(((Integer) itM7794u2.next()).intValue()));
                }
                return c2652f3;
            case 3:
                C2601b4.m7692h(1, "forEach", arrayList);
                InterfaceC2790p interfaceC2790pM7863b4 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                if (!(interfaceC2790pM7863b4 instanceof C2777o)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (treeMap.size() != 0) {
                    C2630d5.m7750c(this, c2684h3, (C2777o) interfaceC2790pM7863b4, null, null);
                }
                return c2855u;
            case 4:
                C2601b4.m7694j(2, "indexOf", arrayList);
                InterfaceC2790p interfaceC2790pM7863b5 = !arrayList.isEmpty() ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)) : c2855u;
                if (arrayList.size() > 1) {
                    double dM7685a = C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                    if (dM7685a >= m7791q()) {
                        return new C2694i(Double.valueOf(-1.0d));
                    }
                    dM7791q2 = dM7685a < 0.0d ? ((double) m7791q()) + dM7685a : dM7685a;
                }
                Iterator itM7794u3 = m7794u();
                while (itM7794u3.hasNext()) {
                    int iIntValue = ((Integer) itM7794u3.next()).intValue();
                    double d10 = iIntValue;
                    if (d10 >= dM7791q2 && C2601b4.m7696l(m7792s(iIntValue), interfaceC2790pM7863b5)) {
                        return new C2694i(Double.valueOf(d10));
                    }
                }
                return new C2694i(Double.valueOf(-1.0d));
            case 5:
                C2601b4.m7694j(1, str11, arrayList);
                if (m7791q() == 0) {
                    return InterfaceC2790p.f14382y;
                }
                if (!arrayList.isEmpty()) {
                    InterfaceC2790p interfaceC2790pM7863b6 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                    strMo7784f = ((interfaceC2790pM7863b6 instanceof C2764n) || (interfaceC2790pM7863b6 instanceof C2855u)) ? "" : interfaceC2790pM7863b6.mo7784f();
                }
                return new C2842t(m7793t(strMo7784f));
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C2601b4.m7694j(2, "lastIndexOf", arrayList);
                InterfaceC2790p interfaceC2790pM7863b7 = !arrayList.isEmpty() ? c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)) : c2855u;
                int iM7791q2 = m7791q() - 1;
                if (arrayList.size() > 1) {
                    InterfaceC2790p interfaceC2790pM7863b8 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(1));
                    dM7791q = Double.isNaN(interfaceC2790pM7863b8.mo7783e().doubleValue()) ? m7791q() - 1 : C2601b4.m7685a(interfaceC2790pM7863b8.mo7783e().doubleValue());
                    if (dM7791q < 0.0d) {
                        dM7791q += (double) m7791q();
                    }
                } else {
                    dM7791q = iM7791q2;
                }
                if (dM7791q < 0.0d) {
                    return new C2694i(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(m7791q(), dM7791q); iMin >= 0; iMin--) {
                    if (m7781C(iMin) && C2601b4.m7696l(m7792s(iMin), interfaceC2790pM7863b7)) {
                        return new C2694i(Double.valueOf(iMin));
                    }
                }
                return new C2694i(Double.valueOf(-1.0d));
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C2601b4.m7692h(1, "map", arrayList);
                InterfaceC2790p interfaceC2790pM7863b9 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                if (interfaceC2790pM7863b9 instanceof C2777o) {
                    return m7791q() == 0 ? new C2652f() : C2630d5.m7750c(this, c2684h3, (C2777o) interfaceC2790pM7863b9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case 8:
                C2601b4.m7692h(0, "pop", arrayList);
                int iM7791q3 = m7791q();
                if (iM7791q3 != 0) {
                    int i10 = iM7791q3 - 1;
                    interfaceC2790pMo7782a = m7792s(i10);
                    m7796y(i10);
                    return interfaceC2790pMo7782a;
                }
                return c2855u;
            case 9:
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        m7780B(m7791q(), c2684h3.m7863b((InterfaceC2790p) it2.next()));
                    }
                }
                return new C2694i(Double.valueOf(m7791q()));
            case 10:
                return C2630d5.m7751d(this, c2684h3, arrayList, true);
            case 11:
                return C2630d5.m7751d(this, c2684h3, arrayList, false);
            case 12:
                C2601b4.m7692h(0, "reverse", arrayList);
                int iM7791q4 = m7791q();
                if (iM7791q4 != 0) {
                    for (int i11 = 0; i11 < iM7791q4 / 2; i11++) {
                        if (m7781C(i11)) {
                            InterfaceC2790p interfaceC2790pM7792s = m7792s(i11);
                            m7780B(i11, null);
                            int i12 = (iM7791q4 - 1) - i11;
                            if (m7781C(i12)) {
                                m7780B(i11, m7792s(i12));
                            }
                            m7780B(i12, interfaceC2790pM7792s);
                        }
                    }
                }
                return this;
            case 13:
                C2601b4.m7692h(0, "shift", arrayList);
                if (m7791q() != 0) {
                    interfaceC2790pMo7782a = m7792s(0);
                    m7796y(0);
                    return interfaceC2790pMo7782a;
                }
                return c2855u;
            case 14:
                C2601b4.m7694j(2, "slice", arrayList);
                if (arrayList.isEmpty()) {
                    return mo7782a();
                }
                double dM7791q3 = m7791q();
                double dM7685a2 = C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                double dMax = dM7685a2 < 0.0d ? Math.max(dM7685a2 + dM7791q3, 0.0d) : Math.min(dM7685a2, dM7791q3);
                if (arrayList.size() == 2) {
                    double dM7685a3 = C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue());
                    dM7791q3 = dM7685a3 < 0.0d ? Math.max(dM7791q3 + dM7685a3, 0.0d) : Math.min(dM7791q3, dM7685a3);
                }
                C2652f c2652f4 = new C2652f();
                for (int i13 = (int) dMax; i13 < dM7791q3; i13++) {
                    c2652f4.m7780B(c2652f4.m7791q(), m7792s(i13));
                }
                return c2652f4;
            case 15:
                C2601b4.m7692h(1, str6, arrayList);
                InterfaceC2790p interfaceC2790pM7863b10 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                if (!(interfaceC2790pM7863b10 instanceof AbstractC2708j)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (m7791q() != 0) {
                    AbstractC2708j abstractC2708j2 = (AbstractC2708j) interfaceC2790pM7863b10;
                    Iterator itM7794u4 = m7794u();
                    while (itM7794u4.hasNext()) {
                        int iIntValue2 = ((Integer) itM7794u4.next()).intValue();
                        if (m7781C(iIntValue2) && abstractC2708j2.mo7646b(c2684h3, Arrays.asList(m7792s(iIntValue2), new C2694i(Double.valueOf(iIntValue2)), this)).mo7786i().booleanValue()) {
                            c2666g = c2666g2;
                        }
                    }
                }
                return c2666g;
            case 16:
                C2601b4.m7694j(1, str5, arrayList);
                if (m7791q() >= 2) {
                    ArrayList arrayListM7795v = m7795v();
                    if (arrayList.isEmpty()) {
                        abstractC2708j = null;
                    } else {
                        InterfaceC2790p interfaceC2790pM7863b11 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(0));
                        if (!(interfaceC2790pM7863b11 instanceof AbstractC2708j)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC2708j = (AbstractC2708j) interfaceC2790pM7863b11;
                    }
                    Collections.sort(arrayListM7795v, new C2583a0(abstractC2708j, c2684h3));
                    treeMap.clear();
                    Iterator it3 = arrayListM7795v.iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        m7780B(i14, (InterfaceC2790p) it3.next());
                        i14++;
                    }
                }
                return this;
            case 17:
                if (arrayList.isEmpty()) {
                    return new C2652f();
                }
                int iM7685a = (int) C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(0)).mo7783e().doubleValue());
                if (iM7685a < 0) {
                    iM7685a = Math.max(0, m7791q() + iM7685a);
                } else if (iM7685a > m7791q()) {
                    iM7685a = m7791q();
                }
                int iM7791q5 = m7791q();
                C2652f c2652f5 = new C2652f();
                if (arrayList.size() > 1) {
                    int iMax = Math.max(0, (int) C2601b4.m7685a(c2684h3.m7863b((InterfaceC2790p) arrayList.get(1)).mo7783e().doubleValue()));
                    if (iMax > 0) {
                        for (int i15 = iM7685a; i15 < Math.min(iM7791q5, iM7685a + iMax); i15++) {
                            c2652f5.m7780B(c2652f5.m7791q(), m7792s(iM7685a));
                            m7796y(iM7685a);
                        }
                    }
                    if (arrayList.size() > 2) {
                        for (int i16 = 2; i16 < arrayList.size(); i16++) {
                            InterfaceC2790p interfaceC2790pM7863b12 = c2684h3.m7863b((InterfaceC2790p) arrayList.get(i16));
                            if (interfaceC2790pM7863b12 instanceof C2680h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            int i17 = (iM7685a + i16) - 2;
                            if (i17 < 0) {
                                throw new IllegalArgumentException(C0166e.m761g("Invalid value index: ", i17));
                            }
                            if (i17 >= m7791q()) {
                                m7780B(i17, interfaceC2790pM7863b12);
                            } else {
                                for (int iIntValue3 = ((Integer) treeMap.lastKey()).intValue(); iIntValue3 >= i17; iIntValue3--) {
                                    Integer numValueOf = Integer.valueOf(iIntValue3);
                                    InterfaceC2790p interfaceC2790p = (InterfaceC2790p) treeMap.get(numValueOf);
                                    if (interfaceC2790p != null) {
                                        m7780B(iIntValue3 + 1, interfaceC2790p);
                                        treeMap.remove(numValueOf);
                                    }
                                }
                                m7780B(i17, interfaceC2790pM7863b12);
                            }
                        }
                    }
                } else {
                    while (iM7685a < iM7791q5) {
                        c2652f5.m7780B(c2652f5.m7791q(), m7792s(iM7685a));
                        m7780B(iM7685a, null);
                        iM7685a++;
                    }
                }
                return c2652f5;
            case 18:
                C2601b4.m7692h(0, str8, arrayList);
                return new C2842t(m7793t(","));
            case 19:
                if (!arrayList.isEmpty()) {
                    C2652f c2652f6 = new C2652f();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        InterfaceC2790p interfaceC2790pM7863b13 = c2684h3.m7863b((InterfaceC2790p) it4.next());
                        if (interfaceC2790pM7863b13 instanceof C2680h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c2652f6.m7780B(c2652f6.m7791q(), interfaceC2790pM7863b13);
                    }
                    int iM7791q6 = c2652f6.m7791q();
                    Iterator itM7794u5 = m7794u();
                    while (itM7794u5.hasNext()) {
                        Integer num2 = (Integer) itM7794u5.next();
                        c2652f6.m7780B(num2.intValue() + iM7791q6, m7792s(num2.intValue()));
                    }
                    treeMap.clear();
                    Iterator itM7794u6 = c2652f6.m7794u();
                    while (itM7794u6.hasNext()) {
                        Integer num3 = (Integer) itM7794u6.next();
                        m7780B(num3.intValue(), c2652f6.m7792s(num3.intValue()));
                    }
                }
                return new C2694i(Double.valueOf(m7791q()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m7791q() {
        TreeMap treeMap = this.f14184a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC2790p m7792s(int i10) {
        InterfaceC2790p interfaceC2790p;
        if (i10 < m7791q()) {
            return (!m7781C(i10) || (interfaceC2790p = (InterfaceC2790p) this.f14184a.get(Integer.valueOf(i10))) == null) ? InterfaceC2790p.f14375r : interfaceC2790p;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    /* JADX INFO: renamed from: t */
    public final String m7793t(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f14184a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= m7791q()) {
                    break;
                }
                InterfaceC2790p interfaceC2790pM7792s = m7792s(i10);
                sb2.append(str2);
                if (!(interfaceC2790pM7792s instanceof C2855u) && !(interfaceC2790pM7792s instanceof C2764n)) {
                    sb2.append(interfaceC2790pM7792s.mo7784f());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    public final String toString() {
        return m7793t(",");
    }

    /* JADX INFO: renamed from: u */
    public final Iterator m7794u() {
        return this.f14184a.keySet().iterator();
    }

    /* JADX INFO: renamed from: v */
    public final ArrayList m7795v() {
        ArrayList arrayList = new ArrayList(m7791q());
        for (int i10 = 0; i10 < m7791q(); i10++) {
            arrayList.add(m7792s(i10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public final void m7796y(int i10) {
        TreeMap treeMap = this.f14184a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (treeMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            treeMap.put(numValueOf, InterfaceC2790p.f14375r);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC2790p interfaceC2790p = (InterfaceC2790p) treeMap.get(numValueOf2);
            if (interfaceC2790p != null) {
                treeMap.put(Integer.valueOf(i10 - 1), interfaceC2790p);
                treeMap.remove(numValueOf2);
            }
        }
    }
}
