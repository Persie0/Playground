package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.versionedparcelable.VersionedParcel;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5582a = versionedParcel.m4626j(iconCompat.f5582a, 1);
        byte[] bArrMo4622f = iconCompat.f5584c;
        if (versionedParcel.mo4624h(2)) {
            bArrMo4622f = versionedParcel.mo4622f();
        }
        iconCompat.f5584c = bArrMo4622f;
        iconCompat.f5585d = versionedParcel.m4628l(iconCompat.f5585d, 3);
        iconCompat.f5586e = versionedParcel.m4626j(iconCompat.f5586e, 4);
        iconCompat.f5587f = versionedParcel.m4626j(iconCompat.f5587f, 5);
        iconCompat.f5588g = (ColorStateList) versionedParcel.m4628l(iconCompat.f5588g, 6);
        String strMo4629m = iconCompat.f5590i;
        if (versionedParcel.mo4624h(7)) {
            strMo4629m = versionedParcel.mo4629m();
        }
        iconCompat.f5590i = strMo4629m;
        String strMo4629m2 = iconCompat.f5591j;
        if (versionedParcel.mo4624h(8)) {
            strMo4629m2 = versionedParcel.mo4629m();
        }
        iconCompat.f5591j = strMo4629m2;
        iconCompat.f5589h = PorterDuff.Mode.valueOf(iconCompat.f5590i);
        switch (iconCompat.f5582a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.f5585d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f5583b = parcelable;
                return iconCompat;
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5585d;
                if (parcelable2 != null) {
                    iconCompat.f5583b = parcelable2;
                } else {
                    byte[] bArr = iconCompat.f5584c;
                    iconCompat.f5583b = bArr;
                    iconCompat.f5582a = 3;
                    iconCompat.f5586e = 0;
                    iconCompat.f5587f = bArr.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                String str = new String(iconCompat.f5584c, Charset.forName("UTF-16"));
                iconCompat.f5583b = str;
                if (iconCompat.f5582a == 2 && iconCompat.f5591j == null) {
                    iconCompat.f5591j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5583b = iconCompat.f5584c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.getClass();
        iconCompat.f5590i = iconCompat.f5589h.name();
        switch (iconCompat.f5582a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.f5585d = (Parcelable) iconCompat.f5583b;
                break;
            case 1:
            case 5:
                iconCompat.f5585d = (Parcelable) iconCompat.f5583b;
                break;
            case 2:
                iconCompat.f5584c = ((String) iconCompat.f5583b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5584c = (byte[]) iconCompat.f5583b;
                break;
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                iconCompat.f5584c = iconCompat.f5583b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i10 = iconCompat.f5582a;
        if (-1 != i10) {
            versionedParcel.m4636t(i10, 1);
        }
        byte[] bArr = iconCompat.f5584c;
        if (bArr != null) {
            versionedParcel.mo4631o(2);
            versionedParcel.mo4633q(bArr);
        }
        Parcelable parcelable = iconCompat.f5585d;
        if (parcelable != null) {
            versionedParcel.mo4631o(3);
            versionedParcel.mo4637u(parcelable);
        }
        int i11 = iconCompat.f5586e;
        if (i11 != 0) {
            versionedParcel.m4636t(i11, 4);
        }
        int i12 = iconCompat.f5587f;
        if (i12 != 0) {
            versionedParcel.m4636t(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f5588g;
        if (colorStateList != null) {
            versionedParcel.mo4631o(6);
            versionedParcel.mo4637u(colorStateList);
        }
        String str = iconCompat.f5590i;
        if (str != null) {
            versionedParcel.mo4631o(7);
            versionedParcel.mo4638v(str);
        }
        String str2 = iconCompat.f5591j;
        if (str2 != null) {
            versionedParcel.mo4631o(8);
            versionedParcel.mo4638v(str2);
        }
    }
}
