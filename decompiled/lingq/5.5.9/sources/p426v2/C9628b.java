package p426v2;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: renamed from: v2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9628b {
    /* JADX INFO: renamed from: a */
    public static Spanned m18099a(String str, int i10) {
        return Html.fromHtml(str, i10);
    }

    /* JADX INFO: renamed from: b */
    public static Spanned m18100b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler) {
        return Html.fromHtml(str, i10, imageGetter, tagHandler);
    }

    /* JADX INFO: renamed from: c */
    public static String m18101c(Spanned spanned, int i10) {
        return Html.toHtml(spanned, i10);
    }
}
