package gd;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import p117fd.C5507a;
import p446w2.C9804b;
import vc.C9709a;

/* JADX INFO: renamed from: gd.g */
/* JADX INFO: loaded from: classes.dex */
public class C5768g extends Drawable implements InterfaceC5776o {

    /* JADX INFO: renamed from: R */
    public static final Paint f34846R;

    /* JADX INFO: renamed from: H */
    public C5772k f34847H;

    /* JADX INFO: renamed from: I */
    public final Paint f34848I;

    /* JADX INFO: renamed from: J */
    public final Paint f34849J;

    /* JADX INFO: renamed from: K */
    public final C5507a f34850K;

    /* JADX INFO: renamed from: L */
    public final a f34851L;

    /* JADX INFO: renamed from: M */
    public final C5773l f34852M;

    /* JADX INFO: renamed from: N */
    public PorterDuffColorFilter f34853N;

    /* JADX INFO: renamed from: O */
    public PorterDuffColorFilter f34854O;

    /* JADX INFO: renamed from: P */
    public final RectF f34855P;

    /* JADX INFO: renamed from: Q */
    public boolean f34856Q;

    /* JADX INFO: renamed from: a */
    public b f34857a;

    /* JADX INFO: renamed from: b */
    public final C5775n.f[] f34858b;

    /* JADX INFO: renamed from: c */
    public final C5775n.f[] f34859c;

    /* JADX INFO: renamed from: d */
    public final BitSet f34860d;

    /* JADX INFO: renamed from: e */
    public boolean f34861e;

    /* JADX INFO: renamed from: f */
    public final Matrix f34862f;

    /* JADX INFO: renamed from: g */
    public final Path f34863g;

    /* JADX INFO: renamed from: h */
    public final Path f34864h;

    /* JADX INFO: renamed from: i */
    public final RectF f34865i;

    /* JADX INFO: renamed from: j */
    public final RectF f34866j;

    /* JADX INFO: renamed from: k */
    public final Region f34867k;

    /* JADX INFO: renamed from: l */
    public final Region f34868l;

    /* JADX INFO: renamed from: gd.g$a */
    public class a {
        public a() {
        }
    }

    /* JADX INFO: renamed from: gd.g$b */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C5772k f34870a;

        /* JADX INFO: renamed from: b */
        public C9709a f34871b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f34872c;

        /* JADX INFO: renamed from: d */
        public ColorStateList f34873d;

        /* JADX INFO: renamed from: e */
        public final ColorStateList f34874e;

        /* JADX INFO: renamed from: f */
        public ColorStateList f34875f;

        /* JADX INFO: renamed from: g */
        public PorterDuff.Mode f34876g;

        /* JADX INFO: renamed from: h */
        public Rect f34877h;

        /* JADX INFO: renamed from: i */
        public final float f34878i;

        /* JADX INFO: renamed from: j */
        public float f34879j;

        /* JADX INFO: renamed from: k */
        public float f34880k;

        /* JADX INFO: renamed from: l */
        public int f34881l;

        /* JADX INFO: renamed from: m */
        public float f34882m;

        /* JADX INFO: renamed from: n */
        public float f34883n;

        /* JADX INFO: renamed from: o */
        public final float f34884o;

        /* JADX INFO: renamed from: p */
        public int f34885p;

        /* JADX INFO: renamed from: q */
        public int f34886q;

        /* JADX INFO: renamed from: r */
        public int f34887r;

        /* JADX INFO: renamed from: s */
        public int f34888s;

        /* JADX INFO: renamed from: t */
        public boolean f34889t;

        /* JADX INFO: renamed from: u */
        public final Paint.Style f34890u;

        public b(b bVar) {
            this.f34872c = null;
            this.f34873d = null;
            this.f34874e = null;
            this.f34875f = null;
            this.f34876g = PorterDuff.Mode.SRC_IN;
            this.f34877h = null;
            this.f34878i = 1.0f;
            this.f34879j = 1.0f;
            this.f34881l = 255;
            this.f34882m = 0.0f;
            this.f34883n = 0.0f;
            this.f34884o = 0.0f;
            this.f34885p = 0;
            this.f34886q = 0;
            this.f34887r = 0;
            this.f34888s = 0;
            this.f34889t = false;
            this.f34890u = Paint.Style.FILL_AND_STROKE;
            this.f34870a = bVar.f34870a;
            this.f34871b = bVar.f34871b;
            this.f34880k = bVar.f34880k;
            this.f34872c = bVar.f34872c;
            this.f34873d = bVar.f34873d;
            this.f34876g = bVar.f34876g;
            this.f34875f = bVar.f34875f;
            this.f34881l = bVar.f34881l;
            this.f34878i = bVar.f34878i;
            this.f34887r = bVar.f34887r;
            this.f34885p = bVar.f34885p;
            this.f34889t = bVar.f34889t;
            this.f34879j = bVar.f34879j;
            this.f34882m = bVar.f34882m;
            this.f34883n = bVar.f34883n;
            this.f34884o = bVar.f34884o;
            this.f34886q = bVar.f34886q;
            this.f34888s = bVar.f34888s;
            this.f34874e = bVar.f34874e;
            this.f34890u = bVar.f34890u;
            if (bVar.f34877h != null) {
                this.f34877h = new Rect(bVar.f34877h);
            }
        }

        public b(C5772k c5772k) {
            this.f34872c = null;
            this.f34873d = null;
            this.f34874e = null;
            this.f34875f = null;
            this.f34876g = PorterDuff.Mode.SRC_IN;
            this.f34877h = null;
            this.f34878i = 1.0f;
            this.f34879j = 1.0f;
            this.f34881l = 255;
            this.f34882m = 0.0f;
            this.f34883n = 0.0f;
            this.f34884o = 0.0f;
            this.f34885p = 0;
            this.f34886q = 0;
            this.f34887r = 0;
            this.f34888s = 0;
            this.f34889t = false;
            this.f34890u = Paint.Style.FILL_AND_STROKE;
            this.f34870a = c5772k;
            this.f34871b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C5768g c5768g = new C5768g(this);
            c5768g.f34861e = true;
            return c5768g;
        }
    }

    static {
        Paint paint = new Paint(1);
        f34846R = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C5768g() {
        this(new C5772k());
    }

    public C5768g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(C5772k.m12150b(context, attributeSet, i10, i11).m12155a());
    }

    public C5768g(b bVar) {
        this.f34858b = new C5775n.f[4];
        this.f34859c = new C5775n.f[4];
        this.f34860d = new BitSet(8);
        this.f34862f = new Matrix();
        this.f34863g = new Path();
        this.f34864h = new Path();
        this.f34865i = new RectF();
        this.f34866j = new RectF();
        this.f34867k = new Region();
        this.f34868l = new Region();
        Paint paint = new Paint(1);
        this.f34848I = paint;
        Paint paint2 = new Paint(1);
        this.f34849J = paint2;
        this.f34850K = new C5507a();
        this.f34852M = Looper.getMainLooper().getThread() == Thread.currentThread() ? C5773l.a.f34931a : new C5773l();
        this.f34855P = new RectF();
        this.f34856Q = true;
        this.f34857a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m12147s();
        m12146r(getState());
        this.f34851L = new a();
    }

    public C5768g(C5772k c5772k) {
        this(new b(c5772k));
    }

    /* JADX INFO: renamed from: a */
    public void mo8572a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final void m12130b(RectF rectF, Path path) {
        C5773l c5773l = this.f34852M;
        b bVar = this.f34857a;
        c5773l.m12161a(bVar.f34870a, bVar.f34879j, rectF, this.f34851L, path);
        if (this.f34857a.f34878i != 1.0f) {
            Matrix matrix = this.f34862f;
            matrix.reset();
            float f3 = this.f34857a.f34878i;
            matrix.setScale(f3, f3, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f34855P, true);
    }

    /* JADX INFO: renamed from: c */
    public final PorterDuffColorFilter m12131c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        int color;
        int iM12132d;
        if (colorStateList == null || mode == null) {
            return (!z10 || (iM12132d = m12132d((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iM12132d, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z10) {
            colorForState = m12132d(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX INFO: renamed from: d */
    public final int m12132d(int i10) {
        b bVar = this.f34857a;
        float f3 = bVar.f34883n + bVar.f34884o + bVar.f34882m;
        C9709a c9709a = bVar.f34871b;
        return c9709a != null ? c9709a.m18216a(i10, f3) : i10;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x012a  */
    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f34848I;
        paint.setColorFilter(this.f34853N);
        int alpha = paint.getAlpha();
        int i10 = this.f34857a.f34881l;
        paint.setAlpha(((i10 + (i10 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f34849J;
        paint2.setColorFilter(this.f34854O);
        paint2.setStrokeWidth(this.f34857a.f34880k);
        int alpha2 = paint2.getAlpha();
        int i11 = this.f34857a.f34881l;
        paint2.setAlpha(((i11 + (i11 >>> 7)) * alpha2) >>> 8);
        boolean z11 = this.f34861e;
        Path path = this.f34863g;
        if (z11) {
            Paint.Style style = this.f34857a.f34890u;
            float f3 = -((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C5772k c5772k = this.f34857a.f34870a;
            c5772k.getClass();
            C5772k.a aVar = new C5772k.a(c5772k);
            InterfaceC5764c c5763b = c5772k.f34899e;
            if (!(c5763b instanceof C5770i)) {
                c5763b = new C5763b(f3, c5763b);
            }
            aVar.f34911e = c5763b;
            InterfaceC5764c c5763b2 = c5772k.f34900f;
            if (!(c5763b2 instanceof C5770i)) {
                c5763b2 = new C5763b(f3, c5763b2);
            }
            aVar.f34912f = c5763b2;
            InterfaceC5764c c5763b3 = c5772k.f34902h;
            if (!(c5763b3 instanceof C5770i)) {
                c5763b3 = new C5763b(f3, c5763b3);
            }
            aVar.f34914h = c5763b3;
            InterfaceC5764c c5763b4 = c5772k.f34901g;
            if (!(c5763b4 instanceof C5770i)) {
                c5763b4 = new C5763b(f3, c5763b4);
            }
            aVar.f34913g = c5763b4;
            C5772k c5772k2 = new C5772k(aVar);
            this.f34847H = c5772k2;
            float f10 = this.f34857a.f34879j;
            RectF rectF = this.f34866j;
            rectF.set(m12136h());
            Paint.Style style2 = this.f34857a.f34890u;
            float strokeWidth = (style2 == Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && (paint2.getStrokeWidth() > 0.0f ? 1 : (paint2.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f34852M.m12161a(c5772k2, f10, rectF, null, this.f34864h);
            m12130b(m12136h(), path);
            this.f34861e = false;
        }
        b bVar = this.f34857a;
        int i12 = bVar.f34885p;
        if (i12 == 1 || bVar.f34886q <= 0) {
            z10 = false;
        } else {
            if (i12 != 2) {
                if (!((m12139k() || path.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        if (z10) {
            canvas.save();
            b bVar2 = this.f34857a;
            int iSin = (int) (Math.sin(Math.toRadians(bVar2.f34888s)) * ((double) bVar2.f34887r));
            b bVar3 = this.f34857a;
            canvas.translate(iSin, (int) (Math.cos(Math.toRadians(bVar3.f34888s)) * ((double) bVar3.f34887r)));
            if (this.f34856Q) {
                RectF rectF2 = this.f34855P;
                int iWidth = (int) (rectF2.width() - getBounds().width());
                int iHeight = (int) (rectF2.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f34857a.f34886q * 2) + ((int) rectF2.width()) + iWidth, (this.f34857a.f34886q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f11 = (getBounds().left - this.f34857a.f34886q) - iWidth;
                float f12 = (getBounds().top - this.f34857a.f34886q) - iHeight;
                canvas2.translate(-f11, -f12);
                m12133e(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f11, f12, (Paint) null);
                bitmapCreateBitmap.recycle();
                canvas.restore();
            } else {
                m12133e(canvas);
                canvas.restore();
            }
        }
        b bVar4 = this.f34857a;
        Paint.Style style3 = bVar4.f34890u;
        if (style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.FILL) {
            m12134f(canvas, paint, path, bVar4.f34870a, m12136h());
        }
        Paint.Style style4 = this.f34857a.f34890u;
        if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
            mo12135g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m12133e(Canvas canvas) {
        if (this.f34860d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f34857a.f34887r;
        Path path = this.f34863g;
        C5507a c5507a = this.f34850K;
        if (i10 != 0) {
            canvas.drawPath(path, c5507a.f34139a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            C5775n.f fVar = this.f34858b[i11];
            int i12 = this.f34857a.f34886q;
            Matrix matrix = C5775n.f.f34956b;
            fVar.mo12163a(matrix, c5507a, i12, canvas);
            this.f34859c[i11].mo12163a(matrix, c5507a, this.f34857a.f34886q, canvas);
        }
        if (this.f34856Q) {
            b bVar = this.f34857a;
            int iSin = (int) (Math.sin(Math.toRadians(bVar.f34888s)) * ((double) bVar.f34887r));
            b bVar2 = this.f34857a;
            int iCos = (int) (Math.cos(Math.toRadians(bVar2.f34888s)) * ((double) bVar2.f34887r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f34846R);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m12134f(Canvas canvas, Paint paint, Path path, C5772k c5772k, RectF rectF) {
        if (!c5772k.m12152d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo12127a = c5772k.f34900f.mo12127a(rectF) * this.f34857a.f34879j;
            canvas.drawRoundRect(rectF, fMo12127a, fMo12127a, paint);
        }
    }

    /* JADX INFO: renamed from: g */
    public void mo12135g(Canvas canvas) {
        Paint paint = this.f34849J;
        Path path = this.f34864h;
        C5772k c5772k = this.f34847H;
        RectF rectF = this.f34866j;
        rectF.set(m12136h());
        Paint.Style style = this.f34857a.f34890u;
        float strokeWidth = (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && (paint.getStrokeWidth() > 0.0f ? 1 : (paint.getStrokeWidth() == 0.0f ? 0 : -1)) > 0 ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m12134f(canvas, paint, path, c5772k, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34857a.f34881l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f34857a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f34857a.f34885p == 2) {
            return;
        }
        if (m12139k()) {
            outline.setRoundRect(getBounds(), m12137i() * this.f34857a.f34879j);
            return;
        }
        RectF rectFM12136h = m12136h();
        Path path = this.f34863g;
        m12130b(rectFM12136h, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f34857a.f34877h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f34867k;
        region.set(bounds);
        RectF rectFM12136h = m12136h();
        Path path = this.f34863g;
        m12130b(rectFM12136h, path);
        Region region2 = this.f34868l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final RectF m12136h() {
        RectF rectF = this.f34865i;
        rectF.set(getBounds());
        return rectF;
    }

    /* JADX INFO: renamed from: i */
    public final float m12137i() {
        return this.f34857a.f34870a.f34899e.mo12127a(m12136h());
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f34861e = true;
        super.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0046  */
    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f34857a.f34875f) == null || !colorStateList.isStateful())) {
            ColorStateList colorStateList3 = this.f34857a.f34874e;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f34857a.f34873d) == null || !colorStateList2.isStateful())) {
                ColorStateList colorStateList4 = this.f34857a.f34872c;
                if (colorStateList4 == null || !colorStateList4.isStateful()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m12138j(Context context) {
        this.f34857a.f34871b = new C9709a(context);
        m12148t();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m12139k() {
        return this.f34857a.f34870a.m12152d(m12136h());
    }

    /* JADX INFO: renamed from: l */
    public final void m12140l(float f3) {
        b bVar = this.f34857a;
        if (bVar.f34883n != f3) {
            bVar.f34883n = f3;
            m12148t();
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m12141m(ColorStateList colorStateList) {
        b bVar = this.f34857a;
        if (bVar.f34872c != colorStateList) {
            bVar.f34872c = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f34857a = new b(this.f34857a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m12142n(float f3) {
        b bVar = this.f34857a;
        if (bVar.f34879j != f3) {
            bVar.f34879j = f3;
            this.f34861e = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12143o() {
        this.f34850K.m11738a(-12303292);
        this.f34857a.f34889t = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f34861e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p507yc.C10341h.b
    public boolean onStateChange(int[] iArr) {
        boolean z10 = m12146r(iArr) || m12147s();
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    /* JADX INFO: renamed from: p */
    public final void m12144p() {
        b bVar = this.f34857a;
        if (bVar.f34885p != 2) {
            bVar.f34885p = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m12145q(ColorStateList colorStateList) {
        b bVar = this.f34857a;
        if (bVar.f34873d != colorStateList) {
            bVar.f34873d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m12146r(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f34857a.f34872c == null || color2 == (colorForState2 = this.f34857a.f34872c.getColorForState(iArr, (color2 = (paint2 = this.f34848I).getColor())))) {
            z10 = false;
        } else {
            paint2.setColor(colorForState2);
            z10 = true;
        }
        if (this.f34857a.f34873d == null || color == (colorForState = this.f34857a.f34873d.getColorForState(iArr, (color = (paint = this.f34849J).getColor())))) {
            return z10;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m12147s() {
        PorterDuffColorFilter porterDuffColorFilter = this.f34853N;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f34854O;
        b bVar = this.f34857a;
        this.f34853N = m12131c(bVar.f34875f, bVar.f34876g, this.f34848I, true);
        b bVar2 = this.f34857a;
        this.f34854O = m12131c(bVar2.f34874e, bVar2.f34876g, this.f34849J, false);
        b bVar3 = this.f34857a;
        if (bVar3.f34889t) {
            this.f34850K.m11738a(bVar3.f34875f.getColorForState(getState(), 0));
        }
        if (C9804b.m18286a(porterDuffColorFilter, this.f34853N) && C9804b.m18286a(porterDuffColorFilter2, this.f34854O)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        b bVar = this.f34857a;
        if (bVar.f34881l != i10) {
            bVar.f34881l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34857a.getClass();
        super.invalidateSelf();
    }

    @Override // gd.InterfaceC5776o
    public final void setShapeAppearanceModel(C5772k c5772k) {
        this.f34857a.f34870a = c5772k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f34857a.f34875f = colorStateList;
        m12147s();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f34857a;
        if (bVar.f34876g != mode) {
            bVar.f34876g = mode;
            m12147s();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12148t() {
        b bVar = this.f34857a;
        float f3 = bVar.f34883n + bVar.f34884o;
        bVar.f34886q = (int) Math.ceil(0.75f * f3);
        this.f34857a.f34887r = (int) Math.ceil(f3 * 0.25f);
        m12147s();
        super.invalidateSelf();
    }
}
