package p000;

import android.content.Context;
import android.preference.ListPreference;
import android.preference.Preference;
import android.widget.Toast;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.preference.ManagedSwitchPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ewn implements Preference.OnPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20654a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20655b;

    public /* synthetic */ ewn(djm djmVar, int i, byte[] bArr, byte[] bArr2) {
        this.f20655b = i;
        this.f20654a = djmVar;
    }

    public /* synthetic */ ewn(ewp ewpVar, int i) {
        this.f20655b = i;
        this.f20654a = ewpVar;
    }

    public /* synthetic */ ewn(hgx hgxVar, int i) {
        this.f20655b = i;
        this.f20654a = hgxVar;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0121  */
    /* JADX WARN: Type inference failed for: r0v12, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.lang.Object, jww] */
    /* JADX WARN: Type inference failed for: r8v7, types: [fcp, java.lang.Object] */
    @Override // android.preference.Preference.OnPreferenceChangeListener
    public final boolean onPreferenceChange(Preference preference, Object obj) {
        boolean z = false;
        switch (this.f20655b) {
            case 0:
                ewp ewpVar = (ewp) this.f20654a;
                ewpVar.f20661b.f26481l.mo8199s(preference.getKey(), Boolean.valueOf(ewpVar.f20660a.isChecked()), obj);
                if (((Boolean) obj).booleanValue() && !ewpVar.m7950b()) {
                    ewpVar.getActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
                }
                return true;
            case 1:
                Object obj2 = this.f20654a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                    djm.m6218f((Context) ((djm) obj2).f11787a);
                }
                ((djm) obj2).f11789c.mo8188h(zBooleanValue);
                return true;
            case 2:
                ((ewp) this.f20654a).f20661b.f26474e.mo3415bf(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return true;
            case 3:
                Object obj3 = this.f20654a;
                ListPreference listPreference = (ListPreference) preference;
                int iFindIndexOfValue = listPreference.findIndexOfValue(listPreference.getValue());
                int iFindIndexOfValue2 = listPreference.findIndexOfValue((String) obj);
                listPreference.setSummary(listPreference.getEntries()[iFindIndexOfValue2]);
                ((ewp) obj3).f20661b.f26481l.mo8199s(preference.getKey(), listPreference.getEntries()[iFindIndexOfValue], listPreference.getEntries()[iFindIndexOfValue2]);
                return true;
            default:
                hgx hgxVar = (hgx) this.f20654a;
                int iM10256a = hgxVar.m10256a();
                hgxVar.f27760e.mo10033e(gzy.f27008T, true);
                if (((Boolean) hgxVar.f27759d.mo10031c(gzy.f27004P)).booleanValue()) {
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() && iM10256a > 3) {
                        Toast toast = hgxVar.f27769n;
                        if (toast != null) {
                            toast.cancel();
                        }
                        hgxVar.f27769n = Toast.makeText(hgxVar.f27756a, jvh.m13549G(C0100R.plurals.social_share_select_error, 3, 3).mo11322a(hgxVar.f27756a.getResources()), 0);
                        hgxVar.f27769n.show();
                        hgxVar.m10261f((ManagedSwitchPreference) preference, false);
                    } else if (!bool.booleanValue() && iM10256a <= 0) {
                        hgxVar.m10262g(false);
                    }
                    if (z) {
                        preference.getKey();
                        hgxVar.f27758c.mo10046m(preference.getKey());
                        hgxVar.m10263h();
                        hgxVar.f27762g.mo8199s(preference.getKey(), Boolean.valueOf(hgxVar.f27758c.mo10046m(preference.getKey())), obj);
                    }
                    return z;
                }
                hgxVar.m10262g(true);
                z = true;
                if (z) {
                    preference.getKey();
                    hgxVar.f27758c.mo10046m(preference.getKey());
                    hgxVar.m10263h();
                    hgxVar.f27762g.mo8199s(preference.getKey(), Boolean.valueOf(hgxVar.f27758c.mo10046m(preference.getKey())), obj);
                }
                return z;
        }
    }
}
