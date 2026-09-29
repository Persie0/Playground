package p000;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class xq2 extends mq2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final WeakReference f68533a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f68534b;

    public xq2(TextView textView, yq2 yq2Var) {
        this.f68533a = new WeakReference(textView);
        this.f68534b = new WeakReference(yq2Var);
    }

    @Override // p000.mq2
    /* JADX INFO: renamed from: b */
    public final void mo12849b() {
        Handler handler;
        TextView textView = (TextView) this.f68533a.get();
        if (textView == null || (handler = textView.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f68533a.get();
        InputFilter inputFilter = (InputFilter) this.f68534b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    pq2 pq2VarM19448a = pq2.m19448a();
                    if (text == null) {
                        length = 0;
                    } else {
                        pq2VarM19448a.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceM19454g = pq2VarM19448a.m19454g(0, length, 0, text);
                    if (text == charSequenceM19454g) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceM19454g);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceM19454g);
                    textView.setText(charSequenceM19454g);
                    if (charSequenceM19454g instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceM19454g;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
