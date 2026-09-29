package p000;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes2.dex */
public final class d6a extends fs5 implements zt9 {

    /* JADX INFO: renamed from: c0 */
    public CharSequence f35048c0;

    /* JADX INFO: renamed from: d0 */
    public final Context f35049d0;

    /* JADX INFO: renamed from: e0 */
    public final Paint.FontMetrics f35050e0;

    /* JADX INFO: renamed from: f0 */
    public final au9 f35051f0;

    /* JADX INFO: renamed from: g0 */
    public final wf0 f35052g0;

    /* JADX INFO: renamed from: h0 */
    public final Rect f35053h0;

    /* JADX INFO: renamed from: i0 */
    public int f35054i0;

    /* JADX INFO: renamed from: j0 */
    public int f35055j0;

    /* JADX INFO: renamed from: k0 */
    public int f35056k0;

    /* JADX INFO: renamed from: l0 */
    public int f35057l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f35058m0;

    /* JADX INFO: renamed from: n0 */
    public int f35059n0;

    /* JADX INFO: renamed from: o0 */
    public int f35060o0;

    /* JADX INFO: renamed from: p0 */
    public float f35061p0;

    /* JADX INFO: renamed from: q0 */
    public float f35062q0;

    /* JADX INFO: renamed from: r0 */
    public float f35063r0;

    /* JADX INFO: renamed from: s0 */
    public float f35064s0;

    /* JADX INFO: renamed from: t0 */
    public float f35065t0;

    public d6a(Context context, int i) {
        super(context, null, 0, i);
        this.f35050e0 = new Paint.FontMetrics();
        au9 au9Var = new au9(this);
        this.f35051f0 = au9Var;
        this.f35052g0 = new wf0(this, 3);
        this.f35053h0 = new Rect();
        this.f35061p0 = 1.0f;
        this.f35062q0 = 1.0f;
        this.f35063r0 = 0.5f;
        this.f35064s0 = 0.5f;
        this.f35065t0 = 1.0f;
        this.f35049d0 = context;
        float f = context.getResources().getDisplayMetrics().density;
        TextPaint textPaint = au9Var.f7523a;
        textPaint.density = f;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    /* JADX INFO: renamed from: F */
    public final float m10131F() {
        int i;
        Rect rect = this.f35053h0;
        if (((rect.right - getBounds().right) - this.f35060o0) - this.f35057l0 < 0) {
            i = ((rect.right - getBounds().right) - this.f35060o0) - this.f35057l0;
        } else {
            if (((rect.left - getBounds().left) - this.f35060o0) + this.f35057l0 <= 0) {
                return 0.0f;
            }
            i = ((rect.left - getBounds().left) - this.f35060o0) + this.f35057l0;
        }
        return i;
    }

    /* JADX INFO: renamed from: G */
    public final iq6 m10132G() {
        float f = -m10131F();
        float fWidth = (float) ((((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f35059n0))) / 2.0d);
        return new iq6(new hq5(this.f35059n0), Math.min(Math.max(f, -fWidth), fWidth));
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        float fM10131F = m10131F();
        float f = (float) (-((Math.sqrt(2.0d) * ((double) this.f35059n0)) - ((double) this.f35059n0)));
        canvas.scale(this.f35061p0, this.f35062q0, (getBounds().width() * this.f35063r0) + getBounds().left, (getBounds().height() * this.f35064s0) + getBounds().top);
        canvas.translate(fM10131F, f);
        super.draw(canvas);
        if (this.f35048c0 == null) {
            canvas2 = canvas;
        } else {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            au9 au9Var = this.f35051f0;
            TextPaint textPaint = au9Var.f7523a;
            Paint.FontMetrics fontMetrics = this.f35050e0;
            textPaint.getFontMetrics(fontMetrics);
            int i = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            if (au9Var.f7529g != null) {
                textPaint.drawableState = getState();
                au9Var.f7529g.m22903d(this.f35049d0, au9Var.f7523a, au9Var.f7524b);
                textPaint.setAlpha((int) (this.f35065t0 * 255.0f));
            }
            CharSequence charSequence = this.f35048c0;
            canvas2 = canvas;
            canvas2.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i, textPaint);
        }
        canvas2.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f35051f0.f7523a.getTextSize(), this.f35056k0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f = this.f35054i0 * 2;
        CharSequence charSequence = this.f35048c0;
        return (int) Math.max(f + (charSequence == null ? 0.0f : this.f35051f0.m3066a(charSequence.toString())), this.f35055j0);
    }

    @Override // p000.fs5, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.f35058m0) {
            q39 q39VarM20285l = m12067k().m20285l();
            q39VarM20285l.f57206k = m10132G();
            setShapeAppearanceModel(q39VarM20285l.m19627a());
        }
    }
}
