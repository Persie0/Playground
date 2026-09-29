package p083e2;

import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C5354b {

    /* JADX INFO: renamed from: a */
    public final ArrayList<ConstraintWidget> f33658a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final a f33659b = new a();

    /* JADX INFO: renamed from: c */
    public final C0738d f33660c;

    /* JADX INFO: renamed from: e2.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public ConstraintWidget.DimensionBehaviour f33661a;

        /* JADX INFO: renamed from: b */
        public ConstraintWidget.DimensionBehaviour f33662b;

        /* JADX INFO: renamed from: c */
        public int f33663c;

        /* JADX INFO: renamed from: d */
        public int f33664d;

        /* JADX INFO: renamed from: e */
        public int f33665e;

        /* JADX INFO: renamed from: f */
        public int f33666f;

        /* JADX INFO: renamed from: g */
        public int f33667g;

        /* JADX INFO: renamed from: h */
        public boolean f33668h;

        /* JADX INFO: renamed from: i */
        public boolean f33669i;

        /* JADX INFO: renamed from: j */
        public int f33670j;
    }

    /* JADX INFO: renamed from: e2.b$b */
    public interface b {
    }

    public C5354b(C0738d c0738d) {
        this.f33660c = c0738d;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m11477a(int i10, ConstraintWidget constraintWidget, b bVar) {
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
        a aVar = this.f33659b;
        aVar.f33661a = dimensionBehaviour;
        boolean z10 = true;
        aVar.f33662b = dimensionBehaviourArr[1];
        aVar.f33663c = constraintWidget.m2735u();
        aVar.f33664d = constraintWidget.m2731o();
        aVar.f33669i = false;
        aVar.f33670j = i10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f33661a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        boolean z11 = dimensionBehaviour2 == dimensionBehaviour3;
        boolean z12 = aVar.f33662b == dimensionBehaviour3;
        boolean z13 = z11 && constraintWidget.f4861Z > 0.0f;
        boolean z14 = z12 && constraintWidget.f4861Z > 0.0f;
        int[] iArr = constraintWidget.f4902u;
        if (z13 && iArr[0] == 4) {
            aVar.f33661a = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        if (z14 && iArr[1] == 4) {
            aVar.f33662b = ConstraintWidget.DimensionBehaviour.FIXED;
        }
        ((ConstraintLayout.C0760c) bVar).m2873b(constraintWidget, aVar);
        constraintWidget.m2717R(aVar.f33665e);
        constraintWidget.m2714O(aVar.f33666f);
        constraintWidget.f4841F = aVar.f33668h;
        int i11 = aVar.f33667g;
        constraintWidget.f4869d0 = i11;
        if (i11 <= 0) {
            z10 = false;
        }
        constraintWidget.f4841F = z10;
        aVar.f33670j = 0;
        return aVar.f33669i;
    }

    /* JADX INFO: renamed from: b */
    public final void m11478b(C0738d c0738d, int i10, int i11, int i12) {
        int i13 = c0738d.f4871e0;
        int i14 = c0738d.f4873f0;
        c0738d.f4871e0 = 0;
        c0738d.f4873f0 = 0;
        c0738d.m2717R(i11);
        c0738d.m2714O(i12);
        if (i13 < 0) {
            c0738d.f4871e0 = 0;
        } else {
            c0738d.f4871e0 = i13;
        }
        if (i14 < 0) {
            c0738d.f4873f0 = 0;
        } else {
            c0738d.f4873f0 = i14;
        }
        C0738d c0738d2 = this.f33660c;
        c0738d2.f4982z0 = i10;
        c0738d2.mo2764U();
    }

    /* JADX INFO: renamed from: c */
    public final void m11479c(C0738d c0738d) {
        ArrayList<ConstraintWidget> arrayList = this.f33658a;
        arrayList.clear();
        int size = c0738d.f32872w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = c0738d.f32872w0.get(i10);
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            if (dimensionBehaviour == dimensionBehaviour2 || dimensionBehaviourArr[1] == dimensionBehaviour2) {
                arrayList.add(constraintWidget);
            }
        }
        c0738d.f4981y0.f33674b = true;
    }
}
