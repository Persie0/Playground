package p000;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientModeSupport;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class dae implements LayoutTransition.TransitionListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ daf f10239a;

    public dae(daf dafVar) {
        this.f10239a = dafVar;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        AmbientModeSupport.AmbientController ambientController = this.f10239a.f10241b.f10246e.f10263p;
        if (ambientController != null) {
            ((dab) ambientController.f1702a).m5797i(ikw.VIDEO);
        }
        layoutTransition.removeTransitionListener(this);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        AmbientModeSupport.AmbientController ambientController = this.f10239a.f10241b.f10246e.f10263p;
        if (ambientController != null) {
            ((dab) ambientController.f1702a).m5800l(ikw.VIDEO);
        }
    }
}
