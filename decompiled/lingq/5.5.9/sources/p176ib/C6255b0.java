package p176ib;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: renamed from: ib.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6255b0 implements Parcelable.Creator<zat> {
    @Override // android.os.Parcelable.Creator
    public final zat createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        int iM7605i = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iM7605i2 = 0;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 1) {
                iM7605i = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 == 2) {
                account = (Account) SafeParcelReader.m7598b(parcel, i10, Account.CREATOR);
            } else if (c10 == 3) {
                iM7605i2 = SafeParcelReader.m7605i(parcel, i10);
            } else if (c10 != 4) {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m7598b(parcel, i10, GoogleSignInAccount.CREATOR);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new zat(iM7605i, account, iM7605i2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zat[] newArray(int i10) {
        return new zat[i10];
    }
}
