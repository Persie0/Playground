package p376s1;

import android.os.LocaleList;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Locale;
import no.C7814a0;

/* JADX INFO: renamed from: s1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8946b {

    /* JADX INFO: renamed from: a */
    public LocaleList f46911a;

    /* JADX INFO: renamed from: b */
    public C8948d f46912b;

    /* JADX INFO: renamed from: c */
    public final C7814a0 f46913c = new C7814a0();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C8948d m17181a() {
        LocaleList localeList = LocaleList.getDefault();
        C5207g.m11110e(localeList, "getDefault()");
        synchronized (this.f46913c) {
            C8948d c8948d = this.f46912b;
            if (c8948d != null && localeList == this.f46911a) {
                return c8948d;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                Locale locale = localeList.get(i10);
                C5207g.m11110e(locale, "platformLocaleList[position]");
                arrayList.add(new C8947c(new C8945a(locale)));
            }
            C8948d c8948d2 = new C8948d(arrayList);
            this.f46911a = localeList;
            this.f46912b = c8948d2;
            return c8948d2;
        }
    }
}
