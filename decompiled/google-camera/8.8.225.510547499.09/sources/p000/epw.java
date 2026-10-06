package p000;

import android.view.View;
import com.google.android.apps.camera.p014ui.modeslider.ModeSlider;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class epw implements ibl {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f15055a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f15056b;

    public epw(dab dabVar, int i) {
        this.f15056b = i;
        this.f15055a = dabVar;
    }

    public epw(epx epxVar, int i) {
        this.f15056b = i;
        this.f15055a = epxVar;
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: c */
    public final void mo5805c(boolean z) {
        switch (this.f15056b) {
            case 0:
                break;
            default:
                if (z) {
                    dab dabVar = (dab) this.f15055a;
                    dabVar.f10207b.setClickable(false);
                    dabVar.f10212g.mo11013l(false);
                    dabVar.f10213h.mo11197E(false);
                    dabVar.f10209d.m7600g(2);
                }
                break;
        }
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: a */
    public final void mo5803a(View view, int i, boolean z) {
        switch (this.f15056b) {
            case 0:
                if (z) {
                    npk.m17604h(view);
                }
                break;
            default:
                if (z) {
                    view.performHapticFeedback(4);
                }
                break;
        }
    }

    @Override // p000.ibl
    /* JADX INFO: renamed from: b */
    public final void mo5804b(View view, boolean z) {
        switch (this.f15056b) {
            case 0:
                ModeSlider modeSlider = (ModeSlider) view;
                eqz eqzVar = (eqz) modeSlider.m4378f(modeSlider.m4376a()).f30189a;
                jww jwwVar = ((epx) this.f15055a).f15057a;
                eqzVar.getClass();
                jwwVar.mo3415bf(eqzVar);
                break;
            default:
                ModeSlider modeSlider2 = (ModeSlider) view;
                ikw ikwVar = (ikw) modeSlider2.m4378f(modeSlider2.m4376a()).f30189a;
                Object obj = this.f15055a;
                ikwVar.getClass();
                if (((dab) obj).m5800l(ikwVar)) {
                    ((dab) this.f15055a).m5797i(ikwVar);
                } else if (z) {
                    ((dab) this.f15055a).m5791a();
                }
                break;
        }
    }
}
