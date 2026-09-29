package p000;

import android.os.Handler;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes2.dex */
public final class kf3 implements rb5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47122a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47123b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f47124c;

    public kf3(hy7 hy7Var, kg3 kg3Var) {
        this.f47122a = 0;
        this.f47124c = hy7Var;
        this.f47123b = kg3Var;
    }

    @Override // p000.rb5
    /* JADX INFO: renamed from: c */
    public final void mo399c(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        int i = this.f47122a;
        Object obj = this.f47124c;
        Object obj2 = this.f47123b;
        switch (i) {
            case 0:
                kg3 kg3Var = (kg3) obj2;
                hy7 hy7Var = (hy7) obj;
                if (!hy7Var.f43207e.m2144Q()) {
                    ub5Var.mo256K().mo21331x(this);
                    if (((FrameLayout) kg3Var.f53781a).isAttachedToWindow()) {
                        hy7Var.m13589o(kg3Var);
                    }
                    break;
                }
                break;
            case 1:
                if (lifecycle$Event == Lifecycle$Event.ON_DESTROY) {
                    ((Handler) obj2).removeCallbacks((RunnableC3468pp) obj);
                    ub5Var.mo256K().mo21331x(this);
                }
                break;
            default:
                if (lifecycle$Event == Lifecycle$Event.ON_START) {
                    ((AbstractC3572sf) obj2).mo21331x(this);
                    ((fs6) obj).m12096K();
                }
                break;
        }
    }

    public /* synthetic */ kf3(int i, Object obj, Object obj2) {
        this.f47122a = i;
        this.f47123b = obj;
        this.f47124c = obj2;
    }
}
