package p000;

import android.content.SharedPreferences;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedAppSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedMainSwitchPreference;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedSwitchPreference;
import java.util.Map;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewg implements ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f20627b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f20628c;

    public /* synthetic */ ewg(dmy dmyVar, int i) {
        this.f20628c = i;
        this.f20627b = dmyVar;
        this.f20626a = "camera.onscreen_logcat_filter";
    }

    public /* synthetic */ ewg(ewj ewjVar, MaterialManagedSwitchPreference materialManagedSwitchPreference, int i) {
        this.f20628c = i;
        this.f20627b = ewjVar;
        this.f20626a = materialManagedSwitchPreference;
    }

    public /* synthetic */ ewg(fcp fcpVar, Object obj, int i) {
        this.f20628c = i;
        this.f20627b = fcpVar;
        this.f20626a = obj;
    }

    public /* synthetic */ ewg(hgs hgsVar, MaterialManagedMainSwitchPreference materialManagedMainSwitchPreference, int i) {
        this.f20628c = i;
        this.f20627b = hgsVar;
        this.f20626a = materialManagedMainSwitchPreference;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fcp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.content.SharedPreferences, java.lang.Object] */
    @Override // p000.ant
    /* JADX INFO: renamed from: b */
    public final boolean mo1734b(Preference preference, Object obj) {
        switch (this.f20628c) {
            case 0:
                this.f20627b.mo8199s(preference.f1590r, this.f20626a, obj);
                break;
            case 1:
                Object obj2 = this.f20627b;
                Object obj3 = this.f20626a;
                String str = (String) obj;
                preference.mo1479n(str);
                SharedPreferences.Editor editorEdit = ((dmy) obj2).f12064b.edit();
                editorEdit.putString((String) obj3, str);
                editorEdit.apply();
                break;
            case 2:
                ((ewj) this.f20627b).f20632ae.f20646h.mo8199s(preference.f1590r, Boolean.valueOf(((TwoStatePreference) this.f20626a).f1626a), obj);
                break;
            default:
                Object obj4 = this.f20627b;
                hgs hgsVar = (hgs) obj4;
                hgsVar.f27736g.mo8199s(preference.f1590r, Boolean.valueOf(((TwoStatePreference) this.f20626a).f1626a), obj);
                Boolean bool = (Boolean) obj;
                hgsVar.m10252b(bool.booleanValue());
                boolean zBooleanValue = bool.booleanValue();
                int i = 0;
                if (!zBooleanValue) {
                    mws mwsVarM17081f = hgsVar.f27737h.m17081f();
                    int i2 = ((mzr) mwsVarM17081f).f41859c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference = (MaterialManagedAppSwitchPreference) mwsVarM17081f.get(i3);
                        Map map = hgsVar.f27739j;
                        String str2 = materialManagedAppSwitchPreference.f1590r;
                        map.put(str2, Boolean.valueOf(hgsVar.f27732c.mo10046m(str2)));
                        hgsVar.m10251a(materialManagedAppSwitchPreference, false);
                    }
                } else if (Collection$EL.stream(hgsVar.f27739j.values()).anyMatch(fjv.f22319m)) {
                    mws mwsVarM17081f2 = hgsVar.f27737h.m17081f();
                    int i4 = ((mzr) mwsVarM17081f2).f41859c;
                    while (i < i4) {
                        MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference2 = (MaterialManagedAppSwitchPreference) mwsVarM17081f2.get(i);
                        Boolean bool2 = (Boolean) hgsVar.f27739j.get(materialManagedAppSwitchPreference2.f1590r);
                        bool2.getClass();
                        hgsVar.m10251a(materialManagedAppSwitchPreference2, bool2.booleanValue());
                        i++;
                    }
                    hgsVar.f27739j.clear();
                } else if (Collection$EL.stream(hgsVar.f27738i.values()).anyMatch(fjv.f22319m)) {
                    mws mwsVarM17081f3 = hgsVar.f27737h.m17081f();
                    int i5 = ((mzr) mwsVarM17081f3).f41859c;
                    while (i < i5) {
                        MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference3 = (MaterialManagedAppSwitchPreference) mwsVarM17081f3.get(i);
                        Boolean bool3 = (Boolean) hgsVar.f27738i.get(materialManagedAppSwitchPreference3.f1590r);
                        bool3.getClass();
                        hgsVar.m10251a(materialManagedAppSwitchPreference3, bool3.booleanValue());
                        i++;
                    }
                } else {
                    hgsVar.f27735f.mo10270g(hgsVar.f27741l);
                    mws mwsVarM17081f4 = hgsVar.f27737h.m17081f();
                    int i6 = ((mzr) mwsVarM17081f4).f41859c;
                    while (i < i6) {
                        MaterialManagedAppSwitchPreference materialManagedAppSwitchPreference4 = (MaterialManagedAppSwitchPreference) mwsVarM17081f4.get(i);
                        hgsVar.m10251a(materialManagedAppSwitchPreference4, hgsVar.f27732c.mo10046m(materialManagedAppSwitchPreference4.f1590r));
                        i++;
                    }
                }
                break;
        }
        return true;
    }
}
