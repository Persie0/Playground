package p000;

import android.content.Context;
import com.google.android.libraries.vision.smartcapture.FrequentFacesProcessor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.nio.file.Paths;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyi implements dyo {

    /* JADX INFO: renamed from: a */
    private static final nbh f12902a = nbh.m17259h("com/google/android/apps/camera/frequentfaces/FrequentFacesControllerImpl");

    /* JADX INFO: renamed from: b */
    private final Context f12903b;

    /* JADX INFO: renamed from: c */
    private final String f12904c;

    /* JADX INFO: renamed from: d */
    private final AtomicBoolean f12905d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    private final Map f12906e = new HashMap();

    /* JADX INFO: renamed from: f */
    private FrequentFacesProcessor f12907f;

    /* JADX INFO: renamed from: g */
    private fgy f12908g;

    /* JADX INFO: renamed from: h */
    private dxx f12909h;

    /* JADX INFO: renamed from: i */
    private dyq f12910i;

    /* JADX INFO: renamed from: j */
    private final dhv f12911j;

    public dyi(mrm mrmVar, Context context, dhv dhvVar) {
        lku.m15669w(mrmVar.mo16813g());
        this.f12903b = context;
        this.f12911j = dhvVar;
        this.f12904c = true != dhvVar.mo6184l(dhs.f11166d) ? "" : "FaceFamiliarityProcessorVMImpl";
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x02d7 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v17, types: [odh] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final synchronized void m6922h(long j) {
        fgy fgyVar;
        dxx dxxVar;
        dyq dyqVar;
        FrequentFacesProcessor frequentFacesProcessor;
        kpw kpwVarMo8328c;
        ?? r3;
        Throwable th;
        int i;
        odh odhVarM4718a;
        mrm mrmVarM16829i;
        float f;
        synchronized (this) {
            fgyVar = this.f12908g;
            dxxVar = this.f12909h;
            dyqVar = this.f12910i;
            frequentFacesProcessor = this.f12907f;
        }
        if (fgyVar == null || dxxVar == null || dyqVar == null || frequentFacesProcessor == null) {
            ((nbe) ((nbe) f12902a.m17252c()).mo17276G((char) 1184)).mo17290o("No video framestore or metadata framestore attached");
            return;
        }
        if (dyqVar.mo6934a(j) != null) {
            return;
        }
        kpwVarMo8328c = fgyVar.mo8328c(j);
        if (kpwVarMo8328c == null) {
            return;
        }
        try {
            gsr gsrVarM6885a = dxxVar.m6885a(kpwVarMo8328c.mo7248d());
            if (gsrVarM6885a != null) {
                boolean andSet = this.f12905d.getAndSet(false);
                gsu[] gsuVarArr = gsrVarM6885a.f26257q;
                try {
                    if (gsuVarArr == null) {
                        ((nbe) ((nbe) f12902a.m17252c()).mo17276G((char) 1183)).mo17293r("Failure in FF analysis -- null face metadata: %b", true);
                        nxl nxlVarM18137O = odh.f45607m.m18137O();
                        long j2 = gsrVarM6885a.f26243c;
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        odh odhVar = (odh) nxlVarM18137O.f44974b;
                        odhVar.f45609a = 2 | odhVar.f45609a;
                        odhVar.f45611c = j2;
                        odhVarM4718a = (odh) nxlVarM18137O.mo18103l();
                        r3 = 1;
                    } else {
                        float fMo7247c = kpwVarMo8328c.mo7247c() / gsrVarM6885a.f26260t.width();
                        float fMo7246b = kpwVarMo8328c.mo7246b() / gsrVarM6885a.f26260t.height();
                        nxl nxlVarM18137O2 = odp.f45650c.m18137O();
                        if (!nxlVarM18137O2.f44974b.m18142ac()) {
                            nxlVarM18137O2.mo18106p();
                        }
                        odp odpVar = (odp) nxlVarM18137O2.f44974b;
                        odpVar.f45652a |= 1;
                        odpVar.f45653b = andSet;
                        odp odpVar2 = (odp) nxlVarM18137O2.mo18103l();
                        nxl nxlVarM18137O3 = odb.f45576k.m18137O();
                        int i2 = (360 - gsrVarM6885a.f26259s) % 360;
                        if (!nxlVarM18137O3.f44974b.m18142ac()) {
                            nxlVarM18137O3.mo18106p();
                        }
                        odb odbVar = (odb) nxlVarM18137O3.f44974b;
                        odbVar.f45578a |= 4;
                        odbVar.f45580c = i2;
                        odb odbVar2 = (odb) nxlVarM18137O3.mo18103l();
                        nxl nxlVarM18137O4 = odh.f45607m.m18137O();
                        long j3 = gsrVarM6885a.f26243c;
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        odh odhVar2 = (odh) nxlVarM18137O4.f44974b;
                        odhVar2.f45609a |= 2;
                        odhVar2.f45611c = j3;
                        ocd ocdVarM6712b = dsy.m6712b(gsrVarM6885a, fMo7247c, fMo7246b);
                        if (!nxlVarM18137O4.f44974b.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        nxq nxqVar = nxlVarM18137O4.f44974b;
                        odh odhVar3 = (odh) nxqVar;
                        ocdVarM6712b.getClass();
                        odhVar3.f45613e = ocdVarM6712b;
                        odhVar3.f45609a |= 64;
                        boolean z = gsrVarM6885a.f26258r;
                        if (!nxqVar.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        nxq nxqVar2 = nxlVarM18137O4.f44974b;
                        odh odhVar4 = (odh) nxqVar2;
                        odhVar4.f45609a |= 512;
                        odhVar4.f45614f = z;
                        if (!nxqVar2.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        nxq nxqVar3 = nxlVarM18137O4.f44974b;
                        odh odhVar5 = (odh) nxqVar3;
                        odbVar2.getClass();
                        odhVar5.f45612d = odbVar2;
                        odhVar5.f45609a |= 32;
                        if (!nxqVar3.m18142ac()) {
                            nxlVarM18137O4.mo18106p();
                        }
                        r3 = (odh) nxlVarM18137O4.f44974b;
                        odpVar2.getClass();
                        r3.f45619k = odpVar2;
                        r3.f45609a |= 2097152;
                        odh odhVar6 = (odh) nxlVarM18137O4.mo18103l();
                        if (gsuVarArr.length != 0) {
                            try {
                                List listMo7251g = kpwVarMo8328c.mo7251g();
                                kpv kpvVar = (kpv) listMo7251g.get(0);
                                r3 = 1;
                                kpv kpvVar2 = (kpv) listMo7251g.get(1);
                                kpv kpvVar3 = (kpv) listMo7251g.get(2);
                                odhVarM4718a = frequentFacesProcessor.m4718a(kpvVar.getBuffer(), kpvVar.getPixelStride(), kpvVar.getRowStride(), kpvVar2.getBuffer(), kpvVar2.getPixelStride(), kpvVar2.getRowStride(), kpvVar3.getBuffer(), kpvVar3.getPixelStride(), kpvVar3.getRowStride(), kpwVarMo8328c.mo7247c(), kpwVarMo8328c.mo7246b(), odhVar6);
                            } catch (IllegalStateException e) {
                                r3 = 1;
                                ((nbe) ((nbe) ((nbe) f12902a.m17251b()).mo17283h(e)).mo17276G((char) 1182)).mo17290o("Couldn't get planes for analysis.");
                                odhVarM4718a = odh.f45607m;
                            }
                        } else {
                            r3 = 1;
                            odhVarM4718a = odhVar6;
                        }
                    }
                    ocd ocdVar = odhVarM4718a.f45613e;
                    if (ocdVar == null) {
                        ocdVar = ocd.f45443b;
                    }
                    lku.m15613H(ocdVar.f45445a.size() == gsrVarM6885a.f26257q.length);
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < ocdVar.f45445a.size(); i3++) {
                        occ occVar = (occ) ocdVar.f45445a.get(i3);
                        ktz ktzVar = odn.f45633j;
                        occVar.m18121e(ktzVar);
                        Object objM18028k = occVar.f44976l.m18028k((nxp) ktzVar.f37201d);
                        if (objM18028k == null) {
                            objM18028k = ktzVar.f37199b;
                        } else {
                            ktzVar.m14855g(objM18028k);
                        }
                        odn odnVar = (odn) objM18028k;
                        boolean z2 = (odnVar.f45635a & 64) != 0;
                        dyj dyjVarM6933a = dyk.m6933a();
                        dyjVarM6933a.m6932d(occVar.f45440i);
                        dyjVarM6933a.f12912a = mrm.m16829i(Long.valueOf(occVar.f45441j));
                        dyjVarM6933a.m6931c(odnVar.f45638d);
                        if (z2) {
                            odo odoVar = odnVar.f45642h;
                            if (odoVar == null) {
                                odoVar = odo.f45645d;
                            }
                            mrmVarM16829i = mrm.m16829i(mws.m17095j(odoVar.f45648b));
                        } else {
                            mrmVarM16829i = mqu.f41450a;
                        }
                        dyjVarM6933a.f12913b = mrmVarM16829i;
                        if (z2) {
                            odo odoVar2 = odnVar.f45642h;
                            if (odoVar2 == null) {
                                odoVar2 = odo.f45645d;
                            }
                            f = odoVar2.f45649c;
                        } else {
                            f = 0.0f;
                        }
                        dyjVarM6933a.m6930b(f);
                        arrayList.add(dyjVarM6933a.m6929a());
                    }
                    jzk jzkVar = new jzk(kpwVarMo8328c.mo7248d(), arrayList);
                    dyqVar.m6937c(jzkVar);
                    synchronized (this) {
                        try {
                            for (Map.Entry entry : this.f12906e.entrySet()) {
                                try {
                                    ((Executor) entry.getValue()).execute(new dgq(entry, jzkVar, 12, null));
                                } catch (RejectedExecutionException e2) {
                                    ((nbe) ((nbe) ((nbe) f12902a.m17251b()).mo17283h(e2)).mo17276G(1185)).mo17290o("Cannot execute onFrequentFacesAvailable");
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i = 1;
                    try {
                        kpwVarMo8328c.close();
                        throw th;
                    } catch (Throwable th4) {
                        try {
                            Class[] clsArr = new Class[i];
                            clsArr[0] = Throwable.class;
                            Method declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", clsArr);
                            Object[] objArr = new Object[i];
                            objArr[0] = th4;
                            declaredMethod.invoke(th, objArr);
                            throw th;
                        } catch (Exception e3) {
                            throw th;
                        }
                    }
                }
            }
            kpwVarMo8328c.close();
            return;
        } catch (Throwable th5) {
            th = th5;
            r3 = 1;
        }
        th = th;
        i = r3;
        kpwVarMo8328c.close();
        throw th;
    }

    @Override // p000.dyo
    /* JADX INFO: renamed from: b */
    public final kba mo6923b(final fgy fgyVar, final dxx dxxVar, final dyq dyqVar) {
        this.f12905d.set(false);
        long millis = TimeUnit.DAYS.toMillis(180L);
        long jLongValue = ((Long) this.f12911j.mo6173a(dhs.f11163a).map(new gtu(millis, 1)).orElse(Long.valueOf(millis))).longValue();
        Context context = this.f12903b;
        String str = this.f12904c;
        String string = Paths.get(context.getNoBackupFilesDir().getAbsolutePath(), "ff.pb").toString();
        nxl nxlVarM18137O = ocf.f45452g.m18137O();
        if (!nxlVarM18137O.f44974b.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar = nxlVarM18137O.f44974b;
        ocf ocfVar = (ocf) nxqVar;
        ocfVar.f45454a |= 2;
        ocfVar.f45456c = 1000;
        if (!nxqVar.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar2 = nxlVarM18137O.f44974b;
        ocf ocfVar2 = (ocf) nxqVar2;
        ocfVar2.f45454a |= 1;
        ocfVar2.f45455b = 128;
        if (!nxqVar2.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar3 = nxlVarM18137O.f44974b;
        ocf ocfVar3 = (ocf) nxqVar3;
        ocfVar3.f45454a |= 16;
        ocfVar3.f45459f = 1.0f;
        if (!nxqVar3.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        nxq nxqVar4 = nxlVarM18137O.f44974b;
        ocf ocfVar4 = (ocf) nxqVar4;
        ocfVar4.f45454a |= 4;
        ocfVar4.f45457d = 0.84f;
        if (!nxqVar4.m18142ac()) {
            nxlVarM18137O.mo18106p();
        }
        ocf ocfVar5 = (ocf) nxlVarM18137O.f44974b;
        ocfVar5.f45454a |= 8;
        ocfVar5.f45458e = 0.73f;
        ocf ocfVar6 = (ocf) nxlVarM18137O.mo18103l();
        nxl nxlVarM18137O2 = oed.f45705i.m18137O();
        if (!nxlVarM18137O2.f44974b.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar5 = nxlVarM18137O2.f44974b;
        oed oedVar = (oed) nxqVar5;
        oedVar.f45707a |= 4;
        oedVar.f45709c = str;
        if (!nxqVar5.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar6 = nxlVarM18137O2.f44974b;
        oed oedVar2 = (oed) nxqVar6;
        oedVar2.f45707a |= 1;
        oedVar2.f45708b = true;
        if (!nxqVar6.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar7 = nxlVarM18137O2.f44974b;
        oed oedVar3 = (oed) nxqVar7;
        string.getClass();
        oedVar3.f45707a |= 64;
        oedVar3.f45710d = string;
        if (!nxqVar7.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar8 = nxlVarM18137O2.f44974b;
        oed oedVar4 = (oed) nxqVar8;
        oedVar4.f45707a |= 512;
        oedVar4.f45712f = "library";
        if (!nxqVar8.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar9 = nxlVarM18137O2.f44974b;
        oed oedVar5 = (oed) nxqVar9;
        oedVar5.f45707a |= 256;
        oedVar5.f45711e = "namespace";
        if (!nxqVar9.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        nxq nxqVar10 = nxlVarM18137O2.f44974b;
        oed oedVar6 = (oed) nxqVar10;
        oedVar6.f45707a |= 262144;
        oedVar6.f45714h = jLongValue;
        if (!nxqVar10.m18142ac()) {
            nxlVarM18137O2.mo18106p();
        }
        oed oedVar7 = (oed) nxlVarM18137O2.f44974b;
        ocfVar6.getClass();
        oedVar7.f45713g = ocfVar6;
        oedVar7.f45707a |= 1024;
        final FrequentFacesProcessor frequentFacesProcessor = new FrequentFacesProcessor((oed) nxlVarM18137O2.mo18103l());
        synchronized (this) {
            this.f12908g = fgyVar;
            this.f12909h = dxxVar;
            this.f12910i = dyqVar;
            this.f12907f = frequentFacesProcessor;
        }
        return new kba() { // from class: dyh
            @Override // p000.kba, java.lang.AutoCloseable
            public final void close() {
                this.f12897a.m6925d(fgyVar, dxxVar, dyqVar, frequentFacesProcessor);
            }
        };
    }

    @Override // p000.dxy
    /* JADX INFO: renamed from: bP */
    public final void mo6891bP(gsr gsrVar) {
        m6922h(gsrVar.f26243c);
    }

    @Override // p000.dyo
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6924c(dyn dynVar, Executor executor) {
        this.f12906e.put(dynVar, executor);
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m6925d(fgy fgyVar, dxx dxxVar, dyq dyqVar, FrequentFacesProcessor frequentFacesProcessor) {
        if (this.f12908g == fgyVar) {
            this.f12908g = null;
        }
        if (this.f12909h == dxxVar) {
            this.f12909h = null;
        }
        if (this.f12910i == dyqVar) {
            this.f12910i = null;
        }
        frequentFacesProcessor.close();
        if (this.f12907f == frequentFacesProcessor) {
            this.f12907f = null;
        }
    }

    @Override // p000.dyp
    /* JADX INFO: renamed from: e */
    public final void mo6926e() {
        this.f12905d.set(true);
    }

    @Override // p000.fgx
    /* JADX INFO: renamed from: f */
    public final void mo6927f(long j) {
        m6922h(j);
    }

    @Override // p000.dyo
    /* JADX INFO: renamed from: g */
    public final synchronized void mo6928g(dyn dynVar) {
        if (this.f12906e.containsKey(dynVar)) {
            this.f12906e.remove(dynVar);
        }
    }
}
