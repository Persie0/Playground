package cc;

import com.google.android.gms.internal.measurement.C2760m9;
import com.google.android.gms.internal.measurement.C2794p3;
import com.google.android.gms.internal.measurement.C2807q3;
import com.google.android.gms.internal.measurement.C2820r3;
import com.google.android.gms.internal.measurement.C2833s3;
import com.google.android.gms.internal.measurement.C2884w2;
import com.google.android.gms.internal.measurement.C2897x2;
import com.google.android.gms.internal.measurement.C2910y2;
import com.google.android.gms.internal.measurement.C2923z2;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p326q.AbstractC8451g;
import p326q.C8446b;

/* JADX INFO: renamed from: cc.t7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1945t7 {

    /* JADX INFO: renamed from: a */
    public final String f10216a;

    /* JADX INFO: renamed from: b */
    public final boolean f10217b;

    /* JADX INFO: renamed from: c */
    public final C2807q3 f10218c;

    /* JADX INFO: renamed from: d */
    public final BitSet f10219d;

    /* JADX INFO: renamed from: e */
    public final BitSet f10220e;

    /* JADX INFO: renamed from: f */
    public final Map f10221f;

    /* JADX INFO: renamed from: g */
    public final C8446b f10222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1775b f10223h;

    public /* synthetic */ C1945t7(C1775b c1775b, String str) {
        this.f10223h = c1775b;
        this.f10216a = str;
        this.f10217b = true;
        this.f10219d = new BitSet();
        this.f10220e = new BitSet();
        this.f10221f = new C8446b();
        this.f10222g = new C8446b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1945t7(C1775b c1775b, String str, C2807q3 c2807q3, BitSet bitSet, BitSet bitSet2, C8446b c8446b, C8446b c8446b2) {
        this.f10223h = c1775b;
        this.f10216a = str;
        this.f10219d = bitSet;
        this.f10220e = bitSet2;
        this.f10221f = c8446b;
        this.f10222g = new C8446b();
        for (Integer num : (AbstractC8451g.c) c8446b2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) c8446b2.getOrDefault(num, null));
            this.f10222g.put(num, arrayList);
        }
        this.f10217b = false;
        this.f10218c = c2807q3;
    }

    /* JADX INFO: renamed from: a */
    public final C2897x2 m5891a(int i10) {
        ArrayList arrayList;
        List listEmptyList;
        C2884w2 c2884w2M8397u = C2897x2.m8397u();
        c2884w2M8397u.m7899j();
        C2897x2.m8399y((C2897x2) c2884w2M8397u.f14271b, i10);
        c2884w2M8397u.m7899j();
        C2897x2.m8396B((C2897x2) c2884w2M8397u.f14271b, this.f10217b);
        C2807q3 c2807q3 = this.f10218c;
        if (c2807q3 != null) {
            c2884w2M8397u.m7899j();
            C2897x2.m8395A((C2897x2) c2884w2M8397u.f14271b, c2807q3);
        }
        C2794p3 c2794p3M8187x = C2807q3.m8187x();
        ArrayList arrayListM5711D = C1864k7.m5711D(this.f10219d);
        c2794p3M8187x.m7899j();
        C2807q3.m8181G((C2807q3) c2794p3M8187x.f14271b, arrayListM5711D);
        ArrayList arrayListM5711D2 = C1864k7.m5711D(this.f10220e);
        c2794p3M8187x.m7899j();
        C2807q3.m8179E((C2807q3) c2794p3M8187x.f14271b, arrayListM5711D2);
        Map map = this.f10221f;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(map.size());
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                Long l10 = (Long) map.get(Integer.valueOf(iIntValue));
                if (l10 != null) {
                    C2910y2 c2910y2M8456v = C2923z2.m8456v();
                    c2910y2M8456v.m7899j();
                    C2923z2.m8458x((C2923z2) c2910y2M8456v.f14271b, iIntValue);
                    long jLongValue = l10.longValue();
                    c2910y2M8456v.m7899j();
                    C2923z2.m8459y((C2923z2) c2910y2M8456v.f14271b, jLongValue);
                    arrayList.add((C2923z2) c2910y2M8456v.m7897h());
                }
            }
        }
        if (arrayList != null) {
            c2794p3M8187x.m7899j();
            C2807q3.m8183I((C2807q3) c2794p3M8187x.f14271b, arrayList);
        }
        C8446b c8446b = this.f10222g;
        if (c8446b == null) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(c8446b.f45619c);
            for (Integer num : (AbstractC8451g.c) c8446b.keySet()) {
                C2820r3 c2820r3M8245w = C2833s3.m8245w();
                int iIntValue2 = num.intValue();
                c2820r3M8245w.m7899j();
                C2833s3.m8247z((C2833s3) c2820r3M8245w.f14271b, iIntValue2);
                List list = (List) c8446b.getOrDefault(num, null);
                if (list != null) {
                    Collections.sort(list);
                    c2820r3M8245w.m7899j();
                    C2833s3.m8244A((C2833s3) c2820r3M8245w.f14271b, list);
                }
                arrayList2.add((C2833s3) c2820r3M8245w.m7897h());
            }
            listEmptyList = arrayList2;
        }
        c2794p3M8187x.m7899j();
        C2807q3.m8185K((C2807q3) c2794p3M8187x.f14271b, listEmptyList);
        c2884w2M8397u.m7899j();
        C2897x2.m8400z((C2897x2) c2884w2M8397u.f14271b, (C2807q3) c2794p3M8187x.m7897h());
        return (C2897x2) c2884w2M8397u.m7897h();
    }

    /* JADX INFO: renamed from: b */
    public final void m5892b(AbstractC1972w7 abstractC1972w7) {
        int iMo5903a = abstractC1972w7.mo5903a();
        Boolean bool = abstractC1972w7.f10283c;
        if (bool != null) {
            bool.booleanValue();
            this.f10220e.set(iMo5903a, true);
        }
        Boolean bool2 = abstractC1972w7.f10284d;
        if (bool2 != null) {
            this.f10219d.set(iMo5903a, bool2.booleanValue());
        }
        if (abstractC1972w7.f10285e != null) {
            Integer numValueOf = Integer.valueOf(iMo5903a);
            Map map = this.f10221f;
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC1972w7.f10285e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                map.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC1972w7.f10286f != null) {
            C8446b c8446b = this.f10222g;
            Integer numValueOf2 = Integer.valueOf(iMo5903a);
            List arrayList = (List) c8446b.getOrDefault(numValueOf2, null);
            if (arrayList == null) {
                arrayList = new ArrayList();
                c8446b.put(numValueOf2, arrayList);
            }
            if (abstractC1972w7.mo5905c()) {
                arrayList.clear();
            }
            C2760m9.m8070a();
            C1775b c1775b = this.f10223h;
            C1802e c1802e = ((C1897o4) c1775b.f10430a).f10084g;
            C1976x2 c1976x2 = C1985y2.f10337Y;
            String str = this.f10216a;
            if (c1802e.m5582q(str, c1976x2) && abstractC1972w7.mo5904b()) {
                arrayList.clear();
            }
            C2760m9.m8070a();
            if (((C1897o4) c1775b.f10430a).f10084g.m5582q(str, c1976x2)) {
                Long lValueOf = Long.valueOf(abstractC1972w7.f10286f.longValue() / 1000);
                if (!arrayList.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                }
            } else {
                arrayList.add(Long.valueOf(abstractC1972w7.f10286f.longValue() / 1000));
            }
        }
    }
}
