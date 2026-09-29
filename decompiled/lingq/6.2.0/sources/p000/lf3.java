package p000;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;

/* JADX INFO: loaded from: classes3.dex */
public final class lf3 extends ge3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f49590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FrameLayout f49591b;

    public lf3(hy7 hy7Var, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, FrameLayout frameLayout) {
        this.f49590a = abstractComponentCallbacksC0635c;
        this.f49591b = frameLayout;
    }

    @Override // p000.ge3
    /* JADX INFO: renamed from: f */
    public final void mo12512f(AbstractC0638f abstractC0638f, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, View view) {
        if (abstractComponentCallbacksC0635c == this.f49590a) {
            abstractC0638f.m2176l0(this);
            hy7.m13580k(view, this.f49591b);
        }
    }
}
