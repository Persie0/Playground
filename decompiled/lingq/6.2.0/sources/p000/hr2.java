package p000;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes2.dex */
public final class hr2 implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f42821a;

    /* JADX INFO: renamed from: b */
    public gr2 f42822b;

    /* JADX INFO: renamed from: c */
    public boolean f42823c = true;

    public hr2(EditText editText) {
        this.f42821a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m13436a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            pq2 pq2VarM19448a = pq2.m19448a();
            if (editableText == null) {
                length = 0;
            } else {
                pq2VarM19448a.getClass();
                length = editableText.length();
            }
            pq2VarM19448a.m19454g(0, length, 0, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.f42821a;
        if (!editText.isInEditMode() && this.f42823c && pq2.m19449d() && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iM19451c = pq2.m19448a().m19451c();
            if (iM19451c != 0) {
                if (iM19451c == 1) {
                    pq2.m19448a().m19454g(i, i3 + i, 0, (Spannable) charSequence);
                    return;
                } else if (iM19451c != 3) {
                    return;
                }
            }
            pq2 pq2VarM19448a = pq2.m19448a();
            if (this.f42822b == null) {
                this.f42822b = new gr2(editText);
            }
            pq2VarM19448a.m19455h(this.f42822b);
        }
    }
}
