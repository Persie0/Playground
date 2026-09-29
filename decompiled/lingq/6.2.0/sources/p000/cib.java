package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class cib implements Iterable, kmb, xlb {

    /* JADX INFO: renamed from: a */
    public final TreeMap f10145a;

    /* JADX INFO: renamed from: b */
    public final TreeMap f10146b;

    public cib(List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                m4746r(i, (kmb) list.get(i));
            }
        }
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: b */
    public final Boolean mo3808b() {
        return Boolean.TRUE;
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: c */
    public final String mo3809c() {
        return m4749v(",");
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: d */
    public final Iterator mo3810d() {
        return new zgb(this, this.f10145a.keySet().iterator(), this.f10146b.keySet().iterator());
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: e */
    public final Double mo3811e() {
        TreeMap treeMap = this.f10145a;
        if (treeMap.size() == 1) {
            return m4745o(0).mo3811e();
        }
        return treeMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cib)) {
            return false;
        }
        cib cibVar = (cib) obj;
        if (m4744n() != cibVar.m4744n()) {
            return false;
        }
        TreeMap treeMap = this.f10145a;
        if (treeMap.isEmpty()) {
            return cibVar.f10145a.isEmpty();
        }
        for (int iIntValue = ((Integer) treeMap.firstKey()).intValue(); iIntValue <= ((Integer) treeMap.lastKey()).intValue(); iIntValue++) {
            if (!m4745o(iIntValue).equals(cibVar.m4745o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: f */
    public final kmb mo3880f(String str) {
        kmb kmbVar;
        if ("length".equals(str)) {
            return new bkb(Double.valueOf(m4744n()));
        }
        return (!mo3882j(str) || (kmbVar = (kmb) this.f10146b.get(str)) == null) ? kmb.f47523y : kmbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:100:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x020e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0237  */
    /* JADX WARN: Code duplicated, block: B:107:0x023d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0248  */
    /* JADX WARN: Code duplicated, block: B:112:0x0267  */
    /* JADX WARN: Code duplicated, block: B:113:0x026d  */
    /* JADX WARN: Code duplicated, block: B:117:0x027c A[LOOP:2: B:115:0x0277->B:117:0x027c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x028b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0291  */
    /* JADX WARN: Code duplicated, block: B:124:0x029d  */
    /* JADX WARN: Code duplicated, block: B:126:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:128:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:130:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:133:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:136:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:139:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0301  */
    /* JADX WARN: Code duplicated, block: B:147:0x0314  */
    /* JADX WARN: Code duplicated, block: B:148:0x0318  */
    /* JADX WARN: Code duplicated, block: B:149:0x031e  */
    /* JADX WARN: Code duplicated, block: B:153:0x0338 A[LOOP:3: B:151:0x0332->B:153:0x0338, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0346  */
    /* JADX WARN: Code duplicated, block: B:157:0x034c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0363  */
    /* JADX WARN: Code duplicated, block: B:162:0x036a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0376  */
    /* JADX WARN: Code duplicated, block: B:173:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:176:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:181:0x03d6 A[LOOP:5: B:179:0x03d0->B:181:0x03d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03fb  */
    /* JADX WARN: Code duplicated, block: B:186:0x0403  */
    /* JADX WARN: Code duplicated, block: B:188:0x040d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0410  */
    /* JADX WARN: Code duplicated, block: B:192:0x0416  */
    /* JADX WARN: Code duplicated, block: B:198:0x0433  */
    /* JADX WARN: Code duplicated, block: B:199:0x0436  */
    /* JADX WARN: Code duplicated, block: B:202:0x0442  */
    /* JADX WARN: Code duplicated, block: B:204:0x044a  */
    /* JADX WARN: Code duplicated, block: B:207:0x0456  */
    /* JADX WARN: Code duplicated, block: B:209:0x0460  */
    /* JADX WARN: Code duplicated, block: B:211:0x0468  */
    /* JADX WARN: Code duplicated, block: B:213:0x047f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0485  */
    /* JADX WARN: Code duplicated, block: B:217:0x048b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0493  */
    /* JADX WARN: Code duplicated, block: B:221:0x0498  */
    /* JADX WARN: Code duplicated, block: B:223:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:225:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:228:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:230:0x04c7 A[LOOP:6: B:226:0x04af->B:230:0x04c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:235:0x04e4 A[LOOP:7: B:233:0x04de->B:235:0x04e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:239:0x0508 A[LOOP:8: B:237:0x0502->B:239:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:242:0x052d  */
    /* JADX WARN: Code duplicated, block: B:244:0x0535  */
    /* JADX WARN: Code duplicated, block: B:246:0x053f  */
    /* JADX WARN: Code duplicated, block: B:249:0x055d  */
    /* JADX WARN: Code duplicated, block: B:251:0x0579  */
    /* JADX WARN: Code duplicated, block: B:252:0x0581  */
    /* JADX WARN: Code duplicated, block: B:255:0x0591  */
    /* JADX WARN: Code duplicated, block: B:256:0x0598  */
    /* JADX WARN: Code duplicated, block: B:259:0x059d  */
    /* JADX WARN: Code duplicated, block: B:261:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:263:0x05af  */
    /* JADX WARN: Code duplicated, block: B:272:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:274:0x05db  */
    /* JADX WARN: Code duplicated, block: B:276:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:279:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:281:0x0600  */
    /* JADX WARN: Code duplicated, block: B:283:0x0605  */
    /* JADX WARN: Code duplicated, block: B:285:0x060d  */
    /* JADX WARN: Code duplicated, block: B:287:0x0613  */
    /* JADX WARN: Code duplicated, block: B:289:0x0619  */
    /* JADX WARN: Code duplicated, block: B:291:0x063b  */
    /* JADX WARN: Code duplicated, block: B:292:0x0646  */
    /* JADX WARN: Code duplicated, block: B:294:0x064c  */
    /* JADX WARN: Code duplicated, block: B:297:0x0660  */
    /* JADX WARN: Code duplicated, block: B:299:0x067e  */
    /* JADX WARN: Code duplicated, block: B:302:0x0687 A[LOOP:10: B:300:0x067f->B:302:0x0687, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:305:0x069f A[LOOP:11: B:305:0x069f->B:321:0x06f1, LOOP_START, PHI: r9 r35
      0x069f: PHI (r9v3 int) = (r9v2 int), (r9v4 int) binds: [B:304:0x069d, B:321:0x06f1] A[DONT_GENERATE, DONT_INLINE]
      0x069f: PHI (r35v1 java.util.TreeMap) = (r35v0 java.util.TreeMap), (r35v4 java.util.TreeMap) binds: [B:304:0x069d, B:321:0x06f1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:307:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:309:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:311:0x06b9  */
    /* JADX WARN: Code duplicated, block: B:313:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:314:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:316:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:318:0x06df  */
    /* JADX WARN: Code duplicated, block: B:326:0x0717 A[LOOP:13: B:326:0x0717->B:328:0x071a, LOOP_START, PHI: r0
      0x0717: PHI (r0v33 int) = (r0v32 int), (r0v34 int) binds: [B:296:0x065e, B:328:0x071a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:328:0x071a A[LOOP:13: B:326:0x0717->B:328:0x071a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:330:0x072c  */
    /* JADX WARN: Code duplicated, block: B:332:0x0734  */
    /* JADX WARN: Code duplicated, block: B:334:0x073a  */
    /* JADX WARN: Code duplicated, block: B:336:0x0745  */
    /* JADX WARN: Code duplicated, block: B:338:0x075b  */
    /* JADX WARN: Code duplicated, block: B:340:0x0761  */
    /* JADX WARN: Code duplicated, block: B:342:0x0767  */
    /* JADX WARN: Code duplicated, block: B:345:0x0785 A[LOOP:14: B:343:0x077f->B:345:0x0785, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:347:0x079c  */
    /* JADX WARN: Code duplicated, block: B:348:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:350:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:352:0x07b5  */
    /* JADX WARN: Code duplicated, block: B:355:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:357:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:362:0x07e5 A[LOOP:16: B:360:0x07df->B:362:0x07e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:366:0x0808  */
    /* JADX WARN: Code duplicated, block: B:368:0x0810  */
    /* JADX WARN: Code duplicated, block: B:370:0x0820  */
    /* JADX WARN: Code duplicated, block: B:379:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:390:0x04cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0710 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:400:0x06f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x06e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0800 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:410:0x07fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:411:0x07d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x012e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0138  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0173  */
    /* JADX WARN: Code duplicated, block: B:65:0x0179  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0185  */
    /* JADX WARN: Code duplicated, block: B:72:0x0190  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:82:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:84:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:89:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fe  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02dc, code lost:
    
        if (p000.tcd.m21956c(r7, r2, (p000.gmb) r0, java.lang.Boolean.FALSE, java.lang.Boolean.TRUE).m4744n() != r7.m4744n()) goto L171;
     */
    @Override // p000.kmb
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kmb mo3812g(String str, C3329mb c3329mb, ArrayList arrayList) {
        String str2;
        Object obj;
        String str3;
        Object obj2;
        Double dValueOf;
        int iHashCode;
        kmb kmbVarM4562k;
        TreeMap treeMap;
        double dM4744n;
        String str4;
        cib cibVar;
        Iterator it;
        kmb kmbVarM4562k2;
        int iM4744n;
        cib cibVar2;
        Iterator itM4743m;
        String str5;
        kmb kmbVarM4562k3;
        cib cibVar3;
        cib cibVar4;
        Iterator itM4743m2;
        cdb cdbVar;
        int iM19882i;
        int iM4744n2;
        cib cibVar5;
        int iMax;
        int i;
        kmb kmbVarM4562k4;
        int i2;
        int iIntValue;
        TreeMap treeMap2;
        Integer numValueOf;
        TreeMap treeMap3;
        kmb kmbVar;
        int i3;
        String str6;
        kmb kmbVarM4562k5;
        int iM4744n3;
        double dM19882i;
        int iMin;
        kmb kmbVarM4562k6;
        cib cibVar6;
        Iterator it2;
        int iM4744n4;
        Iterator itM4743m3;
        Iterator itM4743m4;
        kmb kmbVarM4562k7;
        kmb kmbVarM4562k8;
        int iM4744n5;
        String strMo3809c;
        kmb kmbVarM4562k9;
        Iterator it3;
        kmb kmbVarM4562k10;
        Iterator itM4743m5;
        int iIntValue2;
        vkb vkbVar;
        Iterator it4;
        int i4;
        kmb kmbVarM4562k11;
        kmb kmbVarM4562k12;
        double dM4744n2;
        double dM19882i2;
        double dMin;
        cib cibVar7;
        int i5;
        double dM19882i3;
        int iM4744n6;
        int i6;
        int i7;
        Iterator itM4743m6;
        double d;
        double dM19882i4;
        String str7 = "toString";
        String str8 = "forEach";
        String str9 = "splice";
        if (!"concat".equals(str) && !"every".equals(str) && !"filter".equals(str) && !"forEach".equals(str) && !"indexOf".equals(str) && !"join".equals(str) && !"lastIndexOf".equals(str) && !"map".equals(str) && !"pop".equals(str) && !"push".equals(str) && !"reduce".equals(str) && !"reduceRight".equals(str) && !"reverse".equals(str) && !"shift".equals(str) && !"slice".equals(str) && !"some".equals(str)) {
            str2 = "filter";
            str3 = "sort";
            if (str3.equals(str)) {
                obj2 = "reduce";
            } else {
                obj2 = "reduce";
                if (str9.equals(str)) {
                    str9 = str9;
                } else if (str7.equals(str)) {
                    str9 = str9;
                    str7 = str7;
                } else {
                    if (!"unshift".equals(str)) {
                        str9 = str9;
                        str7 = str7;
                        return xlb.m24611h(this, new xmb(str), c3329mb, arrayList);
                    }
                    str9 = str9;
                    str7 = str7;
                    obj = "unshift";
                }
            }
            obj = "unshift";
            c3329mb = c3329mb;
            str8 = "forEach";
            this = this;
            dValueOf = Double.valueOf(-1.0d);
            iHashCode = str.hashCode();
            TreeMap treeMap4 = this.f10145a;
            kmbVarM4562k = kmb.f47523y;
            treeMap = treeMap4;
            dM4744n = 0.0d;
            switch (iHashCode) {
                case -1776922004:
                    str4 = str7;
                    if (str.equals(str4)) {
                        qdd.m19875b(0, str4, arrayList);
                        return new xmb(this.m4749v(","));
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -1354795244:
                    if (str.equals("concat")) {
                        cibVar = (cib) this.mo3813k();
                        if (!arrayList.isEmpty()) {
                            it = arrayList.iterator();
                            while (it.hasNext()) {
                                kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it.next());
                                if (!(kmbVarM4562k2 instanceof jjb)) {
                                    C3386nv.m17633t("Failed evaluation of arguments");
                                    return null;
                                }
                                iM4744n = cibVar.m4744n();
                                if (kmbVarM4562k2 instanceof cib) {
                                    cibVar2 = (cib) kmbVarM4562k2;
                                    itM4743m = cibVar2.m4743m();
                                    while (itM4743m.hasNext()) {
                                        Integer num = (Integer) itM4743m.next();
                                        cibVar.m4746r(num.intValue() + iM4744n, cibVar2.m4745o(num.intValue()));
                                    }
                                } else {
                                    cibVar.m4746r(iM4744n, kmbVarM4562k2);
                                }
                            }
                        }
                        return cibVar;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -1274492040:
                    str5 = str2;
                    if (str.equals(str5)) {
                        qdd.m19875b(1, str5, arrayList);
                        kmbVarM4562k3 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k3 instanceof gmb) {
                            C3386nv.m17626m("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() == 0) {
                            return new cib();
                        }
                        cibVar3 = (cib) this.mo3813k();
                        cib cibVarM21956c = tcd.m21956c(this, c3329mb, (gmb) kmbVarM4562k3, null, Boolean.TRUE);
                        cibVar4 = new cib();
                        itM4743m2 = cibVarM21956c.m4743m();
                        while (itM4743m2.hasNext()) {
                            cibVar4.m4746r(cibVar4.m4744n(), cibVar3.m4745o(((Integer) itM4743m2.next()).intValue()));
                        }
                        return cibVar4;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -934873754:
                    if (str.equals(obj2)) {
                        return tcd.m21955b(this, c3329mb, arrayList, true);
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -895859076:
                    if (str.equals(str9)) {
                        if (arrayList.isEmpty()) {
                            return new cib();
                        }
                        kmb kmbVar2 = (kmb) arrayList.get(0);
                        cdb cdbVar2 = (cdb) c3329mb.f50861c;
                        cdbVar = (cdb) c3329mb.f50861c;
                        iM19882i = (int) qdd.m19882i(cdbVar2.m4562k(c3329mb, kmbVar2).mo3811e().doubleValue());
                        if (iM19882i < 0) {
                            iM19882i = Math.max(0, this.m4744n() + iM19882i);
                        } else if (iM19882i > this.m4744n()) {
                            iM19882i = this.m4744n();
                        }
                        iM4744n2 = this.m4744n();
                        cibVar5 = new cib();
                        if (arrayList.size() > 1) {
                            iMax = Math.max(0, (int) qdd.m19882i(cdbVar.m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue()));
                            if (iMax > 0) {
                                for (i3 = iM19882i; i3 < Math.min(iM4744n2, iM19882i + iMax); i3++) {
                                    cibVar5.m4746r(cibVar5.m4744n(), this.m4745o(iM19882i));
                                    this.m4748t(iM19882i);
                                }
                            }
                            i = 2;
                            if (arrayList.size() > 2) {
                                while (i < arrayList.size()) {
                                    kmbVarM4562k4 = cdbVar.m4562k(c3329mb, (kmb) arrayList.get(i));
                                    if (!(kmbVarM4562k4 instanceof jjb)) {
                                        C3386nv.m17626m("Failed to parse elements to add");
                                        return null;
                                    }
                                    i2 = (iM19882i + i) - 2;
                                    if (i2 >= 0) {
                                        C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 21), "Invalid value index: ", i2));
                                        return null;
                                    }
                                    if (i2 >= this.m4744n()) {
                                        this.m4746r(i2, kmbVarM4562k4);
                                        treeMap2 = treeMap;
                                    } else {
                                        iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                        while (iIntValue >= i2) {
                                            numValueOf = Integer.valueOf(iIntValue);
                                            treeMap3 = treeMap;
                                            kmbVar = (kmb) treeMap3.get(numValueOf);
                                            if (kmbVar != null) {
                                                this.m4746r(iIntValue + 1, kmbVar);
                                                treeMap3.remove(numValueOf);
                                            }
                                            iIntValue--;
                                            treeMap = treeMap3;
                                        }
                                        treeMap2 = treeMap;
                                        this.m4746r(i2, kmbVarM4562k4);
                                    }
                                    i++;
                                    treeMap = treeMap2;
                                }
                            }
                        } else {
                            while (iM19882i < iM4744n2) {
                                cibVar5.m4746r(cibVar5.m4744n(), this.m4745o(iM19882i));
                                this.m4746r(iM19882i, null);
                                iM19882i++;
                            }
                        }
                        return cibVar5;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -678635926:
                    str6 = str8;
                    if (str.equals(str6)) {
                        qdd.m19875b(1, str6, arrayList);
                        kmbVarM4562k5 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k5 instanceof gmb) {
                            C3386nv.m17626m("Callback should be a method");
                            return null;
                        }
                        if (treeMap.size() != 0) {
                            tcd.m21956c(this, c3329mb, (gmb) kmbVarM4562k5, null, null);
                            return kmbVarM4562k;
                        }
                        return kmbVarM4562k;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        qdd.m19877d(2, "lastIndexOf", arrayList);
                        if (!arrayList.isEmpty()) {
                            kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        }
                        kmb kmbVar3 = kmbVarM4562k;
                        iM4744n3 = this.m4744n() - 1;
                        if (arrayList.size() > 1) {
                            kmbVarM4562k6 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                            if (Double.isNaN(kmbVarM4562k6.mo3811e().doubleValue())) {
                                dM19882i = this.m4744n() - 1;
                            } else {
                                dM19882i = qdd.m19882i(kmbVarM4562k6.mo3811e().doubleValue());
                            }
                            if (dM19882i < 0.0d) {
                                dM19882i += (double) this.m4744n();
                            }
                        } else {
                            dM19882i = iM4744n3;
                        }
                        if (dM19882i < 0.0d) {
                            return new bkb(dValueOf);
                        }
                        for (iMin = (int) Math.min(this.m4744n(), dM19882i); iMin >= 0; iMin--) {
                            if (!this.m4747s(iMin) && qdd.m19880g(this.m4745o(iMin), kmbVar3)) {
                                return new bkb(Double.valueOf(iMin));
                            }
                        }
                        return new bkb(dValueOf);
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case -277637751:
                    if (str.equals(obj)) {
                        if (!arrayList.isEmpty()) {
                            cibVar6 = new cib();
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                kmbVarM4562k7 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it2.next());
                                if (!(kmbVarM4562k7 instanceof jjb)) {
                                    C3386nv.m17633t("Argument evaluation failed");
                                    return null;
                                }
                                cibVar6.m4746r(cibVar6.m4744n(), kmbVarM4562k7);
                            }
                            iM4744n4 = cibVar6.m4744n();
                            itM4743m3 = this.m4743m();
                            while (itM4743m3.hasNext()) {
                                Integer num2 = (Integer) itM4743m3.next();
                                cibVar6.m4746r(num2.intValue() + iM4744n4, this.m4745o(num2.intValue()));
                            }
                            treeMap.clear();
                            itM4743m4 = cibVar6.m4743m();
                            while (itM4743m4.hasNext()) {
                                Integer num3 = (Integer) itM4743m4.next();
                                this.m4746r(num3.intValue(), cibVar6.m4745o(num3.intValue()));
                            }
                        }
                        return new bkb(Double.valueOf(this.m4744n()));
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 107868:
                    if (str.equals("map")) {
                        qdd.m19875b(1, "map", arrayList);
                        kmbVarM4562k8 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k8 instanceof gmb) {
                            return this.m4744n() == 0 ? new cib() : tcd.m21956c(this, c3329mb, (gmb) kmbVarM4562k8, null, null);
                        }
                        C3386nv.m17626m("Callback should be a method");
                        return null;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 111185:
                    if (str.equals("pop")) {
                        qdd.m19875b(0, "pop", arrayList);
                        iM4744n5 = this.m4744n();
                        if (iM4744n5 != 0) {
                            int i8 = iM4744n5 - 1;
                            kmb kmbVarM4745o = this.m4745o(i8);
                            this.m4748t(i8);
                            return kmbVarM4745o;
                        }
                        return kmbVarM4562k;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 3267882:
                    if (str.equals("join")) {
                        qdd.m19877d(1, "join", arrayList);
                        if (this.m4744n() == 0) {
                            return kmb.f47522F;
                        }
                        if (arrayList.isEmpty()) {
                            strMo3809c = ",";
                        } else {
                            kmbVarM4562k9 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                            if (!(kmbVarM4562k9 instanceof emb) || (kmbVarM4562k9 instanceof cnb)) {
                                strMo3809c = "";
                            } else {
                                strMo3809c = kmbVarM4562k9.mo3809c();
                            }
                        }
                        return new xmb(this.m4749v(strMo3809c));
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        if (!arrayList.isEmpty()) {
                            it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                this.m4746r(this.m4744n(), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it3.next()));
                            }
                        }
                        return new bkb(Double.valueOf(this.m4744n()));
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 3536116:
                    if (str.equals("some")) {
                        qdd.m19875b(1, "some", arrayList);
                        kmbVarM4562k10 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k10 instanceof vkb) {
                            C3386nv.m17626m("Callback should be a method");
                            return null;
                        }
                        if (this.m4744n() != 0) {
                            vkb vkbVar2 = (vkb) kmbVarM4562k10;
                            itM4743m5 = this.m4743m();
                            while (itM4743m5.hasNext()) {
                                iIntValue2 = ((Integer) itM4743m5.next()).intValue();
                                if (!this.m4747s(iIntValue2) && vkbVar2.mo12757a(c3329mb, Arrays.asList(this.m4745o(iIntValue2), new bkb(Double.valueOf(iIntValue2)), this)).mo3808b().booleanValue()) {
                                    return kmb.f47520D;
                                }
                            }
                        }
                        return kmb.f47521E;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 3536286:
                    if (str.equals(str3)) {
                        qdd.m19877d(1, str3, arrayList);
                        if (this.m4744n() >= 2) {
                            List listM4742l = this.m4742l();
                            if (arrayList.isEmpty()) {
                                vkbVar = null;
                            } else {
                                kmbVarM4562k11 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                                if (kmbVarM4562k11 instanceof vkb) {
                                    C3386nv.m17626m("Comparator should be a method");
                                    return null;
                                }
                                vkbVar = (vkb) kmbVarM4562k11;
                            }
                            Collections.sort(listM4742l, new bo0(2, vkbVar, c3329mb));
                            treeMap.clear();
                            it4 = ((ArrayList) listM4742l).iterator();
                            i4 = 0;
                            while (it4.hasNext()) {
                                this.m4746r(i4, (kmb) it4.next());
                                i4++;
                            }
                        }
                        return this;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 96891675:
                    if (str.equals("every")) {
                        qdd.m19875b(1, "every", arrayList);
                        kmbVarM4562k12 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k12 instanceof gmb) {
                            C3386nv.m17626m("Callback should be a method");
                            return null;
                        }
                        if (this.m4744n() != 0) {
                            break;
                        }
                        return kmb.f47520D;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 109407362:
                    if (str.equals("shift")) {
                        qdd.m19875b(0, "shift", arrayList);
                        if (this.m4744n() != 0) {
                            kmb kmbVarM4745o2 = this.m4745o(0);
                            this.m4748t(0);
                            return kmbVarM4745o2;
                        }
                        return kmbVarM4562k;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 109526418:
                    if (str.equals("slice")) {
                        qdd.m19877d(2, "slice", arrayList);
                        if (arrayList.isEmpty()) {
                            return this.mo3813k();
                        }
                        dM4744n2 = this.m4744n();
                        dM19882i2 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3811e().doubleValue());
                        if (dM19882i2 < 0.0d) {
                            dMin = Math.max(dM19882i2 + dM4744n2, 0.0d);
                        } else {
                            dMin = Math.min(dM19882i2, dM4744n2);
                        }
                        if (arrayList.size() == 2) {
                            dM19882i3 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue());
                            if (dM19882i3 < 0.0d) {
                                dM4744n2 = Math.max(dM4744n2 + dM19882i3, 0.0d);
                            } else {
                                dM4744n2 = Math.min(dM4744n2, dM19882i3);
                            }
                        }
                        cibVar7 = new cib();
                        for (i5 = (int) dMin; i5 < dM4744n2; i5++) {
                            cibVar7.m4746r(cibVar7.m4744n(), this.m4745o(i5));
                        }
                        return cibVar7;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 965561430:
                    if (str.equals("reduceRight")) {
                        return tcd.m21955b(this, c3329mb, arrayList, false);
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 1099846370:
                    if (str.equals("reverse")) {
                        qdd.m19875b(0, "reverse", arrayList);
                        iM4744n6 = this.m4744n();
                        if (iM4744n6 != 0) {
                            for (i6 = 0; i6 < iM4744n6 / 2; i6++) {
                                if (this.m4747s(i6)) {
                                    kmb kmbVarM4745o3 = this.m4745o(i6);
                                    this.m4746r(i6, null);
                                    i7 = (iM4744n6 - 1) - i6;
                                    if (this.m4747s(i7)) {
                                        this.m4746r(i6, this.m4745o(i7));
                                    }
                                    this.m4746r(i7, kmbVarM4745o3);
                                }
                            }
                        }
                        return this;
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        qdd.m19877d(2, "indexOf", arrayList);
                        if (!arrayList.isEmpty()) {
                            kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        }
                        kmb kmbVar4 = kmbVarM4562k;
                        if (arrayList.size() > 1) {
                            dM19882i4 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue());
                            if (dM19882i4 >= this.m4744n()) {
                                return new bkb(dValueOf);
                            }
                            if (dM19882i4 < 0.0d) {
                                dM4744n = ((double) this.m4744n()) + dM19882i4;
                            } else {
                                dM4744n = dM19882i4;
                            }
                        }
                        itM4743m6 = this.m4743m();
                        while (itM4743m6.hasNext()) {
                            int iIntValue3 = ((Integer) itM4743m6.next()).intValue();
                            d = iIntValue3;
                            if (d < dM4744n && qdd.m19880g(this.m4745o(iIntValue3), kmbVar4)) {
                                return new bkb(Double.valueOf(d));
                            }
                        }
                        return new bkb(dValueOf);
                    }
                    C3386nv.m17626m("Command not supported");
                    return null;
                default:
                    C3386nv.m17626m("Command not supported");
                    return null;
            }
        }
        str2 = "filter";
        obj = "unshift";
        str3 = "sort";
        obj2 = "reduce";
        dValueOf = Double.valueOf(-1.0d);
        iHashCode = str.hashCode();
        TreeMap treeMap5 = this.f10145a;
        kmbVarM4562k = kmb.f47523y;
        treeMap = treeMap5;
        dM4744n = 0.0d;
        switch (iHashCode) {
            case -1776922004:
                str4 = str7;
                if (str.equals(str4)) {
                    qdd.m19875b(0, str4, arrayList);
                    return new xmb(this.m4749v(","));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1354795244:
                if (str.equals("concat")) {
                    cibVar = (cib) this.mo3813k();
                    if (!arrayList.isEmpty()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            kmbVarM4562k2 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it.next());
                            if (!(kmbVarM4562k2 instanceof jjb)) {
                                C3386nv.m17633t("Failed evaluation of arguments");
                                return null;
                            }
                            iM4744n = cibVar.m4744n();
                            if (kmbVarM4562k2 instanceof cib) {
                                cibVar2 = (cib) kmbVarM4562k2;
                                itM4743m = cibVar2.m4743m();
                                while (itM4743m.hasNext()) {
                                    Integer num4 = (Integer) itM4743m.next();
                                    cibVar.m4746r(num4.intValue() + iM4744n, cibVar2.m4745o(num4.intValue()));
                                }
                            } else {
                                cibVar.m4746r(iM4744n, kmbVarM4562k2);
                            }
                        }
                    }
                    return cibVar;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -1274492040:
                str5 = str2;
                if (str.equals(str5)) {
                    qdd.m19875b(1, str5, arrayList);
                    kmbVarM4562k3 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmbVarM4562k3 instanceof gmb) {
                        C3386nv.m17626m("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() == 0) {
                        return new cib();
                    }
                    cibVar3 = (cib) this.mo3813k();
                    cib cibVarM21956c2 = tcd.m21956c(this, c3329mb, (gmb) kmbVarM4562k3, null, Boolean.TRUE);
                    cibVar4 = new cib();
                    itM4743m2 = cibVarM21956c2.m4743m();
                    while (itM4743m2.hasNext()) {
                        cibVar4.m4746r(cibVar4.m4744n(), cibVar3.m4745o(((Integer) itM4743m2.next()).intValue()));
                    }
                    return cibVar4;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -934873754:
                if (str.equals(obj2)) {
                    return tcd.m21955b(this, c3329mb, arrayList, true);
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -895859076:
                if (str.equals(str9)) {
                    if (arrayList.isEmpty()) {
                        return new cib();
                    }
                    kmb kmbVar5 = (kmb) arrayList.get(0);
                    cdb cdbVar3 = (cdb) c3329mb.f50861c;
                    cdbVar = (cdb) c3329mb.f50861c;
                    iM19882i = (int) qdd.m19882i(cdbVar3.m4562k(c3329mb, kmbVar5).mo3811e().doubleValue());
                    if (iM19882i < 0) {
                        iM19882i = Math.max(0, this.m4744n() + iM19882i);
                    } else if (iM19882i > this.m4744n()) {
                        iM19882i = this.m4744n();
                    }
                    iM4744n2 = this.m4744n();
                    cibVar5 = new cib();
                    if (arrayList.size() > 1) {
                        iMax = Math.max(0, (int) qdd.m19882i(cdbVar.m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue()));
                        if (iMax > 0) {
                            while (i3 < Math.min(iM4744n2, iM19882i + iMax)) {
                                cibVar5.m4746r(cibVar5.m4744n(), this.m4745o(iM19882i));
                                this.m4748t(iM19882i);
                            }
                        }
                        i = 2;
                        if (arrayList.size() > 2) {
                            while (i < arrayList.size()) {
                                kmbVarM4562k4 = cdbVar.m4562k(c3329mb, (kmb) arrayList.get(i));
                                if (!(kmbVarM4562k4 instanceof jjb)) {
                                    C3386nv.m17626m("Failed to parse elements to add");
                                    return null;
                                }
                                i2 = (iM19882i + i) - 2;
                                if (i2 >= 0) {
                                    C3386nv.m17626m(wq1.m24124t(new StringBuilder(String.valueOf(i2).length() + 21), "Invalid value index: ", i2));
                                    return null;
                                }
                                if (i2 >= this.m4744n()) {
                                    this.m4746r(i2, kmbVarM4562k4);
                                    treeMap2 = treeMap;
                                } else {
                                    iIntValue = ((Integer) treeMap.lastKey()).intValue();
                                    while (iIntValue >= i2) {
                                        numValueOf = Integer.valueOf(iIntValue);
                                        treeMap3 = treeMap;
                                        kmbVar = (kmb) treeMap3.get(numValueOf);
                                        if (kmbVar != null) {
                                            this.m4746r(iIntValue + 1, kmbVar);
                                            treeMap3.remove(numValueOf);
                                        }
                                        iIntValue--;
                                        treeMap = treeMap3;
                                    }
                                    treeMap2 = treeMap;
                                    this.m4746r(i2, kmbVarM4562k4);
                                }
                                i++;
                                treeMap = treeMap2;
                            }
                        }
                    } else {
                        while (iM19882i < iM4744n2) {
                            cibVar5.m4746r(cibVar5.m4744n(), this.m4745o(iM19882i));
                            this.m4746r(iM19882i, null);
                            iM19882i++;
                        }
                    }
                    return cibVar5;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -678635926:
                str6 = str8;
                if (str.equals(str6)) {
                    qdd.m19875b(1, str6, arrayList);
                    kmbVarM4562k5 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmbVarM4562k5 instanceof gmb) {
                        C3386nv.m17626m("Callback should be a method");
                        return null;
                    }
                    if (treeMap.size() != 0) {
                        tcd.m21956c(this, c3329mb, (gmb) kmbVarM4562k5, null, null);
                        return kmbVarM4562k;
                    }
                    return kmbVarM4562k;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    qdd.m19877d(2, "lastIndexOf", arrayList);
                    if (!arrayList.isEmpty()) {
                        kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    }
                    kmb kmbVar6 = kmbVarM4562k;
                    iM4744n3 = this.m4744n() - 1;
                    if (arrayList.size() > 1) {
                        kmbVarM4562k6 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
                        if (Double.isNaN(kmbVarM4562k6.mo3811e().doubleValue())) {
                            dM19882i = this.m4744n() - 1;
                        } else {
                            dM19882i = qdd.m19882i(kmbVarM4562k6.mo3811e().doubleValue());
                        }
                        if (dM19882i < 0.0d) {
                            dM19882i += (double) this.m4744n();
                        }
                    } else {
                        dM19882i = iM4744n3;
                    }
                    if (dM19882i < 0.0d) {
                        return new bkb(dValueOf);
                    }
                    while (iMin >= 0) {
                        if (!this.m4747s(iMin)) {
                        }
                    }
                    return new bkb(dValueOf);
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case -277637751:
                if (str.equals(obj)) {
                    if (!arrayList.isEmpty()) {
                        cibVar6 = new cib();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            kmbVarM4562k7 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it2.next());
                            if (!(kmbVarM4562k7 instanceof jjb)) {
                                C3386nv.m17633t("Argument evaluation failed");
                                return null;
                            }
                            cibVar6.m4746r(cibVar6.m4744n(), kmbVarM4562k7);
                        }
                        iM4744n4 = cibVar6.m4744n();
                        itM4743m3 = this.m4743m();
                        while (itM4743m3.hasNext()) {
                            Integer num5 = (Integer) itM4743m3.next();
                            cibVar6.m4746r(num5.intValue() + iM4744n4, this.m4745o(num5.intValue()));
                        }
                        treeMap.clear();
                        itM4743m4 = cibVar6.m4743m();
                        while (itM4743m4.hasNext()) {
                            Integer num6 = (Integer) itM4743m4.next();
                            this.m4746r(num6.intValue(), cibVar6.m4745o(num6.intValue()));
                        }
                    }
                    return new bkb(Double.valueOf(this.m4744n()));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 107868:
                if (str.equals("map")) {
                    qdd.m19875b(1, "map", arrayList);
                    kmbVarM4562k8 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmbVarM4562k8 instanceof gmb) {
                        if (this.m4744n() == 0) {
                        }
                    }
                    C3386nv.m17626m("Callback should be a method");
                    return null;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 111185:
                if (str.equals("pop")) {
                    qdd.m19875b(0, "pop", arrayList);
                    iM4744n5 = this.m4744n();
                    if (iM4744n5 != 0) {
                        int i9 = iM4744n5 - 1;
                        kmb kmbVarM4745o4 = this.m4745o(i9);
                        this.m4748t(i9);
                        return kmbVarM4745o4;
                    }
                    return kmbVarM4562k;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 3267882:
                if (str.equals("join")) {
                    qdd.m19877d(1, "join", arrayList);
                    if (this.m4744n() == 0) {
                        return kmb.f47522F;
                    }
                    if (arrayList.isEmpty()) {
                        kmbVarM4562k9 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                        if (kmbVarM4562k9 instanceof emb) {
                            strMo3809c = "";
                        } else {
                            strMo3809c = "";
                        }
                    } else {
                        strMo3809c = ",";
                    }
                    return new xmb(this.m4749v(strMo3809c));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 3452698:
                if (str.equals("push")) {
                    if (!arrayList.isEmpty()) {
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            this.m4746r(this.m4744n(), ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) it3.next()));
                        }
                    }
                    return new bkb(Double.valueOf(this.m4744n()));
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 3536116:
                if (str.equals("some")) {
                    qdd.m19875b(1, "some", arrayList);
                    kmbVarM4562k10 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmbVarM4562k10 instanceof vkb) {
                        C3386nv.m17626m("Callback should be a method");
                        return null;
                    }
                    if (this.m4744n() != 0) {
                        vkb vkbVar3 = (vkb) kmbVarM4562k10;
                        itM4743m5 = this.m4743m();
                        while (itM4743m5.hasNext()) {
                            iIntValue2 = ((Integer) itM4743m5.next()).intValue();
                            if (!this.m4747s(iIntValue2)) {
                            }
                        }
                    }
                    return kmb.f47521E;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 3536286:
                if (str.equals(str3)) {
                    qdd.m19877d(1, str3, arrayList);
                    if (this.m4744n() >= 2) {
                        List listM4742l2 = this.m4742l();
                        if (arrayList.isEmpty()) {
                            kmbVarM4562k11 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                            if (kmbVarM4562k11 instanceof vkb) {
                                C3386nv.m17626m("Comparator should be a method");
                                return null;
                            }
                            vkbVar = (vkb) kmbVarM4562k11;
                        } else {
                            vkbVar = null;
                        }
                        Collections.sort(listM4742l2, new bo0(2, vkbVar, c3329mb));
                        treeMap.clear();
                        it4 = ((ArrayList) listM4742l2).iterator();
                        i4 = 0;
                        while (it4.hasNext()) {
                            this.m4746r(i4, (kmb) it4.next());
                            i4++;
                        }
                    }
                    return this;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 96891675:
                if (str.equals("every")) {
                    qdd.m19875b(1, "every", arrayList);
                    kmbVarM4562k12 = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    if (kmbVarM4562k12 instanceof gmb) {
                        C3386nv.m17626m("Callback should be a method");
                        return null;
                    }
                    if (this.m4744n() != 0) {
                        break;
                    }
                    return kmb.f47520D;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 109407362:
                if (str.equals("shift")) {
                    qdd.m19875b(0, "shift", arrayList);
                    if (this.m4744n() != 0) {
                        kmb kmbVarM4745o5 = this.m4745o(0);
                        this.m4748t(0);
                        return kmbVarM4745o5;
                    }
                    return kmbVarM4562k;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 109526418:
                if (str.equals("slice")) {
                    qdd.m19877d(2, "slice", arrayList);
                    if (arrayList.isEmpty()) {
                        return this.mo3813k();
                    }
                    dM4744n2 = this.m4744n();
                    dM19882i2 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3811e().doubleValue());
                    if (dM19882i2 < 0.0d) {
                        dMin = Math.max(dM19882i2 + dM4744n2, 0.0d);
                    } else {
                        dMin = Math.min(dM19882i2, dM4744n2);
                    }
                    if (arrayList.size() == 2) {
                        dM19882i3 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue());
                        if (dM19882i3 < 0.0d) {
                            dM4744n2 = Math.max(dM4744n2 + dM19882i3, 0.0d);
                        } else {
                            dM4744n2 = Math.min(dM4744n2, dM19882i3);
                        }
                    }
                    cibVar7 = new cib();
                    while (i5 < dM4744n2) {
                        cibVar7.m4746r(cibVar7.m4744n(), this.m4745o(i5));
                    }
                    return cibVar7;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 965561430:
                if (str.equals("reduceRight")) {
                    return tcd.m21955b(this, c3329mb, arrayList, false);
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 1099846370:
                if (str.equals("reverse")) {
                    qdd.m19875b(0, "reverse", arrayList);
                    iM4744n6 = this.m4744n();
                    if (iM4744n6 != 0) {
                        while (i6 < iM4744n6 / 2) {
                            if (this.m4747s(i6)) {
                                kmb kmbVarM4745o6 = this.m4745o(i6);
                                this.m4746r(i6, null);
                                i7 = (iM4744n6 - 1) - i6;
                                if (this.m4747s(i7)) {
                                    this.m4746r(i6, this.m4745o(i7));
                                }
                                this.m4746r(i7, kmbVarM4745o6);
                            }
                        }
                    }
                    return this;
                }
                C3386nv.m17626m("Command not supported");
                return null;
            case 1943291465:
                if (str.equals("indexOf")) {
                    qdd.m19877d(2, "indexOf", arrayList);
                    if (!arrayList.isEmpty()) {
                        kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
                    }
                    kmb kmbVar7 = kmbVarM4562k;
                    if (arrayList.size() > 1) {
                        dM19882i4 = qdd.m19882i(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1)).mo3811e().doubleValue());
                        if (dM19882i4 >= this.m4744n()) {
                            return new bkb(dValueOf);
                        }
                        if (dM19882i4 < 0.0d) {
                            dM4744n = ((double) this.m4744n()) + dM19882i4;
                        } else {
                            dM4744n = dM19882i4;
                        }
                    }
                    itM4743m6 = this.m4743m();
                    while (itM4743m6.hasNext()) {
                        int iIntValue4 = ((Integer) itM4743m6.next()).intValue();
                        d = iIntValue4;
                        if (d < dM4744n) {
                        }
                    }
                    return new bkb(dValueOf);
                }
                C3386nv.m17626m("Command not supported");
                return null;
            default:
                C3386nv.m17626m("Command not supported");
                return null;
        }
    }

    public final int hashCode() {
        return this.f10145a.hashCode() * 31;
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: i */
    public final void mo3881i(String str, kmb kmbVar) {
        TreeMap treeMap = this.f10146b;
        if (kmbVar == null) {
            treeMap.remove(str);
        } else {
            treeMap.put(str, kmbVar);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tmb(this, 2);
    }

    @Override // p000.xlb
    /* JADX INFO: renamed from: j */
    public final boolean mo3882j(String str) {
        return "length".equals(str) || this.f10146b.containsKey(str);
    }

    @Override // p000.kmb
    /* JADX INFO: renamed from: k */
    public final kmb mo3813k() {
        cib cibVar = new cib();
        for (Map.Entry entry : this.f10145a.entrySet()) {
            boolean z = entry.getValue() instanceof xlb;
            TreeMap treeMap = cibVar.f10145a;
            if (z) {
                treeMap.put((Integer) entry.getKey(), (kmb) entry.getValue());
            } else {
                treeMap.put((Integer) entry.getKey(), ((kmb) entry.getValue()).mo3813k());
            }
        }
        return cibVar;
    }

    /* JADX INFO: renamed from: l */
    public final List m4742l() {
        ArrayList arrayList = new ArrayList(m4744n());
        for (int i = 0; i < m4744n(); i++) {
            arrayList.add(m4745o(i));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public final Iterator m4743m() {
        return this.f10145a.keySet().iterator();
    }

    /* JADX INFO: renamed from: n */
    public final int m4744n() {
        TreeMap treeMap = this.f10145a;
        if (treeMap.isEmpty()) {
            return 0;
        }
        return ((Integer) treeMap.lastKey()).intValue() + 1;
    }

    /* JADX INFO: renamed from: o */
    public final kmb m4745o(int i) {
        kmb kmbVar;
        if (i < m4744n()) {
            return (!m4747s(i) || (kmbVar = (kmb) this.f10145a.get(Integer.valueOf(i))) == null) ? kmb.f47523y : kmbVar;
        }
        v63.m23143u("Attempting to get element outside of current array");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final void m4746r(int i, kmb kmbVar) {
        if (i > 32468) {
            C3386nv.m17633t("Array too large");
            return;
        }
        if (i < 0) {
            v63.m23143u(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
            return;
        }
        TreeMap treeMap = this.f10145a;
        if (kmbVar == null) {
            treeMap.remove(Integer.valueOf(i));
        } else {
            treeMap.put(Integer.valueOf(i), kmbVar);
        }
    }

    /* JADX INFO: renamed from: s */
    public final boolean m4747s(int i) {
        if (i >= 0) {
            TreeMap treeMap = this.f10145a;
            if (i <= ((Integer) treeMap.lastKey()).intValue()) {
                return treeMap.containsKey(Integer.valueOf(i));
            }
        }
        v63.m23143u(wq1.m24124t(new StringBuilder(String.valueOf(i).length() + 21), "Out of bounds index: ", i));
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final void m4748t(int i) {
        TreeMap treeMap = this.f10145a;
        int iIntValue = ((Integer) treeMap.lastKey()).intValue();
        if (i > iIntValue || i < 0) {
            return;
        }
        treeMap.remove(Integer.valueOf(i));
        if (i == iIntValue) {
            int i2 = i - 1;
            Integer numValueOf = Integer.valueOf(i2);
            if (treeMap.containsKey(numValueOf) || i2 < 0) {
                return;
            }
            treeMap.put(numValueOf, kmb.f47523y);
            return;
        }
        while (true) {
            i++;
            if (i > ((Integer) treeMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i);
            kmb kmbVar = (kmb) treeMap.get(numValueOf2);
            if (kmbVar != null) {
                treeMap.put(Integer.valueOf(i - 1), kmbVar);
                treeMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return m4749v(",");
    }

    /* JADX INFO: renamed from: v */
    public final String m4749v(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.f10145a.isEmpty()) {
            int i = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i >= m4744n()) {
                    break;
                }
                kmb kmbVarM4745o = m4745o(i);
                sb.append(str2);
                if (!(kmbVarM4745o instanceof cnb) && !(kmbVarM4745o instanceof emb)) {
                    sb.append(kmbVarM4745o.mo3809c());
                }
                i++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public cib() {
        this.f10145a = new TreeMap();
        this.f10146b = new TreeMap();
    }
}
