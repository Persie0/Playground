package p000;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.Gravity;
import p021j$.util.Objects;

/* JADX INFO: renamed from: om */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class C0881om {

    /* JADX INFO: renamed from: a */
    private static final Class[] f46283a = {ForegroundColorSpan.class, LocaleSpan.class, SubscriptSpan.class, SuperscriptSpan.class, StrikethroughSpan.class, StyleSpan.class, TypefaceSpan.class, UnderlineSpan.class};

    /* JADX INFO: renamed from: c */
    private TextPaint f46285c;

    /* JADX INFO: renamed from: d */
    private String f46286d;

    /* JADX INFO: renamed from: e */
    private CharSequence f46287e;

    /* JADX INFO: renamed from: f */
    private CharSequence f46288f;

    /* JADX INFO: renamed from: g */
    private float f46289g;

    /* JADX INFO: renamed from: h */
    private StaticLayout f46290h;

    /* JADX INFO: renamed from: p */
    private boolean f46298p;

    /* JADX INFO: renamed from: q */
    private boolean f46299q;

    /* JADX INFO: renamed from: b */
    private final Rect f46284b = new Rect();

    /* JADX INFO: renamed from: i */
    private int f46291i = 17;

    /* JADX INFO: renamed from: j */
    private int f46292j = 1;

    /* JADX INFO: renamed from: k */
    private final TextUtils.TruncateAt f46293k = TextUtils.TruncateAt.END;

    /* JADX INFO: renamed from: l */
    private Layout.Alignment f46294l = Layout.Alignment.ALIGN_CENTER;

    /* JADX INFO: renamed from: m */
    private final Rect f46295m = new Rect();

    /* JADX INFO: renamed from: n */
    private final Rect f46296n = new Rect();

    /* JADX INFO: renamed from: o */
    private boolean f46297o = false;

    /* JADX INFO: renamed from: a */
    public final void m18643a(Canvas canvas, Rect rect) {
        String string;
        if (TextUtils.isEmpty(this.f46288f)) {
            return;
        }
        if (this.f46298p || this.f46284b.width() != rect.width() || this.f46284b.height() != rect.height()) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            if (this.f46285c == null) {
                m18648f(new TextPaint());
            }
            float f = 1.0f - this.f46289g;
            TextPaint textPaint = new TextPaint(this.f46285c);
            textPaint.setTextSize(Math.min(iHeight / this.f46292j, textPaint.getTextSize()));
            CharSequence charSequence = this.f46288f;
            int i = (int) (iWidth * (f + 0.0f));
            float f2 = i;
            if (textPaint.measureText(charSequence, 0, charSequence.length()) > f2) {
                TextUtils.TruncateAt truncateAt = this.f46293k;
                int i2 = 7;
                if (truncateAt != null && truncateAt != TextUtils.TruncateAt.MARQUEE) {
                    i2 = 8;
                }
                CharSequence charSequenceSubSequence = this.f46288f.subSequence(0, Math.min(i2, this.f46288f.length()));
                for (float fMeasureText = textPaint.measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length()); fMeasureText > f2; fMeasureText = textPaint.measureText(charSequenceSubSequence, 0, charSequenceSubSequence.length())) {
                    textPaint.setTextSize(textPaint.getTextSize() - 1.0f);
                }
            }
            CharSequence charSequence2 = this.f46288f;
            CharSequence charSequence3 = charSequence2;
            if (this.f46297o) {
                int i3 = C0879ok.f46184a;
                if (charSequence2 == null) {
                    string = null;
                } else {
                    StringBuilder sb = new StringBuilder(charSequence2.length());
                    int length = charSequence2.length();
                    int iCharCount = 0;
                    boolean zM18588a = false;
                    while (iCharCount < length) {
                        int iCodePointAt = Character.codePointAt(charSequence2, iCharCount);
                        if (!C0879ok.m18588a(iCodePointAt)) {
                            sb.appendCodePoint(iCodePointAt);
                        } else if (!zM18588a) {
                            sb.appendCodePoint(32);
                        }
                        zM18588a = C0879ok.m18588a(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                    string = sb.toString();
                }
                this.f46286d = string;
                charSequence3 = string;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence3, 0, charSequence3.length(), textPaint, i);
            builderObtain.setBreakStrategy(1);
            builderObtain.setEllipsize(this.f46293k);
            builderObtain.setHyphenationFrequency(2);
            builderObtain.setMaxLines(this.f46292j);
            builderObtain.setAlignment(this.f46294l);
            this.f46290h = builderObtain.build();
            this.f46298p = false;
            this.f46299q = true;
        }
        if (this.f46299q || !this.f46284b.equals(rect)) {
            this.f46284b.set(rect);
            int i4 = !m18650h() ? 1 : 0;
            float fWidth = this.f46284b.width() * (m18650h() ? this.f46289g : 0.0f);
            this.f46295m.set(this.f46284b.left + ((int) fWidth), this.f46284b.top + ((int) (this.f46284b.height() * 0.0f)), this.f46284b.right - ((int) (this.f46284b.width() * (m18650h() ? 0.0f : this.f46289g))), this.f46284b.bottom - ((int) (this.f46284b.height() * 0.0f)));
            Gravity.apply(this.f46291i, this.f46290h.getWidth(), this.f46290h.getHeight(), this.f46295m, this.f46296n, i4);
            this.f46299q = false;
        }
        canvas.save();
        canvas.translate(this.f46296n.left, this.f46296n.top);
        this.f46290h.draw(canvas);
        canvas.restore();
    }

    /* JADX INFO: renamed from: b */
    public final void m18644b(Layout.Alignment alignment) {
        if (this.f46294l == alignment) {
            return;
        }
        this.f46294l = alignment;
        this.f46298p = true;
    }

    /* JADX INFO: renamed from: c */
    public final void m18645c(int i) {
        if (this.f46291i == i) {
            return;
        }
        this.f46291i = i;
        this.f46299q = true;
    }

    /* JADX INFO: renamed from: d */
    public final void m18646d(boolean z) {
        if (this.f46297o == z) {
            return;
        }
        this.f46297o = z;
        if (TextUtils.equals(this.f46286d, this.f46288f)) {
            return;
        }
        this.f46298p = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m18647e(int i) {
        if (this.f46292j != i) {
            this.f46292j = i;
            this.f46298p = true;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m18648f(TextPaint textPaint) {
        this.f46285c = textPaint;
        this.f46298p = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m18649g(CharSequence charSequence) {
        if (Objects.equals(this.f46287e, charSequence)) {
            return;
        }
        this.f46287e = charSequence;
        if (charSequence instanceof Spanned) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            for (Object obj : spannableStringBuilder.getSpans(0, charSequence.length(), Object.class)) {
                Class[] clsArr = f46283a;
                int i = 0;
                while (true) {
                    if (i >= 8) {
                        spannableStringBuilder.removeSpan(obj);
                        break;
                    } else if (clsArr[i].isInstance(obj)) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            charSequence = spannableStringBuilder;
        }
        this.f46288f = charSequence;
        this.f46298p = true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m18650h() {
        return this.f46290h.getParagraphDirection(0) == 1;
    }

    /* JADX INFO: renamed from: i */
    public final void m18651i(float f) {
        if (this.f46289g == f) {
            return;
        }
        this.f46289g = f;
        this.f46298p = true;
    }
}
