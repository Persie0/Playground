package p000;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i31 implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43395a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ js2 f43396b;

    public /* synthetic */ i31(js2 js2Var, int i) {
        this.f43395a = i;
        this.f43396b = js2Var;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int i = this.f43395a;
        js2 js2Var = this.f43396b;
        switch (i) {
            case 0:
                l31 l31Var = (l31) js2Var;
                l31Var.m15769s(l31Var.m15770t());
                break;
            default:
                ym2 ym2Var = (ym2) js2Var;
                ym2Var.f70057l = z;
                ym2Var.m14638p();
                if (!z) {
                    ym2Var.m25197s(false);
                    ym2Var.f70058m = false;
                }
                break;
        }
    }
}
