package p000;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class u12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final int f63240a;

    public u12(int i) {
        this.f63240a = i;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f63240a == 1 ? 4 : 20;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return this.f63240a == 1 ? 4 : 20;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        AtomicReference atomicReference = t22.f61763a;
        Map map = (Map) atomicReference.get();
        if (map == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            DateTimeZone dateTimeZone = DateTimeZone.f54829a;
            linkedHashMap.put("UT", dateTimeZone);
            linkedHashMap.put("UTC", dateTimeZone);
            linkedHashMap.put("GMT", dateTimeZone);
            t22.m21818b(linkedHashMap, "EST", "America/New_York");
            t22.m21818b(linkedHashMap, "EDT", "America/New_York");
            t22.m21818b(linkedHashMap, "CST", "America/Chicago");
            t22.m21818b(linkedHashMap, "CDT", "America/Chicago");
            t22.m21818b(linkedHashMap, "MST", "America/Denver");
            t22.m21818b(linkedHashMap, "MDT", "America/Denver");
            t22.m21818b(linkedHashMap, "PST", "America/Los_Angeles");
            t22.m21818b(linkedHashMap, "PDT", "America/Los_Angeles");
            Map mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
            while (true) {
                if (atomicReference.compareAndSet(null, mapUnmodifiableMap)) {
                    map = mapUnmodifiableMap;
                    break;
                }
                if (atomicReference.get() != null) {
                    map = (Map) atomicReference.get();
                    break;
                }
            }
        }
        String str = null;
        for (String str2 : map.keySet()) {
            if (y12.m24828o(str2, charSequence, i) && (str == null || str2.length() > str.length())) {
                str = str2;
            }
        }
        if (str == null) {
            return ~i;
        }
        DateTimeZone dateTimeZone2 = (DateTimeZone) map.get(str);
        b22Var.f7789i = null;
        b22Var.f7784d = dateTimeZone2;
        return str.length() + i;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        long j2 = j - ((long) i);
        String strM18349h = "";
        if (dateTimeZone != null) {
            int i2 = this.f63240a;
            if (i2 == 0) {
                strM18349h = dateTimeZone.m18349h(j2, locale);
            } else if (i2 == 1) {
                strM18349h = dateTimeZone.m18353n(j2, locale);
            }
        }
        ((StringBuilder) appendable).append((CharSequence) strM18349h);
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
    }
}
