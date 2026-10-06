package com.google.android.apps.camera.legacy.app.settings;

import android.app.Activity;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceGroup;
import android.preference.TwoStatePreference;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.legacy.app.app.CameraApp;
import p000.AbstractC0146dy;
import p000.C0186fk;
import p000.C0192fq;
import p000.LayoutInflaterFactory2C0179fd;
import p000.chx;
import p000.ero;
import p000.eso;
import p000.esz;
import p000.ewl;
import p000.ewm;
import p000.ewp;
import p000.fav;
import p000.fcp;
import p000.kbz;
import p000.mhq;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraSettingsActivity extends ero {

    /* JADX INFO: renamed from: t */
    public static final nbh f6796t = nbh.m17259h("com/google/android/apps/camera/legacy/app/settings/CameraSettingsActivity");

    /* JADX INFO: renamed from: u */
    private final Object f6797u = new Object();

    /* JADX INFO: renamed from: v */
    private ewp f6798v;

    /* JADX INFO: renamed from: w */
    private boolean f6799w;

    /* JADX INFO: renamed from: q */
    public static void m4200q(fcp fcpVar, Preference preference) {
        Object value;
        if (preference.getKey().equals("pref_category_developer")) {
            return;
        }
        int i = 0;
        if (preference instanceof PreferenceGroup) {
            PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
            while (i < preferenceGroup.getPreferenceCount()) {
                m4200q(fcpVar, preferenceGroup.getPreference(i));
                i++;
            }
            return;
        }
        if (preference.getOnPreferenceChangeListener() == null) {
            if (preference instanceof TwoStatePreference) {
                value = Boolean.valueOf(((TwoStatePreference) preference).isChecked());
            } else if (!(preference instanceof ListPreference)) {
                return;
            } else {
                value = ((ListPreference) preference).getValue();
            }
            preference.setOnPreferenceChangeListener(new ewl(fcpVar, value, i));
        }
    }

    @Override // p000.ero, p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, p000.ActivityC0136do, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (!this.f6799w) {
            synchronized (this.f6797u) {
                if (!this.f6799w) {
                    eso esoVarMo4194f = ((CameraApp) getApplicationContext()).mo4194f();
                    ((ero) this).f15254q = (kbz) ((esz) esoVarMo4194f).f16747h.get();
                    this.f15256s = (chx) ((esz) esoVarMo4194f).f17299z.get();
                    this.f15255r = fav.m8088b(((esz) esoVarMo4194f).f16770hW);
                    this.f6799w = true;
                }
            }
        }
        super.onCreate(bundle);
        mhq.m16381a(this);
        setContentView(C0100R.layout.settings_activity_layout);
        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
        String stringExtra = getIntent().getStringExtra("pref_screen_title");
        Toolbar toolbar = (Toolbar) findViewById(C0100R.id.toolbar);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = (LayoutInflaterFactory2C0179fd) m7343j();
        if (layoutInflaterFactory2C0179fd.f21373h instanceof Activity) {
            AbstractC0146dy abstractC0146dyMo7433b = layoutInflaterFactory2C0179fd.mo7433b();
            if (abstractC0146dyMo7433b instanceof C0192fq) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            layoutInflaterFactory2C0179fd.f21378m = null;
            if (abstractC0146dyMo7433b != null) {
                abstractC0146dyMo7433b.mo6898e();
            }
            layoutInflaterFactory2C0179fd.f21377l = null;
            if (toolbar != null) {
                C0186fk c0186fk = new C0186fk(toolbar, layoutInflaterFactory2C0179fd.m8255v(), layoutInflaterFactory2C0179fd.f21376k);
                layoutInflaterFactory2C0179fd.f21377l = c0186fk;
                layoutInflaterFactory2C0179fd.f21376k.f20277d = c0186fk.f22356d;
                if (!toolbar.f1205A) {
                    toolbar.f1205A = true;
                    toolbar.m1353u();
                }
            } else {
                layoutInflaterFactory2C0179fd.f21376k.f20277d = null;
            }
            layoutInflaterFactory2C0179fd.mo7437f();
        }
        AbstractC0146dy abstractC0146dyM7342i = m7342i();
        abstractC0146dyM7342i.getClass();
        abstractC0146dyM7342i.mo6900g(true);
        abstractC0146dyM7342i.mo6912s();
        if (stringExtra == null) {
            setTitle(C0100R.string.pref_camera_settings_category);
            abstractC0146dyM7342i.mo6914u();
        } else {
            setTitle(stringExtra);
            abstractC0146dyM7342i.mo6902i(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("pref_screen_extra");
        String stringExtra3 = getIntent().getStringExtra("pref_open_setting_page");
        boolean booleanExtra = getIntent().getBooleanExtra("pref_make_setting_page_root", false);
        this.f6798v = new ewp();
        Bundle bundle2 = new Bundle(1);
        bundle2.putString("pref_screen_extra", stringExtra2);
        bundle2.putString("pref_open_setting_page", stringExtra3);
        bundle2.putBoolean("pref_make_setting_page_root", booleanExtra);
        this.f6798v.setArguments(bundle2);
        getFragmentManager().beginTransaction().replace(C0100R.id.settings_activity_content, this.f6798v).commit();
        this.f47426g.m19328a(new ewm(this));
    }

    @Override // p000.fbs, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if ((getIntent().getFlags() & 33554432) != 0) {
                setResult(-1);
            }
            finish();
        }
        return true;
    }

    @Override // p000.fbs, p000.ActivityC0080bz, p000.ActivityC0907pl, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 1) {
            for (int i2 : iArr) {
                if (i2 == 0) {
                    return;
                }
            }
            ewp ewpVar = this.f6798v;
            int i3 = ewp.f20659c;
            ewpVar.m7949a();
        }
    }
}
