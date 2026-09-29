package p000;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class md9 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51110a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f51111b;

    public /* synthetic */ md9(View view, int i) {
        this.f51110a = i;
        this.f51111b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f51110a;
        View view = this.f51111b;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            default:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
        }
    }
}
