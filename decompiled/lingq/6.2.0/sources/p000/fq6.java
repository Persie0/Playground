package p000;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.airbnb.lottie.utils.OffscreenLayer$RenderStrategy;

/* JADX INFO: loaded from: classes2.dex */
public final class fq6 {

    /* JADX INFO: renamed from: B */
    public static final Matrix f39457B = new Matrix();

    /* JADX INFO: renamed from: A */
    public qm2 f39458A;

    /* JADX INFO: renamed from: a */
    public Canvas f39459a;

    /* JADX INFO: renamed from: b */
    public ztb f39460b;

    /* JADX INFO: renamed from: c */
    public OffscreenLayer$RenderStrategy f39461c;

    /* JADX INFO: renamed from: d */
    public RectF f39462d;

    /* JADX INFO: renamed from: e */
    public RectF f39463e;

    /* JADX INFO: renamed from: f */
    public Rect f39464f;

    /* JADX INFO: renamed from: g */
    public RectF f39465g;

    /* JADX INFO: renamed from: h */
    public RectF f39466h;

    /* JADX INFO: renamed from: i */
    public Rect f39467i;

    /* JADX INFO: renamed from: j */
    public RectF f39468j;

    /* JADX INFO: renamed from: k */
    public yk4 f39469k;

    /* JADX INFO: renamed from: l */
    public Bitmap f39470l;

    /* JADX INFO: renamed from: m */
    public Canvas f39471m;

    /* JADX INFO: renamed from: n */
    public Rect f39472n;

    /* JADX INFO: renamed from: o */
    public yk4 f39473o;

    /* JADX INFO: renamed from: p */
    public Matrix f39474p;

    /* JADX INFO: renamed from: q */
    public float[] f39475q;

    /* JADX INFO: renamed from: r */
    public Bitmap f39476r;

    /* JADX INFO: renamed from: s */
    public Bitmap f39477s;

    /* JADX INFO: renamed from: t */
    public Canvas f39478t;

    /* JADX INFO: renamed from: u */
    public Canvas f39479u;

    /* JADX INFO: renamed from: v */
    public yk4 f39480v;

    /* JADX INFO: renamed from: w */
    public BlurMaskFilter f39481w;

    /* JADX INFO: renamed from: x */
    public float f39482x = 0.0f;

    /* JADX INFO: renamed from: y */
    public RenderNode f39483y;

    /* JADX INFO: renamed from: z */
    public RenderNode f39484z;

    /* JADX INFO: renamed from: a */
    public static Bitmap m11994a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(((double) rectF.width()) * 1.05d), 1), Math.max((int) Math.ceil(((double) rectF.height()) * 1.05d), 1), config);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m11995d(Bitmap bitmap, RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    /* JADX INFO: renamed from: b */
    public final RectF m11996b(RectF rectF, qm2 qm2Var) {
        if (this.f39463e == null) {
            this.f39463e = new RectF();
        }
        if (this.f39465g == null) {
            this.f39465g = new RectF();
        }
        this.f39463e.set(rectF);
        this.f39463e.offsetTo(rectF.left + qm2Var.f57939b, rectF.top + qm2Var.f57940c);
        RectF rectF2 = this.f39463e;
        float f = qm2Var.f57938a;
        rectF2.inset(-f, -f);
        this.f39465g.set(rectF);
        this.f39463e.union(this.f39465g);
        return this.f39463e;
    }

    /* JADX INFO: renamed from: c */
    public final void m11997c() {
        float f;
        yk4 yk4Var;
        if (this.f39459a == null || this.f39460b == null || this.f39475q == null || this.f39462d == null) {
            C3386nv.m17633t("OffscreenBitmap: finish() call without matching start()");
            return;
        }
        int i = eq6.f37709a[this.f39461c.ordinal()];
        if (i == 1 || i == 2) {
            this.f39459a.restore();
        } else {
            if (i != 3) {
                if (i == 4) {
                    if (this.f39483y == null) {
                        C3386nv.m17633t("RenderNode is not ready; should've been initialized at start() time");
                        return;
                    }
                    this.f39459a.save();
                    Canvas canvas = this.f39459a;
                    float[] fArr = this.f39475q;
                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                    this.f39483y.endRecording();
                    if (this.f39460b.m25783e()) {
                        Canvas canvas2 = this.f39459a;
                        qm2 qm2Var = (qm2) this.f39460b.f72162c;
                        if (this.f39483y == null || this.f39484z == null) {
                            C3386nv.m17633t("Cannot render to render node outside a start()/finish() block");
                            return;
                        }
                        if (Build.VERSION.SDK_INT < 31) {
                            ho2.m13385e("RenderEffect is not supported on API level <31");
                            return;
                        }
                        float[] fArr2 = this.f39475q;
                        float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                        f = fArr2 != null ? fArr2[4] : 1.0f;
                        qm2 qm2Var2 = this.f39458A;
                        if (qm2Var2 == null || qm2Var.f57938a != qm2Var2.f57938a || qm2Var.f57939b != qm2Var2.f57939b || qm2Var.f57940c != qm2Var2.f57940c || qm2Var.f57941d != qm2Var2.f57941d) {
                            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(qm2Var.f57941d, PorterDuff.Mode.SRC_IN));
                            float f3 = qm2Var.f57938a;
                            if (f3 > 0.0f) {
                                float f4 = ((f2 + f) * f3) / 2.0f;
                                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                renderEffectCreateColorFilterEffect = RenderEffect.createBlurEffect(f4, f4, renderEffectCreateColorFilterEffect, Shader.TileMode.CLAMP);
                            }
                            this.f39484z.setRenderEffect(renderEffectCreateColorFilterEffect);
                            this.f39458A = qm2Var;
                        }
                        RectF rectFM11996b = m11996b(this.f39462d, qm2Var);
                        RectF rectF = new RectF(rectFM11996b.left * f2, rectFM11996b.top * f, rectFM11996b.right * f2, rectFM11996b.bottom * f);
                        this.f39484z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                        RecordingCanvas recordingCanvasBeginRecording = this.f39484z.beginRecording((int) rectF.width(), (int) rectF.height());
                        recordingCanvasBeginRecording.translate((qm2Var.f57939b * f2) + (-rectF.left), (qm2Var.f57940c * f) + (-rectF.top));
                        recordingCanvasBeginRecording.drawRenderNode(this.f39483y);
                        this.f39484z.endRecording();
                        canvas2.save();
                        canvas2.translate(rectF.left, rectF.top);
                        canvas2.drawRenderNode(this.f39484z);
                        canvas2.restore();
                    }
                    this.f39459a.drawRenderNode(this.f39483y);
                    this.f39459a.restore();
                }
            } else {
                if (this.f39470l == null) {
                    C3386nv.m17633t("Bitmap is not ready; should've been initialized at start() time");
                    return;
                }
                if (this.f39460b.m25783e()) {
                    Canvas canvas3 = this.f39459a;
                    qm2 qm2Var3 = (qm2) this.f39460b.f72162c;
                    RectF rectF2 = this.f39462d;
                    if (rectF2 == null || this.f39470l == null) {
                        C3386nv.m17633t("Cannot render to bitmap outside a start()/finish() block");
                        return;
                    }
                    RectF rectFM11996b2 = m11996b(rectF2, qm2Var3);
                    if (this.f39464f == null) {
                        this.f39464f = new Rect();
                    }
                    this.f39464f.set((int) Math.floor(rectFM11996b2.left), (int) Math.floor(rectFM11996b2.top), (int) Math.ceil(rectFM11996b2.right), (int) Math.ceil(rectFM11996b2.bottom));
                    float[] fArr3 = this.f39475q;
                    float f5 = fArr3 != null ? fArr3[0] : 1.0f;
                    f = fArr3 != null ? fArr3[4] : 1.0f;
                    if (this.f39466h == null) {
                        this.f39466h = new RectF();
                    }
                    this.f39466h.set(rectFM11996b2.left * f5, rectFM11996b2.top * f, rectFM11996b2.right * f5, rectFM11996b2.bottom * f);
                    if (this.f39467i == null) {
                        this.f39467i = new Rect();
                    }
                    this.f39467i.set(0, 0, Math.round(this.f39466h.width()), Math.round(this.f39466h.height()));
                    if (m11995d(this.f39476r, this.f39466h)) {
                        Bitmap bitmap = this.f39476r;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        Bitmap bitmap2 = this.f39477s;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        this.f39476r = m11994a(this.f39466h, Bitmap.Config.ARGB_8888);
                        this.f39477s = m11994a(this.f39466h, Bitmap.Config.ALPHA_8);
                        this.f39478t = new Canvas(this.f39476r);
                        this.f39479u = new Canvas(this.f39477s);
                    } else {
                        Canvas canvas4 = this.f39478t;
                        if (canvas4 == null || this.f39479u == null || (yk4Var = this.f39473o) == null) {
                            C3386nv.m17633t("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            return;
                        } else {
                            canvas4.drawRect(this.f39467i, yk4Var);
                            this.f39479u.drawRect(this.f39467i, this.f39473o);
                        }
                    }
                    if (this.f39477s == null) {
                        C3386nv.m17633t("Expected to have allocated a shadow mask bitmap");
                        return;
                    }
                    if (this.f39480v == null) {
                        this.f39480v = new yk4(1, 0);
                    }
                    RectF rectF3 = this.f39462d;
                    this.f39479u.drawBitmap(this.f39470l, Math.round((rectF3.left - rectFM11996b2.left) * f5), Math.round((rectF3.top - rectFM11996b2.top) * f), (Paint) null);
                    if (this.f39481w == null || this.f39482x != qm2Var3.f57938a) {
                        float f6 = ((f5 + f) * qm2Var3.f57938a) / 2.0f;
                        if (f6 > 0.0f) {
                            this.f39481w = new BlurMaskFilter(f6, BlurMaskFilter.Blur.NORMAL);
                        } else {
                            this.f39481w = null;
                        }
                        this.f39482x = qm2Var3.f57938a;
                    }
                    this.f39480v.setColor(qm2Var3.f57941d);
                    float f7 = qm2Var3.f57938a;
                    yk4 yk4Var2 = this.f39480v;
                    if (f7 > 0.0f) {
                        yk4Var2.setMaskFilter(this.f39481w);
                    } else {
                        yk4Var2.setMaskFilter(null);
                    }
                    this.f39480v.setFilterBitmap(true);
                    this.f39478t.drawBitmap(this.f39477s, Math.round(qm2Var3.f57939b * f5), Math.round(qm2Var3.f57940c * f), this.f39480v);
                    canvas3.drawBitmap(this.f39476r, this.f39467i, this.f39464f, this.f39469k);
                }
                if (this.f39472n == null) {
                    this.f39472n = new Rect();
                }
                this.f39472n.set(0, 0, (int) (this.f39462d.width() * this.f39475q[0]), (int) (this.f39462d.height() * this.f39475q[4]));
                this.f39459a.drawBitmap(this.f39470l, this.f39472n, this.f39462d, this.f39469k);
            }
        }
        this.f39459a = null;
    }

    /* JADX INFO: renamed from: e */
    public final Canvas m11998e(Canvas canvas, RectF rectF, ztb ztbVar) {
        OffscreenLayer$RenderStrategy offscreenLayer$RenderStrategy;
        if (this.f39459a != null) {
            C3386nv.m17633t("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
            return null;
        }
        if (this.f39475q == null) {
            this.f39475q = new float[9];
        }
        if (this.f39474p == null) {
            this.f39474p = new Matrix();
        }
        canvas.getMatrix(this.f39474p);
        this.f39474p.getValues(this.f39475q);
        float[] fArr = this.f39475q;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.f39468j == null) {
            this.f39468j = new RectF();
        }
        this.f39468j.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.f39459a = canvas;
        this.f39460b = ztbVar;
        if (ztbVar.f72161b >= 255 && !ztbVar.m25783e()) {
            offscreenLayer$RenderStrategy = OffscreenLayer$RenderStrategy.DIRECT;
        } else if (ztbVar.m25783e()) {
            offscreenLayer$RenderStrategy = (canvas.isHardwareAccelerated() && Build.VERSION.SDK_INT > 31) ? OffscreenLayer$RenderStrategy.RENDER_NODE : OffscreenLayer$RenderStrategy.BITMAP;
        } else {
            offscreenLayer$RenderStrategy = OffscreenLayer$RenderStrategy.SAVE_LAYER;
        }
        this.f39461c = offscreenLayer$RenderStrategy;
        if (this.f39462d == null) {
            this.f39462d = new RectF();
        }
        this.f39462d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.f39469k == null) {
            this.f39469k = new yk4();
        }
        this.f39469k.reset();
        int i = eq6.f37709a[this.f39461c.ordinal()];
        if (i == 1) {
            canvas.save();
            return canvas;
        }
        if (i == 2) {
            this.f39469k.setAlpha(ztbVar.f72161b);
            this.f39469k.setColorFilter(null);
            fna.m11960f(canvas, rectF, this.f39469k);
            return canvas;
        }
        Matrix matrix = f39457B;
        if (i == 3) {
            if (this.f39473o == null) {
                yk4 yk4Var = new yk4();
                this.f39473o = yk4Var;
                yk4Var.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            }
            if (m11995d(this.f39470l, this.f39468j)) {
                Bitmap bitmap = this.f39470l;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.f39470l = m11994a(this.f39468j, Bitmap.Config.ARGB_8888);
                this.f39471m = new Canvas(this.f39470l);
            } else {
                Canvas canvas2 = this.f39471m;
                if (canvas2 == null) {
                    C3386nv.m17633t("If needNewBitmap() returns true, we should have a canvas ready");
                    return null;
                }
                canvas2.setMatrix(matrix);
                this.f39471m.drawRect(-1.0f, -1.0f, this.f39468j.width() + 1.0f, this.f39468j.height() + 1.0f, this.f39473o);
            }
            this.f39469k.setBlendMode(null);
            this.f39469k.setColorFilter(null);
            this.f39469k.setAlpha(ztbVar.f72161b);
            Canvas canvas3 = this.f39471m;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i != 4) {
            ho2.m13385e("Invalid render strategy for OffscreenLayer");
            return null;
        }
        if (this.f39483y == null) {
            this.f39483y = new RenderNode("OffscreenLayer.main");
        }
        if (ztbVar.m25783e() && this.f39484z == null) {
            this.f39484z = new RenderNode("OffscreenLayer.shadow");
            this.f39458A = null;
        }
        this.f39483y.setAlpha(ztbVar.f72161b / 255.0f);
        if (ztbVar.m25783e()) {
            RenderNode renderNode = this.f39484z;
            if (renderNode == null) {
                C3386nv.m17633t("Must initialize shadowRenderNode when we have shadow");
                return null;
            }
            renderNode.setAlpha(ztbVar.f72161b / 255.0f);
        }
        this.f39483y.setHasOverlappingRendering(true);
        RenderNode renderNode2 = this.f39483y;
        RectF rectF2 = this.f39468j;
        renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        RecordingCanvas recordingCanvasBeginRecording = this.f39483y.beginRecording((int) this.f39468j.width(), (int) this.f39468j.height());
        recordingCanvasBeginRecording.setMatrix(matrix);
        recordingCanvasBeginRecording.scale(f, f2);
        recordingCanvasBeginRecording.translate(-rectF.left, -rectF.top);
        return recordingCanvasBeginRecording;
    }
}
