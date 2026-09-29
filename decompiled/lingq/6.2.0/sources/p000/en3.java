package p000;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.R$id;

/* JADX INFO: loaded from: classes2.dex */
public final class en3 extends ViewGroup {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f37553g = 0;

    /* JADX INFO: renamed from: a */
    public ViewGroup f37554a;

    /* JADX INFO: renamed from: b */
    public View f37555b;

    /* JADX INFO: renamed from: c */
    public final View f37556c;

    /* JADX INFO: renamed from: d */
    public int f37557d;

    /* JADX INFO: renamed from: e */
    public Matrix f37558e;

    /* JADX INFO: renamed from: f */
    public final mm1 f37559f;

    public en3(View view) {
        super(view.getContext());
        this.f37559f = new mm1(this, 1);
        this.f37556c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = R$id.ghost_view;
        View view = this.f37556c;
        view.setTag(i, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f37559f);
        r90 r90Var = awa.f7627a;
        view.setTransitionVisibility(4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f37556c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f37559f);
        r90 r90Var = awa.f7627a;
        view.setTransitionVisibility(0);
        view.setTag(R$id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        dn0.m10489b(canvas);
        canvas.setMatrix(this.f37558e);
        r90 r90Var = awa.f7627a;
        View view = this.f37556c;
        view.setTransitionVisibility(0);
        view.invalidate();
        view.setTransitionVisibility(4);
        drawChild(canvas, view, getDrawingTime());
        dn0.m10488a(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        int i2 = R$id.ghost_view;
        View view = this.f37556c;
        if (((en3) view.getTag(i2)) == this) {
            int i3 = i == 0 ? 4 : 0;
            r90 r90Var = awa.f7627a;
            view.setTransitionVisibility(i3);
        }
    }
}
