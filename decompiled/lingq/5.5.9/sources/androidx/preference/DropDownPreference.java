package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import com.linguist.R;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* JADX INFO: renamed from: j */
    public final ArrayAdapter f6866j;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public DropDownPreference() {
        throw null;
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle, 0);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.f6866j = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.f6868h;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: f */
    public final void mo4036f() {
        ArrayAdapter arrayAdapter = this.f6866j;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
