package p000;

import android.graphics.Rect;
import com.lingq.core.domain.model.onboarding.TooltipStep;

/* JADX INFO: loaded from: classes.dex */
public interface e7a {
    /* JADX INFO: renamed from: k0 */
    static /* synthetic */ void m10913k0(e7a e7aVar, y5a y5aVar, Rect rect, Rect rect2, boolean z, ui3 ui3Var, int i) {
        if ((i & 4) != 0) {
            rect2 = new Rect();
        }
        e7aVar.mo8775s(y5aVar, rect, rect2, false, (i & 16) != 0 ? false : z, (i & 32) == 0, ui3Var);
    }

    /* JADX INFO: renamed from: A0 */
    void mo8733A0(boolean z);

    /* JADX INFO: renamed from: D1 */
    c83 mo8736D1();

    /* JADX INFO: renamed from: G */
    void mo8740G(TooltipStep tooltipStep);

    /* JADX INFO: renamed from: L */
    void mo8742L(TooltipStep tooltipStep);

    /* JADX INFO: renamed from: P0 */
    boolean mo8744P0(TooltipStep tooltipStep);

    /* JADX INFO: renamed from: Q */
    void mo8745Q();

    /* JADX INFO: renamed from: Z0 */
    boolean mo8753Z0(TooltipStep tooltipStep);

    /* JADX INFO: renamed from: d1 */
    void mo8759d1();

    /* JADX INFO: renamed from: g */
    eh9 mo8763g();

    /* JADX INFO: renamed from: i1 */
    void mo8766i1();

    /* JADX INFO: renamed from: j0 */
    void mo8768j0(boolean z);

    /* JADX INFO: renamed from: q0 */
    c83 mo8771q0();

    /* JADX INFO: renamed from: s */
    void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var);

    /* JADX INFO: renamed from: t0 */
    void mo8777t0();

    /* JADX INFO: renamed from: u0 */
    c83 mo8778u0();

    /* JADX INFO: renamed from: w */
    c83 mo8780w();

    /* JADX INFO: renamed from: y0 */
    c83 mo8781y0();
}
