package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.preference.ListPreference;
import android.preference.SwitchPreference;
import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ewq {

    /* JADX INFO: renamed from: a */
    public final Object f20667a;

    /* JADX INFO: renamed from: b */
    public final Object f20668b;

    /* JADX INFO: renamed from: c */
    public final Object f20669c;

    /* JADX INFO: renamed from: d */
    public final Object f20670d;

    /* JADX INFO: renamed from: e */
    public final Object f20671e;

    /* JADX INFO: renamed from: f */
    public final Object f20672f;

    /* JADX INFO: renamed from: g */
    public final Object f20673g;

    /* JADX INFO: renamed from: h */
    public final Object f20674h;

    /* JADX INFO: renamed from: i */
    public final Object f20675i;

    /* JADX INFO: renamed from: j */
    public final Object f20676j;

    /* JADX INFO: renamed from: k */
    public final Object f20677k;

    /* JADX INFO: renamed from: l */
    public final Object f20678l;

    /* JADX INFO: renamed from: m */
    public final Object f20679m;

    /* JADX INFO: renamed from: n */
    public final Object f20680n;

    /* JADX INFO: renamed from: o */
    private final Object f20681o;

    /* JADX INFO: renamed from: p */
    private final Object f20682p;

    public ewq(fvu fvuVar, ohb ohbVar, ohb ohbVar2, ohb ohbVar3, ohb ohbVar4, ohb ohbVar5, ohb ohbVar6, bkn bknVar, gvw gvwVar, dhv dhvVar, kbo kboVar, kbz kbzVar, bko bkoVar, eck eckVar, bko bkoVar2, bko bkoVar3, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.f20678l = cwd.m5640N(ohbVar);
        this.f20668b = cwd.m5640N(ohbVar2);
        this.f20676j = fvuVar;
        this.f20679m = cwd.m5640N(ohbVar3);
        this.f20680n = cwd.m5640N(ohbVar4);
        this.f20671e = cwd.m5640N(ohbVar5);
        this.f20675i = bknVar;
        this.f20672f = gvwVar;
        this.f20670d = dhvVar;
        this.f20673g = kboVar.mo6314a("GcaHdrShotCfgFctry");
        this.f20674h = kbzVar;
        this.f20681o = bkoVar;
        this.f20682p = eckVar;
        this.f20669c = bkoVar2;
        this.f20667a = bkoVar3;
        this.f20677k = ohbVar6;
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m7951b(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [gaw, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    private static final void m7952e(egl eglVar, glk glkVar) {
        if (eglVar != egl.NONE) {
            glkVar.f25500a.mo9016a(eec.f13605b, 0.0f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v21, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v23, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v31, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v36, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v38, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v40, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v42, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v46, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v48, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v50, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v63, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v64, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v73, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v77, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v80, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v88, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: a */
    public final void m7953a(Context context) {
        boolean z = false;
        for (kmq kmqVar : kmq.values()) {
            if (((kms) this.f20679m).mo13863j(kmqVar)) {
                kmg kmgVarMo13858e = ((kms) this.f20679m).mo13858e(kmqVar);
                kmgVarMo13858e.getClass();
                z = z || ((kms) this.f20679m).m14581f(kmgVarMo13858e).mo14545N();
            }
        }
        if (this.f20667a.mo6184l(did.f11414Y)) {
            this.f20676j.add("pref_camera_hdrplus_option_available_key");
        } else {
            this.f20675i.add(this.f20668b.mo3830a(new euz(this, 11), this.f20681o));
        }
        if (!this.f20667a.mo6184l(dil.f11632r)) {
            this.f20676j.add("pref_camera_raw_output_option_available_key");
        }
        if (!this.f20667a.mo6184l(dhi.f11115b)) {
            this.f20676j.add(gzy.f27058q.f26977a);
        }
        ?? r0 = this.f20667a;
        dhx dhxVar = dhf.f11040a;
        r0.mo6176d();
        if (!this.f20667a.mo6184l(dib.f11332bm)) {
            this.f20676j.add("pref_camera_selfie_mirror_key");
        }
        ?? r1 = this.f20667a;
        int i = dhn.f11140a;
        r1.mo6177e();
        this.f20676j.add(gzy.f27056o.f26977a);
        this.f20667a.mo6179g();
        this.f20676j.add("pref_category_developer");
        if (!z) {
            this.f20676j.add(gzy.f26989A.f26977a);
        }
        if (!this.f20667a.mo6184l(dhh.f11102o) || !((khb) this.f20678l).m14239d()) {
            this.f20676j.add(gzy.f26990B.f26977a);
        }
        if (!((kms) this.f20679m).mo13862i()) {
            this.f20682p.mo10033e(gzy.f27052k, true);
            this.f20676j.add(gzy.f27052k.f26977a);
        }
        this.f20667a.mo6175c();
        this.f20676j.add("pref_category_custom_hotkeys");
        if (!this.f20667a.mo6184l(dib.f11337br) && !this.f20667a.mo6184l(dib.f11338bs)) {
            this.f20676j.add("pref_camera_dynamic_depth_enabled_key");
        }
        if (!this.f20667a.mo6184l(dhs.f11164b)) {
            this.f20676j.add("pref_category_frequent_faces");
        }
        if (!this.f20667a.mo6184l(did.f11434am)) {
            this.f20676j.add("pref_camera_kepler_enabled_key");
        }
        if (!this.f20667a.mo6184l(dib.f11304bK)) {
            this.f20676j.add("pref_camera_cd_indicator_enabled_key");
        }
        if (!this.f20667a.mo6184l(dib.f11357ck)) {
            this.f20676j.add(gzy.f27054m.f26977a);
        } else if (!((AccessibilityManager) this.f20670d).isTouchExplorationEnabled()) {
            this.f20667a.mo6175c();
            this.f20676j.add(gzy.f27054m.f26977a);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            this.f20676j.add(gzy.f27043b.f26977a);
        }
        if (!this.f20667a.mo6184l(dib.f11322bc)) {
            this.f20676j.add("pref_category_social_share");
        }
        if (!this.f20667a.mo6184l(dib.f11237X)) {
            this.f20671e.mo3415bf(false);
            this.f20676j.add("pref_audio_zoom_key");
        }
        this.f20667a.mo6178f();
        this.f20676j.add(gzy.f27053l.f26977a);
        if (!this.f20667a.mo6184l(dib.f11351ce) || this.f20667a.mo6184l(dib.f11353cg)) {
            this.f20676j.add(gzy.f27055n.f26977a);
        }
        this.f20677k.add(hsSUWRJfoeC.EgSCxfdCyGcTP);
        this.f20677k.add("pref_camera_dynamic_depth_enabled_key");
        this.f20677k.add(gzy.f26990B.f26977a);
        if (!this.f20667a.mo6184l(dib.f11303bJ)) {
            this.f20676j.add(gzy.f27049h.f26977a);
        }
        if (!this.f20667a.mo6184l(diz.f11753a)) {
            this.f20676j.add(voNZjxiJou.SQzEncYQIYL);
        }
        if (Collection$EL.stream(this.f20672f).anyMatch(cdy.f5389r)) {
            this.f20676j.add("pref_launch_feedback");
        }
        naz nazVarListIterator = ((mzx) this.f20673g).listIterator();
        while (nazVarListIterator.hasNext()) {
            hbd hbdVar = (hbd) nazVarListIterator.next();
            if (((String) hbdVar.m10074h().get(0)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.setTitle(hbdVar.m10071e());
                listPreference.setEntries(hbdVar.m10067a());
                listPreference.setEntryValues(hbdVar.m10068b());
                listPreference.setKey(hbdVar.m10073g());
                listPreference.setDefaultValue(hbdVar.m10072f());
                listPreference.setIcon(hbdVar.m10069c());
                listPreference.setSummary(hbdVar.m10070d());
                listPreference.setLayoutResource(C0100R.layout.preference_with_margin);
                listPreference.setOrder(3);
                ((mtq) this.f20680n).mo16908p("pref_category_resolution_camera", listPreference);
            }
        }
        naz nazVarListIterator2 = ((mzx) this.f20674h).listIterator();
        while (nazVarListIterator2.hasNext()) {
            hbe hbeVar = (hbe) nazVarListIterator2.next();
            if (((String) hbeVar.m10079e().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.setTitle(hbeVar.m10076b());
                switchPreference.setSummary(hbeVar.m10075a());
                switchPreference.setKey(hbeVar.m10078d());
                switchPreference.setDefaultValue(hbeVar.m10077c());
                ManagedSwitchPreference managedSwitchPreference = new ManagedSwitchPreference(context);
                managedSwitchPreference.setDefaultValue(true);
                managedSwitchPreference.setKey(switchPreference.getKey());
                managedSwitchPreference.setSummary(switchPreference.getSummary());
                managedSwitchPreference.setTitle(switchPreference.getTitle());
                managedSwitchPreference.setIcon(switchPreference.getIcon());
                managedSwitchPreference.f7110c = switchPreference.getOnPreferenceChangeListener();
                managedSwitchPreference.setOrder(switchPreference.getOrder());
                managedSwitchPreference.setLayoutResource(C0100R.layout.preference_with_margin);
                ((mtq) this.f20680n).mo16908p("pref_category_advanced", managedSwitchPreference);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eck, java.lang.Object] */
    /* JADX INFO: renamed from: c */
    public final void m7954c(ebn ebnVar, eea eeaVar) {
        mrm mrmVarMo7118a = this.f20682p.mo7118a(ebnVar, mrm.m16829i(eeaVar), egl.NONE);
        if (mrmVarMo7118a.mo16813g()) {
            throw new IllegalStateException("Postprocessing pipeline was given image but requested ".concat(mrmVarMo7118a.toString()));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v1, types: [eck, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v23, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v26, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kbo] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v57, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v67, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v82, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r0v90, types: [gaw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kbz] */
    /* JADX WARN: Type inference failed for: r1v9, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final void m7955d(final glk glkVar, gtd gtdVar, final ebn ebnVar, final int i, boolean z, egl eglVar) {
        nps npsVarM14963I;
        this.f20674h.mo13961e("primaryOutputFormat");
        mrm mrmVarMo7118a = this.f20682p.mo7118a(ebnVar, mqu.f41450a, eglVar);
        if (!mrmVarMo7118a.mo16813g()) {
            throw new IllegalStateException("processOrRequestImage was given no image but still didn't request anything");
        }
        ebu ebuVar = (ebu) mrmVarMo7118a.mo16809c();
        this.f20673g.mo13940b("Selected primary format: ".concat(ebuVar.toString()));
        this.f20674h.mo13963g("updateProgress");
        glkVar.f25500a.mo9016a(ecq.f13394a, 0.0f);
        if (ebnVar.f13249d && ((Integer) this.f20670d.mo6173a(dip.f11685a).get()).intValue() != 0 && !((cwd) this.f20679m).m5652K()) {
            glkVar.f25500a.mo9016a(eec.f13604a, 0.0f);
        }
        this.f20674h.mo13963g("getAggregator");
        een eenVarM2622p = ((bko) this.f20681o).m2622p(glkVar.f25502c.mo9902h());
        final edz edzVarM7202a = eea.m7202a();
        edzVarM7202a.m7194e(kay.m13889b(i));
        edzVarM7202a.f13542j = ebnVar;
        edzVarM7202a.f13544l = gtdVar;
        edzVarM7202a.f13543k = glkVar;
        if (((cwd) this.f20678l).m5652K()) {
            this.f20674h.mo13963g("moments#onMainShotStarted");
            ((ftp) ((cwd) this.f20678l).m5651J()).mo8743m(glkVar.f25502c.mo9902h(), new npk(ebnVar.m7065a(), glkVar.f25502c.mo9903i() == gyw.PORTRAIT));
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20674h.mo13963g("addProgressListener");
        final byte[] bArr = null;
        final byte[] bArr2 = null;
        edf edfVar = new edf(glkVar, atomicBoolean, bArr, bArr2) { // from class: ebe

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ AtomicBoolean f13203a;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ glk f13205c;

            /* JADX WARN: Type inference failed for: r1v1, types: [gyh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kbz] */
            /* JADX WARN: Type inference failed for: r3v1, types: [gaw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kbz] */
            @Override // p000.edf
            /* JADX INFO: renamed from: a */
            public final void mo7051a(float f) {
                ewq ewqVar = this.f13204b;
                glk glkVar2 = this.f13205c;
                AtomicBoolean atomicBoolean2 = this.f13203a;
                ewqVar.f20674h.mo13961e("ProgressCallback");
                glkVar2.f25500a.mo9016a(ecq.f13394a, f);
                if (atomicBoolean2.compareAndSet(false, true)) {
                    ?? r1 = glkVar2.f25502c;
                    r1.mo9885Q(r1.mo9903i() == gyw.NORMAL ? jvh.m13548F(C0100R.string.photo_processing, new Object[0]) : jvh.m13548F(C0100R.string.processing_hdr_plus, new Object[0]));
                }
                ewqVar.f20674h.mo13962f();
            }
        };
        if (eenVarM2622p.f13681a == null) {
            eenVarM2622p.f13681a = mxk.m17132D();
        }
        eenVarM2622p.f13681a.mo17072d(edfVar);
        Object obj = this.f20667a;
        glkVar.f25502c.mo9908n();
        ?? r0 = ((bko) obj).f3652a;
        dhx dhxVar = did.f11416a;
        r0.mo6178f();
        this.f20674h.mo13963g("addBaseFrameListener");
        final byte[] bArr3 = null;
        final byte[] bArr4 = null;
        eenVarM2622p.m7221a(new ecy(glkVar, edzVarM7202a, i, ebnVar, bArr3, bArr4) { // from class: ebf

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ edz f13206a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f13207b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ ebn f13208c;

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ glk f13210e;

            /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kbz] */
            /* JADX WARN: Type inference failed for: r3v9, types: [gvw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v4, types: [gyh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kbz] */
            /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kbz] */
            /* JADX WARN: Type inference failed for: r7v2, types: [gyh, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, kbo] */
            /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, ohb] */
            /* JADX WARN: Type inference failed for: r8v6, types: [gvw, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kbo] */
            @Override // p000.ecy
            /* JADX INFO: renamed from: a */
            public final void mo7052a(eem eemVar, int i2, long j, kpp kppVar) {
                ewq ewqVar = this.f13209d;
                glk glkVar2 = this.f13210e;
                edz edzVar = this.f13206a;
                int i3 = this.f13207b;
                ebn ebnVar2 = this.f13208c;
                ewqVar.f20674h.mo13961e("ShotConfigFactory#BaseFrameCallback");
                ((bko) ewqVar.f20669c).m2624r(j);
                if (((cwd) ewqVar.f20668b).m5652K()) {
                    ((fti) ((cwd) ewqVar.f20668b).m5651J()).mo8757b(glkVar2.f25502c.mo9902h(), j);
                }
                synchronized (edzVar) {
                    edzVar.m7193d(kppVar);
                    edzVar.m7196g(j);
                }
                if (ewqVar.f20670d.mo6184l(did.f11436ao)) {
                    ewqVar.f20673g.mo13940b("Quick Postview disabled, defaulting to YuvThumbnailProcessor");
                    ewqVar.f20674h.mo13962f();
                    return;
                }
                mrm mrmVar = (mrm) ((bkn) ewqVar.f20675i).f3651a;
                mrm mrmVarM16828h = !mrmVar.mo16813g() ? mqu.f41450a : mrm.m16828h(((fgy) mrmVar.mo16809c()).mo8328c(j));
                if (mrmVarM16828h.mo16813g()) {
                    ewqVar.f20673g.mo13940b("Successfully acquired YUV baseFrameImage");
                    Bitmap bitmapM4697a = YuvUtilNative.m4697a((kpw) mrmVarM16828h.mo16809c());
                    ((kpw) mrmVarM16828h.mo16809c()).close();
                    int i4 = true != ewqVar.f20672f.mo9812h(((kmr) ewqVar.f20676j).mo14558k()) ? i3 : 0;
                    ?? r3 = ewqVar.f20672f;
                    bitmapM4697a.getClass();
                    Bitmap bitmapMo9806b = r3.mo9806b(bitmapM4697a, i3, ((kmr) ewqVar.f20676j).mo14558k());
                    if (i4 != 0 && bitmapMo9806b != null) {
                        bitmapMo9806b = ewq.m7951b(bitmapMo9806b, i4);
                    }
                    if (ebnVar2.f13255j) {
                        bitmapMo9806b = dst.m6666a((dsl) ewqVar.f20677k.get(), bitmapMo9806b, mrm.m16829i(kppVar));
                    }
                    glkVar2.f25502c.mo9892X(bitmapMo9806b, 0);
                }
                ewqVar.f20674h.mo13962f();
            }
        });
        if (!this.f20670d.mo6184l(did.f11436ao) || !z) {
            this.f20674h.mo13963g("addPostViewRgbListener");
            eenVarM2622p.m7223c(new ebg(this, i, glkVar, ebnVar, null, null));
        }
        if (ebuVar == ebu.YUV) {
            this.f20674h.mo13963g("addYuvListener");
            ebh ebhVar = new ebh(this, edzVarM7202a, ebnVar, null);
            if (eenVarM2622p.f13700t == null) {
                eenVarM2622p.f13700t = mxk.m17132D();
            }
            eenVarM2622p.f13700t.mo17072d(ebhVar);
        }
        if (((cwd) this.f20679m).m5652K() && (((cwd) this.f20679m).m5651J() instanceof edx)) {
            nqf nqfVarM17621g = nqf.m17621g();
            this.f20674h.mo13963g("addPdListener");
            ebk ebkVar = new ebk(this, nqfVarM17621g, null);
            if (eenVarM2622p.f13698r == null) {
                eenVarM2622p.f13698r = mxk.m17132D();
            }
            eenVarM2622p.f13698r.mo17072d(ebkVar);
            npsVarM14963I = nqfVarM17621g;
        } else {
            npsVarM14963I = kxk.m14963I();
        }
        edzVarM7202a.m7192c(npsVarM14963I);
        if ((((cwd) this.f20679m).m5652K() && (((cwd) this.f20679m).m5651J() instanceof edx) && this.f20670d.mo6184l(dio.f11644A)) || eglVar == egl.DEBLUR) {
            this.f20674h.mo13963g("addRawListener");
            m7952e(eglVar, glkVar);
            eenVarM2622p.m7224d(new gnp(this, glkVar, 1, (byte[]) null, (byte[]) null));
        }
        if (ebuVar == ebu.RGB) {
            this.f20674h.mo13963g("addRgbListener");
            m7952e(eglVar, glkVar);
            eenVarM2622p.m7225e(new ebi(this, eglVar, glkVar, edzVarM7202a, ebnVar, null, null));
        }
        if (ebuVar == ebu.RGB_HW) {
            this.f20674h.mo13963g("addHwRgbListener");
            eenVarM2622p.m7222b(new eoa(this, edzVarM7202a, ebnVar, 1, null));
        }
        if (ebnVar.f13248c && ((cwd) this.f20680n).m5652K() && ((fua) glkVar.f25503d).f23580h) {
            this.f20674h.mo13963g("addDngListener");
            lku.m15613H(((cwd) this.f20680n).m5652K());
            ebl eblVar = new ebl(this, glkVar, null, null);
            if (eenVarM2622p.f13694n == null) {
                eenVarM2622p.f13694n = mxk.m17132D();
            }
            eenVarM2622p.f13694n.mo17072d(eblVar);
        }
        this.f20674h.mo13963g("addShotStatusListener");
        eenVarM2622p.m7226f(new ebj(this, glkVar, null, null));
        this.f20674h.mo13962f();
    }

    public ewq(kms kmsVar, dhv dhvVar, jww jwwVar, gdc gdcVar, jvd jvdVar, khb khbVar, hai haiVar, AccessibilityManager accessibilityManager, jww jwwVar2, Set set, Set set2, Set set3, byte[] bArr) {
        this.f20680n = mwc.m17057v();
        this.f20675i = new ArrayList(10);
        this.f20676j = new ArrayList(10);
        this.f20677k = new HashSet();
        this.f20679m = kmsVar;
        this.f20667a = dhvVar;
        this.f20668b = jwwVar;
        this.f20669c = gdcVar;
        this.f20681o = jvdVar;
        this.f20678l = khbVar;
        this.f20682p = haiVar;
        this.f20670d = accessibilityManager;
        this.f20671e = jwwVar2;
        this.f20672f = set;
        this.f20673g = set2;
        this.f20674h = set3;
    }
}
