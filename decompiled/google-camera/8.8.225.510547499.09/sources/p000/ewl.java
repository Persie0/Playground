package p000;

import android.content.SharedPreferences;
import android.preference.Preference;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewl implements Preference.OnPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20651b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f20652c;

    public /* synthetic */ ewl(dmu dmuVar, int i) {
        this.f20652c = i;
        this.f20651b = dmuVar;
        this.f20650a = "camera.onscreen_logcat_filter";
    }

    public /* synthetic */ ewl(ewp ewpVar, ManagedSwitchPreference managedSwitchPreference, int i) {
        this.f20652c = i;
        this.f20651b = ewpVar;
        this.f20650a = managedSwitchPreference;
    }

    public /* synthetic */ ewl(fcp fcpVar, Object obj, int i) {
        this.f20652c = i;
        this.f20651b = fcpVar;
        this.f20650a = obj;
    }

    public /* synthetic */ ewl(hgx hgxVar, ManagedSwitchPreference managedSwitchPreference, int i) {
        this.f20652c = i;
        this.f20651b = hgxVar;
        this.f20650a = managedSwitchPreference;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [fcp, java.lang.Object] */
    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        switch (this.f20652c) {
            case 0:
                this.f20651b.mo8199s(preference.getKey(), this.f20650a, obj);
                break;
            case 1:
                Object obj2 = this.f20651b;
                Object obj3 = this.f20650a;
                String str = (String) obj;
                preference.setSummary(str);
                SharedPreferences.Editor editorEdit = ((dmu) obj2).f12054b.edit();
                editorEdit.putString((String) obj3, str);
                editorEdit.apply();
                break;
            case 2:
                ((ewp) this.f20651b).f20661b.f26481l.mo8199s(preference.getKey(), Boolean.valueOf(((ManagedSwitchPreference) this.f20650a).isChecked()), obj);
                break;
            default:
                Object obj4 = this.f20651b;
                hgx hgxVar = (hgx) obj4;
                hgxVar.f27762g.mo8199s(preference.getKey(), Boolean.valueOf(((ManagedSwitchPreference) this.f20650a).isChecked()), obj);
                Boolean bool = (Boolean) obj;
                hgxVar.m10262g(bool.booleanValue());
                boolean zBooleanValue = bool.booleanValue();
                int i = 0;
                if (!zBooleanValue) {
                    mws mwsVarM17081f = hgxVar.f27763h.m17081f();
                    int i2 = ((mzr) mwsVarM17081f).f41859c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ManagedSwitchPreference managedSwitchPreference = (ManagedSwitchPreference) mwsVarM17081f.get(i3);
                        hgxVar.f27765j.put(managedSwitchPreference.getKey(), Boolean.valueOf(hgxVar.f27758c.mo10046m(managedSwitchPreference.getKey())));
                        hgxVar.m10261f(managedSwitchPreference, false);
                    }
                } else if (Collection$EL.stream(hgxVar.f27765j.values()).anyMatch(fjv.f22320n)) {
                    mws mwsVarM17081f2 = hgxVar.f27763h.m17081f();
                    int i4 = ((mzr) mwsVarM17081f2).f41859c;
                    while (i < i4) {
                        ManagedSwitchPreference managedSwitchPreference2 = (ManagedSwitchPreference) mwsVarM17081f2.get(i);
                        Boolean bool2 = (Boolean) hgxVar.f27765j.get(managedSwitchPreference2.getKey());
                        bool2.getClass();
                        hgxVar.m10261f(managedSwitchPreference2, bool2.booleanValue());
                        i++;
                    }
                    hgxVar.f27765j.clear();
                } else if (Collection$EL.stream(hgxVar.f27764i.values()).anyMatch(fjv.f22320n)) {
                    mws mwsVarM17081f3 = hgxVar.f27763h.m17081f();
                    int i5 = ((mzr) mwsVarM17081f3).f41859c;
                    while (i < i5) {
                        ManagedSwitchPreference managedSwitchPreference3 = (ManagedSwitchPreference) mwsVarM17081f3.get(i);
                        Boolean bool3 = (Boolean) hgxVar.f27764i.get(managedSwitchPreference3.getKey());
                        bool3.getClass();
                        hgxVar.m10261f(managedSwitchPreference3, bool3.booleanValue());
                        i++;
                    }
                } else {
                    hgxVar.f27761f.mo10270g(hgxVar.f27767l);
                    mws mwsVarM17081f4 = hgxVar.f27763h.m17081f();
                    int i6 = ((mzr) mwsVarM17081f4).f41859c;
                    while (i < i6) {
                        ManagedSwitchPreference managedSwitchPreference4 = (ManagedSwitchPreference) mwsVarM17081f4.get(i);
                        hgxVar.m10261f(managedSwitchPreference4, hgxVar.f27758c.mo10046m(managedSwitchPreference4.getKey()));
                        i++;
                    }
                }
                hgxVar.m10263h();
                break;
        }
        return true;
    }
}
