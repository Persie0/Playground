package p507yc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* JADX INFO: renamed from: yc.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10340g {

    /* JADX INFO: renamed from: a */
    public final ArrayList<b> f52035a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public ValueAnimator f52036b = null;

    /* JADX INFO: renamed from: c */
    public final a f52037c = new a();

    /* JADX INFO: renamed from: yc.g$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C10340g c10340g = C10340g.this;
            if (c10340g.f52036b == animator) {
                c10340g.f52036b = null;
            }
        }
    }

    /* JADX INFO: renamed from: yc.g$b */
    public static class b {
        public b(int[] iArr, ValueAnimator valueAnimator) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19351a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f52037c);
        this.f52035a.add(bVar);
    }
}
