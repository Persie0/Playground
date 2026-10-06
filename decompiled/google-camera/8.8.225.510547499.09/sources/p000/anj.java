package p000;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anj extends anz {

    /* JADX INFO: renamed from: ad */
    public EditText f1833ad;

    /* JADX INFO: renamed from: ae */
    public final Runnable f1834ae = new RunnableC0852nk(this, 15);

    /* JADX INFO: renamed from: af */
    public long f1835af = -1;

    /* JADX INFO: renamed from: ag */
    private CharSequence f1836ag;

    /* JADX INFO: renamed from: E */
    private final EditTextPreference m1724E() {
        return (EditTextPreference) m1738D();
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: A */
    public final void mo1725A(boolean z) {
        if (z) {
            String string = this.f1833ad.getText().toString();
            EditTextPreference editTextPreferenceM1724E = m1724E();
            if (editTextPreferenceM1724E.m1505W(string)) {
                editTextPreferenceM1724E.m1474i(string);
            }
        }
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: B */
    protected final boolean mo1726B() {
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final void m1727C() {
        this.f1835af = -1L;
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.f1836ag = m1724E().f1550g;
        } else {
            this.f1836ag = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }

    @Override // p000.anz, p000.DialogInterfaceOnCancelListenerC0067bm, p000.ComponentCallbacksC0077bw
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.f1836ag);
    }

    @Override // p000.anz
    /* JADX INFO: renamed from: z */
    protected final void mo1728z(View view) {
        super.mo1728z(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.f1833ad = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.f1833ad.setText(this.f1836ag);
        EditText editText2 = this.f1833ad;
        editText2.setSelection(editText2.getText().length());
        m1724E();
    }
}
