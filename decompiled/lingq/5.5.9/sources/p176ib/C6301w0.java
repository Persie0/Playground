package p176ib;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: renamed from: ib.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6301w0 implements Parcelable.Creator {
    /* JADX INFO: renamed from: a */
    public static void m12931a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        C0987y.m3829k(parcel, 1, getServiceRequest.f13941a);
        C0987y.m3829k(parcel, 2, getServiceRequest.f13942b);
        C0987y.m3829k(parcel, 3, getServiceRequest.f13943c);
        C0987y.m3832n(parcel, 4, getServiceRequest.f13944d);
        C0987y.m3828j(parcel, 5, getServiceRequest.f13945e);
        C0987y.m3833o(parcel, 6, getServiceRequest.f13946f, i10);
        C0987y.m3827i(parcel, 7, getServiceRequest.f13947g);
        C0987y.m3831m(parcel, 8, getServiceRequest.f13948h, i10);
        C0987y.m3833o(parcel, 10, getServiceRequest.f13949i, i10);
        C0987y.m3833o(parcel, 11, getServiceRequest.f13950j, i10);
        C0987y.m3826h(parcel, 12, getServiceRequest.f13951k);
        C0987y.m3829k(parcel, 13, getServiceRequest.f13952l);
        C0987y.m3826h(parcel, 14, getServiceRequest.f13939H);
        C0987y.m3832n(parcel, 15, getServiceRequest.f13940I);
        C0987y.m3839u(parcel, iM3836r);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM7609m = SafeParcelReader.m7609m(parcel);
        Scope[] scopeArr = GetServiceRequest.f13937J;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f13938K;
        Feature[] featureArr2 = featureArr;
        String strM7599c = null;
        IBinder iBinderM7604h = null;
        Account account = null;
        String strM7599c2 = null;
        int iM7605i = 0;
        int iM7605i2 = 0;
        int iM7605i3 = 0;
        boolean zM7603g = false;
        int iM7605i4 = 0;
        boolean zM7603g2 = false;
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
                    strM7599c = SafeParcelReader.m7599c(parcel, i10);
                    break;
                case 5:
                    iBinderM7604h = SafeParcelReader.m7604h(parcel, i10);
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    scopeArr = (Scope[]) SafeParcelReader.m7600d(parcel, i10, Scope.CREATOR);
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundle = SafeParcelReader.m7597a(parcel, i10);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.m7598b(parcel, i10, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.m7608l(parcel, i10);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.m7600d(parcel, i10, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.m7600d(parcel, i10, Feature.CREATOR);
                    break;
                case '\f':
                    zM7603g = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case '\r':
                    iM7605i4 = SafeParcelReader.m7605i(parcel, i10);
                    break;
                case 14:
                    zM7603g2 = SafeParcelReader.m7603g(parcel, i10);
                    break;
                case 15:
                    strM7599c2 = SafeParcelReader.m7599c(parcel, i10);
                    break;
            }
        }
        SafeParcelReader.m7602f(parcel, iM7609m);
        return new GetServiceRequest(iM7605i, iM7605i2, iM7605i3, strM7599c, iBinderM7604h, scopeArr, bundle, account, featureArr, featureArr2, zM7603g, iM7605i4, zM7603g2, strM7599c2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
