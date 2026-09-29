package p000;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;
import org.joda.time.MutableDateTime;
import org.joda.time.chrono.ISOChronology;

/* JADX INFO: loaded from: classes3.dex */
public final class t12 implements u94, s94 {

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f61740c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f61741a;

    /* JADX INFO: renamed from: b */
    public final boolean f61742b;

    public t12(DateTimeFieldType dateTimeFieldType, boolean z) {
        this.f61741a = dateTimeFieldType;
        this.f61742b = z;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return estimatePrintedLength();
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f61742b ? 6 : 20;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        int iIntValue;
        Map map;
        Locale locale = b22Var.f7782b;
        ConcurrentHashMap concurrentHashMap = f61740c;
        Map concurrentHashMap2 = (Map) concurrentHashMap.get(locale);
        if (concurrentHashMap2 == null) {
            concurrentHashMap2 = new ConcurrentHashMap();
            concurrentHashMap.put(locale, concurrentHashMap2);
        }
        DateTimeFieldType dateTimeFieldType = this.f61741a;
        Object[] objArr = (Object[]) concurrentHashMap2.get(dateTimeFieldType);
        if (objArr == null) {
            ConcurrentHashMap concurrentHashMap3 = new ConcurrentHashMap(32);
            MutableDateTime mutableDateTime = new MutableDateTime(0L, ISOChronology.m18438R(DateTimeZone.f54829a));
            f12 f12VarMo18335b = dateTimeFieldType.mo18335b(mutableDateTime.mo18365a());
            if (!f12VarMo18335b.mo11492u()) {
                ij6.m13965w("Field '", dateTimeFieldType, "' is not supported");
                return 0;
            }
            MutableDateTime.Property property = new MutableDateTime.Property(mutableDateTime, f12VarMo18335b);
            int iMo4683o = property.mo18376c().mo4683o();
            int iMo3735l = property.mo18376c().mo3735l();
            if (iMo3735l - iMo4683o > 32) {
                return ~i;
            }
            iIntValue = property.mo18376c().mo11037k(locale);
            while (iMo4683o <= iMo3735l) {
                property.m18379f(iMo4683o);
                String strM18446a = property.m18446a(locale);
                Boolean bool = Boolean.TRUE;
                concurrentHashMap3.put(strM18446a, bool);
                concurrentHashMap3.put(property.m18446a(locale).toLowerCase(locale), bool);
                concurrentHashMap3.put(property.m18446a(locale).toUpperCase(locale), bool);
                concurrentHashMap3.put(property.mo18376c().mo11035g(property.mo18377d(), locale), bool);
                concurrentHashMap3.put(property.mo18376c().mo11035g(property.mo18377d(), locale).toLowerCase(locale), bool);
                concurrentHashMap3.put(property.mo18376c().mo11035g(property.mo18377d(), locale).toUpperCase(locale), bool);
                iMo4683o++;
            }
            if ("en".equals(locale.getLanguage()) && dateTimeFieldType == DateTimeFieldType.f54816a) {
                Boolean bool2 = Boolean.TRUE;
                concurrentHashMap3.put("BCE", bool2);
                concurrentHashMap3.put("bce", bool2);
                concurrentHashMap3.put("CE", bool2);
                concurrentHashMap3.put("ce", bool2);
                iIntValue = 3;
            }
            concurrentHashMap2.put(dateTimeFieldType, new Object[]{concurrentHashMap3, Integer.valueOf(iIntValue)});
            map = concurrentHashMap3;
        } else {
            Map map2 = (Map) objArr[0];
            iIntValue = ((Integer) objArr[1]).intValue();
            map = map2;
        }
        for (int iMin = Math.min(charSequence.length(), iIntValue + i); iMin > i; iMin--) {
            String string = charSequence.subSequence(i, iMin).toString();
            if (map.containsKey(string)) {
                z12 z12VarM3187h = b22Var.m3187h();
                z12VarM3187h.f70741a = dateTimeFieldType.mo18335b(b22Var.f7781a);
                z12VarM3187h.f70742b = 0;
                z12VarM3187h.f70743c = string;
                z12VarM3187h.f70744d = locale;
                return iMin;
            }
        }
        return ~i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        String strMo11486e;
        try {
            DateTimeFieldType dateTimeFieldType = this.f61741a;
            LocalDateTime localDateTime = (LocalDateTime) ir7Var;
            if (localDateTime.m18371e(dateTimeFieldType)) {
                f12 f12VarMo18335b = dateTimeFieldType.mo18335b(localDateTime.m18369c());
                strMo11486e = this.f61742b ? f12VarMo18335b.mo11486e(localDateTime, locale) : f12VarMo18335b.mo11487h(localDateTime, locale);
            } else {
                strMo11486e = "�";
            }
            ((StringBuilder) appendable).append((CharSequence) strMo11486e);
        } catch (RuntimeException unused) {
            ((StringBuilder) appendable).append((char) 65533);
        }
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        String strMo11035g;
        try {
            f12 f12VarMo18335b = this.f61741a.mo18335b(s11Var);
            if (this.f61742b) {
                strMo11035g = f12VarMo18335b.mo11033d(j, locale);
            } else {
                strMo11035g = f12VarMo18335b.mo11035g(j, locale);
            }
            ((StringBuilder) appendable).append((CharSequence) strMo11035g);
        } catch (RuntimeException unused) {
            ((StringBuilder) appendable).append((char) 65533);
        }
    }
}
