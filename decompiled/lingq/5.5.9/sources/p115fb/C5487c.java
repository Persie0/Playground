package p115fb;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: fb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5487c implements Parcelable.Creator<CloudMessage> {
    @Override // android.os.Parcelable.Creator
    public final CloudMessage createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            if (((char) i10) != 1) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                intent = (Intent) SafeParcelReader.m7598b(parcel, i10, Intent.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new CloudMessage(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CloudMessage[] newArray(int i10) {
        return new CloudMessage[i10];
    }
}
