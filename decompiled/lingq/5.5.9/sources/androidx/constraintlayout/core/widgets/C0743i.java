package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.widget.ConstraintLayout;
import p061d2.C5039b;
import p083e2.C5354b;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.i */
/* JADX INFO: loaded from: classes.dex */
public class C0743i extends C5039b {

    /* JADX INFO: renamed from: y0 */
    public int f5043y0 = 0;

    /* JADX INFO: renamed from: z0 */
    public int f5044z0 = 0;

    /* JADX INFO: renamed from: A0 */
    public int f5034A0 = 0;

    /* JADX INFO: renamed from: B0 */
    public int f5035B0 = 0;

    /* JADX INFO: renamed from: C0 */
    public int f5036C0 = 0;

    /* JADX INFO: renamed from: D0 */
    public int f5037D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public boolean f5038E0 = false;

    /* JADX INFO: renamed from: F0 */
    public int f5039F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f5040G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public final C5354b.a f5041H0 = new C5354b.a();

    /* JADX INFO: renamed from: I0 */
    public C5354b.b f5042I0 = null;

    /* JADX INFO: renamed from: V */
    public void mo2769V(int i10, int i11, int i12, int i13) {
    }

    /* JADX INFO: renamed from: W */
    public final void m2782W(ConstraintWidget constraintWidget, ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i10, ConstraintWidget.DimensionBehaviour dimensionBehaviour2, int i11) {
        C5354b.b bVar;
        ConstraintWidget constraintWidget2;
        while (true) {
            bVar = this.f5042I0;
            if (bVar != null || (constraintWidget2 = this.f4858W) == null) {
                break;
            } else {
                this.f5042I0 = ((C0738d) constraintWidget2).f4962A0;
            }
        }
        C5354b.a aVar = this.f5041H0;
        aVar.f33661a = dimensionBehaviour;
        aVar.f33662b = dimensionBehaviour2;
        aVar.f33663c = i10;
        aVar.f33664d = i11;
        ((ConstraintLayout.C0760c) bVar).m2873b(constraintWidget, aVar);
        constraintWidget.m2717R(aVar.f33665e);
        constraintWidget.m2714O(aVar.f33666f);
        constraintWidget.f4841F = aVar.f33668h;
        int i12 = aVar.f33667g;
        constraintWidget.f4869d0 = i12;
        constraintWidget.f4841F = i12 > 0;
    }

    @Override // p061d2.C5039b, p061d2.InterfaceC5038a
    /* JADX INFO: renamed from: c */
    public final void mo2783c() {
        for (int i10 = 0; i10 < this.f32871x0; i10++) {
            ConstraintWidget constraintWidget = this.f32870w0[i10];
            if (constraintWidget != null) {
                constraintWidget.f4843H = true;
            }
        }
    }
}
