package android.support.wearable.complications;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p000.C0870ob;
import p000.C0871oc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TimeDifferenceText implements TimeDependentText {
    public static final Parcelable.Creator CREATOR = new C0870ob(0);

    /* JADX INFO: renamed from: a */
    public final long f1319a;

    /* JADX INFO: renamed from: b */
    public final long f1320b;

    /* JADX INFO: renamed from: c */
    public final int f1321c;

    /* JADX INFO: renamed from: d */
    public final boolean f1322d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f1323e;

    public TimeDifferenceText(long j, long j2, int i, boolean z, TimeUnit timeUnit) {
        this.f1319a = j;
        this.f1320b = j2;
        this.f1321c = i;
        this.f1322d = z;
        this.f1323e = timeUnit;
    }

    public TimeDifferenceText(Parcel parcel) {
        this.f1319a = parcel.readLong();
        this.f1320b = parcel.readLong();
        this.f1321c = parcel.readInt();
        this.f1322d = parcel.readByte() != 0;
        int i = parcel.readInt();
        this.f1323e = i == -1 ? null : TimeUnit.values()[i];
    }

    /* JADX INFO: renamed from: c */
    private static int m1376c(long j) {
        return m1379f(j, TimeUnit.DAYS);
    }

    /* JADX INFO: renamed from: d */
    private static int m1377d(long j) {
        return m1379f(j, TimeUnit.HOURS);
    }

    /* JADX INFO: renamed from: e */
    private static int m1378e(long j) {
        return m1379f(j, TimeUnit.MINUTES);
    }

    /* JADX INFO: renamed from: f */
    private static int m1379f(long j, TimeUnit timeUnit) {
        long millis = j / timeUnit.toMillis(1L);
        int i = 60;
        switch (C0871oc.f45416a[timeUnit.ordinal()]) {
            case 1:
                i = 1000;
                break;
            case 2:
            case 3:
                break;
            case 4:
                i = 24;
                break;
            case 5:
                i = Integer.MAX_VALUE;
                break;
            default:
                throw new IllegalArgumentException("Unit not supported: ".concat(String.valueOf(String.valueOf(timeUnit))));
        }
        return (int) (millis % ((long) i));
    }

    /* JADX INFO: renamed from: g */
    private static long m1380g(long j, long j2) {
        return (j / j2) + ((long) (j % j2 == 0 ? 0 : 1));
    }

    /* JADX INFO: renamed from: h */
    private final long m1381h(long j) {
        long j2 = this.f1319a;
        if (j < j2) {
            return j2 - j;
        }
        long j3 = this.f1320b;
        if (j <= j3) {
            return 0L;
        }
        return j - j3;
    }

    /* JADX INFO: renamed from: i */
    private static long m1382i(long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(1L);
        return m1380g(j, millis) * millis;
    }

    /* JADX INFO: renamed from: j */
    private static String m1383j(int i, Resources resources) {
        return resources.getQuantityString(C0100R.plurals.time_difference_short_days, i, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: k */
    private final String m1384k(long j, Resources resources) {
        long jM1382i = m1382i(j, TimeUnit.HOURS);
        if (m1389p(this.f1323e, TimeUnit.DAYS) || m1376c(jM1382i) >= 10) {
            return m1383j(m1376c(m1382i(j, TimeUnit.DAYS)), resources);
        }
        long jM1382i2 = m1382i(j, TimeUnit.MINUTES);
        if (m1376c(jM1382i2) > 0) {
            int iM1377d = m1377d(jM1382i);
            return iM1377d > 0 ? resources.getString(C0100R.string.time_difference_short_days_and_hours, m1383j(m1376c(jM1382i), resources), m1385l(iM1377d, resources)) : m1383j(m1376c(jM1382i), resources);
        }
        if (m1389p(this.f1323e, TimeUnit.HOURS)) {
            return m1385l(m1377d(jM1382i), resources);
        }
        int iM1377d2 = m1377d(jM1382i2);
        int iM1378e = m1378e(jM1382i2);
        if (iM1377d2 > 0) {
            return iM1378e > 0 ? resources.getString(C0100R.string.time_difference_short_hours_and_minutes, m1385l(iM1377d2, resources), m1386m(iM1378e, resources)) : m1385l(iM1377d2, resources);
        }
        return m1386m(m1378e(jM1382i2), resources);
    }

    /* JADX INFO: renamed from: l */
    private static String m1385l(int i, Resources resources) {
        return resources.getQuantityString(C0100R.plurals.time_difference_short_hours, i, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: m */
    private static String m1386m(int i, Resources resources) {
        return resources.getQuantityString(C0100R.plurals.time_difference_short_minutes, i, Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: n */
    private final String m1387n(long j, Resources resources) {
        long jM1382i = m1382i(j, TimeUnit.HOURS);
        if (m1389p(this.f1323e, TimeUnit.DAYS) || m1376c(jM1382i) > 0) {
            return m1383j(m1376c(m1382i(j, TimeUnit.DAYS)), resources);
        }
        long jM1382i2 = m1382i(j, TimeUnit.MINUTES);
        return (m1389p(this.f1323e, TimeUnit.HOURS) || m1377d(jM1382i2) > 0) ? m1385l(m1377d(jM1382i), resources) : m1386m(m1378e(jM1382i2), resources);
    }

    /* JADX INFO: renamed from: o */
    private final String m1388o(long j, Resources resources) {
        long jM1382i = m1382i(j, TimeUnit.HOURS);
        if (m1389p(this.f1323e, TimeUnit.DAYS) || m1376c(jM1382i) > 0) {
            int iM1376c = m1376c(m1382i(j, TimeUnit.DAYS));
            return resources.getQuantityString(C0100R.plurals.time_difference_words_days, iM1376c, Integer.valueOf(iM1376c));
        }
        long jM1382i2 = m1382i(j, TimeUnit.MINUTES);
        if (m1389p(this.f1323e, TimeUnit.HOURS) || m1377d(jM1382i2) > 0) {
            int iM1377d = m1377d(jM1382i);
            return resources.getQuantityString(C0100R.plurals.time_difference_words_hours, iM1377d, Integer.valueOf(iM1377d));
        }
        int iM1378e = m1378e(jM1382i2);
        return resources.getQuantityString(C0100R.plurals.time_difference_words_minutes, iM1378e, Integer.valueOf(iM1378e));
    }

    /* JADX INFO: renamed from: p */
    private static boolean m1389p(TimeUnit timeUnit, TimeUnit timeUnit2) {
        return timeUnit != null && timeUnit.toMillis(1L) >= timeUnit2.toMillis(1L);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: a */
    public final CharSequence mo1374a(Context context, long j) {
        Resources resources = context.getResources();
        long jM1381h = m1381h(j);
        if (jM1381h == 0) {
            if (this.f1322d) {
                return resources.getString(C0100R.string.time_difference_now);
            }
            jM1381h = 0;
        }
        switch (this.f1321c) {
            case 1:
                if (m1389p(this.f1323e, TimeUnit.DAYS)) {
                    return m1383j(m1376c(m1382i(jM1381h, TimeUnit.DAYS)), resources);
                }
                long jM1382i = m1382i(jM1381h, TimeUnit.MINUTES);
                if (m1389p(this.f1323e, TimeUnit.HOURS) || m1376c(jM1382i) > 0) {
                    return m1384k(jM1381h, resources);
                }
                long jM1382i2 = m1382i(jM1381h, TimeUnit.SECONDS);
                return (m1389p(this.f1323e, TimeUnit.MINUTES) || m1377d(jM1382i2) > 0) ? String.format(Locale.US, "%d:%02d", Integer.valueOf(m1377d(jM1382i)), Integer.valueOf(m1378e(jM1382i))) : String.format(Locale.US, "%02d:%02d", Integer.valueOf(m1378e(jM1382i2)), Integer.valueOf(m1379f(jM1382i2, TimeUnit.SECONDS)));
            case 2:
                return m1387n(jM1381h, resources);
            case 3:
                String strM1384k = m1384k(jM1381h, resources);
                return strM1384k.length() <= 7 ? strM1384k : m1387n(jM1381h, resources);
            case 4:
                return m1388o(jM1381h, resources);
            case 5:
                String strM1388o = m1388o(jM1381h, resources);
                return strM1388o.length() <= 7 ? strM1388o : m1387n(jM1381h, resources);
            default:
                return m1387n(jM1381h, resources);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f1319a);
        parcel.writeLong(this.f1320b);
        parcel.writeInt(this.f1321c);
        parcel.writeByte(this.f1322d ? (byte) 1 : (byte) 0);
        TimeUnit timeUnit = this.f1323e;
        parcel.writeInt(timeUnit == null ? -1 : timeUnit.ordinal());
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: b */
    public final boolean mo1375b(long j, long j2) {
        long millis;
        switch (this.f1321c) {
            case 1:
                millis = TimeUnit.SECONDS.toMillis(1L);
                break;
            default:
                millis = TimeUnit.MINUTES.toMillis(1L);
                break;
        }
        TimeUnit timeUnit = this.f1323e;
        if (timeUnit != null) {
            millis = Math.max(millis, timeUnit.toMillis(1L));
        }
        return m1380g(m1381h(j), millis) == m1380g(m1381h(j2), millis);
    }
}
