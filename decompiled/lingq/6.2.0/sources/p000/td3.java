package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.runtime.C0281i;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.fragment.app.C0639g;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes.dex */
public final class td3 implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f62162b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f62163c;

    public td3(ud3 ud3Var, C0639g c0639g) {
        this.f62161a = 0;
        this.f62163c = ud3Var;
        this.f62162b = c0639g;
    }

    /* JADX INFO: renamed from: a */
    private final void m21961a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m21962b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m21963c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f62161a;
        Object obj = this.f62163c;
        Object obj2 = this.f62162b;
        switch (i) {
            case 0:
                C0639g c0639g = (C0639g) obj2;
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = c0639g.f5768c;
                c0639g.m2202k();
                p82.m18951i((ViewGroup) abstractComponentCallbacksC0635c.f5692d0.getParent(), ((ud3) obj).f63753a).m18960h();
                break;
            case 1:
                AbstractC0389a abstractC0389a = (AbstractC0389a) obj2;
                ub5 ub5VarM25659b = zha.m25659b(abstractC0389a);
                if (ub5VarM25659b == null) {
                    i54.m13664c("View tree for " + abstractC0389a + " has no ViewTreeLifecycleOwner");
                    C3386nv.m17631r();
                } else {
                    ((Ref$ObjectRef) obj).f47718a = AbstractC0406r.m1815a(abstractC0389a, ub5VarM25659b.mo256K());
                    abstractC0389a.removeOnAttachStateChangeListener(this);
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f62161a) {
            case 0:
            case 1:
                break;
            default:
                ((View) this.f62162b).removeOnAttachStateChangeListener(this);
                ((C0281i) this.f62163c).m1283x();
                break;
        }
    }

    public /* synthetic */ td3(int i, View view, Object obj) {
        this.f62161a = i;
        this.f62162b = view;
        this.f62163c = obj;
    }
}
