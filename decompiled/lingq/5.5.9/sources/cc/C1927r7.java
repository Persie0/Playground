package cc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* JADX INFO: renamed from: cc.r7 */
/* JADX INFO: loaded from: classes.dex */
public final class C1927r7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        long jM7606j = 0;
        long jM7606j2 = 0;
        long jM7606j3 = 0;
        long jM7606j4 = 0;
        long jM7606j5 = 0;
        long jM7606j6 = 0;
        boolean zM7603g = false;
        int iM7605i = 0;
        boolean zM7603g2 = false;
        boolean zM7603g3 = false;
        String strM7599c = null;
        String strM7599c2 = null;
        String strM7599c3 = null;
        String strM7599c4 = null;
        String strM7599c5 = null;
        String strM7599c6 = null;
        String strM7599c7 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayList = null;
        String strM7599c8 = null;
        String strM7599c9 = null;
        String strM7599c10 = "";
        String strM7599c11 = strM7599c10;
        boolean zM7603g4 = true;
        boolean zM7603g5 = true;
        long jM7606j7 = -2147483648L;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 2:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 3:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 4:
                    strM7599c3 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 5:
                    strM7599c4 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    jM7606j2 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case '\b':
                    strM7599c5 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\t':
                    zM7603g4 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case '\n':
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 11:
                    jM7606j7 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case '\f':
                    strM7599c6 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\r':
                    jM7606j3 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 14:
                    jM7606j4 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 15:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 16:
                    zM7603g5 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 17:
                case 20:
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
                case 18:
                    zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 19:
                    strM7599c7 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 21:
                    int iM7607k = SafeParcelReader.m7607k(parcel, i10);
                    if (iM7607k != 0) {
                        SafeParcelReader.m7610n(parcel, iM7607k, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jM7606j5 = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case 23:
                    int iM7607k2 = SafeParcelReader.m7607k(parcel, i10);
                    int iDataPosition = parcel.dataPosition();
                    if (iM7607k2 != 0) {
                        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                        parcel.setDataPosition(iDataPosition + iM7607k2);
                        arrayList = arrayListCreateStringArrayList;
                    } else {
                        arrayList = null;
                    }
                    break;
                case 24:
                    strM7599c8 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 25:
                    strM7599c10 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 26:
                    strM7599c11 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 27:
                    strM7599c9 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 28:
                    zM7603g3 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 29:
                    jM7606j6 = SafeParcelReader.m7606j(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zzq(strM7599c, strM7599c2, strM7599c3, strM7599c4, jM7606j, jM7606j2, strM7599c5, zM7603g4, zM7603g, jM7606j7, strM7599c6, jM7606j3, jM7606j4, iM7605i, zM7603g5, zM7603g2, strM7599c7, boolValueOf, jM7606j5, arrayList, strM7599c8, strM7599c10, strM7599c11, strM7599c9, zM7603g3, jM7606j6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzq[i10];
    }
}
