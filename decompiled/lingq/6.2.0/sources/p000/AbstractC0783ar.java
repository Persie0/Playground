package p000;

import android.os.LocaleList;
import android.widget.TextView;

/* JADX INFO: renamed from: ar */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0783ar {
    /* JADX INFO: renamed from: a */
    public static LocaleList m2995a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m2996b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
