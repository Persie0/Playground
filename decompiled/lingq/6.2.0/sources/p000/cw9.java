package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class cw9 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f34648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f34649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextInputLayout f34650c;

    public cw9(TextInputLayout textInputLayout, EditText editText) {
        this.f34650c = textInputLayout;
        this.f34649b = editText;
        this.f34648a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f34650c;
        textInputLayout.m6239w(!textInputLayout.f13276W0, false);
        if (textInputLayout.f13300l) {
            textInputLayout.m6232p(editable);
        }
        if (textInputLayout.f13259O) {
            textInputLayout.m6240x(editable);
        }
        EditText editText = this.f34649b;
        int lineCount = editText.getLineCount();
        int i = this.f34648a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f13262P0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f34648a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
