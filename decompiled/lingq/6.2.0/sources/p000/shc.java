package p000;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzaeh;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzji;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.protobuf.C1191l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class shc extends h8d implements amb {

    /* JADX INFO: renamed from: H */
    public final C3275kv f60871H;

    /* JADX INFO: renamed from: I */
    public final C3275kv f60872I;

    /* JADX INFO: renamed from: J */
    public final C3275kv f60873J;

    /* JADX INFO: renamed from: d */
    public final C3275kv f60874d;

    /* JADX INFO: renamed from: e */
    public final C3275kv f60875e;

    /* JADX INFO: renamed from: f */
    public final C3275kv f60876f;

    /* JADX INFO: renamed from: g */
    public final C3275kv f60877g;

    /* JADX INFO: renamed from: h */
    public final C3275kv f60878h;

    /* JADX INFO: renamed from: i */
    public final C3275kv f60879i;

    /* JADX INFO: renamed from: j */
    public final C3275kv f60880j;

    /* JADX INFO: renamed from: k */
    public final s18 f60881k;

    /* JADX INFO: renamed from: l */
    public final gw9 f60882l;

    public shc(C1045d c1045d) {
        super(c1045d);
        this.f60874d = new C3275kv(0);
        this.f60875e = new C3275kv(0);
        this.f60876f = new C3275kv(0);
        this.f60877g = new C3275kv(0);
        this.f60878h = new C3275kv(0);
        this.f60879i = new C3275kv(0);
        this.f60871H = new C3275kv(0);
        this.f60872I = new C3275kv(0);
        this.f60873J = new C3275kv(0);
        this.f60880j = new C3275kv(0);
        this.f60881k = new s18(this);
        this.f60882l = new gw9(this, 12);
    }

    /* JADX INFO: renamed from: N */
    public static final C3275kv m21372N(kbc kbcVar) {
        C3275kv c3275kv = new C3275kv(0);
        for (tcc tccVar : kbcVar.m15077w()) {
            c3275kv.put(tccVar.m21952s(), tccVar.m21953t());
        }
        return c3275kv;
    }

    /* JADX INFO: renamed from: O */
    public static final zzjk m21373O(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return zzjk.AD_STORAGE;
        }
        if (i2 == 2) {
            return zzjk.ANALYTICS_STORAGE;
        }
        if (i2 == 3) {
            return zzjk.AD_USER_DATA;
        }
        if (i2 != 4) {
            return null;
        }
        return zzjk.AD_PERSONALIZATION;
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
    }

    /* JADX INFO: renamed from: H */
    public final zzji m21374H(String str, zzjk zzjkVar) {
        mo12359D();
        m21376J(str);
        hac hacVarM21390Z = m21390Z(str);
        if (hacVarM21390Z == null) {
            return zzji.UNINITIALIZED;
        }
        for (b8c b8cVar : hacVarM21390Z.m13165x()) {
            if (m21373O(b8cVar.m3484t()) == zzjkVar) {
                int iM3485u = b8cVar.m3485u() - 1;
                if (iM3485u != 1) {
                    return iM3485u != 2 ? zzji.UNINITIALIZED : zzji.DENIED;
                }
                return zzji.GRANTED;
            }
        }
        return zzji.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m21375I(String str) {
        mo12359D();
        m21376J(str);
        hac hacVarM21390Z = m21390Z(str);
        if (hacVarM21390Z == null) {
            return false;
        }
        for (b8c b8cVar : hacVarM21390Z.m13160s()) {
            if (b8cVar.m3484t() == 3 && b8cVar.m3486v() == 3) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final void m21376J(String str) {
        m13144E();
        mo12359D();
        lda.m16127m(str);
        C3275kv c3275kv = this.f60879i;
        if (c3275kv.get(str) == null) {
            nnb nnbVar = this.f55716b.f12360c;
            C1045d.m5885T(nnbVar);
            sq5 sq5VarM17525L0 = nnbVar.m17525L0(str);
            C3275kv c3275kv2 = this.f60873J;
            C3275kv c3275kv3 = this.f60872I;
            C3275kv c3275kv4 = this.f60871H;
            C3275kv c3275kv5 = this.f60874d;
            if (sq5VarM17525L0 != null) {
                ebc ebcVar = (ebc) m21379M(str, (byte[]) sq5VarM17525L0.f61249c).m23966j();
                m21377K(str, ebcVar);
                c3275kv5.put(str, m21372N((kbc) ebcVar.m22741d()));
                c3275kv.put(str, (kbc) ebcVar.m22741d());
                m21378L(str, (kbc) ebcVar.m22741d());
                c3275kv4.put(str, ((kbc) ebcVar.f63950b).m15064D());
                c3275kv3.put(str, (String) sq5VarM17525L0.f61248b);
                c3275kv2.put(str, (String) sq5VarM17525L0.f61250d);
                return;
            }
            c3275kv5.put(str, null);
            this.f60876f.put(str, null);
            this.f60875e.put(str, null);
            this.f60877g.put(str, null);
            this.f60878h.put(str, null);
            c3275kv.put(str, null);
            c3275kv4.put(str, null);
            c3275kv3.put(str, null);
            c3275kv2.put(str, null);
            this.f60880j.put(str, null);
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m21377K(String str, ebc ebcVar) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        C3275kv c3275kv = new C3275kv(0);
        C3275kv c3275kv2 = new C3275kv(0);
        C3275kv c3275kv3 = new C3275kv(0);
        Iterator it = Collections.unmodifiableList(((kbc) ebcVar.f63950b).m15063C()).iterator();
        while (it.hasNext()) {
            hashSet.add(((pac) it.next()).m19010s());
        }
        kjc kjcVar = (kjc) this.f60774a;
        cmb cmbVar = kjcVar.f47436d;
        xcc xccVar = kjcVar.f47438f;
        t8c t8cVar = z8c.f71144V0;
        if (cmbVar.m4869O(null, t8cVar)) {
            arrayList2.addAll(Collections.unmodifiableList(((kbc) ebcVar.f63950b).m15069I()));
        }
        while (i < ((kbc) ebcVar.f63950b).m15078x()) {
            uac uacVar = (uac) ((kbc) ebcVar.f63950b).m15079y(i).m23966j();
            if (uacVar.m22662g().isEmpty()) {
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17923a("EventConfig contained null event name");
                arrayList = arrayList2;
            } else {
                String strM22662g = uacVar.m22662g();
                arrayList = arrayList2;
                String strM6880e = C1191l.m6880e(uacVar.m22662g(), AbstractC3184kh.f47271m, AbstractC3184kh.f47276r);
                if (!TextUtils.isEmpty(strM6880e)) {
                    uacVar.m22739b();
                    ((zac) uacVar.f63950b).m25535z(strM6880e);
                    ebcVar.m22739b();
                    ((kbc) ebcVar.f63950b).m15070L(i, (zac) uacVar.m22741d());
                }
                if (((zac) uacVar.f63950b).m25529t() && ((zac) uacVar.f63950b).m25530u()) {
                    c3275kv.put(strM22662g, Boolean.TRUE);
                }
                if (((zac) uacVar.f63950b).m25531v() && ((zac) uacVar.f63950b).m25532w()) {
                    c3275kv2.put(uacVar.m22662g(), Boolean.TRUE);
                }
                if (((zac) uacVar.f63950b).m25533x()) {
                    if (((zac) uacVar.f63950b).m25534y() < 2 || ((zac) uacVar.f63950b).m25534y() > 65535) {
                        kjc.m15280l(xccVar);
                        xccVar.f68083i.m17925c("Invalid sampling rate. Event name, sample rate", uacVar.m22662g(), Integer.valueOf(((zac) uacVar.f63950b).m25534y()));
                    } else {
                        c3275kv3.put(uacVar.m22662g(), Integer.valueOf(((zac) uacVar.f63950b).m25534y()));
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = arrayList2;
        this.f60875e.put(str, hashSet);
        if (kjcVar.f47436d.m4869O(null, t8cVar)) {
            this.f60878h.put(str, arrayList3);
        }
        this.f60876f.put(str, c3275kv);
        this.f60877g.put(str, c3275kv2);
        this.f60880j.put(str, c3275kv3);
    }

    /* JADX INFO: renamed from: L */
    public final void m21378L(String str, kbc kbcVar) {
        kjc kjcVar = (kjc) this.f60774a;
        int iM15062B = kbcVar.m15062B();
        s18 s18Var = this.f60881k;
        if (iM15062B == 0) {
            s18Var.m241g(str);
            return;
        }
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17924b(Integer.valueOf(kbcVar.m15062B()), "EES programs found");
        int i = 0;
        pnc pncVar = (pnc) kbcVar.m15061A().get(0);
        try {
            orb orbVar = new orb();
            C3329mb c3329mb = orbVar.f54800a;
            ((jh9) c3329mb.f50863e).m14478o("internal.remoteConfig", new ahc(this, str, 2));
            ((jh9) c3329mb.f50863e).m14478o("internal.appMetadata", new ahc(this, str, i));
            ((jh9) c3329mb.f50863e).m14478o("internal.logger", new z06(this, 3));
            orbVar.m18331b(pncVar);
            s18Var.m240f(str, orbVar);
            kjc.m15280l(xccVar);
            occ occVar = xccVar.f68076I;
            occVar.m17925c("EES program loaded for appId, activities", str, Integer.valueOf(pncVar.m19417t().m19401t()));
            for (ymc ymcVar : pncVar.m19417t().m19400s()) {
                kjc.m15280l(xccVar);
                occVar.m17924b(ymcVar.m25202s(), "EES program activity");
            }
        } catch (zzd unused) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(str, "Failed to load EES program. appId");
        }
    }

    /* JADX INFO: renamed from: M */
    public final kbc m21379M(String str, byte[] bArr) {
        kjc kjcVar = (kjc) this.f60774a;
        if (bArr == null) {
            return kbc.m15060K();
        }
        try {
            kbc kbcVar = (kbc) ((ebc) dad.m10238o0(kbc.m15059J(), bArr)).m22741d();
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17925c("Parsed config. version, gmp_app_id", kbcVar.m15073s() ? Long.valueOf(kbcVar.m15074t()) : null, kbcVar.m15075u() ? kbcVar.m15076v() : null);
            return kbcVar;
        } catch (zzaeh e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68083i.m17925c("Unable to merge remote config. appId", xcc.m24449L(str), e);
            return kbc.m15060K();
        } catch (RuntimeException e2) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68083i.m17925c("Unable to merge remote config. appId", xcc.m24449L(str), e2);
            return kbc.m15060K();
        }
    }

    /* JADX INFO: renamed from: P */
    public final kbc m21380P(String str) {
        m13144E();
        mo12359D();
        lda.m16127m(str);
        m21376J(str);
        return (kbc) this.f60879i.get(str);
    }

    /* JADX INFO: renamed from: Q */
    public final String m21381Q(String str) {
        mo12359D();
        m21376J(str);
        return (String) this.f60871H.get(str);
    }

    /* JADX INFO: renamed from: R */
    public final void m21382R(String str, String str2, String str3, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabase;
        ebc ebcVar;
        byte[] bArrM3725a;
        Iterator it;
        int i;
        boolean z;
        m13144E();
        mo12359D();
        lda.m16127m(str);
        ebc ebcVar2 = (ebc) m21379M(str, bArr).m23966j();
        m21377K(str, ebcVar2);
        m21378L(str, (kbc) ebcVar2.m22741d());
        kbc kbcVar = (kbc) ebcVar2.m22741d();
        C3275kv c3275kv = this.f60879i;
        c3275kv.put(str, kbcVar);
        this.f60871H.put(str, ((kbc) ebcVar2.f63950b).m15064D());
        this.f60872I.put(str, str2);
        this.f60873J.put(str, str3);
        this.f60874d.put(str, m21372N((kbc) ebcVar2.m22741d()));
        C1045d c1045d = this.f55716b;
        nnb nnbVar = c1045d.f12360c;
        C1045d.m5885T(nnbVar);
        ArrayList<x4c> arrayList = new ArrayList(Collections.unmodifiableList(((kbc) ebcVar2.f63950b).m15080z()));
        kjc kjcVar = (kjc) nnbVar.f60774a;
        int i2 = 0;
        while (i2 < arrayList.size()) {
            q4c q4cVar = (q4c) ((x4c) arrayList.get(i2)).m23966j();
            if (q4cVar.m19652j() != 0) {
                int i3 = 0;
                while (i3 < q4cVar.m19652j()) {
                    d5c d5cVar = (d5c) q4cVar.m19653k(i3).m23966j();
                    d5c d5cVar2 = (d5c) d5cVar.clone();
                    C1045d c1045d2 = c1045d;
                    ebc ebcVar3 = ebcVar2;
                    String strM6880e = C1191l.m6880e(d5cVar.m10111g(), AbstractC3184kh.f47271m, AbstractC3184kh.f47276r);
                    if (strM6880e != null) {
                        d5cVar2.m10112h(strM6880e);
                        z = true;
                    } else {
                        z = false;
                    }
                    int i4 = 0;
                    while (i4 < d5cVar.m10113i()) {
                        u5c u5cVarM10114j = d5cVar.m10114j(i4);
                        boolean z2 = z;
                        d5c d5cVar3 = d5cVar;
                        String strM6880e2 = C1191l.m6880e(u5cVarM10114j.m22502z(), syc.f61639a, syc.f61640b);
                        if (strM6880e2 != null) {
                            q5c q5cVar = (q5c) u5cVarM10114j.m23966j();
                            q5cVar.m19666g(strM6880e2);
                            d5cVar2.m10115k(i4, (u5c) q5cVar.m22741d());
                            z = true;
                        } else {
                            z = z2;
                        }
                        i4++;
                        d5cVar = d5cVar3;
                    }
                    if (z) {
                        q4cVar.m19654l(i3, d5cVar2);
                        arrayList.set(i2, (x4c) q4cVar.m22741d());
                    }
                    i3++;
                    c1045d = c1045d2;
                    ebcVar2 = ebcVar3;
                }
            }
            ebc ebcVar4 = ebcVar2;
            C1045d c1045d3 = c1045d;
            if (q4cVar.m19649g() != 0) {
                for (int i5 = 0; i5 < q4cVar.m19649g(); i5++) {
                    f7c f7cVarM19650h = q4cVar.m19650h(i5);
                    String strM6880e3 = C1191l.m6880e(f7cVarM19650h.m11584u(), AbstractC3584sr.f61286m, AbstractC3584sr.f61287n);
                    if (strM6880e3 != null) {
                        a7c a7cVar = (a7c) f7cVarM19650h.m23966j();
                        a7cVar.m166g(strM6880e3);
                        q4cVar.m19651i(i5, a7cVar);
                        arrayList.set(i2, (x4c) q4cVar.m22741d());
                    }
                }
            }
            i2++;
            c3275kv = c3275kv;
            c1045d = c1045d3;
            ebcVar2 = ebcVar4;
        }
        ebc ebcVar5 = ebcVar2;
        C3275kv c3275kv2 = c3275kv;
        C1045d c1045d4 = c1045d;
        nnbVar.m13144E();
        nnbVar.mo12359D();
        lda.m16127m(str);
        SQLiteDatabase sQLiteDatabaseM17559u0 = nnbVar.m17559u0();
        sQLiteDatabaseM17559u0.beginTransaction();
        try {
            nnbVar.m13144E();
            nnbVar.mo12359D();
            lda.m16127m(str);
            SQLiteDatabase sQLiteDatabaseM17559u1 = nnbVar.m17559u0();
            sQLiteDatabaseM17559u1.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM17559u1.delete("event_filters", "app_id=?", new String[]{str});
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                x4c x4cVar = (x4c) it2.next();
                nnbVar.m13144E();
                nnbVar.mo12359D();
                lda.m16127m(str);
                lda.m16130p(x4cVar);
                if (x4cVar.m24276s()) {
                    int iM24277t = x4cVar.m24277t();
                    Iterator it3 = x4cVar.m24281x().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!((k5c) it3.next()).m14868s()) {
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68083i.m17925c("Event filter with no ID. Audience definition ignored. appId, audienceId", xcc.m24449L(str), Integer.valueOf(iM24277t));
                                break;
                            }
                        } else {
                            Iterator it4 = x4cVar.m24278u().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    Iterator it5 = x4cVar.m24281x().iterator();
                                    while (true) {
                                        x4c x4cVar2 = x4cVar;
                                        String str4 = "audience_id";
                                        sQLiteDatabase = sQLiteDatabaseM17559u0;
                                        String str5 = "app_id";
                                        if (!it5.hasNext()) {
                                            it = it2;
                                            i = iM24277t;
                                            for (f7c f7cVar : x4cVar2.m24278u()) {
                                                nnbVar.m13144E();
                                                nnbVar.mo12359D();
                                                lda.m16127m(str);
                                                lda.m16130p(f7cVar);
                                                if (f7cVar.m11584u().isEmpty()) {
                                                    xcc xccVar2 = kjcVar.f47438f;
                                                    kjc.m15280l(xccVar2);
                                                    xccVar2.f68083i.m17926d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", xcc.m24449L(str), Integer.valueOf(i), String.valueOf(f7cVar.m11582s() ? Integer.valueOf(f7cVar.m11583t()) : null));
                                                } else {
                                                    byte[] bArrM3725a2 = f7cVar.m3725a();
                                                    ContentValues contentValues = new ContentValues();
                                                    contentValues.put(str5, str);
                                                    String str6 = str5;
                                                    contentValues.put(str4, Integer.valueOf(i));
                                                    contentValues.put("filter_id", f7cVar.m11582s() ? Integer.valueOf(f7cVar.m11583t()) : null);
                                                    String str7 = str4;
                                                    contentValues.put("property_name", f7cVar.m11584u());
                                                    contentValues.put("session_scoped", f7cVar.m11588y() ? Boolean.valueOf(f7cVar.m11589z()) : null);
                                                    contentValues.put("data", bArrM3725a2);
                                                    try {
                                                        if (nnbVar.m17559u0().insertWithOnConflict("property_filters", null, contentValues, 5) == -1) {
                                                            xcc xccVar3 = kjcVar.f47438f;
                                                            kjc.m15280l(xccVar3);
                                                            xccVar3.f68080f.m17924b(xcc.m24449L(str), "Failed to insert property filter (got -1). appId");
                                                        } else {
                                                            str5 = str6;
                                                            str4 = str7;
                                                        }
                                                    } catch (SQLiteException e) {
                                                        xcc xccVar4 = kjcVar.f47438f;
                                                        kjc.m15280l(xccVar4);
                                                        xccVar4.f68080f.m17925c("Error storing property filter. appId", xcc.m24449L(str), e);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        try {
                                            k5c k5cVar = (k5c) it5.next();
                                            nnbVar.m13144E();
                                            nnbVar.mo12359D();
                                            lda.m16127m(str);
                                            lda.m16130p(k5cVar);
                                            if (k5cVar.m14870u().isEmpty()) {
                                                xcc xccVar5 = kjcVar.f47438f;
                                                kjc.m15280l(xccVar5);
                                                xccVar5.f68083i.m17926d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", xcc.m24449L(str), Integer.valueOf(iM24277t), String.valueOf(k5cVar.m14868s() ? Integer.valueOf(k5cVar.m14869t()) : null));
                                                it = it2;
                                                i = iM24277t;
                                            } else {
                                                it = it2;
                                                byte[] bArrM3725a3 = k5cVar.m3725a();
                                                i = iM24277t;
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("app_id", str);
                                                contentValues2.put("audience_id", Integer.valueOf(i));
                                                contentValues2.put("filter_id", k5cVar.m14868s() ? Integer.valueOf(k5cVar.m14869t()) : null);
                                                contentValues2.put("event_name", k5cVar.m14870u());
                                                contentValues2.put("session_scoped", k5cVar.m14864C() ? Boolean.valueOf(k5cVar.m14865D()) : null);
                                                contentValues2.put("data", bArrM3725a3);
                                                try {
                                                    if (nnbVar.m17559u0().insertWithOnConflict("event_filters", null, contentValues2, 5) == -1) {
                                                        xcc xccVar6 = kjcVar.f47438f;
                                                        kjc.m15280l(xccVar6);
                                                        xccVar6.f68080f.m17924b(xcc.m24449L(str), "Failed to insert event filter (got -1). appId");
                                                    }
                                                    x4cVar = x4cVar2;
                                                    sQLiteDatabaseM17559u0 = sQLiteDatabase;
                                                    it2 = it;
                                                    iM24277t = i;
                                                } catch (SQLiteException e2) {
                                                    xcc xccVar7 = kjcVar.f47438f;
                                                    kjc.m15280l(xccVar7);
                                                    xccVar7.f68080f.m17925c("Error storing event filter. appId", xcc.m24449L(str), e2);
                                                }
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            sQLiteDatabase.endTransaction();
                                            throw th;
                                        }
                                        nnbVar.m13144E();
                                        nnbVar.mo12359D();
                                        lda.m16127m(str);
                                        SQLiteDatabase sQLiteDatabaseM17559u2 = nnbVar.m17559u0();
                                        sQLiteDatabaseM17559u2.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        sQLiteDatabaseM17559u2.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(i)});
                                        break;
                                    }
                                    sQLiteDatabaseM17559u0 = sQLiteDatabase;
                                    it2 = it;
                                    break;
                                }
                                if (!((f7c) it4.next()).m11582s()) {
                                    xcc xccVar8 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar8);
                                    xccVar8.f68083i.m17925c("Property filter with no ID. Audience definition ignored. appId, audienceId", xcc.m24449L(str), Integer.valueOf(iM24277t));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    xcc xccVar9 = kjcVar.f47438f;
                    kjc.m15280l(xccVar9);
                    xccVar9.f68083i.m17924b(xcc.m24449L(str), "Audience with no ID. appId");
                }
            }
            sQLiteDatabase = sQLiteDatabaseM17559u0;
            ArrayList arrayList2 = new ArrayList();
            for (x4c x4cVar3 : arrayList) {
                arrayList2.add(x4cVar3.m24276s() ? Integer.valueOf(x4cVar3.m24277t()) : null);
            }
            lda.m16127m(str);
            nnbVar.m13144E();
            nnbVar.mo12359D();
            SQLiteDatabase sQLiteDatabaseM17559u3 = nnbVar.m17559u0();
            try {
                long jM17540Z = nnbVar.m17540Z("select count(1) from audience_filter_values where app_id=?", new String[]{str});
                int iMax = Math.max(0, Math.min(2000, kjcVar.f47436d.m4867M(str, z8c.f71141U)));
                if (jM17540Z > iMax) {
                    ArrayList arrayList3 = new ArrayList();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= arrayList2.size()) {
                            String strJoin = TextUtils.join(",", arrayList3);
                            StringBuilder sb = new StringBuilder(String.valueOf(strJoin).length() + 2);
                            sb.append("(");
                            sb.append(strJoin);
                            sb.append(")");
                            String string = sb.toString();
                            StringBuilder sb2 = new StringBuilder(string.length() + 140);
                            sb2.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                            sb2.append(string);
                            sb2.append(" order by rowid desc limit -1 offset ?)");
                            sQLiteDatabaseM17559u3.delete("audience_filter_values", sb2.toString(), new String[]{str, Integer.toString(iMax)});
                            break;
                        }
                        Integer num = (Integer) arrayList2.get(i6);
                        if (num == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num.intValue()));
                        i6++;
                    }
                }
            } catch (SQLiteException e3) {
                xcc xccVar10 = kjcVar.f47438f;
                kjc.m15280l(xccVar10);
                xccVar10.f68080f.m17925c("Database error querying filters. appId", xcc.m24449L(str), e3);
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            try {
                ebcVar5.m22739b();
                ebcVar = ebcVar5;
                try {
                    ((kbc) ebcVar.f63950b).m15071M();
                    bArrM3725a = ((kbc) ebcVar.m22741d()).m3725a();
                } catch (RuntimeException e4) {
                    e = e4;
                    xcc xccVar11 = ((kjc) this.f60774a).f47438f;
                    kjc.m15280l(xccVar11);
                    xccVar11.f68083i.m17925c("Unable to serialize reduced-size config. Storing full config instead. appId", xcc.m24449L(str), e);
                    bArrM3725a = bArr;
                }
            } catch (RuntimeException e5) {
                e = e5;
                ebcVar = ebcVar5;
            }
            nnb nnbVar2 = c1045d4.f12360c;
            C1045d.m5885T(nnbVar2);
            kjc kjcVar2 = (kjc) nnbVar2.f60774a;
            lda.m16127m(str);
            nnbVar2.mo12359D();
            nnbVar2.m13144E();
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("remote_config", bArrM3725a);
            contentValues3.put("config_last_modified_time", str2);
            contentValues3.put("e_tag", str3);
            try {
                if (nnbVar2.m17559u0().update("apps", contentValues3, "app_id = ?", new String[]{str}) == 0) {
                    xcc xccVar12 = kjcVar2.f47438f;
                    kjc.m15280l(xccVar12);
                    xccVar12.f68080f.m17924b(xcc.m24449L(str), "Failed to update remote config (got 0). appId");
                }
            } catch (SQLiteException e6) {
                xcc xccVar13 = kjcVar2.f47438f;
                kjc.m15280l(xccVar13);
                xccVar13.f68080f.m17925c("Error storing remote config. appId", xcc.m24449L(str), e6);
            }
            ebcVar.m22739b();
            ((kbc) ebcVar.f63950b).m15072N();
            c3275kv2.put(str, (kbc) ebcVar.m22741d());
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = sQLiteDatabaseM17559u0;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m21383S(String str, String str2) {
        Boolean bool;
        mo12359D();
        m21376J(str);
        if ("1".equals(mo579f(str, "measurement.upload.blacklist_internal")) && rad.m20510g0(str2)) {
            return true;
        }
        if ("1".equals(mo579f(str, "measurement.upload.blacklist_public")) && rad.m20499C0(str2)) {
            return true;
        }
        Map map = (Map) this.f60876f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m21384T(String str, String str2) {
        Boolean bool;
        mo12359D();
        m21376J(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f60877g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: U */
    public final List m21385U(String str) {
        mo12359D();
        m21376J(str);
        return (List) this.f60878h.get(str);
    }

    /* JADX INFO: renamed from: V */
    public final int m21386V(String str, String str2) {
        Integer num;
        mo12359D();
        m21376J(str);
        Map map = (Map) this.f60880j.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: W */
    public final boolean m21387W(String str) {
        mo12359D();
        m21376J(str);
        C3275kv c3275kv = this.f60875e;
        if (c3275kv.get(str) != null) {
            return ((Set) c3275kv.get(str)).contains("os_version") || ((Set) c3275kv.get(str)).contains("device_info");
        }
        return false;
    }

    /* JADX INFO: renamed from: X */
    public final boolean m21388X(String str) {
        mo12359D();
        m21376J(str);
        C3275kv c3275kv = this.f60875e;
        return c3275kv.get(str) != null && ((Set) c3275kv.get(str)).contains("app_instance_id");
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m21389Y(String str, zzjk zzjkVar) {
        mo12359D();
        m21376J(str);
        hac hacVarM21390Z = m21390Z(str);
        if (hacVarM21390Z == null) {
            return false;
        }
        for (b8c b8cVar : hacVarM21390Z.m13160s()) {
            if (zzjkVar == m21373O(b8cVar.m3484t())) {
                return b8cVar.m3485u() == 2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final hac m21390Z(String str) {
        mo12359D();
        m21376J(str);
        kbc kbcVarM21380P = m21380P(str);
        if (kbcVarM21380P == null || !kbcVarM21380P.m15065E()) {
            return null;
        }
        return kbcVarM21380P.m15066F();
    }

    @Override // p000.amb
    /* JADX INFO: renamed from: f */
    public final String mo579f(String str, String str2) {
        mo12359D();
        m21376J(str);
        Map map = (Map) this.f60874d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }
}
