package p061d2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import p023b2.C1292a;

/* JADX INFO: renamed from: d2.c */
/* JADX INFO: loaded from: classes.dex */
public class C5040c extends ConstraintWidget {

    /* JADX INFO: renamed from: w0 */
    public ArrayList<ConstraintWidget> f32872w0 = new ArrayList<>();

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: G */
    public void mo2708G() {
        this.f32872w0.clear();
        super.mo2708G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: J */
    public final void mo2711J(C1292a c1292a) {
        super.mo2711J(c1292a);
        int size = this.f32872w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32872w0.get(i10).mo2711J(c1292a);
        }
    }

    /* JADX INFO: renamed from: U */
    public void mo2764U() {
        ArrayList<ConstraintWidget> arrayList = this.f32872w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f32872w0.get(i10);
            if (constraintWidget instanceof C5040c) {
                ((C5040c) constraintWidget).mo2764U();
            }
        }
    }
}
