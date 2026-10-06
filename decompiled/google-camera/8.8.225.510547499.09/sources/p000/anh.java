package p000;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;
import androidx.preference.ListPreference;
import androidx.preference.Preference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anh implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f1830a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f1831b;

    public anh(DropDownPreference dropDownPreference, int i) {
        this.f1831b = i;
        this.f1830a = dropDownPreference;
    }

    public anh(C0794lg c0794lg, int i) {
        this.f1831b = i;
        this.f1830a = c0794lg;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0773km c0773km;
        switch (this.f1831b) {
            case 0:
                if (i >= 0) {
                    String string = ((ListPreference) this.f1830a).f1554h[i].toString();
                    if (!string.equals(((ListPreference) this.f1830a).f1555i) && ((Preference) this.f1830a).m1505W(string)) {
                        ((ListPreference) this.f1830a).m1480o(string);
                        break;
                    }
                }
                break;
            default:
                if (i != -1 && (c0773km = ((C0794lg) this.f1830a).f38176e) != null) {
                    c0773km.f36511a = false;
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.f1831b;
    }
}
