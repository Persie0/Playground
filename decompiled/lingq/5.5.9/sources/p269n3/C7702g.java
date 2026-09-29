package p269n3;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0892f;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: n3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C7702g implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f42224a;

    /* JADX INFO: renamed from: c */
    public a f42226c;

    /* JADX INFO: renamed from: b */
    public final boolean f42225b = false;

    /* JADX INFO: renamed from: d */
    public boolean f42227d = true;

    /* JADX INFO: renamed from: n3.g$a */
    public static class a extends C0892f.f {

        /* JADX INFO: renamed from: a */
        public final WeakReference f42228a;

        public a(EditText editText) {
            this.f42228a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: b */
        public final void mo1048b() {
            C7702g.m15297a((EditText) this.f42228a.get(), 1);
        }
    }

    public C7702g(EditText editText) {
        this.f42224a = editText;
    }

    /* JADX INFO: renamed from: a */
    public static void m15297a(EditText editText, int i10) {
        if (i10 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0892f.m3519a().m3526h(editableText);
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
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        EditText editText = this.f42224a;
        if (editText.isInEditMode()) {
            return;
        }
        if (!((this.f42227d && (this.f42225b || C0892f.m3520c())) ? false : true) && i11 <= i12 && (charSequence instanceof Spannable)) {
            int iM3521b = C0892f.m3519a().m3521b();
            if (iM3521b != 0) {
                if (iM3521b == 1) {
                    C0892f.m3519a().m3525g(i10, i12 + i10, (Spannable) charSequence);
                    return;
                } else if (iM3521b != 3) {
                    return;
                }
            }
            C0892f c0892fM3519a = C0892f.m3519a();
            if (this.f42226c == null) {
                this.f42226c = new a(editText);
            }
            c0892fM3519a.m3527i(this.f42226c);
        }
    }
}
