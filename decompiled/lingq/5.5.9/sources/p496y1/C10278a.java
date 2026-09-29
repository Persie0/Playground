package p496y1;

import ae.C0062b;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.p544savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.view.InterfaceC1051q;
import androidx.view.ViewTreeLifecycleOwner;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import dm.C5207g;
import p081e0.InterfaceC5302d;
import p260m8.C7499b;
import p270n4.InterfaceC7706c;
import p470x1.InterfaceC10015c;
import p471x2.InterfaceC10056p;
import sl.C9072e;

/* JADX INFO: renamed from: y1.a */
/* JADX INFO: loaded from: classes.dex */
public class C10278a extends ViewGroup implements InterfaceC10056p, InterfaceC5302d {

    /* JADX INFO: renamed from: H */
    public int f51722H;

    /* JADX INFO: renamed from: a */
    public View f51723a;

    /* JADX INFO: renamed from: b */
    public InterfaceC2041a<C9072e> f51724b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2041a<C9072e> f51725c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2041a<C9072e> f51726d;

    /* JADX INFO: renamed from: e */
    public InterfaceC0500b f51727e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2052l<? super InterfaceC0500b, C9072e> f51728f;

    /* JADX INFO: renamed from: g */
    public InterfaceC10015c f51729g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2052l<? super InterfaceC10015c, C9072e> f51730h;

    /* JADX INFO: renamed from: i */
    public InterfaceC1051q f51731i;

    /* JADX INFO: renamed from: j */
    public InterfaceC7706c f51732j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2052l<? super Boolean, C9072e> f51733k;

    /* JADX INFO: renamed from: l */
    public int f51734l;

    @Override // p081e0.InterfaceC5302d
    /* JADX INFO: renamed from: a */
    public final void mo2118a() {
        this.f51726d.mo807E();
    }

    @Override // p471x2.InterfaceC10056p
    /* JADX INFO: renamed from: e */
    public final void mo964e(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        C5207g.m11111f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            C7499b.m14932c(f3 * f10, i11 * f10);
            C7499b.m14932c(i12 * f10, i13 * f10);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(null);
        throw null;
    }

    public final InterfaceC10015c getDensity() {
        return this.f51729g;
    }

    public final View getInteropView() {
        return this.f51723a;
    }

    public final LayoutNode getLayoutNode() {
        return null;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams;
        View view = this.f51723a;
        return (view == null || (layoutParams = view.getLayoutParams()) == null) ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC1051q getLifecycleOwner() {
        return this.f51731i;
    }

    public final InterfaceC0500b getModifier() {
        return this.f51727e;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        throw null;
    }

    public final InterfaceC2052l<InterfaceC10015c, C9072e> getOnDensityChanged$ui_release() {
        return this.f51730h;
    }

    public final InterfaceC2052l<InterfaceC0500b, C9072e> getOnModifierChanged$ui_release() {
        return this.f51728f;
    }

    public final InterfaceC2052l<Boolean, C9072e> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.f51733k;
    }

    public final InterfaceC2041a<C9072e> getRelease() {
        return this.f51726d;
    }

    public final InterfaceC2041a<C9072e> getReset() {
        return this.f51725c;
    }

    public final InterfaceC7706c getSavedStateRegistryOwner() {
        return this.f51732j;
    }

    public final InterfaceC2041a<C9072e> getUpdate() {
        return this.f51724b;
    }

    public final View getView() {
        return this.f51723a;
    }

    @Override // p081e0.InterfaceC5302d
    /* JADX INFO: renamed from: h */
    public final void mo2119h() {
        View view = this.f51723a;
        C5207g.m11108c(view);
        if (view.getParent() != this) {
            addView(this.f51723a);
        } else {
            this.f51725c.mo807E();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        throw null;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        View view = this.f51723a;
        return view != null ? view.isNestedScrollingEnabled() : super.isNestedScrollingEnabled();
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: k */
    public final void mo970k(View view, int i10, int i11, int i12, int i13, int i14) {
        C5207g.m11111f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            C7499b.m14932c(f3 * f10, i11 * f10);
            C7499b.m14932c(i12 * f10, i13 * f10);
            throw null;
        }
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: l */
    public final boolean mo971l(View view, View view2, int i10, int i11) {
        C5207g.m11111f(view, "child");
        C5207g.m11111f(view2, "target");
        boolean z10 = true;
        if ((i10 & 2) == 0) {
            z10 = (i10 & 1) != 0;
        }
        return z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: m */
    public final void mo972m(View view, View view2, int i10, int i11) {
        C5207g.m11111f(view, "child");
        C5207g.m11111f(view2, "target");
        throw null;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: n */
    public final void mo973n(View view, int i10) {
        C5207g.m11111f(view, "target");
        throw null;
    }

    @Override // p471x2.InterfaceC10054o
    /* JADX INFO: renamed from: o */
    public final void mo974o(View view, int i10, int i11, int[] iArr, int i12) {
        C5207g.m11111f(view, "target");
        if (isNestedScrollingEnabled()) {
            float f3 = i10;
            float f10 = -1;
            C7499b.m14932c(f3 * f10, i11 * f10);
            throw null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        C5207g.m11111f(view, "child");
        C5207g.m11111f(view2, "target");
        super.onDescendantInvalidated(view, view2);
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f51723a;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        View view = this.f51723a;
        if ((view != null ? view.getParent() : null) != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            return;
        }
        View view2 = this.f51723a;
        if (view2 != null) {
            view2.measure(i10, i11);
        }
        View view3 = this.f51723a;
        int measuredHeight = 0;
        int measuredWidth = view3 != null ? view3.getMeasuredWidth() : 0;
        View view4 = this.f51723a;
        if (view4 != null) {
            measuredHeight = view4.getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        this.f51734l = i10;
        this.f51722H = i11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f3, float f10, boolean z10) {
        C5207g.m11111f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C0062b.m388r(f3 * (-1.0f), f10 * (-1.0f));
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f3, float f10) {
        C5207g.m11111f(view, "target");
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C0062b.m388r(f3 * (-1.0f), f10 * (-1.0f));
        throw null;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        InterfaceC2052l<? super Boolean, C9072e> interfaceC2052l = this.f51733k;
        if (interfaceC2052l != null) {
            interfaceC2052l.mo528n(Boolean.valueOf(z10));
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void setDensity(InterfaceC10015c interfaceC10015c) {
        C5207g.m11111f(interfaceC10015c, "value");
        if (interfaceC10015c != this.f51729g) {
            this.f51729g = interfaceC10015c;
            InterfaceC2052l<? super InterfaceC10015c, C9072e> interfaceC2052l = this.f51730h;
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(interfaceC10015c);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC1051q interfaceC1051q) {
        if (interfaceC1051q != this.f51731i) {
            this.f51731i = interfaceC1051q;
            ViewTreeLifecycleOwner.m3912b(this, interfaceC1051q);
        }
    }

    public final void setModifier(InterfaceC0500b interfaceC0500b) {
        C5207g.m11111f(interfaceC0500b, "value");
        if (interfaceC0500b != this.f51727e) {
            this.f51727e = interfaceC0500b;
            InterfaceC2052l<? super InterfaceC0500b, C9072e> interfaceC2052l = this.f51728f;
            if (interfaceC2052l != null) {
                interfaceC2052l.mo528n(interfaceC0500b);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(InterfaceC2052l<? super InterfaceC10015c, C9072e> interfaceC2052l) {
        this.f51730h = interfaceC2052l;
    }

    public final void setOnModifierChanged$ui_release(InterfaceC2052l<? super InterfaceC0500b, C9072e> interfaceC2052l) {
        this.f51728f = interfaceC2052l;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(InterfaceC2052l<? super Boolean, C9072e> interfaceC2052l) {
        this.f51733k = interfaceC2052l;
    }

    public final void setRelease(InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "<set-?>");
        this.f51726d = interfaceC2041a;
    }

    public final void setReset(InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "<set-?>");
        this.f51725c = interfaceC2041a;
    }

    public final void setSavedStateRegistryOwner(InterfaceC7706c interfaceC7706c) {
        if (interfaceC7706c != this.f51732j) {
            this.f51732j = interfaceC7706c;
            ViewTreeSavedStateRegistryOwner.m4583b(this, interfaceC7706c);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final void setUpdate(InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(interfaceC2041a, "value");
        this.f51724b = interfaceC2041a;
        throw null;
    }

    public final void setView$ui_release(View view) {
        if (view != this.f51723a) {
            this.f51723a = view;
            removeAllViewsInLayout();
            if (view == null) {
                return;
            }
            addView(view);
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }
}
