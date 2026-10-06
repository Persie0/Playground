package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p000.C0870ob;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class TimeFormatText implements TimeDependentText {

    /* JADX INFO: renamed from: a */
    public final SimpleDateFormat f1326a;

    /* JADX INFO: renamed from: b */
    public final int f1327b;

    /* JADX INFO: renamed from: c */
    public final TimeZone f1328c;

    /* JADX INFO: renamed from: f */
    private final Date f1329f;

    /* JADX INFO: renamed from: g */
    private long f1330g;

    /* JADX INFO: renamed from: d */
    private static final String[][] f1324d = {new String[]{"S", "s"}, new String[]{"m"}, new String[]{"H", "K", "h", "k", "j", "J", "C"}, new String[]{"a", "b", "B"}};

    /* JADX INFO: renamed from: e */
    private static final long[] f1325e = {TimeUnit.SECONDS.toMillis(1), TimeUnit.MINUTES.toMillis(1), TimeUnit.HOURS.toMillis(1), TimeUnit.HOURS.toMillis(12)};
    public static final Parcelable.Creator CREATOR = new C0870ob(2);

    public TimeFormatText(Parcel parcel) {
        this.f1326a = (SimpleDateFormat) parcel.readSerializable();
        this.f1327b = parcel.readInt();
        this.f1328c = (TimeZone) parcel.readSerializable();
        this.f1330g = -1L;
        this.f1329f = new Date();
    }

    /* JADX INFO: renamed from: c */
    private final long m1390c(long j) {
        this.f1329f.setTime(j);
        return this.f1328c.inDaylightTime(this.f1329f) ? ((long) this.f1328c.getRawOffset()) + ((long) this.f1328c.getDSTSavings()) : this.f1328c.getRawOffset();
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: a */
    public final CharSequence mo1374a(Context context, long j) {
        String str = this.f1326a.format(new Date(j));
        switch (this.f1327b) {
            case 2:
                return str.toUpperCase();
            case 3:
                return str.toLowerCase();
            default:
                return str;
        }
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: b */
    public final boolean mo1375b(long j, long j2) {
        long millis = this.f1330g;
        if (millis == -1) {
            String pattern = this.f1326a.toPattern();
            String str = "";
            int i = 0;
            boolean z = false;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == '\'') {
                    int i2 = i + 1;
                    if (i2 >= pattern.length() || pattern.charAt(i2) != '\'') {
                        z = !z;
                        i = i2;
                    } else {
                        i += 2;
                    }
                } else {
                    if (!z) {
                        str = str + pattern.charAt(i);
                    }
                    i++;
                }
            }
            for (int i3 = 0; i3 < 4 && this.f1330g == -1; i3++) {
                int i4 = 0;
                while (true) {
                    String[] strArr = f1324d[i3];
                    if (i4 >= strArr.length) {
                        break;
                    }
                    if (str.contains(strArr[i4])) {
                        this.f1330g = f1325e[i3];
                        break;
                    }
                    i4++;
                }
            }
            millis = this.f1330g;
            if (millis == -1) {
                millis = TimeUnit.DAYS.toMillis(1L);
                this.f1330g = millis;
            }
        }
        return (j + m1390c(j)) / millis == (j2 + m1390c(j2)) / millis;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f1326a);
        parcel.writeInt(this.f1327b);
        parcel.writeSerializable(this.f1328c);
    }

    public TimeFormatText(String str, int i, TimeZone timeZone) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        this.f1326a = simpleDateFormat;
        this.f1327b = i;
        this.f1330g = -1L;
        if (timeZone != null) {
            simpleDateFormat.setTimeZone(timeZone);
            this.f1328c = timeZone;
        } else {
            this.f1328c = simpleDateFormat.getTimeZone();
        }
        this.f1329f = new Date();
    }
}
