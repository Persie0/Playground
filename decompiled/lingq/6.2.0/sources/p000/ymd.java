package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ymd {

    /* JADX INFO: renamed from: a */
    public final String f70081a;

    /* JADX INFO: renamed from: b */
    public final boolean f70082b;

    /* JADX INFO: renamed from: c */
    public final mkc f70083c;

    /* JADX INFO: renamed from: d */
    public final BitSet f70084d;

    /* JADX INFO: renamed from: e */
    public final BitSet f70085e;

    /* JADX INFO: renamed from: f */
    public final C3275kv f70086f;

    /* JADX INFO: renamed from: g */
    public final C3275kv f70087g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ mhb f70088h;

    public ymd(mhb mhbVar, String str, mkc mkcVar, BitSet bitSet, BitSet bitSet2, C3275kv c3275kv, C3275kv c3275kv2) {
        this.f70088h = mhbVar;
        this.f70081a = str;
        this.f70084d = bitSet;
        this.f70085e = bitSet2;
        this.f70086f = c3275kv;
        this.f70087g = new C3275kv(0);
        for (Integer num : (C3089hv) c3275kv2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c3275kv2.get(num));
            this.f70087g.put(num, arrayList);
        }
        this.f70082b = false;
        this.f70083c = mkcVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m25204a(pfb pfbVar) {
        int iM14869t;
        switch (pfbVar.f56074g) {
            case 0:
                iM14869t = ((k5c) pfbVar.f56076i).m14869t();
                break;
            default:
                iM14869t = ((f7c) pfbVar.f56076i).m11583t();
                break;
        }
        boolean z = true;
        if (pfbVar.f56070c != null) {
            this.f70085e.set(iM14869t, true);
        }
        Boolean bool = pfbVar.f56071d;
        if (bool != null) {
            this.f70084d.set(iM14869t, bool.booleanValue());
        }
        if (pfbVar.f56072e != null) {
            Integer numValueOf = Integer.valueOf(iM14869t);
            C3275kv c3275kv = this.f70086f;
            Long l = (Long) c3275kv.get(numValueOf);
            long jLongValue = pfbVar.f56072e.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                c3275kv.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (pfbVar.f56073f != null) {
            Integer numValueOf2 = Integer.valueOf(iM14869t);
            C3275kv c3275kv2 = this.f70087g;
            List arrayList = (List) c3275kv2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c3275kv2.put(numValueOf2, arrayList);
            }
            boolean zM14874y = false;
            switch (pfbVar.f56074g) {
                case 0:
                    z = false;
                    break;
            }
            if (z) {
                arrayList.clear();
            }
            mkb.m16883a();
            kjc kjcVar = (kjc) this.f70088h.f60774a;
            cmb cmbVar = kjcVar.f47436d;
            t8c t8cVar = z8c.f71112F0;
            String str = this.f70081a;
            if (cmbVar.m4869O(str, t8cVar)) {
                switch (pfbVar.f56074g) {
                    case 0:
                        zM14874y = ((k5c) pfbVar.f56076i).m14874y();
                        break;
                }
                if (zM14874y) {
                    arrayList.clear();
                }
            }
            mkb.m16883a();
            boolean zM4869O = kjcVar.f47436d.m4869O(str, t8cVar);
            Long l2 = pfbVar.f56073f;
            if (!zM4869O) {
                arrayList.add(Long.valueOf(l2.longValue() / 1000));
                return;
            }
            Long lValueOf = Long.valueOf(l2.longValue() / 1000);
            if (arrayList.contains(lValueOf)) {
                return;
            }
            arrayList.add(lValueOf);
        }
    }

    /* JADX INFO: renamed from: b */
    public final lfc m25205b(int i) {
        ArrayList arrayList;
        List list;
        hfc hfcVarM16165z = lfc.m16165z();
        hfcVarM16165z.m22739b();
        ((lfc) hfcVarM16165z.f63950b).m16166A(i);
        hfcVarM16165z.m22739b();
        ((lfc) hfcVarM16165z.f63950b).m16169D(this.f70082b);
        mkc mkcVar = this.f70083c;
        if (mkcVar != null) {
            hfcVarM16165z.m22739b();
            ((lfc) hfcVarM16165z.f63950b).m16168C(mkcVar);
        }
        ikc ikcVarM16884A = mkc.m16884A();
        ikcVarM16884A.m14004i(dad.m10237j0(this.f70084d));
        ikcVarM16884A.m14002g(dad.m10237j0(this.f70085e));
        C3275kv c3275kv = this.f70086f;
        if (c3275kv == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(c3275kv.f49254c);
            for (Integer num : (C3089hv) c3275kv.keySet()) {
                int iIntValue = num.intValue();
                Long l = (Long) c3275kv.get(num);
                if (l != null) {
                    bhc bhcVarM11831w = fhc.m11831w();
                    bhcVarM11831w.m22739b();
                    ((fhc) bhcVarM11831w.f63950b).m11836x(iIntValue);
                    long jLongValue = l.longValue();
                    bhcVarM11831w.m22739b();
                    ((fhc) bhcVarM11831w.f63950b).m11837y(jLongValue);
                    arrayList2.add((fhc) bhcVarM11831w.m22741d());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            ikcVarM16884A.m14006k(arrayList);
        }
        C3275kv c3275kv2 = this.f70087g;
        if (c3275kv2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(c3275kv2.f49254c);
            for (Integer num2 : (C3089hv) c3275kv2.keySet()) {
                rkc rkcVarM24031x = wkc.m24031x();
                int iIntValue2 = num2.intValue();
                rkcVarM24031x.m22739b();
                ((wkc) rkcVarM24031x.f63950b).m24037y(iIntValue2);
                List list2 = (List) c3275kv2.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    rkcVarM24031x.m22739b();
                    ((wkc) rkcVarM24031x.f63950b).m24038z(list2);
                }
                arrayList3.add((wkc) rkcVarM24031x.m22741d());
            }
            list = arrayList3;
        }
        ikcVarM16884A.m14008m(list);
        hfcVarM16165z.m22739b();
        ((lfc) hfcVarM16165z.f63950b).m16167B((mkc) ikcVarM16884A.m22741d());
        return (lfc) hfcVarM16165z.m22741d();
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BitSet m25206c() {
        return this.f70084d;
    }

    public ymd(mhb mhbVar, String str) {
        this.f70088h = mhbVar;
        this.f70081a = str;
        this.f70082b = true;
        this.f70084d = new BitSet();
        this.f70085e = new BitSet();
        this.f70086f = new C3275kv(0);
        this.f70087g = new C3275kv(0);
    }
}
