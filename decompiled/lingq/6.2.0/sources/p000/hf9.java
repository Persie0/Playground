package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class hf9 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fs6 f42309a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f42310b;

    public hf9(fs6 fs6Var, View view) {
        this.f42309a = fs6Var;
        this.f42310b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (((mf9) this.f42309a.f39591c).mo13968a()) {
            return false;
        }
        this.f42310b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
