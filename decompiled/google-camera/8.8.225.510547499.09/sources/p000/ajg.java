package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ajg implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public boolean f488a = true;

    /* JADX INFO: renamed from: b */
    private final EditText f489b;

    public ajg(EditText editText) {
        this.f489b = editText;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.f489b.isInEditMode() || !this.f488a) {
            return;
        }
        aix aixVar = aix.f474a;
    }
}
