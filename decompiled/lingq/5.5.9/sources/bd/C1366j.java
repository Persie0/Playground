package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1366j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1368l f8244a;

    public C1366j(AbstractC1368l abstractC1368l) {
        this.f8244a = abstractC1368l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        AbstractC1368l abstractC1368l = this.f8244a;
        ArrayList arrayList = abstractC1368l.f8252f;
        if (arrayList != null && !abstractC1368l.f8253g) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC9640c) it.next()).mo8668b(abstractC1368l);
            }
        }
    }
}
