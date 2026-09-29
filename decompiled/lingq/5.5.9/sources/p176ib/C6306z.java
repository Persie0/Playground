package p176ib;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: ib.z */
/* JADX INFO: loaded from: classes.dex */
public final class C6306z implements Parcelable.Creator<MethodInvocation> {
    @Override // android.os.Parcelable.Creator
    public final MethodInvocation createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        int iM7605i2 = 0;
        int iM7605i3 = 0;
        int iM7605i4 = 0;
        long jM7606j = 0;
        long jM7606j2 = 0;
        String strM7599c = null;
        String strM7599c2 = null;
        int iM7605i5 = -1;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 2:
                    iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 3:
                    iM7605i3 = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 4:
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 5:
                    jM7606j2 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\b':
                    iM7605i4 = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case '\t':
                    iM7605i5 = SafeParcelReader.m7605i(parcel, i10);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new MethodInvocation(iM7605i, iM7605i2, iM7605i3, jM7606j, jM7606j2, strM7599c, strM7599c2, iM7605i4, iM7605i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MethodInvocation[] newArray(int i10) {
        return new MethodInvocation[i10];
    }
}
