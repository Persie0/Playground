package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: cz */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0120cz extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Rect f10075a;

    public C0120cz(Rect rect) {
        this.f10075a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        return this.f10075a;
    }
}
