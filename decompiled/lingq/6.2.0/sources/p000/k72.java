package p000;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class k72 {

    /* JADX INFO: renamed from: a */
    public final HashMap f46807a = m14930a();

    /* JADX INFO: renamed from: b */
    public final HashMap f46808b = m14930a();

    /* JADX INFO: renamed from: a */
    public static HashMap m14930a() {
        return new HashMap(7);
    }

    /* JADX INFO: renamed from: b */
    public final String m14931b(String str, String str2, Locale locale) {
        String[] strArrM14933d = m14933d(str, str2, locale);
        if (strArrM14933d == null) {
            return null;
        }
        return strArrM14933d[1];
    }

    /* JADX INFO: renamed from: c */
    public final String m14932c(Locale locale, String str, String str2, boolean z) {
        String[] strArrM14934e = m14934e(locale, str, str2, z);
        if (strArrM14934e == null) {
            return null;
        }
        return strArrM14934e[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX INFO: renamed from: d */
    public final synchronized String[] m14933d(String str, String str2, Locale locale) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == 0) {
            return null;
        }
        try {
            Map map = (Map) this.f46807a.get(locale);
            if (map == null) {
                HashMap map2 = this.f46807a;
                HashMap mapM14930a = m14930a();
                map2.put(locale, mapM14930a);
                map = mapM14930a;
            }
            ?? M14930a = (Map) map.get(str);
            if (M14930a == 0) {
                M14930a = m14930a();
                map.put(str, M14930a);
                String[][] zoneStrings = t22.m21817a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i++;
                }
                for (String[] strArr3 : t22.m21817a(locale).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    M14930a.put(strArr[2], new String[]{strArr2[2], strArr2[1]});
                    if (strArr[2].equals(strArr[4])) {
                        M14930a.put(strArr[4] + "-Summer", new String[]{strArr2[4], strArr2[3]});
                    } else {
                        M14930a.put(strArr[4], new String[]{strArr2[4], strArr2[3]});
                    }
                }
            }
            return (String[]) M14930a.get(str2);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.HashMap] */
    /* JADX INFO: renamed from: e */
    public final synchronized String[] m14934e(Locale locale, String str, String str2, boolean z) {
        String[] strArr;
        String[] strArr2 = null;
        if (locale == null || str == null) {
            return null;
        }
        try {
            if (str.startsWith("Etc/")) {
                str = str.substring(4);
            }
            Map map = (Map) this.f46808b.get(locale);
            if (map == null) {
                HashMap map2 = this.f46808b;
                HashMap mapM14930a = m14930a();
                map2.put(locale, mapM14930a);
                map = mapM14930a;
            }
            ?? M14930a = (Map) map.get(str);
            if (M14930a == 0) {
                M14930a = m14930a();
                map.put(str, M14930a);
                String[][] zoneStrings = t22.m21817a(Locale.ENGLISH).getZoneStrings();
                int length = zoneStrings.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strArr = null;
                        break;
                    }
                    strArr = zoneStrings[i];
                    if (strArr != null && strArr.length >= 5 && str.equals(strArr[0])) {
                        break;
                    }
                    i++;
                }
                for (String[] strArr3 : t22.m21817a(locale).getZoneStrings()) {
                    if (strArr3 != null && strArr3.length >= 5 && str.equals(strArr3[0])) {
                        strArr2 = strArr3;
                        break;
                    }
                }
                if (strArr != null && strArr2 != null) {
                    M14930a.put(Boolean.TRUE, new String[]{strArr2[2], strArr2[1]});
                    M14930a.put(Boolean.FALSE, new String[]{strArr2[4], strArr2[3]});
                }
            }
            return (String[]) M14930a.get(Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m14935f(String str, String str2, Locale locale) {
        String[] strArrM14933d = m14933d(str, str2, locale);
        if (strArrM14933d == null) {
            return null;
        }
        return strArrM14933d[0];
    }

    /* JADX INFO: renamed from: g */
    public final String m14936g(Locale locale, String str, String str2, boolean z) {
        String[] strArrM14934e = m14934e(locale, str, str2, z);
        if (strArrM14934e == null) {
            return null;
        }
        return strArrM14934e[0];
    }
}
