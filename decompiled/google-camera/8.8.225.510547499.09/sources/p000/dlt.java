package p000;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;
import p021j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dlt {

    /* JADX INFO: renamed from: a */
    public static final Duration f11991a = Duration.ofSeconds(2);

    /* JADX INFO: renamed from: b */
    private static final mwx f11992b = mwx.m17121p(gyw.VIDEO, "'VID'_yyyyMMdd_HHmmss", gyw.VIDEO_SNAPSHOT, "'VID_SNAP'_yyyyMMdd_HHmmss", gyw.TIMELAPSE, "'TIMELAPSE'_yyyyMMdd_HHmmss");

    /* JADX INFO: renamed from: a */
    public static String m6367a(gyw gywVar, long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        String str = (String) f11992b.get(gywVar);
        str.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat.format(gregorianCalendar.getTime());
    }
}
