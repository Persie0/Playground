package androidx.compose.p017ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.appcompat.widget.C0308e0;
import cm.InterfaceC2052l;
import dm.C5207g;
import p007a6.C0045x;
import p387t0.C9139d;
import p387t0.C9166r;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9165q;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0679y0 implements InterfaceC0637k0 {

    /* JADX INFO: renamed from: a */
    public final RenderNode f4389a;

    public C0679y0(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "ownerView");
        C0308e0.m1171m();
        this.f4389a = C0045x.m183f();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: A */
    public final float mo2361A() {
        return this.f4389a.getAlpha();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: B */
    public final void mo2362B(float f3) {
        this.f4389a.setCameraDistance(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: D */
    public final void mo2363D(float f3) {
        this.f4389a.setRotationX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: E */
    public final void mo2364E(int i10) {
        this.f4389a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: F */
    public final int mo2365F() {
        return this.f4389a.getBottom();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: G */
    public final void mo2366G(Canvas canvas) {
        canvas.drawRenderNode(this.f4389a);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: H */
    public final int mo2367H() {
        return this.f4389a.getLeft();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: I */
    public final void mo2368I(float f3) {
        this.f4389a.setPivotX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: J */
    public final void mo2369J(boolean z10) {
        this.f4389a.setClipToBounds(z10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: K */
    public final boolean mo2370K(int i10, int i11, int i12, int i13) {
        return this.f4389a.setPosition(i10, i11, i12, i13);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: L */
    public final void mo2371L() {
        this.f4389a.discardDisplayList();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: M */
    public final void mo2372M(float f3) {
        this.f4389a.setPivotY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: N */
    public final void mo2373N(float f3) {
        this.f4389a.setElevation(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: O */
    public final void mo2374O(int i10) {
        this.f4389a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: P */
    public final boolean mo2375P() {
        return this.f4389a.hasDisplayList();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Q */
    public final void mo2376Q(Outline outline) {
        this.f4389a.setOutline(outline);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: R */
    public final boolean mo2377R() {
        return this.f4389a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: S */
    public final boolean mo2378S() {
        return this.f4389a.getClipToBounds();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: T */
    public final int mo2379T() {
        return this.f4389a.getTop();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: U */
    public final void mo2380U(C9166r c9166r, InterfaceC9138c0 interfaceC9138c0, InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l) {
        C5207g.m11111f(c9166r, "canvasHolder");
        RenderNode renderNode = this.f4389a;
        RecordingCanvas recordingCanvasBeginRecording = renderNode.beginRecording();
        C5207g.m11110e(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        C9139d c9139d = (C9139d) c9166r.f47694a;
        Canvas canvas = c9139d.f47644a;
        c9139d.getClass();
        c9139d.f47644a = recordingCanvasBeginRecording;
        C9139d c9139d2 = (C9139d) c9166r.f47694a;
        if (interfaceC9138c0 != null) {
            c9139d2.mo17420d();
            c9139d2.mo17417a(interfaceC9138c0, 1);
        }
        interfaceC2052l.mo528n(c9139d2);
        if (interfaceC9138c0 != null) {
            c9139d2.mo17428o();
        }
        ((C9139d) c9166r.f47694a).m17433t(canvas);
        renderNode.endRecording();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: V */
    public final void mo2381V(int i10) {
        this.f4389a.setAmbientShadowColor(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: W */
    public final int mo2382W() {
        return this.f4389a.getRight();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: X */
    public final boolean mo2383X() {
        return this.f4389a.getClipToOutline();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Y */
    public final void mo2384Y(boolean z10) {
        this.f4389a.setClipToOutline(z10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Z */
    public final void mo2385Z(int i10) {
        this.f4389a.setSpotShadowColor(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: a */
    public final int mo2386a() {
        return this.f4389a.getHeight();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: a0 */
    public final void mo2387a0(Matrix matrix) {
        C5207g.m11111f(matrix, "matrix");
        this.f4389a.getMatrix(matrix);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: b */
    public final int mo2388b() {
        return this.f4389a.getWidth();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: b0 */
    public final float mo2389b0() {
        return this.f4389a.getElevation();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: i */
    public final void mo2390i(float f3) {
        this.f4389a.setRotationY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: k */
    public final void mo2391k() {
        if (Build.VERSION.SDK_INT >= 31) {
            C0603a1.f4279a.m2328a(this.f4389a, null);
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: l */
    public final void mo2392l(float f3) {
        this.f4389a.setRotationZ(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: m */
    public final void mo2393m(float f3) {
        this.f4389a.setTranslationY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: p */
    public final void mo2394p(float f3) {
        this.f4389a.setScaleY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: r */
    public final void mo2395r(int i10) {
        boolean z10 = false;
        boolean z11 = i10 == 1;
        RenderNode renderNode = this.f4389a;
        if (z11) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
            return;
        }
        if (i10 == 2) {
            z10 = true;
        }
        if (z10) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: v */
    public final void mo2396v(float f3) {
        this.f4389a.setAlpha(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: x */
    public final void mo2397x(float f3) {
        this.f4389a.setScaleX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: z */
    public final void mo2398z(float f3) {
        this.f4389a.setTranslationX(f3);
    }
}
