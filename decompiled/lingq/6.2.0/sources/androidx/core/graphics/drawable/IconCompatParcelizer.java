package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import java.nio.charset.Charset;
import p000.C3386nv;
import p000.lpa;
import p000.mpa;

/* JADX INFO: loaded from: classes2.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(lpa lpaVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f5504a = -1;
        iconCompat.f5506c = null;
        iconCompat.f5507d = null;
        iconCompat.f5508e = 0;
        iconCompat.f5509f = 0;
        iconCompat.f5510g = null;
        iconCompat.f5511h = IconCompat.f5503k;
        iconCompat.f5512i = null;
        iconCompat.f5504a = lpaVar.m16434f(-1, 1);
        byte[] bArr = iconCompat.f5506c;
        if (lpaVar.mo16433e(2)) {
            Parcel parcel = ((mpa) lpaVar).f51707e;
            int i = parcel.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f5506c = bArr;
        iconCompat.f5507d = lpaVar.m16435g(iconCompat.f5507d, 3);
        iconCompat.f5508e = lpaVar.m16434f(iconCompat.f5508e, 4);
        iconCompat.f5509f = lpaVar.m16434f(iconCompat.f5509f, 5);
        iconCompat.f5510g = (ColorStateList) lpaVar.m16435g(iconCompat.f5510g, 6);
        String string = iconCompat.f5512i;
        if (lpaVar.mo16433e(7)) {
            string = ((mpa) lpaVar).f51707e.readString();
        }
        iconCompat.f5512i = string;
        String string2 = iconCompat.f5513j;
        if (lpaVar.mo16433e(8)) {
            string2 = ((mpa) lpaVar).f51707e.readString();
        }
        iconCompat.f5513j = string2;
        iconCompat.f5511h = PorterDuff.Mode.valueOf(iconCompat.f5512i);
        switch (iconCompat.f5504a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                Parcelable parcelable = iconCompat.f5507d;
                if (parcelable != null) {
                    iconCompat.f5505b = parcelable;
                    return iconCompat;
                }
                C3386nv.m17626m("Invalid icon");
                return null;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f5507d;
                if (parcelable2 != null) {
                    iconCompat.f5505b = parcelable2;
                    return iconCompat;
                }
                byte[] bArr3 = iconCompat.f5506c;
                iconCompat.f5505b = bArr3;
                iconCompat.f5504a = 3;
                iconCompat.f5508e = 0;
                iconCompat.f5509f = bArr3.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f5506c, Charset.forName("UTF-16"));
                iconCompat.f5505b = str;
                if (iconCompat.f5504a == 2 && iconCompat.f5513j == null) {
                    iconCompat.f5513j = str.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f5505b = iconCompat.f5506c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, lpa lpaVar) {
        lpaVar.getClass();
        iconCompat.f5512i = iconCompat.f5511h.name();
        switch (iconCompat.f5504a) {
            case InstallReferrerClient.InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                iconCompat.f5507d = (Parcelable) iconCompat.f5505b;
                break;
            case 1:
            case 5:
                iconCompat.f5507d = (Parcelable) iconCompat.f5505b;
                break;
            case 2:
                iconCompat.f5506c = ((String) iconCompat.f5505b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f5506c = (byte[]) iconCompat.f5505b;
                break;
            case 4:
            case 6:
                iconCompat.f5506c = iconCompat.f5505b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f5504a;
        if (-1 != i) {
            lpaVar.m16438j(i, 1);
        }
        byte[] bArr = iconCompat.f5506c;
        if (bArr != null) {
            lpaVar.mo16437i(2);
            Parcel parcel = ((mpa) lpaVar).f51707e;
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f5507d;
        if (parcelable != null) {
            lpaVar.m16439k(parcelable, 3);
        }
        int i2 = iconCompat.f5508e;
        if (i2 != 0) {
            lpaVar.m16438j(i2, 4);
        }
        int i3 = iconCompat.f5509f;
        if (i3 != 0) {
            lpaVar.m16438j(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f5510g;
        if (colorStateList != null) {
            lpaVar.m16439k(colorStateList, 6);
        }
        String str = iconCompat.f5512i;
        if (str != null) {
            lpaVar.mo16437i(7);
            ((mpa) lpaVar).f51707e.writeString(str);
        }
        String str2 = iconCompat.f5513j;
        if (str2 != null) {
            lpaVar.mo16437i(8);
            ((mpa) lpaVar).f51707e.writeString(str2);
        }
    }
}
