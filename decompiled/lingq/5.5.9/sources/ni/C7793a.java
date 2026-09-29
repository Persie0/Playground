package ni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.lingq.shared.uimodel.library.Accent;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.collections.C6752c;
import kotlin.text.C7076b;

/* JADX INFO: renamed from: ni.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7793a {
    /* JADX INFO: renamed from: a */
    public static final String m15497a(String str) {
        C5207g.m11111f(str, "<this>");
        Accent[] accentArrValues = Accent.values();
        ArrayList arrayList = new ArrayList(accentArrValues.length);
        for (Accent accent : accentArrValues) {
            arrayList.add(accent.getValue());
        }
        String str2 = null;
        while (true) {
            for (String str3 : C6752c.m13451s0(arrayList)) {
                if (C7076b.m14278X2(str, str3, false)) {
                    str2 = str3;
                }
            }
            return str2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final String m15498b(Object obj, String str) {
        C5207g.m11111f(str, "<this>");
        return obj + "_" + str;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15499c(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: renamed from: d */
    public static final LayoutInflater m15500d(ViewGroup viewGroup) {
        C5207g.m11111f(viewGroup, "<this>");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        C5207g.m11110e(layoutInflaterFrom, "from(this.context)");
        return layoutInflaterFrom;
    }

    /* JADX INFO: renamed from: e */
    public static final String m15501e(String str, String str2) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(str2, "language");
        Locale localeForLanguageTag = Locale.forLanguageTag(str2);
        C5207g.m11110e(localeForLanguageTag, "locale");
        String lowerCase = str.toLowerCase(localeForLanguageTag);
        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: f */
    public static final String m15502f(String str, Locale locale) {
        C5207g.m11111f(str, "<this>");
        C5207g.m11111f(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* JADX INFO: renamed from: g */
    public static final void m15503g(PopupWindow popupWindow) {
        popupWindow.getContentView().measure(-2, -2);
        popupWindow.setWidth(popupWindow.getContentView().getMeasuredWidth());
        popupWindow.setHeight(popupWindow.getContentView().getMeasuredHeight());
    }
}
