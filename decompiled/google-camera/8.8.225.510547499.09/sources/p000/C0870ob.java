package p000;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.ComplicationText;
import android.support.wearable.complications.TimeDifferenceText;
import android.support.wearable.complications.TimeFormatText;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import android.support.wearable.complications.rendering.ComplicationStyle$Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p021j$.time.Instant;

/* JADX INFO: renamed from: ob */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0870ob implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f45232a;

    public C0870ob(int i) {
        this.f45232a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f45232a) {
            case 0:
                return new TimeDifferenceText[i];
            case 1:
                return new ComplicationText[i];
            case 2:
                return new TimeFormatText[i];
            case 3:
                return new ComplicationDrawable[i];
            case 4:
                return new ComplicationStyle$Builder[i];
            case 5:
                return new C0926qd[i];
            case 6:
                return new ahn[i];
            case 7:
                return new ani[i];
            case 8:
                return new anl[i];
            case 9:
                return new ano[i];
            case 10:
                return new anr[i];
            case 11:
                return new aog[i];
            case 12:
                return new aou[i];
            case 13:
                return new aow[i];
            case 14:
                return new bgl[i];
            case 15:
                return new bou[i];
            case 16:
                return new djp[i];
            case 17:
                return new gyt[i];
            case 18:
                return new GoogleSignInAccount[i];
            case 19:
                return new GoogleSignInOptions[i];
            default:
                return new SignInAccount[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayListM13253O = null;
        Object[] objArr = 0;
        switch (this.f45232a) {
            case 0:
                return new TimeDifferenceText(parcel);
            case 1:
                return new ComplicationText(parcel);
            case 2:
                return new TimeFormatText(parcel);
            case 3:
                return new ComplicationDrawable(parcel, objArr == true ? 1 : 0);
            case 4:
                return new ComplicationStyle$Builder(parcel);
            case 5:
                return new C0926qd(parcel);
            case 6:
                return new ahn(parcel);
            case 7:
                return new ani(parcel);
            case 8:
                return new anl(parcel);
            case 9:
                return new ano(parcel);
            case 10:
                return new anr(parcel);
            case 11:
                return new aog(parcel);
            case 12:
                return new aou(parcel);
            case 13:
                return new aow(parcel);
            case 14:
                return new bgl(parcel);
            case 15:
                return new bou(parcel);
            case 16:
                return new djp(parcel.readLong(), (gyu) parcel.readParcelable(dkb.class.getClassLoader()), mws.m17095j(parcel.readArrayList(Long.class.getClassLoader())), parcel.readString(), parcel.readString(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), (Uri) parcel.readParcelable(dkb.class.getClassLoader()), parcel.readInt() == 1, (kbc) parcel.readSerializable(), parcel.readInt());
            case 17:
                return new gyt(parcel.readInt());
            case 18:
                int iM13245G = jiy.m13245G(parcel);
                String strM13250L = null;
                String strM13250L2 = null;
                String strM13250L3 = null;
                String strM13250L4 = null;
                Uri uri = null;
                String strM13250L5 = null;
                String strM13250L6 = null;
                ArrayList arrayListM13253O2 = null;
                String strM13250L7 = null;
                String strM13250L8 = null;
                long jM13246H = 0;
                int iM13243E = 0;
                while (parcel.dataPosition() < iM13245G) {
                    int i = parcel.readInt();
                    switch (jiy.m13241C(i)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i);
                            break;
                        case 2:
                            strM13250L = jiy.m13250L(parcel, i);
                            break;
                        case 3:
                            strM13250L2 = jiy.m13250L(parcel, i);
                            break;
                        case 4:
                            strM13250L3 = jiy.m13250L(parcel, i);
                            break;
                        case 5:
                            strM13250L4 = jiy.m13250L(parcel, i);
                            break;
                        case 6:
                            uri = (Uri) jiy.m13249K(parcel, i, Uri.CREATOR);
                            break;
                        case 7:
                            strM13250L5 = jiy.m13250L(parcel, i);
                            break;
                        case 8:
                            jM13246H = jiy.m13246H(parcel, i);
                            break;
                        case 9:
                            strM13250L6 = jiy.m13250L(parcel, i);
                            break;
                        case 10:
                            arrayListM13253O2 = jiy.m13253O(parcel, i, Scope.CREATOR);
                            break;
                        case 11:
                            strM13250L7 = jiy.m13250L(parcel, i);
                            break;
                        case 12:
                            strM13250L8 = jiy.m13250L(parcel, i);
                            break;
                        default:
                            jiy.m13256R(parcel, i);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new GoogleSignInAccount(iM13243E, strM13250L, strM13250L2, strM13250L3, strM13250L4, uri, strM13250L5, jM13246H, strM13250L6, arrayListM13253O2, strM13250L7, strM13250L8);
            case 19:
                int iM13245G2 = jiy.m13245G(parcel);
                ArrayList arrayListM13253O3 = null;
                Account account = null;
                String strM13250L9 = null;
                String strM13250L10 = null;
                String strM13250L11 = null;
                int iM13243E2 = 0;
                boolean zM13257S = false;
                boolean zM13257S2 = false;
                boolean zM13257S3 = false;
                while (parcel.dataPosition() < iM13245G2) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 1:
                            iM13243E2 = jiy.m13243E(parcel, i2);
                            break;
                        case 2:
                            arrayListM13253O3 = jiy.m13253O(parcel, i2, Scope.CREATOR);
                            break;
                        case 3:
                            account = (Account) jiy.m13249K(parcel, i2, Account.CREATOR);
                            break;
                        case 4:
                            zM13257S = jiy.m13257S(parcel, i2);
                            break;
                        case 5:
                            zM13257S2 = jiy.m13257S(parcel, i2);
                            break;
                        case 6:
                            zM13257S3 = jiy.m13257S(parcel, i2);
                            break;
                        case 7:
                            strM13250L9 = jiy.m13250L(parcel, i2);
                            break;
                        case 8:
                            strM13250L10 = jiy.m13250L(parcel, i2);
                            break;
                        case 9:
                            arrayListM13253O = jiy.m13253O(parcel, i2, jbp.CREATOR);
                            break;
                        case 10:
                            strM13250L11 = jiy.m13250L(parcel, i2);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new GoogleSignInOptions(iM13243E2, arrayListM13253O3, account, zM13257S, zM13257S2, zM13257S3, strM13250L9, strM13250L10, GoogleSignInOptions.m4637b(arrayListM13253O), strM13250L11);
            default:
                int iM13245G3 = jiy.m13245G(parcel);
                String strM13250L12 = "";
                GoogleSignInAccount googleSignInAccount = null;
                String strM13250L13 = "";
                while (parcel.dataPosition() < iM13245G3) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 4:
                            strM13250L12 = jiy.m13250L(parcel, i3);
                            break;
                        case 5:
                        case 6:
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                        case 7:
                            googleSignInAccount = (GoogleSignInAccount) jiy.m13249K(parcel, i3, GoogleSignInAccount.CREATOR);
                            break;
                        case 8:
                            strM13250L13 = jiy.m13250L(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new SignInAccount(strM13250L12, googleSignInAccount, strM13250L13);
        }
    }
}
