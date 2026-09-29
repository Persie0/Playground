package p000;

import java.time.DateTimeException;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import kotlin.AbstractC3192a;
import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.UtcOffset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lma {

    /* JADX INFO: renamed from: a */
    public static final cs4 f49839a = AbstractC3192a.m15356a(new e5a(10));

    /* JADX INFO: renamed from: b */
    public static final cs4 f49840b = AbstractC3192a.m15356a(new e5a(11));

    /* JADX INFO: renamed from: c */
    public static final cs4 f49841c = AbstractC3192a.m15356a(new e5a(12));

    /* JADX INFO: renamed from: a */
    public static final UtcOffset m16388a(Integer num, Integer num2, Integer num3) {
        try {
            if (num != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds = ZoneOffset.ofHoursMinutesSeconds(num.intValue(), num2 != null ? num2.intValue() : 0, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds.getClass();
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds);
            }
            if (num2 != null) {
                ZoneOffset zoneOffsetOfHoursMinutesSeconds2 = ZoneOffset.ofHoursMinutesSeconds(num2.intValue() / 60, num2.intValue() % 60, num3 != null ? num3.intValue() : 0);
                zoneOffsetOfHoursMinutesSeconds2.getClass();
                return new UtcOffset(zoneOffsetOfHoursMinutesSeconds2);
            }
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(num3 != null ? num3.intValue() : 0);
            zoneOffsetOfTotalSeconds.getClass();
            return new UtcOffset(zoneOffsetOfTotalSeconds);
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final UtcOffset m16389b(String str, DateTimeFormatter dateTimeFormatter) {
        try {
            return new UtcOffset((ZoneOffset) dateTimeFormatter.parse(str, new kma()));
        } catch (DateTimeException e) {
            throw new DateTimeFormatException(e);
        }
    }
}
