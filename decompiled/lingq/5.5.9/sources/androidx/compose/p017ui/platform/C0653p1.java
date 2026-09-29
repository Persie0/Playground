package androidx.compose.p017ui.platform;

import android.graphics.Rect;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.text.PrecomputedText;
import android.text.TextPaint;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: androidx.compose.ui.platform.p1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0653p1 {
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ PrecomputedText.Params.Builder m2435i(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ DisplayCutout m2438l(Rect rect, List list) {
        return new DisplayCutout(rect, list);
    }

    /* JADX INFO: renamed from: y */
    public static /* bridge */ /* synthetic */ boolean m2451y(Drawable drawable) {
        return drawable instanceof AnimatedImageDrawable;
    }
}
