package p000;

import android.graphics.Insets;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.EditorInfo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qh2 {
    /* JADX INFO: renamed from: a */
    public static Icon m19967a(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    /* JADX INFO: renamed from: b */
    public static Insets m19968b(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    /* JADX INFO: renamed from: c */
    public static void m19969c(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    /* JADX INFO: renamed from: d */
    public static void m19970d(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
