package com.google.android.apps.camera.legacy.app.app;

import android.app.NotificationManager;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.os.Trace;
import androidx.wear.ambient.AmbientMode;
import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;
import com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent;
import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.axo;
import p000.axp;
import p000.ayl;
import p000.bkn;
import p000.bko;
import p000.cia;
import p000.cie;
import p000.cig;
import p000.cih;
import p000.cii;
import p000.cje;
import p000.ckc;
import p000.cwd;
import p000.dfm;
import p000.dfn;
import p000.dhv;
import p000.dhx;
import p000.dib;
import p000.dja;
import p000.djj;
import p000.djm;
import p000.dki;
import p000.dkk;
import p000.dlj;
import p000.eht;
import p000.ehu;
import p000.emv;
import p000.emx;
import p000.enl;
import p000.eso;
import p000.esq;
import p000.esz;
import p000.eta;
import p000.etp;
import p000.etq;
import p000.fbt;
import p000.ffp;
import p000.fxo;
import p000.ggp;
import p000.ggr;
import p000.goy;
import p000.gtd;
import p000.hjk;
import p000.hkq;
import p000.hli;
import p000.hob;
import p000.inr;
import p000.jeu;
import p000.jfs;
import p000.jib;
import p000.jkv;
import p000.jkw;
import p000.jum;
import p000.jvd;
import p000.kbh;
import p000.kbi;
import p000.kbl;
import p000.kbm;
import p000.kbn;
import p000.kbo;
import p000.kbq;
import p000.kxk;
import p000.kxw;
import p000.lgr;
import p000.lij;
import p000.lku;
import p000.lmi;
import p000.lmk;
import p000.lpv;
import p000.ltx;
import p000.lty;
import p000.lua;
import p000.lud;
import p000.lue;
import p000.lug;
import p000.luh;
import p000.lui;
import p000.luj;
import p000.mrm;
import p000.mws;
import p000.mzr;
import p000.nax;
import p000.nba;
import p000.ndo;
import p000.ndq;
import p000.ndx;
import p000.nps;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class CameraApp extends fbt implements HasCameraContentProviderComponent, etq, hob, emv, axo, cih, eht, ckc {

    /* JADX INFO: renamed from: k */
    private static final AtomicBoolean f6777k;

    /* JADX INFO: renamed from: a */
    NotificationManager f6778a;

    /* JADX INFO: renamed from: b */
    oju f6779b;

    /* JADX INFO: renamed from: c */
    oju f6780c;

    /* JADX INFO: renamed from: d */
    lgr f6781d;

    /* JADX INFO: renamed from: e */
    ayl f6782e;

    /* JADX INFO: renamed from: f */
    cie f6783f;

    /* JADX INFO: renamed from: g */
    dfn f6784g;

    /* JADX INFO: renamed from: h */
    bko f6785h;

    /* JADX INFO: renamed from: l */
    private volatile ehu f6786l;

    /* JADX INFO: renamed from: m */
    private volatile eso f6787m;

    /* JADX INFO: renamed from: n */
    private final esq f6788n = new esq();

    /* JADX WARN: Multi-variable type inference failed */
    static {
        lmk lmkVar = lmk.f38672a;
        if (lmkVar.f38674c == 0) {
            lmkVar.f38674c = SystemClock.elapsedRealtime();
            lmkVar.f38683l.f38661a = true;
        }
        hli.m10443d(f21199i);
        mws mwsVar = enl.f14762a;
        synchronized (kbi.f35526a) {
            nba it = mwsVar.iterator();
            while (it.hasNext()) {
                Class cls = (Class) it.next();
                String str = (String) kbi.f35528c.put(cls, "gcastartup");
                if (str != null && !str.equals("gcastartup")) {
                    throw new UnsatisfiedLinkError("Could not register " + String.valueOf(cls) + ". It was previously registered with: " + str);
                }
                kbh kbhVar = (kbh) kbi.f35527b.get("gcastartup");
                if (kbhVar == null) {
                    kbi.f35527b.put("gcastartup", new kbh("gcastartup"));
                } else if (kbhVar.m13933a()) {
                    throw new UnsatisfiedLinkError(String.format(null, xRFdVyfdeve.uEbDPLslP, cls.getSimpleName(), "gcastartup"));
                }
            }
        }
        f6777k = new AtomicBoolean(false);
    }

    @Override // p000.axo
    /* JADX INFO: renamed from: a */
    public final axp mo2087a() {
        nax naxVar = new nax(null, null, null, null);
        naxVar.f41919a = this.f6782e;
        return new axp(naxVar, null, null, null, null);
    }

    @Override // p000.cih
    /* JADX INFO: renamed from: b */
    public final dfn mo3799b() {
        this.f6788n.m7789b(this);
        return mo4194f().mo3799b();
    }

    @Override // p000.ckc
    /* JADX INFO: renamed from: c */
    public final nps mo3834c() {
        return this.f6788n.m7788a();
    }

    @Override // com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent
    public final djj cameraContentProviderComponent(djm djmVar) {
        lku.m15661o(this.f6787m, "initAppComponent needs to be called on main thread¬", new Object[0]);
        eso esoVar = this.f6787m;
        djmVar.getClass();
        return new eta(((esz) esoVar).f16376a, djmVar);
    }

    @Override // p000.eht
    /* JADX INFO: renamed from: d */
    public final ehu mo4192d() {
        return this.f6786l;
    }

    @Override // p000.emv
    /* JADX INFO: renamed from: e */
    public final emx mo4193e(Class cls) {
        return (emx) cls.cast(mo4194f());
    }

    /* JADX WARN: Type inference failed for: r0v22, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r2v46, types: [dhv, java.lang.Object] */
    @Override // p000.etq
    /* JADX INFO: renamed from: f */
    public final eso mo4194f() {
        if (this.f6787m == null) {
            synchronized (this) {
                if (this.f6787m == null) {
                    Trace.beginSection("GCA_App#component");
                    Trace.beginSection("GCA_App#buildComponent");
                    oju ojuVar = etp.f19860a;
                    this.f6787m = new esz(new dlj(), new goy(), new gtd(this, getApplicationContext()), new bkn(this.f21200j), new ffp(null), new dfm(), new dlj(), new cje(), new jeu(), new fxo(), new jfs((short[]) null), new inr(), new kxk((byte[]) null), new cwd((byte[]) null, (byte[]) null, (char[]) null), null, null, null, null, null, null);
                    Trace.endSection();
                    Trace.beginSection("GCA_App#initialize");
                    eso esoVar = this.f6787m;
                    Trace.beginSection("GCA_App#inject");
                    dhv dhvVar = (dhv) ((esz) esoVar).f16641f.get();
                    kbn kbnVarM6309b = dki.m6309b(kbm.m13949b(mrm.m16829i((kbo) ((esz) esoVar).f17065n.get())));
                    this.f6785h = new bko(dhvVar, kbnVarM6309b);
                    this.f6778a = ((esz) esoVar).m7816k();
                    this.f6784g = new dfn((dhv) ((esz) esoVar).f16641f.get(), ((esz) esoVar).f16362M, ((esz) esoVar).f16364O, ((esz) esoVar).f16365P, ((esz) esoVar).f16366Q, ((esz) esoVar).f16367R);
                    this.f6779b = ((esz) esoVar).f16368S;
                    this.f6780c = ((esz) esoVar).f17277r;
                    this.f6781d = (lgr) ((esz) esoVar).f16370U.get();
                    this.f6782e = (ayl) ((esz) esoVar).f16371V.get();
                    this.f6783f = (cie) ((esz) esoVar).f16363N.get();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#PrimesMemoryMonitor");
                    this.f6781d.f38229a.mo15323b();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#strictMode");
                    ?? r0 = this.f6785h.f3652a;
                    dhx dhxVar = dib.f11240a;
                    r0.mo6178f();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#startAsync");
                    dfn dfnVar = this.f6784g;
                    Trace.beginSection("appStartup.start");
                    mws mwsVarM17100o = mws.m17100o(dfnVar.f10792e, dfnVar.f10788a, dfnVar.f10791d, dfnVar.f10790c);
                    int i = ((mzr) mwsVarM17100o).f41859c;
                    for (int i2 = 0; i2 < i; i2++) {
                        ((hjk) ((oju) mwsVarM17100o.get(i2)).get()).run();
                    }
                    dfnVar.f10793f.mo6175c();
                    ((ggr) dfnVar.f10789b.get()).run();
                    Trace.endSection();
                    Trace.endSection();
                    Trace.beginSection(pIeXJQLZLfgIN.GSIKSchZXtpOUY);
                    this.f6778a.cancelAll();
                    Trace.endSection();
                    Trace.beginSection("GCA_App#setDefaultUncaughtExceptionHandler");
                    this.f6783f.m3798a(new cig(this.f6780c, this.f6779b));
                    Thread.setDefaultUncaughtExceptionHandler(new cia(this.f6783f, Thread.getDefaultUncaughtExceptionHandler()));
                    this.f6781d.f38229a.mo15322a();
                    kbl.f35534b.addHandler(kbq.f35538a);
                    kbl.f35533a.addHandler(kbq.f35538a);
                    kbl.f35535c.addHandler(kbq.f35538a);
                    kbl.f35536d.addHandler(kbq.f35538a);
                    Trace.endSection();
                    Trace.endSection();
                    Trace.endSection();
                }
            }
        }
        return this.f6787m;
    }

    @Override // p000.hob
    /* JADX INFO: renamed from: g */
    public final gtd mo4195g(jib jibVar) {
        return mo4194f().mo4195g(jibVar);
    }

    @Override // com.google.android.apps.camera.contentprovider.HasCameraContentProviderComponent
    public final void initAppComponent() {
        jvd.m13538a();
        mo4194f();
    }

    @Override // p000.fbt, android.app.Application
    public final void onCreate() {
        boolean z;
        Trace.beginSection("GCA_App#onCreate");
        synchronized (jkv.f34272a) {
            z = jkv.f34273b;
        }
        if (z) {
            return;
        }
        synchronized (jkw.f34274a) {
            jkw.f34275b = true;
        }
        hli hliVarM10444e = hli.m10444e();
        hliVarM10444e.m10437h(hkq.APP_ONCREATE_START);
        if (!dja.RELEASE.m6199a(dja.DOGFOOD)) {
            if (!f6777k.getAndSet(true)) {
                Trace.beginSection("#floggerConfig");
                nax naxVarM17232e = nax.m17232e();
                naxVarM17232e.f41919a = new ndo(new ndo("CAM_", new ndo().f42056b).f42055a, false);
                ndq.m17376a(naxVarM17232e);
                Trace.endSection();
            }
            Trace.beginSection("HierarchySnapshot#init");
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            hashSet.add(new ltx());
            hashSet.add(new lui(1));
            hashSet.add(new lue());
            hashSet.add(new lug());
            hashSet.add(new luh());
            hashSet.add(new lui(0));
            hashSet.add(new luj());
            if (hashSet.isEmpty()) {
                throw new IllegalStateException("No AttributeGenerators were registered. Try calling withCommonAttributeGenerators().");
            }
            lud ludVar = new lud();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ludVar.f39213b.add(new AmbientMode.AmbientController((lty) it.next()));
            }
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                ludVar.f39213b.add((AmbientMode.AmbientController) it2.next());
            }
            lua luaVar = new lua(ludVar);
            IntentFilter intentFilter = new IntentFilter("com.google.android.libraries.snapshot.action.CAPTURE_SNAPSHOT");
            intentFilter.setPriority(0);
            registerReceiver(luaVar, intentFilter, 2);
            Trace.endSection();
        } else if (!f6777k.getAndSet(true)) {
            Trace.beginSection("#floggerConfig");
            nax naxVarM17232e2 = nax.m17232e();
            ndx ndxVar = new ndx();
            ndx ndxVar2 = new ndx("CAM_", ndxVar.f42069b, ndxVar.f42070c, ndxVar.f42071d, ndxVar.f42072e, ndxVar.f42073f);
            ndx ndxVar3 = new ndx(ndxVar2.f42068a, ndxVar2.f42069b, ndxVar2.f42070c, true, ndxVar2.f42072e, ndxVar2.f42073f);
            naxVarM17232e2.f41919a = new ndx(ndxVar3.f42068a, false, ndxVar3.f42070c, ndxVar3.f42071d, ndxVar3.f42072e, ndxVar3.f42073f);
            ndq.m17376a(naxVarM17232e2);
            Trace.endSection();
        }
        ContentResolver contentResolver = getContentResolver();
        contentResolver.getClass();
        dkk.f11894a = jum.m13512a(contentResolver, "camera:logging_override_level", 0);
        Trace.beginSection("PhenotypeHelper#init");
        int i = ggp.f24693a;
        lpv.m15843h(this);
        Trace.endSection();
        registerActivityLifecycleCallbacks(new cii(new cih() { // from class: esn
            @Override // p000.cih
            /* JADX INFO: renamed from: b */
            public final dfn mo3799b() {
                return this.f15500a.mo3799b();
            }
        }));
        super.onCreate();
        if (!getPackageManager().hasSystemFeature("com.google.android.feature.PIXEL_2019_EXPERIENCE")) {
            throw new IllegalStateException("Cannot start the Google Camera on an unsupported device");
        }
        lmk lmkVar = lmk.f38672a;
        if (lij.m15455y() && lmkVar.f38674c > 0 && lmkVar.f38675d == 0) {
            lmkVar.f38675d = SystemClock.elapsedRealtime();
            lmkVar.f38683l.f38662b = true;
            lij.m15454x(new kxw(lmkVar, 19));
            registerActivityLifecycleCallbacks(new lmi(lmkVar, this));
        }
        this.f6786l = new ehu(this);
        hliVarM10444e.m10437h(hkq.APP_ONCREATE_END);
        Trace.endSection();
    }
}
