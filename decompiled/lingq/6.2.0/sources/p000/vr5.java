package p000;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes2.dex */
public final class vr5 extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ int f65825E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ MaterialCalendar f65826F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr5(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.f65826F = materialCalendar;
        this.f65825E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: G0 */
    public final void mo2654G0(RecyclerView recyclerView, int i) {
        fo0 fo0Var = new fo0(recyclerView.getContext());
        fo0Var.f38889a = i;
        m24892H0(fo0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: J0 */
    public final void mo2655J0(k38 k38Var, int[] iArr) {
        MaterialCalendar materialCalendar = this.f65826F;
        RecyclerView recyclerView = materialCalendar.f12885D0;
        if (this.f65825E == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = materialCalendar.f12885D0.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = materialCalendar.f12885D0.getHeight();
        }
    }
}
