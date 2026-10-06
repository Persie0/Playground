package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ate extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ati f2296a;

    public ate(ati atiVar) {
        this.f2296a = atiVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f2296a.f2305c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((atc) arrayList.get(i)).mo1979b(this.f2296a);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ArrayList arrayList = new ArrayList(this.f2296a.f2305c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((atc) arrayList.get(i)).mo1980c(this.f2296a);
        }
    }
}
