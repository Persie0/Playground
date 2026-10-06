package p000;

import android.animation.AnimatorInflater;
import android.animation.LayoutTransition;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.camcorder.p008ui.modeslider.recordspeed.RecordSpeedSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class daf implements ibl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RecordSpeedSlider f10240a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ dag f10241b;

    public daf(dag dagVar, RecordSpeedSlider recordSpeedSlider) {
        this.f10241b = dagVar;
        this.f10240a = recordSpeedSlider;
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: a */
    public final void mo5803a(View view, int i, boolean z) {
        dag dagVar = this.f10241b;
        if (!dagVar.f10245d) {
            dagVar.f10246e.m5823n(dagVar.f10247f, i);
        }
        if (z && this.f10241b.f10246e.f10259l) {
            npk.m17604h(view);
        }
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: b */
    public final void mo5804b(View view, boolean z) {
        RecordSpeedSlider recordSpeedSlider = (RecordSpeedSlider) view;
        dag dagVar = this.f10241b;
        if (dagVar.f10245d) {
            if (dagVar.f10246e.f10249b.get() != recordSpeedSlider.m4070a()) {
                this.f10241b.f10246e.mo5818i(false);
                this.f10241b.f10246e.f10249b.set(recordSpeedSlider.m4070a());
            } else {
                dah dahVar = this.f10241b.f10246e;
                dahVar.f10250c.setClickable(true);
                dahVar.f10254g.mo11013l(true);
                dahVar.f10255h.mo11197E(true);
                dahVar.f10252e.m7600g(1);
            }
            dag dagVar2 = this.f10241b;
            dagVar2.f10246e.m5823n(dagVar2.f10247f, recordSpeedSlider.m4070a());
        }
        if (recordSpeedSlider.m4078i()) {
            int iM4070a = recordSpeedSlider.m4070a();
            dah dahVar2 = this.f10241b.f10246e;
            if (iM4070a == dahVar2.f10260m) {
                dahVar2.m5811b();
                this.f10241b.f10246e.mo5818i(false);
                LayoutTransition layoutTransition = recordSpeedSlider.getLayoutTransition();
                layoutTransition.setAnimator(3, AnimatorInflater.loadAnimator(recordSpeedSlider.getContext(), C0100R.animator.anim_options_fade_out));
                layoutTransition.addTransitionListener(new dae(this));
                recordSpeedSlider.getLayoutParams().width = this.f10241b.f10242a;
                recordSpeedSlider.removeAllViews();
            }
        }
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: c */
    public final void mo5805c(boolean z) {
        this.f10241b.f10246e.f10249b.set(this.f10240a.m4070a());
        if (z) {
            dag dagVar = this.f10241b;
            if (dagVar.f10245d) {
                dagVar.f10246e.m5811b();
            }
        }
    }
}
