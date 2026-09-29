package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class kf9 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ lf9 f47150a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f47151b;

    public kf9(lf9 lf9Var, View view) {
        this.f47150a = lf9Var;
        this.f47151b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (((mf9) this.f47150a.f39591c).mo13968a()) {
            return false;
        }
        this.f47151b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
