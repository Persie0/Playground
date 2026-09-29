package androidx.emoji2.text;

import android.text.TextPaint;

/* JADX INFO: renamed from: androidx.emoji2.text.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0890d implements C0892f.e {

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal<StringBuilder> f5980b = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public final TextPaint f5981a;

    public C0890d() {
        TextPaint textPaint = new TextPaint();
        this.f5981a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
