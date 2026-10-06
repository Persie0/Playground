package p000;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Objects;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lil extends lij implements lho, lhw, lhv, ljh {

    /* JADX INFO: renamed from: b */
    private static final nbh f38311b = nbh.m17259h("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl");

    /* JADX INFO: renamed from: a */
    final AtomicBoolean f38312a = new AtomicBoolean();

    /* JADX INFO: renamed from: c */
    private final Context f38313c;

    /* JADX INFO: renamed from: d */
    private final lhz f38314d;

    /* JADX INFO: renamed from: e */
    private final Executor f38315e;

    /* JADX INFO: renamed from: f */
    private final liv f38316f;

    /* JADX INFO: renamed from: g */
    private final lie f38317g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f38318h;

    /* JADX INFO: renamed from: i */
    private final mbl f38319i;

    public lil(ljf ljfVar, Context context, lhz lhzVar, npv npvVar, ohb ohbVar, liv livVar, lie lieVar, oju ojuVar, Executor executor) {
        new ConcurrentHashMap();
        this.f38318h = new AtomicBoolean(false);
        this.f38319i = ljfVar.m15526b(executor, ohbVar, ojuVar);
        this.f38313c = context;
        this.f38314d = lhzVar;
        this.f38315e = npvVar;
        this.f38316f = livVar;
        this.f38317g = lieVar;
    }

    /* JADX INFO: renamed from: ap */
    private final nps m15459ap(final oyz oyzVar) {
        return kxk.m14970P(new nol() { // from class: lik
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                return this.f38309a.m15460al(oyzVar, null);
            }
        }, this.f38315e);
    }

    @Override // p000.lhw
    /* JADX INFO: renamed from: a */
    public void mo15357a(Activity activity) {
        if (this.f38312a.get()) {
            return;
        }
        m15462an();
    }

    /* JADX WARN: Code duplicated, block: B:162:0x031f  */
    /* JADX WARN: Code duplicated, block: B:164:0x032b  */
    /* JADX WARN: Code duplicated, block: B:165:0x032e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0353 A[LOOP:0: B:166:0x0347->B:168:0x0353, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:172:0x037a A[LOOP:1: B:170:0x036e->B:172:0x037a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:176:0x03a1 A[LOOP:2: B:174:0x0395->B:176:0x03a1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x03c8 A[LOOP:3: B:178:0x03bc->B:180:0x03c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:184:0x03ef A[LOOP:4: B:182:0x03e3->B:184:0x03ef, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:188:0x0416 A[LOOP:5: B:186:0x040a->B:188:0x0416, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:192:0x043c A[LOOP:6: B:190:0x0430->B:192:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x0484  */
    /* JADX WARN: Code duplicated, block: B:206:0x0498  */
    /* JADX WARN: Code duplicated, block: B:208:0x049e  */
    /* JADX WARN: Code duplicated, block: B:212:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:214:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:218:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:220:0x04d5  */
    /* JADX WARN: Code duplicated, block: B:224:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:226:0x04f0  */
    /* JADX WARN: Code duplicated, block: B:230:0x0505  */
    /* JADX WARN: Code duplicated, block: B:232:0x0511  */
    /* JADX WARN: Code duplicated, block: B:236:0x0528  */
    /* JADX WARN: Code duplicated, block: B:239:0x054b  */
    /* JADX WARN: Code duplicated, block: B:242:0x056a  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ksi] */
    /* JADX WARN: Type inference failed for: r6v22, types: [java.lang.Object, ksi] */
    /* JADX INFO: renamed from: al */
    public /* synthetic */ nps m15460al(oyz oyzVar, lgp lgpVar) throws IOException {
        Object objMo17767b;
        oyz oyzVar2;
        liu liuVar;
        ozk ozkVar;
        int i;
        boolean zCommit;
        Long l;
        Object obj;
        ozj ozjVarM15443m;
        nxl nxlVar;
        Object obj2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ozj ozjVar;
        nxl nxlVarM18137O;
        nxq nxqVar;
        oyz oyzVar3;
        String str;
        ozk ozkVar2;
        oyz oyzVar4;
        Long l2;
        nxl nxlVarM18137O2;
        nxl nxlVarM18137O3;
        int length;
        pat patVar = null;
        if (!this.f38319i.m16299c(null)) {
            return npp.f44031a;
        }
        lij.m15452v();
        synchronized (this.f38316f) {
            Object obj3 = this.f38316f.f38339a;
            nzd nzdVar = (nzd) low.f38855j.m18143ad(7);
            lij.m15452v();
            byte[] bArrDecode = !kuh.m14889d(((lnk) obj3).f38755b) ? null : Base64.decode(((SharedPreferences) ((lnk) obj3).f38756c.get()).getString("primes.battery.snapshot", ""), 0);
            if (bArrDecode == null || (length = bArrDecode.length) == 0) {
                objMo17767b = null;
            } else if (bArrDecode[0] == 1) {
                try {
                    objMo17767b = nzdVar.mo17767b(bArrDecode, length - 1, nxf.m18011a());
                } catch (nyb e) {
                    ((nbe) ((nbe) ((nbe) lnk.f38754a.m17252c()).mo17283h(e)).mo17276G((char) 4569)).mo17290o("failure reading proto");
                    objMo17767b = null;
                }
            } else {
                ((nbe) ((nbe) lnk.f38754a.m17252c()).mo17276G((char) 4568)).mo17290o("wrong header");
                objMo17767b = null;
            }
            low lowVar = (low) objMo17767b;
            if (lowVar == null) {
                liuVar = null;
            } else {
                if ((lowVar.f38857a & 32) != 0) {
                    oyz oyzVarM19210b = oyz.m19210b(lowVar.f38863g);
                    if (oyzVarM19210b == null) {
                        oyzVarM19210b = oyz.UNKNOWN;
                    }
                    oyzVar2 = oyzVarM19210b;
                } else {
                    oyzVar2 = null;
                }
                ozj ozjVar2 = lowVar.f38858b;
                ozj ozjVar3 = ozjVar2 == null ? ozj.f46959an : ozjVar2;
                Long lValueOf = (lowVar.f38857a & 2) != 0 ? Long.valueOf(lowVar.f38859c) : null;
                Long lValueOf2 = (lowVar.f38857a & 4) != 0 ? Long.valueOf(lowVar.f38860d) : null;
                Long lValueOf3 = (lowVar.f38857a & 8) != 0 ? Long.valueOf(lowVar.f38861e) : null;
                Long lValueOf4 = (lowVar.f38857a & 16) != 0 ? Long.valueOf(lowVar.f38862f) : null;
                int i8 = lowVar.f38857a;
                String str2 = (i8 & 64) != 0 ? lowVar.f38864h : null;
                if ((i8 & 256) != 0) {
                    ozk ozkVar3 = lowVar.f38865i;
                    ozkVar = ozkVar3 == null ? ozk.f47026a : ozkVar3;
                } else {
                    ozkVar = null;
                }
                liuVar = new liu(ozjVar3, lValueOf, lValueOf2, lValueOf3, lValueOf4, oyzVar2, str2, ozkVar);
            }
        }
        lie lieVar = this.f38317g;
        Long lValueOf5 = Long.valueOf(lieVar.f38295b.mo14816b());
        Long lValueOf6 = Long.valueOf(lieVar.f38295b.mo14815a());
        SystemHealthManager systemHealthManager = (SystemHealthManager) ((Context) ((lpe) lieVar.f38294a).f38884c).getSystemService("systemhealth");
        HealthStats healthStatsTakeMyUidSnapshot = systemHealthManager != null ? systemHealthManager.takeMyUidSnapshot() : null;
        ((lgj) lieVar.f38297d).get();
        liu liuVarM15433c = lij.m15433c(lValueOf5, lValueOf6, healthStatsTakeMyUidSnapshot, oyzVar, lieVar);
        synchronized (this.f38316f) {
            liv livVar = this.f38316f;
            nxl nxlVarM18137O4 = low.f38855j.m18137O();
            ozj ozjVar4 = liuVarM15433c.f38331a;
            if (ozjVar4 != null) {
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar2 = (low) nxlVarM18137O4.f44974b;
                lowVar2.f38858b = ozjVar4;
                lowVar2.f38857a |= 1;
            }
            Long l3 = liuVarM15433c.f38332b;
            if (l3 != null) {
                long jLongValue = l3.longValue();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar3 = (low) nxlVarM18137O4.f44974b;
                lowVar3.f38857a |= 2;
                lowVar3.f38859c = jLongValue;
            }
            Long l4 = liuVarM15433c.f38333c;
            if (l4 != null) {
                long jLongValue2 = l4.longValue();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar4 = (low) nxlVarM18137O4.f44974b;
                lowVar4.f38857a |= 4;
                lowVar4.f38860d = jLongValue2;
            }
            Long l5 = liuVarM15433c.f38334d;
            if (l5 != null) {
                long jLongValue3 = l5.longValue();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar5 = (low) nxlVarM18137O4.f44974b;
                lowVar5.f38857a |= 8;
                lowVar5.f38861e = jLongValue3;
            }
            Long l6 = liuVarM15433c.f38335e;
            if (l6 != null) {
                long jLongValue4 = l6.longValue();
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar6 = (low) nxlVarM18137O4.f44974b;
                lowVar6.f38857a |= 16;
                lowVar6.f38862f = jLongValue4;
            }
            oyz oyzVar5 = liuVarM15433c.f38336f;
            if (oyzVar5 != null) {
                int i9 = oyzVar5.f46900h;
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar7 = (low) nxlVarM18137O4.f44974b;
                lowVar7.f38857a |= 32;
                lowVar7.f38863g = i9;
            }
            String str3 = liuVarM15433c.f38337g;
            if (str3 != null) {
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar8 = (low) nxlVarM18137O4.f44974b;
                lowVar8.f38857a |= 64;
                lowVar8.f38864h = str3;
            }
            ozk ozkVar4 = liuVarM15433c.f38338h;
            if (ozkVar4 != null) {
                if (!nxlVarM18137O4.f44974b.m18142ac()) {
                    nxlVarM18137O4.mo18106p();
                }
                low lowVar9 = (low) nxlVarM18137O4.f44974b;
                lowVar9.f38865i = ozkVar4;
                lowVar9.f38857a |= 256;
            }
            Object obj4 = livVar.f38339a;
            low lowVar10 = (low) nxlVarM18137O4.mo18103l();
            lowVar10.getClass();
            byte[] bArrMo17760J = lowVar10.mo17760J();
            lij.m15452v();
            if (kuh.m14889d(((lnk) obj4).f38755b)) {
                int length2 = bArrMo17760J.length;
                byte[] bArr = new byte[length2 + 1];
                bArr[0] = 1;
                System.arraycopy(bArrMo17760J, 0, bArr, 1, length2);
                i = 0;
                zCommit = ((SharedPreferences) ((lnk) obj4).f38756c.get()).edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
            } else {
                zCommit = false;
                i = 0;
            }
        }
        if (!zCommit) {
            this.f38314d.m15361b(this);
            synchronized (this.f38316f) {
                Object obj5 = this.f38316f.f38339a;
                lij.m15452v();
                if (kuh.m14889d(((lnk) obj5).f38755b)) {
                    ((SharedPreferences) ((lnk) obj5).f38756c.get()).edit().remove("primes.battery.snapshot").commit();
                }
            }
            throw new IOException("Failure storing persistent snapshot and helper data");
        }
        lie lieVar2 = this.f38317g;
        if (liuVar != null && Objects.equals(liuVar.f38334d, liuVarM15433c.f38334d) && Objects.equals(liuVar.f38335e, liuVarM15433c.f38335e) && liuVar.f38332b != null && liuVar.f38333c != null && (l = liuVarM15433c.f38332b) != null && liuVarM15433c.f38333c != null) {
            long jLongValue5 = l.longValue() - liuVar.f38332b.longValue();
            long jLongValue6 = liuVarM15433c.f38333c.longValue() - liuVar.f38333c.longValue();
            if (jLongValue6 > 0) {
                long jAbs = Math.abs(jLongValue5 - jLongValue6);
                if (jAbs >= 25) {
                    double d = jLongValue6;
                    double d2 = jAbs;
                    Double.isNaN(d2);
                    Double.isNaN(d);
                    if (d2 / d <= 3.472222222222222E-5d) {
                        obj = lieVar2.f38294a;
                        ozjVarM15443m = lij.m15443m(liuVarM15433c.f38331a, liuVar.f38331a);
                        if (ozjVarM15443m == null) {
                            ozjVar = null;
                        } else {
                            nxlVar = (nxl) ozjVarM15443m.m18143ad(5);
                            nxlVar.m18108s(ozjVarM15443m);
                            obj2 = ((lpe) obj).f38883b;
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47006g);
                            for (i2 = 0; i2 < ((ozj) nxlVar.f44974b).f47006g.size(); i2++) {
                                nxlVar.m18091au(i2, ((lim) obj2).m15465b(nxlVar.m18059V(i2)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47007h);
                            for (i3 = 0; i3 < ((ozj) nxlVar.f44974b).f47007h.size(); i3++) {
                                nxlVar.m18092av(i3, ((lim) obj2).m15465b(nxlVar.m18060W(i3)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47008i);
                            for (i4 = 0; i4 < ((ozj) nxlVar.f44974b).f47008i.size(); i4++) {
                                nxlVar.m18093aw(i4, ((lim) obj2).m15465b(nxlVar.m18061X(i4)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47009j);
                            for (i5 = 0; i5 < ((ozj) nxlVar.f44974b).f47009j.size(); i5++) {
                                nxlVar.m18090at(i5, ((lim) obj2).m15465b(nxlVar.m18062Y(i5)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47010k);
                            for (i6 = 0; i6 < ((ozj) nxlVar.f44974b).f47010k.size(); i6++) {
                                nxlVar.m18087aq(i6, ((lim) obj2).m15465b(nxlVar.m18063Z(i6)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47011l);
                            for (i7 = 0; i7 < ((ozj) nxlVar.f44974b).f47011l.size(); i7++) {
                                nxlVar.m18084an(i7, ((lim) obj2).m15465b(nxlVar.m18071aa(i7)));
                            }
                            Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47013n);
                            while (i < ((ozj) nxlVar.f44974b).f47013n.size()) {
                                nxlVar.m18086ap(i, ((lim) obj2).m15465b(nxlVar.m18072ab(i)));
                                i++;
                            }
                            ozjVar = (ozj) nxlVar.mo18103l();
                        }
                        if (ozjVar != null && (ozjVar.f46987a & 1) != 0 && ozjVar.f47002c > 0) {
                            nxlVarM18137O = oza.f46901k.m18137O();
                            Long l7 = liuVarM15433c.f38332b;
                            l7.getClass();
                            long jLongValue7 = l7.longValue();
                            Long l8 = liuVar.f38332b;
                            l8.getClass();
                            long jLongValue8 = jLongValue7 - l8.longValue();
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            oza ozaVar = (oza) nxqVar;
                            ozaVar.f46903a |= 64;
                            ozaVar.f46910h = jLongValue8;
                            oyzVar3 = liuVar.f38336f;
                            if (oyzVar3 != null) {
                                if (!nxqVar.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                oza ozaVar2 = (oza) nxlVarM18137O.f44974b;
                                ozaVar2.f46904b = oyzVar3.f46900h;
                                ozaVar2.f46903a |= 1;
                            }
                            str = liuVar.f38337g;
                            if (str != null) {
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                oza ozaVar3 = (oza) nxlVarM18137O.f44974b;
                                ozaVar3.f46903a |= 8;
                                ozaVar3.f46907e = str;
                            }
                            ozkVar2 = liuVar.f38338h;
                            if (ozkVar2 != null) {
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                oza ozaVar4 = (oza) nxlVarM18137O.f44974b;
                                ozaVar4.f46908f = ozkVar2;
                                ozaVar4.f46903a |= 16;
                            }
                            oyzVar4 = liuVarM15433c.f38336f;
                            if (oyzVar4 != null) {
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                oza ozaVar5 = (oza) nxlVarM18137O.f44974b;
                                ozaVar5.f46909g = oyzVar4.f46900h;
                                ozaVar5.f46903a |= 32;
                            }
                            l2 = liuVarM15433c.f38332b;
                            if (l2 != null) {
                                long jLongValue9 = l2.longValue();
                                if (!nxlVarM18137O.f44974b.m18142ac()) {
                                    nxlVarM18137O.mo18106p();
                                }
                                oza ozaVar6 = (oza) nxlVarM18137O.f44974b;
                                ozaVar6.f46903a |= 256;
                                ozaVar6.f46912j = jLongValue9;
                            }
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar7 = (oza) nxlVarM18137O.f44974b;
                            ozaVar7.f46911i = ozjVar;
                            ozaVar7.f46903a |= 128;
                            nxlVarM18137O2 = pat.f47274u.m18137O();
                            nxlVarM18137O3 = ozb.f46914c.m18137O();
                            if (!nxlVarM18137O3.f44974b.m18142ac()) {
                                nxlVarM18137O3.mo18106p();
                            }
                            ozb ozbVar = (ozb) nxlVarM18137O3.f44974b;
                            oza ozaVar8 = (oza) nxlVarM18137O.mo18103l();
                            ozaVar8.getClass();
                            ozbVar.f46917b = ozaVar8;
                            ozbVar.f46916a |= 1;
                            if (!nxlVarM18137O2.f44974b.m18142ac()) {
                                nxlVarM18137O2.mo18106p();
                            }
                            pat patVar2 = (pat) nxlVarM18137O2.f44974b;
                            ozb ozbVar2 = (ozb) nxlVarM18137O3.mo18103l();
                            ozbVar2.getClass();
                            patVar2.f47284i = ozbVar2;
                            patVar2.f47276a |= 256;
                            patVar = (pat) nxlVarM18137O2.mo18103l();
                        }
                    }
                } else {
                    obj = lieVar2.f38294a;
                    ozjVarM15443m = lij.m15443m(liuVarM15433c.f38331a, liuVar.f38331a);
                    if (ozjVarM15443m == null) {
                        ozjVar = null;
                    } else {
                        nxlVar = (nxl) ozjVarM15443m.m18143ad(5);
                        nxlVar.m18108s(ozjVarM15443m);
                        obj2 = ((lpe) obj).f38883b;
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47006g);
                        while (i2 < ((ozj) nxlVar.f44974b).f47006g.size()) {
                            nxlVar.m18091au(i2, ((lim) obj2).m15465b(nxlVar.m18059V(i2)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47007h);
                        while (i3 < ((ozj) nxlVar.f44974b).f47007h.size()) {
                            nxlVar.m18092av(i3, ((lim) obj2).m15465b(nxlVar.m18060W(i3)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47008i);
                        while (i4 < ((ozj) nxlVar.f44974b).f47008i.size()) {
                            nxlVar.m18093aw(i4, ((lim) obj2).m15465b(nxlVar.m18061X(i4)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47009j);
                        while (i5 < ((ozj) nxlVar.f44974b).f47009j.size()) {
                            nxlVar.m18090at(i5, ((lim) obj2).m15465b(nxlVar.m18062Y(i5)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47010k);
                        while (i6 < ((ozj) nxlVar.f44974b).f47010k.size()) {
                            nxlVar.m18087aq(i6, ((lim) obj2).m15465b(nxlVar.m18063Z(i6)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47011l);
                        while (i7 < ((ozj) nxlVar.f44974b).f47011l.size()) {
                            nxlVar.m18084an(i7, ((lim) obj2).m15465b(nxlVar.m18071aa(i7)));
                        }
                        Collections.unmodifiableList(((ozj) nxlVar.f44974b).f47013n);
                        while (i < ((ozj) nxlVar.f44974b).f47013n.size()) {
                            nxlVar.m18086ap(i, ((lim) obj2).m15465b(nxlVar.m18072ab(i)));
                            i++;
                        }
                        ozjVar = (ozj) nxlVar.mo18103l();
                    }
                    if (ozjVar != null) {
                        nxlVarM18137O = oza.f46901k.m18137O();
                        Long l9 = liuVarM15433c.f38332b;
                        l9.getClass();
                        long jLongValue10 = l9.longValue();
                        Long l10 = liuVar.f38332b;
                        l10.getClass();
                        long jLongValue11 = jLongValue10 - l10.longValue();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        nxqVar = nxlVarM18137O.f44974b;
                        oza ozaVar9 = (oza) nxqVar;
                        ozaVar9.f46903a |= 64;
                        ozaVar9.f46910h = jLongValue11;
                        oyzVar3 = liuVar.f38336f;
                        if (oyzVar3 != null) {
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar10 = (oza) nxlVarM18137O.f44974b;
                            ozaVar10.f46904b = oyzVar3.f46900h;
                            ozaVar10.f46903a |= 1;
                        }
                        str = liuVar.f38337g;
                        if (str != null) {
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar11 = (oza) nxlVarM18137O.f44974b;
                            ozaVar11.f46903a |= 8;
                            ozaVar11.f46907e = str;
                        }
                        ozkVar2 = liuVar.f38338h;
                        if (ozkVar2 != null) {
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar12 = (oza) nxlVarM18137O.f44974b;
                            ozaVar12.f46908f = ozkVar2;
                            ozaVar12.f46903a |= 16;
                        }
                        oyzVar4 = liuVarM15433c.f38336f;
                        if (oyzVar4 != null) {
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar13 = (oza) nxlVarM18137O.f44974b;
                            ozaVar13.f46909g = oyzVar4.f46900h;
                            ozaVar13.f46903a |= 32;
                        }
                        l2 = liuVarM15433c.f38332b;
                        if (l2 != null) {
                            long jLongValue12 = l2.longValue();
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            oza ozaVar14 = (oza) nxlVarM18137O.f44974b;
                            ozaVar14.f46903a |= 256;
                            ozaVar14.f46912j = jLongValue12;
                        }
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        oza ozaVar15 = (oza) nxlVarM18137O.f44974b;
                        ozaVar15.f46911i = ozjVar;
                        ozaVar15.f46903a |= 128;
                        nxlVarM18137O2 = pat.f47274u.m18137O();
                        nxlVarM18137O3 = ozb.f46914c.m18137O();
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        ozb ozbVar3 = (ozb) nxlVarM18137O3.f44974b;
                        oza ozaVar16 = (oza) nxlVarM18137O.mo18103l();
                        ozaVar16.getClass();
                        ozbVar3.f46917b = ozaVar16;
                        ozbVar3.f46916a |= 1;
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        pat patVar3 = (pat) nxlVarM18137O2.f44974b;
                        ozb ozbVar4 = (ozb) nxlVarM18137O3.mo18103l();
                        ozbVar4.getClass();
                        patVar3.f47284i = ozbVar4;
                        patVar3.f47276a |= 256;
                        patVar = (pat) nxlVarM18137O2.mo18103l();
                    }
                }
            }
        }
        if (patVar == null) {
            return npp.f44031a;
        }
        mbl mblVar = this.f38319i;
        lja ljaVarM15522a = ljb.m15522a();
        ljaVarM15522a.f38343b = liuVarM15433c.f38337g;
        ljaVarM15522a.m15513c(true);
        ljaVarM15522a.m15515e(patVar);
        ljaVarM15522a.f38345d = liuVarM15433c.f38338h;
        return mblVar.m16298b(ljaVarM15522a.m15511a());
    }

    /* JADX INFO: renamed from: am */
    public nps m15461am() {
        if (!kuh.m14889d(this.f38313c)) {
            return npp.f44031a;
        }
        try {
            lku.m15613H(this.f38312a.getAndSet(false));
            return m15459ap(oyz.FOREGROUND_TO_BACKGROUND);
        } catch (Exception e) {
            return kxk.m14964J(e);
        }
    }

    /* JADX INFO: renamed from: an */
    public nps m15462an() {
        if (!kuh.m14889d(this.f38313c)) {
            return npp.f44031a;
        }
        if (!this.f38312a.getAndSet(true)) {
            return m15459ap(oyz.BACKGROUND_TO_FOREGROUND);
        }
        ((nbe) ((nbe) f38311b.m17252c()).mo17276G((char) 4501)).mo17290o("App is already in the foreground.");
        return kxk.m14963I();
    }

    @Override // p000.ljh
    /* JADX INFO: renamed from: ao */
    public void mo15463ao() {
        this.f38314d.m15360a(this);
    }

    @Override // p000.lho
    /* JADX INFO: renamed from: b */
    public void mo15350b(Activity activity, Bundle bundle) {
        if (this.f38318h.getAndSet(true)) {
            return;
        }
        mo15357a(null);
    }

    @Override // p000.lhv
    /* JADX INFO: renamed from: d */
    public void mo15356d(Activity activity) {
        m15461am();
    }
}
