package androidx.compose.p017ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import com.linguist.R;
import dm.C5207g;
import p387t0.C9139d;
import p387t0.C9141e;
import p387t0.InterfaceC9165q;

/* JADX INFO: renamed from: androidx.compose.ui.platform.o0 */
/* JADX INFO: loaded from: classes.dex */
public class C0649o0 extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public boolean f4331a;

    public C0649o0(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: a */
    public final void m2426a(InterfaceC9165q interfaceC9165q, View view, long j10) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        C5207g.m11111f(view, "view");
        Canvas canvas = C9141e.f47648a;
        super.drawChild(((C9139d) interfaceC9165q).f47644a, view, j10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        C5207g.m11111f(canvas, "canvas");
        int childCount = super.getChildCount();
        int i10 = 0;
        while (true) {
            if (i10 >= childCount) {
                z10 = false;
                break;
            }
            View childAt = getChildAt(i10);
            C5207g.m11109d(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).f4228h) {
                z10 = true;
                break;
            }
            i10++;
        }
        if (z10) {
            this.f4331a = true;
            try {
                super.dispatchDraw(canvas);
                this.f4331a = false;
            } catch (Throwable th2) {
                this.f4331a = false;
                throw th2;
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f4331a) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }
}
