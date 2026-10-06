package p000;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceFragment;
import android.preference.PreferenceGroup;
import android.preference.PreferenceScreen;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.settings.CameraSettingsActivity;
import com.google.android.apps.camera.p014ui.preference.KeyListenerPreference;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.StorageStatusPreference;
import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ewp extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f20659c = 0;

    /* JADX INFO: renamed from: a */
    public ManagedSwitchPreference f20660a;

    /* JADX INFO: renamed from: b */
    public gva f20661b;

    /* JADX INFO: renamed from: d */
    private ewq f20662d;

    /* JADX INFO: renamed from: e */
    private String f20663e;

    /* JADX INFO: renamed from: f */
    private ManagedSwitchPreference f20664f;

    /* JADX INFO: renamed from: g */
    private jvb f20665g;

    /* JADX INFO: renamed from: h */
    private final HashMap f20666h = new HashMap();

    /* JADX INFO: renamed from: c */
    private final PreferenceScreen m7944c(PreferenceGroup preferenceGroup, String str) {
        PreferenceScreen preferenceScreenM7944c;
        if ((preferenceGroup instanceof PreferenceScreen) && str.equals(preferenceGroup.getKey())) {
            return (PreferenceScreen) preferenceGroup;
        }
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if ((preference instanceof PreferenceGroup) && (preferenceScreenM7944c = m7944c((PreferenceGroup) preference, str)) != null) {
                return preferenceScreenM7944c;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m7945d(PreferenceGroup preferenceGroup) {
        for (int i = 0; i < preferenceGroup.getPreferenceCount(); i++) {
            Preference preference = preferenceGroup.getPreference(i);
            if (preference instanceof PreferenceGroup) {
                m7945d((PreferenceGroup) preference);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m7946e(String str) {
        PreferenceGroup parent;
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference == null || (parent = preferenceFindPreference.getParent()) == null || parent.removePreference(preferenceFindPreference)) {
            return;
        }
        ((nbe) ((nbe) CameraSettingsActivity.f6796t.m17252c()).mo17276G((char) 2014)).mo17293r("Failed to remove preference :%s", str);
    }

    /* JADX INFO: renamed from: f */
    private final void m7947f(PreferenceScreen preferenceScreen) {
        Intent intent = new Intent(getActivity(), (Class<?>) CameraSettingsActivity.class);
        intent.putExtra("pref_screen_extra", preferenceScreen.getKey());
        intent.putExtra("pref_screen_title", preferenceScreen.getTitle());
        preferenceScreen.setIntent(intent);
    }

    /* JADX INFO: renamed from: g */
    private final void m7948g(String str) {
        Preference preferenceFindPreference = findPreference(str);
        if (preferenceFindPreference instanceof PreferenceScreen) {
            m7947f((PreferenceScreen) preferenceFindPreference);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m7949a() {
        ((had) this.f20661b.f26479j).mo10045l(gzy.f27043b.f26977a, false);
        this.f20660a.setChecked(false);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m7950b() {
        return getActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0 || getActivity().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    @Override // android.preference.PreferenceFragment
    public final PreferenceScreen getPreferenceScreen() {
        PreferenceScreen preferenceScreen = super.getPreferenceScreen();
        String str = this.f20663e;
        if (str == null || preferenceScreen == null) {
            return preferenceScreen;
        }
        PreferenceScreen preferenceScreenM7944c = m7944c(preferenceScreen, str);
        if (preferenceScreenM7944c != null) {
            return preferenceScreenM7944c;
        }
        throw new RuntimeException("key " + this.f20663e + " not found");
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        PreferenceScreen preferenceScreen;
        m7945d((PreferenceCategory) findPreference("pref_category_resolution_camera"));
        m7945d((PreferenceCategory) findPreference("pref_category_resolution_video"));
        if (!this.f20662d.f20676j.contains("pref_category_custom_hotkeys") && (preferenceScreen = (PreferenceScreen) findPreference("pref_category_custom_hotkeys")) != null) {
            for (int i = 0; i < preferenceScreen.getPreferenceCount(); i++) {
                Preference preference = preferenceScreen.getPreference(i);
                String string = preference.getSharedPreferences().getString(preference.getKey(), "-1");
                if (!this.f20666h.containsKey(preference.getKey())) {
                    this.f20666h.put(preference.getKey(), string);
                }
            }
        }
        View view = getView();
        view.getClass();
        ((ListView) view.findViewById(R.id.list)).setDivider(null);
        super.onActivityCreated(bundle);
    }

    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, myv] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v18, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v69, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v89, types: [dhv, java.lang.Object] */
    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onCreate(Bundle bundle) {
        int i;
        String string;
        int i2;
        String str;
        PreferenceScreen preferenceScreen;
        eso esoVarMo4194f = ((etq) getActivity().getApplication()).mo4194f();
        super.onCreate(bundle);
        this.f20665g = new jvb();
        ewr ewrVarMo7786j = esoVarMo4194f.mo7786j(new cwd(getContext(), (byte[]) null));
        this.f20662d = ewrVarMo7786j.mo7844a();
        etb etbVar = (etb) ewrVarMo7786j;
        dmu dmuVar = new dmu(dws.m6828b(etbVar.f17319f), (dhv) etbVar.f17314a.f16641f.get());
        hgx hgxVar = new hgx(dws.m6828b(etbVar.f17319f), etbVar.f17314a.m7819n(), (had) etbVar.f17314a.f17293t.get(), (hah) etbVar.f17314a.f16353D.get(), (hai) etbVar.f17314a.f16353D.get(), (hgy) etbVar.f17314a.f16726gf.get(), (fcp) etbVar.f17314a.f17277r.get());
        fcp fcpVar = (fcp) etbVar.f17314a.f17277r.get();
        jww jwwVar = (jww) etbVar.f17314a.f16501cS.get();
        esz eszVar = etbVar.f17314a;
        djm djmVar = new djm((Context) eszVar.f16769hV.f26335b, (jww) eszVar.f16443bN.get(), (fcp) etbVar.f17314a.f17277r.get(), (dhv) etbVar.f17314a.f16641f.get());
        ljf ljfVarM9610d = gpm.m9610d((jww) etbVar.f17314a.f16501cS.get(), (jww) etbVar.f17314a.f16642fA.get(), (jww) etbVar.f17314a.f16419aq.get(), (har) etbVar.f17314a.f16735go.get(), (djm) etbVar.f17314a.f16733gm.get(), (hah) etbVar.f17314a.f16353D.get(), (hai) etbVar.f17314a.f16353D.get());
        hmr hmrVar = (hmr) etbVar.f17314a.f16550dO.get();
        drj drjVar = new drj((jww) etbVar.f17314a.f16501cS.get(), (jww) etbVar.f17314a.f16642fA.get(), (har) etbVar.f17314a.f16735go.get(), (djm) etbVar.f17314a.f16733gm.get(), (hah) etbVar.f17314a.f16353D.get(), null, null, null);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) etbVar.f17314a.f16694g.get();
        jvd jvdVar = (jvd) etbVar.f17314a.f16959l.get();
        fcp fcpVar2 = (fcp) etbVar.f17314a.f17277r.get();
        this.f20661b = new gva(dmuVar, hgxVar, fcpVar, jwwVar, djmVar, new hmk(ljfVarM9610d, hmrVar, drjVar, scheduledExecutorService, jvdVar, fcpVar2, null, null, null), ohh.m18485a(etbVar.f17315b), (had) etbVar.f17314a.f17293t.get(), etbVar.f17314a.m7818m(), (mrm) etbVar.f17316c.get(), (mrm) etbVar.f17317d.get(), (mrm) etbVar.f17318e.get(), null, null);
        this.f20662d.m7953a(getContext());
        ?? r1 = this.f20662d.f20676j;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f20663e = arguments.getString("pref_screen_extra");
        }
        addPreferencesFromResource(C0100R.xml.camera_preferences);
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("prefscreen_top");
        naz nazVarListIterator = ((mzx) this.f20662d.f20672f).listIterator();
        while (true) {
            i = 1;
            if (!nazVarListIterator.hasNext()) {
                break;
            }
            hbb hbbVar = (hbb) nazVarListIterator.next();
            PreferenceCategory preferenceCategory = new PreferenceCategory(preferenceScreen2.getContext());
            preferenceCategory.setTitle(hbbVar.m10059b());
            preferenceCategory.setKey(hbbVar.m10060c());
            preferenceCategory.setOrder(hbbVar.m10058a());
            preferenceCategory.setLayoutResource(C0100R.layout.preference_category_layout);
            preferenceCategory.setOrderingAsAdded(true);
            preferenceScreen2.addPreference(preferenceCategory);
            if (hbbVar.m10058a() < 0) {
                findPreference("pref_category_general").setLayoutResource(C0100R.layout.preference_category_layout);
            }
            for (hbc hbcVar : hbbVar.m10061d()) {
                Preference preference = new Preference(preferenceCategory.getContext());
                preference.setTitle(hbcVar.m10063b());
                preference.setKey(hbcVar.m10065d());
                preference.setSummary(hbcVar.m10066e());
                preference.setIcon(hbcVar.m10062a());
                Intent intentM10064c = hbcVar.m10064c();
                if (intentM10064c != null) {
                    preference.setIntent(intentM10064c);
                }
                preference.setLayoutResource(C0100R.layout.preference_with_margin);
                preferenceCategory.addPreference(preference);
            }
        }
        Iterator it = this.f20662d.f20675i.iterator();
        while (it.hasNext()) {
            this.f20665g.m13537d((kba) it.next());
        }
        int i3 = 2;
        if (!r1.contains("pref_audio_zoom_key")) {
            ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) findPreference("pref_audio_zoom_key");
            managedSwitchPreference.f7110c = new ewl(this, managedSwitchPreference, i3);
        }
        if (!r1.contains("pref_camera_enable_iris")) {
            ((ManagedSwitchPreference) findPreference("pref_camera_enable_iris")).setSummary(getString(C0100R.string.pref_camera_lens_subtitle_legacy));
        }
        if (!r1.contains(gzy.f27053l.f26977a)) {
            ((ManagedSwitchPreference) findPreference(gzy.f27053l.f26977a)).setSummary(getString(C0100R.string.pref_camera_catcher_summary));
        }
        ManagedSwitchPreference managedSwitchPreference2 = (ManagedSwitchPreference) findPreference(gzy.f27043b.f26977a);
        this.f20660a = managedSwitchPreference2;
        int i4 = 0;
        managedSwitchPreference2.f7110c = new ewn(this, i4);
        Iterator it2 = r1.iterator();
        while (it2.hasNext()) {
            m7946e((String) it2.next());
        }
        if (!r1.contains("pref_category_developer")) {
            ((dmu) this.f20661b.f26471b).m6411a((PreferenceScreen) findPreference("pref_category_developer"));
        }
        if (!r1.contains("pref_category_social_share") && (str = this.f20663e) != null && str.equals("pref_category_social_share") && (preferenceScreen = (PreferenceScreen) findPreference("pref_category_social_share")) != null) {
            hgx hgxVar2 = (hgx) this.f20661b.f26472c;
            hgxVar2.f27768m = preferenceScreen;
            hgxVar2.m10260e();
            ManagedSwitchPreference managedSwitchPreference3 = (ManagedSwitchPreference) preferenceScreen.findPreference(gzy.f27004P.f26977a);
            int i5 = 3;
            if (managedSwitchPreference3 != null) {
                boolean zBooleanValue = ((Boolean) hgxVar2.f27759d.mo10031c(gzy.f27004P)).booleanValue();
                managedSwitchPreference3.setTitle(hgxVar2.m10259d(zBooleanValue));
                int iM15025r = kxk.m15025r(hgxVar2.f27756a, C0100R.attr.colorOnPrimary, -1);
                managedSwitchPreference3.f7114g = Integer.valueOf(iM15025r);
                managedSwitchPreference3.f7111d = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{iM15025r, iM15025r});
                managedSwitchPreference3.f7112e = new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{R.attr.state_checked}}, new int[]{iM15025r, iM15025r});
                managedSwitchPreference3.f7113f = Integer.valueOf(hgxVar2.m10257b());
                managedSwitchPreference3.setChecked(zBooleanValue);
                managedSwitchPreference3.f7110c = new ewl(hgxVar2, managedSwitchPreference3, i5);
            }
            Preference preferenceFindPreference = preferenceScreen.findPreference("key_social_share_info");
            if (preferenceFindPreference != null) {
                preferenceFindPreference.setSummary(jvh.m13549G(C0100R.plurals.social_share_info, 3, 3).mo11322a(hgxVar2.f27756a.getResources()));
            }
            nod.m17553i(kxk.m14970P(new cnn(hgxVar2, nod.m17553i(hgxVar2.m10258c(), new etx(hgxVar2, 20), jvh.m13554b()), 5), hgxVar2.f27757b), new dvz(hgxVar2, preferenceScreen, 8), jvh.m13554b());
        }
        String str2 = yTyWiTtGtnBhy.djSYrXhC;
        if (!r1.contains(str2)) {
            PreferenceScreen preferenceScreen3 = (PreferenceScreen) findPreference(str2);
            Object obj = this.f20661b.f26473d;
            Activity activity = getActivity();
            ManagedSwitchPreference managedSwitchPreference4 = (ManagedSwitchPreference) preferenceScreen3.findPreference("key_ff_opt_in");
            if (managedSwitchPreference4 != null) {
                djm djmVar2 = (djm) obj;
                managedSwitchPreference4.setChecked(((Boolean) djmVar2.f11788b.mo3831be()).booleanValue());
                byte[] bArr = null;
                managedSwitchPreference4.f7110c = new ewn(djmVar2, i, bArr, bArr);
                managedSwitchPreference4.m4416b(((Context) djmVar2.f11787a).getResources().getString(C0100R.string.frequent_faces_learn_more), new drs(activity, 11));
            }
        }
        if (!r1.contains("pref_category_storage")) {
            PreferenceScreen preferenceScreen4 = (PreferenceScreen) findPreference("pref_category_storage");
            preferenceScreen4.setOnPreferenceClickListener(new dmt(this, 4));
            Object obj2 = this.f20661b.f26475f;
            Activity activity2 = getActivity();
            final hmk hmkVar = (hmk) obj2;
            hmkVar.f28324d = (StorageStatusPreference) preferenceScreen4.findPreference("pref_storage_status");
            hmkVar.f28324d.setLayoutResource(C0100R.layout.preference_storage_status);
            final ManagedSwitchPreference managedSwitchPreference5 = (ManagedSwitchPreference) preferenceScreen4.findPreference(gzy.f27010V.f26977a);
            final ManagedSwitchPreference managedSwitchPreference6 = (ManagedSwitchPreference) preferenceScreen4.findPreference(gzy.f27011W.f26977a);
            managedSwitchPreference6.setSummary(activity2.getResources().getString(C0100R.string.pref_low_storage_mode_auto_disable_summary, 1));
            managedSwitchPreference6.setEnabled(managedSwitchPreference5.isChecked());
            managedSwitchPreference5.f7110c = new Preference.OnPreferenceChangeListener() { // from class: hmj
                @Override // android.preference.Preference.OnPreferenceChangeListener
                public final boolean onPreferenceChange(Preference preference2, Object obj3) {
                    hmk hmkVar2 = hmkVar;
                    ManagedSwitchPreference managedSwitchPreference7 = managedSwitchPreference6;
                    ManagedSwitchPreference managedSwitchPreference8 = managedSwitchPreference5;
                    if (Boolean.TRUE.equals(obj3)) {
                        hmkVar2.f28327g.m15529e();
                        managedSwitchPreference7.setEnabled(true);
                    } else {
                        hmkVar2.f28327g.m15528d();
                        managedSwitchPreference7.setEnabled(false);
                    }
                    hmkVar2.m10459b();
                    hmkVar2.f28323c.mo8199s(managedSwitchPreference8.getKey(), Boolean.valueOf(managedSwitchPreference8.isChecked()), obj3);
                    return true;
                }
            };
            String string2 = activity2.getResources().getString(C0100R.string.settings_impacted_button);
            hmg hmgVar = new hmg(activity2);
            managedSwitchPreference5.f7117j = string2;
            managedSwitchPreference5.f7119l = hmgVar;
            preferenceScreen4.findPreference("pref_free_up_space").setOnPreferenceClickListener(new dmt(activity2, 5));
            kxk.m14975U(hmkVar.f28326f.m10469b(hmkVar.f28321a), new djq(hmkVar, 15), hmkVar.f28322b);
        }
        if (!r1.contains(gzy.f27054m.f26977a)) {
            ((ManagedSwitchPreference) findPreference(gzy.f27054m.f26977a)).f7120m = new ViewOnClickListenerC0250hu(this, 18);
        }
        if (!r1.contains("pref_chameleon_control_key")) {
            ((ManagedSwitchPreference) findPreference("pref_chameleon_control_key")).f7120m = new ViewOnClickListenerC0250hu(this, 19);
        }
        if (!r1.contains(gzy.f27055n.f26977a)) {
            ((ManagedSwitchPreference) findPreference(gzy.f27055n.f26977a)).f7120m = new ViewOnClickListenerC0250hu(this, 20);
        }
        PreferenceScreen preferenceScreen5 = (PreferenceScreen) findPreference("pref_category_advanced");
        if (preferenceScreen5.getPreferenceCount() <= 0) {
            m7946e("pref_category_advanced");
        } else {
            ManagedSwitchPreference managedSwitchPreference7 = (ManagedSwitchPreference) preferenceScreen5.findPreference("pref_camera_raw_output_option_available_key");
            if (managedSwitchPreference7 != null) {
                ?? r5 = this.f20662d.f20667a;
                dhx dhxVar = dib.f11240a;
                r5.mo6177e();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setPackage("com.google.android.apps.photos");
                intent.putExtra("android.intent.extra.FROM_STORAGE", true);
                intent.setType("image/*");
                managedSwitchPreference7.m4416b(getString(C0100R.string.pref_raw_output_control_action_button), new ewo(this, intent, 0));
                managedSwitchPreference7.f7110c = new ewn(this, i3);
            }
        }
        if (!r1.contains(gzy.f26989A.f26977a)) {
            this.f20664f = (ManagedSwitchPreference) findPreference(gzy.f26989A.f26977a);
        }
        Object obj3 = this.f20661b.f26470a;
        if (!r1.contains("pref_camera_kepler_enabled_key")) {
            mrm mrmVar = (mrm) obj3;
            if (mrmVar.mo16813g()) {
                ManagedSwitchPreference managedSwitchPreference8 = (ManagedSwitchPreference) findPreference("pref_camera_kepler_enabled_key");
                managedSwitchPreference8.setTitle(C0100R.string.pref_kepler_title);
                managedSwitchPreference8.setSummary(C0100R.string.pref_kepler_summary);
            }
        }
        if (arguments != null && (string = arguments.getString("pref_open_setting_page")) != null) {
            PreferenceScreen preferenceScreen6 = (PreferenceScreen) findPreference("prefscreen_top");
            Preference preferenceFindPreference2 = findPreference(string);
            if (preferenceFindPreference2 != null) {
                ListAdapter rootAdapter = getPreferenceScreen().getRootAdapter();
                while (true) {
                    if (i4 >= rootAdapter.getCount()) {
                        i2 = -1;
                        break;
                    } else {
                        if (((Preference) rootAdapter.getItem(i4)).getKey().equals(string)) {
                            i2 = i4;
                            break;
                        }
                        i4++;
                    }
                }
                if (i2 != -1) {
                    PreferenceScreen preferenceScreen7 = (PreferenceScreen) preferenceFindPreference2;
                    m7947f(preferenceScreen7);
                    Intent intent2 = preferenceScreen7.getIntent();
                    if (getActivity().getCallingActivity() != null) {
                        intent2.setFlags(33554432);
                    }
                    preferenceScreen7.setIntent(intent2);
                    preferenceScreen6.onItemClick(null, null, i2, 0L);
                }
            }
            if (arguments.getBoolean("pref_make_setting_page_root")) {
                getActivity().finish();
            }
        }
        ?? r2 = this.f20662d.f20680n;
        for (String str3 : r2.mo16913r()) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) findPreference(str3);
            for (Preference preference2 : ((mtv) r2).mo16885b(str3)) {
                if (preferenceGroup.addPreference(preference2)) {
                    preference2.getTitle();
                } else {
                    ((nbe) ((nbe) CameraSettingsActivity.f6796t.m17252c()).mo17276G((char) 2013)).mo17293r("Could not add %s", preference2.getTitle());
                }
            }
        }
        Iterator it3 = this.f20662d.f20677k.iterator();
        while (it3.hasNext()) {
            idx idxVar = (idx) findPreference((String) it3.next());
            if (idxVar != null) {
                idxVar.mo4410a(new cwp(this.f20661b, 13, null));
            }
        }
        CameraSettingsActivity.m4200q(this.f20661b.f26481l, getPreferenceScreen());
    }

    @Override // android.preference.PreferenceFragment, android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f20665g.close();
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, jww] */
    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        Activity activity = getActivity();
        m7948g("pref_category_advanced");
        m7948g("pref_category_gestures");
        m7948g("pref_category_developer");
        m7948g("pref_category_social_share");
        m7948g("pref_category_frequent_faces");
        m7948g("pref_category_storage");
        PreferenceScreen preferenceScreen = (PreferenceScreen) findPreference("pref_category_social_share");
        int i = 2;
        if (preferenceScreen != null) {
            hgx hgxVar = (hgx) this.f20661b.f26472c;
            hgxVar.m10260e();
            nod.m17553i(((Boolean) hgxVar.f27759d.mo10031c(gzy.f27004P)).booleanValue() ? nod.m17553i(nod.m17553i(hgxVar.m10258c(), new hgv(hgxVar, 0), jvh.m13554b()), new hgv(hgxVar, 1), jvh.m13554b()) : kxk.m14965K(hgxVar.f27756a.getResources().getString(C0100R.string.social_share_off)), new etx(preferenceScreen, i), jvh.m13554b());
        }
        PreferenceScreen preferenceScreen2 = (PreferenceScreen) findPreference("pref_category_frequent_faces");
        if (preferenceScreen2 != null) {
            djm djmVar = (djm) this.f20661b.f26473d;
            preferenceScreen2.setSummary(((Context) djmVar.f11787a).getResources().getString(true != ((Boolean) djmVar.f11788b.mo3831be()).booleanValue() ? C0100R.string.frequent_faces_off : C0100R.string.frequent_faces_on));
        }
        if (!this.f20662d.f20676j.contains("pref_category_custom_hotkeys")) {
            m7948g("pref_category_custom_hotkeys");
        }
        findPreference("pref_category_gestures").setSummary(findPreference(gzy.f27049h.f26977a) != null ? getResources().getString(C0100R.string.pref_gestures_summary, getResources().getString(C0100R.string.pref_camera_volume_key_action_title), getResources().getString(C0100R.string.pref_camera_double_tap_action_title)) : getResources().getString(C0100R.string.pref_camera_volume_key_action_title));
        Preference preferenceFindPreference = findPreference("pref_category_storage");
        if (preferenceFindPreference != null) {
            preferenceFindPreference.setSummary(getResources().getString(C0100R.string.pref_storage_summary, getResources().getString(C0100R.string.pref_low_storage_mode), getResources().getString(C0100R.string.pref_free_up_space)));
        }
        ListPreference listPreference = (ListPreference) findPreference(gzy.f27045d.f26977a);
        listPreference.setSummary(listPreference.getEntries()[listPreference.findIndexOfValue(listPreference.getValue())]);
        int i2 = 3;
        listPreference.setOnPreferenceChangeListener(new ewn(this, i2));
        findPreference("pref_launch_help").setOnPreferenceClickListener(new dmt(activity, i));
        Preference preferenceFindPreference2 = findPreference("pref_launch_feedback");
        if (preferenceFindPreference2 != null) {
            preferenceFindPreference2.setOnPreferenceClickListener(new dmt(activity, i2));
        }
        PreferenceCategory preferenceCategory = (PreferenceCategory) findPreference("pref_category_resolution_camera");
        if (preferenceCategory != null) {
            Preference preferenceFindPreference3 = preferenceCategory.findPreference("pref_camera_resolution");
            Preference preferenceFindPreference4 = preferenceCategory.findPreference("pref_camera_selfie_mirror_key");
            Preference preferenceFindPreference5 = preferenceCategory.findPreference(gzy.f27056o.f26977a);
            preferenceCategory.removeAll();
            if (preferenceFindPreference3 != null) {
                preferenceCategory.addPreference(preferenceFindPreference3);
            }
            if (preferenceFindPreference4 != null) {
                preferenceCategory.addPreference(preferenceFindPreference4);
            }
            if (preferenceFindPreference5 != null) {
                preferenceCategory.addPreference(preferenceFindPreference5);
            }
        }
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
        if (!m7950b()) {
            m7949a();
        }
        ManagedSwitchPreference managedSwitchPreference = this.f20664f;
        if (managedSwitchPreference != null) {
            managedSwitchPreference.setEnabled(true);
        }
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, java.util.List] */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if (this.f20662d.f20676j.contains("pref_category_custom_hotkeys")) {
            return;
        }
        if (this.f20666h.containsKey(str)) {
            String string = findPreference(str).getSharedPreferences().getString(str, "-1");
            this.f20666h.put(str, string);
            int i = Integer.parseInt(string);
            if (i == 24 || i == 25) {
                ((ListPreference) findPreference(gzy.f27051j.f26977a)).setValue(getResources().getString(C0100R.string.preference_volume_key_off));
            }
            if (!string.equals("-1") && this.f20666h.containsValue(string)) {
                HashMap map = new HashMap();
                for (String str2 : this.f20666h.keySet()) {
                    if (!str2.equals(str) && ((String) this.f20666h.get(str2)).equals(string)) {
                        map.put(str2, "-1");
                        ((KeyListenerPreference) findPreference(str2)).m4413b("-1");
                    }
                }
                this.f20666h.putAll(map);
            }
        }
        if (!str.equals(gzy.f27051j.f26977a) || ((ListPreference) findPreference(str)).getValue().equals(getResources().getString(C0100R.string.preference_volume_key_off))) {
            return;
        }
        HashMap map2 = new HashMap();
        for (String str3 : this.f20666h.keySet()) {
            int i2 = Integer.parseInt((String) this.f20666h.get(str3));
            if (i2 == 25 || i2 == 24) {
                map2.put(str3, "-1");
                ((KeyListenerPreference) findPreference(str3)).m4413b("-1");
            }
        }
        this.f20666h.putAll(map2);
    }
}
