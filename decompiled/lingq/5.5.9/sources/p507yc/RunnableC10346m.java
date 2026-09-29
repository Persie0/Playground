package p507yc;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* JADX INFO: renamed from: yc.m */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10346m implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ View f52050a;

    public RunnableC10346m(EditText editText) {
        this.f52050a = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.f52050a;
        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
    }
}
