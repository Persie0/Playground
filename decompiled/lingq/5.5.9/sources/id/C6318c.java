package id;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;
import com.google.android.material.slider.BaseSlider;
import java.util.Iterator;
import p277nd.C7739a;
import p387t0.C9166r;
import p507yc.C10347n;

/* JADX INFO: renamed from: id.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6318c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseSlider f36542a;

    public C6318c(BaseSlider baseSlider) {
        this.f36542a = baseSlider;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        BaseSlider baseSlider = this.f36542a;
        C9166r c9166rM19364d = C10347n.m19364d(baseSlider);
        Iterator it = baseSlider.f15507k.iterator();
        while (it.hasNext()) {
            ((ViewOverlay) c9166rM19364d.f47694a).remove((C7739a) it.next());
        }
    }
}
