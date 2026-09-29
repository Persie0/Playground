package p176ib;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: ib.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6280m implements Parcelable.Creator<TelemetryData> {
    @Override // android.os.Parcelable.Creator
    public final TelemetryData createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        ArrayList arrayListM7601e = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 2) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                arrayListM7601e = SafeParcelReader.m7601e(parcel, i10, MethodInvocation.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new TelemetryData(iM7605i, arrayListM7601e);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ TelemetryData[] newArray(int i10) {
        return new TelemetryData[i10];
    }
}
