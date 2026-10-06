package android.support.wearable.complications;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p000.C0870ob;
import p021j$.util.DesugarTimeZone;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class ComplicationText implements Parcelable, TimeDependentText {
    public static final Parcelable.Creator CREATOR = new C0870ob(1);

    /* JADX INFO: renamed from: a */
    private final CharSequence f1314a;

    /* JADX INFO: renamed from: b */
    private final TimeDependentText f1315b;

    /* JADX INFO: renamed from: c */
    private final CharSequence[] f1316c;

    /* JADX INFO: renamed from: d */
    private long f1317d;

    /* JADX INFO: renamed from: e */
    private CharSequence f1318e;

    public ComplicationText(Parcel parcel) {
        TimeUnit timeUnitValueOf;
        this.f1316c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", TVkaNXnfP.iPrWwp, "^8", "^9"};
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        this.f1314a = bundle.getCharSequence("surrounding_string");
        if (bundle.containsKey("difference_style") && bundle.containsKey("difference_period_start") && bundle.containsKey("difference_period_end")) {
            long j = bundle.getLong("difference_period_start");
            long j2 = bundle.getLong("difference_period_end");
            int i = bundle.getInt("difference_style");
            boolean z = bundle.getBoolean("show_now_text", true);
            String string = bundle.getString("minimum_unit");
            if (string == null) {
                timeUnitValueOf = null;
            } else {
                try {
                    timeUnitValueOf = TimeUnit.valueOf(string);
                } catch (IllegalArgumentException e) {
                    timeUnitValueOf = null;
                }
            }
            this.f1315b = new TimeDifferenceText(j, j2, i, z, timeUnitValueOf);
        } else if (bundle.containsKey("format_format_string") && bundle.containsKey("format_style")) {
            this.f1315b = new TimeFormatText(bundle.getString("format_format_string"), bundle.getInt("format_style"), bundle.containsKey("format_time_zone") ? DesugarTimeZone.getTimeZone(bundle.getString("format_time_zone")) : null);
        } else {
            this.f1315b = null;
        }
        m1373c();
    }

    /* JADX INFO: renamed from: c */
    private final void m1373c() {
        if (this.f1314a == null && this.f1315b == null) {
            throw new IllegalStateException("One of mSurroundingText and mTimeDependentText must be non-null");
        }
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: a */
    public final CharSequence mo1374a(Context context, long j) {
        CharSequence charSequenceMo1374a;
        TimeDependentText timeDependentText = this.f1315b;
        if (timeDependentText == null) {
            return this.f1314a;
        }
        if (this.f1318e == null || !timeDependentText.mo1375b(this.f1317d, j)) {
            charSequenceMo1374a = this.f1315b.mo1374a(context, j);
            this.f1317d = j;
            this.f1318e = charSequenceMo1374a;
        } else {
            charSequenceMo1374a = this.f1318e;
        }
        CharSequence charSequence = this.f1314a;
        if (charSequence == null) {
            return charSequenceMo1374a;
        }
        CharSequence[] charSequenceArr = this.f1316c;
        charSequenceArr[0] = charSequenceMo1374a;
        return TextUtils.expandTemplate(charSequence, charSequenceArr);
    }

    @Override // android.support.wearable.complications.TimeDependentText
    /* JADX INFO: renamed from: b */
    public final boolean mo1375b(long j, long j2) {
        TimeDependentText timeDependentText = this.f1315b;
        if (timeDependentText == null) {
            return true;
        }
        return timeDependentText.mo1375b(j, j2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("surrounding_string", this.f1314a);
        TimeDependentText timeDependentText = this.f1315b;
        if (timeDependentText instanceof TimeDifferenceText) {
            TimeDifferenceText timeDifferenceText = (TimeDifferenceText) timeDependentText;
            bundle.putLong("difference_period_start", timeDifferenceText.f1319a);
            bundle.putLong("difference_period_end", timeDifferenceText.f1320b);
            bundle.putInt("difference_style", timeDifferenceText.f1321c);
            bundle.putBoolean("show_now_text", timeDifferenceText.f1322d);
            TimeUnit timeUnit = timeDifferenceText.f1323e;
            if (timeUnit != null) {
                bundle.putString("minimum_unit", timeUnit.name());
            }
        } else if (timeDependentText instanceof TimeFormatText) {
            TimeFormatText timeFormatText = (TimeFormatText) timeDependentText;
            bundle.putString("format_format_string", timeFormatText.f1326a.toPattern());
            bundle.putInt("format_style", timeFormatText.f1327b);
            TimeZone timeZone = timeFormatText.f1328c;
            if (timeZone != null) {
                bundle.putString("format_time_zone", timeZone.getID());
            }
        }
        parcel.writeBundle(bundle);
    }

    public ComplicationText(CharSequence charSequence) {
        this.f1316c = new CharSequence[]{"", "^2", "^3", "^4", "^5", "^6", "^7", "^8", "^9"};
        this.f1314a = charSequence;
        this.f1315b = null;
        m1373c();
    }
}
