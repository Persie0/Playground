package com.google.android.material.transformation;

import ae.C0062b;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.linguist.R;
import java.util.HashMap;
import java.util.WeakHashMap;
import p177ic.C6314g;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* JADX INFO: renamed from: i */
    public HashMap f15881i;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* JADX INFO: renamed from: s */
    public final void mo8933s(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f15881i = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C0771f) && (((CoordinatorLayout.C0771f) childAt.getLayoutParams()).f5550a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (z10) {
                        this.f15881i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                        C10029b0.d.m18682s(childAt, 4);
                    } else {
                        HashMap map = this.f15881i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.f15881i.get(childAt)).intValue();
                            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
                            C10029b0.d.m18682s(childAt, iIntValue);
                        }
                    }
                }
            }
            if (!z10) {
                this.f15881i = null;
            }
        }
        super.mo8933s(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* JADX INFO: renamed from: z */
    public final FabTransformationBehavior.C3105b mo8940z(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        FabTransformationBehavior.C3105b c3105b = new FabTransformationBehavior.C3105b();
        c3105b.f15875a = C6314g.m12939a(i10, context);
        c3105b.f15876b = new C0062b();
        return c3105b;
    }
}
