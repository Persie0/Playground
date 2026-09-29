package com.lingq.core.domain.model.token;

import java.util.Locale;
import kotlinx.serialization.KSerializer;
import p000.AbstractC3393o1;
import p000.bq1;
import p000.vk9;

/* JADX INFO: renamed from: com.lingq.core.domain.model.token.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1487c {
    /* JADX INFO: renamed from: a */
    public static String m8136a(Locale locale, String str, String str2, String str3, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        String string = vk9.m23376L0(bq1.m4063n0(str2, locale)).toString();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(string);
        sb.append("_");
        sb.append(str3);
        return AbstractC3393o1.m17738m(sb, "_", str4);
    }

    public final KSerializer serializer() {
        return TextToSpeechTokenUtterance$$serializer.INSTANCE;
    }
}
