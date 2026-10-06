package p000;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ann extends anz {

    /* JADX INFO: renamed from: ad */
    public int f1842ad;

    /* JADX INFO: renamed from: ae */
    private CharSequence[] f1843ae;

    /* JADX INFO: renamed from: af */
    private CharSequence[] f1844af;

    /* JADX INFO: renamed from: E */
    private final ListPreference m1730E() {
        return (ListPreference) m1738D();
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: A */
    public final void mo1725A(boolean z) {
        int i;
        if (!z || (i = this.f1842ad) < 0) {
            return;
        }
        String string = this.f1844af[i].toString();
        ListPreference listPreferenceM1730E = m1730E();
        if (listPreferenceM1730E.m1505W(string)) {
            listPreferenceM1730E.m1480o(string);
        }
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: aS */
    protected final void mo1731aS(C0154ef c0154ef) {
        CharSequence[] charSequenceArr = this.f1843ae;
        int i = this.f1842ad;
        cdo cdoVar = new cdo(this, 1);
        C0150eb c0150eb = c0154ef.f13785a;
        c0150eb.f13176n = charSequenceArr;
        c0150eb.f13178p = cdoVar;
        c0150eb.f13184v = i;
        c0150eb.f13183u = true;
        c0154ef.m7262h(null, null);
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1842ad = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.f1843ae = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.f1844af = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreferenceM1730E = m1730E();
        if (listPreferenceM1730E.f1553g == null || listPreferenceM1730E.f1554h == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.f1842ad = listPreferenceM1730E.m1476k(listPreferenceM1730E.f1555i);
        this.f1843ae = listPreferenceM1730E.f1553g;
        this.f1844af = listPreferenceM1730E.f1554h;
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f1842ad);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f1843ae);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f1844af);
    }
}
