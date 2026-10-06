package p000;

import android.content.Context;
import android.widget.SearchView;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceCategory;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.debug.p010ui.MaterialSearchViewPreference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dmy {

    /* JADX INFO: renamed from: a */
    public final Object f12063a;

    /* JADX INFO: renamed from: b */
    public final Object f12064b;

    /* JADX INFO: renamed from: c */
    public Object f12065c;

    /* JADX INFO: renamed from: d */
    public final Object f12066d;

    public dmy(Context context) {
        this.f12066d = new ArrayList();
        C0931qi c0931qi = new C0931qi(context, C0100R.style.Theme_CameraSettings);
        this.f12063a = c0931qi;
        this.f12064b = aoo.m1773c(c0931qi);
    }

    public dmy(cgu cguVar, cgj cgjVar, jwn jwnVar) {
        this.f12063a = cguVar;
        this.f12066d = cgjVar;
        this.f12064b = jwnVar;
    }

    public dmy(oju ojuVar, ScheduledExecutorService scheduledExecutorService, dhv dhvVar) {
        this.f12065c = null;
        this.f12066d = ojuVar;
        this.f12064b = scheduledExecutorService;
        this.f12063a = dhvVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final void m6413a(PreferenceScreen preferenceScreen) {
        this.f12065c = preferenceScreen;
        Preference preference = new Preference((Context) this.f12063a);
        preference.mo1502T("Reset to default values");
        int i = 1;
        preference.f1587o = new dmw(this, i);
        ((PreferenceGroup) this.f12065c).m1531ak(preference);
        Preference preference2 = new Preference((Context) this.f12063a);
        preference2.mo1502T("Primes Log");
        preference2.f1587o = new dmw(this, 0);
        ((PreferenceGroup) this.f12065c).m1531ak(preference2);
        String string = this.f12064b.getString("dev_setting_filter_key", "");
        MaterialSearchViewPreference materialSearchViewPreference = new MaterialSearchViewPreference(((Preference) this.f12065c).f1582j);
        materialSearchViewPreference.f1559A = C0100R.layout.search_view_preference;
        materialSearchViewPreference.f6609c = string;
        SearchView searchView = materialSearchViewPreference.f6607a;
        if (searchView != null) {
            searchView.setQuery(string, true);
        }
        materialSearchViewPreference.f6608b = new dmx(this, 0);
        ((PreferenceGroup) this.f12065c).m1531ak(materialSearchViewPreference);
        this.f12066d.clear();
        EditTextPreference editTextPreference = new EditTextPreference(((Preference) this.f12065c).f1582j, null);
        editTextPreference.mo1502T("camera.onscreen_logcat_filter");
        editTextPreference.f1559A = C0100R.layout.preference_with_margin;
        this.f12066d.add(new dsx(editTextPreference));
        String string2 = this.f12064b.contains("camera.onscreen_logcat_filter") ? this.f12064b.getString("camera.onscreen_logcat_filter", "Gca") : "Gca";
        editTextPreference.m1474i(string2);
        editTextPreference.mo1479n(string2);
        editTextPreference.f1586n = new ewg(this, i);
        PreferenceCategory preferenceCategory = new PreferenceCategory((Context) this.f12063a);
        preferenceCategory.f1559A = C0100R.layout.material_preference_category_layout;
        preferenceScreen.m1531ak(preferenceCategory);
        Collections.sort(this.f12066d, amx.f741e);
        String[] strArrSplit = this.f12064b.getString("dev_setting_filter_key", "").split("(,|\\s)+", -1);
        for (dsx dsxVar : this.f12066d) {
            for (String str : strArrSplit) {
                if (((String) dsxVar.f12521a).contains(str)) {
                    preferenceCategory.m1531ak((Preference) dsxVar.f12522b);
                    break;
                }
            }
        }
        Preference preferenceM1533l = ((PreferenceGroup) this.f12065c).m1533l(dib.f11258aR.f11210a);
        Preference preferenceM1533l2 = ((PreferenceGroup) this.f12065c).m1533l(dib.f11257aQ.f11210a);
        if (preferenceM1533l2 != null && preferenceM1533l != null) {
            preferenceM1533l2.m1492J(dib.f11258aR.f11210a);
        }
        Preference preferenceM1533l3 = ((PreferenceGroup) this.f12065c).m1533l("camera.onscreen_logcat_filter");
        if (preferenceM1533l3 == null || preferenceM1533l2 == null) {
            return;
        }
        preferenceM1533l3.m1492J(dib.f11257aQ.f11210a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m6414b(String str) {
        this.f12064b.edit().putString("dev_setting_filter_key", str).apply();
        ((PreferenceGroup) this.f12065c).m1527ag();
        m6413a((PreferenceScreen) this.f12065c);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    /* JADX INFO: renamed from: c */
    public final synchronized void m6415c() {
        if (this.f12063a.mo6184l(dhh.f11078ad)) {
            ?? r0 = this.f12065c;
            if (r0 != 0) {
                r0.cancel(false);
                this.f12065c = null;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [dhv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX INFO: renamed from: d */
    public final synchronized void m6416d() {
        if (this.f12063a.mo6184l(dhh.f11078ad)) {
            if (this.f12065c != null) {
                throw new IllegalStateException("Scheduler running already.");
            }
            ?? r1 = this.f12064b;
            czs czsVar = (czs) this.f12066d.get();
            czsVar.getClass();
            this.f12065c = r1.scheduleAtFixedRate(new cui(czsVar, 12), 0L, 2000L, TimeUnit.MILLISECONDS);
            ((czs) this.f12066d.get()).m5747a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: e */
    public final synchronized kba m6417e() {
        byte[] bArr;
        nbz nbzVar = nch.f41987a;
        bArr = null;
        this.f12065c = jwj.m13624c(this.f12064b).mo3830a(new cbx(this, 9, bArr), not.INSTANCE);
        return new cft(this, 2, bArr);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kba] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m6418f() {
        nbz nbzVar = nch.f41987a;
        ?? r0 = this.f12065c;
        if (r0 != 0) {
            r0.close();
        }
        m6419g(false);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [cgu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [cgu, java.lang.Object] */
    /* JADX INFO: renamed from: g */
    public final void m6419g(boolean z) {
        nbz nbzVar = nch.f41987a;
        ((cgj) this.f12066d).m3624b();
        if (z) {
            this.f12063a.mo3644g();
        } else {
            this.f12063a.mo3643f();
        }
    }
}
