package com.google.android.apps.camera.legacy.app.activity.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import p000.ActivityC0157ei;
import p000.C1058va;
import p000.cdp;
import p000.cds;
import p000.chx;
import p000.cwd;
import p000.dgt;
import p000.dhv;
import p000.dhx;
import p000.dib;
import p000.dnh;
import p000.emb;
import p000.emw;
import p000.emx;
import p000.emy;
import p000.emz;
import p000.ero;
import p000.erv;
import p000.erw;
import p000.erx;
import p000.erz;
import p000.esr;
import p000.esw;
import p000.esz;
import p000.fav;
import p000.fcp;
import p000.fdh;
import p000.grz;
import p000.gtd;
import p000.hai;
import p000.hki;
import p000.hkk;
import p000.hkn;
import p000.hkp;
import p000.hli;
import p000.hqv;
import p000.iad;
import p000.iid;
import p000.iif;
import p000.ikw;
import p000.iny;
import p000.jeu;
import p000.jfs;
import p000.jvd;
import p000.kba;
import p000.kbz;
import p000.kdp;
import p000.khy;
import p000.ksa;
import p000.lij;
import p000.lku;
import p000.lmk;
import p000.mrm;
import p000.msi;
import p000.nbe;
import p000.nbh;
import p000.oju;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraActivity extends ero implements emw, cdp {

    /* JADX INFO: renamed from: z */
    private static final nbh f6768z;

    /* JADX INFO: renamed from: A */
    private erv f6769A;

    /* JADX INFO: renamed from: B */
    private erx f6770B;

    /* JADX INFO: renamed from: C */
    private CameraActivityTiming f6771C;

    /* JADX INFO: renamed from: D */
    private boolean f6772D;

    /* JADX INFO: renamed from: t */
    public dhv f6773t;

    /* JADX INFO: renamed from: u */
    public dnh f6774u;

    /* JADX INFO: renamed from: v */
    public hkn f6775v;

    /* JADX INFO: renamed from: w */
    public grz f6776w;

    static {
        lmk lmkVar = lmk.f38672a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (lij.m15455y() && lmkVar.f38674c > 0 && jElapsedRealtime <= SystemClock.elapsedRealtime() && ((lmkVar.f38684m.f38647b == null || jElapsedRealtime <= lmkVar.f38684m.f38647b.longValue()) && lmkVar.f38676e == 0)) {
            lmkVar.f38676e = jElapsedRealtime;
            lmkVar.f38683l.f38666f = true;
        }
        f6768z = nbh.m17259h("com/google/android/apps/camera/legacy/app/activity/main/CameraActivity");
    }

    @Override // p000.cdp
    /* JADX INFO: renamed from: a */
    public final dhv mo3499a() {
        return this.f6773t;
    }

    @Override // p000.emw
    /* JADX INFO: renamed from: b */
    public final emx mo4190b(Class cls) {
        return (emx) cls.cast(this.f6769A);
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    protected void onCreate(Bundle bundle) {
        CameraActivity cameraActivity = this;
        m7739n().mo13961e("CameraActivity#onCreate");
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        cameraActivity.f6772D = false;
        super.onCreate(bundle);
        esz eszVar = (esz) ((CameraApp) getApplicationContext()).mo4194f();
        ((ero) cameraActivity).f15254q = (kbz) eszVar.f16747h.get();
        cameraActivity.f15256s = (chx) eszVar.f17299z.get();
        cameraActivity.f15255r = fav.m8088b(eszVar.f16770hW);
        cameraActivity.f6775v = (hkn) eszVar.f16352C.get();
        cameraActivity.f6773t = (dhv) eszVar.f16641f.get();
        cameraActivity.f6776w = (grz) eszVar.f16355F.get();
        cameraActivity.f6774u = new dnh((kdp) eszVar.f16358I.get(), gtd.m9735q());
        hkn hknVar = cameraActivity.f6775v;
        hki hkiVar = hknVar.f28179a;
        Instrumentation instrumentation = hknVar.f28182d;
        ksa ksaVar = hknVar.f28180b;
        kbz kbzVar = hknVar.f28181c;
        int i = hkiVar.f28166a;
        hkiVar.f28166a = i + 1;
        hkk hkkVar = new hkk(i, hkiVar.f28167b);
        CameraActivityTiming cameraActivityTiming = new CameraActivityTiming(hkkVar.m10424a() ? hli.m10444e().f28241m : jElapsedRealtimeNanos, ksaVar, hkkVar, kbzVar);
        instrumentation.m4300f(cameraActivityTiming);
        cameraActivity.f6771C = cameraActivityTiming;
        cameraActivityTiming.recordActivityOnCreateStart(jElapsedRealtimeNanos);
        dnh dnhVar = cameraActivity.f6774u;
        String string = toString();
        jvd.m13538a();
        if (dnhVar.f12092d == null) {
            dnhVar.f12092d = dnhVar.f12089a.m14002b("CameraActivity onCreate: ".concat(String.valueOf(string)));
        }
        dnhVar.f12090b.postDelayed(new dgt(dnhVar, 11), 3000L);
        dhv dhvVar = cameraActivity.f6773t;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        CameraActivityTiming cameraActivityTiming2 = cameraActivity.f6771C;
        m7739n().mo13961e("setupDefaultActivity#init");
        C1058va c1058vaM7740o = m7740o();
        gtd gtdVarM7741p = m7741p();
        jfs jfsVar = new jfs(cameraActivityTiming2);
        c1058vaM7740o.getClass();
        gtdVarM7741p.getClass();
        cameraActivity.f6769A = new esr(eszVar.f16376a, c1058vaM7740o, gtdVarM7741p, jfsVar, null, null, null, null, null);
        m7739n().mo13963g("activityInitializer#get");
        erw erwVar = (erw) ((esr) cameraActivity.f6769A).f15567ai.get();
        m7739n().mo13963g("activityInitializer#start");
        erwVar.mo3538bd();
        if (isVoiceInteractionRoot()) {
            Intent intent = new Intent(getIntent());
            esr esrVar = (esr) cameraActivity.f6769A;
            boolean zM7814B = esrVar.f15532a.m7814B();
            boolean zM7831z = esrVar.f15532a.m7831z();
            boolean zM7813A = esrVar.f15532a.m7813A();
            iad iadVar = (iad) esrVar.f15564af.get();
            oju ojuVar = esrVar.f15569ak;
            jfs jfsVarM10644b = hqv.m10644b((dhv) esrVar.f15532a.f16641f.get());
            Object obj = esrVar.f15592bG.f26334a;
            fcp fcpVar = (fcp) esrVar.f15532a.f17277r.get();
            cwd cwdVar = (cwd) esrVar.f15532a.f16680fm.get();
            khy khyVar = (khy) esrVar.f15532a.f16492cJ.get();
            hai haiVar = (hai) esrVar.f15532a.f16353D.get();
            Activity activity = (Activity) obj;
            msi msiVarM15663q = lku.m15663q(new emy(zM7814B, zM7831z, zM7813A, jfsVarM10644b, activity, null, null, null));
            mrm mrmVarM7538c = emz.m7538c(emz.m7537b(intent, activity, msiVarM15663q, khyVar), intent, iadVar, ojuVar, jfsVarM10644b, activity, fcpVar, cwdVar, msiVarM15663q, haiVar, khyVar);
            emz.m7536a(intent, !mrmVarM7538c.mo16813g(), activity, haiVar);
            activity.setIntent(intent);
            if (mrmVarM7538c.mo16813g() && emz.m7539d((ikw) mrmVarM7538c.mo16809c(), iadVar, ojuVar, jfsVarM10644b, activity, fcpVar, cwdVar)) {
                ((nbe) ((nbe) f6768z.m17252c()).mo17276G((char) 1871)).mo17290o("Warning: have Launched outside activity and coming soon finish activity.");
                cameraActivity = this;
                cameraActivity.f6772D = true;
            } else {
                cameraActivity = this;
            }
        }
        m7739n().mo13963g("#cameraUiModule#inflate");
        esr esrVar2 = (esr) cameraActivity.f6769A;
        ActivityC0157ei activityC0157eiM9751r = esrVar2.f15592bG.m9751r();
        gtd gtdVar = esrVar2.f15592bG;
        iny inyVar = new iny((Activity) gtdVar.f26334a, 1);
        Window windowM7512b = emb.m7512b(gtdVar);
        LayoutInflater layoutInflater = activityC0157eiM9751r.getLayoutInflater();
        jvd.m13538a();
        WindowManager.LayoutParams attributes = windowM7512b.getAttributes();
        attributes.rotationAnimation = 3;
        attributes.layoutInDisplayCutoutMode = 1;
        windowM7512b.setAttributes(attributes);
        windowM7512b.requestFeature(8);
        windowM7512b.addFlags(Integer.MIN_VALUE);
        windowM7512b.setBackgroundDrawable(null);
        windowM7512b.getDecorView().setPadding(0, 0, 0, 0);
        windowM7512b.getDecorView().setSystemUiVisibility(1797);
        windowM7512b.setNavigationBarContrastEnforced(false);
        ((Activity) inyVar.f31619a).setContentView(C0100R.layout.activity_main);
        iif iifVar = new iif(layoutInflater, new iid(jfs.m13067p(inyVar), null, null));
        m7739n().mo13963g("activityUiInitializer#get");
        esr esrVar3 = (esr) cameraActivity.f6769A;
        esw eswVar = new esw(esrVar3.f15532a, esrVar3.f15585b, iifVar);
        cameraActivity.f6770B = eswVar;
        erz erzVar = (erz) eswVar.f15802R.get();
        m7739n().mo13963g("#activityUiInitializer#start");
        erzVar.mo3538bd();
        m7739n().mo13962f();
        if (!mo4191q() && !isVoiceInteractionRoot()) {
            cds.m3507f(getIntent());
        }
        cameraActivity.setRecentsScreenshotEnabled(false);
        cameraActivity.f6771C.m10438i(hkp.ACTIVITY_ONCREATE_END, CameraActivityTiming.f6962b);
        m7739n().mo13962f();
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected final void onDestroy() {
        dnh dnhVar = this.f6774u;
        jvd.m13538a();
        dnhVar.m6432a();
        super.onDestroy();
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0080bz, android.app.Activity
    protected final void onResume() {
        this.f6771C.m10438i(hkp.ACTIVITY_ONRESUME_START, CameraActivityTiming.f6961a);
        super.onResume();
        this.f6771C.m10438i(hkp.ACTIVITY_ONRESUME_END, CameraActivityTiming.f6962b);
        fdh.m8263c(this.f6773t);
        if (this.f6772D) {
            finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x006c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.ero, p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected final void onStart() {
        dnh dnhVar;
        String string;
        CameraActivityTiming cameraActivityTiming = this.f6771C;
        long jMo8353a = cameraActivityTiming.f28240l.mo8353a();
        hkk hkkVar = cameraActivityTiming.f6964d;
        hkkVar.f28169a++;
        int iM10425b = hkkVar.m10425b();
        if (iM10425b != 3) {
            if (iM10425b != 1) {
            }
            cameraActivityTiming.m10439j(hkp.ACTIVITY_ONSTART_START, jMo8353a, CameraActivityTiming.f6961a);
            kba kbaVarM9694c = this.f6776w.m9694c();
            dnhVar = this.f6774u;
            string = toString();
            jvd.m13538a();
            if (dnhVar.f12091c == null) {
                dnhVar.f12091c = dnhVar.f12089a.m14002b("CameraActivity onStart: ".concat(String.valueOf(string)));
            }
            dnhVar.m6432a();
            super.onStart();
            kbaVarM9694c.close();
        }
        cameraActivityTiming.mo4304a();
        cameraActivityTiming.f6966f = cameraActivityTiming.f6965e.mo13957a("FirstPreviewFrame");
        cameraActivityTiming.f6967g = cameraActivityTiming.f6965e.mo13957a("FirstFrameReceived");
        cameraActivityTiming.f6968h = cameraActivityTiming.f6965e.mo13957a("ShutterButtonEnabled");
        for (hkp hkpVar : hkp.values()) {
            if (hkpVar.f28203s) {
                cameraActivityTiming.m10439j(hkpVar, jMo8353a, CameraActivityTiming.f28237k);
            }
        }
        jeu jeuVar = cameraActivityTiming.f28243o;
        cameraActivityTiming.m10439j(hkp.ACTIVITY_ONSTART_START, jMo8353a, CameraActivityTiming.f6961a);
        kba kbaVarM9694c2 = this.f6776w.m9694c();
        dnhVar = this.f6774u;
        string = toString();
        jvd.m13538a();
        if (dnhVar.f12091c == null) {
            dnhVar.f12091c = dnhVar.f12089a.m14002b("CameraActivity onStart: ".concat(String.valueOf(string)));
        }
        dnhVar.m6432a();
        super.onStart();
        kbaVarM9694c2.close();
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0157ei, p000.ActivityC0080bz, android.app.Activity
    protected final void onStop() {
        dnh dnhVar = this.f6774u;
        jvd.m13538a();
        kba kbaVar = dnhVar.f12091c;
        if (kbaVar != null) {
            kbaVar.close();
            dnhVar.f12091c = null;
        }
        dnhVar.m6432a();
        super.onStop();
    }

    /* JADX INFO: renamed from: q */
    protected boolean mo4191q() {
        return false;
    }
}
