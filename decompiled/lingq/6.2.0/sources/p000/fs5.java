package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
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
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class fs5 extends Drawable implements t49 {

    /* JADX INFO: renamed from: a0 */
    public static final Paint f39556a0;

    /* JADX INFO: renamed from: b0 */
    public static final es5[] f39557b0;

    /* JADX INFO: renamed from: H */
    public final Region f39558H;

    /* JADX INFO: renamed from: I */
    public final Region f39559I;

    /* JADX INFO: renamed from: J */
    public final Paint f39560J;

    /* JADX INFO: renamed from: K */
    public final Paint f39561K;

    /* JADX INFO: renamed from: L */
    public final m39 f39562L;

    /* JADX INFO: renamed from: M */
    public final or3 f39563M;

    /* JADX INFO: renamed from: N */
    public final wv5 f39564N;

    /* JADX INFO: renamed from: O */
    public PorterDuffColorFilter f39565O;

    /* JADX INFO: renamed from: P */
    public PorterDuffColorFilter f39566P;

    /* JADX INFO: renamed from: Q */
    public int f39567Q;

    /* JADX INFO: renamed from: R */
    public final RectF f39568R;

    /* JADX INFO: renamed from: S */
    public boolean f39569S;

    /* JADX INFO: renamed from: T */
    public boolean f39570T;

    /* JADX INFO: renamed from: U */
    public r39 f39571U;

    /* JADX INFO: renamed from: V */
    public zf9 f39572V;

    /* JADX INFO: renamed from: W */
    public final yf9[] f39573W;

    /* JADX INFO: renamed from: X */
    public float[] f39574X;

    /* JADX INFO: renamed from: Y */
    public float[] f39575Y;

    /* JADX INFO: renamed from: Z */
    public C3487q7 f39576Z;

    /* JADX INFO: renamed from: a */
    public final cc4 f39577a;

    /* JADX INFO: renamed from: b */
    public ds5 f39578b;

    /* JADX INFO: renamed from: c */
    public final k49[] f39579c;

    /* JADX INFO: renamed from: d */
    public final k49[] f39580d;

    /* JADX INFO: renamed from: e */
    public final BitSet f39581e;

    /* JADX INFO: renamed from: f */
    public boolean f39582f;

    /* JADX INFO: renamed from: g */
    public boolean f39583g;

    /* JADX INFO: renamed from: h */
    public final Matrix f39584h;

    /* JADX INFO: renamed from: i */
    public final Path f39585i;

    /* JADX INFO: renamed from: j */
    public final Path f39586j;

    /* JADX INFO: renamed from: k */
    public final RectF f39587k;

    /* JADX INFO: renamed from: l */
    public final RectF f39588l;

    static {
        Paint paint = new Paint(1);
        f39556a0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f39557b0 = new es5[4];
        int i = 0;
        while (true) {
            es5[] es5VarArr = f39557b0;
            if (i >= es5VarArr.length) {
                return;
            }
            es5VarArr[i] = new es5(i);
            i++;
        }
    }

    public fs5(ds5 ds5Var) {
        this.f39577a = new cc4(this);
        this.f39579c = new k49[4];
        this.f39580d = new k49[4];
        this.f39581e = new BitSet(8);
        this.f39584h = new Matrix();
        this.f39585i = new Path();
        this.f39586j = new Path();
        this.f39587k = new RectF();
        this.f39588l = new RectF();
        this.f39558H = new Region();
        this.f39559I = new Region();
        Paint paint = new Paint(1);
        this.f39560J = paint;
        Paint paint2 = new Paint(1);
        this.f39561K = paint2;
        this.f39562L = new m39();
        this.f39564N = wv5.m24163e();
        this.f39568R = new RectF();
        this.f39569S = true;
        this.f39570T = true;
        this.f39573W = new yf9[4];
        this.f39578b = ds5Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m12056D();
        m12054B(getState());
        this.f39563M = new or3(this);
    }

    /* JADX INFO: renamed from: A */
    public final void m12053A(float f) {
        this.f39578b.f36170k = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m12054B(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f39578b.f36162c == null || color2 == (colorForState2 = this.f39578b.f36162c.getColorForState(iArr, (color2 = (paint2 = this.f39560J).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f39578b.f36163d == null || color == (colorForState = this.f39578b.f36163d.getColorForState(iArr, (color = (paint = this.f39561K).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: C */
    public final void m12055C(int[] iArr, boolean z) {
        fn1 fn1Var;
        RectF rectFM12065i = m12065i();
        if (!this.f39578b.f36160a.mo13922f() || rectFM12065i.isEmpty()) {
            return;
        }
        int i = 0;
        boolean z2 = z | (this.f39572V == null);
        if (this.f39574X == null) {
            this.f39574X = new float[4];
        }
        r39 r39VarMo13918b = this.f39578b.f36160a.mo13918b(iArr);
        boolean z3 = sob.m21521a(this.f39574X) && r39VarMo13918b.m20284k(m12065i());
        this.f39570T = z3;
        if (!z3) {
            this.f39582f = true;
            this.f39583g = true;
        }
        while (i < 4) {
            this.f39564N.getClass();
            if (i == 1) {
                fn1Var = r39VarMo13918b.f58568g;
            } else if (i != 2) {
                fn1Var = i != 3 ? r39VarMo13918b.f58567f : r39VarMo13918b.f58566e;
            } else {
                fn1Var = r39VarMo13918b.f58569h;
            }
            float fMo11947a = fn1Var.mo11947a(rectFM12065i);
            if (z2) {
                this.f39574X[i] = fMo11947a;
            }
            yf9[] yf9VarArr = this.f39573W;
            yf9 yf9Var = yf9VarArr[i];
            if (yf9Var != null) {
                yf9Var.m25117a(fMo11947a);
                if (z2) {
                    yf9VarArr[i].m25120e();
                }
            }
            i++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: D */
    public final boolean m12056D() {
        PorterDuffColorFilter porterDuffColorFilter = this.f39565O;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f39566P;
        ds5 ds5Var = this.f39578b;
        this.f39565O = m12060d(ds5Var.f36165f, ds5Var.f36166g, this.f39560J, true);
        ds5 ds5Var2 = this.f39578b;
        this.f39566P = m12060d(ds5Var2.f36164e, ds5Var2.f36166g, this.f39561K, false);
        this.f39578b.getClass();
        return (Objects.equals(porterDuffColorFilter, this.f39565O) && Objects.equals(porterDuffColorFilter2, this.f39566P)) ? false : true;
    }

    /* JADX INFO: renamed from: E */
    public final void m12057E() {
        ds5 ds5Var = this.f39578b;
        float f = ds5Var.f36173n + 0.0f;
        ds5Var.f36175p = (int) Math.ceil(0.75f * f);
        this.f39578b.f36176q = (int) Math.ceil(f * 0.25f);
        m12056D();
        if (m12070n() || !m12073q()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo11471a() {
        invalidateSelf();
    }

    /* JADX INFO: renamed from: b */
    public final void m12058b(RectF rectF, Path path) {
        this.f39564N.m24165b(this.f39578b.f36160a.mo13920d(), this.f39574X, this.f39578b.f36169j, rectF, this.f39563M, path);
        if (this.f39578b.f36168i != 1.0f) {
            Matrix matrix = this.f39584h;
            matrix.reset();
            float f = this.f39578b.f36168i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f39568R, true);
    }

    /* JADX INFO: renamed from: c */
    public final float m12059c(RectF rectF, r39 r39Var, float[] fArr) {
        if (fArr == null) {
            if (r39Var.m20284k(rectF)) {
                return r39Var.f58566e.mo11947a(rectF);
            }
            return -1.0f;
        }
        if (this.f39570T) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: d */
    public final PorterDuffColorFilter m12060d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = m12061e(colorForState);
            }
            this.f39567Q = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iM12061e = m12061e(color);
        this.f39567Q = iM12061e;
        if (iM12061e != color) {
            return new PorterDuffColorFilter(iM12061e, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f39565O;
        Paint paint2 = this.f39560J;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f39578b.f36171l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f39566P;
        Paint paint3 = this.f39561K;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f39578b.f36170k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.f39578b.f36171l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = m12070n() || !m12073q();
        Paint.Style style = this.f39578b.f36177r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.f39582f;
            paint = paint2;
            Path path = this.f39585i;
            if (z2) {
                if (z) {
                    m12058b(m12065i(), path);
                }
                this.f39582f = false;
            }
            if (m12070n()) {
                canvas.save();
                canvas.translate((int) (((double) this.f39578b.f36176q) * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f39578b.f36176q)));
                if (this.f39569S) {
                    Rect bounds = getBounds();
                    RectF rectF = this.f39568R;
                    int iWidth = (int) (rectF.width() - bounds.width());
                    int iHeight = (int) (rectF.height() - bounds.height());
                    if (iWidth < 0 || iHeight < 0) {
                        v63.m23138p(ux5.m22994q(iWidth, iHeight, "Invalid shadow bounds. Check that the treatments result in a valid path. extra width: ", " extra height: ", " path bounds: "), rectF);
                        return;
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f39578b.f36175p * 2) + ((int) rectF.width()) + iWidth, (this.f39578b.f36175p * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    int i3 = bounds.left;
                    int i4 = this.f39578b.f36175p;
                    float f = (i3 - i4) - iWidth;
                    float f2 = (bounds.top - i4) - iHeight;
                    canvas2.translate(-f, -f2);
                    m12062f(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m12062f(canvas);
                    canvas.restore();
                }
            }
            m12063g(canvas, paint, path, this.f39578b.f36160a.mo13920d(), this.f39574X, m12065i());
        } else {
            paint = paint2;
        }
        if (m12071o()) {
            if (this.f39583g) {
                r39 r39VarM12067k = m12067k();
                q39 q39VarM20285l = r39VarM12067k.m20285l();
                fn1 fn1Var = r39VarM12067k.f58566e;
                cc4 cc4Var = this.f39577a;
                q39VarM20285l.f57200e = cc4Var.m4508d(fn1Var);
                q39VarM20285l.f57201f = cc4Var.m4508d(r39VarM12067k.f58567f);
                q39VarM20285l.f57203h = cc4Var.m4508d(r39VarM12067k.f58569h);
                q39VarM20285l.f57202g = cc4Var.m4508d(r39VarM12067k.f58568g);
                this.f39571U = q39VarM20285l.m19627a();
                float[] fArr = this.f39574X;
                if (fArr != null) {
                    if (this.f39575Y == null) {
                        this.f39575Y = new float[fArr.length];
                    }
                    float fM12068l = m12068l();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.f39574X;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.f39575Y[i5] = Math.max(0.0f, fArr2[i5] - fM12068l);
                        i5++;
                    }
                } else {
                    this.f39575Y = null;
                }
                if (z) {
                    r39 r39Var = this.f39571U;
                    float[] fArr3 = this.f39575Y;
                    float f3 = this.f39578b.f36169j;
                    RectF rectFM12065i = m12065i();
                    RectF rectF2 = this.f39588l;
                    rectF2.set(rectFM12065i);
                    float fM12068l2 = m12068l();
                    rectF2.inset(fM12068l2, fM12068l2);
                    this.f39564N.m24165b(r39Var, fArr3, f3, rectF2, null, this.f39586j);
                }
                this.f39583g = false;
            }
            mo12064h(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final int m12061e(int i) {
        int i2;
        ds5 ds5Var = this.f39578b;
        float f = ds5Var.f36173n + 0.0f + ds5Var.f36172m;
        bp2 bp2Var = ds5Var.f36161b;
        if (bp2Var == null || !bp2Var.f8784a || ya1.m25016i(i, 255) != bp2Var.f8787d) {
            return i;
        }
        float f2 = bp2Var.f8788e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM18130T = omd.m18130T(ya1.m25016i(i, 255), fMin, bp2Var.f8785b);
        if (fMin > 0.0f && (i2 = bp2Var.f8786c) != 0) {
            iM18130T = ya1.m25014g(ya1.m25016i(i2, bp2.f8783f), iM18130T);
        }
        return ya1.m25016i(iM18130T, iAlpha);
    }

    /* JADX INFO: renamed from: f */
    public final void m12062f(Canvas canvas) {
        if (this.f39581e.cardinality() > 0) {
            Log.w("fs5", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f39578b.f36176q;
        Path path = this.f39585i;
        m39 m39Var = this.f39562L;
        if (i != 0) {
            canvas.drawPath(path, m39Var.f50517a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            this.f39579c[i2].m14843a(m39Var, this.f39578b.f36175p, canvas);
            this.f39580d[i2].m14843a(m39Var, this.f39578b.f36175p, canvas);
        }
        if (this.f39569S) {
            int iSin = (int) (Math.sin(Math.toRadians(0.0d)) * ((double) this.f39578b.f36176q));
            int iCos = (int) (Math.cos(Math.toRadians(0.0d)) * ((double) this.f39578b.f36176q));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f39556a0);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12063g(Canvas canvas, Paint paint, Path path, r39 r39Var, float[] fArr, RectF rectF) {
        float fM12059c = m12059c(rectF, r39Var, fArr);
        if (fM12059c < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM12059c * this.f39578b.f36169j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f39578b.f36171l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f39578b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.f39578b.f36174o == 2) {
            return;
        }
        RectF rectFM12065i = m12065i();
        if (rectFM12065i.isEmpty()) {
            return;
        }
        float fM12059c = m12059c(rectFM12065i, this.f39578b.f36160a.mo13920d(), this.f39574X);
        if (fM12059c >= 0.0f) {
            outline.setRoundRect(getBounds(), fM12059c * this.f39578b.f36169j);
            return;
        }
        boolean z = this.f39582f;
        Path path = this.f39585i;
        if (z) {
            m12058b(rectFM12065i, path);
            this.f39582f = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            vl2.m23408a(outline, path);
        } else {
            try {
                ul2.m22788a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f39578b.f36167h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f39558H;
        region.set(bounds);
        RectF rectFM12065i = m12065i();
        Path path = this.f39585i;
        m12058b(rectFM12065i, path);
        Region region2 = this.f39559I;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public void mo12064h(Canvas canvas) {
        r39 r39Var = this.f39571U;
        float[] fArr = this.f39575Y;
        RectF rectFM12065i = m12065i();
        RectF rectF = this.f39588l;
        rectF.set(rectFM12065i);
        float fM12068l = m12068l();
        rectF.inset(fM12068l, fM12068l);
        m12063g(canvas, this.f39561K, this.f39586j, r39Var, fArr, rectF);
    }

    /* JADX INFO: renamed from: i */
    public final RectF m12065i() {
        Rect bounds = getBounds();
        RectF rectF = this.f39587k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f39582f = true;
        this.f39583g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f39578b.f36165f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f39578b.f36164e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f39578b.f36163d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f39578b.f36162c;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.f39578b.f36160a.mo13922f();
    }

    /* JADX INFO: renamed from: j */
    public final float m12066j() {
        float[] fArr = this.f39574X;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM12065i = m12065i();
        r39 r39VarM12067k = m12067k();
        wv5 wv5Var = this.f39564N;
        wv5Var.getClass();
        float fMo11947a = r39VarM12067k.f58566e.mo11947a(rectFM12065i);
        r39 r39VarM12067k2 = m12067k();
        wv5Var.getClass();
        float fMo11947a2 = r39VarM12067k2.f58569h.mo11947a(rectFM12065i) + fMo11947a;
        r39 r39VarM12067k3 = m12067k();
        wv5Var.getClass();
        float fMo11947a3 = fMo11947a2 - r39VarM12067k3.f58568g.mo11947a(rectFM12065i);
        r39 r39VarM12067k4 = m12067k();
        wv5Var.getClass();
        return (fMo11947a3 - r39VarM12067k4.f58567f.mo11947a(rectFM12065i)) / 2.0f;
    }

    /* JADX INFO: renamed from: k */
    public final r39 m12067k() {
        return this.f39578b.f36160a.mo13920d();
    }

    /* JADX INFO: renamed from: l */
    public final float m12068l() {
        if (m12071o()) {
            return this.f39561K.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: m */
    public final float m12069m() {
        float[] fArr = this.f39574X;
        return fArr != null ? fArr[3] : this.f39578b.f36160a.mo13920d().f58566e.mo11947a(m12065i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f39578b = new ds5(this.f39578b);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12070n() {
        ds5 ds5Var = this.f39578b;
        int i = ds5Var.f36174o;
        if (i == 1 || ds5Var.f36175p <= 0) {
            return false;
        }
        if (i == 2) {
            return true;
        }
        if (m12073q()) {
            return false;
        }
        this.f39585i.isConvex();
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m12071o() {
        Paint.Style style = this.f39578b.f36177r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f39561K.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f39582f = true;
        this.f39583g = true;
        super.onBoundsChange(rect);
        if (!this.f39578b.f36160a.mo13922f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        boolean z = false;
        for (yf9 yf9Var : this.f39573W) {
            if (yf9Var != null && yf9Var.f69788f) {
                z = true;
                break;
            }
        }
        m12055C(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable, p000.zt9
    public boolean onStateChange(int[] iArr) {
        if (this.f39578b.f36160a.mo13922f()) {
            m12055C(iArr, false);
        }
        boolean z = m12054B(iArr) || m12056D();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final void m12072p(Context context) {
        this.f39578b.f36161b = new bp2(context);
        m12057E();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m12073q() {
        if (this.f39578b.f36160a.mo13918b(getState()).m20284k(m12065i())) {
            return this.f39574X == null || this.f39570T;
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m12074r(zf9 zf9Var) {
        if (this.f39572V == zf9Var) {
            return;
        }
        this.f39572V = zf9Var;
        int i = 0;
        while (true) {
            yf9[] yf9VarArr = this.f39573W;
            if (i >= yf9VarArr.length) {
                m12055C(getState(), true);
                invalidateSelf();
                return;
            }
            if (yf9VarArr[i] == null) {
                yf9VarArr[i] = new yf9(this, f39557b0[i]);
            }
            yf9 yf9Var = yf9VarArr[i];
            zf9 zf9Var2 = new zf9();
            zf9Var2.m25593a((float) zf9Var.f71496b);
            double d = zf9Var.f71495a;
            zf9Var2.m25594b((float) (d * d));
            yf9Var.f69795m = zf9Var2;
            i++;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12075s(float f) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36173n != f) {
            ds5Var.f36173n = f;
            m12057E();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36171l != i) {
            ds5Var.f36171l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f39578b.getClass();
        super.invalidateSelf();
    }

    @Override // p000.t49
    public final void setShapeAppearanceModel(r39 r39Var) {
        this.f39578b.f36160a = r39Var;
        this.f39574X = null;
        this.f39575Y = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f39578b.f36165f = colorStateList;
        m12056D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36166g != mode) {
            ds5Var.f36166g = mode;
            m12056D();
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m12076t(ColorStateList colorStateList) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36162c != colorStateList) {
            ds5Var.f36162c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m12077u(float f) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36169j != f) {
            ds5Var.f36169j = f;
            this.f39582f = true;
            this.f39583g = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m12078v() {
        this.f39562L.m16614a(-12303292);
        this.f39578b.getClass();
        super.invalidateSelf();
    }

    /* JADX INFO: renamed from: w */
    public final void m12079w() {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36174o != 2) {
            ds5Var.f36174o = 2;
            super.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m12080x(p39 p39Var) {
        if (p39Var instanceof r39) {
            setShapeAppearanceModel((r39) p39Var);
            return;
        }
        ih9 ih9Var = (ih9) p39Var;
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36160a != ih9Var) {
            ds5Var.f36160a = ih9Var;
            m12055C(getState(), true);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m12081y(ColorStateList colorStateList) {
        ds5 ds5Var = this.f39578b;
        if (ds5Var.f36163d != colorStateList) {
            ds5Var.f36163d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m12082z(ColorStateList colorStateList) {
        this.f39578b.f36164e = colorStateList;
        m12056D();
        super.invalidateSelf();
    }

    public fs5(Context context, AttributeSet attributeSet, int i, int i2) {
        this(r39.m20281h(context, attributeSet, i, i2).m19627a());
    }

    public fs5(r39 r39Var) {
        this(new ds5(r39Var));
    }

    public fs5(p39 p39Var) {
        this(new ds5(p39Var));
    }

    public fs5() {
        this(new r39());
    }
}
