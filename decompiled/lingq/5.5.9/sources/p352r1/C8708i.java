package p352r1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import dm.C5207g;
import p080e.RunnableC5286r;

/* JADX INFO: renamed from: r1.i */
/* JADX INFO: loaded from: classes.dex */
public final class C8708i {

    /* JADX INFO: renamed from: a */
    public final View f46299a;

    public C8708i(View view) {
        C5207g.m11111f(view, "view");
        this.f46299a = view;
    }

    /* JADX INFO: renamed from: a */
    public void m16951a(InputMethodManager inputMethodManager) {
        C5207g.m11111f(inputMethodManager, "imm");
        inputMethodManager.hideSoftInputFromWindow(this.f46299a.getWindowToken(), 0);
    }

    /* JADX INFO: renamed from: b */
    public void m16952b(InputMethodManager inputMethodManager) {
        C5207g.m11111f(inputMethodManager, "imm");
        this.f46299a.post(new RunnableC5286r(inputMethodManager, 1, this));
    }
}
