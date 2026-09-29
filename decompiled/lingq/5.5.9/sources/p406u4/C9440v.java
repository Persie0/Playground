package p406u4;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.linguist.R;
import java.util.WeakHashMap;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: renamed from: u4.v */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ViewConstructor"})
public final class C9440v extends ViewGroup implements InterfaceC9436t {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f48415g = 0;

    /* JADX INFO: renamed from: a */
    public ViewGroup f48416a;

    /* JADX INFO: renamed from: b */
    public View f48417b;

    /* JADX INFO: renamed from: c */
    public final View f48418c;

    /* JADX INFO: renamed from: d */
    public int f48419d;

    /* JADX INFO: renamed from: e */
    public Matrix f48420e;

    /* JADX INFO: renamed from: f */
    public final a f48421f;

    /* JADX INFO: renamed from: u4.v$a */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            C9440v c9440v = C9440v.this;
            C10029b0.d.m18674k(c9440v);
            ViewGroup viewGroup = c9440v.f48416a;
            if (viewGroup != null && (view = c9440v.f48417b) != null) {
                viewGroup.endViewTransition(view);
                C10029b0.d.m18674k(c9440v.f48416a);
                c9440v.f48416a = null;
                c9440v.f48417b = null;
            }
            return true;
        }
    }

    public C9440v(View view) {
        super(view.getContext());
        this.f48421f = new a();
        this.f48418c = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m17840a(View view, ViewGroup viewGroup) {
        C9433r0.m17830a(viewGroup, viewGroup.getLeft(), viewGroup.getTop(), view.getWidth() + viewGroup.getLeft(), view.getHeight() + viewGroup.getTop());
    }

    @Override // p406u4.InterfaceC9436t
    /* JADX INFO: renamed from: b */
    public final void mo11403b(ViewGroup viewGroup, View view) {
        this.f48416a = viewGroup;
        this.f48417b = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        View view = this.f48418c;
        view.setTag(R.id.ghost_view, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f48421f);
        C9433r0.m17832c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f48418c;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f48421f);
        C9433r0.m17832c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C9402c.m17759a(canvas, true);
        canvas.setMatrix(this.f48420e);
        View view = this.f48418c;
        C9433r0.m17832c(view, 0);
        view.invalidate();
        C9433r0.m17832c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        C9402c.m17759a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View, p406u4.InterfaceC9436t
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f48418c;
        if (((C9440v) view.getTag(R.id.ghost_view)) == this) {
            C9433r0.m17832c(view, i10 == 0 ? 4 : 0);
        }
    }
}
