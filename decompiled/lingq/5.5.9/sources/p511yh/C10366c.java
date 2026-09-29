package p511yh;

import com.lingq.entity.Language;
import com.lingq.entity.LanguageContext;
import com.lingq.entity.LanguageContextNotification;
import com.lingq.shared.network.result.ResultLanguageContext;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tl.C9325m;

/* JADX INFO: renamed from: yh.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10366c {
    /* JADX INFO: renamed from: a */
    public static final LanguageContext m19387a(ResultLanguageContext resultLanguageContext, String str) {
        ArrayList arrayList;
        ArrayList arrayListM9705a;
        C5207g.m11111f(resultLanguageContext, "<this>");
        C5207g.m11111f(str, "code");
        int i10 = resultLanguageContext.f18441a;
        String str2 = resultLanguageContext.f18442b;
        int i11 = resultLanguageContext.f18443c;
        List<String> list = resultLanguageContext.f18444d;
        LanguageContextNotification languageContextNotification = resultLanguageContext.f18445e;
        LanguageContextNotification languageContextNotification2 = resultLanguageContext.f18446f;
        Boolean bool = resultLanguageContext.f18447g;
        String str3 = resultLanguageContext.f18448h;
        List<String> list2 = resultLanguageContext.f18449i;
        Language language = resultLanguageContext.f18450j;
        Boolean bool2 = language != null ? language.f16982b : null;
        String str4 = language != null ? language.f16983c : null;
        String str5 = language != null ? language.f16984d : null;
        Integer num = language != null ? language.f16985e : null;
        String str6 = language != null ? language.f16987g : null;
        int i12 = resultLanguageContext.f18451k;
        List<Boolean> list3 = resultLanguageContext.f18452l;
        if (list3 != null) {
            arrayList = new ArrayList(C9325m.m17681z(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(String.valueOf(((Boolean) it.next()).booleanValue()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayListM9705a = LibrarySearchQuery.C3403a.m9705a();
        } else if (list3 != null) {
            ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list3, 10));
            Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(String.valueOf(((Boolean) it2.next()).booleanValue()));
            }
            arrayListM9705a = arrayList2;
        } else {
            arrayListM9705a = null;
        }
        return new LanguageContext(str, i10, str2, i11, list, languageContextNotification, languageContextNotification2, bool, str3, i12, list2, bool2, str4, str5, num, str6, arrayListM9705a);
    }
}
