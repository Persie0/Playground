package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: androidx.fragment.app.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967n0 extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Rect f6373a;

    public C0967n0(Rect rect) {
        this.f6373a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f6373a;
    }
}
