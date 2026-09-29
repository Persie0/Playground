package p046cb;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: cb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1765g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        String strM7599c = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strM7599c2 = strM7599c;
        while (parcel.dataPosition() < iM7609m) {
            int i10 = parcel.readInt();
            char c10 = (char) i10;
            if (c10 == 4) {
                strM7599c = SafeParcelReader.m7599c(parcel, i10);
            } else if (c10 == 7) {
                googleSignInAccount = (GoogleSignInAccount) SafeParcelReader.m7598b(parcel, i10, GoogleSignInAccount.CREATOR);
            } else if (c10 != '\b') {
                SafeParcelReader.m7608l(parcel, i10);
            } else {
                strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new SignInAccount(strM7599c, googleSignInAccount, strM7599c2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
