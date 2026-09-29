package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class imb extends mcb implements pmb {
    /* JADX INFO: renamed from: Q */
    public final int m14022Q(String str, int i, String str2) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(i);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        Parcel parcelM16779P = m16779P(parcelM16778O, 1);
        int i2 = parcelM16779P.readInt();
        parcelM16779P.recycle();
        return i2;
    }

    /* JADX INFO: renamed from: R */
    public final int m14023R(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(i);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        int i2 = fnb.f39353a;
        parcelM16778O.writeInt(1);
        bundle.writeToParcel(parcelM16778O, 0);
        Parcel parcelM16779P = m16779P(parcelM16778O, 10);
        int i3 = parcelM16779P.readInt();
        parcelM16779P.recycle();
        return i3;
    }

    /* JADX INFO: renamed from: S */
    public final Bundle m14024S(String str, String str2, Bundle bundle) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(9);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        int i = fnb.f39353a;
        parcelM16778O.writeInt(1);
        bundle.writeToParcel(parcelM16778O, 0);
        Parcel parcelM16779P = m16779P(parcelM16778O, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: T */
    public final Bundle m14025T(String str, String str2, String str3) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(3);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        parcelM16778O.writeString(str3);
        parcelM16778O.writeString(null);
        Parcel parcelM16779P = m16779P(parcelM16778O, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: U */
    public final Bundle m14026U(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(i);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        parcelM16778O.writeString(str3);
        parcelM16778O.writeString(null);
        int i2 = fnb.f39353a;
        parcelM16778O.writeInt(1);
        bundle.writeToParcel(parcelM16778O, 0);
        Parcel parcelM16779P = m16779P(parcelM16778O, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: V */
    public final Bundle m14027V(String str, String str2) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(3);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString("subs");
        parcelM16778O.writeString(str2);
        Parcel parcelM16779P = m16779P(parcelM16778O, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle;
    }

    /* JADX INFO: renamed from: W */
    public final Bundle m14028W(int i, String str, String str2, Bundle bundle) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(i);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString("subs");
        parcelM16778O.writeString(str2);
        int i2 = fnb.f39353a;
        parcelM16778O.writeInt(1);
        bundle.writeToParcel(parcelM16778O, 0);
        Parcel parcelM16779P = m16779P(parcelM16778O, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle2;
    }

    /* JADX INFO: renamed from: X */
    public final Bundle m14029X(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelM16778O = m16778O();
        parcelM16778O.writeInt(i);
        parcelM16778O.writeString(str);
        parcelM16778O.writeString(str2);
        int i2 = fnb.f39353a;
        parcelM16778O.writeInt(1);
        bundle.writeToParcel(parcelM16778O, 0);
        parcelM16778O.writeInt(1);
        bundle2.writeToParcel(parcelM16778O, 0);
        Parcel parcelM16779P = m16779P(parcelM16778O, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) fnb.m11961a(parcelM16779P);
        parcelM16779P.recycle();
        return bundle3;
    }
}
