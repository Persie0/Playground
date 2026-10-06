package p021j$.time.format;

import java.text.DateFormatSymbols;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import p021j$.time.chrono.C0426h;
import p021j$.time.chrono.InterfaceC0425g;
import p021j$.time.temporal.EnumC0472a;
import p021j$.time.temporal.InterfaceC0483l;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j$.time.format.y */
/* JADX INFO: loaded from: classes3.dex */
class C0457y {

    /* JADX INFO: renamed from: a */
    private static final ConcurrentHashMap f32992a = new ConcurrentHashMap(16, 0.75f, 2);

    /* JADX INFO: renamed from: b */
    private static final Comparator f32993b = new C0435c();

    /* JADX INFO: renamed from: c */
    private static final C0457y f32994c = new C0457y();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f32995d = 0;

    C0457y() {
    }

    /* JADX INFO: renamed from: b */
    private static String m12318b(String str) {
        return str.substring(0, Character.charCount(str.codePointAt(0)));
    }

    /* JADX INFO: renamed from: c */
    static C0457y m12319c() {
        return f32994c;
    }

    /* JADX INFO: renamed from: d */
    public String mo12275d(InterfaceC0425g interfaceC0425g, InterfaceC0483l interfaceC0483l, long j, EnumC0432C enumC0432C, Locale locale) {
        if (interfaceC0425g == C0426h.f32915a || !(interfaceC0483l instanceof EnumC0472a)) {
            return mo12276e(interfaceC0483l, j, enumC0432C, locale);
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String mo12276e(InterfaceC0483l interfaceC0483l, long j, EnumC0432C enumC0432C, Locale locale) {
        Object c0456x;
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(interfaceC0483l, locale);
        ConcurrentHashMap concurrentHashMap = f32992a;
        Object obj = concurrentHashMap.get(simpleImmutableEntry);
        if (obj == null) {
            HashMap map = new HashMap();
            int i = 0;
            if (interfaceC0483l == EnumC0472a.ERA) {
                DateFormatSymbols dateFormatSymbols = DateFormatSymbols.getInstance(locale);
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                String[] eras = dateFormatSymbols.getEras();
                while (i < eras.length) {
                    if (!eras[i].isEmpty()) {
                        long j2 = i;
                        map2.put(Long.valueOf(j2), eras[i]);
                        map3.put(Long.valueOf(j2), m12318b(eras[i]));
                    }
                    i++;
                }
                if (!map2.isEmpty()) {
                    map.put(EnumC0432C.FULL, map2);
                    map.put(EnumC0432C.SHORT, map2);
                    map.put(EnumC0432C.NARROW, map3);
                }
                c0456x = new C0456x(map);
            } else if (interfaceC0483l == EnumC0472a.MONTH_OF_YEAR) {
                DateFormatSymbols dateFormatSymbols2 = DateFormatSymbols.getInstance(locale);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                String[] months = dateFormatSymbols2.getMonths();
                for (int i2 = 0; i2 < months.length; i2++) {
                    if (!months[i2].isEmpty()) {
                        long j3 = ((long) i2) + 1;
                        map4.put(Long.valueOf(j3), months[i2]);
                        map5.put(Long.valueOf(j3), m12318b(months[i2]));
                    }
                }
                if (!map4.isEmpty()) {
                    map.put(EnumC0432C.FULL, map4);
                    map.put(EnumC0432C.NARROW, map5);
                }
                HashMap map6 = new HashMap();
                String[] shortMonths = dateFormatSymbols2.getShortMonths();
                while (i < shortMonths.length) {
                    if (!shortMonths[i].isEmpty()) {
                        map6.put(Long.valueOf(((long) i) + 1), shortMonths[i]);
                    }
                    i++;
                }
                if (!map6.isEmpty()) {
                    map.put(EnumC0432C.SHORT, map6);
                }
                c0456x = new C0456x(map);
            } else if (interfaceC0483l == EnumC0472a.DAY_OF_WEEK) {
                DateFormatSymbols dateFormatSymbols3 = DateFormatSymbols.getInstance(locale);
                HashMap map7 = new HashMap();
                String[] weekdays = dateFormatSymbols3.getWeekdays();
                map7.put(1L, weekdays[2]);
                map7.put(2L, weekdays[3]);
                map7.put(3L, weekdays[4]);
                map7.put(4L, weekdays[5]);
                map7.put(5L, weekdays[6]);
                map7.put(6L, weekdays[7]);
                map7.put(7L, weekdays[1]);
                map.put(EnumC0432C.FULL, map7);
                HashMap map8 = new HashMap();
                map8.put(1L, m12318b(weekdays[2]));
                map8.put(2L, m12318b(weekdays[3]));
                map8.put(3L, m12318b(weekdays[4]));
                map8.put(4L, m12318b(weekdays[5]));
                map8.put(5L, m12318b(weekdays[6]));
                map8.put(6L, m12318b(weekdays[7]));
                map8.put(7L, m12318b(weekdays[1]));
                map.put(EnumC0432C.NARROW, map8);
                HashMap map9 = new HashMap();
                String[] shortWeekdays = dateFormatSymbols3.getShortWeekdays();
                map9.put(1L, shortWeekdays[2]);
                map9.put(2L, shortWeekdays[3]);
                map9.put(3L, shortWeekdays[4]);
                map9.put(4L, shortWeekdays[5]);
                map9.put(5L, shortWeekdays[6]);
                map9.put(6L, shortWeekdays[7]);
                map9.put(7L, shortWeekdays[1]);
                map.put(EnumC0432C.SHORT, map9);
                c0456x = new C0456x(map);
            } else if (interfaceC0483l == EnumC0472a.AMPM_OF_DAY) {
                DateFormatSymbols dateFormatSymbols4 = DateFormatSymbols.getInstance(locale);
                HashMap map10 = new HashMap();
                HashMap map11 = new HashMap();
                String[] amPmStrings = dateFormatSymbols4.getAmPmStrings();
                while (i < amPmStrings.length) {
                    if (!amPmStrings[i].isEmpty()) {
                        long j4 = i;
                        map10.put(Long.valueOf(j4), amPmStrings[i]);
                        map11.put(Long.valueOf(j4), m12318b(amPmStrings[i]));
                    }
                    i++;
                }
                if (!map10.isEmpty()) {
                    map.put(EnumC0432C.FULL, map10);
                    map.put(EnumC0432C.SHORT, map10);
                    map.put(EnumC0432C.NARROW, map11);
                }
                c0456x = new C0456x(map);
            } else {
                c0456x = "";
            }
            concurrentHashMap.putIfAbsent(simpleImmutableEntry, c0456x);
            obj = concurrentHashMap.get(simpleImmutableEntry);
        }
        if (obj instanceof C0456x) {
            return ((C0456x) obj).m12316a(j, enumC0432C);
        }
        return null;
    }
}
