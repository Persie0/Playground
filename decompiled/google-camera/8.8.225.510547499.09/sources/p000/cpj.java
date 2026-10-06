package p000;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Range;
import android.view.Surface;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpj {

    /* JADX INFO: renamed from: a */
    public static final nbh f8576a = nbh.m17259h("com/google/android/apps/camera/camcorder/CamcorderController");

    /* JADX INFO: renamed from: A */
    private final cpd f8577A;

    /* JADX INFO: renamed from: B */
    private final csm f8578B;

    /* JADX INFO: renamed from: C */
    private final Executor f8579C;

    /* JADX INFO: renamed from: D */
    private final oju f8580D;

    /* JADX INFO: renamed from: E */
    private final oju f8581E;

    /* JADX INFO: renamed from: F */
    private final kbz f8582F;

    /* JADX INFO: renamed from: G */
    private final daj f8583G;

    /* JADX INFO: renamed from: H */
    private nps f8584H;

    /* JADX INFO: renamed from: J */
    private cvd f8586J;

    /* JADX INFO: renamed from: K */
    private final cwd f8587K;

    /* JADX INFO: renamed from: L */
    private final djm f8588L;

    /* JADX INFO: renamed from: M */
    private final ljf f8589M;

    /* JADX INFO: renamed from: b */
    public final jvd f8590b;

    /* JADX INFO: renamed from: c */
    public final dbr f8591c;

    /* JADX INFO: renamed from: e */
    public final iuj f8593e;

    /* JADX INFO: renamed from: f */
    public final igb f8594f;

    /* JADX INFO: renamed from: g */
    public final hle f8595g;

    /* JADX INFO: renamed from: h */
    public final doe f8596h;

    /* JADX INFO: renamed from: i */
    public final ddq f8597i;

    /* JADX INFO: renamed from: j */
    public final dhv f8598j;

    /* JADX INFO: renamed from: l */
    public final eoq f8600l;

    /* JADX INFO: renamed from: n */
    public cpw f8602n;

    /* JADX INFO: renamed from: o */
    public csl f8603o;

    /* JADX INFO: renamed from: p */
    public boolean f8604p;

    /* JADX INFO: renamed from: q */
    public boolean f8605q;

    /* JADX INFO: renamed from: r */
    public dbn f8606r;

    /* JADX INFO: renamed from: s */
    public int f8607s;

    /* JADX INFO: renamed from: u */
    public cva f8609u;

    /* JADX INFO: renamed from: v */
    public final dfn f8610v;

    /* JADX INFO: renamed from: w */
    public final fws f8611w;

    /* JADX INFO: renamed from: x */
    public final bko f8612x;

    /* JADX INFO: renamed from: y */
    public final cwd f8613y;

    /* JADX INFO: renamed from: z */
    public final jfs f8614z;

    /* JADX INFO: renamed from: d */
    public final List f8592d = new ArrayList();

    /* JADX INFO: renamed from: k */
    final igf f8599k = new cpg(this);

    /* JADX INFO: renamed from: m */
    public final eop f8601m = new cph(this);

    /* JADX INFO: renamed from: I */
    private hyd f8585I = jiy.m13267ab();

    /* JADX INFO: renamed from: t */
    public final Object f8608t = new Object();

    public cpj(fws fwsVar, cpd cpdVar, cwd cwdVar, csm csmVar, Executor executor, bko bkoVar, oju ojuVar, oju ojuVar2, dbr dbrVar, iuj iujVar, eoq eoqVar, jvd jvdVar, kbz kbzVar, igb igbVar, jfs jfsVar, hle hleVar, ljf ljfVar, djm djmVar, doe doeVar, dfn dfnVar, cwd cwdVar2, ddq ddqVar, daj dajVar, dhv dhvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f8577A = cpdVar;
        this.f8587K = cwdVar;
        this.f8578B = csmVar;
        this.f8611w = fwsVar;
        this.f8579C = executor;
        this.f8612x = bkoVar;
        this.f8580D = ojuVar;
        this.f8581E = ojuVar2;
        this.f8591c = dbrVar;
        this.f8593e = iujVar;
        this.f8600l = eoqVar;
        this.f8590b = jvdVar;
        this.f8582F = kbzVar;
        this.f8594f = igbVar;
        this.f8614z = jfsVar;
        this.f8595g = hleVar;
        this.f8589M = ljfVar;
        this.f8588L = djmVar;
        this.f8596h = doeVar;
        this.f8610v = dfnVar;
        this.f8613y = cwdVar2;
        this.f8597i = ddqVar;
        this.f8583G = dajVar;
        this.f8598j = dhvVar;
    }

    /* JADX INFO: renamed from: s */
    private final boolean m5227s() {
        boolean z;
        synchronized (this.f8608t) {
            z = this.f8602n != null;
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:222:0x057f  */
    /* JADX WARN: Code duplicated, block: B:286:0x065f  */
    /* JADX WARN: Code duplicated, block: B:292:0x067b  */
    /* JADX WARN: Type inference failed for: r14v12, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v23, types: [java.lang.Object, jxt] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, jxt] */
    /* JADX WARN: Type inference failed for: r1v2, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v54, types: [hah, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v38, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v64, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.lang.Object, kmd] */
    /* JADX WARN: Type inference failed for: r2v98, types: [crh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r62v0, types: [cqe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, jxt] */
    /* JADX INFO: renamed from: t */
    private final void m5228t(int i) throws Throwable {
        jxp jxpVarM6621a;
        jxn jxnVar;
        cpd cpdVar;
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        kbc kbcVarM13661b;
        kmq kmqVar;
        boolean z;
        boolean z2;
        gyw gywVar;
        boolean z3;
        boolean z4;
        boolean z5;
        final nps npsVarM11367f;
        synchronized (this.f8608t) {
            try {
                this.f8603o.m5463a(csj.INITIATING);
                dbn dbnVar = new dbn();
                dbnVar.m5882c(0);
                dbnVar.m5885f(0);
                dbnVar.m5884e(0);
                dbnVar.m5881b(kmq.BACK);
                dbnVar.f10400h = 1;
                dbnVar.f10401i = 1;
                dbnVar.m5883d(ikw.UNINITIALIZED);
                dbnVar.m5880a(false);
                dbnVar.f10401i = i;
                dbnVar.m5881b(this.f8591c.mo5895d());
                dbnVar.m5883d(this.f8611w.m8908a());
                this.f8606r = dbnVar;
                kcc kccVarMo13957a = this.f8582F.mo13957a("CamcorderControllers#createCaptureSession");
                this.f8595g.mo4304a();
                this.f8595g.m10437h(hld.f28244a);
                Collection$EL.stream(this.f8592d).forEach(cpf.f8550b);
                cpd cpdVar2 = this.f8577A;
                jvd.m13538a();
                final kcc kccVarMo13957a2 = cpdVar2.f8525c.mo13957a("CamcorderCaptureSessionFactory#createNewSession");
                cpq cpqVar = cpdVar2.f8531i;
                fws fwsVar = cpdVar2.f8534l;
                final csn csnVar = cpqVar.f8657h;
                if (csnVar != null) {
                    cpdVar = cpdVar2;
                } else {
                    synchronized (cpqVar.f8658i) {
                        try {
                            csn csnVar2 = cpqVar.f8657h;
                            if (csnVar2 != null) {
                                cpdVar = cpdVar2;
                                csnVar = csnVar2;
                            } else {
                                cpqVar.f8659j.m5657d(cum.CAPTURE_SESSION).m13537d(cpqVar);
                                kmg kmgVarM8909b = fwsVar.m8909b();
                                kmgVarM8909b.getClass();
                                kmg kmgVarM8910c = fwsVar.m8910c();
                                kmgVarM8910c.getClass();
                                Intent intentM2611e = ((bko) fwsVar.f23768e).m2611e();
                                dsx dsxVarM6244s = ((djm) cpqVar.f8662m.f11787a).m6244s(kmgVarM8910c);
                                kmq kmqVarMo14558k = ((kmr) dsxVarM6244s.f12521a).mo14558k();
                                cxk cxkVarM5716a = cpqVar.f8654e.m5716a();
                                if (fwsVar.m8908a().equals(ikw.AMBER)) {
                                    jxpVarM6621a = cpqVar.m5256a();
                                    jxnVar = jxn.f35050b;
                                } else if (cxkVarM5716a.equals(cxk.ACTIVE)) {
                                    jxpVarM6621a = cpqVar.m5256a();
                                    jxnVar = jxn.FPS_30;
                                } else if (!cxkVarM5716a.equals(cxk.CINEMATIC) || cpqVar.f8652c.mo6184l(dhh.f11054G)) {
                                    jxpVarM6621a = cpqVar.f8652c.mo6184l(dim.f11639b) ? cpq.m5255c(intentM2611e) ? jxp.RES_720P : ((drj) fwsVar.f23776m).m6621a(kmqVarMo14558k) : cpq.m5255c(intentM2611e) ? jxp.RES_720P : cpqVar.f8661l.m6237l(kmqVarMo14558k);
                                    Object obj = fwsVar.f23770g;
                                    ((cwt) obj).f9891a = jxpVarM6621a;
                                    jxnVar = (jxn) ((cwt) obj).m5690a(fwsVar.m8908a()).mo3831be();
                                    if (!dsxVarM6244s.m6701p(jxnVar, jxpVarM6621a)) {
                                        if (jxnVar.m13657e()) {
                                            List list = (List) dsxVarM6244s.f12522b.get(jxnVar);
                                            list.getClass();
                                            jxpVarM6621a = cpqVar.f8655f.m8598b() ? (jxp) Collection$EL.stream(list).filter(cdy.f5374c).findFirst().get() : (jxp) Collection$EL.stream(list).filter(cdy.f5375d).findFirst().get();
                                        } else {
                                            jxnVar = jxn.FPS_30;
                                        }
                                    }
                                } else {
                                    jxpVarM6621a = cpqVar.m5256a();
                                    jxnVar = jxn.f35054f;
                                }
                                ikw ikwVarM8908a = fwsVar.m8908a();
                                djm djmVar = cpqVar.f8661l;
                                try {
                                    ?? r1 = djmVar.f11787a;
                                    dhx dhxVar = dhh.f11074a;
                                    r1.mo6175c();
                                    boolean z6 = djmVar.f11787a.mo6184l(dhh.f11086al) && ((Boolean) djmVar.f11789c.mo10031c(gzy.f26991C)).booleanValue() && ikwVarM8908a.equals(ikw.VIDEO) && jxnVar.equals(jxn.FPS_30);
                                    if (cpqVar.f8656g.f36782o) {
                                        z6 = z6 && kmqVarMo14558k.equals(kmq.BACK);
                                    }
                                    ikw ikwVarM8908a2 = fwsVar.m8908a();
                                    if (ikwVarM8908a2 != ikw.VIDEO_INTENT) {
                                        if (ikwVarM8908a2 == ikw.VIDEO) {
                                            cpqVar.f8652c.mo6177e();
                                            if (z6) {
                                                mrmVarM16829i2 = mqu.f41450a;
                                                cpdVar = cpdVar2;
                                                kmqVarMo14558k = kmqVarMo14558k;
                                            } else {
                                                List listMo14571x = ((kmr) dsxVarM6244s.f12521a).mo14571x(256);
                                                jxp jxpVar = jxp.RES_2160P;
                                                cpdVar = cpdVar2;
                                                kbc kbcVar = new kbc(0, 0);
                                                Iterator it = listMo14571x.iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        kbc kbcVar2 = (kbc) it.next();
                                                        it = it;
                                                        kmqVarMo14558k = kmqVarMo14558k;
                                                        if (kan.m13873j(kbcVar2).m13883m(kan.m13873j(jxpVarM6621a.m13661b()))) {
                                                            if (cpqVar.f8656g.f36782o && kbcVar2.equals(cpq.f8650a) && jxnVar.f35058i == 60) {
                                                                mrmVarM16829i2 = mrm.m16829i(cpq.f8650a);
                                                                break;
                                                            } else if (((jxpVarM6621a != jxpVar && jxnVar.f35058i != 60 && (jxnVar.f35060k != 60 || ((kmr) dsxVarM6244s.f12521a).mo14558k() != kmq.f36557a)) || kbcVar2.m13905b() <= jxpVarM6621a.m13660a()) && kbcVar2.m13905b() > kbcVar.m13905b()) {
                                                                kbcVar = kbcVar2;
                                                            }
                                                        }
                                                    } else {
                                                        kmqVarMo14558k = kmqVarMo14558k;
                                                        mrmVarM16829i = kbcVar.m13905b() == 0 ? mqu.f41450a : mrm.m16829i(kbcVar);
                                                    }
                                                }
                                            }
                                        } else {
                                            cpdVar = cpdVar2;
                                            kmqVarMo14558k = kmqVarMo14558k;
                                            mrmVarM16829i = mqu.f41450a;
                                        }
                                        mrmVarM16829i2 = mrmVarM16829i;
                                        break;
                                    }
                                    mrmVarM16829i2 = mrm.m16829i(jxpVarM6621a.m13661b());
                                    cpdVar = cpdVar2;
                                    kmqVarMo14558k = kmqVarMo14558k;
                                    ?? r2 = fwsVar.f23764a;
                                    boolean zM13883m = kan.m13873j(jxpVarM6621a.m13661b()).m13883m(kan.f35488c);
                                    if (r2.mo5405k() || ((jxpVarM6621a.m13663d() && jxnVar.f35058i == 60 && cpqVar.f8652c.mo6184l(dhh.f11056I)) || (jxpVarM6621a.m13662c() && jxnVar.f35058i == 60 && cpqVar.f8652c.mo6184l(dhh.f11082ah)))) {
                                        kbcVarM13661b = zM13883m ? jxp.RES_720P_3X4.m13661b() : jxp.RES_720P.m13661b();
                                    } else if (jxpVarM6621a.m13663d()) {
                                        kbcVarM13661b = zM13883m ? jxp.RES_1080P_3X4.m13661b() : jxp.RES_1080P.m13661b();
                                    } else {
                                        kbcVarM13661b = jxpVarM6621a.m13661b();
                                    }
                                    Object obj2 = cpqVar.f8662m.f11789c;
                                    jxv jxvVarMo13666c = ((cvy) obj2).f9847d.mo13666c(((cvy) obj2).m5624a(kmgVarM8910c, jxpVarM6621a, fwsVar.m8908a(), z6), jxnVar, jxpVarM6621a);
                                    jxs jxsVarMo13664a = null;
                                    if (jxnVar != jxn.FPS_60C_24E && jxnVar != jxn.f35054f) {
                                        ikw ikwVarM8908a3 = fwsVar.m8908a();
                                        ((djm) ((cvy) obj2).f9846c).f11787a.mo6175c();
                                        jxsVarMo13664a = jxnVar.m13658f() ? ((cvy) obj2).f9847d.mo13664a(jxnVar, ((cvy) obj2).m5624a(kmgVarM8910c, jxpVarM6621a, ikwVarM8908a3, z6)) : ((cvy) obj2).f9847d.mo13665b(jxnVar, ((cvy) obj2).m5624a(kmgVarM8910c, jxpVarM6621a, ikwVarM8908a3, z6));
                                    }
                                    List listMo14568u = ((kmr) dsxVarM6244s.f12521a).mo14568u();
                                    lku.m15613H(!listMo14568u.isEmpty());
                                    Range range = new Range(0, 0);
                                    Iterator it2 = listMo14568u.iterator();
                                    while (it2.hasNext()) {
                                        Range range2 = (Range) it2.next();
                                        it2 = it2;
                                        if (((Integer) range2.getUpper()).intValue() - ((Integer) range2.getLower()).intValue() > ((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) {
                                            range = range2;
                                        }
                                    }
                                    mrm mrmVarM16829i3 = ((Integer) range.getUpper()).intValue() == ((Integer) range.getLower()).intValue() ? mqu.f41450a : (jxnVar != jxn.FPS_AUTO && listMo14568u.contains(csf.f9239a)) ? mrm.m16829i(csf.f9239a) : mrm.m16829i(range);
                                    csa cscVar = jxnVar.m13658f() ? new csc(new Range(Integer.valueOf(jxnVar.f35058i), Integer.valueOf(jxnVar.f35058i)), mrmVarM16829i3, (((kmr) dsxVarM6244s.f12521a).mo14558k() == kmq.f36557a && jxnVar == jxn.FPS_30 && cpqVar.f8651b.f9240b) ? true : jxnVar == jxn.FPS_AUTO) : new csb(jxvVarMo13666c);
                                    djm djmVar2 = cpqVar.f8660k;
                                    ((AtomicInteger) djmVar2.f11788b).set(0);
                                    ((AtomicInteger) djmVar2.f11789c).set(0);
                                    int iIncrementAndGet = ((AtomicInteger) djmVar2.f11787a).incrementAndGet();
                                    if (jxnVar == null) {
                                        throw new NullPointerException("Null captureRate");
                                    }
                                    if (jxpVarM6621a == null) {
                                        throw new NullPointerException("Null videoResolution");
                                    }
                                    if (dsxVarM6244s == null) {
                                        throw new NullPointerException("Null camcorderCharacteristics");
                                    }
                                    mrm mrmVarM16828h = mrm.m16828h(jxsVarMo13664a);
                                    mrm mrmVarM3506e = cds.m3506e(intentM2611e);
                                    mrm mrmVarM16829i4 = intentM2611e == null ? mqu.f41450a : intentM2611e.hasExtra("android.intent.extra.durationLimit") ? mrm.m16829i(Integer.valueOf(intentM2611e.getIntExtra("android.intent.extra.durationLimit", 0))) : mqu.f41450a;
                                    mrm mrmVarM16829i5 = intentM2611e == null ? mqu.f41450a : intentM2611e.hasExtra("android.intent.extra.sizeLimit") ? mrm.m16829i(Long.valueOf(intentM2611e.getIntExtra("android.intent.extra.sizeLimit", 0))) : mqu.f41450a;
                                    boolean zMo5408n = fwsVar.f23764a.mo5408n();
                                    Range rangeMo5451a = cscVar.mo5451a();
                                    if (rangeMo5451a == null) {
                                        throw new NullPointerException("Null previewFpsRange");
                                    }
                                    Range rangeMo5452b = cscVar.mo5452b();
                                    if (rangeMo5452b == null) {
                                        throw new NullPointerException("Null recordFpsRange");
                                    }
                                    if (kmqVarMo14558k == null) {
                                        throw new NullPointerException("Null cameraFacing");
                                    }
                                    boolean z7 = !jxnVar.m13657e();
                                    if (cpqVar.f8652c.mo6184l(dhh.f11111x)) {
                                        kmqVar = kmqVarMo14558k;
                                        z = true;
                                    } else {
                                        kmqVar = kmqVarMo14558k;
                                        z = kmqVar == kmq.BACK;
                                    }
                                    boolean zMo6184l = (cpqVar.f8652c.mo6184l(dhh.f11099l) && kmqVar == kmq.f36557a) ? true : cpqVar.f8652c.mo6184l(dhh.f11100m);
                                    boolean z8 = dsxVarM6244s.f12521a.mo14545N() && cpqVar.f8661l.m6240o();
                                    boolean zM6241p = cpqVar.f8661l.m6241p();
                                    cpqVar.f8652c.mo6175c();
                                    if (jxpVarM6621a.m13663d()) {
                                        z2 = false;
                                    } else if (cpqVar.f8652c.mo6184l(dhh.f11109v) && jxnVar == jxn.FPS_30) {
                                        z2 = true;
                                    } else if (cpqVar.f8652c.mo6184l(dhh.f11110w) && jxnVar == jxn.FPS_AUTO) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    cxk cxkVarM5716a2 = cpqVar.f8654e.m5716a();
                                    mxi mxiVar = new mxi();
                                    mws mwsVarM5257b = cpqVar.m5257b(jxnVar, jxpVarM6621a, kmqVar, cxkVarM5716a2);
                                    int i2 = ((mzr) mwsVarM5257b).f41859c;
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        mxiVar.m17129h(cpqVar.m5258d(dsxVarM6244s, jxnVar, (jxp) mwsVarM5257b.get(i3), cxkVarM5716a2));
                                    }
                                    mws mwsVarMo17025v = mxiVar.mo17127f().mo17025v();
                                    if (mwsVarMo17025v == null) {
                                        throw new NullPointerException("Null allSupportedCaptureRates");
                                    }
                                    mws mwsVarM5258d = cpqVar.m5258d(dsxVarM6244s, jxnVar, jxpVarM6621a, cpqVar.f8654e.m5716a());
                                    if (mwsVarM5258d == null) {
                                        throw new NullPointerException("Null supportedCaptureRates");
                                    }
                                    mws mwsVarM5257b2 = cpqVar.m5257b(jxnVar, jxpVarM6621a, kmqVar, cpqVar.f8654e.m5716a());
                                    if (mwsVarM5257b2 == null) {
                                        throw new NullPointerException("Null supportedVideoResolutions");
                                    }
                                    if (ikw.AMBER.equals(fwsVar.m8908a())) {
                                        gywVar = gyw.AMBER;
                                    } else if (z6 != 0) {
                                        gywVar = gyw.AMETHYST;
                                    } else {
                                        gywVar = jxnVar.m13656d() ? gyw.CINEMATIC : gyw.VIDEO;
                                    }
                                    if (gywVar == null) {
                                        throw new NullPointerException("Null captureSessionType");
                                    }
                                    boolean z9 = fwsVar.f23764a.mo5399e() ? (cpqVar.f8652c.mo6184l(dhh.f11057J) && jxpVarM6621a.m13663d() && jxnVar == jxn.FPS_60) ? false : true : false;
                                    dhv dhvVar = cpqVar.f8652c;
                                    jxn jxnVar2 = jxn.FPS_30;
                                    boolean z10 = jxnVar == jxnVar2 && (jxpVarM6621a == jxp.RES_1080P || jxpVarM6621a == jxp.RES_1080P_3X4);
                                    boolean z11 = jxnVar == jxn.FPS_60 && (jxpVarM6621a == jxp.RES_1080P || jxpVarM6621a == jxp.RES_1080P_3X4);
                                    boolean z12 = jxnVar == jxnVar2 && jxpVarM6621a.m13663d();
                                    if (!fwsVar.f23764a.mo5403i()) {
                                        z3 = false;
                                    } else if (z10 || (kmqVar == kmq.f36557a && z12)) {
                                        z3 = true;
                                    } else if (z11) {
                                        dhvVar.mo6175c();
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (fwsVar.f23764a.mo5401g()) {
                                        dhv dhvVar2 = cpqVar.f8652c;
                                        dhw dhwVar = dis.f11705a;
                                        dhvVar2.mo6177e();
                                        if (cpqVar.f8663n.m11347o(kmqVar, jxpVarM6621a, jxnVar)) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                    } else {
                                        z4 = false;
                                    }
                                    if (fwsVar.m8908a().equals(ikw.VIDEO)) {
                                        cpqVar.f8652c.mo6175c();
                                        if (jxnVar.equals(jxn.FPS_60) && !cpqVar.f8652c.mo6184l(dhh.f11082ah)) {
                                            cpqVar.f8652c.mo6184l(dhh.f11056I);
                                        }
                                        if (fwsVar.m8908a().equals(ikw.VIDEO)) {
                                            cpqVar.f8652c.mo6175c();
                                        }
                                        z5 = fwsVar.m8908a().equals(ikw.VIDEO) && cpqVar.f8652c.mo6184l(dib.f11349cc) && ((Boolean) cpqVar.f8653d.mo3831be()).booleanValue();
                                    } else {
                                        z5 = false;
                                    }
                                    if (fwsVar.m8908a().equals(ikw.VIDEO) && jxnVar.equals(jxn.FPS_30)) {
                                        cpqVar.f8652c.mo6175c();
                                    }
                                    boolean z13 = fwsVar.m8908a().equals(ikw.AMBER) && cpqVar.f8652c.mo6184l(dhh.f11084aj) && jxnVar.equals(jxn.f35050b) && jxpVarM6621a.equals(jxp.RES_1080P) && kmqVar.equals(kmq.BACK);
                                    dhv dhvVar3 = cpqVar.f8652c;
                                    fwsVar.m8908a();
                                    if (dhvVar3.mo6184l(dib.f11351ce)) {
                                        dhvVar3.mo6177e();
                                    }
                                    if (fwsVar.m8908a().equals(ikw.VIDEO) && jxnVar.equals(jxn.FPS_30)) {
                                        cpqVar.f8652c.mo6175c();
                                    }
                                    if (fwsVar.m8908a().equals(ikw.VIDEO) && jxnVar.equals(jxn.FPS_60)) {
                                        cpqVar.f8652c.mo6178f();
                                    }
                                    cpqVar.f8652c.mo6175c();
                                    csh cshVar = new csh(kmgVarM8909b, kmgVarM8910c, dsxVarM6244s, jxnVar, jxpVarM6621a, mrmVarM16829i2, kbcVarM13661b, jxvVarMo13666c, mrmVarM16828h, mrmVarM3506e, mrmVarM16829i4, mrmVarM16829i5, zMo5408n, rangeMo5451a, rangeMo5452b, z7, z, zMo6184l, z8, zM6241p, z2, mwsVarMo17025v, mwsVarM5258d, mwsVarM5257b2, kmqVar, gywVar, iIncrementAndGet, z9, z3, z4, z5, z13, z6, null, null);
                                    cpqVar.f8657h = cshVar;
                                    csnVar = cshVar;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                final cpd cpdVar3 = cpdVar;
                try {
                    cpdVar3.f8533k.m5657d(cum.CAPTURE_SESSION).m13537d(cpdVar3.f8528f);
                    cpdVar3.f8533k.m5657d(cum.CAPTURE_SESSION).m13537d(cpdVar3);
                    dhv dhvVar4 = cpdVar3.f8532j;
                    dhx dhxVar2 = dhh.f11074a;
                    dhvVar4.mo6175c();
                    final cqm cqmVar = cpdVar3.f8526d;
                    cqmVar.f8971z = csnVar;
                    cqmVar.f8970y.mo5726j(csnVar);
                    cqmVar.f8948c.mo5727a((fvu) csnVar.f9335G.f12521a);
                    cqmVar.f8962q.m13541c(new Runnable() { // from class: cql
                        /* JADX WARN: Type inference failed for: r5v25, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, java.util.Map] */
                        /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, java.util.Map] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            cqm cqmVar2 = cqmVar;
                            csn csnVar3 = csnVar;
                            jvd.m13538a();
                            if (cqmVar2.f8963r.mo6184l(dib.f11285as)) {
                                cqmVar2.f8950e.mo11773x();
                            }
                            cqmVar2.f8950e.mo11734O(mrm.m16829i(csnVar3.f9338c), csnVar3.f9339d.m13663d());
                            if (cqmVar2.f8954i.m14669i() && cqmVar2.f8952g.m5901j()) {
                                cqmVar2.f8950e.mo11721B(false);
                            }
                            if (cqmVar2.f8954i.m14667g()) {
                                cqmVar2.f8950e.mo11768s();
                            }
                            if (cqmVar2.f8963r.mo6184l(dib.f11273ag)) {
                                float fMo11752c = (ikw.SLOW_MOTION.equals(cqmVar2.f8969x) || ikw.AMBER.equals(cqmVar2.f8969x) || (csnVar3.f9338c.f35058i == 60 && csnVar3.f9339d.m13663d() && cqmVar2.f8963r.mo6184l(dhh.f11113z))) ? cqmVar2.f8950e.mo11752c(true, cqmVar2.f8969x) : ((kmr) csnVar3.f9335G.f12521a).mo14550c();
                                cwd cwdVar = cqmVar2.f8938A;
                                ?? r6 = cwdVar.f9866a;
                                cxk cxkVar = cxk.DEFAULT;
                                Float fValueOf = Float.valueOf(fMo11752c);
                                r6.put(cxkVar, fValueOf);
                                cwdVar.f9866a.put(cxk.CINEMATIC, fValueOf);
                                cwdVar.f9866a.put(cxk.ACTIVE, fValueOf);
                                float fM5674v = cqmVar2.f8938A.m5674v((cxk) cqmVar2.f8957l.m5464a().f9280j.mo3831be());
                                cqmVar2.f8950e.mo11725F(fM5674v);
                                if (cqmVar2.f8950e.mo11757h() < fM5674v && ((cxk) cqmVar2.f8957l.m5464a().f9280j.mo3831be()).equals(cxk.DEFAULT)) {
                                    cqmVar2.f8950e.mo11723D(fM5674v);
                                }
                            }
                            cqmVar2.f8965t.mo3415bf(Boolean.valueOf(((mws) Collection$EL.stream(csnVar3.f9358w).map(cqk.f8914a).filter(cdy.f5376e).map(cqk.f8916c).collect(muc.f41626a)).size() > 1));
                            dal dalVar = cqmVar2.f8961p;
                            List listM5360b = cqm.m5360b(csnVar3.f9356u);
                            List listM5360b2 = cqm.m5360b(csnVar3.f9357v);
                            boolean zM13663d = csnVar3.f9339d.m13663d();
                            boolean zM13656d = csnVar3.f9338c.m13656d();
                            boolean zMo6184l2 = cqmVar2.f8963r.mo6184l(dhh.f11059L);
                            dalVar.f10273d = (mws) Collection$EL.stream(listM5360b).map(cqk.f8919f).collect(muc.f41626a);
                            dalVar.f10274e = (mws) Collection$EL.stream(listM5360b2).map(cqk.f8919f).collect(muc.f41626a);
                            dalVar.f10275f = zM13663d;
                            if (zM13656d != ((Boolean) ((jwf) dalVar.f10271b).f34942d).booleanValue()) {
                                dalVar.f10271b.mo3415bf(Boolean.valueOf(zM13656d));
                            }
                            dalVar.f10277h = zMo6184l2;
                            dalVar.m5832t();
                            dalVar.f10276g = false;
                            gfa gfaVar = dalVar.f10278i;
                            if (gfaVar != null) {
                                gfaVar.mo9129o(false, gev.FPS);
                            }
                            cqmVar2.f8966u.mo3415bf(csnVar3.f9339d);
                            cxo cxoVar = cqmVar2.f8956k;
                            cxoVar.m5720e(cxoVar.m5716a(), true);
                        }
                    });
                    cpu cpuVar = cpdVar3.f8527e;
                    jvd jvdVar = (jvd) ((cpx) cpuVar).f8712a.get();
                    jvdVar.getClass();
                    ggm ggmVar = (ggm) ((cpx) cpuVar).f8713b.get();
                    ggmVar.getClass();
                    iey ieyVar = (iey) ((cpx) cpuVar).f8714c.get();
                    ieyVar.getClass();
                    ljf ljfVarM5879a = ((dbm) ((cpx) cpuVar).f8715d).get();
                    cqm cqmVar2 = (cqm) ((cpx) cpuVar).f8716e.get();
                    cqmVar2.getClass();
                    cso csoVar = (cso) ((cpx) cpuVar).f8717f.get();
                    csoVar.getClass();
                    cwd cwdVar = (cwd) ((cpx) cpuVar).f8718g.get();
                    cwdVar.getClass();
                    ?? r62 = ((cpx) cpuVar).f8719h.get();
                    cwd cwdVar2 = (cwd) ((cpx) cpuVar).f8720i.get();
                    cwdVar2.getClass();
                    csm csmVar = (csm) ((cpx) cpuVar).f8721j.get();
                    csmVar.getClass();
                    dbr dbrVar = (dbr) ((cpx) cpuVar).f8722k.get();
                    dbrVar.getClass();
                    cbz cbzVarM3419a = ((cca) ((cpx) cpuVar).f8723l).get();
                    fup fupVar = (fup) ((cpx) cpuVar).f8724m.get();
                    fupVar.getClass();
                    djm djmVarM5878a = ((dbl) ((cpx) cpuVar).f8725n).get();
                    hmp hmpVar = (hmp) ((cpx) cpuVar).f8726o.get();
                    hmpVar.getClass();
                    cwj cwjVar = (cwj) ((cpx) cpuVar).f8727p.get();
                    cwjVar.getClass();
                    cvr cvrVarM5622a = ((cvs) ((cpx) cpuVar).f8728q).get();
                    dhv dhvVar5 = (dhv) ((cpx) cpuVar).f8729r.get();
                    dhvVar5.getClass();
                    Object obj3 = ((cpx) cpuVar).f8730s.get();
                    ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) ((cpx) cpuVar).f8731t.get();
                    scheduledExecutorService.getClass();
                    hlg hlgVar = (hlg) ((cpx) cpuVar).f8732u.get();
                    hlgVar.getClass();
                    oju ojuVar = ((cpx) cpuVar).f8733v;
                    ohb ohbVar = ((ohl) ((cpx) cpuVar).f8734w).get();
                    ohbVar.getClass();
                    jfs jfsVar = (jfs) ((cpx) cpuVar).f8735x.get();
                    jfsVar.getClass();
                    crj crjVar = (crj) ((cpx) cpuVar).f8736y.get();
                    crjVar.getClass();
                    csx csxVar = (csx) ((cpx) cpuVar).f8737z.get();
                    csxVar.getClass();
                    ((mrm) ((cpx) cpuVar).f8711A.get()).getClass();
                    final cpw cpwVar = new cpw(jvdVar, ggmVar, ieyVar, ljfVarM5879a, cqmVar2, csoVar, cwdVar, r62, cwdVar2, csmVar, dbrVar, cbzVarM3419a, fupVar, djmVarM5878a, hmpVar, cwjVar, cvrVarM5622a, dhvVar5, (cur) obj3, scheduledExecutorService, hlgVar, ojuVar, ohbVar, jfsVar, crjVar, csxVar, csnVar, null, null, null, null, null);
                    cvy cvyVar = cpdVar3.f8535m;
                    kbc kbcVar3 = csnVar.f9341f;
                    if (((djm) cvyVar.f9846c).m6229c(csnVar)) {
                        ((djm) cvyVar.f9846c).m6230d();
                    }
                    ihx ihxVarM11370b = ihx.m11370b(csnVar.f9359x, kbcVar3, kan.m13873j(kbcVar3), mqu.f41450a);
                    int iMo14553f = ((kmr) csnVar.f9335G.f12521a).mo14553f();
                    if (csnVar.f9332D && ((mrm) cvyVar.f9847d).mo16813g()) {
                        Object obj4 = cvyVar.f9844a;
                        Object obj5 = cvyVar.f9845b;
                        ((cte) obj5).f9421b = ((cte) obj5).f9420a.mo16808b(cgh.f5603s);
                        npsVarM11367f = ((iht) obj4).m11367f(ihxVarM11370b, ((cte) obj5).f9421b, Integer.valueOf(iMo14553f));
                    } else {
                        npsVarM11367f = ((iht) cvyVar.f9844a).m11367f(ihxVarM11370b, mqu.f41450a, Integer.valueOf(iMo14553f));
                    }
                    final nps npsVarM17554j = nod.m17554j(kxk.m14969O(new cpb(cpdVar3, csnVar, 0), cpdVar3.f8523a), new cqc(cpdVar3, csnVar, 1), cpdVar3.f8523a);
                    nps npsVarM17606b = kxk.m14959E(npsVarM11367f, npsVarM17554j).m17606b(new nol() { // from class: cpc
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kmd] */
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // p000.nol
                        /* JADX INFO: renamed from: a */
                        public final nps mo3988a() {
                            nps npsVarMo5680a;
                            cpd cpdVar4 = cpdVar3;
                            cpw cpwVar2 = cpwVar;
                            nps npsVar = npsVarM11367f;
                            nps npsVar2 = npsVarM17554j;
                            kcc kccVar = kccVarMo13957a2;
                            fws fwsVar2 = cpdVar4.f8534l;
                            ihw ihwVar = (ihw) npsVar.get();
                            Surface surface = (Surface) npsVar2.get();
                            synchronized (cpwVar2.f8689e) {
                                cpv cpvVar = cpwVar2.f8709y;
                                if (cpvVar != null) {
                                    throw new IllegalStateException("Trying to init with state: " + cpvVar.toString());
                                }
                                cpwVar2.f8694j.mo5682c(cpwVar2.f8703s, ihwVar, surface);
                                npsVarMo5680a = cpwVar2.f8694j.mo5680a();
                                if (cpwVar2.f8696l.mo6184l(dhh.f11052E)) {
                                    cwj cwjVar2 = cpwVar2.f8694j;
                                    int i4 = mws.f41739d;
                                    cwjVar2.mo5684e(mzr.f41857a);
                                    cpwVar2.f8707w = cpwVar2.f8698n.schedule(new bdv(cpwVar2, 3), 500L, TimeUnit.MILLISECONDS);
                                }
                                cby cbyVarM3417a = cpwVar2.f8692h.m3417a(cpwVar2, cpwVar2.f8703s.f9335G.f12521a, cpwVar2.f8710z.f23601a, jwr.m13637g(false), cpwVar2.f8677C.m6229c(cpwVar2.f8703s), cpwVar2.f8703s.f9332D, 3);
                                cpwVar2.f8690f.add(cpwVar2);
                                cpwVar2.f8690f.add(cpwVar2.f8695k);
                                jvb jvbVarM5657d = cpwVar2.f8676B.m5657d(cum.CAPTURE_SESSION);
                                jvbVarM5657d.m13537d(cpwVar2);
                                jvbVarM5657d.m13537d(cbyVarM3417a);
                                cur curVar = cpwVar2.f8697m;
                                ikw ikwVarM8908a4 = fwsVar2.m8908a();
                                csn csnVar3 = cpwVar2.f8703s;
                                curVar.f9674i = cpwVar2;
                                curVar.f9675j = curVar.f9679n.m5625b(ikwVarM8908a4);
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(curVar.f9670e);
                                if (curVar.m5542g(csnVar3)) {
                                    arrayList.add(curVar.f9671f);
                                }
                                if (curVar.f9667b.mo6184l(dhh.f11087am)) {
                                    arrayList.add(curVar.f9672g);
                                }
                                if (!curVar.m5541f(csnVar3)) {
                                    arrayList.add(curVar.f9669d);
                                }
                                arrayList.add(curVar.f9668c);
                                curVar.f9676k = mws.m17095j(arrayList);
                                curVar.f9678m = curVar.m5542g(csnVar3) ? new cui(curVar, 2) : cik.f5795c;
                                mws mwsVar = curVar.f9676k;
                                int size = mwsVar.size();
                                int i5 = 0;
                                while (true) {
                                    int i6 = 1;
                                    if (i5 < size) {
                                        cut cutVar = (cut) mwsVar.get(i5);
                                        hny hnyVarM10529a = hnz.m10529a();
                                        hnyVarM10529a.m10528g(cutVar.f9683c);
                                        hnyVarM10529a.m10527f(cutVar.f9684d);
                                        hnyVarM10529a.m10526e(cutVar.f9685e);
                                        hnyVarM10529a.m10524c(cutVar.f9686f);
                                        hnyVarM10529a.m10525d(cutVar.f9687g);
                                        cutVar.f9681a = hnyVarM10529a.m10522a();
                                        cus cusVar = cutVar.f9688h;
                                        if (cusVar != null) {
                                            String str = String.format("%sDynamic", cutVar.f9687g);
                                            cutVar.f9682b = cusVar.mo5535a(csnVar3);
                                            hny hnyVar = new hny(cutVar.f9681a);
                                            hnyVar.m10528g(cutVar.f9682b);
                                            hnyVar.m10525d(str);
                                            cutVar.f9681a = hnyVar.m10522a();
                                            hnv hnvVar = cutVar.f9682b;
                                        }
                                        i5++;
                                    } else {
                                        cpwVar2.f8702r.mo5413b(cpwVar2.f8703s);
                                        cpwVar2.f8705u.mo5484b(cpwVar2.f8703s);
                                        cpwVar2.f8693i.m10464b(new hpr(cpwVar2, i6));
                                        cpwVar2.m5269k(cpv.NO_RECORDING);
                                    }
                                }
                            }
                            kccVar.mo13952a();
                            return nod.m17553i(npsVarMo5680a, new ceg(cpwVar2, 8), not.INSTANCE);
                        }
                    }, cpdVar3.f8523a);
                    jvh.m13562j(npsVarM17606b, new cis(cpdVar3, 2), cpdVar3.f8524b);
                    this.f8607s = this.f8588L.m6234i();
                    this.f8584H = npsVarM17606b;
                    int i4 = 3;
                    if (i == 3) {
                        this.f8593e.mo11721B(false);
                    } else {
                        i4 = i;
                    }
                    kxk.m14975U(npsVarM17606b, new cpi(this, i4, kccVarMo13957a, npsVarM17606b), this.f8579C);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final cpw m5229a() {
        cpw cpwVar;
        synchronized (this.f8608t) {
            cpwVar = this.f8602n;
        }
        return cpwVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m5230b(cre creVar) {
        this.f8592d.add(creVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:69:0x0158 A[Catch: all -> 0x025d, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004f, B:14:0x0053, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:22:0x0069, B:25:0x006f, B:27:0x009f, B:28:0x00a2, B:30:0x00b6, B:31:0x00b9, B:33:0x00cd, B:34:0x00d0, B:38:0x00e5, B:40:0x00eb, B:41:0x00ee, B:44:0x0106, B:45:0x0109, B:81:0x01c2, B:82:0x01cf, B:49:0x0112, B:51:0x011a, B:52:0x011d, B:54:0x0132, B:55:0x0135, B:77:0x01b1, B:78:0x01be, B:67:0x0152, B:69:0x0158, B:70:0x015b, B:72:0x0178, B:73:0x017b, B:75:0x0192, B:76:0x0195, B:80:0x01c1, B:84:0x01d2, B:85:0x01d3, B:87:0x01dd, B:88:0x01e2, B:90:0x01e7, B:91:0x01ec, B:93:0x01f1, B:94:0x01f6, B:96:0x01fa, B:97:0x01ff, B:99:0x0203, B:100:0x0208, B:102:0x020c, B:103:0x0211, B:105:0x0215, B:106:0x021a, B:108:0x0221, B:109:0x0226, B:110:0x0235, B:111:0x0236, B:113:0x0256, B:114:0x025b), top: B:119:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0178 A[Catch: all -> 0x025d, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004f, B:14:0x0053, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:22:0x0069, B:25:0x006f, B:27:0x009f, B:28:0x00a2, B:30:0x00b6, B:31:0x00b9, B:33:0x00cd, B:34:0x00d0, B:38:0x00e5, B:40:0x00eb, B:41:0x00ee, B:44:0x0106, B:45:0x0109, B:81:0x01c2, B:82:0x01cf, B:49:0x0112, B:51:0x011a, B:52:0x011d, B:54:0x0132, B:55:0x0135, B:77:0x01b1, B:78:0x01be, B:67:0x0152, B:69:0x0158, B:70:0x015b, B:72:0x0178, B:73:0x017b, B:75:0x0192, B:76:0x0195, B:80:0x01c1, B:84:0x01d2, B:85:0x01d3, B:87:0x01dd, B:88:0x01e2, B:90:0x01e7, B:91:0x01ec, B:93:0x01f1, B:94:0x01f6, B:96:0x01fa, B:97:0x01ff, B:99:0x0203, B:100:0x0208, B:102:0x020c, B:103:0x0211, B:105:0x0215, B:106:0x021a, B:108:0x0221, B:109:0x0226, B:110:0x0235, B:111:0x0236, B:113:0x0256, B:114:0x025b), top: B:119:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0192 A[Catch: all -> 0x025d, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x000a, B:8:0x0010, B:9:0x0013, B:11:0x001a, B:12:0x004f, B:14:0x0053, B:16:0x005d, B:18:0x0061, B:20:0x0065, B:22:0x0069, B:25:0x006f, B:27:0x009f, B:28:0x00a2, B:30:0x00b6, B:31:0x00b9, B:33:0x00cd, B:34:0x00d0, B:38:0x00e5, B:40:0x00eb, B:41:0x00ee, B:44:0x0106, B:45:0x0109, B:81:0x01c2, B:82:0x01cf, B:49:0x0112, B:51:0x011a, B:52:0x011d, B:54:0x0132, B:55:0x0135, B:77:0x01b1, B:78:0x01be, B:67:0x0152, B:69:0x0158, B:70:0x015b, B:72:0x0178, B:73:0x017b, B:75:0x0192, B:76:0x0195, B:80:0x01c1, B:84:0x01d2, B:85:0x01d3, B:87:0x01dd, B:88:0x01e2, B:90:0x01e7, B:91:0x01ec, B:93:0x01f1, B:94:0x01f6, B:96:0x01fa, B:97:0x01ff, B:99:0x0203, B:100:0x0208, B:102:0x020c, B:103:0x0211, B:105:0x0215, B:106:0x021a, B:108:0x0221, B:109:0x0226, B:110:0x0235, B:111:0x0236, B:113:0x0256, B:114:0x025b), top: B:119:0x0005 }] */
    /* JADX WARN: Type inference failed for: r3v35, types: [fcp, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final void m5231c() {
        kmq kmqVar;
        int i;
        int i2;
        ikw ikwVar;
        int i3;
        nxq nxqVar;
        synchronized (this.f8608t) {
            nps npsVar = this.f8584H;
            int i4 = 1;
            if (npsVar != null && !npsVar.isDone()) {
                npsVar.cancel(true);
            }
            this.f8584H = null;
            if (this.f8602n != null) {
                this.f8595g.m10437h(hld.CAPTURE_SESSION_CLOSED);
                dbn dbnVar = this.f8606r;
                dbnVar.getClass();
                dbnVar.m5885f(this.f8595g.m10441c(hld.CAPTURE_SESSION_STARTED, hld.CAPTURE_SESSION_CLOSED));
                dbnVar.m5884e(this.f8588L.m6235j());
                dbnVar.m5880a(((Boolean) this.f8603o.f9289s.mo3831be()).booleanValue());
                this.f8602n = null;
            }
            dbn dbnVar2 = this.f8606r;
            if (dbnVar2 != null) {
                ljf ljfVar = this.f8589M;
                if (dbnVar2.f10399g == 15 && (kmqVar = dbnVar2.f10396d) != null && (i = dbnVar2.f10400h) != 0 && (i2 = dbnVar2.f10401i) != 0 && (ikwVar = dbnVar2.f10397e) != null) {
                    dbo dboVar = new dbo(dbnVar2.f10393a, dbnVar2.f10394b, dbnVar2.f10395c, kmqVar, i, i2, ikwVar, dbnVar2.f10398f);
                    nxl nxlVarM18137O = nmf.f43766j.m18137O();
                    int i5 = dboVar.f10402a;
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar2 = nxlVarM18137O.f44974b;
                    nmf nmfVar = (nmf) nxqVar2;
                    nmfVar.f43768a |= 1;
                    nmfVar.f43769b = i5;
                    int i6 = dboVar.f10403b;
                    if (!nxqVar2.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar3 = nxlVarM18137O.f44974b;
                    nmf nmfVar2 = (nmf) nxqVar3;
                    nmfVar2.f43768a |= 2;
                    nmfVar2.f43770c = i6;
                    int i7 = dboVar.f10404c;
                    if (!nxqVar3.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar4 = nxlVarM18137O.f44974b;
                    nmf nmfVar3 = (nmf) nxqVar4;
                    nmfVar3.f43768a |= 4;
                    nmfVar3.f43771d = i7;
                    boolean z = dboVar.f10405d == kmq.f36557a;
                    if (!nxqVar4.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nmf nmfVar4 = (nmf) nxlVarM18137O.f44974b;
                    nmfVar4.f43768a |= 8;
                    nmfVar4.f43772e = z;
                    int i8 = dboVar.f10408g;
                    cxk cxkVar = cxk.OFF;
                    jzf jzfVar = jzf.VIDEO_BUFFER_DELAY;
                    int i9 = i8 - 1;
                    if (i8 == 0) {
                        throw null;
                    }
                    switch (i9) {
                        case 0:
                            i3 = 1;
                            break;
                        case 1:
                            i3 = 2;
                            break;
                        case 2:
                            i3 = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Not a valid session state: ".concat(bzq.m3255aa(i8)));
                    }
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    nxq nxqVar5 = nxlVarM18137O.f44974b;
                    nmf nmfVar5 = (nmf) nxqVar5;
                    nmfVar5.f43773f = i3 - 1;
                    nmfVar5.f43768a |= 16;
                    int i10 = dboVar.f10409h;
                    int i11 = i10 - 1;
                    if (i10 == 0) {
                        throw null;
                    }
                    switch (i11) {
                        case 0:
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar6 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar6.f43774g = i4 - 1;
                            nmfVar6.f43768a |= 32;
                            int iM15524n = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar7 = (nmf) nxqVar;
                            nmfVar7.f43775h = iM15524n - 1;
                            nmfVar7.f43768a |= 64;
                            boolean z2 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar8 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar8.f43768a |= 128;
                            nmfVar8.f43776i = z2;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 1:
                            i4 = 2;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar9 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar9.f43774g = i4 - 1;
                            nmfVar9.f43768a |= 32;
                            int iM15524n2 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar10 = (nmf) nxqVar;
                            nmfVar10.f43775h = iM15524n2 - 1;
                            nmfVar10.f43768a |= 64;
                            boolean z3 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar11 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar11.f43768a |= 128;
                            nmfVar11.f43776i = z3;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 2:
                            i4 = 3;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar12 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar12.f43774g = i4 - 1;
                            nmfVar12.f43768a |= 32;
                            int iM15524n3 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar13 = (nmf) nxqVar;
                            nmfVar13.f43775h = iM15524n3 - 1;
                            nmfVar13.f43768a |= 64;
                            boolean z4 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar14 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar14.f43768a |= 128;
                            nmfVar14.f43776i = z4;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 3:
                            i4 = 4;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar15 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar15.f43774g = i4 - 1;
                            nmfVar15.f43768a |= 32;
                            int iM15524n4 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar16 = (nmf) nxqVar;
                            nmfVar16.f43775h = iM15524n4 - 1;
                            nmfVar16.f43768a |= 64;
                            boolean z5 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar17 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar17.f43768a |= 128;
                            nmfVar17.f43776i = z5;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 4:
                            i4 = 5;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar18 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar18.f43774g = i4 - 1;
                            nmfVar18.f43768a |= 32;
                            int iM15524n5 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar19 = (nmf) nxqVar;
                            nmfVar19.f43775h = iM15524n5 - 1;
                            nmfVar19.f43768a |= 64;
                            boolean z6 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar110 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar110.f43768a |= 128;
                            nmfVar110.f43776i = z6;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 5:
                            i4 = 6;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar111 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar111.f43774g = i4 - 1;
                            nmfVar111.f43768a |= 32;
                            int iM15524n6 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar112 = (nmf) nxqVar;
                            nmfVar112.f43775h = iM15524n6 - 1;
                            nmfVar112.f43768a |= 64;
                            boolean z7 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar113 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar113.f43768a |= 128;
                            nmfVar113.f43776i = z7;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 6:
                            i4 = 7;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar114 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar114.f43774g = i4 - 1;
                            nmfVar114.f43768a |= 32;
                            int iM15524n7 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar115 = (nmf) nxqVar;
                            nmfVar115.f43775h = iM15524n7 - 1;
                            nmfVar115.f43768a |= 64;
                            boolean z8 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar116 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar116.f43768a |= 128;
                            nmfVar116.f43776i = z8;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 7:
                            i4 = 8;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar117 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar117.f43774g = i4 - 1;
                            nmfVar117.f43768a |= 32;
                            int iM15524n8 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar118 = (nmf) nxqVar;
                            nmfVar118.f43775h = iM15524n8 - 1;
                            nmfVar118.f43768a |= 64;
                            boolean z9 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar119 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar119.f43768a |= 128;
                            nmfVar119.f43776i = z9;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 8:
                            i4 = 9;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1110 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1110.f43774g = i4 - 1;
                            nmfVar1110.f43768a |= 32;
                            int iM15524n9 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar1111 = (nmf) nxqVar;
                            nmfVar1111.f43775h = iM15524n9 - 1;
                            nmfVar1111.f43768a |= 64;
                            boolean z10 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1112 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1112.f43768a |= 128;
                            nmfVar1112.f43776i = z10;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 9:
                            i4 = 10;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1113 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1113.f43774g = i4 - 1;
                            nmfVar1113.f43768a |= 32;
                            int iM15524n10 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar1114 = (nmf) nxqVar;
                            nmfVar1114.f43775h = iM15524n10 - 1;
                            nmfVar1114.f43768a |= 64;
                            boolean z11 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1115 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1115.f43768a |= 128;
                            nmfVar1115.f43776i = z11;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        case 10:
                            i4 = 11;
                            if (!nxqVar5.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1116 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1116.f43774g = i4 - 1;
                            nmfVar1116.f43768a |= 32;
                            int iM15524n11 = ljf.m15524n(dboVar.f10406e, false);
                            if (!nxlVarM18137O.f44974b.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nxqVar = nxlVarM18137O.f44974b;
                            nmf nmfVar1117 = (nmf) nxqVar;
                            nmfVar1117.f43775h = iM15524n11 - 1;
                            nmfVar1117.f43768a |= 64;
                            boolean z12 = dboVar.f10407f;
                            if (!nxqVar.m18142ac()) {
                                nxlVarM18137O.mo18106p();
                            }
                            nmf nmfVar1118 = (nmf) nxlVarM18137O.f44974b;
                            nmfVar1118.f43768a |= 128;
                            nmfVar1118.f43776i = z12;
                            ljfVar.f38374f.mo8139N((nmf) nxlVarM18137O.mo18103l());
                            this.f8606r = null;
                            break;
                        default:
                            throw new IllegalArgumentException("Not a valid session source: ".concat(bzq.m3256ab(i10)));
                    }
                }
                StringBuilder sb = new StringBuilder();
                if ((1 & dbnVar2.f10399g) == 0) {
                    sb.append(" creationLatencyMs");
                }
                if ((dbnVar2.f10399g & 2) == 0) {
                    sb.append(" sessionDurationMs");
                }
                if ((dbnVar2.f10399g & 4) == 0) {
                    sb.append(" numRecordedSessions");
                }
                if (dbnVar2.f10396d == null) {
                    sb.append(" cameraFacing");
                }
                if (dbnVar2.f10400h == 0) {
                    sb.append(" sessionState");
                }
                if (dbnVar2.f10401i == 0) {
                    sb.append(" sessionSource");
                }
                if (dbnVar2.f10397e == null) {
                    sb.append(" mode");
                }
                if ((dbnVar2.f10399g & 8) == 0) {
                    sb.append(" actionOnUserEdu");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            this.f8605q = false;
            this.f8587K.m5658e(cum.CAPTURE_SESSION);
            this.f8587K.m5658e(cum.VIDEO_RECORDER);
            Collection$EL.stream(this.f8592d).forEach(cpf.f8549a);
            csl cslVar = this.f8603o;
            if (cslVar != null) {
                cslVar.m5463a(csj.CAPTURE_SESSION_CLOSED);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5232d() {
        synchronized (this.f8608t) {
            this.f8603o = this.f8578B.m5464a();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5233e() {
        synchronized (this.f8608t) {
            ikw ikwVarM8908a = this.f8611w.m8908a();
            if (ikwVarM8908a != ikw.SLOW_MOTION && ikwVarM8908a != ikw.AMBER) {
                this.f8591c.m5899h(new cmd(this, 8));
                return;
            }
            ((nbe) ((nbe) f8576a.m17252c()).mo17276G(405)).mo17293r("Camera switch not supported for %s", ikwVarM8908a);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m5234f(int i) {
        synchronized (this.f8608t) {
            if (m5227s()) {
                cpw cpwVar = this.f8602n;
                boolean z = false;
                if (cpwVar != null) {
                    synchronized (cpwVar.f8689e) {
                        if (i == 0) {
                            cpwVar.f8706v = false;
                        }
                    }
                }
                jww jwwVar = this.f8603o.f9276f;
                if (i == 0 && ((Boolean) ((jwf) jwwVar).f34942d).booleanValue()) {
                    z = true;
                }
                jwwVar.mo3415bf(Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m5235g(boolean z) {
        cpw cpwVar;
        synchronized (this.f8608t) {
            if (m5227s() && (cpwVar = this.f8602n) != null) {
                cpwVar.mo5267i(z);
                if (this.f8605q || this.f8604p) {
                    this.f8594f.mo11254z(false);
                    this.f8605q = false;
                    this.f8604p = false;
                }
            } else if (((jwf) this.f8603o.f9277g).f34942d == csj.INITIATING) {
                this.f8605q = true;
            } else {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(408)).mo17293r("onShutterButtonClicked ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m5236h() {
        cpw cpwVar;
        cqf cqfVar;
        synchronized (this.f8608t) {
            if (!m5227s() || (cpwVar = this.f8602n) == null) {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(411)).mo17293r("onSnapshotButtonClicked ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
            } else {
                jvd.m13538a();
                synchronized (cpwVar.f8689e) {
                    cqg cqgVar = cpwVar.f8708x;
                    if (cqgVar != null) {
                        jvd.m13538a();
                        synchronized (cqgVar.f8854f) {
                            if (cqgVar.f8830E == cqf.RECORDING || (cqfVar = cqgVar.f8830E) == cqf.RECORDING_PAUSED || cqfVar == cqf.STARTING_RECORDING) {
                                cqgVar.f8852d.m5371l(false);
                                gyv gyvVarM10003a = gyv.m10003a(gyu.m10002a(), System.currentTimeMillis(), dlt.m6367a(gyw.VIDEO_SNAPSHOT, System.currentTimeMillis()), gyw.VIDEO_SNAPSHOT);
                                cqgVar.f8872x.mo6362j(gyvVarM10003a);
                                cqgVar.f8827B.add(gyvVarM10003a);
                                nps npsVarMo5692a = cqgVar.f8864p.mo5692a(gyvVarM10003a);
                                cqgVar.f8852d.f8968w.mo3721k();
                                kxk.m14975U(npsVarMo5692a, new cou(cqgVar, gyvVarM10003a, 4), cqgVar.f8851c);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5237i() {
        cpw cpwVar;
        synchronized (this.f8608t) {
            if (!m5227s() || (cpwVar = this.f8602n) == null) {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(413)).mo17293r("onThumbnailButtonClicked ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
            } else {
                synchronized (cpwVar.f8689e) {
                    cpwVar.f8706v = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5238j(boolean z) {
        cpw cpwVar;
        synchronized (this.f8608t) {
            if (!m5227s() || (cpwVar = this.f8602n) == null) {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(415)).mo17293r("onWindowFocusChanged ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
            } else {
                synchronized (cpwVar.f8689e) {
                    if (z) {
                        cpwVar.f8706v = false;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m5239k(cre creVar) {
        this.f8592d.remove(creVar);
    }

    /* JADX INFO: renamed from: l */
    public final void m5240l(boolean z) {
        synchronized (this.f8608t) {
            if (this.f8603o == null) {
                m5232d();
            }
            csj csjVar = (csj) ((jwf) this.f8603o.f9277g).f34942d;
            if (csjVar != csj.INITIATING && csjVar != csj.f9247c && csjVar != csj.RECORDING_SESSION_ACTIVE) {
                cvd cvdVarM5563a = ((cve) this.f8580D).get();
                this.f8586J = cvdVarM5563a;
                synchronized (cvdVarM5563a.f9766d) {
                    if (!cvdVarM5563a.f9767e) {
                        if (cvdVarM5563a.f9768f) {
                            cvdVarM5563a.m5561a();
                        }
                        cvdVarM5563a.m5562b();
                        cvdVarM5563a.f9763a.registerAudioDeviceCallback(cvdVarM5563a.f9764b, cvdVarM5563a.f9765c);
                        cvdVarM5563a.f9768f = true;
                    }
                }
                this.f8587K.m5657d(cum.MODULE).m13537d(this.f8586J);
                jvb jvbVarM5657d = this.f8587K.m5657d(cum.MODULE);
                this.f8600l.m7597a(this.f8601m);
                jvbVarM5657d.m13537d(new cft(this, 10));
                this.f8587K.m5657d(cum.MODULE).m13537d(this.f8594f.mo11233e(this.f8599k));
                cva cvaVarM5560a = ((cvb) this.f8581E).get();
                this.f8609u = cvaVarM5560a;
                synchronized (cvaVarM5560a.f9751e) {
                    cvaVarM5560a.f9750d.m13537d(jwr.m13640j(cvaVarM5560a.f9752f.f26912a, cgh.f5604t).mo3830a(new ckv(cvaVarM5560a, 18), not.INSTANCE));
                    cvaVarM5560a.f9750d.m13537d(cvaVarM5560a.f9752f.f26914c.mo3830a(new ckv(cvaVarM5560a, 19), not.INSTANCE));
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
                    cvaVarM5560a.f9748b.registerReceiver(cvaVarM5560a.f9755i, intentFilter);
                }
                this.f8587K.m5657d(cum.MODULE).m13537d(this.f8609u);
                if (z) {
                    m5228t(2);
                }
                return;
            }
            ((nbe) ((nbe) f8576a.m17252c()).mo17276G(417)).mo17290o("Capture session already started. Ignoring...");
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: m */
    public final void m5241m() {
        synchronized (this.f8608t) {
            m5231c();
            cvd cvdVar = this.f8586J;
            if (cvdVar != null) {
                cvdVar.m5561a();
            }
            cwd cwdVar = this.f8587K;
            Iterator it = new HashSet(cwdVar.f9866a.keySet()).iterator();
            while (it.hasNext()) {
                cwdVar.m5658e((cum) it.next());
            }
            csl cslVar = this.f8603o;
            if (cslVar != null) {
                cslVar.m5463a(csj.UNINITIALIZED);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5242n() {
        boolean z;
        synchronized (this.f8608t) {
            hyd hydVar = (hyd) this.f8603o.f9287q.mo3831be();
            hyd hydVar2 = this.f8585I;
            z = false;
            if (hydVar2 != null && hydVar != null && jiy.m13268ac(hydVar2) != jiy.m13268ac(hydVar)) {
                z = true;
            }
            if (z) {
                this.f8585I = hydVar;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m5243o() {
        synchronized (this.f8608t) {
            if (((jwf) this.f8603o.f9277g).f34942d == csj.RECORDING_SESSION_ACTIVE) {
                m5235g(false);
                return true;
            }
            if (!this.f8611w.m8908a().equals(ikw.SLOW_MOTION)) {
                return false;
            }
            this.f8583G.mo5814e();
            return true;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [hht, java.lang.Object] */
    /* JADX INFO: renamed from: p */
    public final boolean m5244p() {
        cpw cpwVar;
        synchronized (this.f8608t) {
            boolean z = false;
            if (!m5227s() || (cpwVar = this.f8602n) == null) {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(422)).mo17293r("onPauseButtonClicked ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
                return false;
            }
            jvd.m13538a();
            synchronized (cpwVar.f8689e) {
                cqg cqgVar = cpwVar.f8708x;
                if (cqgVar != null) {
                    synchronized (cqgVar.f8854f) {
                        if (cqgVar.f8830E != cqf.RECORDING) {
                            ((nbe) ((nbe) cqg.f8825a.m17252c()).mo17276G(481)).mo17293r("Pause button ignored with state: %s", cqgVar.f8830E);
                        } else {
                            cqgVar.f8874z.mo13961e("onPauseButtonClicked");
                            cuu cuuVar = cqgVar.f8831F;
                            cuuVar.getClass();
                            cuuVar.f9689a.mo13748g();
                            cug cugVar = cqgVar.f8865q;
                            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
                            synchronized (cugVar) {
                                cugVar.f9608b.add(mzj.m17173c(Long.valueOf(jElapsedRealtimeNanos)));
                            }
                            cqgVar.f8855g.m5530c();
                            cqgVar.f8837L.f9866a.mo10316b(C0100R.raw.video_pause);
                            cqgVar.f8836K.m5660g(1);
                            cqgVar.m5354j(cqf.RECORDING_PAUSED);
                            if (cqgVar.f8860l.f9330B) {
                                cqgVar.f8870v.m5745c(false);
                            }
                            cqgVar.f8874z.mo13962f();
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [hht, java.lang.Object] */
    /* JADX INFO: renamed from: q */
    public final boolean m5245q() {
        cpw cpwVar;
        synchronized (this.f8608t) {
            boolean z = false;
            if (!m5227s() || (cpwVar = this.f8602n) == null) {
                ((nbe) ((nbe) f8576a.m17252c()).mo17276G(424)).mo17293r("onResumeButtonClicked ignored with state: %s", ((jwf) this.f8603o.f9277g).f34942d);
                return false;
            }
            jvd.m13538a();
            synchronized (cpwVar.f8689e) {
                cqg cqgVar = cpwVar.f8708x;
                if (cqgVar != null) {
                    synchronized (cqgVar.f8854f) {
                        if (cqgVar.f8830E != cqf.RECORDING_PAUSED) {
                            ((nbe) ((nbe) cqg.f8825a.m17252c()).mo17276G(482)).mo17293r("Resume button ignored with state: %s", cqgVar.f8830E);
                        } else {
                            cqgVar.f8874z.mo13961e("onResumeButtonClicked");
                            cqgVar.f8837L.f9866a.mo10316b(C0100R.raw.video_start);
                            cqgVar.f8836K.m5660g(2);
                            cqgVar.m5354j(cqf.STARTING_RECORDING);
                            cqgVar.f8866r.schedule(new cmd(cqgVar, 16), 400L, TimeUnit.MILLISECONDS);
                            cqgVar.f8874z.mo13962f();
                            z = true;
                        }
                    }
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m5246r(int i) {
        synchronized (this.f8608t) {
            m5231c();
            m5228t(i);
        }
    }
}
