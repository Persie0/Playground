package cc;

import ae.C0062b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C2585a2;
import com.google.android.gms.internal.measurement.C2591a8;
import com.google.android.gms.internal.measurement.C2599b2;
import com.google.android.gms.internal.measurement.C2655f2;
import com.google.android.gms.internal.measurement.C2669g2;
import com.google.android.gms.internal.measurement.C2721jc;
import com.google.android.gms.internal.measurement.C2753m2;
import com.google.android.gms.internal.measurement.C2765n0;
import com.google.android.gms.internal.measurement.C2767n2;
import com.google.android.gms.internal.measurement.C2780o2;
import com.google.android.gms.internal.measurement.C2793p2;
import com.google.android.gms.internal.measurement.C2806q2;
import com.google.android.gms.internal.measurement.C2845t2;
import com.google.android.gms.internal.measurement.C2883w1;
import com.google.android.gms.internal.measurement.C2885w3;
import com.google.android.gms.internal.measurement.C2896x1;
import com.google.android.gms.internal.measurement.C2898x3;
import com.google.android.gms.internal.measurement.C2909y1;
import com.google.android.gms.internal.measurement.C2922z1;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzll;
import dm.C5212l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import p176ib.C6272i;
import p326q.C8446b;
import p338qd.C8573r0;
import p387t0.C9166r;

/* JADX INFO: renamed from: cc.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1834h4 extends AbstractC1774a7 implements InterfaceC1793d {

    /* JADX INFO: renamed from: H */
    public final C8446b f9838H;

    /* JADX INFO: renamed from: I */
    public final C8446b f9839I;

    /* JADX INFO: renamed from: d */
    public final C8446b f9840d;

    /* JADX INFO: renamed from: e */
    public final C8446b f9841e;

    /* JADX INFO: renamed from: f */
    public final C8446b f9842f;

    /* JADX INFO: renamed from: g */
    public final C8446b f9843g;

    /* JADX INFO: renamed from: h */
    public final C8446b f9844h;

    /* JADX INFO: renamed from: i */
    public final C8446b f9845i;

    /* JADX INFO: renamed from: j */
    public final C1825g4 f9846j;

    /* JADX INFO: renamed from: k */
    public final C9166r f9847k;

    /* JADX INFO: renamed from: l */
    public final C8446b f9848l;

    public C1834h4(C1846i7 c1846i7) {
        super(c1846i7);
        this.f9840d = new C8446b();
        this.f9841e = new C8446b();
        this.f9842f = new C8446b();
        this.f9843g = new C8446b();
        this.f9844h = new C8446b();
        this.f9848l = new C8446b();
        this.f9838H = new C8446b();
        this.f9839I = new C8446b();
        this.f9845i = new C8446b();
        this.f9846j = new C1825g4(this);
        this.f9847k = new C9166r(this);
    }

    /* JADX INFO: renamed from: p */
    public static final C8446b m5612p(C2806q2 c2806q2) {
        C8446b c8446b = new C8446b();
        for (C2845t2 c2845t2 : c2806q2.m8171H()) {
            c8446b.put(c2845t2.m8255u(), c2845t2.m8256v());
        }
        return c8446b;
    }

    @Override // cc.InterfaceC1793d
    /* JADX INFO: renamed from: i */
    public final String mo5570i(String str, String str2) throws Throwable {
        mo5748g();
        m5615n(str);
        Map map = (Map) this.f9840d.getOrDefault(str, null);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    /* JADX INFO: renamed from: l */
    public final C2806q2 m5613l(String str, byte[] bArr) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (bArr == null) {
            return C2806q2.m8163z();
        }
        try {
            C2806q2 c2806q2 = (C2806q2) ((C2793p2) C1864k7.m5726z(C2806q2.m8161x(), bArr)).m7897h();
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            C1842i3 c1842i3 = c1860k3.f9938I;
            String strM8164A = null;
            Long lValueOf = c2806q2.m8174M() ? Long.valueOf(c2806q2.m8177v()) : null;
            if (c2806q2.m8173L()) {
                strM8164A = c2806q2.m8164A();
            }
            c1842i3.m5625c(lValueOf, strM8164A, "Parsed config. version, gmp_app_id");
            return c2806q2;
        } catch (zzll e10) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9945i.m5625c(C1860k3.m5700q(str), e10, "Unable to merge remote config. appId");
            return C2806q2.m8163z();
        } catch (RuntimeException e11) {
            C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9945i.m5625c(C1860k3.m5700q(str), e11, "Unable to merge remote config. appId");
            return C2806q2.m8163z();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5614m(String str, C2793p2 c2793p2) {
        HashSet hashSet = new HashSet();
        C8446b c8446b = new C8446b();
        C8446b c8446b2 = new C8446b();
        C8446b c8446b3 = new C8446b();
        Iterator it = Collections.unmodifiableList(((C2806q2) c2793p2.f14271b).m8169F()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C2753m2) it.next()).m8062u());
        }
        for (int i10 = 0; i10 < ((C2806q2) c2793p2.f14271b).m8176u(); i10++) {
            C2767n2 c2767n2 = (C2767n2) ((C2806q2) c2793p2.f14271b).m8178w(i10).m8086j();
            boolean zIsEmpty = c2767n2.m8074k().isEmpty();
            InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
            if (zIsEmpty) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5623a("EventConfig contained null event name");
            } else {
                String strM8074k = c2767n2.m8074k();
                String strM16751q1 = C8573r0.m16751q1(c2767n2.m8074k(), C5212l.f33283b, C5212l.f33285d);
                if (!TextUtils.isEmpty(strM16751q1)) {
                    c2767n2.m7899j();
                    C2780o2.m8138w((C2780o2) c2767n2.f14271b, strM16751q1);
                    c2793p2.m7899j();
                    C2806q2.m8159I((C2806q2) c2793p2.f14271b, i10, (C2780o2) c2767n2.m7897h());
                }
                if (((C2780o2) c2767n2.f14271b).m8145z() && ((C2780o2) c2767n2.f14271b).m8143x()) {
                    c8446b.put(strM8074k, Boolean.TRUE);
                }
                if (((C2780o2) c2767n2.f14271b).m8139A() && ((C2780o2) c2767n2.f14271b).m8144y()) {
                    c8446b2.put(c2767n2.m8074k(), Boolean.TRUE);
                }
                if (((C2780o2) c2767n2.f14271b).m8140B()) {
                    if (((C2780o2) c2767n2.f14271b).m8141t() < 2 || ((C2780o2) c2767n2.f14271b).m8141t() > 65535) {
                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9945i.m5625c(c2767n2.m8074k(), Integer.valueOf(((C2780o2) c2767n2.f14271b).m8141t()), "Invalid sampling rate. Event name, sample rate");
                    } else {
                        c8446b3.put(c2767n2.m8074k(), Integer.valueOf(((C2780o2) c2767n2.f14271b).m8141t()));
                    }
                }
            }
        }
        this.f9841e.put(str, hashSet);
        this.f9842f.put(str, c8446b);
        this.f9843g.put(str, c8446b2);
        this.f9845i.put(str, c8446b3);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:35:0x0146  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0143: MOVE (r1 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:33:0x0143 */
    /* JADX INFO: renamed from: n */
    public final void m5615n(String str) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        C1820g c1820g;
        C8446b c8446b;
        C8446b c8446b2;
        C8446b c8446b3;
        C8446b c8446b4;
        m5494h();
        mo5748g();
        C6272i.m12912f(str);
        C8446b c8446b5 = this.f9844h;
        Cursor cursor2 = null;
        if (c8446b5.getOrDefault(str, null) == 0) {
            C1847j c1847j = this.f10436b.f9893c;
            C1846i7.m5629H(c1847j);
            InterfaceC1781b5 interfaceC1781b5 = c1847j.f10430a;
            C6272i.m12912f(str);
            c1847j.mo5748g();
            c1847j.m5494h();
            try {
                try {
                    cursorQuery = c1847j.m5667A().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            String string = cursorQuery.getString(1);
                            String string2 = cursorQuery.getString(2);
                            if (cursorQuery.moveToNext()) {
                                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                                C1897o4.m5776k(c1860k3);
                                c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Got multiple records for app config, expected one. appId");
                            }
                            if (blob != null) {
                                c1820g = new C1820g(string, string2, blob);
                                cursorQuery.close();
                            }
                            c8446b = this.f9839I;
                            c8446b2 = this.f9838H;
                            c8446b3 = this.f9848l;
                            c8446b4 = this.f9840d;
                            if (c1820g != null) {
                                C2793p2 c2793p2 = (C2793p2) m5613l(str, c1820g.f9808a).m8086j();
                                m5614m(str, c2793p2);
                                c8446b4.put(str, m5612p((C2806q2) c2793p2.m7897h()));
                                c8446b5.put(str, (C2806q2) c2793p2.m7897h());
                                m5616o(str, (C2806q2) c2793p2.m7897h());
                                c8446b3.put(str, ((C2806q2) c2793p2.f14271b).m8167D());
                                c8446b2.put(str, c1820g.f9809b);
                                c8446b.put(str, c1820g.f9810c);
                                return;
                            }
                            c8446b4.put(str, null);
                            this.f9842f.put(str, null);
                            this.f9841e.put(str, null);
                            this.f9843g.put(str, null);
                            c8446b5.put(str, null);
                            c8446b3.put(str, null);
                            c8446b2.put(str, null);
                            c8446b.put(str, null);
                            this.f9845i.put(str, null);
                        }
                    } catch (SQLiteException e10) {
                        e = e10;
                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e, "Error querying remote config. appId");
                        if (cursorQuery != null) {
                        }
                        c1820g = null;
                        c8446b = this.f9839I;
                        c8446b2 = this.f9838H;
                        c8446b3 = this.f9848l;
                        c8446b4 = this.f9840d;
                        if (c1820g != null) {
                            C2793p2 c2793p3 = (C2793p2) m5613l(str, c1820g.f9808a).m8086j();
                            m5614m(str, c2793p3);
                            c8446b4.put(str, m5612p((C2806q2) c2793p3.m7897h()));
                            c8446b5.put(str, (C2806q2) c2793p3.m7897h());
                            m5616o(str, (C2806q2) c2793p3.m7897h());
                            c8446b3.put(str, ((C2806q2) c2793p3.f14271b).m8167D());
                            c8446b2.put(str, c1820g.f9809b);
                            c8446b.put(str, c1820g.f9810c);
                            return;
                        }
                        c8446b4.put(str, null);
                        this.f9842f.put(str, null);
                        this.f9841e.put(str, null);
                        this.f9843g.put(str, null);
                        c8446b5.put(str, null);
                        c8446b3.put(str, null);
                        c8446b2.put(str, null);
                        c8446b.put(str, null);
                        this.f9845i.put(str, null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                cursorQuery = null;
            } catch (Throwable th3) {
                th = th3;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
            cursorQuery.close();
            c1820g = null;
            c8446b = this.f9839I;
            c8446b2 = this.f9838H;
            c8446b3 = this.f9848l;
            c8446b4 = this.f9840d;
            if (c1820g != null) {
                C2793p2 c2793p4 = (C2793p2) m5613l(str, c1820g.f9808a).m8086j();
                m5614m(str, c2793p4);
                c8446b4.put(str, m5612p((C2806q2) c2793p4.m7897h()));
                c8446b5.put(str, (C2806q2) c2793p4.m7897h());
                m5616o(str, (C2806q2) c2793p4.m7897h());
                c8446b3.put(str, ((C2806q2) c2793p4.f14271b).m8167D());
                c8446b2.put(str, c1820g.f9809b);
                c8446b.put(str, c1820g.f9810c);
                return;
            }
            c8446b4.put(str, null);
            this.f9842f.put(str, null);
            this.f9841e.put(str, null);
            this.f9843g.put(str, null);
            c8446b5.put(str, null);
            c8446b3.put(str, null);
            c8446b2.put(str, null);
            c8446b.put(str, null);
            this.f9845i.put(str, null);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: o */
    public final void m5616o(final String str, C2806q2 c2806q2) {
        if (c2806q2.m8175t() == 0) {
            C1825g4 c1825g4 = this.f9846j;
            if (str == null) {
                c1825g4.getClass();
                throw new NullPointerException("key == null");
            }
            synchronized (c1825g4) {
                if (c1825g4.f45593a.remove(str) != null) {
                    c1825g4.f45594b--;
                }
            }
            return;
        }
        C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5624b(Integer.valueOf(c2806q2.m8175t()), "EES programs found");
        C2898x3 c2898x3 = (C2898x3) c2806q2.m8170G().get(0);
        try {
            C2765n0 c2765n0 = new C2765n0();
            c2765n0.f14321a.f14287d.f14251a.put("internal.remoteConfig", new CallableC1810e7(this, str));
            c2765n0.f14321a.f14287d.f14251a.put("internal.appMetadata", new Callable() { // from class: cc.e4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2591a8(new CallableC1969w4(str, 1, this.f9771a));
                }
            });
            c2765n0.f14321a.f14287d.f14251a.put("internal.logger", new Callable() { // from class: cc.f4
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C2721jc(this.f9797a.f9847k);
                }
            });
            c2765n0.m8072a(c2898x3);
            this.f9846j.m16517c(str, c2765n0);
            C1860k3 c1860k4 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9938I.m5625c(str, Integer.valueOf(c2898x3.m8409t().m8304t()), "EES program loaded for appId, activities");
            for (C2885w3 c2885w3 : c2898x3.m8409t().m8305w()) {
                C1860k3 c1860k5 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k5);
                c1860k5.f9938I.m5624b(c2885w3.m8328u(), "EES program activity");
            }
        } catch (zzd unused) {
            C1860k3 c1860k6 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k6);
            c1860k6.f9942f.m5624b(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: q */
    public final int m5617q(String str, String str2) throws Throwable {
        Integer num;
        mo5748g();
        m5615n(str);
        Map map = (Map) this.f9845i.getOrDefault(str, null);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final C2806q2 m5618r(String str) throws Throwable {
        m5494h();
        mo5748g();
        C6272i.m12912f(str);
        m5615n(str);
        return (C2806q2) this.f9844h.getOrDefault(str, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public final boolean m5619s(String str) {
        C2806q2 c2806q2;
        return (TextUtils.isEmpty(str) || (c2806q2 = (C2806q2) this.f9844h.getOrDefault(str, null)) == null || c2806q2.m8175t() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5620t(String str, String str2) throws Throwable {
        Boolean bool;
        mo5748g();
        m5615n(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f9843g.getOrDefault(str, null);
        if (map != null && (bool = (Boolean) map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m5621u(String str, String str2) throws Throwable {
        Boolean bool;
        mo5748g();
        m5615n(str);
        if ("1".equals(mo5570i(str, "measurement.upload.blacklist_internal")) && C1900o7.m5792V(str2)) {
            return true;
        }
        if ("1".equals(mo5570i(str, "measurement.upload.blacklist_public")) && C1900o7.m5793W(str2)) {
            return true;
        }
        Map map = (Map) this.f9842f.getOrDefault(str, null);
        if (map != null && (bool = (Boolean) map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: renamed from: v */
    public final void m5622v(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        InterfaceC1781b5 interfaceC1781b5;
        C2793p2 c2793p2;
        byte[] bArrM8066g;
        String str4;
        C2793p2 c2793p3;
        C8446b c8446b;
        boolean z10;
        m5494h();
        mo5748g();
        C6272i.m12912f(str);
        C2793p2 c2793p4 = (C2793p2) m5613l(str, bArr).m8086j();
        m5614m(str, c2793p4);
        m5616o(str, (C2806q2) c2793p4.m7897h());
        C8446b c8446b2 = this.f9844h;
        c8446b2.put(str, (C2806q2) c2793p4.m7897h());
        this.f9848l.put(str, ((C2806q2) c2793p4.f14271b).m8167D());
        this.f9838H.put(str, str2);
        this.f9839I.put(str, str3);
        this.f9840d.put(str, m5612p((C2806q2) c2793p4.m7897h()));
        C1846i7 c1846i7 = this.f10436b;
        C1847j c1847j = c1846i7.f9893c;
        C1846i7.m5629H(c1847j);
        ArrayList<C2896x1> arrayList = new ArrayList(Collections.unmodifiableList(((C2806q2) c2793p4.f14271b).m8168E()));
        String str5 = "app_id=? and audience_id=?";
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C2883w1 c2883w1 = (C2883w1) ((C2896x1) arrayList.get(i10)).m8086j();
            if (((C2896x1) c2883w1.f14271b).m8390u() != 0) {
                int i11 = 0;
                while (true) {
                    c8446b = c8446b2;
                    if (i11 >= ((C2896x1) c2883w1.f14271b).m8390u()) {
                        break;
                    }
                    C2909y1 c2909y1 = (C2909y1) ((C2896x1) c2883w1.f14271b).m8392x(i11).m8086j();
                    C2909y1 c2909y2 = (C2909y1) c2909y1.clone();
                    C1846i7 c1846i8 = c1846i7;
                    String strM16751q1 = C8573r0.m16751q1(((C2922z1) c2909y1.f14271b).m8455z(), C5212l.f33283b, C5212l.f33285d);
                    if (strM16751q1 != null) {
                        c2909y2.m7899j();
                        C2922z1.m8440B((C2922z1) c2909y2.f14271b, strM16751q1);
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = 0;
                    while (i12 < ((C2922z1) c2909y1.f14271b).m8451t()) {
                        C2599b2 c2599b2M8453x = ((C2922z1) c2909y1.f14271b).m8453x(i12);
                        C2909y1 c2909y3 = c2909y1;
                        C2793p2 c2793p5 = c2793p4;
                        String str6 = str5;
                        String strM16751q2 = C8573r0.m16751q1(c2599b2M8453x.m7662x(), C0062b.f155b, C0062b.f156c);
                        if (strM16751q2 != null) {
                            C2585a2 c2585a2 = (C2585a2) c2599b2M8453x.m8086j();
                            c2585a2.m7899j();
                            C2599b2.m7654y((C2599b2) c2585a2.f14271b, strM16751q2);
                            C2599b2 c2599b2 = (C2599b2) c2585a2.m7897h();
                            c2909y2.m7899j();
                            C2922z1.m8441C((C2922z1) c2909y2.f14271b, i12, c2599b2);
                            z11 = true;
                        }
                        i12++;
                        c2909y1 = c2909y3;
                        c2793p4 = c2793p5;
                        str5 = str6;
                    }
                    C2793p2 c2793p6 = c2793p4;
                    String str7 = str5;
                    if (z11) {
                        c2883w1.m7899j();
                        C2896x1.m8385C((C2896x1) c2883w1.f14271b, i11, (C2922z1) c2909y2.m7897h());
                        arrayList.set(i10, (C2896x1) c2883w1.m7897h());
                    }
                    i11++;
                    c8446b2 = c8446b;
                    c1846i7 = c1846i8;
                    c2793p4 = c2793p6;
                    str5 = str7;
                }
                c2793p3 = c2793p4;
            } else {
                c2793p3 = c2793p4;
                c8446b = c8446b2;
            }
            C1846i7 c1846i9 = c1846i7;
            String str8 = str5;
            if (((C2896x1) c2883w1.f14271b).m8391v() != 0) {
                for (int i13 = 0; i13 < ((C2896x1) c2883w1.f14271b).m8391v(); i13++) {
                    C2669g2 c2669g2M8393y = ((C2896x1) c2883w1.f14271b).m8393y(i13);
                    String strM16751q3 = C8573r0.m16751q1(c2669g2M8393y.m7840x(), C8573r0.f45967d, C8573r0.f45968e);
                    if (strM16751q3 != null) {
                        C2655f2 c2655f2 = (C2655f2) c2669g2M8393y.m8086j();
                        c2655f2.m7899j();
                        C2669g2.m7833y((C2669g2) c2655f2.f14271b, strM16751q3);
                        c2883w1.m7899j();
                        C2896x1.m8384B((C2896x1) c2883w1.f14271b, i13, (C2669g2) c2655f2.m7897h());
                        arrayList.set(i10, (C2896x1) c2883w1.m7897h());
                    }
                }
            }
            i10++;
            c8446b2 = c8446b;
            c1846i7 = c1846i9;
            c2793p4 = c2793p3;
            str5 = str8;
        }
        C2793p2 c2793p7 = c2793p4;
        C8446b c8446b3 = c8446b2;
        C1846i7 c1846i10 = c1846i7;
        String str9 = str5;
        c1847j.m5494h();
        c1847j.mo5748g();
        C6272i.m12912f(str);
        SQLiteDatabase sQLiteDatabaseM5667A = c1847j.m5667A();
        sQLiteDatabaseM5667A.beginTransaction();
        try {
            c1847j.m5494h();
            c1847j.mo5748g();
            C6272i.m12912f(str);
            SQLiteDatabase sQLiteDatabaseM5667A2 = c1847j.m5667A();
            sQLiteDatabaseM5667A2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM5667A2.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                interfaceC1781b5 = c1847j.f10430a;
                if (!zHasNext) {
                    break;
                }
                try {
                    C2896x1 c2896x1 = (C2896x1) it.next();
                    c1847j.m5494h();
                    c1847j.mo5748g();
                    C6272i.m12912f(str);
                    C6272i.m12915i(c2896x1);
                    if (c2896x1.m8388D()) {
                        int iM8389t = c2896x1.m8389t();
                        Iterator it2 = c2896x1.m8394z().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!((C2922z1) it2.next()).m8449H()) {
                                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k3);
                                    c1860k3.f9945i.m5625c(C1860k3.m5700q(str), Integer.valueOf(iM8389t), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                                    break;
                                }
                            } else {
                                Iterator it3 = c2896x1.m8387A().iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!((C2669g2) it3.next()).m7836C()) {
                                            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                                            C1897o4.m5776k(c1860k4);
                                            c1860k4.f9945i.m5625c(C1860k3.m5700q(str), Integer.valueOf(iM8389t), "Property filter with no ID. Audience definition ignored. appId, audienceId");
                                            break;
                                        }
                                    } else {
                                        Iterator it4 = c2896x1.m8394z().iterator();
                                        while (true) {
                                            Iterator it5 = it;
                                            String str10 = "app_id";
                                            try {
                                                if (!it4.hasNext()) {
                                                    sQLiteDatabase = sQLiteDatabaseM5667A;
                                                    Iterator it6 = c2896x1.m8387A().iterator();
                                                    while (true) {
                                                        if (it6.hasNext()) {
                                                            C2669g2 c2669g2 = (C2669g2) it6.next();
                                                            c1847j.m5494h();
                                                            c1847j.mo5748g();
                                                            C6272i.m12912f(str);
                                                            C6272i.m12915i(c2669g2);
                                                            if (c2669g2.m7840x().isEmpty()) {
                                                                C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                                                                C1897o4.m5776k(c1860k5);
                                                                c1860k5.f9945i.m5626d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", C1860k3.m5700q(str), Integer.valueOf(iM8389t), String.valueOf(c2669g2.m7836C() ? Integer.valueOf(c2669g2.m7838t()) : null));
                                                            } else {
                                                                byte[] bArrM8066g2 = c2669g2.m8066g();
                                                                ContentValues contentValues = new ContentValues();
                                                                contentValues.put(str10, str);
                                                                Iterator it7 = it6;
                                                                contentValues.put("audience_id", Integer.valueOf(iM8389t));
                                                                contentValues.put("filter_id", c2669g2.m7836C() ? Integer.valueOf(c2669g2.m7838t()) : null);
                                                                String str11 = str10;
                                                                contentValues.put("property_name", c2669g2.m7840x());
                                                                contentValues.put("session_scoped", c2669g2.m7837D() ? Boolean.valueOf(c2669g2.m7835B()) : null);
                                                                contentValues.put("data", bArrM8066g2);
                                                                try {
                                                                    if (c1847j.m5667A().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                                        C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                                                                        C1897o4.m5776k(c1860k6);
                                                                        c1860k6.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert property filter (got -1). appId");
                                                                    } else {
                                                                        it6 = it7;
                                                                        str10 = str11;
                                                                    }
                                                                } catch (SQLiteException e10) {
                                                                    C1860k3 c1860k7 = ((C1897o4) interfaceC1781b5).f10086i;
                                                                    C1897o4.m5776k(c1860k7);
                                                                    c1860k7.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error storing property filter. appId");
                                                                }
                                                            }
                                                        } else {
                                                            str4 = str9;
                                                        }
                                                        str9 = str4;
                                                        it = it5;
                                                        sQLiteDatabaseM5667A = sQLiteDatabase;
                                                        break;
                                                    }
                                                }
                                                C2922z1 c2922z1 = (C2922z1) it4.next();
                                                c1847j.m5494h();
                                                c1847j.mo5748g();
                                                C6272i.m12912f(str);
                                                C6272i.m12915i(c2922z1);
                                                if (!c2922z1.m8455z().isEmpty()) {
                                                    Iterator it8 = it4;
                                                    byte[] bArrM8066g3 = c2922z1.m8066g();
                                                    sQLiteDatabase = sQLiteDatabaseM5667A;
                                                    ContentValues contentValues2 = new ContentValues();
                                                    contentValues2.put("app_id", str);
                                                    contentValues2.put("audience_id", Integer.valueOf(iM8389t));
                                                    contentValues2.put("filter_id", c2922z1.m8449H() ? Integer.valueOf(c2922z1.m8452u()) : null);
                                                    contentValues2.put("event_name", c2922z1.m8455z());
                                                    contentValues2.put("session_scoped", c2922z1.m8450I() ? Boolean.valueOf(c2922z1.m8447F()) : null);
                                                    contentValues2.put("data", bArrM8066g3);
                                                    try {
                                                        if (c1847j.m5667A().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                            C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                                                            C1897o4.m5776k(c1860k8);
                                                            c1860k8.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert event filter (got -1). appId");
                                                        }
                                                        it = it5;
                                                        it4 = it8;
                                                        sQLiteDatabaseM5667A = sQLiteDatabase;
                                                    } catch (SQLiteException e11) {
                                                        C1860k3 c1860k9 = ((C1897o4) interfaceC1781b5).f10086i;
                                                        C1897o4.m5776k(c1860k9);
                                                        c1860k9.f9942f.m5625c(C1860k3.m5700q(str), e11, "Error storing event filter. appId");
                                                        c1847j.m5494h();
                                                        c1847j.mo5748g();
                                                        C6272i.m12912f(str);
                                                        SQLiteDatabase sQLiteDatabaseM5667A3 = c1847j.m5667A();
                                                        str4 = str9;
                                                        sQLiteDatabaseM5667A3.delete("property_filters", str4, new String[]{str, String.valueOf(iM8389t)});
                                                        sQLiteDatabaseM5667A3.delete("event_filters", str4, new String[]{str, String.valueOf(iM8389t)});
                                                        str9 = str4;
                                                        it = it5;
                                                        sQLiteDatabaseM5667A = sQLiteDatabase;
                                                        break;
                                                    }
                                                } else {
                                                    C1860k3 c1860k10 = ((C1897o4) interfaceC1781b5).f10086i;
                                                    C1897o4.m5776k(c1860k10);
                                                    c1860k10.f9945i.m5626d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", C1860k3.m5700q(str), Integer.valueOf(iM8389t), String.valueOf(c2922z1.m8449H() ? Integer.valueOf(c2922z1.m8452u()) : null));
                                                    sQLiteDatabase = sQLiteDatabaseM5667A;
                                                }
                                                c1847j.m5494h();
                                                c1847j.mo5748g();
                                                C6272i.m12912f(str);
                                                SQLiteDatabase sQLiteDatabaseM5667A4 = c1847j.m5667A();
                                                str4 = str9;
                                                sQLiteDatabaseM5667A4.delete("property_filters", str4, new String[]{str, String.valueOf(iM8389t)});
                                                sQLiteDatabaseM5667A4.delete("event_filters", str4, new String[]{str, String.valueOf(iM8389t)});
                                                str9 = str4;
                                                it = it5;
                                                sQLiteDatabaseM5667A = sQLiteDatabase;
                                                break;
                                                break;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        C1860k3 c1860k11 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k11);
                        c1860k11.f9945i.m5624b(C1860k3.m5700q(str), "Audience with no ID. appId");
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = sQLiteDatabaseM5667A;
                }
                th = th2;
                sQLiteDatabase.endTransaction();
                throw th;
            }
            sQLiteDatabase = sQLiteDatabaseM5667A;
            ArrayList arrayList2 = new ArrayList();
            for (C2896x1 c2896x2 : arrayList) {
                arrayList2.add(c2896x2.m8388D() ? Integer.valueOf(c2896x2.m8389t()) : null);
            }
            C6272i.m12912f(str);
            c1847j.m5494h();
            c1847j.mo5748g();
            SQLiteDatabase sQLiteDatabaseM5667A5 = c1847j.m5667A();
            try {
                long jM5693v = c1847j.m5693v("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, ((C1897o4) interfaceC1781b5).f10084g.m5576k(str, C1985y2.f10319G)));
                if (jM5693v > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= arrayList2.size()) {
                            sQLiteDatabaseM5667A5.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(",", arrayList3) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i14);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i14++;
                    }
                }
            } catch (SQLiteException e12) {
                C1860k3 c1860k12 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k12);
                c1860k12.f9942f.m5625c(C1860k3.m5700q(str), e12, "Database error querying filters. appId");
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                c2793p7.m7899j();
                c2793p2 = c2793p7;
                try {
                    C2806q2.m8160J((C2806q2) c2793p2.f14271b);
                    bArrM8066g = ((C2806q2) c2793p2.m7897h()).m8066g();
                } catch (RuntimeException e13) {
                    e = e13;
                    C1860k3 c1860k13 = ((C1897o4) this.f10430a).f10086i;
                    C1897o4.m5776k(c1860k13);
                    c1860k13.f9945i.m5625c(C1860k3.m5700q(str), e, "Unable to serialize reduced-size config. Storing full config instead. appId");
                    bArrM8066g = bArr;
                }
            } catch (RuntimeException e14) {
                e = e14;
                c2793p2 = c2793p7;
            }
            C1847j c1847j2 = c1846i10.f9893c;
            C1846i7.m5629H(c1847j2);
            InterfaceC1781b5 interfaceC1781b6 = c1847j2.f10430a;
            C6272i.m12912f(str);
            c1847j2.mo5748g();
            c1847j2.m5494h();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrM8066g);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (c1847j2.m5667A().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    C1860k3 c1860k14 = ((C1897o4) interfaceC1781b6).f10086i;
                    C1897o4.m5776k(c1860k14);
                    c1860k14.f9942f.m5624b(C1860k3.m5700q(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e15) {
                C1860k3 c1860k15 = ((C1897o4) interfaceC1781b6).f10086i;
                C1897o4.m5776k(c1860k15);
                c1860k15.f9942f.m5625c(C1860k3.m5700q(str), e15, "Error storing remote config. appId");
            }
            c8446b3.put(str, (C2806q2) c2793p2.m7897h());
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase = sQLiteDatabaseM5667A;
        }
    }
}
