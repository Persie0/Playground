package androidx.activity;

import android.app.LocaleManager;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: androidx.activity.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0189h {
    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ LocaleManager m813a(Object obj) {
        return (LocaleManager) obj;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ BoringLayout m816d(CharSequence charSequence, TextPaint textPaint, int i10, Layout.Alignment alignment, float f3, float f10, BoringLayout.Metrics metrics, boolean z10, TextUtils.TruncateAt truncateAt, int i11, boolean z11) {
        return new BoringLayout(charSequence, textPaint, i10, alignment, f3, f10, metrics, z10, truncateAt, i11, z11);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m818f() {
    }
}
