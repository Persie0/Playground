package p176ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: ib.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6283n0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        int iM7605i2 = 0;
        int iM7605i3 = 0;
        boolean zM7603g = false;
        boolean zM7603g2 = false;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                zM7603g = SafeParcelReader.m7603g(parcel, i10);
            } else if (c10 == 3) {
                zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
            } else if (c10 == 4) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 5) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                iM7605i3 = SafeParcelReader.m7605i(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new RootTelemetryConfiguration(iM7605i, iM7605i2, iM7605i3, zM7603g, zM7603g2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new RootTelemetryConfiguration[i10];
    }
}
