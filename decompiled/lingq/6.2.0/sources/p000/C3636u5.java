package p000;

import android.content.Context;
import android.view.View;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.C0035b;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3636u5 extends ww5 {

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ int f63409m = 1;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ C0035b f63410n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636u5(C0035b c0035b, Context context, om9 om9Var, View view) {
        super(R$attr.actionOverflowMenuStyle, 0, om9Var, context, view, false);
        this.f63410n = c0035b;
        if ((om9Var.f54591A.f51965x & 32) != 32) {
            View view2 = c0035b.f1223j;
            this.f67417f = view2 == null ? (View) c0035b.f1221h : view2;
        }
        m58 m58Var = c0035b.f1212S;
        this.f67420i = m58Var;
        uw5 uw5Var = this.f67421j;
        if (uw5Var != null) {
            uw5Var.mo709i(m58Var);
        }
    }

    @Override // p000.ww5
    /* JADX INFO: renamed from: d */
    public final void mo22470d() {
        int i = this.f63409m;
        C0035b c0035b = this.f63410n;
        switch (i) {
            case 0:
                c0035b.f1209P = null;
                c0035b.f1213T = 0;
                super.mo22470d();
                break;
            default:
                hw5 hw5Var = c0035b.f1216c;
                if (hw5Var != null) {
                    hw5Var.m13520c(true);
                }
                c0035b.f1208O = null;
                super.mo22470d();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3636u5(C0035b c0035b, Context context, hw5 hw5Var, View view) {
        super(R$attr.actionOverflowMenuStyle, 0, hw5Var, context, view, true);
        this.f63410n = c0035b;
        this.f67418g = 8388613;
        m58 m58Var = c0035b.f1212S;
        this.f67420i = m58Var;
        uw5 uw5Var = this.f67421j;
        if (uw5Var != null) {
            uw5Var.mo709i(m58Var);
        }
    }
}
