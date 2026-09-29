package p000;

import android.graphics.text.LineBreakConfig;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: u3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC3634u3 {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ LineBreakConfig.Builder m22413d() {
        return new LineBreakConfig.Builder();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ BoringLayout m22417h(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2, true);
    }
}
