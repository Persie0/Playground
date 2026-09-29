package p376s1;

import dm.C5207g;
import java.util.Locale;

/* JADX INFO: renamed from: s1.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8945a implements InterfaceC8949e {

    /* JADX INFO: renamed from: a */
    public final Locale f46910a;

    public C8945a(Locale locale) {
        this.f46910a = locale;
    }

    @Override // p376s1.InterfaceC8949e
    /* JADX INFO: renamed from: a */
    public final String mo17180a() {
        String languageTag = this.f46910a.toLanguageTag();
        C5207g.m11110e(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
