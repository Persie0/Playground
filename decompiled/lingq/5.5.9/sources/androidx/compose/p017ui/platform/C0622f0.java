package androidx.compose.p017ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import java.util.HashMap;
import java.util.Set;
import p496y1.C10278a;

/* JADX INFO: renamed from: androidx.compose.ui.platform.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622f0 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public final HashMap<C10278a, LayoutNode> f4309a;

    /* JADX INFO: renamed from: b */
    public final HashMap<LayoutNode, C10278a> f4310b;

    public C0622f0(Context context) {
        super(context);
        setClipChildren(false);
        this.f4309a = new HashMap<>();
        this.f4310b = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<C10278a, LayoutNode> getHolderToLayoutNode() {
        return this.f4309a;
    }

    public final HashMap<LayoutNode, C10278a> getLayoutNodeToHolder() {
        return this.f4310b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(View view, View view2) {
        C5207g.m11111f(view, "child");
        C5207g.m11111f(view2, "target");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Set<C10278a> setKeySet = this.f4309a.keySet();
        C5207g.m11110e(setKeySet, "holderToLayoutNode.keys");
        for (C10278a c10278a : setKeySet) {
            c10278a.layout(c10278a.getLeft(), c10278a.getTop(), c10278a.getRight(), c10278a.getBottom());
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (!(View.MeasureSpec.getMode(i10) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!(View.MeasureSpec.getMode(i11) == 1073741824)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        Set<C10278a> setKeySet = this.f4309a.keySet();
        C5207g.m11110e(setKeySet, "holderToLayoutNode.keys");
        for (C10278a c10278a : setKeySet) {
            int i13 = c10278a.f51734l;
            if (i13 != Integer.MIN_VALUE && (i12 = c10278a.f51722H) != Integer.MIN_VALUE) {
                c10278a.measure(i13, i12);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            LayoutNode layoutNode = this.f4309a.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.C0530b c0530b = LayoutNode.f3741d0;
                layoutNode.m2114J(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
