package androidx.preference;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.camera.bottombar.C0100R;
import p000.anh;
import p000.aor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: F */
    private final Context f1546F;

    /* JADX INFO: renamed from: G */
    private final ArrayAdapter f1547G;

    /* JADX INFO: renamed from: H */
    private Spinner f1548H;

    /* JADX INFO: renamed from: I */
    private final AdapterView.OnItemSelectedListener f1549I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.dropdownPreferenceStyle, 0);
        this.f1549I = new anh(this, 0);
        this.f1546F = context;
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_dropdown_item);
        this.f1547G = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = ((ListPreference) this).f1553g;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                this.f1547G.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: a */
    public final void mo1466a(aor aorVar) {
        Spinner spinner = (Spinner) aorVar.f41155a.findViewById(C0100R.id.spinner);
        this.f1548H = spinner;
        spinner.setAdapter((SpinnerAdapter) this.f1547G);
        this.f1548H.setOnItemSelectedListener(this.f1549I);
        Spinner spinner2 = this.f1548H;
        String str = ((ListPreference) this).f1555i;
        CharSequence[] charSequenceArr = ((ListPreference) this).f1554h;
        int i = -1;
        if (str != null && charSequenceArr != null) {
            for (int length = charSequenceArr.length - 1; length >= 0; length--) {
                if (TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    i = length;
                    break;
                }
            }
        }
        spinner2.setSelection(i);
        super.mo1466a(aorVar);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    /* JADX INFO: renamed from: c */
    protected final void mo1468c() {
        this.f1548H.performClick();
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: d */
    protected final void mo1469d() {
        super.mo1469d();
        ArrayAdapter arrayAdapter = this.f1547G;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
