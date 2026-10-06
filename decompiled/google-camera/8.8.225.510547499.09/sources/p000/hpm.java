package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.social.licenses.GWO.HEePJw;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Timer;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hpm {

    /* JADX INFO: renamed from: a */
    public static final nbh f28881a = nbh.m17259h("com/google/android/apps/camera/timelapse/TimelapseRecordingController");

    /* JADX INFO: renamed from: A */
    public final hot f28882A;

    /* JADX INFO: renamed from: B */
    public final hpg f28883B;

    /* JADX INFO: renamed from: C */
    public final hqb f28884C;

    /* JADX INFO: renamed from: D */
    public final hpu f28885D;

    /* JADX INFO: renamed from: E */
    public final hqk f28886E;

    /* JADX INFO: renamed from: F */
    public final fcp f28887F;

    /* JADX INFO: renamed from: G */
    public final kbg f28888G;

    /* JADX INFO: renamed from: H */
    public final Sensor f28889H;

    /* JADX INFO: renamed from: I */
    public final dlw f28890I;

    /* JADX INFO: renamed from: J */
    public final cso f28891J;

    /* JADX INFO: renamed from: K */
    public kmq f28892K;

    /* JADX INFO: renamed from: L */
    public nps f28893L;

    /* JADX INFO: renamed from: N */
    public double f28895N;

    /* JADX INFO: renamed from: O */
    public double f28896O;

    /* JADX INFO: renamed from: P */
    public long f28897P;

    /* JADX INFO: renamed from: Q */
    public long f28898Q;

    /* JADX INFO: renamed from: R */
    public final hqo f28899R;

    /* JADX INFO: renamed from: S */
    public final drj f28900S;

    /* JADX INFO: renamed from: T */
    public final djm f28901T;

    /* JADX INFO: renamed from: U */
    public final bko f28902U;

    /* JADX INFO: renamed from: V */
    public final djm f28903V;

    /* JADX INFO: renamed from: W */
    public final ljf f28904W;

    /* JADX INFO: renamed from: X */
    private final jwn f28905X;

    /* JADX INFO: renamed from: Y */
    private final jww f28906Y;

    /* JADX INFO: renamed from: Z */
    private final kbz f28907Z;

    /* JADX INFO: renamed from: aa */
    private final iht f28908aa;

    /* JADX INFO: renamed from: ab */
    private final mrm f28909ab;

    /* JADX INFO: renamed from: ac */
    private final iuj f28910ac;

    /* JADX INFO: renamed from: ad */
    private ScheduledFuture f28911ad;

    /* JADX INFO: renamed from: ae */
    private final hpl f28912ae;

    /* JADX INFO: renamed from: af */
    private final jfo f28913af;

    /* JADX INFO: renamed from: ag */
    private final jfo f28914ag;

    /* JADX INFO: renamed from: ah */
    private final jfo f28915ah;

    /* JADX INFO: renamed from: ai */
    private final jfs f28916ai;

    /* JADX INFO: renamed from: d */
    public long f28919d;

    /* JADX INFO: renamed from: f */
    public final cvr f28921f;

    /* JADX INFO: renamed from: g */
    public final dbr f28922g;

    /* JADX INFO: renamed from: h */
    public final hht f28923h;

    /* JADX INFO: renamed from: i */
    public final htf f28924i;

    /* JADX INFO: renamed from: k */
    public final Context f28926k;

    /* JADX INFO: renamed from: l */
    public final Executor f28927l;

    /* JADX INFO: renamed from: m */
    public final hoj f28928m;

    /* JADX INFO: renamed from: n */
    public final dhv f28929n;

    /* JADX INFO: renamed from: o */
    public final hpa f28930o;

    /* JADX INFO: renamed from: p */
    public final jvd f28931p;

    /* JADX INFO: renamed from: r */
    public final mrm f28933r;

    /* JADX INFO: renamed from: s */
    public final oju f28934s;

    /* JADX INFO: renamed from: t */
    public final jww f28935t;

    /* JADX INFO: renamed from: u */
    public final jww f28936u;

    /* JADX INFO: renamed from: v */
    public final ScheduledExecutorService f28937v;

    /* JADX INFO: renamed from: w */
    public final iey f28938w;

    /* JADX INFO: renamed from: x */
    public final SensorEventListener f28939x;

    /* JADX INFO: renamed from: y */
    public final SensorManager f28940y;

    /* JADX INFO: renamed from: z */
    public final cwz f28941z;

    /* JADX INFO: renamed from: b */
    public final Object f28917b = new Object();

    /* JADX INFO: renamed from: c */
    public final double[] f28918c = new double[3];

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f28920e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: q */
    public final Object f28932q = new Object();

    /* JADX INFO: renamed from: M */
    public mrm f28894M = mqu.f41450a;

    /* JADX INFO: renamed from: j */
    public final jwf f28925j = new jwf(hor.STATE_UNINITIALIZED);

    public hpm(cwd cwdVar, dbr dbrVar, hht hhtVar, htf htfVar, Context context, Executor executor, hoj hojVar, djm djmVar, dhv dhvVar, bko bkoVar, jvb jvbVar, jvd jvdVar, elx elxVar, mrm mrmVar, jwn jwnVar, mrm mrmVar2, jww jwwVar, jww jwwVar2, jww jwwVar3, oju ojuVar, iey ieyVar, ScheduledExecutorService scheduledExecutorService, hot hotVar, hpa hpaVar, hpg hpgVar, hqb hqbVar, hpu hpuVar, hqk hqkVar, kbz kbzVar, fcp fcpVar, djm djmVar2, har harVar, drj drjVar, kbg kbgVar, iht ihtVar, cwz cwzVar, cvr cvrVar, ljf ljfVar, iuj iujVar, jfs jfsVar, dlw dlwVar, C1058va c1058va, hqo hqoVar, cso csoVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f28889H = cwdVar.m5649G().getDefaultSensor(4);
        this.f28922g = dbrVar;
        this.f28934s = ojuVar;
        this.f28923h = hhtVar;
        this.f28924i = htfVar;
        this.f28926k = context;
        this.f28929n = dhvVar;
        this.f28888G = kbgVar;
        this.f28930o = hpaVar;
        this.f28928m = hojVar;
        this.f28903V = djmVar;
        this.f28902U = bkoVar;
        this.f28927l = executor;
        this.f28931p = jvdVar;
        this.f28933r = mrmVar;
        this.f28935t = jwwVar;
        this.f28936u = jwwVar2;
        this.f28906Y = jwwVar3;
        this.f28938w = ieyVar;
        this.f28940y = cwdVar.m5649G();
        this.f28882A = hotVar;
        this.f28883B = hpgVar;
        this.f28884C = hqbVar;
        this.f28885D = hpuVar;
        this.f28886E = hqkVar;
        this.f28907Z = kbzVar;
        this.f28887F = fcpVar;
        this.f28901T = djmVar2;
        this.f28900S = drjVar;
        this.f28908aa = ihtVar;
        this.f28909ab = mrmVar2;
        this.f28905X = jwnVar;
        this.f28941z = cwzVar;
        this.f28921f = cvrVar;
        this.f28904W = ljfVar;
        this.f28910ac = iujVar;
        this.f28937v = scheduledExecutorService;
        this.f28916ai = jfsVar;
        this.f28890I = dlwVar;
        this.f28899R = hqoVar;
        this.f28891J = csoVar;
        jvbVar.m13537d(hpgVar.f28812e.mo3830a(new hmv(this, 10), jvdVar));
        int i = 11;
        jvbVar.m13537d(harVar.mo3830a(new hmv(this, i), jvdVar));
        c1058va.m19463A(new hpi(this, i), jvbVar);
        this.f28939x = new hpk(this, hqkVar, 0);
        hpl hplVar = new hpl(this, jvdVar, hqbVar, elxVar, context);
        this.f28912ae = hplVar;
        jfo jfoVar = new jfo(this, hqkVar);
        this.f28915ah = jfoVar;
        jfo jfoVar2 = new jfo(this, hqkVar);
        this.f28914ag = jfoVar2;
        jfo jfoVar3 = new jfo(this, dhvVar);
        this.f28913af = jfoVar3;
        hpgVar.f28800ag = hplVar;
        hqkVar.f29073U = jfoVar;
        hpuVar.f29008n = jfoVar2;
        hotVar.f28674u = jfoVar3;
    }

    /* JADX INFO: renamed from: a */
    public final hqo m10583a() {
        hqo hqoVar = this.f28899R;
        hqoVar.getClass();
        return hqoVar;
    }

    /* JADX INFO: renamed from: b */
    public final void m10584b(kmq kmqVar) {
        hqo hqoVar = this.f28899R;
        hqo hqoVar2 = hqo.AUTO_FPS_30_5X;
        for (jxn jxnVar : jxn.values()) {
            int i = hqoVar.f29161g;
            if (i == jxnVar.f35058i && hqoVar.f29162h == jxnVar.f35059j && i == jxnVar.f35060k) {
                this.f28892K = kmqVar;
                hqk hqkVar = this.f28886E;
                hqkVar.f29088k.m13541c(new hps(hqkVar, 3));
                hpg hpgVar = this.f28883B;
                hqo hqoVar3 = this.f28899R;
                hpgVar.f28812e.mo3415bf(false);
                hpgVar.f28777J = jxnVar;
                hpgVar.f28780M = kmqVar;
                hpgVar.f28790W = hqoVar3;
                hpgVar.f28778K = jpd.m13439t(hpgVar.f28814g, hpgVar.f28811d, hpgVar.f28806am, hpgVar.f28801ah);
                hpgVar.f28779L = new gaf(hpgVar.f28822o, hpgVar.f28796ac.f36117a, (kmd) hpgVar.f28814g.m5896e().mo16809c(), jzn.m13824l("TimelapseDynamicSensorOrientationListener"));
                if (!hpgVar.f28811d.mo6184l(diy.f11747d)) {
                    hoj hojVar = hpgVar.f28817j;
                    if (hojVar.f28589M.m6240o()) {
                        jxp jxpVarM13439t = jpd.m13439t(hojVar.f28611u, hojVar.f28612v, hojVar.f28589M, hojVar.f28587K);
                        hojVar.f28579C = ((hqu) hojVar.f28614x).get();
                        hojVar.f28579C.mo10640e(hojVar.f28611u.m5901j(), jxpVarM13439t.m13661b().f35517a, jxpVarM13439t.m13661b().f35518b, new AmbientModeSupport.AmbientController(hojVar));
                        Sensor sensor = hojVar.f28578B;
                        if (sensor != null) {
                            hojVar.f28616z.registerListener(hojVar.f28577A, sensor, 3);
                        }
                    }
                    hojVar.f28606p.set(0L);
                    hojVar.f28609s.set(0L);
                }
                hpgVar.f28773F = new hpd(hpgVar);
                hqo hqoVar4 = this.f28899R;
                if (this.f28929n.mo6184l(diy.f11747d)) {
                    hpa hpaVar = this.f28930o;
                    synchronized (hpaVar.f28750t) {
                        hpaVar.f28756z = hqoVar4;
                        hpaVar.f28735e.m17568b(((Double) hpaVar.f28751u.mo3831be()).doubleValue());
                        hpaVar.f28727A = (hqn) hpaVar.f28752v.mo3831be();
                    }
                } else {
                    hoj hojVar2 = this.f28928m;
                    hojVar2.f28584H = hqoVar4;
                    hojVar2.f28596f.m17568b(((Double) hojVar2.f28615y.mo3831be()).doubleValue());
                }
                this.f28910ac.mo11768s();
                return;
            }
        }
        throw new IllegalArgumentException("No camcorderCaptureRate found.");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: c */
    final void m10585c() {
        kgi kgiVarM14212b;
        kgi kgiVarM14196a;
        kfn kfnVarM14140a;
        kcc kccVarMo13957a = this.f28907Z.mo13957a("Cheetah-OpenCameraAndStartPreview");
        hpg hpgVar = this.f28883B;
        hpgVar.m10578e();
        hpgVar.f28782O = new jvb();
        kmg kmgVarM8909b = hpgVar.f28804ak.m8909b();
        kmgVarM8909b.getClass();
        hpgVar.f28774G = kmgVarM8909b;
        kmg kmgVarM8910c = hpgVar.f28804ak.m8910c();
        kmgVarM8910c.getClass();
        hpgVar.f28775H = kmgVarM8910c;
        hpgVar.f28776I = (kmd) hpgVar.f28814g.m5896e().mo16809c();
        hpgVar.f28793Z = ((Integer) hpgVar.f28776I.mo14561n(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        if (hpgVar.f28811d.mo6184l(dib.f11273ag)) {
            hpgVar.f28783P = new geg(hpgVar.f28823p, hpgVar.f28824q, hpgVar.f28776I, kan.m13873j(hpgVar.f28778K.m13661b()), hpgVar.f28811d, hpgVar.f28815h);
        } else {
            hpgVar.f28783P = new geg(hpgVar.f28823p, hpgVar.f28824q, hpgVar.f28776I, hpgVar.f28811d, hpgVar.f28815h);
        }
        kbc kbcVarM10575b = hpgVar.m10575b(hpgVar.f28778K);
        geg gegVar = hpgVar.f28783P;
        hpgVar.f28829v.mo13961e("Cheetah-FrameServerStart");
        int i = 7;
        if (((Boolean) hpgVar.f28768A.mo3831be()).booleanValue()) {
            kgh kghVarM14208a = kgi.m14208a();
            kghVarM14208a.m14206k(kgj.f35913a);
            kghVarM14208a.m14197b(hpgVar.f28775H);
            kghVarM14208a.m14204i(kbcVarM10575b);
            kghVarM14208a.m14203h(34);
            kghVarM14208a.m14198c(7);
            kghVarM14208a.m14207l(256L);
            kgiVarM14212b = kghVarM14208a.m14196a();
        } else {
            kgiVarM14212b = kgq.m14212b(hpgVar.f28775H, kbcVarM10575b);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_CAPTURE_INTENT, 3));
        hashSet.add(kgq.m14215e(CaptureRequest.CONTROL_MODE, 2));
        if (hpgVar.f28806am.m6241p()) {
            hashSet.add(jpd.m13436q(1));
            hashSet.add(kgq.m14215e(CaptureRequest.STATISTICS_OIS_DATA_MODE, 1));
        } else {
            hashSet.add(jpd.m13436q(0));
        }
        if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
            hashSet.add(jpd.m13437r(hpgVar.f28806am.m6240o() ? 1 : 0));
            mrm mrmVarM16829i = ivw.f32420f != null ? mrm.m16829i(kgq.m14215e(ivw.f32420f, true)) : mqu.f41450a;
            if (mrmVarM16829i.mo16813g()) {
                hashSet.add((kfy) mrmVarM16829i.mo16809c());
            }
        } else {
            hashSet.add(jpd.m13437r(0));
            mrm mrmVarM16829i2 = ivs.f32330j != null ? mrm.m16829i(kgq.m14215e(ivs.f32330j, 1)) : mqu.f41450a;
            if (mrmVarM16829i2.mo16813g()) {
                hashSet.add((kfy) mrmVarM16829i2.mo16809c());
            }
        }
        hashSet.addAll(jpd.m13438s(((gef) gegVar.mo3831be()).f24363a, ((gef) gegVar.mo3831be()).f24365c));
        hashSet.addAll(gls.m9441c(ikw.TIME_LAPSE, hpgVar.f28776I));
        if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
            kgh kghVarM14208a2 = kgi.m14208a();
            kghVarM14208a2.m14204i(hpgVar.f28778K.m13661b());
            kghVarM14208a2.m14197b(hpgVar.f28775H);
            kghVarM14208a2.m14203h(34);
            kghVarM14208a2.m14198c(20);
            kghVarM14208a2.m14206k(kgj.f35913a);
            kghVarM14208a2.m14207l(65536L);
            kghVarM14208a2.m14200e(true);
            kgiVarM14196a = kghVarM14208a2.m14196a();
            kfm kfmVarM13435p = jpd.m13435p(hpgVar.f28776I, hpgVar.f28777J, hashSet);
            kfmVarM13435p.m14145f(hpgVar.f28774G);
            kfmVarM13435p.m14143d(kgiVarM14196a);
            kfmVarM13435p.m14143d(kgiVarM14212b);
            kfmVarM13435p.m14150k(hpgVar.f28802ai);
            kfnVarM14140a = kfmVarM13435p.m14140a();
        } else {
            kgh kghVarM14208a3 = kgi.m14208a();
            kghVarM14208a3.m14204i(hpgVar.f28778K.m13661b());
            kghVarM14208a3.m14197b(hpgVar.f28775H);
            kghVarM14208a3.m14203h(35);
            kghVarM14208a3.m14198c(15);
            kghVarM14208a3.m14206k(kgj.f35913a);
            kghVarM14208a3.m14200e(true);
            kgiVarM14196a = kghVarM14208a3.m14196a();
            Rect rectMo14555h = hpgVar.f28776I.mo14555h();
            kgh kghVarM14208a4 = kgi.m14208a();
            kghVarM14208a4.m14204i(new kbc(rectMo14555h.width(), rectMo14555h.height()));
            kghVarM14208a4.m14197b(hpgVar.f28775H);
            kghVarM14208a4.m14203h(35);
            kghVarM14208a4.m14198c(1);
            kghVarM14208a4.m14206k(kgj.f35913a);
            kgi kgiVarM14196a2 = kghVarM14208a4.m14196a();
            kfm kfmVarM13435p2 = jpd.m13435p(hpgVar.f28776I, hpgVar.f28777J, hashSet);
            kfmVarM13435p2.m14145f(hpgVar.f28774G);
            kfmVarM13435p2.m14143d(kgiVarM14196a);
            kfmVarM13435p2.m14143d(kgiVarM14212b);
            kfmVarM13435p2.m14143d(kgiVarM14196a2);
            kfmVarM13435p2.m14150k(hpgVar.f28802ai);
            kfnVarM14140a = kfmVarM13435p2.m14140a();
        }
        kfk kfkVarMo14178a = hpgVar.f28796ac.mo14178a(kfnVarM14140a);
        jvb jvbVar = hpgVar.f28782O;
        jvbVar.getClass();
        jvbVar.m13537d(kfkVarMo14178a);
        hpgVar.f28795ab = kfkVarMo14178a;
        kfkVarMo14178a.mo14123j(hashSet);
        kgg kggVarMo14137b = kfkVarMo14178a.mo14116c().mo14137b(kgiVarM14212b);
        hpgVar.f28785R = kggVarMo14137b;
        kgg kggVarMo14137b2 = kfkVarMo14178a.mo14116c().mo14137b(kgiVarM14196a);
        synchronized (hpgVar.f28820m) {
            hpgVar.f28789V = kggVarMo14137b2;
        }
        hpgVar.f28797ad = kfkVarMo14178a.mo14132s(kggVarMo14137b);
        hpgVar.f28798ae = kfkVarMo14178a.mo14132s(kggVarMo14137b2);
        jvb jvbVar2 = hpgVar.f28782O;
        jvbVar2.getClass();
        jvbVar2.m13537d(kfkVarMo14178a);
        hpgVar.f28829v.mo13962f();
        kfk kfkVar = hpgVar.f28795ab;
        if (kfkVar != null) {
            kho khoVar = hpgVar.f28797ad;
            khoVar.getClass();
            hpgVar.f28781N = kfkVar.mo14131r(khoVar, 1);
            jvb jvbVar3 = hpgVar.f28782O;
            jvbVar3.getClass();
            kfc kfcVar = hpgVar.f28781N;
            kfcVar.getClass();
            jvbVar3.m13537d(kfcVar);
            hpgVar.f28794aa = new dtb(hpgVar, i);
            kfc kfcVar2 = hpgVar.f28781N;
            lku.m15662p(kfcVar2);
            kfb kfbVar = hpgVar.f28794aa;
            kfbVar.getClass();
            kfcVar2.mo9411k(kfbVar);
        }
        if (!hpgVar.f28811d.mo6184l(diy.f11747d)) {
            hpgVar.m10577d();
        }
        kfk kfkVar2 = hpgVar.f28795ab;
        if (kfkVar2 != null) {
            if (hpgVar.f28811d.mo6184l(dib.f11273ag)) {
                boolean z = hpgVar.f28809b.f36761d;
                jvb jvbVar4 = hpgVar.f28782O;
                jvbVar4.getClass();
                jvbVar4.m13537d(hpgVar.f28824q.mo3830a(new gmb(hpgVar, kfkVar2, 11), hpgVar.f28819l));
            } else {
                jvb jvbVar5 = hpgVar.f28782O;
                jvbVar5.getClass();
                jvbVar5.m13537d(hpgVar.f28783P.mo3830a(new hmv(kfkVar2, 9), not.INSTANCE));
            }
            if (hpgVar.f28811d.mo6184l(dib.f11351ce)) {
                hpgVar.f28811d.mo6177e();
            }
            if (ivx.f32441d != null) {
                kfk kfkVar3 = hpgVar.f28795ab;
                kfkVar3.getClass();
                kfkVar3.mo14121h(kgq.m14215e(ivx.f32441d, hni.f28480b));
            }
        }
        hpgVar.f28814g.m5898g(hpgVar.f28780M);
        iuj iujVar = hpgVar.f28830w;
        int i2 = hpgVar.f28790W.f29162h;
        if (i2 != 30) {
            throw new IllegalArgumentException("unsupported capture frame rate =" + i2 + HEePJw.jTtJgLeC + i2);
        }
        iujVar.mo11734O(mrm.m16829i(jxn.FPS_30), hpgVar.f28778K.m13663d());
        hpgVar.f28830w.mo11773x();
        hot hotVar = hpgVar.f28827t;
        kmd kmdVar = hpgVar.f28776I;
        kfk kfkVar4 = hpgVar.f28795ab;
        kfkVar4.getClass();
        jvb jvbVar6 = hpgVar.f28782O;
        geg gegVar2 = hpgVar.f28783P;
        hotVar.f28654a.set(false);
        hotVar.f28655b.set(false);
        hotVar.f28656c.set(false);
        hotVar.f28667n = kmdVar;
        hotVar.f28668o = kfkVar4;
        hotVar.f28670q = gegVar2;
        hotVar.f28669p = jvbVar6;
        hotVar.m10551b(true, true);
        kew kewVarMo14115b = kfkVar4.mo14115b();
        ((kgo) kewVarMo14115b).f35935f = (Integer) hotVar.f28665l.f23623a.mo3831be();
        kfkVar4.mo14127n(kewVarMo14115b.mo14090a());
        jvbVar6.m13537d(hotVar.f28675v.f12397c.mo3830a(new hmv(kfkVar4, i), not.INSTANCE));
        if (hotVar.f28661h.mo16813g()) {
            jvbVar6.m13537d(((gmh) hotVar.f28661h.mo16809c()).mo9504b().mo3830a(new hmv(kfkVar4, 8), not.INSTANCE));
        }
        jxp jxpVarM13439t = jpd.m13439t(this.f28922g, this.f28929n, this.f28901T, this.f28900S);
        kan kanVarM13873j = kan.m13873j(jxpVarM13439t.m13661b());
        this.f28906Y.mo3415bf(jxpVarM13439t);
        ihx ihxVarM11369a = ihx.m11369a(this.f28892K, this.f28883B.m10575b(jxpVarM13439t), kanVarM13873j);
        if (((Boolean) this.f28905X.mo3831be()).booleanValue()) {
            this.f28894M = this.f28909ab.mo16808b(hnk.f28490c);
        } else {
            this.f28894M = mqu.f41450a;
        }
        mrm mrmVarM5896e = this.f28922g.m5896e();
        kxk.m14975U(mrmVarM5896e.mo16813g() ? this.f28908aa.m11367f(ihxVarM11369a, this.f28894M, Integer.valueOf(((fvu) mrmVarM5896e.mo16809c()).mo14553f())) : this.f28908aa.m11367f(ihxVarM11369a, this.f28894M, null), new cou(this, kccVarMo13957a, 7), not.INSTANCE);
    }

    /* JADX INFO: renamed from: d */
    public final void m10586d() {
        if (this.f28929n.mo6184l(diy.f11750g)) {
            ScheduledFuture scheduledFuture = this.f28911ad;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f28911ad = null;
            }
            this.f28911ad = this.f28937v.schedule(new hpi(this, 3), true != ((hor) this.f28925j.f34942d).equals(hor.STATE_RECORDING) ? 2L : 15L, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10587e() {
        if (!((hor) this.f28925j.f34942d).equals(hor.STATE_IDLE)) {
            ((nbe) ((nbe) f28881a.m17252c()).mo17276G((char) 3863)).mo17290o("Recording state is not IDLE. Ignore start recording");
            return;
        }
        if (this.f28920e.get()) {
            ((nbe) ((nbe) f28881a.m17251b()).mo17276G((char) 3862)).mo17290o("Device status is not allowed to start recording");
            return;
        }
        this.f28925j.mo3415bf(hor.STATE_PRE_RECORDING);
        this.f28891J.m5467c();
        this.f28884C.mo10546cc();
        jvd jvdVar = this.f28931p;
        iey ieyVar = this.f28938w;
        ieyVar.getClass();
        jvdVar.m13541c(new hpi(ieyVar, 2));
        this.f28923h.mo10316b(C0100R.raw.video_start);
        this.f28938w.mo11162e();
        this.f28916ai.m13116z();
        final hpg hpgVar = this.f28883B;
        if (!hpgVar.f28784Q.mo16813g()) {
            jzn jznVar = hpgVar.f28805al;
            hpgVar.f28784Q = mrm.m16829i(MediaCodec.createPersistentInputSurface());
        }
        ctp ctpVar = hpgVar.f28787T;
        if (ctpVar != null) {
            ctpVar.close();
            hpgVar.f28787T = null;
        }
        hpgVar.f28787T = hpgVar.f28807an.m5633j(krd.MPEG4);
        if (hpgVar.f28828u.m10568m()) {
            hpgVar.f28788U = hpgVar.f28807an.m5633j(krd.MPEG4);
        }
        final kay kayVarMo9215c = hpgVar.f28821n.mo9215c();
        jyd jydVarM13700a = jyd.m13700a(hpgVar.f28778K);
        jydVarM13700a.getClass();
        jzn jznVar2 = hpgVar.f28803aj;
        jyg jygVarM13817e = jzn.m13817e(hpgVar.f28775H, jydVarM13700a);
        final jyk jykVar = new jyk(hpgVar.f28778K);
        jykVar.f35185j = jygVarM13817e;
        jykVar.f35178c = hpgVar.f28806am.m6239n();
        final ctp ctpVar2 = hpgVar.f28787T;
        ctpVar2.getClass();
        kxk.m14970P(new nol() { // from class: hpb
            @Override // p000.nol
            /* JADX INFO: renamed from: a */
            public final nps mo3988a() {
                mrm mrmVarMo13699a;
                hpg hpgVar2 = hpgVar;
                jyk jykVar2 = jykVar;
                ctp ctpVar3 = ctpVar2;
                kay kayVar = kayVarMo9215c;
                jxp jxpVar = hpgVar2.f28778K;
                jxn jxnVar = hpgVar2.f28777J;
                FileDescriptor fileDescriptorMo5502f = ctpVar3.mo5502f();
                int iM10574a = hpgVar2.m10574a(kayVar, hpgVar2.f28786S, hpgVar2.f28780M, hpgVar2.f28811d);
                Object cvjVar = hpgVar2.f28811d.mo6184l(diy.f11749f) ? new cvj(hpgVar2.f28811d) : new jyl();
                jxh jxhVar = hpgVar2.f28813f;
                jxhVar.f34989a = jxpVar;
                jxhVar.f34990b = jxnVar;
                jxhVar.f34991c = hpgVar2.f28775H;
                jxhVar.f35006r = hpgVar2.f28810c;
                jxhVar.f35003o = fileDescriptorMo5502f;
                jxhVar.f34992d = iM10574a;
                jxhVar.f34999k = mrm.m16829i(true);
                jxhVar.f35010v = true != hpgVar2.f28811d.mo6184l(dhh.f11080af) ? 2 : 1;
                jxhVar.f34998j = mrm.m16829i(cvjVar);
                jxhVar.f35013y = mrm.m16829i(Float.valueOf(hpgVar2.f28828u.m10568m() ? 1.75f / hpgVar2.f28790W.f29162h : 1.0f));
                jxhVar.f35014z = mrm.m16829i(Float.valueOf(hpgVar2.f28828u.m10568m() ? ((Float) hpgVar2.f28811d.mo6180h(diy.f11752i).get()).floatValue() : 1.0f));
                jxhVar.f35000l = mrm.m16829i(jykVar2);
                jxhVar.f35002n = mrm.m16829i(new jxf(hpgVar2, 1));
                if (hpgVar2.f28811d.mo6184l(diy.f11747d)) {
                    hpgVar2.f28813f.m13649a(jym.SURFACE);
                    jxh jxhVar2 = hpgVar2.f28813f;
                    jxhVar2.f34993e = false;
                    jxhVar2.f34997i = mrm.m16829i(hpgVar2.f28828u.f28749s);
                    if (hpgVar2.f28784Q.mo16813g()) {
                        hpgVar2.f28813f.f35007s = (Surface) hpgVar2.f28784Q.mo16809c();
                    }
                } else {
                    hpgVar2.f28813f.m13649a(jym.YUV_SEMI_PLANAR);
                    hpgVar2.f28813f.f34993e = true;
                }
                if (hpgVar2.f28818k.mo8117c().mo16813g()) {
                    hpgVar2.f28813f.f34994f = (Location) hpgVar2.f28818k.mo8117c().mo16809c();
                }
                jxh jxhVar3 = hpgVar2.f28813f;
                lku.m15670x(jxhVar3.f35003o != null, "Neither recordFileDescriptor nor recordFile are specified");
                lku.m15670x(jxhVar3.f34989a != null, zuAgeeF.vGWKExYVb);
                jxhVar3.f34991c.getClass();
                jxhVar3.f34990b.getClass();
                jxhVar3.f35006r.getClass();
                mrm mrmVar = jxhVar3.f35009u;
                jxu jxuVar = new jxu(new khb(), null);
                jyi jyiVar = new jyi(0);
                jyi jyiVar2 = new jyi(1);
                if (jxhVar3.f35000l.mo16813g()) {
                    jye jyeVar = new jye((jyk) jxhVar3.f35000l.mo16809c());
                    jxp jxpVar2 = ((jyk) jxhVar3.f35000l.mo16809c()).f35177b;
                    kmg kmgVar = jxhVar3.f34991c;
                    boolean z = ((jyk) jxhVar3.f35000l.mo16809c()).f35178c;
                    mrm mrmVar2 = jxhVar3.f35014z;
                    mrm mrmVar3 = ((jyk) jxhVar3.f35000l.mo16809c()).f35176a;
                    mrmVarMo13699a = jyeVar.mo13699a(jxpVar2, kmgVar, z, mrmVar2, mrmVar3, false, false);
                } else if (jxhVar3.f34990b.m13657e()) {
                    mrmVarMo13699a = jyiVar2.mo13699a(jxhVar3.f34989a, jxhVar3.f34991c, false, jxhVar3.f35014z, mqu.f41450a, false, false);
                } else {
                    if (!jxhVar3.f34990b.m13658f()) {
                        throw new IllegalArgumentException("Unknown camcorder capture rate");
                    }
                    mrmVarMo13699a = jyiVar.mo13699a(jxhVar3.f34989a, jxhVar3.f34991c, false, jxhVar3.f35014z, mqu.f41450a, false, false);
                }
                lku.m15616K(mrmVarMo13699a.mo16813g(), "Fail to camcorder profile for resolution %s", jxhVar3.f34989a);
                jxv jxvVarMo13667d = jxhVar3.f35013y.mo16813g() ? jxuVar.mo13667d((jyg) mrmVarMo13699a.mo16809c(), jxhVar3.f34990b, jxhVar3.f34989a, ((Float) jxhVar3.f35013y.mo16809c()).floatValue()) : jxuVar.mo13666c((jyg) mrmVarMo13699a.mo16809c(), jxhVar3.f34990b, jxhVar3.f34989a);
                if (jxhVar3.f35005q == null) {
                    jxhVar3.f35005q = jzn.m13824l("CamcorderCllbck");
                }
                npu npuVarM15032y = kxk.m15032y(jzn.m13824l("Camcorder"));
                HandlerThread handlerThread = new HandlerThread("Camcorder");
                handlerThread.start();
                Handler handlerM13557e = jvh.m13557e(handlerThread.getLooper());
                boolean zBooleanValue = jxhVar3.f34999k.mo16813g() ? ((Boolean) jxhVar3.f34999k.mo16809c()).booleanValue() : false;
                if (jxhVar3.f35004p == null) {
                    if (jxhVar3.f34990b.m13658f() || zBooleanValue) {
                        kbx kbxVar = new kbx();
                        AudioManager audioManager = jxhVar3.f35006r;
                        jzv jzvVar = new jzv(npuVarM15032y, handlerM13557e, kbxVar);
                        if (jxhVar3.f34998j.mo16813g()) {
                            jzvVar.f35418n = (jyq) jxhVar3.f34998j.mo16809c();
                        }
                        mrm mrmVar4 = jxhVar3.f35008t;
                        jxhVar3.f35004p = jzvVar;
                    } else {
                        jxhVar3.f35004p = new kad(new jzw(new MediaRecorder()), npuVarM15032y, new jxg());
                    }
                }
                jyy jyyVar = jxhVar3.f35004p;
                jyyVar.mo13776r(jxvVarMo13667d);
                jyyVar.mo13773o(jxhVar3.f34992d);
                jyyVar.mo13772n(jxhVar3.f34993e);
                FileDescriptor fileDescriptor = jxhVar3.f35003o;
                if (fileDescriptor != null) {
                    jxhVar3.f35004p.mo13775q(fileDescriptor);
                }
                Location location = jxhVar3.f34994f;
                if (location != null) {
                    jxhVar3.f35004p.mo13766h(location);
                }
                Surface surface = jxhVar3.f35007s;
                if (surface != null) {
                    jxhVar3.f35004p.mo13765g(surface);
                }
                mrm mrmVar5 = jxhVar3.f34996h;
                mrm mrmVar6 = jxhVar3.f34995g;
                mrm mrmVar7 = jxhVar3.f34988A;
                if (jxhVar3.f34997i.mo16813g()) {
                    jxhVar3.f35004p.mo13771m((MediaCodec.Callback) jxhVar3.f34997i.mo16809c());
                }
                if (jxhVar3.f35001m.mo16813g()) {
                    jxhVar3.f35004p.mo13763e((jym) jxhVar3.f35001m.mo16809c());
                }
                jxhVar3.f35004p.mo13764f(jxhVar3.f35010v);
                mrm mrmVar8 = jxhVar3.f35011w;
                mrm mrmVar9 = jxhVar3.f35012x;
                try {
                    jyx jyxVarMo13759a = jxhVar3.f35004p.mo13759a();
                    jyxVarMo13759a.getClass();
                    hpgVar2.f28799af = new jxj(jyxVarMo13759a, jxhVar3.f35005q, jxhVar3.f35002n);
                    hpgVar2.m10576c();
                    hpgVar2.f28771D = hpgVar2.f28833z.scheduleAtFixedRate(new hmm(hpgVar2, 18), dlt.f11991a.getSeconds(), dlt.f11991a.getSeconds(), TimeUnit.SECONDS);
                    hqq hqqVarM10635a = hqr.m10635a();
                    hqqVarM10635a.m10634o(hpgVar2.f28777J);
                    hqqVarM10635a.m10621b(hpgVar2.f28778K);
                    hqqVarM10635a.m10628i(ctpVar3);
                    hqqVarM10635a.m10633n(mqu.f41450a);
                    hqqVarM10635a.m10626g(hpgVar2.m10574a(kayVar, hpgVar2.f28786S, hpgVar2.f28780M, hpgVar2.f28811d));
                    hqqVarM10635a.m10625f(hpgVar2.f28799af.f35020a.mo13745d());
                    hqqVarM10635a.m10631l(hpgVar2.f28790W);
                    hqqVarM10635a.m10624e(hpgVar2.f28831x);
                    hqqVarM10635a.m10632m("");
                    hqqVarM10635a.m10630k(hpgVar2.f28772E);
                    synchronized (hpgVar2.f28820m) {
                        if (!hpgVar2.f28769B.isEmpty()) {
                            ((nbe) ((nbe) hpg.f28767a.m17252c()).mo17276G(3829)).mo17290o("prepareCamcorder(): Pending video file exists.");
                            hpgVar2.f28769B.clear();
                        }
                        hpgVar2.f28769B.add(hqqVarM10635a);
                    }
                    hpgVar2.f28791X = new hqm(hpgVar2.f28790W, dhk.m6163e(ctpVar3) == gyx.MARS_STORE);
                    hpgVar2.f28799af.f35022c.add(hpgVar2.f28773F);
                    return kxk.m14965K(hpgVar2.f28799af);
                } catch (IOException e) {
                    throw new IllegalArgumentException("Fail to create video recorder", e);
                }
            }
        }, hpgVar.f28816i).mo2282d(new hmm(hpgVar, 19), hpgVar.f28819l);
        hpu hpuVar = this.f28885D;
        hpuVar.f29002h.m10464b(new hpr(hpuVar, 0));
        hpu hpuVar2 = this.f28885D;
        hpuVar2.f28997c.mo3705s().registerReceiver(hpuVar2.f28996b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* JADX INFO: renamed from: f */
    public final void m10588f(boolean z) {
        if (this.f28929n.mo6184l(diy.f11750g)) {
            ScheduledFuture scheduledFuture = this.f28911ad;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.f28911ad = null;
            }
            this.f28895N = 0.0d;
            this.f28896O = 0.0d;
            synchronized (this.f28917b) {
                this.f28919d = 0L;
                Arrays.fill(this.f28918c, 0, 3, 0.0d);
            }
            if (z) {
                this.f28882A.m10553d(false);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m10589g(boolean z) {
        nps npsVarM14965K;
        nps npsVarM17553i;
        if (!hor.m10549a((hor) this.f28925j.f34942d)) {
            Object obj = this.f28925j.f34942d;
            return;
        }
        this.f28925j.mo3415bf(hor.STATE_PROCESSING);
        hpg hpgVar = this.f28883B;
        hpgVar.f28771D.cancel(false);
        if (z) {
            if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
                hpgVar.m10579f();
            }
            nqf nqfVarM17621g = nqf.m17621g();
            nqfVarM17621g.mo8566a(new IllegalStateException("Codec error"));
            npsVarM17553i = nqfVarM17621g;
        } else if (hpgVar.f28811d.mo6184l(diy.f11747d)) {
            hpa hpaVar = hpgVar.f28828u;
            hpaVar.f28733c.set(false);
            hpaVar.f28734d.set(false);
            hpaVar.f28732b.set(true);
            hpaVar.m10566k();
            synchronized (hpaVar.f28750t) {
                if (hpaVar.f28744n.get() > 1) {
                    npsVarM14965K = kxk.m14965K(hpaVar.f28728B);
                } else {
                    hpaVar.f28755y = nqf.m17621g();
                    npsVarM14965K = hpaVar.f28755y;
                }
            }
            npsVarM17553i = nod.m17553i(npsVarM14965K, new hgv(hpgVar, 4), not.INSTANCE);
        } else {
            hoj hojVar = hpgVar.f28817j;
            Timer timer = hojVar.f28585I;
            if (timer != null) {
                timer.cancel();
            }
            hojVar.f28592b.set(true);
            hojVar.f28583G = nqf.m17621g();
            npsVarM17553i = nod.m17553i(hojVar.f28583G, new hgv(hpgVar, 3), not.INSTANCE);
        }
        this.f28893L = npsVarM17553i;
        this.f28885D.f29002h.m10463a();
        hpu hpuVar = this.f28885D;
        hpuVar.f28997c.mo3705s().unregisterReceiver(hpuVar.f28996b);
        this.f28938w.mo11163f();
        this.f28916ai.m13070A();
        m10588f(true);
        this.f28931p.m13541c(new hpi(this, 10));
        this.f28923h.mo10316b(C0100R.raw.video_stop);
    }

    /* JADX INFO: renamed from: h */
    final boolean m10590h() {
        if (!hor.m10549a((hor) this.f28925j.f34942d)) {
            return false;
        }
        ((nbe) ((nbe) f28881a.m17252c()).mo17276G((char) 3871)).mo17290o("stopRecordingOnCriticalState()");
        m10589g(false);
        return true;
    }

    /* JADX INFO: renamed from: i */
    final void m10591i(boolean z) {
        this.f28925j.mo3415bf(hor.STATE_PREPARING_ON_RESUME);
        this.f28883B.m10578e();
        this.f28884C.mo5712g();
        if (!this.f28929n.mo6184l(diy.f11747d)) {
            this.f28928m.m10539e();
        }
        m10584b(this.f28922g.mo5895d());
        m10585c();
        this.f28883B.m10580g();
        iuj iujVar = this.f28910ac;
        if (((ite) iujVar).f32068S) {
            iujVar.mo11765p();
        }
        if (z && this.f28929n.mo6184l(dib.f11285as)) {
            this.f28910ac.mo11721B(false);
        }
    }
}
