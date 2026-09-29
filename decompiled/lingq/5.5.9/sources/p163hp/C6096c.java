package p163hp;

import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;

/* JADX INFO: renamed from: hp.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6096c {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference<Map<String, DateTimeZone>> f35849a;

    /* JADX INFO: renamed from: hp.c$a */
    public static class a {
    }

    static {
        new a();
        f35849a = new AtomicReference<>();
    }

    /* JADX INFO: renamed from: a */
    public static final DateFormatSymbols m12589a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m12590b(String str, String str2, LinkedHashMap linkedHashMap) {
        try {
            linkedHashMap.put(str, DateTimeZone.m16014c(str2));
        } catch (RuntimeException unused) {
        }
    }
}
