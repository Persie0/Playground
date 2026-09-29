package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class yq2 implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f70285a;

    /* JADX INFO: renamed from: b */
    public xq2 f70286b;

    public yq2(TextView textView) {
        this.f70285a = textView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r1 != 3) goto L27;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f70285a;
        if (!textView.isInEditMode()) {
            int iM19451c = pq2.m19448a().m19451c();
            if (iM19451c != 0) {
                if (iM19451c == 1) {
                    if ((i4 != 0 || i3 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                        if (i != 0 || i2 != charSequence.length()) {
                            charSequence = charSequence.subSequence(i, i2);
                        }
                        return pq2.m19448a().m19454g(0, charSequence.length(), 0, charSequence);
                    }
                }
            }
            pq2 pq2VarM19448a = pq2.m19448a();
            if (this.f70286b == null) {
                this.f70286b = new xq2(textView, this);
            }
            pq2VarM19448a.m19455h(this.f70286b);
            return charSequence;
        }
        return charSequence;
    }
}
