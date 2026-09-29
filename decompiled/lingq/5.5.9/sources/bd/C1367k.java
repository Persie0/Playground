package bd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p428v4.AbstractC9640c;

/* JADX INFO: renamed from: bd.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1367k extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC1368l f8245a;

    public C1367k(AbstractC1368l abstractC1368l) {
        this.f8245a = abstractC1368l;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        AbstractC1368l abstractC1368l = this.f8245a;
        super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
        ArrayList arrayList = abstractC1368l.f8252f;
        if (arrayList != null && !abstractC1368l.f8253g) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AbstractC9640c) it.next()).mo4937a(abstractC1368l);
            }
        }
    }
}
