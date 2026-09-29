package p000;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class nj3 {

    /* JADX INFO: renamed from: n */
    public static final ConcurrentHashMap f52828n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String[] f52829a;

    /* JADX INFO: renamed from: b */
    public final String[] f52830b;

    /* JADX INFO: renamed from: c */
    public final String[] f52831c;

    /* JADX INFO: renamed from: d */
    public final String[] f52832d;

    /* JADX INFO: renamed from: e */
    public final String[] f52833e;

    /* JADX INFO: renamed from: f */
    public final String[] f52834f;

    /* JADX INFO: renamed from: g */
    public final TreeMap f52835g;

    /* JADX INFO: renamed from: h */
    public final TreeMap f52836h;

    /* JADX INFO: renamed from: i */
    public final TreeMap f52837i;

    /* JADX INFO: renamed from: j */
    public final int f52838j;

    /* JADX INFO: renamed from: k */
    public final int f52839k;

    /* JADX INFO: renamed from: l */
    public final int f52840l;

    /* JADX INFO: renamed from: m */
    public final int f52841m;

    public nj3(Locale locale) {
        DateFormatSymbols dateFormatSymbolsM21817a = t22.m21817a(locale);
        this.f52829a = dateFormatSymbolsM21817a.getEras();
        String[] weekdays = dateFormatSymbolsM21817a.getWeekdays();
        String[] strArr = new String[8];
        int i = 1;
        while (i < 8) {
            strArr[i] = weekdays[i < 7 ? i + 1 : 1];
            i++;
        }
        this.f52830b = strArr;
        String[] shortWeekdays = dateFormatSymbolsM21817a.getShortWeekdays();
        String[] strArr2 = new String[8];
        int i2 = 1;
        while (i2 < 8) {
            strArr2[i2] = shortWeekdays[i2 < 7 ? i2 + 1 : 1];
            i2++;
        }
        this.f52831c = strArr2;
        String[] months = dateFormatSymbolsM21817a.getMonths();
        String[] strArr3 = new String[13];
        for (int i3 = 1; i3 < 13; i3++) {
            strArr3[i3] = months[i3 - 1];
        }
        this.f52832d = strArr3;
        String[] shortMonths = dateFormatSymbolsM21817a.getShortMonths();
        String[] strArr4 = new String[13];
        for (int i4 = 1; i4 < 13; i4++) {
            strArr4[i4] = shortMonths[i4 - 1];
        }
        this.f52833e = strArr4;
        this.f52834f = dateFormatSymbolsM21817a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i5 = 0; i5 < 13; i5++) {
            numArr[i5] = Integer.valueOf(i5);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap treeMap = new TreeMap(comparator);
        this.f52835g = treeMap;
        m17459a(treeMap, this.f52829a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap treeMap2 = new TreeMap(comparator);
        this.f52836h = treeMap2;
        m17459a(treeMap2, this.f52830b, numArr);
        m17459a(treeMap2, this.f52831c, numArr);
        for (int i6 = 1; i6 <= 7; i6++) {
            treeMap2.put(String.valueOf(i6).intern(), numArr[i6]);
        }
        TreeMap treeMap3 = new TreeMap(comparator);
        this.f52837i = treeMap3;
        m17459a(treeMap3, this.f52832d, numArr);
        m17459a(treeMap3, this.f52833e, numArr);
        for (int i7 = 1; i7 <= 12; i7++) {
            treeMap3.put(String.valueOf(i7).intern(), numArr[i7]);
        }
        this.f52838j = m17461n(this.f52829a);
        this.f52839k = m17461n(this.f52830b);
        m17461n(this.f52831c);
        this.f52840l = m17461n(this.f52832d);
        m17461n(this.f52833e);
        this.f52841m = m17461n(this.f52834f);
    }

    /* JADX INFO: renamed from: a */
    public static void m17459a(TreeMap treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length < 0) {
                return;
            }
            String str = strArr[length];
            if (str != null) {
                treeMap.put(str, numArr[length]);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static nj3 m17460g(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        ConcurrentHashMap concurrentHashMap = f52828n;
        nj3 nj3Var = (nj3) concurrentHashMap.get(locale);
        if (nj3Var == null) {
            nj3Var = new nj3(locale);
            nj3 nj3Var2 = (nj3) concurrentHashMap.putIfAbsent(locale, nj3Var);
            if (nj3Var2 != null) {
                return nj3Var2;
            }
        }
        return nj3Var;
    }

    /* JADX INFO: renamed from: n */
    public static int m17461n(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m17462b(String str) {
        Integer num = (Integer) this.f52836h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.f54827l, str);
    }

    /* JADX INFO: renamed from: c */
    public final String m17463c(int i) {
        return this.f52831c[i];
    }

    /* JADX INFO: renamed from: d */
    public final String m17464d(int i) {
        return this.f52830b[i];
    }

    /* JADX INFO: renamed from: e */
    public final int m17465e(String str) {
        Integer num = (Integer) this.f52835g.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.f54816a, str);
    }

    /* JADX INFO: renamed from: f */
    public final String m17466f(int i) {
        return this.f52829a[i];
    }

    /* JADX INFO: renamed from: h */
    public final int m17467h() {
        return this.f52839k;
    }

    /* JADX INFO: renamed from: i */
    public final int m17468i() {
        return this.f52838j;
    }

    /* JADX INFO: renamed from: j */
    public final int m17469j() {
        return this.f52841m;
    }

    /* JADX INFO: renamed from: k */
    public final int m17470k() {
        return this.f52840l;
    }

    /* JADX INFO: renamed from: l */
    public final int m17471l(String str) {
        String[] strArr = this.f52834f;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.f54805H, str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* JADX INFO: renamed from: m */
    public final String m17472m(int i) {
        return this.f52834f[i];
    }

    /* JADX INFO: renamed from: o */
    public final int m17473o(String str) {
        Integer num = (Integer) this.f52837i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.f54822g, str);
    }

    /* JADX INFO: renamed from: p */
    public final String m17474p(int i) {
        return this.f52833e[i];
    }

    /* JADX INFO: renamed from: q */
    public final String m17475q(int i) {
        return this.f52832d[i];
    }
}
