package cc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;

/* JADX INFO: renamed from: cc.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1928s implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m5856a(zzaw zzawVar, Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3832n(parcel, 2, zzawVar.f14613a);
        C0987y.m3831m(parcel, 3, zzawVar.f14614b, i10);
        C0987y.m3832n(parcel, 4, zzawVar.f14615c);
        C0987y.m3830l(parcel, 5, zzawVar.f14616d);
        C0987y.m3839u(parcel, iM3836r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        long jM7606j = 0;
        String strM7599c = null;
        zzau zzauVar = null;
        String strM7599c2 = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 2) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 3) {
                zzauVar = (zzau) SafeParcelReader.m7598b(parcel, i10, zzau.CREATOR);
            } else if (c10 == 4) {
                strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                jM7606j = SafeParcelReader.m7606j(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzaw(strM7599c, zzauVar, strM7599c2, jM7606j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaw[i10];
    }
}
