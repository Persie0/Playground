package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.feature.reader.shared.p018ui.components.ReaderProgressBar;

/* JADX INFO: loaded from: classes3.dex */
public final class fw7 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderFragment f39808a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ we3 f39809b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f39810c;

    public fw7(ReaderFragment readerFragment, we3 we3Var, boolean z) {
        this.f39808a = readerFragment;
        this.f39809b = we3Var;
        this.f39810c = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        animator.getClass();
        ReaderFragment readerFragment = this.f39808a;
        if (readerFragment.f5692d0 == null || !readerFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.STARTED)) {
            return;
        }
        we3 we3Var = this.f39809b;
        LinearLayout linearLayout = we3Var.f66707m.f34901c;
        boolean z = this.f39810c;
        linearLayout.setVisibility(z ? 0 : 8);
        if (z) {
            return;
        }
        ReaderProgressBar readerProgressBar = we3Var.f66708n;
        if (!readerProgressBar.f30425d0) {
            readerProgressBar.f30425d0 = true;
            readerProgressBar.m9428l();
            readerProgressBar.postDelayed(new oy7(readerProgressBar, 3), readerProgressBar.f30410P);
        }
    }
}
