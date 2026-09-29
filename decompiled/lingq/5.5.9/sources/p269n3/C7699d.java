package p269n3;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0892f;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: n3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7699d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f42213a;

    /* JADX INFO: renamed from: b */
    public a f42214b;

    /* JADX INFO: renamed from: n3.d$a */
    public static class a extends C0892f.f {

        /* JADX INFO: renamed from: a */
        public final WeakReference f42215a;

        /* JADX INFO: renamed from: b */
        public final WeakReference f42216b;

        public a(TextView textView, C7699d c7699d) {
            this.f42215a = new WeakReference(textView);
            this.f42216b = new WeakReference(c7699d);
        }

        @Override // androidx.emoji2.text.C0892f.f
        /* JADX INFO: renamed from: b */
        public final void mo1048b() {
            InputFilter[] filters;
            TextView textView = (TextView) this.f42215a.get();
            InputFilter inputFilter = (InputFilter) this.f42216b.get();
            boolean z10 = false;
            if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
                for (InputFilter inputFilter2 : filters) {
                    if (inputFilter2 == inputFilter) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    CharSequence charSequenceM3526h = C0892f.m3519a().m3526h(text);
                    if (text == charSequenceM3526h) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM3526h);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM3526h);
                    textView.setText(charSequenceM3526h);
                    if (charSequenceM3526h instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM3526h;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                        } else if (selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionEnd);
                        }
                    }
                }
            }
        }
    }

    public C7699d(TextView textView) {
        this.f42213a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.f42213a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iM3521b = C0892f.m3519a().m3521b();
        if (iM3521b != 0) {
            boolean z10 = true;
            if (iM3521b == 1) {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (!z10 || charSequence == null) {
                    return charSequence;
                }
                if (i10 != 0 || i11 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i10, i11);
                }
                return C0892f.m3519a().m3525g(0, charSequence.length(), charSequence);
            }
            if (iM3521b != 3) {
                return charSequence;
            }
        }
        C0892f c0892fM3519a = C0892f.m3519a();
        if (this.f42214b == null) {
            this.f42214b = new a(textView, this);
        }
        c0892fM3519a.m3527i(this.f42214b);
        return charSequence;
    }
}
