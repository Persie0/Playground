package p000;

import java.text.DateFormatSymbols;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public abstract class t22 {

    /* JADX INFO: renamed from: a */
    public static final AtomicReference f61763a = new AtomicReference();

    /* JADX INFO: renamed from: a */
    public static final DateFormatSymbols m21817a(Locale locale) {
        try {
            return (DateFormatSymbols) DateFormatSymbols.class.getMethod("getInstance", Locale.class).invoke(null, locale);
        } catch (Exception unused) {
            return new DateFormatSymbols(locale);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m21818b(LinkedHashMap linkedHashMap, String str, String str2) {
        try {
            linkedHashMap.put(str, DateTimeZone.m18337c(str2));
        } catch (RuntimeException unused) {
        }
    }
}
