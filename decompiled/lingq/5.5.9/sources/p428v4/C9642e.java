package p428v4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: renamed from: v4.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9642e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9641d f49353a;

    public C9642e(C9641d c9641d) {
        this.f49353a = c9641d;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C9641d c9641d = this.f49353a;
        ArrayList arrayList = new ArrayList(c9641d.f49345e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC9640c) arrayList.get(i10)).mo4937a(c9641d);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C9641d c9641d = this.f49353a;
        ArrayList arrayList = new ArrayList(c9641d.f49345e);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((AbstractC9640c) arrayList.get(i10)).mo8668b(c9641d);
        }
    }
}
