package p403u1;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p376s1.C8945a;
import p376s1.C8947c;
import p376s1.C8948d;
import p376s1.InterfaceC8949e;
import p388t1.C9177c;
import tl.C9325m;

/* JADX INFO: renamed from: u1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9378a {

    /* JADX INFO: renamed from: a */
    public static final C9378a f48170a = new C9378a();

    /* JADX INFO: renamed from: a */
    public final Object m17748a(C8948d c8948d) {
        C5207g.m11111f(c8948d, "localeList");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c8948d, 10));
        for (C8947c c8947c : c8948d) {
            C5207g.m11111f(c8947c, "<this>");
            InterfaceC8949e interfaceC8949e = c8947c.f46914a;
            C5207g.m11109d(interfaceC8949e, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((C8945a) interfaceC8949e).f46910a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* JADX INFO: renamed from: b */
    public final void m17749b(C9177c c9177c, C8948d c8948d) {
        C5207g.m11111f(c9177c, "textPaint");
        C5207g.m11111f(c8948d, "localeList");
        ArrayList arrayList = new ArrayList(C9325m.m17681z(c8948d, 10));
        for (C8947c c8947c : c8948d) {
            C5207g.m11111f(c8947c, "<this>");
            InterfaceC8949e interfaceC8949e = c8947c.f46914a;
            C5207g.m11109d(interfaceC8949e, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
            arrayList.add(((C8945a) interfaceC8949e).f46910a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        c9177c.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
