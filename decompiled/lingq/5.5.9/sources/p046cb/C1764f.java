package p046cb;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* JADX INFO: renamed from: cb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1764f implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptions createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        ArrayList arrayListM7601e = null;
        int iM7605i = 0;
        boolean zM7603g = false;
        boolean zM7603g2 = false;
        boolean zM7603g3 = false;
        ArrayList arrayListM7601e2 = null;
        Account account = null;
        String strM7599c = null;
        String strM7599c2 = null;
        String strM7599c3 = null;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            switch ((char) i10) {
                case 1:
                    iM7605i = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 2:
                    arrayListM7601e2 = SafeParcelReader.m7601e(parcel, i10, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) SafeParcelReader.m7598b(parcel, i10, Account.CREATOR);
                    break;
                case 4:
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 5:
                    zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    zM7603g3 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\b':
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case '\t':
                    arrayListM7601e = SafeParcelReader.m7601e(parcel, i10, GoogleSignInOptionsExtensionParcelable.CREATOR);
                    break;
                case '\n':
                    strM7599c3 = SafeParcelReader.m7599c(parcel, i10);
                    break;
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new GoogleSignInOptions(iM7605i, arrayListM7601e2, account, zM7603g, zM7603g2, zM7603g3, strM7599c, strM7599c2, GoogleSignInOptions.m7522C(arrayListM7601e), strM7599c3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
