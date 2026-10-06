package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum nej {
    TIME_HOUR_OF_DAY_PADDED('H'),
    f42117b('k'),
    TIME_HOUR_12H_PADDED('I'),
    TIME_HOUR_12H('l'),
    TIME_MINUTE_OF_HOUR_PADDED('M'),
    TIME_SECONDS_OF_MINUTE_PADDED('S'),
    TIME_MILLIS_OF_SECOND_PADDED('L'),
    TIME_NANOS_OF_SECOND_PADDED('N'),
    TIME_AM_PM('p'),
    TIME_TZ_NUMERIC('z'),
    TIME_TZ_SHORT('Z'),
    TIME_EPOCH_SECONDS('s'),
    TIME_EPOCH_MILLIS('Q'),
    DATE_MONTH_FULL('B'),
    DATE_MONTH_SHORT('b'),
    DATE_MONTH_SHORT_ALT('h'),
    DATE_DAY_FULL('A'),
    DATE_DAY_SHORT('a'),
    DATE_CENTURY_PADDED('C'),
    DATE_YEAR_PADDED('Y'),
    DATE_YEAR_OF_CENTURY_PADDED('y'),
    DATE_DAY_OF_YEAR_PADDED('j'),
    DATE_MONTH_PADDED('m'),
    DATE_DAY_OF_MONTH_PADDED('d'),
    DATE_DAY_OF_MONTH('e'),
    DATETIME_HOURS_MINUTES('R'),
    DATETIME_HOURS_MINUTES_SECONDS('T'),
    DATETIME_HOURS_MINUTES_SECONDS_12H('r'),
    DATETIME_MONTH_DAY_YEAR('D'),
    DATETIME_YEAR_MONTH_DAY('F'),
    DATETIME_FULL('c');


    /* JADX INFO: renamed from: F */
    public static final Map f42114F;

    /* JADX INFO: renamed from: G */
    public final char f42142G;

    static {
        HashMap map = new HashMap();
        for (nej nejVar : values()) {
            if (map.put(Character.valueOf(nejVar.f42142G), nejVar) != null) {
                throw new IllegalStateException("duplicate format character: ".concat(String.valueOf(String.valueOf(nejVar))));
            }
        }
        f42114F = Collections.unmodifiableMap(map);
    }

    nej(char c) {
        this.f42142G = c;
    }
}
