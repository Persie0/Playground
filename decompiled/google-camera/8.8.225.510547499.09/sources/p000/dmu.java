package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.EditTextPreference;
import android.preference.Preference;
import android.preference.PreferenceCategory;
import android.preference.PreferenceManager;
import android.preference.PreferenceScreen;
import android.widget.SearchView;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmu {

    /* JADX INFO: renamed from: a */
    public final Context f12053a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f12054b;

    /* JADX INFO: renamed from: c */
    public PreferenceScreen f12055c;

    /* JADX INFO: renamed from: d */
    public final List f12056d = new ArrayList();

    /* JADX INFO: renamed from: e */
    private final dhv f12057e;

    public dmu(Context context, dhv dhvVar) {
        C0931qi c0931qi = new C0931qi(context, C0100R.style.Theme_CameraSettings);
        this.f12053a = c0931qi;
        this.f12054b = PreferenceManager.getDefaultSharedPreferences(c0931qi);
        this.f12057e = dhvVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m6411a(PreferenceScreen preferenceScreen) {
        this.f12055c = preferenceScreen;
        Preference preference = new Preference(this.f12053a);
        preference.setTitle(aJFPpVSaoDO.owtuTdm);
        int i = 1;
        preference.setOnPreferenceClickListener(new dmt(this, i));
        this.f12055c.addPreference(preference);
        Preference preference2 = new Preference(this.f12053a);
        preference2.setTitle("Primes Log");
        preference2.setOnPreferenceClickListener(new dmt(this, 0));
        this.f12055c.addPreference(preference2);
        String string = this.f12054b.getString("dev_setting_filter_key", "");
        dmz dmzVar = new dmz(this.f12055c.getContext());
        dmzVar.f12069c = string;
        SearchView searchView = dmzVar.f12067a;
        if (searchView != null) {
            searchView.setQuery(string, true);
        }
        dmzVar.f12068b = new dmx(this, 1);
        this.f12055c.addPreference(dmzVar);
        this.f12056d.clear();
        EditTextPreference editTextPreference = new EditTextPreference(this.f12055c.getContext());
        editTextPreference.setTitle("camera.onscreen_logcat_filter");
        editTextPreference.setLayoutResource(C0100R.layout.preference_with_margin);
        this.f12056d.add(new dsx(editTextPreference));
        String string2 = this.f12054b.contains("camera.onscreen_logcat_filter") ? this.f12054b.getString("camera.onscreen_logcat_filter", "Gca") : "Gca";
        editTextPreference.setText(string2);
        editTextPreference.setSummary(string2);
        editTextPreference.setOnPreferenceChangeListener(new ewl(this, i));
        PreferenceCategory preferenceCategory = new PreferenceCategory(this.f12053a);
        dhv dhvVar = this.f12057e;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6175c();
        preferenceCategory.setLayoutResource(C0100R.layout.preference_category_layout);
        preferenceScreen.addPreference(preferenceCategory);
        Collections.sort(this.f12056d, amx.f740d);
        String[] strArrSplit = this.f12054b.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (dsx dsxVar : this.f12056d) {
            for (String str : strArrSplit) {
                if (((String) dsxVar.f12521a).contains(str)) {
                    preferenceCategory.addPreference((Preference) dsxVar.f12522b);
                    break;
                }
            }
        }
        Preference preferenceFindPreference = this.f12055c.findPreference(dib.f11258aR.f11210a);
        Preference preferenceFindPreference2 = this.f12055c.findPreference(dib.f11257aQ.f11210a);
        if (preferenceFindPreference2 != null && preferenceFindPreference != null) {
            preferenceFindPreference2.setDependency(dib.f11258aR.f11210a);
        }
        Preference preferenceFindPreference3 = this.f12055c.findPreference("camera.onscreen_logcat_filter");
        if (preferenceFindPreference3 == null || preferenceFindPreference2 == null) {
            return;
        }
        preferenceFindPreference3.setDependency(dib.f11257aQ.f11210a);
    }

    /* JADX INFO: renamed from: b */
    public final void m6412b(String str) {
        this.f12054b.edit().putString("dev_setting_filter_key", str).apply();
        this.f12055c.removeAll();
        m6411a(this.f12055c);
    }
}
