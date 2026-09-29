package p000;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class bo3 extends fa2 implements ll2 {

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ int f8764L = 1;

    /* JADX INFO: renamed from: M */
    public final C0077c f8765M;

    /* JADX INFO: renamed from: N */
    public final lo2 f8766N;

    /* JADX INFO: renamed from: O */
    public Object f8767O;

    public bo3(C0333g c0333g, C0077c c0077c, lo2 lo2Var, t17 t17Var) {
        this.f8765M = c0077c;
        this.f8766N = lo2Var;
        this.f8767O = t17Var;
        m11624Z0(c0333g);
    }

    /* JADX INFO: renamed from: c1 */
    public static boolean m3994c1(float f, EdgeEffect edgeEffect, Canvas canvas) {
        if (f == 0.0f) {
            return edgeEffect.draw(canvas);
        }
        int iSave = canvas.save();
        canvas.rotate(f);
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: d1 */
    public static boolean m3995d1(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: renamed from: e1 */
    public RenderNode m3996e1() {
        RenderNode renderNode = (RenderNode) this.f8767O;
        if (renderNode != null) {
            return renderNode;
        }
        RenderNode renderNode2 = new RenderNode("AndroidEdgeEffectOverscrollEffect");
        this.f8767O = renderNode2;
        return renderNode2;
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        boolean zM3995d1;
        char c;
        float f;
        boolean zM3994c1;
        int i = this.f8764L;
        C0077c c0077c = this.f8765M;
        lo2 lo2Var = this.f8766N;
        switch (i) {
            case 0:
                t17 t17Var = (t17) this.f8767O;
                an0 an0Var = c0358h.f4358a;
                c0077c.m813i(an0Var.mo1422h());
                if (x89.m24408e(an0Var.mo1422h())) {
                    c0358h.m1614b();
                    return;
                }
                c0358h.m1614b();
                ((xc9) c0077c.f1741d).getValue();
                Canvas canvasM19936a = AbstractC3497qg.m19936a(an0Var.f853b.m16515r());
                if (lo2.m16408f(lo2Var.f49926f)) {
                    EdgeEffect edgeEffectM16412c = lo2Var.m16412c();
                    float f2 = -Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L));
                    zM3995d1 = m3995d1(270.0f, (((long) Float.floatToRawIntBits(c0358h.mo912g0(t17Var.mo14019b(c0358h.getLayoutDirection())))) & 4294967295L) | (((long) Float.floatToRawIntBits(f2)) << 32), edgeEffectM16412c, canvasM19936a);
                } else {
                    zM3995d1 = false;
                }
                if (lo2.m16408f(lo2Var.f49924d)) {
                    EdgeEffect edgeEffectM16414e = lo2Var.m16414e();
                    zM3995d1 = m3995d1(0.0f, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c0358h.mo912g0(t17Var.mo14021d()))) & 4294967295L), edgeEffectM16414e, canvasM19936a) || zM3995d1;
                }
                if (lo2.m16408f(lo2Var.f49927g)) {
                    EdgeEffect edgeEffectM16413d = lo2Var.m16413d();
                    zM3995d1 = m3995d1(90.0f, (((long) Float.floatToRawIntBits(c0358h.mo912g0(t17Var.mo14020c(c0358h.getLayoutDirection())) + (-((float) ss5.m21693T(Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32))))))) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32), edgeEffectM16413d, canvasM19936a) || zM3995d1;
                }
                if (lo2.m16408f(lo2Var.f49925e)) {
                    EdgeEffect edgeEffectM16411b = lo2Var.m16411b();
                    float fMo912g0 = c0358h.mo912g0(t17Var.mo14018a());
                    zM3995d1 = m3995d1(180.0f, (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (an0Var.mo1422h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (an0Var.mo1422h() & 4294967295L))) + fMo912g0)) & 4294967295L), edgeEffectM16411b, canvasM19936a) || zM3995d1;
                }
                if (zM3995d1) {
                    c0077c.m808d();
                    return;
                }
                return;
            default:
                an0 an0Var2 = c0358h.f4358a;
                c0077c.m813i(an0Var2.mo1422h());
                Canvas canvasM19936a2 = AbstractC3497qg.m19936a(an0Var2.f853b.m16515r());
                ((xc9) c0077c.f1741d).getValue();
                if (x89.m24408e(an0Var2.mo1422h())) {
                    c0358h.m1614b();
                    return;
                }
                if (!canvasM19936a2.isHardwareAccelerated()) {
                    EdgeEffect edgeEffect = lo2Var.f49924d;
                    if (edgeEffect != null) {
                        edgeEffect.finish();
                    }
                    EdgeEffect edgeEffect2 = lo2Var.f49925e;
                    if (edgeEffect2 != null) {
                        edgeEffect2.finish();
                    }
                    EdgeEffect edgeEffect3 = lo2Var.f49926f;
                    if (edgeEffect3 != null) {
                        edgeEffect3.finish();
                    }
                    EdgeEffect edgeEffect4 = lo2Var.f49927g;
                    if (edgeEffect4 != null) {
                        edgeEffect4.finish();
                    }
                    EdgeEffect edgeEffect5 = lo2Var.f49928h;
                    if (edgeEffect5 != null) {
                        edgeEffect5.finish();
                    }
                    EdgeEffect edgeEffect6 = lo2Var.f49929i;
                    if (edgeEffect6 != null) {
                        edgeEffect6.finish();
                    }
                    EdgeEffect edgeEffect7 = lo2Var.f49930j;
                    if (edgeEffect7 != null) {
                        edgeEffect7.finish();
                    }
                    EdgeEffect edgeEffect8 = lo2Var.f49931k;
                    if (edgeEffect8 != null) {
                        edgeEffect8.finish();
                    }
                    c0358h.m1614b();
                    return;
                }
                float fMo912g1 = c0358h.mo912g0(30.0f);
                boolean z = lo2.m16408f(lo2Var.f49924d) || lo2.m16409g(lo2Var.f49928h) || lo2.m16408f(lo2Var.f49925e) || lo2.m16409g(lo2Var.f49929i);
                boolean z2 = lo2.m16408f(lo2Var.f49926f) || lo2.m16409g(lo2Var.f49930j) || lo2.m16408f(lo2Var.f49927g) || lo2.m16409g(lo2Var.f49931k);
                if (z && z2) {
                    c = ' ';
                    m3996e1().setPosition(0, 0, canvasM19936a2.getWidth(), canvasM19936a2.getHeight());
                } else {
                    c = ' ';
                    if (z) {
                        m3996e1().setPosition(0, 0, (ss5.m21693T(fMo912g1) * 2) + canvasM19936a2.getWidth(), canvasM19936a2.getHeight());
                    } else {
                        if (!z2) {
                            c0358h.m1614b();
                            return;
                        }
                        m3996e1().setPosition(0, 0, canvasM19936a2.getWidth(), (ss5.m21693T(fMo912g1) * 2) + canvasM19936a2.getHeight());
                    }
                }
                RecordingCanvas recordingCanvasBeginRecording = m3996e1().beginRecording();
                if (lo2.m16409g(lo2Var.f49930j)) {
                    EdgeEffect edgeEffectM16410a = lo2Var.f49930j;
                    if (edgeEffectM16410a == null) {
                        edgeEffectM16410a = lo2Var.m16410a(Orientation.Horizontal);
                        lo2Var.f49930j = edgeEffectM16410a;
                    }
                    m3994c1(90.0f, edgeEffectM16410a, recordingCanvasBeginRecording);
                    edgeEffectM16410a.finish();
                }
                if (lo2.m16408f(lo2Var.f49926f)) {
                    EdgeEffect edgeEffectM16412c2 = lo2Var.m16412c();
                    zM3994c1 = m3994c1(270.0f, edgeEffectM16412c2, recordingCanvasBeginRecording);
                    f = 1.0f;
                    if (lo2.m16409g(lo2Var.f49926f)) {
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (c0077c.m807c() & 4294967295L));
                        EdgeEffect edgeEffectM16410a2 = lo2Var.f49930j;
                        if (edgeEffectM16410a2 == null) {
                            edgeEffectM16410a2 = lo2Var.m16410a(Orientation.Horizontal);
                            lo2Var.f49930j = edgeEffectM16410a2;
                        }
                        int i2 = Build.VERSION.SDK_INT;
                        float fM3991b = i2 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16412c2) : 0.0f;
                        float f3 = 1.0f - fIntBitsToFloat;
                        if (i2 >= 31) {
                            AbstractC0818bo.m3992c(edgeEffectM16410a2, fM3991b, f3);
                        } else {
                            edgeEffectM16410a2.onPull(fM3991b, f3);
                        }
                    }
                } else {
                    f = 1.0f;
                    zM3994c1 = false;
                }
                if (lo2.m16409g(lo2Var.f49928h)) {
                    EdgeEffect edgeEffectM16410a3 = lo2Var.f49928h;
                    if (edgeEffectM16410a3 == null) {
                        edgeEffectM16410a3 = lo2Var.m16410a(Orientation.Vertical);
                        lo2Var.f49928h = edgeEffectM16410a3;
                    }
                    m3994c1(180.0f, edgeEffectM16410a3, recordingCanvasBeginRecording);
                    edgeEffectM16410a3.finish();
                }
                if (lo2.m16408f(lo2Var.f49924d)) {
                    EdgeEffect edgeEffectM16414e2 = lo2Var.m16414e();
                    zM3994c1 = m3994c1(0.0f, edgeEffectM16414e2, recordingCanvasBeginRecording) || zM3994c1;
                    if (lo2.m16409g(lo2Var.f49924d)) {
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (c0077c.m807c() >> c));
                        EdgeEffect edgeEffectM16410a4 = lo2Var.f49928h;
                        if (edgeEffectM16410a4 == null) {
                            edgeEffectM16410a4 = lo2Var.m16410a(Orientation.Vertical);
                            lo2Var.f49928h = edgeEffectM16410a4;
                        }
                        int i3 = Build.VERSION.SDK_INT;
                        float fM3991b2 = i3 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16414e2) : 0.0f;
                        if (i3 >= 31) {
                            AbstractC0818bo.m3992c(edgeEffectM16410a4, fM3991b2, fIntBitsToFloat2);
                        } else {
                            edgeEffectM16410a4.onPull(fM3991b2, fIntBitsToFloat2);
                        }
                    }
                }
                if (lo2.m16409g(lo2Var.f49931k)) {
                    EdgeEffect edgeEffectM16410a5 = lo2Var.f49931k;
                    if (edgeEffectM16410a5 == null) {
                        edgeEffectM16410a5 = lo2Var.m16410a(Orientation.Horizontal);
                        lo2Var.f49931k = edgeEffectM16410a5;
                    }
                    m3994c1(270.0f, edgeEffectM16410a5, recordingCanvasBeginRecording);
                    edgeEffectM16410a5.finish();
                }
                if (lo2.m16408f(lo2Var.f49927g)) {
                    EdgeEffect edgeEffectM16413d2 = lo2Var.m16413d();
                    zM3994c1 = m3994c1(90.0f, edgeEffectM16413d2, recordingCanvasBeginRecording) || zM3994c1;
                    if (lo2.m16409g(lo2Var.f49927g)) {
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (c0077c.m807c() & 4294967295L));
                        EdgeEffect edgeEffectM16410a6 = lo2Var.f49931k;
                        if (edgeEffectM16410a6 == null) {
                            edgeEffectM16410a6 = lo2Var.m16410a(Orientation.Horizontal);
                            lo2Var.f49931k = edgeEffectM16410a6;
                        }
                        int i4 = Build.VERSION.SDK_INT;
                        float fM3991b3 = i4 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16413d2) : 0.0f;
                        if (i4 >= 31) {
                            AbstractC0818bo.m3992c(edgeEffectM16410a6, fM3991b3, fIntBitsToFloat3);
                        } else {
                            edgeEffectM16410a6.onPull(fM3991b3, fIntBitsToFloat3);
                        }
                    }
                }
                if (lo2.m16409g(lo2Var.f49929i)) {
                    EdgeEffect edgeEffectM16410a7 = lo2Var.f49929i;
                    if (edgeEffectM16410a7 == null) {
                        edgeEffectM16410a7 = lo2Var.m16410a(Orientation.Vertical);
                        lo2Var.f49929i = edgeEffectM16410a7;
                    }
                    m3994c1(0.0f, edgeEffectM16410a7, recordingCanvasBeginRecording);
                    edgeEffectM16410a7.finish();
                }
                if (lo2.m16408f(lo2Var.f49925e)) {
                    EdgeEffect edgeEffectM16411b2 = lo2Var.m16411b();
                    boolean z3 = m3994c1(180.0f, edgeEffectM16411b2, recordingCanvasBeginRecording) || zM3994c1;
                    if (lo2.m16409g(lo2Var.f49925e)) {
                        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (c0077c.m807c() >> c));
                        EdgeEffect edgeEffectM16410a8 = lo2Var.f49929i;
                        if (edgeEffectM16410a8 == null) {
                            edgeEffectM16410a8 = lo2Var.m16410a(Orientation.Vertical);
                            lo2Var.f49929i = edgeEffectM16410a8;
                        }
                        int i5 = Build.VERSION.SDK_INT;
                        float fM3991b4 = i5 >= 31 ? AbstractC0818bo.m3991b(edgeEffectM16411b2) : 0.0f;
                        float f4 = f - fIntBitsToFloat4;
                        if (i5 >= 31) {
                            AbstractC0818bo.m3992c(edgeEffectM16410a8, fM3991b4, f4);
                        } else {
                            edgeEffectM16410a8.onPull(fM3991b4, f4);
                        }
                    }
                    zM3994c1 = z3;
                }
                if (zM3994c1) {
                    c0077c.m808d();
                }
                float f5 = z2 ? 0.0f : fMo912g1;
                if (z) {
                    fMo912g1 = 0.0f;
                }
                LayoutDirection layoutDirection = c0358h.getLayoutDirection();
                C3459pg c3459pg = new C3459pg();
                c3459pg.f56079a = recordingCanvasBeginRecording;
                long jMo1422h = an0Var2.mo1422h();
                fb2 fb2VarM16517t = an0Var2.f853b.m16517t();
                LayoutDirection layoutDirectionM16519w = an0Var2.f853b.m16519w();
                ym0 ym0VarM16515r = an0Var2.f853b.m16515r();
                long jM16483A = an0Var2.f853b.m16483A();
                C3309ls c3309ls = an0Var2.f853b;
                C0312a c0312a = (C0312a) c3309ls.f50065c;
                c3309ls.m16499S(c0358h);
                c3309ls.m16500T(layoutDirection);
                c3309ls.m16497Q(c3459pg);
                c3309ls.m16501U(jMo1422h);
                c3309ls.f50065c = null;
                c3459pg.mo17016h();
                try {
                    ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(f5, fMo912g1);
                    try {
                        c0358h.m1614b();
                        float f6 = -f5;
                        float f7 = -fMo912g1;
                        ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(f6, f7);
                        c3459pg.mo17024p();
                        C3309ls c3309ls2 = an0Var2.f853b;
                        c3309ls2.m16499S(fb2VarM16517t);
                        c3309ls2.m16500T(layoutDirectionM16519w);
                        c3309ls2.m16497Q(ym0VarM16515r);
                        c3309ls2.m16501U(jM16483A);
                        c3309ls2.f50065c = c0312a;
                        m3996e1().endRecording();
                        int iSave = canvasM19936a2.save();
                        canvasM19936a2.translate(f6, f7);
                        canvasM19936a2.drawRenderNode(m3996e1());
                        canvasM19936a2.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        ((qn3) c0358h.f4358a.f853b.f50064b).m20067V(-f5, -fMo912g1);
                        throw th;
                    }
                } catch (Throwable th2) {
                    c3459pg.mo17024p();
                    C3309ls c3309ls3 = an0Var2.f853b;
                    c3309ls3.m16499S(fb2VarM16517t);
                    c3309ls3.m16500T(layoutDirectionM16519w);
                    c3309ls3.m16497Q(ym0VarM16515r);
                    c3309ls3.m16501U(jM16483A);
                    c3309ls3.f50065c = c0312a;
                    throw th2;
                }
        }
    }

    public bo3(C0333g c0333g, C0077c c0077c, lo2 lo2Var) {
        this.f8765M = c0077c;
        this.f8766N = lo2Var;
        m11624Z0(c0333g);
    }
}
