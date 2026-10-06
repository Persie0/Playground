package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.camera.p014ui.views.ToggleUi;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ijc extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ToggleUi f31167a;

    public ijc(ToggleUi toggleUi) {
        this.f31167a = toggleUi;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        Duration duration = ToggleUi.f7276a;
        ToggleUi.ToggleButton toggleButton = this.f31167a.f7279c;
        float f = true != z ? 1.0f : 0.0f;
        toggleButton.setScaleX(f);
        this.f31167a.f7279c.setScaleY(f);
        ToggleUi toggleUi = this.f31167a;
        toggleUi.setAlpha(z ? 0.0f : toggleUi.f7283g);
        this.f31167a.setVisibility(true != z ? 0 : 8);
        this.f31167a.f7279c.f7286a = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        Duration duration = ToggleUi.f7276a;
        if (z) {
            return;
        }
        this.f31167a.setVisibility(0);
    }
}
