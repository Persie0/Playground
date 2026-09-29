package p000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class q87 extends ReplacementSpan {

    /* JADX INFO: renamed from: a */
    public final float f57386a;

    /* JADX INFO: renamed from: b */
    public final int f57387b;

    /* JADX INFO: renamed from: c */
    public final float f57388c;

    /* JADX INFO: renamed from: d */
    public final int f57389d;

    /* JADX INFO: renamed from: e */
    public final float f57390e;

    /* JADX INFO: renamed from: f */
    public final float f57391f;

    /* JADX INFO: renamed from: g */
    public final int f57392g;

    /* JADX INFO: renamed from: h */
    public Paint.FontMetricsInt f57393h;

    /* JADX INFO: renamed from: i */
    public int f57394i;

    /* JADX INFO: renamed from: j */
    public int f57395j;

    /* JADX INFO: renamed from: k */
    public boolean f57396k;

    public q87(float f, int i, float f2, int i2, fb2 fb2Var, int i3) {
        float fMo903F0 = i == 0 ? fb2Var.mo903F0(d32.m10032c0(f, 4294967296L)) : 0.0f;
        float fMo903F1 = i2 == 0 ? fb2Var.mo903F0(d32.m10032c0(f2, 4294967296L)) : 0.0f;
        this.f57386a = f;
        this.f57387b = i;
        this.f57388c = f2;
        this.f57389d = i2;
        this.f57390e = fMo903F0;
        this.f57391f = fMo903F1;
        this.f57392g = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Paint.FontMetricsInt m19761a() {
        Paint.FontMetricsInt fontMetricsInt = this.f57393h;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        fa4.m11636J("fontMetrics");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final int m19762b() {
        if (!this.f57396k) {
            j54.m14290c("PlaceholderSpan is not laid out yet.");
        }
        return this.f57395j;
    }

    /* JADX INFO: renamed from: c */
    public final int m19763c() {
        if (!this.f57396k) {
            j54.m14290c("PlaceholderSpan is not laid out yet.");
        }
        return this.f57394i;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        float f;
        float f2;
        this.f57396k = true;
        float textSize = paint.getTextSize();
        this.f57393h = paint.getFontMetricsInt();
        if (m19761a().descent <= m19761a().ascent) {
            j54.m14288a("Invalid fontMetrics: line height can not be negative.");
        }
        int i3 = this.f57387b;
        if (i3 == 0) {
            f = this.f57390e;
        } else {
            if (i3 != 1) {
                j54.m14289b("Unsupported unit.");
                C3386nv.m17631r();
                return 0;
            }
            f = this.f57386a * textSize;
        }
        this.f57394i = (int) Math.ceil(f);
        int i4 = this.f57389d;
        if (i4 == 0) {
            f2 = this.f57391f;
        } else {
            if (i4 != 1) {
                j54.m14289b("Unsupported unit.");
                C3386nv.m17631r();
                return 0;
            }
            f2 = this.f57388c * textSize;
        }
        this.f57395j = (int) Math.ceil(f2);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = m19761a().ascent;
            fontMetricsInt.descent = m19761a().descent;
            fontMetricsInt.leading = m19761a().leading;
            switch (this.f57392g) {
                case 0:
                    if (fontMetricsInt.ascent > (-m19762b())) {
                        fontMetricsInt.ascent = -m19762b();
                    }
                    break;
                case 1:
                case 4:
                    if (m19762b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = m19762b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - m19762b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - m19762b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < m19762b()) {
                        int iM19762b = fontMetricsInt.ascent - ((m19762b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iM19762b;
                        fontMetricsInt.descent = m19762b() + iM19762b;
                    }
                    break;
                default:
                    j54.m14288a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(m19761a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(m19761a().bottom, fontMetricsInt.descent);
        }
        return m19763c();
    }
}
