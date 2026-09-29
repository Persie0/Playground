package p277nd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import gd.C5767f;
import gd.C5768g;
import gd.C5769h;
import gd.C5772k;
import p072dd.C5151d;
import p507yc.C10341h;

/* JADX INFO: renamed from: nd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7739a extends C5768g implements C10341h.b {

    /* JADX INFO: renamed from: S */
    public CharSequence f42359S;

    /* JADX INFO: renamed from: T */
    public final Context f42360T;

    /* JADX INFO: renamed from: U */
    public final Paint.FontMetrics f42361U;

    /* JADX INFO: renamed from: V */
    public final C10341h f42362V;

    /* JADX INFO: renamed from: W */
    public final a f42363W;

    /* JADX INFO: renamed from: X */
    public final Rect f42364X;

    /* JADX INFO: renamed from: Y */
    public int f42365Y;

    /* JADX INFO: renamed from: Z */
    public int f42366Z;

    /* JADX INFO: renamed from: a0 */
    public int f42367a0;

    /* JADX INFO: renamed from: b0 */
    public int f42368b0;

    /* JADX INFO: renamed from: c0 */
    public int f42369c0;

    /* JADX INFO: renamed from: d0 */
    public int f42370d0;

    /* JADX INFO: renamed from: e0 */
    public float f42371e0;

    /* JADX INFO: renamed from: f0 */
    public float f42372f0;

    /* JADX INFO: renamed from: g0 */
    public float f42373g0;

    /* JADX INFO: renamed from: h0 */
    public float f42374h0;

    /* JADX INFO: renamed from: nd.a$a */
    public class a implements View.OnLayoutChangeListener {
        public a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            C7739a c7739a = C7739a.this;
            c7739a.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            c7739a.f42370d0 = iArr[0];
            view.getWindowVisibleDisplayFrame(c7739a.f42364X);
        }
    }

    public C7739a(Context context, int i10) {
        super(context, null, 0, i10);
        this.f42361U = new Paint.FontMetrics();
        C10341h c10341h = new C10341h(this);
        this.f42362V = c10341h;
        this.f42363W = new a();
        this.f42364X = new Rect();
        this.f42371e0 = 1.0f;
        this.f42372f0 = 1.0f;
        this.f42373g0 = 0.5f;
        this.f42374h0 = 1.0f;
        this.f42360T = context;
        TextPaint textPaint = c10341h.f52039a;
        textPaint.density = context.getResources().getDisplayMetrics().density;
        textPaint.setTextAlign(Paint.Align.CENTER);
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.save();
        float fM15333u = m15333u();
        float f3 = (float) (-((Math.sqrt(2.0d) * ((double) this.f42369c0)) - ((double) this.f42369c0)));
        canvas.scale(this.f42371e0, this.f42372f0, (getBounds().width() * 0.5f) + getBounds().left, (getBounds().height() * this.f42373g0) + getBounds().top);
        canvas.translate(fM15333u, f3);
        super.draw(canvas);
        if (this.f42359S != null) {
            Rect bounds = getBounds();
            float fCenterY = bounds.centerY();
            C10341h c10341h = this.f42362V;
            TextPaint textPaint = c10341h.f52039a;
            Paint.FontMetrics fontMetrics = this.f42361U;
            textPaint.getFontMetrics(fontMetrics);
            int i10 = (int) (fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            C5151d c5151d = c10341h.f52044f;
            TextPaint textPaint2 = c10341h.f52039a;
            if (c5151d != null) {
                textPaint2.drawableState = getState();
                c10341h.f52044f.m10934e(this.f42360T, textPaint2, c10341h.f52040b);
                textPaint2.setAlpha((int) (this.f42374h0 * 255.0f));
            }
            CharSequence charSequence = this.f42359S;
            canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), i10, textPaint2);
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f42362V.f52039a.getTextSize(), this.f42367a0);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f3 = this.f42365Y * 2;
        CharSequence charSequence = this.f42359S;
        return (int) Math.max(f3 + (charSequence == null ? 0.0f : this.f42362V.m19352a(charSequence.toString())), this.f42366Z);
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C5772k c5772k = this.f34857a.f34870a;
        c5772k.getClass();
        C5772k.a aVar = new C5772k.a(c5772k);
        aVar.f34917k = m15334v();
        setShapeAppearanceModel(new C5772k(aVar));
    }

    @Override // gd.C5768g, android.graphics.drawable.Drawable, p507yc.C10341h.b
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* JADX INFO: renamed from: u */
    public final float m15333u() {
        int i10;
        Rect rect = this.f42364X;
        if (((rect.right - getBounds().right) - this.f42370d0) - this.f42368b0 < 0) {
            i10 = ((rect.right - getBounds().right) - this.f42370d0) - this.f42368b0;
        } else {
            if (((rect.left - getBounds().left) - this.f42370d0) + this.f42368b0 <= 0) {
                return 0.0f;
            }
            i10 = ((rect.left - getBounds().left) - this.f42370d0) + this.f42368b0;
        }
        return i10;
    }

    /* JADX INFO: renamed from: v */
    public final C5769h m15334v() {
        float f3 = -m15333u();
        float fWidth = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f42369c0)))) / 2.0f;
        return new C5769h(new C5767f(this.f42369c0), Math.min(Math.max(f3, -fWidth), fWidth));
    }
}
