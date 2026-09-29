package p000;

import android.view.View;
import androidx.fragment.app.SpecialEffectsController$Operation$State;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f82 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38608a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p82 f38609b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ze9 f38610c;

    public /* synthetic */ f82(p82 p82Var, ze9 ze9Var, int i) {
        this.f38608a = i;
        this.f38609b = p82Var;
        this.f38610c = ze9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f38608a;
        ze9 ze9Var = this.f38610c;
        p82 p82Var = this.f38609b;
        switch (i) {
            case 0:
                p82Var.m18953a(ze9Var);
                break;
            case 1:
                if (p82Var.f55724b.contains(ze9Var)) {
                    SpecialEffectsController$Operation$State specialEffectsController$Operation$State = ze9Var.f71464a;
                    View view = ze9Var.f71466c.f5692d0;
                    view.getClass();
                    specialEffectsController$Operation$State.applyState(view, p82Var.f55723a);
                }
                break;
            default:
                p82Var.f55724b.remove(ze9Var);
                p82Var.f55725c.remove(ze9Var);
                break;
        }
    }
}
