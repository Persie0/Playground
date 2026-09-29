package p046cb;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: cb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1762d implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        String strM7599c = null;
        String strM7599c2 = null;
        String strM7599c3 = null;
        String strM7599c4 = null;
        Uri uri = null;
        String strM7599c5 = null;
        String strM7599c6 = null;
        ArrayList arrayListM7601e = null;
        String strM7599c7 = null;
        String strM7599c8 = null;
        long jM7606j = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
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
                    uri = (Uri) SafeParcelReader.m7598b(parcel, i10, Uri.CREATOR);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM7599c5 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\b':
                    jM7606j = SafeParcelReader.m7606j(parcel, i10);
                    break;
                case '\t':
                    strM7599c6 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\n':
                    arrayListM7601e = SafeParcelReader.m7601e(parcel, i10, Scope.CREATOR);
                    break;
                case 11:
                    strM7599c7 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\f':
                    strM7599c8 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new GoogleSignInAccount(iM7605i, strM7599c, strM7599c2, strM7599c3, strM7599c4, uri, strM7599c5, jM7606j, strM7599c6, arrayListM7601e, strM7599c7, strM7599c8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
