package p000;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* JADX INFO: loaded from: classes2.dex */
public final class gga implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f40785a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f40786b;

    public gga(Spannable spannable) {
        this.f40786b = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f40786b.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f40786b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f40786b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f40786b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f40786b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f40786b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f40786b.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f40786b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f40786b.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.f40786b;
        if (!this.f40785a && (spannable instanceof PrecomputedText)) {
            this.f40786b = new SpannableString(spannable);
        }
        this.f40785a = true;
        this.f40786b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.f40786b;
        if (!this.f40785a && (spannable instanceof PrecomputedText)) {
            this.f40786b = new SpannableString(spannable);
        }
        this.f40785a = true;
        this.f40786b.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f40786b.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f40786b.toString();
    }
}
