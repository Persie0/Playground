package p000;

import android.content.Context;
import android.widget.Toast;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.p014ui.preference.MaterialManagedAppSwitchPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ewi implements ant {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20630a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f20631b;

    public /* synthetic */ ewi(ewj ewjVar, int i) {
        this.f20631b = i;
        this.f20630a = ewjVar;
    }

    public /* synthetic */ ewi(hgs hgsVar, int i) {
        this.f20631b = i;
        this.f20630a = hgsVar;
    }

    public /* synthetic */ ewi(C1058va c1058va, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f20631b = i;
        this.f20630a = c1058va;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0137  */
    /* JADX WARN: Type inference failed for: r10v7, types: [fcp, java.lang.Object] */
    @Override // p000.ant
    /* JADX INFO: renamed from: b */
    public final boolean mo1734b(Preference preference, Object obj) {
        boolean z = false;
        switch (this.f20631b) {
            case 0:
                Object obj2 = this.f20630a;
                ewj ewjVar = (ewj) obj2;
                ewjVar.f20632ae.f20646h.mo8199s(preference.f1590r, Boolean.valueOf(((TwoStatePreference) ewjVar.f20633af).f1626a), obj);
                if (((Boolean) obj).booleanValue() && !ewjVar.m7943D()) {
                    ActivityC0080bz activity = ((ComponentCallbacksC0077bw) obj2).getActivity();
                    activity.getClass();
                    activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1);
                }
                return true;
            case 1:
                Object obj3 = this.f20630a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!zBooleanValue) {
                    C1058va.m19461B((Context) ((C1058va) obj3).f47803b);
                }
                ((C1058va) obj3).f47804c.mo8188h(zBooleanValue);
                return true;
            case 2:
                ((ewj) this.f20630a).f20632ae.f20647i.mo3415bf(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return true;
            case 3:
                Object obj4 = this.f20630a;
                ListPreference listPreference = (ListPreference) preference;
                int iM1476k = listPreference.m1476k(listPreference.f1555i);
                int iM1476k2 = listPreference.m1476k((String) obj);
                listPreference.mo1479n(listPreference.f1553g[iM1476k2]);
                fcp fcpVar = ((ewj) obj4).f20632ae.f20646h;
                String str = preference.f1590r;
                CharSequence[] charSequenceArr = listPreference.f1553g;
                fcpVar.mo8199s(str, charSequenceArr[iM1476k], charSequenceArr[iM1476k2]);
                return true;
            default:
                hgs hgsVar = (hgs) this.f20630a;
                mws mwsVarM17081f = hgsVar.f27737h.m17081f();
                int i = ((mzr) mwsVarM17081f).f41859c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    if (hgsVar.f27732c.mo10046m(((MaterialManagedAppSwitchPreference) mwsVarM17081f.get(i3)).f1590r)) {
                        i2++;
                    }
                }
                hgsVar.f27734e.mo10033e(gzy.f27008T, true);
                if (((Boolean) hgsVar.f27733d.mo10031c(gzy.f27004P)).booleanValue()) {
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() && i2 > 3) {
                        Toast toast = hgsVar.f27743n;
                        if (toast != null) {
                            toast.cancel();
                        }
                        hgsVar.f27743n = Toast.makeText(hgsVar.f27730a, jvh.m13549G(C0100R.plurals.social_share_select_error, 3, 3).mo11322a(hgsVar.f27730a.getResources()), 0);
                        hgsVar.f27743n.show();
                        hgsVar.m10251a((MaterialManagedAppSwitchPreference) preference, false);
                    } else if (!bool.booleanValue() && i2 <= 0) {
                        hgsVar.m10252b(false);
                    }
                    if (z) {
                        hgsVar.f27732c.mo10046m(preference.f1590r);
                        fcp fcpVar2 = hgsVar.f27736g;
                        String str2 = preference.f1590r;
                        fcpVar2.mo8199s(str2, Boolean.valueOf(hgsVar.f27732c.mo10046m(str2)), obj);
                    }
                    return z;
                }
                hgsVar.m10252b(true);
                z = true;
                if (z) {
                    hgsVar.f27732c.mo10046m(preference.f1590r);
                    fcp fcpVar3 = hgsVar.f27736g;
                    String str3 = preference.f1590r;
                    fcpVar3.mo8199s(str3, Boolean.valueOf(hgsVar.f27732c.mo10046m(str3)), obj);
                }
                return z;
        }
    }
}
