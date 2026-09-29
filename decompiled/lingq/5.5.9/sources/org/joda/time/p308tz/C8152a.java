package org.joda.time.p308tz;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p163hp.C6096c;

/* JADX INFO: renamed from: org.joda.time.tz.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8152a implements InterfaceC8153b {

    /* JADX INFO: renamed from: a */
    public final HashMap<Locale, Map<String, Map<String, Object>>> f44261a = m16171c();

    /* JADX INFO: renamed from: b */
    public final HashMap<Locale, Map<String, Map<Boolean, Object>>> f44262b = m16171c();

    /* JADX INFO: renamed from: c */
    public static HashMap m16171c() {
        return new HashMap(7);
    }

    @Override // org.joda.time.p308tz.InterfaceC8153b
    /* JADX INFO: renamed from: a */
    public final String mo16172a(Locale locale, String str, String str2) {
        String[] strArrM16174d = m16174d(locale, str, str2);
        if (strArrM16174d == null) {
            return null;
        }
        return strArrM16174d[1];
    }

    @Override // org.joda.time.p308tz.InterfaceC8153b
    /* JADX INFO: renamed from: b */
    public final String mo16173b(Locale locale, String str, String str2) {
        String[] strArrM16174d = m16174d(locale, str, str2);
        if (strArrM16174d == null) {
            return null;
        }
        return strArrM16174d[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX INFO: renamed from: d */
    public final synchronized String[] m16174d(Locale locale, String str, String str2) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == 0) {
            return null;
        }
        try {
            Map map = this.f44261a.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<String, Object>>> map2 = this.f44261a;
                HashMap mapM16171c = m16171c();
                map2.put(locale, mapM16171c);
                map = mapM16171c;
            }
            ?? M16171c = (Map) map.get(str);
            if (M16171c == 0) {
                M16171c = m16171c();
                map.put(str, M16171c);
                String[][] zoneStrings = C6096c.m12589a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i10];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i10++;
                }
                for (String[] strArr3 : C6096c.m12589a(locale).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    M16171c.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                    if (strArr[2].equals(strArr[4])) {
                        M16171c.put(strArr[4] + "-Summer", new String[]{strArr2[4], strArr2[3]});
                    } else {
                        M16171c.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                    }
                }
            }
            return (String[]) M16171c.get(str2);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized String[] m16175e(Locale locale, String str, String str2, boolean z10) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = this.f44262b.get(locale);
            if (map == null) {
                HashMap<Locale, Map<String, Map<Boolean, Object>>> map2 = this.f44262b;
                HashMap mapM16171c = m16171c();
                map2.put(locale, mapM16171c);
                map = mapM16171c;
            }
            ?? M16171c = (Map) map.get(str);
            if (M16171c == 0) {
                M16171c = m16171c();
                map.put(str, M16171c);
                String[][] zoneStrings = C6096c.m12589a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i10];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i10++;
                }
                for (String[] strArr3 : C6096c.m12589a(locale).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    M16171c.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    M16171c.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) M16171c.get(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
