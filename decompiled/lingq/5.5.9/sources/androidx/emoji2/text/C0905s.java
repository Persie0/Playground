package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p007a6.C0025d;
import p426v2.C9630d;

/* JADX INFO: renamed from: androidx.emoji2.text.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0905s implements Spannable {

    /* JADX INFO: renamed from: a */
    public boolean f6051a = false;

    /* JADX INFO: renamed from: b */
    public Spannable f6052b;

    /* JADX INFO: renamed from: androidx.emoji2.text.s$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public boolean mo3554a(Spannable spannable) {
            return spannable instanceof C9630d;
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.s$b */
    public static class b extends a {
        @Override // androidx.emoji2.text.C0905s.a
        /* JADX INFO: renamed from: a */
        public final boolean mo3554a(Spannable spannable) {
            return C0025d.m128y(spannable) || (spannable instanceof C9630d);
        }
    }

    public C0905s(Spannable spannable) {
        this.f6052b = spannable;
    }

    public C0905s(CharSequence charSequence) {
        this.f6052b = new SpannableString(charSequence);
    }

    /* JADX INFO: renamed from: a */
    public final void m3553a() {
        Spannable spannable = this.f6052b;
        if (!this.f6051a) {
            if ((Build.VERSION.SDK_INT < 28 ? new a() : new b()).mo3554a(spannable)) {
                this.f6052b = new SpannableString(spannable);
            }
        }
        this.f6051a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f6052b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f6052b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f6052b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f6052b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f6052b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f6052b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i10, int i11, Class<T> cls) {
        return (T[]) this.f6052b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f6052b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f6052b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m3553a();
        this.f6052b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        m3553a();
        this.f6052b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f6052b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f6052b.toString();
    }
}
