package p021j$.time;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import p021j$.time.temporal.AbstractC0485n;
import p021j$.time.temporal.TemporalAccessor;
import p021j$.time.zone.C0493c;
import p021j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZoneId implements Serializable {

    /* JADX INFO: renamed from: a */
    public static final Map f32909a;

    static {
        Map.Entry[] entryArr = {new AbstractMap.SimpleImmutableEntry("ACT", "Australia/Darwin"), new AbstractMap.SimpleImmutableEntry("AET", "Australia/Sydney"), new AbstractMap.SimpleImmutableEntry("AGT", "America/Argentina/Buenos_Aires"), new AbstractMap.SimpleImmutableEntry("ART", "Africa/Cairo"), new AbstractMap.SimpleImmutableEntry("AST", "America/Anchorage"), new AbstractMap.SimpleImmutableEntry("BET", "America/Sao_Paulo"), new AbstractMap.SimpleImmutableEntry("BST", "Asia/Dhaka"), new AbstractMap.SimpleImmutableEntry("CAT", "Africa/Harare"), new AbstractMap.SimpleImmutableEntry("CNT", "America/St_Johns"), new AbstractMap.SimpleImmutableEntry("CST", "America/Chicago"), new AbstractMap.SimpleImmutableEntry("CTT", "Asia/Shanghai"), new AbstractMap.SimpleImmutableEntry("EAT", "Africa/Addis_Ababa"), new AbstractMap.SimpleImmutableEntry("ECT", "Europe/Paris"), new AbstractMap.SimpleImmutableEntry("IET", "America/Indiana/Indianapolis"), new AbstractMap.SimpleImmutableEntry("IST", "Asia/Kolkata"), new AbstractMap.SimpleImmutableEntry("JST", "Asia/Tokyo"), new AbstractMap.SimpleImmutableEntry("MIT", "Pacific/Apia"), new AbstractMap.SimpleImmutableEntry("NET", "Asia/Yerevan"), new AbstractMap.SimpleImmutableEntry("NST", "Pacific/Auckland"), new AbstractMap.SimpleImmutableEntry("PLT", "Asia/Karachi"), new AbstractMap.SimpleImmutableEntry("PNT", "America/Phoenix"), new AbstractMap.SimpleImmutableEntry("PRT", "America/Puerto_Rico"), new AbstractMap.SimpleImmutableEntry("PST", "America/Los_Angeles"), new AbstractMap.SimpleImmutableEntry("SST", "Pacific/Guadalcanal"), new AbstractMap.SimpleImmutableEntry("VST", "Asia/Ho_Chi_Minh"), new AbstractMap.SimpleImmutableEntry("EST", "-05:00"), new AbstractMap.SimpleImmutableEntry("MST", "-07:00"), new AbstractMap.SimpleImmutableEntry("HST", "-10:00")};
        HashMap map = new HashMap(28);
        for (int i = 0; i < 28; i++) {
            Map.Entry entry = entryArr[i];
            Object key = entry.getKey();
            key.getClass();
            Object value = entry.getValue();
            value.getClass();
            if (map.put(key, value) != null) {
                throw new IllegalArgumentException("duplicate key: " + key);
            }
        }
        f32909a = Collections.unmodifiableMap(map);
    }

    ZoneId() {
        if (getClass() != C0468p.class && getClass() != C0469q.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX INFO: renamed from: n */
    public static ZoneId m12257n(TemporalAccessor temporalAccessor) {
        ZoneId zoneId = (ZoneId) temporalAccessor.mo12253m(AbstractC0485n.m12444f());
        if (zoneId != null) {
            return zoneId;
        }
        throw new C0417b("Unable to obtain ZoneId from TemporalAccessor: " + String.valueOf(temporalAccessor) + " of type " + temporalAccessor.getClass().getName());
    }

    /* JADX INFO: renamed from: s */
    public static ZoneId m12258s(String str, Map map) {
        int i;
        if (str == null) {
            throw new NullPointerException("zoneId");
        }
        if (map == null) {
            throw new NullPointerException("aliasMap");
        }
        String str2 = (String) Objects.m12504a((String) map.get(str), str);
        if (str2.length() <= 1 || str2.startsWith("+") || str2.startsWith("-")) {
            return C0468p.m12397A(str2);
        }
        if (str2.startsWith("UTC") || str2.startsWith("GMT")) {
            i = 3;
        } else {
            if (!str2.startsWith("UT")) {
                return C0469q.m12403y(str2);
            }
            i = 2;
        }
        String strSubstring = str2.substring(0, i);
        if (str2.length() == i) {
            return m12259u(strSubstring, C0468p.f33024f);
        }
        if (str2.charAt(i) != '+' && str2.charAt(i) != '-') {
            return C0469q.m12403y(str2);
        }
        try {
            C0468p c0468pM12397A = C0468p.m12397A(str2.substring(i));
            C0468p c0468p = C0468p.f33024f;
            return m12259u(strSubstring, c0468pM12397A);
        } catch (C0417b e) {
            throw new C0417b("Invalid ID for offset-based ZoneId: ".concat(str2), e);
        }
    }

    public static ZoneId systemDefault() {
        return m12258s(TimeZone.getDefault().getID(), f32909a);
    }

    /* JADX INFO: renamed from: u */
    public static ZoneId m12259u(String str, C0468p c0468p) {
        if (str == null) {
            throw new NullPointerException("prefix");
        }
        if (c0468p == null) {
            throw new NullPointerException("offset");
        }
        if (str.isEmpty()) {
            return c0468p;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (c0468p.m12402z() != 0) {
            str = str.concat(c0468p.mo12260q());
        }
        return new C0469q(str, C0493c.m12488j(c0468p));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return mo12260q().equals(((ZoneId) obj).mo12260q());
        }
        return false;
    }

    public int hashCode() {
        return mo12260q().hashCode();
    }

    /* JADX INFO: renamed from: q */
    public abstract String mo12260q();

    /* JADX INFO: renamed from: r */
    public abstract C0493c mo12261r();

    public String toString() {
        return mo12260q();
    }
}
