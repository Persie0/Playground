package android.support.wearable.complications;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;
import p000.C0050aw;
import p000.C0867nz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ComplicationData implements Parcelable {
    public static final Parcelable.Creator CREATOR;

    /* JADX INFO: renamed from: a */
    public static final String[][] f1310a = {null, new String[0], new String[0], new String[]{"SHORT_TEXT"}, new String[]{"LONG_TEXT"}, new String[]{"VALUE", "MIN_VALUE", "MAX_VALUE"}, new String[]{"ICON"}, new String[]{"SMALL_IMAGE", "IMAGE_STYLE"}, new String[]{"LARGE_IMAGE"}, new String[0], new String[0]};

    /* JADX INFO: renamed from: d */
    private static final String[][] f1311d;

    /* JADX INFO: renamed from: b */
    public final int f1312b;

    /* JADX INFO: renamed from: c */
    public final Bundle f1313c;

    static {
        String str = BcwGDRhrTsnlj.ncZOiM;
        f1311d = new String[][]{null, new String[0], new String[0], new String[]{str, "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"LONG_TITLE", "ICON", "ICON_BURN_IN_PROTECTION", "SMALL_IMAGE", NptsKnlVczSZ.BtVnejoOK, "IMAGE_STYLE", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", str, "ICON", "ICON_BURN_IN_PROTECTION", "TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "SMALL_IMAGE_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"TAP_ACTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[]{"SHORT_TEXT", str, "ICON", "ICON_BURN_IN_PROTECTION", "CONTENT_DESCRIPTION", "IMAGE_CONTENT_DESCRIPTION"}, new String[0]};
        CREATOR = new C0050aw(20);
    }

    public ComplicationData(Parcel parcel) {
        this.f1312b = parcel.readInt();
        this.f1313c = parcel.readBundle(getClass().getClassLoader());
    }

    public ComplicationData(C0867nz c0867nz) {
        this.f1312b = c0867nz.f45053a;
        this.f1313c = c0867nz.f45054b;
    }

    /* JADX INFO: renamed from: j */
    public static void m1360j(String str, int i) {
        if (!m1363m(i)) {
            throw new IllegalStateException("Type " + i + " can not be recognized");
        }
        if (m1362l(str, i)) {
            return;
        }
        throw new IllegalStateException("Field " + str + " is not supported for type " + i);
    }

    /* JADX INFO: renamed from: k */
    public static void m1361k(String str, int i) {
        if (m1363m(i)) {
            m1362l(str, i);
            return;
        }
        Log.w("ComplicationData", "Type " + i + " can not be recognized");
    }

    /* JADX INFO: renamed from: l */
    private static boolean m1362l(String str, int i) {
        for (String str2 : f1310a[i]) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : f1311d[i]) {
            if (str3.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    private static boolean m1363m(int i) {
        return i > 0 && i <= 11;
    }

    /* JADX INFO: renamed from: a */
    public final int m1364a() {
        m1361k("IMAGE_STYLE", this.f1312b);
        return this.f1313c.getInt("IMAGE_STYLE");
    }

    /* JADX INFO: renamed from: b */
    public final PendingIntent m1365b() {
        m1361k("TAP_ACTION", this.f1312b);
        return (PendingIntent) m1368e("TAP_ACTION");
    }

    /* JADX INFO: renamed from: c */
    public final Icon m1366c() {
        m1361k("ICON", this.f1312b);
        return (Icon) m1368e("ICON");
    }

    /* JADX INFO: renamed from: d */
    public final Icon m1367d() {
        m1361k("SMALL_IMAGE", this.f1312b);
        return (Icon) m1368e("SMALL_IMAGE");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final Parcelable m1368e(String str) {
        try {
            return this.f1313c.getParcelable(str);
        } catch (BadParcelableException e) {
            Log.w("ComplicationData", "Could not unparcel ComplicationData. Provider apps must exclude wearable support complication classes from proguard.", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final ComplicationText m1369f() {
        m1361k("LONG_TEXT", this.f1312b);
        return (ComplicationText) m1368e("LONG_TEXT");
    }

    /* JADX INFO: renamed from: g */
    public final ComplicationText m1370g() {
        m1361k("LONG_TITLE", this.f1312b);
        return (ComplicationText) m1368e("LONG_TITLE");
    }

    /* JADX INFO: renamed from: h */
    public final ComplicationText m1371h() {
        m1361k("SHORT_TEXT", this.f1312b);
        return (ComplicationText) m1368e("SHORT_TEXT");
    }

    /* JADX INFO: renamed from: i */
    public final ComplicationText m1372i() {
        m1361k("SHORT_TITLE", this.f1312b);
        return (ComplicationText) m1368e("SHORT_TITLE");
    }

    public final String toString() {
        return "ComplicationData{mType=" + this.f1312b + ", mFields=" + String.valueOf(this.f1313c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1312b);
        parcel.writeBundle(this.f1313c);
    }
}
