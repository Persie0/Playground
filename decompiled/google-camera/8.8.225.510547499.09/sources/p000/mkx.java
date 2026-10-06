package p000;

import android.content.Context;
import android.content.res.ColorStateList;
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
import android.os.Looper;
import androidx.wear.ambient.AmbientMode;
import java.util.BitSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class mkx extends Drawable implements mll {

    /* JADX INFO: renamed from: f */
    private static final Paint f40892f;

    /* JADX INFO: renamed from: a */
    public mkw f40893a;

    /* JADX INFO: renamed from: b */
    public final mlj[] f40894b;

    /* JADX INFO: renamed from: c */
    public final mlj[] f40895c;

    /* JADX INFO: renamed from: d */
    public final BitSet f40896d;

    /* JADX INFO: renamed from: e */
    public boolean f40897e;

    /* JADX INFO: renamed from: g */
    private final Matrix f40898g;

    /* JADX INFO: renamed from: h */
    private final Path f40899h;

    /* JADX INFO: renamed from: i */
    private final Path f40900i;

    /* JADX INFO: renamed from: j */
    private final RectF f40901j;

    /* JADX INFO: renamed from: k */
    private final RectF f40902k;

    /* JADX INFO: renamed from: l */
    private final Region f40903l;

    /* JADX INFO: renamed from: m */
    private final Region f40904m;

    /* JADX INFO: renamed from: n */
    private mlc f40905n;

    /* JADX INFO: renamed from: o */
    private final Paint f40906o;

    /* JADX INFO: renamed from: p */
    private final Paint f40907p;

    /* JADX INFO: renamed from: q */
    private final mle f40908q;

    /* JADX INFO: renamed from: r */
    private PorterDuffColorFilter f40909r;

    /* JADX INFO: renamed from: s */
    private PorterDuffColorFilter f40910s;

    /* JADX INFO: renamed from: t */
    private final RectF f40911t;

    /* JADX INFO: renamed from: u */
    private final AmbientMode.AmbientController f40912u;

    static {
        mkx.class.getSimpleName();
        Paint paint = new Paint(1);
        f40892f = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public mkx() {
        this(new mlc());
    }

    /* JADX INFO: renamed from: o */
    private final float m16563o() {
        if (m16569u()) {
            return this.f40907p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: p */
    private static int m16564p(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    /* JADX INFO: renamed from: q */
    private final PorterDuffColorFilter m16565q(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int iM16574d;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = m16574d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z && (iM16574d = m16574d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(iM16574d, PorterDuff.Mode.SRC_IN);
        }
        return porterDuffColorFilter;
    }

    /* JADX INFO: renamed from: r */
    private final RectF m16566r() {
        this.f40902k.set(m16576f());
        float fM16563o = m16563o();
        this.f40902k.inset(fM16563o, fM16563o);
        return this.f40902k;
    }

    /* JADX INFO: renamed from: s */
    private final void m16567s(RectF rectF, Path path) {
        mle mleVar = this.f40908q;
        mkw mkwVar = this.f40893a;
        mleVar.m16599b(mkwVar.f40870a, mkwVar.f40880k, rectF, this.f40912u, path);
        if (this.f40893a.f40879j != 1.0f) {
            this.f40898g.reset();
            Matrix matrix = this.f40898g;
            float f = this.f40893a.f40879j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f40898g);
        }
        path.computeBounds(this.f40911t, true);
    }

    /* JADX INFO: renamed from: t */
    private final void m16568t(Canvas canvas, Paint paint, Path path, mlc mlcVar, RectF rectF) {
        if (!mlcVar.m16595e(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo16491a = mlcVar.f40946c.mo16491a(rectF) * this.f40893a.f40880k;
            canvas.drawRoundRect(rectF, fMo16491a, fMo16491a, paint);
        }
    }

    /* JADX INFO: renamed from: u */
    private final boolean m16569u() {
        return (this.f40893a.f40891v == Paint.Style.FILL_AND_STROKE || this.f40893a.f40891v == Paint.Style.STROKE) && this.f40907p.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: v */
    private final boolean m16570v(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.f40893a.f40873d != null && color2 != (colorForState2 = this.f40893a.f40873d.getColorForState(iArr, (color2 = this.f40906o.getColor())))) {
            this.f40906o.setColor(colorForState2);
            z = true;
        }
        if (this.f40893a.f40874e == null || color == (colorForState = this.f40893a.f40874e.getColorForState(iArr, (color = this.f40907p.getColor())))) {
            return z;
        }
        this.f40907p.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: w */
    private final boolean m16571w() {
        PorterDuffColorFilter porterDuffColorFilter = this.f40909r;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f40910s;
        mkw mkwVar = this.f40893a;
        this.f40909r = m16565q(mkwVar.f40876g, mkwVar.f40877h, this.f40906o, true);
        mkw mkwVar2 = this.f40893a;
        ColorStateList colorStateList = mkwVar2.f40875f;
        this.f40910s = m16565q(null, mkwVar2.f40877h, this.f40907p, false);
        boolean z = this.f40893a.f40890u;
        return (aeb.m318b(porterDuffColorFilter, this.f40909r) && aeb.m318b(porterDuffColorFilter2, this.f40910s)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public final float m16572a() {
        return this.f40893a.f40884o;
    }

    /* JADX INFO: renamed from: b */
    public final float m16573b() {
        float fM16572a = m16572a();
        float f = this.f40893a.f40885p;
        return fM16572a + 0.0f;
    }

    @Override // p000.mll
    /* JADX INFO: renamed from: c */
    public final void mo4827c(mlc mlcVar) {
        this.f40893a.f40870a = mlcVar;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: d */
    protected final int m16574d(int i) {
        float fM16573b = m16573b();
        mkw mkwVar = this.f40893a;
        float f = fM16573b + mkwVar.f40883n;
        mhu mhuVar = mkwVar.f40871b;
        return mhuVar != null ? mhuVar.m16395b(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.f40906o.setColorFilter(this.f40909r);
        int alpha = this.f40906o.getAlpha();
        this.f40906o.setAlpha(m16564p(alpha, this.f40893a.f40882m));
        this.f40907p.setColorFilter(this.f40910s);
        this.f40907p.setStrokeWidth(this.f40893a.f40881l);
        int alpha2 = this.f40907p.getAlpha();
        this.f40907p.setAlpha(m16564p(alpha2, this.f40893a.f40882m));
        if (this.f40897e) {
            float f = -m16563o();
            mlc mlcVar = this.f40893a.f40870a;
            mlb mlbVarM16593c = mlcVar.m16593c();
            mlbVarM16593c.f40932a = mkv.m16547l(mlcVar.f40945b, f);
            mlbVarM16593c.f40933b = mkv.m16547l(mlcVar.f40946c, f);
            mlbVarM16593c.f40935d = mkv.m16547l(mlcVar.f40948e, f);
            mlbVarM16593c.f40934c = mkv.m16547l(mlcVar.f40947d, f);
            mlc mlcVarM16589a = mlbVarM16593c.m16589a();
            this.f40905n = mlcVarM16589a;
            this.f40908q.m16598a(mlcVarM16589a, this.f40893a.f40880k, m16566r(), this.f40900i);
            m16567s(m16576f(), this.f40899h);
            this.f40897e = false;
        }
        mkw mkwVar = this.f40893a;
        int i = mkwVar.f40886q;
        if (mkwVar.f40887r > 0 && !m16584n()) {
            this.f40899h.isConvex();
        }
        if (this.f40893a.f40891v == Paint.Style.FILL_AND_STROKE || this.f40893a.f40891v == Paint.Style.FILL) {
            m16568t(canvas, this.f40906o, this.f40899h, this.f40893a.f40870a, m16576f());
        }
        if (m16569u()) {
            m16568t(canvas, this.f40907p, this.f40900i, this.f40905n, m16566r());
        }
        this.f40906o.setAlpha(alpha);
        this.f40907p.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final ColorStateList m16575e() {
        return this.f40893a.f40873d;
    }

    /* JADX INFO: renamed from: f */
    protected final RectF m16576f() {
        this.f40901j.set(getBounds());
        return this.f40901j;
    }

    /* JADX INFO: renamed from: g */
    public final void m16577g(Context context) {
        this.f40893a.f40871b = new mhu(context);
        m16583m();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f40893a.f40882m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f40893a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = this.f40893a.f40886q;
        if (m16584n()) {
            outline.setRoundRect(getBounds(), this.f40893a.f40870a.f40945b.mo16491a(m16576f()) * this.f40893a.f40880k);
        } else {
            m16567s(m16576f(), this.f40899h);
            outline.setPath(this.f40899h);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f40893a.f40878i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.f40903l.set(getBounds());
        m16567s(m16576f(), this.f40899h);
        this.f40904m.setPath(this.f40899h, this.f40903l);
        this.f40903l.op(this.f40904m, Region.Op.DIFFERENCE);
        return this.f40903l;
    }

    /* JADX INFO: renamed from: h */
    public final void m16578h(float f) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40884o != f) {
            mkwVar.f40884o = f;
            m16583m();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16579i(ColorStateList colorStateList) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40873d != colorStateList) {
            mkwVar.f40873d = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f40897e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f40893a.f40876g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        mkw mkwVar = this.f40893a;
        ColorStateList colorStateList2 = mkwVar.f40875f;
        ColorStateList colorStateList3 = mkwVar.f40874e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f40893a.f40873d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m16580j(float f) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40880k != f) {
            mkwVar.f40880k = f;
            this.f40897e = true;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m16581k(ColorStateList colorStateList) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40874e != colorStateList) {
            mkwVar.f40874e = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m16582l(float f) {
        this.f40893a.f40881l = f;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: m */
    public final void m16583m() {
        float fM16573b = m16573b();
        this.f40893a.f40887r = (int) Math.ceil(0.75f * fM16573b);
        this.f40893a.f40888s = (int) Math.ceil(fM16573b * 0.25f);
        m16571w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f40893a = new mkw(this.f40893a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m16584n() {
        return this.f40893a.f40870a.m16595e(m16576f());
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.f40897e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean zM16570v = m16570v(iArr);
        boolean zM16571w = m16571w();
        boolean z = true;
        if (!zM16570v && !zM16571w) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40882m != i) {
            mkwVar.f40882m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f40893a.f40872c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f40893a.f40876g = colorStateList;
        m16571w();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        mkw mkwVar = this.f40893a;
        if (mkwVar.f40877h != mode) {
            mkwVar.f40877h = mode;
            m16571w();
            super.invalidateSelf();
        }
    }

    public mkx(mkw mkwVar) {
        this.f40894b = new mlj[4];
        this.f40895c = new mlj[4];
        this.f40896d = new BitSet(8);
        this.f40898g = new Matrix();
        this.f40899h = new Path();
        this.f40900i = new Path();
        this.f40901j = new RectF();
        this.f40902k = new RectF();
        this.f40903l = new Region();
        this.f40904m = new Region();
        Paint paint = new Paint(1);
        this.f40906o = paint;
        Paint paint2 = new Paint(1);
        this.f40907p = paint2;
        new Path();
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        int iM212d = acp.m212d(-16777216, 68);
        acp.m212d(-16777216, 20);
        acp.m212d(-16777216, 0);
        paint4.setColor(iM212d);
        paint3.setColor(0);
        Paint paint5 = new Paint(4);
        paint5.setStyle(Paint.Style.FILL);
        new Paint(paint5);
        this.f40908q = Looper.getMainLooper().getThread() == Thread.currentThread() ? mld.f40957a : new mle();
        this.f40911t = new RectF();
        this.f40893a = mkwVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m16571w();
        m16570v(getState());
        this.f40912u = new AmbientMode.AmbientController(this);
    }

    public mkx(mlc mlcVar) {
        this(new mkw(mlcVar));
    }
}
