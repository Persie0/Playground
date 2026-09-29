package androidx.compose.p017ui.text.font;

import android.content.Context;
import android.os.Build;
import p328q1.C8465b;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0698d {
    /* JADX INFO: renamed from: a */
    public static final C0697c m2597a(Context context) {
        return new C0697c(new AndroidFontLoader(context), new C8465b(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0));
    }
}
