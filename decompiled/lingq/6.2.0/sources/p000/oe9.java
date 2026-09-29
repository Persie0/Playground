package p000;

import android.text.Html;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oe9 {

    /* JADX INFO: renamed from: a */
    public static final Pattern f54250a = Pattern.compile("(&#13;)?&#10;");

    /* JADX INFO: renamed from: a */
    public static String m17952a(CharSequence charSequence) {
        return f54250a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }
}
