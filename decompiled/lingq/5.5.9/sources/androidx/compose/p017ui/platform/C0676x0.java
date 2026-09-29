package androidx.compose.p017ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import cm.InterfaceC2052l;
import dm.C5207g;
import p385sf.C9000b;
import p387t0.C9139d;
import p387t0.C9166r;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9165q;
import sl.C9072e;

/* JADX INFO: renamed from: androidx.compose.ui.platform.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0676x0 implements InterfaceC0637k0 {

    /* JADX INFO: renamed from: g */
    public static boolean f4380g = true;

    /* JADX INFO: renamed from: a */
    public final RenderNode f4381a;

    /* JADX INFO: renamed from: b */
    public int f4382b;

    /* JADX INFO: renamed from: c */
    public int f4383c;

    /* JADX INFO: renamed from: d */
    public int f4384d;

    /* JADX INFO: renamed from: e */
    public int f4385e;

    /* JADX INFO: renamed from: f */
    public boolean f4386f;

    public C0676x0(AndroidComposeView androidComposeView) {
        C5207g.m11111f(androidComposeView, "ownerView");
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        C5207g.m11110e(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f4381a = renderNodeCreate;
        if (f4380g) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                C0612c1 c0612c1 = C0612c1.f4291a;
                c0612c1.m2343c(renderNodeCreate, c0612c1.m2341a(renderNodeCreate));
                c0612c1.m2344d(renderNodeCreate, c0612c1.m2342b(renderNodeCreate));
            }
            C0608b1.f4285a.m2338a(renderNodeCreate);
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f4380g = false;
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: A */
    public final float mo2361A() {
        return this.f4381a.getAlpha();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: B */
    public final void mo2362B(float f3) {
        this.f4381a.setCameraDistance(-f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: D */
    public final void mo2363D(float f3) {
        this.f4381a.setRotationX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: E */
    public final void mo2364E(int i10) {
        this.f4382b += i10;
        this.f4384d += i10;
        this.f4381a.offsetLeftAndRight(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: F */
    public final int mo2365F() {
        return this.f4385e;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: G */
    public final void mo2366G(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f4381a);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: H */
    public final int mo2367H() {
        return this.f4382b;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: I */
    public final void mo2368I(float f3) {
        this.f4381a.setPivotX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: J */
    public final void mo2369J(boolean z10) {
        this.f4386f = z10;
        this.f4381a.setClipToBounds(z10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: K */
    public final boolean mo2370K(int i10, int i11, int i12, int i13) {
        this.f4382b = i10;
        this.f4383c = i11;
        this.f4384d = i12;
        this.f4385e = i13;
        return this.f4381a.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: L */
    public final void mo2371L() {
        C0608b1.f4285a.m2338a(this.f4381a);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: M */
    public final void mo2372M(float f3) {
        this.f4381a.setPivotY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: N */
    public final void mo2373N(float f3) {
        this.f4381a.setElevation(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: O */
    public final void mo2374O(int i10) {
        this.f4383c += i10;
        this.f4385e += i10;
        this.f4381a.offsetTopAndBottom(i10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: P */
    public final boolean mo2375P() {
        return this.f4381a.isValid();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Q */
    public final void mo2376Q(Outline outline) {
        this.f4381a.setOutline(outline);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: R */
    public final boolean mo2377R() {
        return this.f4381a.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: S */
    public final boolean mo2378S() {
        return this.f4386f;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: T */
    public final int mo2379T() {
        return this.f4383c;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: U */
    public final void mo2380U(C9166r c9166r, InterfaceC9138c0 interfaceC9138c0, InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l) {
        C5207g.m11111f(c9166r, "canvasHolder");
        int i10 = this.f4384d - this.f4382b;
        int i11 = this.f4385e - this.f4383c;
        RenderNode renderNode = this.f4381a;
        DisplayListCanvas displayListCanvasStart = renderNode.start(i10, i11);
        C5207g.m11110e(displayListCanvasStart, "renderNode.start(width, height)");
        Canvas canvasM17432s = c9166r.m17487e().m17432s();
        c9166r.m17487e().m17433t((Canvas) displayListCanvasStart);
        C9139d c9139dM17487e = c9166r.m17487e();
        if (interfaceC9138c0 != null) {
            c9139dM17487e.mo17420d();
            c9139dM17487e.mo17417a(interfaceC9138c0, 1);
        }
        interfaceC2052l.mo528n(c9139dM17487e);
        if (interfaceC9138c0 != null) {
            c9139dM17487e.mo17428o();
        }
        c9166r.m17487e().m17433t(canvasM17432s);
        renderNode.end(displayListCanvasStart);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: V */
    public final void mo2381V(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0612c1.f4291a.m2343c(this.f4381a, i10);
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: W */
    public final int mo2382W() {
        return this.f4384d;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: X */
    public final boolean mo2383X() {
        return this.f4381a.getClipToOutline();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Y */
    public final void mo2384Y(boolean z10) {
        this.f4381a.setClipToOutline(z10);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: Z */
    public final void mo2385Z(int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            C0612c1.f4291a.m2344d(this.f4381a, i10);
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: a */
    public final int mo2386a() {
        return this.f4385e - this.f4383c;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: a0 */
    public final void mo2387a0(Matrix matrix) {
        C5207g.m11111f(matrix, "matrix");
        this.f4381a.getMatrix(matrix);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: b */
    public final int mo2388b() {
        return this.f4384d - this.f4382b;
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: b0 */
    public final float mo2389b0() {
        return this.f4381a.getElevation();
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: i */
    public final void mo2390i(float f3) {
        this.f4381a.setRotationY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: k */
    public final void mo2391k() {
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: l */
    public final void mo2392l(float f3) {
        this.f4381a.setRotation(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: m */
    public final void mo2393m(float f3) {
        this.f4381a.setTranslationY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: p */
    public final void mo2394p(float f3) {
        this.f4381a.setScaleY(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: r */
    public final void mo2395r(int i10) {
        boolean zM17244j = C9000b.m17244j(i10, 1);
        RenderNode renderNode = this.f4381a;
        if (zM17244j) {
            renderNode.setLayerType(2);
            renderNode.setHasOverlappingRendering(true);
        } else if (C9000b.m17244j(i10, 2)) {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setLayerType(0);
            renderNode.setHasOverlappingRendering(true);
        }
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: v */
    public final void mo2396v(float f3) {
        this.f4381a.setAlpha(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: x */
    public final void mo2397x(float f3) {
        this.f4381a.setScaleX(f3);
    }

    @Override // androidx.compose.p017ui.platform.InterfaceC0637k0
    /* JADX INFO: renamed from: z */
    public final void mo2398z(float f3) {
        this.f4381a.setTranslationX(f3);
    }
}
