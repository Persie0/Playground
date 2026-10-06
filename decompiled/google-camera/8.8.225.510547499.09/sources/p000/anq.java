package p000;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anq extends anz {

    /* JADX INFO: renamed from: ad */
    final Set f1847ad = new HashSet();

    /* JADX INFO: renamed from: ae */
    boolean f1848ae;

    /* JADX INFO: renamed from: af */
    CharSequence[] f1849af;

    /* JADX INFO: renamed from: ag */
    CharSequence[] f1850ag;

    /* JADX INFO: renamed from: E */
    private final MultiSelectListPreference m1732E() {
        return (MultiSelectListPreference) m1738D();
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: A */
    public final void mo1725A(boolean z) {
        if (z && this.f1848ae) {
            MultiSelectListPreference multiSelectListPreferenceM1732E = m1732E();
            if (multiSelectListPreferenceM1732E.m1505W(this.f1847ad)) {
                multiSelectListPreferenceM1732E.m1481k(this.f1847ad);
            }
        }
        this.f1848ae = false;
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: aS */
    protected final void mo1731aS(C0154ef c0154ef) {
        int length = this.f1850ag.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f1847ad.contains(this.f1850ag[i].toString());
        }
        CharSequence[] charSequenceArr = this.f1849af;
        anp anpVar = new anp(this);
        C0150eb c0150eb = c0154ef.f13785a;
        c0150eb.f13176n = charSequenceArr;
        c0150eb.f13185w = anpVar;
        c0150eb.f13181s = zArr;
        c0150eb.f13182t = true;
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1847ad.clear();
            this.f1847ad.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.f1848ae = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.f1849af = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.f1850ag = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreferenceM1732E = m1732E();
        if (multiSelectListPreferenceM1732E.f1556g == null || multiSelectListPreferenceM1732E.f1557h == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.f1847ad.clear();
        this.f1847ad.addAll(multiSelectListPreferenceM1732E.f1558i);
        this.f1848ae = false;
        this.f1849af = multiSelectListPreferenceM1732E.f1556g;
        this.f1850ag = multiSelectListPreferenceM1732E.f1557h;
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.f1847ad));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.f1848ae);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.f1849af);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.f1850ag);
    }
}
