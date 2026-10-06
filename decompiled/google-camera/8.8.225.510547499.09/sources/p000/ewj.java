package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.settings.CameraMaterialSettingsActivity;
import com.google.android.apps.camera.p014ui.preference.MaterialKeyListenerPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedMainSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialStorageStatusPreference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewj extends aof implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: ae */
    public ewk f20632ae;

    /* JADX INFO: renamed from: af */
    public MaterialManagedSwitchPreference f20633af;

    /* JADX INFO: renamed from: ag */
    private String f20634ag;

    /* JADX INFO: renamed from: ah */
    private MaterialManagedSwitchPreference f20635ah;

    /* JADX INFO: renamed from: ai */
    private jvb f20636ai;

    /* JADX INFO: renamed from: aj */
    private final HashMap f20637aj = new HashMap();

    /* JADX INFO: renamed from: ak */
    private gkz f20638ak;

    /* JADX INFO: renamed from: E */
    private final PreferenceScreen m7938E(PreferenceGroup preferenceGroup, String str) {
        PreferenceScreen preferenceScreenM7938E;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.f1590r)) {
            return (PreferenceScreen) preferenceGroup;
        }
        for (int i = 0; i < preferenceGroup.m1532k(); i++) {
            Preference preferenceM1534o = preferenceGroup.m1534o(i);
            if ((preferenceM1534o instanceof PreferenceGroup) && (preferenceScreenM7938E = m7938E((PreferenceGroup) preferenceM1534o, str)) != null) {
                return preferenceScreenM7938E;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: F */
    private final void m7939F(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.m1532k(); i++) {
            Preference preferenceM1534o = preferenceGroup.m1534o(i);
            if (preferenceM1534o instanceof PreferenceGroup) {
                m7939F((PreferenceGroup) preferenceM1534o);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    private final void m7940G(String str) {
        PreferenceGroup preferenceGroup;
        Preference preferenceMo1723a = mo1723a(str);
        if (preferenceMo1723a == null || (preferenceGroup = preferenceMo1723a.f1562D) == null) {
            return;
        }
        boolean zM1530aj = preferenceGroup.m1530aj(preferenceMo1723a);
        preferenceGroup.m1485C();
        if (zM1530aj) {
            return;
        }
        ((nbe) ((nbe) CameraMaterialSettingsActivity.f6789q.m17252c()).mo17276G((char) 2002)).mo17293r("Failed to remove preference :%s", str);
    }

    /* JADX INFO: renamed from: H */
    private final void m7941H(String str) {
        Preference preferenceMo1723a = mo1723a(str);
        if (preferenceMo1723a instanceof PreferenceScreen) {
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceMo1723a;
            ActivityC0080bz activity = getActivity();
            activity.getClass();
            Intent intent = new Intent(activity, (Class<?>) CameraMaterialSettingsActivity.class);
            intent.putExtra("pref_screen_extra", preferenceScreen.f1590r);
            intent.putExtra("pref_screen_title", preferenceScreen.f1589q);
            preferenceScreen.f1591s = intent;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m7942C() {
        this.f20632ae.f20648j.mo10045l(gzy.f27043b.f26977a, false);
        this.f20633af.mo1542k(false);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7943D() {
        ActivityC0080bz activity = getActivity();
        activity.getClass();
        if (activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            return true;
        }
        ActivityC0080bz activity2 = getActivity();
        activity2.getClass();
        return activity2.checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // p000.aof
    /* JADX INFO: renamed from: c */
    public final PreferenceScreen mo1756c() {
        aoo aooVar = ((aof) this).f1879a;
        PreferenceScreen preferenceScreen = aooVar == null ? null : aooVar.f1903b;
        String str = this.f20634ag;
        if (str == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        PreferenceScreen preferenceScreenM7938E = m7938E(preferenceScreen, str);
        if (preferenceScreenM7938E != null) {
            return preferenceScreenM7938E;
        }
        throw new RuntimeException("key " + this.f20634ag + " not found");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // p000.ComponentCallbacksC0077bw
    public final void onActivityCreated(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        PreferenceCategory preferenceCategory = (PreferenceCategory) mo1723a("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            m7939F(preferenceCategory);
        }
        PreferenceCategory preferenceCategory2 = (PreferenceCategory) mo1723a("pref_category_resolution_video");
        if (preferenceCategory2 != null) {
            m7939F(preferenceCategory2);
        }
        if (!this.f20638ak.f25440i.contains("pref_category_custom_hotkeys") && (preferenceScreen = (PreferenceScreen) mo1723a("pref_category_custom_hotkeys")) != null) {
            for (int i = 0; i < preferenceScreen.m1532k(); i++) {
                Preference preferenceM1534o = preferenceScreen.m1534o(i);
                String string = preferenceM1534o.m1518r().getString(preferenceM1534o.f1590r, "-1");
                if (!this.f20637aj.containsKey(preferenceM1534o.f1590r)) {
                    this.f20637aj.put(preferenceM1534o.f1590r, string);
                }
            }
        }
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, myv] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v161, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v162, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v164, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v165, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r4v166, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v167, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v172, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v173, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v174, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v175, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v176, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v178, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v179, types: [hai, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v180, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v184, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v185, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v186, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v187, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v188, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v30, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v33, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v38, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v40, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v42, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v48, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v50, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v52, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v54, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v56, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v58, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v62, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v63, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v65, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v66, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v67, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v69, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v70, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v71, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v72, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v74, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v87, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r5v32, types: [dhv, java.lang.Object] */
    @Override // p000.aof, p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        String string;
        MaterialManagedSwitchPreference materialManagedSwitchPreference;
        MaterialManagedSwitchPreference materialManagedSwitchPreference2;
        PreferenceScreen preferenceScreen;
        PreferenceScreen preferenceScreen2;
        String str;
        PreferenceScreen preferenceScreen3;
        PreferenceScreen preferenceScreen4;
        MaterialManagedSwitchPreference materialManagedSwitchPreference3;
        MaterialManagedSwitchPreference materialManagedSwitchPreference4;
        MaterialManagedSwitchPreference materialManagedSwitchPreference5;
        aoo aooVar;
        PreferenceScreen preferenceScreen5;
        super.onCreate(bundle);
        ActivityC0080bz activity = getActivity();
        Context context = getContext();
        if (activity == null || context == null) {
            return;
        }
        eso esoVarMo4194f = ((etq) activity.getApplication()).mo4194f();
        this.f20636ai = new jvb();
        byte[] bArr = null;
        cwd cwdVar = new cwd(activity, (byte[]) null);
        esz eszVar = ((esz) esoVarMo4194f).f16376a;
        eqn eqnVar = new eqn((oju) new dws(cwdVar, 5, (byte[]) null, (byte[]) null, (byte[]) null), eszVar.f16353D, eszVar.f16641f, 8, (char[][]) null);
        ern ernVar = new ern(cwdVar, 6, null, null, null);
        ern ernVar2 = new ern(cwdVar, 7, null, null, null);
        oju ojuVarM18486b = ohh.m18486b(hja.m10364a(eszVar.f16959l, ernVar, ernVar2, eszVar.f17277r, eszVar.f16641f, ohh.m18486b(hqv.m10643a(ohh.m18486b(hie.m10336d(ernVar, ernVar2, eszVar.f16959l))))));
        oju ojuVarM18486b2 = ohh.m18486b(iro.m11656a(etl.m7864c(ohh.m18486b(iim.m11382a(ojuVarM18486b))), eszVar.f16641f));
        oju ojuVarM18486b3 = ohh.m18486b(htn.m10748a(etl.m7864c(ohh.m18486b(htn.m10749b(ojuVarM18486b, ohn.m18492a(goc.m9575c(eszVar.f16588e))))), eszVar.f16641f));
        kms kmsVar = (kms) eszVar.f16424av.get();
        dhv dhvVar = (dhv) eszVar.f16641f.get();
        jww jwwVar = (jww) eszVar.f16739gs.get();
        gdc gdcVar = (gdc) eszVar.f16500cR.get();
        jvd jvdVar = (jvd) eszVar.f16959l.get();
        khb khbVar = (khb) eszVar.f16666fY.get();
        hai haiVar = (hai) eszVar.f16353D.get();
        AccessibilityManager accessibilityManagerM7817l = eszVar.m7817l();
        jww jwwVar2 = (jww) eszVar.f16647fF.get();
        mzx mzxVar = mzx.f41874a;
        this.f20638ak = new gkz(kmsVar, dhvVar, jwwVar, gdcVar, jvdVar, khbVar, haiVar, accessibilityManagerM7817l, jwwVar2, mzxVar, mzxVar, null);
        Object obj = cwdVar.f9866a;
        dmy dmyVar = new dmy((Context) obj);
        hgs hgsVar = new hgs((Context) cwdVar.f9866a, eszVar.m7819n(), (had) eszVar.f17293t.get(), (hah) eszVar.f16353D.get(), (hai) eszVar.f16353D.get(), (hgy) eszVar.f16726gf.get(), (fcp) eszVar.f17277r.get());
        mzx mzxVar2 = mzx.f41874a;
        fcp fcpVar = (fcp) eszVar.f17277r.get();
        jww jwwVar3 = (jww) eszVar.f16501cS.get();
        C1058va c1058va = new C1058va((Context) eszVar.f16769hV.f26335b, (jww) eszVar.f16443bN.get(), (fcp) eszVar.f17277r.get(), (dhv) eszVar.f16641f.get());
        hmc hmcVar = new hmc(gpm.m9610d((jww) eszVar.f16501cS.get(), (jww) eszVar.f16642fA.get(), (jww) eszVar.f16419aq.get(), (har) eszVar.f16735go.get(), (djm) eszVar.f16733gm.get(), (hah) eszVar.f16353D.get(), (hai) eszVar.f16353D.get()), (hmr) eszVar.f16550dO.get(), new drj((jww) eszVar.f16501cS.get(), (jww) eszVar.f16642fA.get(), (har) eszVar.f16735go.get(), (djm) eszVar.f16733gm.get(), (hah) eszVar.f16353D.get(), null, null, null), (ScheduledExecutorService) eszVar.f16694g.get(), (jvd) eszVar.f16959l.get(), (fcp) eszVar.f17277r.get(), null, null, null);
        ohb ohbVarM18485a = ohh.m18485a(eqnVar);
        had hadVar = (had) eszVar.f17293t.get();
        mrm mrmVarM7818m = eszVar.m7818m();
        this.f20632ae = new ewk(dmyVar, hgsVar, mzxVar2, fcpVar, jwwVar3, c1058va, hmcVar, ohbVarM18485a, hadVar, mrmVarM7818m, (mrm) ojuVarM18486b3.get(), null, null, null, null, null);
        gkz gkzVar = this.f20638ak;
        int i = 0;
        boolean z = false;
        for (kmq kmqVar : kmq.values()) {
            if (((kms) gkzVar.f25433b).mo13863j(kmqVar)) {
                kmg kmgVarMo13858e = ((kms) gkzVar.f25433b).mo13858e(kmqVar);
                kmgVarMo13858e.getClass();
                z = z || ((kms) gkzVar.f25433b).m14581f(kmgVarMo13858e).mo14545N();
            }
        }
        if (gkzVar.f25432a.mo6184l(did.f11414Y)) {
            gkzVar.f25440i.add("pref_camera_hdrplus_option_available_key");
        } else {
            gkzVar.f25436e.add(gkzVar.f25441j.mo3830a(new euz(gkzVar, 10, bArr), gkzVar.f25443l));
        }
        if (!gkzVar.f25432a.mo6184l(dil.f11632r)) {
            gkzVar.f25440i.add("pref_camera_raw_output_option_available_key");
        }
        if (!gkzVar.f25432a.mo6184l(dhi.f11115b)) {
            gkzVar.f25440i.add(gzy.f27058q.f26977a);
        }
        ?? r4 = gkzVar.f25432a;
        dhx dhxVar = dhf.f11040a;
        r4.mo6176d();
        if (!gkzVar.f25432a.mo6184l(dib.f11332bm)) {
            gkzVar.f25440i.add("pref_camera_selfie_mirror_key");
        }
        gkzVar.f25432a.mo6179g();
        gkzVar.f25440i.add("pref_category_developer");
        if (!z) {
            gkzVar.f25440i.add(gzy.f26989A.f26977a);
        }
        if (!gkzVar.f25432a.mo6184l(dhh.f11102o) || !((khb) gkzVar.f25444m).m14239d()) {
            gkzVar.f25440i.add(gzy.f26990B.f26977a);
        }
        if (!((kms) gkzVar.f25433b).mo13862i()) {
            gkzVar.f25437f.mo10033e(gzy.f27052k, true);
            gkzVar.f25440i.add(gzy.f27052k.f26977a);
        }
        gkzVar.f25432a.mo6175c();
        gkzVar.f25440i.add("pref_category_custom_hotkeys");
        if (!gkzVar.f25432a.mo6184l(dib.f11337br) && !gkzVar.f25432a.mo6184l(dib.f11338bs)) {
            gkzVar.f25440i.add("pref_camera_dynamic_depth_enabled_key");
        }
        if (!gkzVar.f25432a.mo6184l(dhs.f11164b)) {
            gkzVar.f25440i.add("pref_category_frequent_faces");
        }
        if (!gkzVar.f25432a.mo6184l(did.f11434am)) {
            gkzVar.f25440i.add("pref_camera_kepler_enabled_key");
        }
        if (!gkzVar.f25432a.mo6184l(dib.f11304bK)) {
            gkzVar.f25440i.add("pref_camera_cd_indicator_enabled_key");
        }
        if (!gkzVar.f25432a.mo6184l(dib.f11357ck)) {
            gkzVar.f25440i.add(gzy.f27054m.f26977a);
        } else if (!((AccessibilityManager) gkzVar.f25446o).isTouchExplorationEnabled()) {
            gkzVar.f25432a.mo6175c();
            gkzVar.f25440i.add(gzy.f27054m.f26977a);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_COARSE_LOCATION", context.getPackageName()) || packageManager.isPermissionRevokedByPolicy("android.permission.ACCESS_FINE_LOCATION", context.getPackageName())) {
            gkzVar.f25440i.add(gzy.f27043b.f26977a);
        }
        if (!gkzVar.f25432a.mo6184l(dib.f11322bc)) {
            gkzVar.f25440i.add("pref_category_social_share");
        }
        gkzVar.f25432a.mo6178f();
        gkzVar.f25440i.add(gzy.f27053l.f26977a);
        if (!gkzVar.f25432a.mo6184l(dib.f11237X)) {
            gkzVar.f25442k.mo3415bf(false);
            gkzVar.f25440i.add("pref_audio_zoom_key");
        }
        gkzVar.f25435d.add("pref_camera_resolution");
        gkzVar.f25435d.add("pref_camera_dynamic_depth_enabled_key");
        gkzVar.f25435d.add(gzy.f26990B.f26977a);
        if (!gkzVar.f25432a.mo6184l(dib.f11303bJ) && !gkzVar.f25432a.mo6184l(dij.f11593q)) {
            gkzVar.f25440i.add(gzy.f27049h.f26977a);
        }
        if (!gkzVar.f25432a.mo6184l(diz.f11753a)) {
            gkzVar.f25440i.add("pref_chameleon_control_key");
        }
        naz nazVarListIterator = ((mzx) gkzVar.f25438g).listIterator();
        while (nazVarListIterator.hasNext()) {
            hbd hbdVar = (hbd) nazVarListIterator.next();
            if (((String) hbdVar.m10074h().get(i)).equals("PhotoResolution")) {
                ListPreference listPreference = new ListPreference(context);
                listPreference.m1501S(hbdVar.m10071e());
                listPreference.f1553g = listPreference.f1582j.getResources().getTextArray(hbdVar.m10067a());
                listPreference.f1554h = listPreference.f1582j.getResources().getTextArray(hbdVar.m10068b());
                listPreference.m1496N(hbdVar.m10073g());
                listPreference.f1594v = hbdVar.m10072f();
                listPreference.m1494L(hbdVar.m10069c());
                listPreference.m1499Q(hbdVar.m10070d());
                listPreference.f1559A = C0100R.layout.preference_with_margin;
                listPreference.m1498P(3);
                ((mtq) gkzVar.f25439h).mo16908p("pref_category_resolution_camera", listPreference);
                i = 0;
            } else {
                i = 0;
            }
        }
        naz nazVarListIterator2 = ((mzx) gkzVar.f25434c).listIterator();
        while (nazVarListIterator2.hasNext()) {
            hbe hbeVar = (hbe) nazVarListIterator2.next();
            if (((String) hbeVar.m10079e().get(0)).equals("Advanced")) {
                SwitchPreference switchPreference = new SwitchPreference(context);
                switchPreference.m1501S(hbeVar.m10076b());
                switchPreference.m1499Q(hbeVar.m10075a());
                switchPreference.m1496N(hbeVar.m10078d());
                switchPreference.f1594v = hbeVar.m10077c();
                MaterialManagedSwitchPreference materialManagedSwitchPreference6 = new MaterialManagedSwitchPreference(context);
                materialManagedSwitchPreference6.f1594v = true;
                materialManagedSwitchPreference6.m1496N(switchPreference.f1590r);
                materialManagedSwitchPreference6.mo1479n(switchPreference.mo1478m());
                materialManagedSwitchPreference6.mo1502T(switchPreference.f1589q);
                materialManagedSwitchPreference6.m1495M(switchPreference.m1519s());
                materialManagedSwitchPreference6.f7143e = switchPreference.f1586n;
                materialManagedSwitchPreference6.m1498P(switchPreference.f1588p);
                ((mtq) gkzVar.f25439h).mo16908p("pref_category_advanced", materialManagedSwitchPreference6);
            }
        }
        Object obj2 = gkzVar.f25440i;
        ?? r2 = this.f20638ak.f25440i;
        Bundle bundle2 = this.f4610l;
        if (bundle2 != null) {
            this.f20634ag = bundle2.getString("pref_screen_extra");
        }
        aoo aooVar2 = ((aof) this).f1879a;
        if (aooVar2 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        PreferenceScreen preferenceScreenMo1756c = mo1756c();
        aooVar2.m1779f(true);
        int i2 = aok.f1899a;
        Object[] objArr = new Object[2];
        String[] strArr = {String.valueOf(Preference.class.getPackage().getName()).concat("."), String.valueOf(SwitchPreference.class.getPackage().getName()).concat(".")};
        XmlResourceParser xml = contextRequireContext.getResources().getXml(C0100R.xml.camera_material_preferences);
        try {
            Preference preferenceM1769a = aok.m1769a(xml, preferenceScreenMo1756c, contextRequireContext, objArr, aooVar2, strArr);
            xml.close();
            PreferenceScreen preferenceScreen6 = (PreferenceScreen) preferenceM1769a;
            preferenceScreen6.m1487E(aooVar2);
            aooVar2.m1779f(false);
            if (preferenceScreen6 != null && preferenceScreen6 != (preferenceScreen5 = (aooVar = ((aof) this).f1879a).f1903b)) {
                if (preferenceScreen5 != null) {
                    preferenceScreen5.mo1488F();
                }
                aooVar.f1903b = preferenceScreen6;
                this.f1885c = true;
                if (this.f1886d && !this.f1880ad.hasMessages(1)) {
                    this.f1880ad.obtainMessage(1).sendToTarget();
                }
            }
            PreferenceScreen preferenceScreen7 = (PreferenceScreen) mo1723a("prefscreen_top");
            if (preferenceScreen7 != null) {
                naz nazVarListIterator3 = ((mzx) this.f20632ae.f20641c).listIterator();
                while (nazVarListIterator3.hasNext()) {
                    hbb hbbVar = (hbb) nazVarListIterator3.next();
                    PreferenceCategory preferenceCategory = new PreferenceCategory(preferenceScreen7.f1582j);
                    preferenceCategory.m1501S(hbbVar.m10059b());
                    preferenceCategory.m1496N(hbbVar.m10060c());
                    preferenceCategory.m1498P(hbbVar.m10058a());
                    ((PreferenceGroup) preferenceCategory).f1601c = true;
                    preferenceScreen7.m1531ak(preferenceCategory);
                    for (hbc hbcVar : hbbVar.m10061d()) {
                        PreferenceScreen preferenceScreen8 = preferenceScreen7;
                        naz nazVar = nazVarListIterator3;
                        Preference preference = new Preference(preferenceCategory.f1582j);
                        preference.m1501S(hbcVar.m10063b());
                        preference.m1496N(hbcVar.m10065d());
                        preference.mo1479n(hbcVar.m10066e());
                        preference.m1494L(hbcVar.m10062a());
                        Intent intentM10064c = hbcVar.m10064c();
                        if (intentM10064c != null) {
                            preference.f1591s = intentM10064c;
                        }
                        preferenceCategory.m1531ak(preference);
                        preferenceScreen7 = preferenceScreen8;
                        nazVarListIterator3 = nazVar;
                    }
                }
            }
            Iterator it = this.f20638ak.f25436e.iterator();
            while (it.hasNext()) {
                this.f20636ai.m13537d((kba) it.next());
            }
            if (!r2.contains("pref_audio_zoom_key") && (materialManagedSwitchPreference5 = (MaterialManagedSwitchPreference) mo1723a("pref_audio_zoom_key")) != null) {
                materialManagedSwitchPreference5.f7143e = new ewg(this, materialManagedSwitchPreference5, 2);
            }
            if (!r2.contains("pref_camera_enable_iris") && (materialManagedSwitchPreference4 = (MaterialManagedSwitchPreference) mo1723a("pref_camera_enable_iris")) != null) {
                materialManagedSwitchPreference4.mo1479n(getString(C0100R.string.pref_camera_lens_subtitle_legacy));
            }
            if (!r2.contains(gzy.f27053l.f26977a) && (materialManagedSwitchPreference3 = (MaterialManagedSwitchPreference) mo1723a(gzy.f27053l.f26977a)) != null) {
                materialManagedSwitchPreference3.mo1479n(getString(C0100R.string.pref_camera_catcher_summary));
            }
            Preference preferenceMo1723a = mo1723a(gzy.f27043b.f26977a);
            preferenceMo1723a.getClass();
            MaterialManagedSwitchPreference materialManagedSwitchPreference7 = (MaterialManagedSwitchPreference) preferenceMo1723a;
            this.f20633af = materialManagedSwitchPreference7;
            materialManagedSwitchPreference7.f7143e = new ewi(this, 0);
            Iterator it2 = r2.iterator();
            while (it2.hasNext()) {
                m7940G((String) it2.next());
            }
            if (!r2.contains("pref_category_developer") && (preferenceScreen4 = (PreferenceScreen) mo1723a("pref_category_developer")) != null) {
                this.f20632ae.f20639a.m6413a(preferenceScreen4);
            }
            if (!r2.contains("pref_category_social_share") && (str = this.f20634ag) != null && str.equals("pref_category_social_share") && (preferenceScreen3 = (PreferenceScreen) mo1723a("pref_category_social_share")) != null) {
                hgs hgsVar2 = this.f20632ae.f20640b;
                hgsVar2.f27742m = preferenceScreen3;
                hgsVar2.f27735f.mo10269f();
                if (!((Boolean) hgsVar2.f27733d.mo10031c(gzy.f27006R)).booleanValue() && !((Boolean) hgsVar2.f27733d.mo10031c(gzy.f27007S)).booleanValue()) {
                    if (hgsVar2.f27735f.mo10273j("image/*") || hgsVar2.f27735f.mo10273j("video/*")) {
                        hgsVar2.f27734e.mo10033e(gzy.f27004P, true);
                    } else {
                        hgsVar2.f27734e.mo10033e(gzy.f27004P, false);
                    }
                    hgsVar2.f27733d.mo10031c(gzy.f27004P);
                }
                MaterialManagedMainSwitchPreference materialManagedMainSwitchPreference = (MaterialManagedMainSwitchPreference) preferenceScreen3.m1533l(gzy.f27004P.f26977a);
                if (materialManagedMainSwitchPreference != null) {
                    materialManagedMainSwitchPreference.f7136e = new ewg(hgsVar2, materialManagedMainSwitchPreference, 3);
                }
                Preference preferenceM1533l = preferenceScreen3.m1533l("key_social_share_top_intro");
                if (preferenceM1533l != null) {
                    preferenceM1533l.mo1502T(jvh.m13549G(C0100R.plurals.social_share_info, 3, 3).mo11322a(hgsVar2.f27730a.getResources()));
                }
                int i3 = 4;
                nod.m17553i(kxk.m14970P(new cnn(hgsVar2, nod.m17553i(kxk.m14970P(new cnm(hgsVar2, i3), hgsVar2.f27731b), new etx(hgsVar2, 19), jvh.m13554b()), i3), hgsVar2.f27731b), new dvz(hgsVar2, preferenceScreen3, 7), jvh.m13554b());
            }
            int i4 = 12;
            if (!r2.contains("pref_category_frequent_faces") && (preferenceScreen2 = (PreferenceScreen) mo1723a("pref_category_frequent_faces")) != null) {
                C1058va c1058va2 = this.f20632ae.f20649k;
                MaterialManagedSwitchPreference materialManagedSwitchPreference8 = (MaterialManagedSwitchPreference) preferenceScreen2.m1533l("key_ff_opt_in");
                if (materialManagedSwitchPreference8 != null) {
                    materialManagedSwitchPreference8.mo1542k(((Boolean) c1058va2.f47802a.mo3831be()).booleanValue());
                    materialManagedSwitchPreference8.f7143e = new ewi(c1058va2, 1, null, null, null, null, null);
                    materialManagedSwitchPreference8.m4424ai(((Context) c1058va2.f47803b).getResources().getString(C0100R.string.frequent_faces_learn_more), new drs((Activity) activity, 12));
                }
            }
            if (!r2.contains("pref_category_storage") && (preferenceScreen = (PreferenceScreen) mo1723a("pref_category_storage")) != null) {
                preferenceScreen.f1587o = new dmw(this, 2);
                final hmc hmcVar2 = this.f20632ae.f20642d;
                MaterialStorageStatusPreference materialStorageStatusPreference = (MaterialStorageStatusPreference) preferenceScreen.m1533l("pref_storage_status");
                materialStorageStatusPreference.getClass();
                hmcVar2.f28300d = materialStorageStatusPreference;
                hmcVar2.f28300d.f1559A = C0100R.layout.material_preference_storage_status;
                final MaterialManagedSwitchPreference materialManagedSwitchPreference9 = (MaterialManagedSwitchPreference) preferenceScreen.m1533l(gzy.f27010V.f26977a);
                final MaterialManagedSwitchPreference materialManagedSwitchPreference10 = (MaterialManagedSwitchPreference) preferenceScreen.m1533l(gzy.f27011W.f26977a);
                if (materialManagedSwitchPreference10 != null && materialManagedSwitchPreference9 != null) {
                    materialManagedSwitchPreference10.mo1479n(activity.getResources().getString(C0100R.string.pref_low_storage_mode_auto_disable_summary, 1));
                    materialManagedSwitchPreference10.m1493K(((TwoStatePreference) materialManagedSwitchPreference9).f1626a);
                    materialManagedSwitchPreference9.f7143e = new ant() { // from class: hmb
                        @Override // p000.ant
                        /* JADX INFO: renamed from: b */
                        public final boolean mo1734b(Preference preference2, Object obj3) {
                            hmc hmcVar3 = hmcVar2;
                            MaterialManagedSwitchPreference materialManagedSwitchPreference11 = materialManagedSwitchPreference10;
                            MaterialManagedSwitchPreference materialManagedSwitchPreference12 = materialManagedSwitchPreference9;
                            if (Boolean.TRUE.equals(obj3)) {
                                hmcVar3.f28303g.m15529e();
                                materialManagedSwitchPreference11.m1493K(true);
                            } else {
                                hmcVar3.f28303g.m15528d();
                                materialManagedSwitchPreference11.m1493K(false);
                            }
                            hmcVar3.m10456a();
                            hmcVar3.f28299c.mo8199s(materialManagedSwitchPreference12.f1590r, Boolean.valueOf(((TwoStatePreference) materialManagedSwitchPreference12).f1626a), obj3);
                            return true;
                        }
                    };
                    String string2 = activity.getResources().getString(C0100R.string.settings_impacted_button);
                    hmg hmgVar = new hmg(activity);
                    materialManagedSwitchPreference9.f7145g = string2;
                    materialManagedSwitchPreference9.f7146h = hmgVar;
                }
                Preference preferenceM1533l2 = preferenceScreen.m1533l("pref_free_up_space");
                if (preferenceM1533l2 != null) {
                    preferenceM1533l2.f1587o = new dmw(activity, 5);
                }
                kxk.m14975U(hmcVar2.f28302f.m10469b(hmcVar2.f28297a), new djq(hmcVar2, 14), hmcVar2.f28298b);
            }
            if (!r2.contains(gzy.f27054m.f26977a) && (materialManagedSwitchPreference2 = (MaterialManagedSwitchPreference) mo1723a(gzy.f27054m.f26977a)) != null) {
                materialManagedSwitchPreference2.f7147i = new ViewOnClickListenerC0250hu(this, 17);
            }
            PreferenceScreen preferenceScreen9 = (PreferenceScreen) mo1723a("pref_category_advanced");
            if (preferenceScreen9 != null) {
                if (preferenceScreen9.m1532k() <= 0) {
                    m7940G("pref_category_advanced");
                } else {
                    MaterialManagedSwitchPreference materialManagedSwitchPreference11 = (MaterialManagedSwitchPreference) preferenceScreen9.m1533l("pref_camera_raw_output_option_available_key");
                    if (materialManagedSwitchPreference11 != null) {
                        this.f20638ak.f25432a.mo6177e();
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setPackage("com.google.android.apps.photos");
                        intent.putExtra("android.intent.extra.FROM_STORAGE", true);
                        intent.setType("image/*");
                        materialManagedSwitchPreference11.m4424ai(getString(C0100R.string.pref_raw_output_control_action_button), new ewo(this, intent, 1));
                        materialManagedSwitchPreference11.f7143e = new ewi(this, 2);
                    }
                }
            }
            if (!r2.contains(gzy.f26989A.f26977a)) {
                MaterialManagedSwitchPreference materialManagedSwitchPreference12 = (MaterialManagedSwitchPreference) mo1723a(gzy.f26989A.f26977a);
                materialManagedSwitchPreference12.getClass();
                this.f20635ah = materialManagedSwitchPreference12;
            }
            mrm mrmVar = this.f20632ae.f20644f;
            if (!r2.contains("pref_camera_kepler_enabled_key") && mrmVar.mo16813g() && (materialManagedSwitchPreference = (MaterialManagedSwitchPreference) mo1723a("pref_camera_kepler_enabled_key")) != null) {
                materialManagedSwitchPreference.m1501S(C0100R.string.pref_kepler_title);
                materialManagedSwitchPreference.m1499Q(C0100R.string.pref_kepler_summary);
            }
            if (bundle2 != null && (string = bundle2.getString("pref_open_setting_page")) != null) {
                Preference preferenceMo1723a2 = mo1723a(string);
                if (preferenceMo1723a2 != null) {
                    mo1758z(preferenceMo1723a2);
                }
                if (bundle2.getBoolean("pref_make_setting_page_root")) {
                    activity.finish();
                }
            }
            ?? r0 = this.f20638ak.f25439h;
            for (String str2 : r0.mo16913r()) {
                PreferenceGroup preferenceGroup = (PreferenceGroup) mo1723a(str2);
                if (preferenceGroup != null) {
                    for (Preference preference2 : ((mtv) r0).mo16885b(str2)) {
                        preferenceGroup.m1531ak(preference2);
                        CharSequence charSequence = preference2.f1589q;
                    }
                }
            }
            Iterator it3 = this.f20638ak.f25435d.iterator();
            while (it3.hasNext()) {
                iee ieeVar = (iee) mo1723a((String) it3.next());
                if (ieeVar != null) {
                    ieeVar.mo4417ag(new cwp(this.f20632ae, i4));
                }
            }
            CameraMaterialSettingsActivity.m4196h(this.f20632ae.f20646h, mo1756c());
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onDestroy() {
        super.onDestroy();
        this.f20636ai.close();
    }

    @Override // p000.ComponentCallbacksC0077bw
    public final void onPause() {
        super.onPause();
        mo1756c().m1518r().unregisterOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, jww] */
    @Override // p000.ComponentCallbacksC0077bw
    public final void onResume() {
        super.onResume();
        ActivityC0080bz activity = getActivity();
        activity.getClass();
        m7941H("pref_category_advanced");
        m7941H("pref_category_gestures");
        m7941H("pref_category_developer");
        m7941H("pref_category_social_share");
        m7941H("pref_category_frequent_faces");
        m7941H("pref_category_storage");
        PreferenceScreen preferenceScreen = (PreferenceScreen) mo1723a("pref_category_frequent_faces");
        if (preferenceScreen != null) {
            C1058va c1058va = this.f20632ae.f20649k;
            preferenceScreen.mo1479n(((Context) c1058va.f47803b).getResources().getString(true != ((Boolean) c1058va.f47802a.mo3831be()).booleanValue() ? C0100R.string.frequent_faces_off : C0100R.string.frequent_faces_on));
        }
        if (!this.f20638ak.f25440i.contains("pref_category_custom_hotkeys")) {
            m7941H("pref_category_custom_hotkeys");
        }
        Preference preferenceMo1723a = mo1723a("pref_category_gestures");
        if (preferenceMo1723a != null) {
            preferenceMo1723a.mo1479n(mo1723a(gzy.f27049h.f26977a) != null ? getResources().getString(C0100R.string.pref_gestures_summary, getResources().getString(C0100R.string.pref_camera_volume_key_action_title), getResources().getString(C0100R.string.pref_camera_double_tap_action_title)) : getResources().getString(C0100R.string.pref_camera_volume_key_action_title));
        }
        Preference preferenceMo1723a2 = mo1723a("pref_category_storage");
        if (preferenceMo1723a2 != null) {
            preferenceMo1723a2.mo1479n(getResources().getString(C0100R.string.pref_storage_summary, getResources().getString(C0100R.string.pref_low_storage_mode), getResources().getString(C0100R.string.pref_free_up_space)));
        }
        ListPreference listPreference = (ListPreference) mo1723a(gzy.f27045d.f26977a);
        int i = 3;
        if (listPreference != null) {
            listPreference.mo1479n(listPreference.f1553g[listPreference.m1476k(listPreference.f1555i)]);
            listPreference.mo1497O(new ewi(this, i));
        }
        Preference preferenceMo1723a3 = mo1723a("pref_launch_help");
        if (preferenceMo1723a3 != null) {
            preferenceMo1723a3.f1587o = new dmw(activity, i);
        }
        Preference preferenceMo1723a4 = mo1723a("pref_launch_feedback");
        if (preferenceMo1723a4 != null) {
            preferenceMo1723a4.f1587o = new dmw(activity, 4);
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) mo1723a("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            Preference preferenceM1533l = preferenceCategory.m1533l("pref_camera_resolution");
            Preference preferenceM1533l2 = preferenceCategory.m1533l("pref_camera_selfie_mirror_key");
            preferenceCategory.m1527ag();
            if (preferenceM1533l != null) {
                preferenceCategory.m1531ak(preferenceM1533l);
            }
            if (preferenceM1533l2 != null) {
                preferenceCategory.m1531ak(preferenceM1533l2);
            }
        }
        mo1756c().m1518r().registerOnSharedPreferenceChangeListener(this);
        if (!m7943D()) {
            m7942C();
        }
        MaterialManagedSwitchPreference materialManagedSwitchPreference = this.f20635ah;
        if (materialManagedSwitchPreference != null) {
            materialManagedSwitchPreference.m1493K(true);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ListPreference listPreference;
        Preference preferenceMo1723a;
        ListPreference listPreference2;
        if (this.f20638ak.f25440i.contains("pref_category_custom_hotkeys")) {
            return;
        }
        if (this.f20637aj.containsKey(str) && (preferenceMo1723a = mo1723a(str)) != null) {
            String string = preferenceMo1723a.m1518r().getString(str, "-1");
            this.f20637aj.put(str, string);
            int i = Integer.parseInt(string);
            if ((i == 24 || i == 25) && (listPreference2 = (ListPreference) mo1723a(gzy.f27051j.f26977a)) != null) {
                listPreference2.m1480o(getResources().getString(C0100R.string.preference_volume_key_off));
            }
            if (!string.equals("-1") && this.f20637aj.containsValue(string)) {
                HashMap map = new HashMap();
                for (String str2 : this.f20637aj.keySet()) {
                    if (!str2.equals(str) && ((String) this.f20637aj.get(str2)).equals(string)) {
                        map.put(str2, "-1");
                        MaterialKeyListenerPreference materialKeyListenerPreference = (MaterialKeyListenerPreference) mo1723a(str2);
                        if (materialKeyListenerPreference != null) {
                            materialKeyListenerPreference.m4419k("-1");
                        }
                    }
                }
                this.f20637aj.putAll(map);
            }
        }
        if (!str.equals(gzy.f27051j.f26977a) || (listPreference = (ListPreference) mo1723a(str)) == null || listPreference.f1555i.equals(getResources().getString(C0100R.string.preference_volume_key_off))) {
            return;
        }
        HashMap map2 = new HashMap();
        for (String str3 : this.f20637aj.keySet()) {
            int i2 = Integer.parseInt((String) this.f20637aj.get(str3));
            if (i2 == 25 || i2 == 24) {
                map2.put(str3, "-1");
                MaterialKeyListenerPreference materialKeyListenerPreference2 = (MaterialKeyListenerPreference) mo1723a(str3);
                if (materialKeyListenerPreference2 != null) {
                    materialKeyListenerPreference2.m4419k("-1");
                }
            }
        }
        this.f20637aj.putAll(map2);
    }
}
