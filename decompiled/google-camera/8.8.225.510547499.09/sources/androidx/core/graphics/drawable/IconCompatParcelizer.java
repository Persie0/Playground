package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import com.google.lens.sdk.LensApi;
import java.nio.charset.Charset;
import p000.att;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(att attVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1475b = attVar.m1993a(iconCompat.f1475b, 1);
        byte[] bArr = iconCompat.f1477d;
        if (attVar.m2011s(2)) {
            int i = attVar.f2381d.readInt();
            if (i < 0) {
                bArr = null;
            } else {
                bArr = new byte[i];
                attVar.f2381d.readByteArray(bArr);
            }
        }
        iconCompat.f1477d = bArr;
        iconCompat.f1478e = attVar.m1994b(iconCompat.f1478e, 3);
        iconCompat.f1479f = attVar.m1993a(iconCompat.f1479f, 4);
        iconCompat.f1480g = attVar.m1993a(iconCompat.f1480g, 5);
        iconCompat.f1481h = (ColorStateList) attVar.m1994b(iconCompat.f1481h, 6);
        iconCompat.f1483j = attVar.m1997e(iconCompat.f1483j, 7);
        iconCompat.f1484k = attVar.m1997e(iconCompat.f1484k, 8);
        iconCompat.f1482i = PorterDuff.Mode.valueOf(iconCompat.f1483j);
        switch (iconCompat.f1475b) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                parcelable = iconCompat.f1478e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1476c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f1478e;
                if (parcelable != null) {
                    iconCompat.f1476c = parcelable;
                } else {
                    byte[] bArr2 = iconCompat.f1477d;
                    iconCompat.f1476c = bArr2;
                    iconCompat.f1475b = 3;
                    iconCompat.f1479f = 0;
                    iconCompat.f1480g = bArr2.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.f1476c = new String(iconCompat.f1477d, Charset.forName("UTF-16"));
                if (iconCompat.f1475b == 2 && iconCompat.f1484k == null) {
                    iconCompat.f1484k = ((String) iconCompat.f1476c).split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1476c = iconCompat.f1477d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, att attVar) {
        iconCompat.f1483j = iconCompat.f1482i.name();
        switch (iconCompat.f1475b) {
            case LensApi.LensAvailabilityStatus.LENS_AVAILABILITY_UNKNOWN /* -1 */:
                iconCompat.f1478e = (Parcelable) iconCompat.f1476c;
                break;
            case 1:
            case 5:
                iconCompat.f1478e = (Parcelable) iconCompat.f1476c;
                break;
            case 2:
                iconCompat.f1477d = ((String) iconCompat.f1476c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1477d = (byte[]) iconCompat.f1476c;
                break;
            case 4:
            case 6:
                iconCompat.f1477d = iconCompat.f1476c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1475b;
        if (i != -1) {
            attVar.m2000h(i, 1);
        }
        byte[] bArr = iconCompat.f1477d;
        if (bArr != null) {
            attVar.m2008p(2);
            attVar.f2381d.writeInt(bArr.length);
            attVar.f2381d.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1478e;
        if (parcelable != null) {
            attVar.m2001i(parcelable, 3);
        }
        int i2 = iconCompat.f1479f;
        if (i2 != 0) {
            attVar.m2000h(i2, 4);
        }
        int i3 = iconCompat.f1480g;
        if (i3 != 0) {
            attVar.m2000h(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1481h;
        if (colorStateList != null) {
            attVar.m2001i(colorStateList, 6);
        }
        String str = iconCompat.f1483j;
        if (str != null) {
            attVar.m2002j(str, 7);
        }
        String str2 = iconCompat.f1484k;
        if (str2 != null) {
            attVar.m2002j(str2, 8);
        }
    }
}
