package org.joda.time.chrono;

import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import p163hp.C6096c;

/* JADX INFO: renamed from: org.joda.time.chrono.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C8114g {

    /* JADX INFO: renamed from: n */
    public static final ConcurrentHashMap f44082n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final String[] f44083a;

    /* JADX INFO: renamed from: b */
    public final String[] f44084b;

    /* JADX INFO: renamed from: c */
    public final String[] f44085c;

    /* JADX INFO: renamed from: d */
    public final String[] f44086d;

    /* JADX INFO: renamed from: e */
    public final String[] f44087e;

    /* JADX INFO: renamed from: f */
    public final String[] f44088f;

    /* JADX INFO: renamed from: g */
    public final TreeMap<String, Integer> f44089g;

    /* JADX INFO: renamed from: h */
    public final TreeMap<String, Integer> f44090h;

    /* JADX INFO: renamed from: i */
    public final TreeMap<String, Integer> f44091i;

    /* JADX INFO: renamed from: j */
    public final int f44092j;

    /* JADX INFO: renamed from: k */
    public final int f44093k;

    /* JADX INFO: renamed from: l */
    public final int f44094l;

    /* JADX INFO: renamed from: m */
    public final int f44095m;

    public C8114g(Locale locale) {
        DateFormatSymbols dateFormatSymbolsM12589a = C6096c.m12589a(locale);
        this.f44083a = dateFormatSymbolsM12589a.getEras();
        String[] weekdays = dateFormatSymbolsM12589a.getWeekdays();
        String[] strArr = new String[8];
        int i10 = 1;
        while (i10 < 8) {
            strArr[i10] = weekdays[i10 < 7 ? i10 + 1 : 1];
            i10++;
        }
        this.f44084b = strArr;
        String[] shortWeekdays = dateFormatSymbolsM12589a.getShortWeekdays();
        String[] strArr2 = new String[8];
        int i11 = 1;
        while (i11 < 8) {
            strArr2[i11] = shortWeekdays[i11 < 7 ? i11 + 1 : 1];
            i11++;
        }
        this.f44085c = strArr2;
        String[] months = dateFormatSymbolsM12589a.getMonths();
        String[] strArr3 = new String[13];
        for (int i12 = 1; i12 < 13; i12++) {
            strArr3[i12] = months[i12 - 1];
        }
        this.f44086d = strArr3;
        String[] shortMonths = dateFormatSymbolsM12589a.getShortMonths();
        String[] strArr4 = new String[13];
        for (int i13 = 1; i13 < 13; i13++) {
            strArr4[i13] = shortMonths[i13 - 1];
        }
        this.f44087e = strArr4;
        this.f44088f = dateFormatSymbolsM12589a.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i14 = 0; i14 < 13; i14++) {
            numArr[i14] = Integer.valueOf(i14);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>((Comparator<? super String>) comparator);
        this.f44089g = treeMap;
        m16084a(treeMap, this.f44083a, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f44090h = treeMap2;
        m16084a(treeMap2, this.f44084b, numArr);
        m16084a(treeMap2, this.f44085c, numArr);
        for (int i15 = 1; i15 <= 7; i15++) {
            treeMap2.put(String.valueOf(i15).intern(), numArr[i15]);
        }
        TreeMap<String, Integer> treeMap3 = new TreeMap<>((Comparator<? super String>) comparator);
        this.f44091i = treeMap3;
        m16084a(treeMap3, this.f44086d, numArr);
        m16084a(treeMap3, this.f44087e, numArr);
        for (int i16 = 1; i16 <= 12; i16++) {
            treeMap3.put(String.valueOf(i16).intern(), numArr[i16]);
        }
        this.f44092j = m16086c(this.f44083a);
        this.f44093k = m16086c(this.f44084b);
        m16086c(this.f44085c);
        this.f44094l = m16086c(this.f44086d);
        m16086c(this.f44087e);
        this.f44095m = m16086c(this.f44088f);
    }

    /* JADX INFO: renamed from: a */
    public static void m16084a(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
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

    /* JADX INFO: renamed from: b */
    public static C8114g m16085b(Locale locale) {
        Locale locale2 = locale;
        if (locale2 == null) {
            locale2 = Locale.getDefault();
        }
        ConcurrentHashMap concurrentHashMap = f44082n;
        C8114g c8114g = (C8114g) concurrentHashMap.get(locale2);
        if (c8114g == null) {
            c8114g = new C8114g(locale2);
            C8114g c8114g2 = (C8114g) concurrentHashMap.putIfAbsent(locale2, c8114g);
            if (c8114g2 != null) {
                c8114g = c8114g2;
            }
        }
        return c8114g;
    }

    /* JADX INFO: renamed from: c */
    public static int m16086c(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i10 = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i10;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i10) {
                i10 = length;
            }
        }
    }
}
