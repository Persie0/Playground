package p061d2;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p083e2.C5359g;
import p083e2.C5362j;

/* JADX INFO: renamed from: d2.b */
/* JADX INFO: loaded from: classes.dex */
public class C5039b extends ConstraintWidget implements InterfaceC5038a {

    /* JADX INFO: renamed from: w0 */
    public ConstraintWidget[] f32870w0 = new ConstraintWidget[4];

    /* JADX INFO: renamed from: x0 */
    public int f32871x0 = 0;

    /* JADX INFO: renamed from: U */
    public final void m10721U(int i10, C5362j c5362j, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f32871x0; i11++) {
            ConstraintWidget constraintWidget = this.f32870w0[i11];
            ArrayList<ConstraintWidget> arrayList2 = c5362j.f33685a;
            if (!arrayList2.contains(constraintWidget)) {
                arrayList2.add(constraintWidget);
            }
        }
        for (int i12 = 0; i12 < this.f32871x0; i12++) {
            C5359g.m11496a(this.f32870w0[i12], i10, arrayList, c5362j);
        }
    }

    @Override // p061d2.InterfaceC5038a
    /* JADX INFO: renamed from: a */
    public final void mo10719a() {
        this.f32871x0 = 0;
        Arrays.fill(this.f32870w0, (Object) null);
    }

    @Override // p061d2.InterfaceC5038a
    /* JADX INFO: renamed from: b */
    public final void mo10720b(ConstraintWidget constraintWidget) {
        if (constraintWidget == this || constraintWidget == null) {
            return;
        }
        int i10 = this.f32871x0 + 1;
        ConstraintWidget[] constraintWidgetArr = this.f32870w0;
        if (i10 > constraintWidgetArr.length) {
            this.f32870w0 = (ConstraintWidget[]) Arrays.copyOf(constraintWidgetArr, constraintWidgetArr.length * 2);
        }
        ConstraintWidget[] constraintWidgetArr2 = this.f32870w0;
        int i11 = this.f32871x0;
        constraintWidgetArr2[i11] = constraintWidget;
        this.f32871x0 = i11 + 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo2783c() {
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: j */
    public void mo2726j(ConstraintWidget constraintWidget, HashMap<ConstraintWidget, ConstraintWidget> map) {
        super.mo2726j(constraintWidget, map);
        C5039b c5039b = (C5039b) constraintWidget;
        this.f32871x0 = 0;
        int i10 = c5039b.f32871x0;
        for (int i11 = 0; i11 < i10; i11++) {
            mo10720b(map.get(c5039b.f32870w0[i11]));
        }
    }
}
