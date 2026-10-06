package p000;

import android.graphics.Rect;
import android.transition.Transition;

/* JADX INFO: renamed from: dd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0125dd extends Transition.EpicenterCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Rect f10544a;

    public C0125dd(Rect rect) {
        this.f10544a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        if (this.f10544a.isEmpty()) {
            return null;
        }
        return this.f10544a;
    }
}
