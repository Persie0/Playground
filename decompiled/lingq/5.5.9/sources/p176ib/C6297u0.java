package p176ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: renamed from: ib.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6297u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        Bundle bundleM7597a = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iM7605i = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                bundleM7597a = SafeParcelReader.m7597a(parcel, i10);
            } else if (c10 == 2) {
                featureArr = (Feature[]) SafeParcelReader.m7600d(parcel, i10, Feature.CREATOR);
            } else if (c10 == 3) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.m7598b(parcel, i10, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzk(bundleM7597a, featureArr, iM7605i, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzk[i10];
    }
}
