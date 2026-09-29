package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.database.CursorWindow;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.facebook.login.WebViewLoginMethodHandler;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zab;
import com.google.android.gms.common.internal.zaw;
import com.google.android.gms.common.internal.zay;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.internal.vision.zzab;
import com.google.android.gms.internal.vision.zzah;
import com.google.android.gms.internal.vision.zzaj;
import com.google.android.gms.internal.vision.zzal;
import com.google.android.gms.internal.vision.zzao;
import com.google.android.gms.measurement.internal.zzaf;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpl;
import com.google.android.gms.signin.internal.zaa;
import com.google.android.gms.signin.internal.zag;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.edit.TokenEditData;
import com.lingq.core.token.edit.TokenEditType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class y3a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69248a;

    public /* synthetic */ y3a(int i) {
        this.f69248a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM17103V = 0;
        int iM17103V2 = 0;
        int iM17103V3 = 0;
        int iM17103V4 = 0;
        boolean zM17099R = false;
        int iM17103V5 = 0;
        int iM17103V6 = 0;
        boolean zM17099R2 = false;
        int iM17103V7 = 0;
        Bundle bundleM17130l = null;
        Rect rect = null;
        Intent intent = null;
        String strM17138q = null;
        GoogleSignInAccount googleSignInAccount = null;
        Account account = null;
        ConnectionResult connectionResult = null;
        zaw zawVar = null;
        ArrayList arrayListM17140s = null;
        ArrayList arrayListM17142u = null;
        ArrayList arrayListM17142u2 = null;
        Intent intent2 = null;
        PendingIntent pendingIntent = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        switch (this.f69248a) {
            case 0:
                parcel.getClass();
                return new TokenEditData(TokenEditType.valueOf(parcel.readString()), parcel.readString(), parcel.readValue(TokenEditData.class.getClassLoader()));
            case 1:
                parcel.getClass();
                return new TokenFragmentData(parcel.readString(), parcel.readInt());
            case 2:
                parcel.getClass();
                return new WebViewLoginMethodHandler(parcel);
            case 3:
                int iM17129k0 = AbstractC3352my.m17129k0(parcel);
                int iM17103V8 = 0;
                while (parcel.dataPosition() < iM17129k0) {
                    int i = parcel.readInt();
                    char c = (char) i;
                    if (c == 1) {
                        iM17103V = AbstractC3352my.m17103V(parcel, i);
                    } else if (c == 2) {
                        iM17103V8 = AbstractC3352my.m17103V(parcel, i);
                    } else if (c != 3) {
                        AbstractC3352my.m17113c0(parcel, i);
                    } else {
                        bundleM17130l = AbstractC3352my.m17130l(parcel, i);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k0);
                return new GoogleSignInOptionsExtensionParcelable(iM17103V, iM17103V8, bundleM17130l);
            case 4:
                int iM17129k1 = AbstractC3352my.m17129k0(parcel);
                int iM17103V9 = 0;
                while (parcel.dataPosition() < iM17129k1) {
                    int i2 = parcel.readInt();
                    char c2 = (char) i2;
                    if (c2 == 1) {
                        iM17103V7 = AbstractC3352my.m17103V(parcel, i2);
                    } else if (c2 == 2) {
                        parcelFileDescriptor = (ParcelFileDescriptor) AbstractC3352my.m17137p(parcel, i2, ParcelFileDescriptor.CREATOR);
                    } else if (c2 != 3) {
                        AbstractC3352my.m17113c0(parcel, i2);
                    } else {
                        iM17103V9 = AbstractC3352my.m17103V(parcel, i2);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k1);
                return new BitmapTeleporter(iM17103V7, parcelFileDescriptor, iM17103V9);
            case 5:
                int iM17129k2 = AbstractC3352my.m17129k0(parcel);
                int iM17103V10 = 0;
                while (parcel.dataPosition() < iM17129k2) {
                    int i3 = parcel.readInt();
                    char c3 = (char) i3;
                    if (c3 == 1) {
                        zM17099R2 = AbstractC3352my.m17099R(parcel, i3);
                    } else if (c3 != 2) {
                        AbstractC3352my.m17113c0(parcel, i3);
                    } else {
                        iM17103V10 = AbstractC3352my.m17103V(parcel, i3);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k2);
                return new ModuleAvailabilityResponse(iM17103V10, zM17099R2);
            case 6:
                int iM17129k3 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k3) {
                    int i4 = parcel.readInt();
                    if (((char) i4) != 1) {
                        AbstractC3352my.m17113c0(parcel, i4);
                    } else {
                        pendingIntent = (PendingIntent) AbstractC3352my.m17137p(parcel, i4, PendingIntent.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k3);
                return new ModuleInstallIntentResponse(pendingIntent);
            case 7:
                int iM17129k4 = AbstractC3352my.m17129k0(parcel);
                int iM17103V11 = 0;
                while (parcel.dataPosition() < iM17129k4) {
                    int i5 = parcel.readInt();
                    char c4 = (char) i5;
                    if (c4 == 1) {
                        iM17103V6 = AbstractC3352my.m17103V(parcel, i5);
                    } else if (c4 == 2) {
                        iM17103V11 = AbstractC3352my.m17103V(parcel, i5);
                    } else if (c4 != 3) {
                        AbstractC3352my.m17113c0(parcel, i5);
                    } else {
                        intent2 = (Intent) AbstractC3352my.m17137p(parcel, i5, Intent.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k4);
                return new zaa(iM17103V6, iM17103V11, intent2);
            case 8:
                int iM17129k5 = AbstractC3352my.m17129k0(parcel);
                long jM17104W = 0;
                String strM17138q2 = null;
                String strM17138q3 = null;
                String strM17138q4 = null;
                String strM17138q5 = null;
                Uri uri = null;
                String strM17138q6 = null;
                String strM17138q7 = null;
                ArrayList arrayListM17142u3 = null;
                String strM17138q8 = null;
                String strM17138q9 = null;
                while (parcel.dataPosition() < iM17129k5) {
                    int i6 = parcel.readInt();
                    switch ((char) i6) {
                        case 2:
                            strM17138q2 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case 3:
                            strM17138q3 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case 4:
                            strM17138q4 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case 5:
                            strM17138q5 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case 6:
                            uri = (Uri) AbstractC3352my.m17137p(parcel, i6, Uri.CREATOR);
                            break;
                        case 7:
                            strM17138q6 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case '\b':
                            jM17104W = AbstractC3352my.m17104W(parcel, i6);
                            break;
                        case '\t':
                            strM17138q7 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case '\n':
                            arrayListM17142u3 = AbstractC3352my.m17142u(parcel, i6, Scope.CREATOR);
                            break;
                        case 11:
                            strM17138q8 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        case '\f':
                            strM17138q9 = AbstractC3352my.m17138q(parcel, i6);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i6);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k5);
                return new GoogleSignInAccount(strM17138q2, strM17138q3, strM17138q4, strM17138q5, uri, strM17138q6, jM17104W, strM17138q7, arrayListM17142u3, strM17138q8, strM17138q9);
            case 9:
                int iM17129k6 = AbstractC3352my.m17129k0(parcel);
                long jM17104W2 = 0;
                int iM17103V12 = 0;
                int iM17103V13 = 0;
                boolean zM17099R3 = false;
                String strM17138q10 = null;
                while (parcel.dataPosition() < iM17129k6) {
                    int i7 = parcel.readInt();
                    char c5 = (char) i7;
                    if (c5 == 1) {
                        iM17103V12 = AbstractC3352my.m17103V(parcel, i7);
                    } else if (c5 == 2) {
                        strM17138q10 = AbstractC3352my.m17138q(parcel, i7);
                    } else if (c5 == 3) {
                        jM17104W2 = AbstractC3352my.m17104W(parcel, i7);
                    } else if (c5 == 4) {
                        iM17103V13 = AbstractC3352my.m17103V(parcel, i7);
                    } else if (c5 != 5) {
                        AbstractC3352my.m17113c0(parcel, i7);
                    } else {
                        zM17099R3 = AbstractC3352my.m17099R(parcel, i7);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k6);
                return new zab(iM17103V12, iM17103V13, jM17104W2, strM17138q10, zM17099R3);
            case 10:
                int iM17129k7 = AbstractC3352my.m17129k0(parcel);
                boolean zM17099R4 = false;
                while (parcel.dataPosition() < iM17129k7) {
                    int i8 = parcel.readInt();
                    char c6 = (char) i8;
                    if (c6 == 1) {
                        iM17103V5 = AbstractC3352my.m17103V(parcel, i8);
                    } else if (c6 != 2) {
                        AbstractC3352my.m17113c0(parcel, i8);
                    } else {
                        zM17099R4 = AbstractC3352my.m17099R(parcel, i8);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k7);
                return new ModuleInstallResponse(iM17103V5, zM17099R4);
            case 11:
                int iM17129k8 = AbstractC3352my.m17129k0(parcel);
                String strM17138q11 = null;
                String strM17138q12 = null;
                while (parcel.dataPosition() < iM17129k8) {
                    int i9 = parcel.readInt();
                    char c7 = (char) i9;
                    if (c7 == 1) {
                        arrayListM17142u2 = AbstractC3352my.m17142u(parcel, i9, Feature.CREATOR);
                    } else if (c7 == 2) {
                        zM17099R = AbstractC3352my.m17099R(parcel, i9);
                    } else if (c7 == 3) {
                        strM17138q11 = AbstractC3352my.m17138q(parcel, i9);
                    } else if (c7 != 4) {
                        AbstractC3352my.m17113c0(parcel, i9);
                    } else {
                        strM17138q12 = AbstractC3352my.m17138q(parcel, i9);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k8);
                return new ApiFeatureRequest(arrayListM17142u2, zM17099R, strM17138q11, strM17138q12);
            case 12:
                int iM17129k9 = AbstractC3352my.m17129k0(parcel);
                int iM17103V14 = 0;
                int iM17103V15 = 0;
                String[] strArrM17139r = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleM17130l2 = null;
                while (parcel.dataPosition() < iM17129k9) {
                    int i10 = parcel.readInt();
                    char c8 = (char) i10;
                    if (c8 == 1) {
                        strArrM17139r = AbstractC3352my.m17139r(parcel, i10);
                    } else if (c8 == 2) {
                        cursorWindowArr = (CursorWindow[]) AbstractC3352my.m17141t(parcel, i10, CursorWindow.CREATOR);
                    } else if (c8 == 3) {
                        iM17103V15 = AbstractC3352my.m17103V(parcel, i10);
                    } else if (c8 == 4) {
                        bundleM17130l2 = AbstractC3352my.m17130l(parcel, i10);
                    } else if (c8 != 1000) {
                        AbstractC3352my.m17113c0(parcel, i10);
                    } else {
                        iM17103V14 = AbstractC3352my.m17103V(parcel, i10);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k9);
                DataHolder dataHolder = new DataHolder(iM17103V14, strArrM17139r, cursorWindowArr, iM17103V15, bundleM17130l2);
                dataHolder.f11684c = new Bundle();
                int i11 = 0;
                while (true) {
                    String[] strArr = dataHolder.f11683b;
                    if (i11 >= strArr.length) {
                        CursorWindow[] cursorWindowArr2 = dataHolder.f11685d;
                        dataHolder.f11688g = new int[cursorWindowArr2.length];
                        int numRows = 0;
                        for (int i12 = 0; i12 < cursorWindowArr2.length; i12++) {
                            dataHolder.f11688g[i12] = numRows;
                            numRows += cursorWindowArr2[i12].getNumRows() - (numRows - cursorWindowArr2[i12].getStartPosition());
                        }
                        return dataHolder;
                    }
                    dataHolder.f11684c.putInt(strArr[i11], i11);
                    i11++;
                }
                break;
            case 13:
                int iM17129k10 = AbstractC3352my.m17129k0(parcel);
                int iM17103V16 = 0;
                boolean zM17099R5 = false;
                boolean zM17099R6 = false;
                boolean zM17099R7 = false;
                ArrayList arrayListM17142u4 = null;
                Account account2 = null;
                String strM17138q13 = null;
                String strM17138q14 = null;
                String strM17138q15 = null;
                while (parcel.dataPosition() < iM17129k10) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case 1:
                            iM17103V16 = AbstractC3352my.m17103V(parcel, i13);
                            break;
                        case 2:
                            arrayListM17142u4 = AbstractC3352my.m17142u(parcel, i13, Scope.CREATOR);
                            break;
                        case 3:
                            account2 = (Account) AbstractC3352my.m17137p(parcel, i13, Account.CREATOR);
                            break;
                        case 4:
                            zM17099R5 = AbstractC3352my.m17099R(parcel, i13);
                            break;
                        case 5:
                            zM17099R6 = AbstractC3352my.m17099R(parcel, i13);
                            break;
                        case 6:
                            zM17099R7 = AbstractC3352my.m17099R(parcel, i13);
                            break;
                        case 7:
                            strM17138q13 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case '\b':
                            strM17138q14 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        case '\t':
                            arrayListM17142u = AbstractC3352my.m17142u(parcel, i13, GoogleSignInOptionsExtensionParcelable.CREATOR);
                            break;
                        case '\n':
                            strM17138q15 = AbstractC3352my.m17138q(parcel, i13);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i13);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k10);
                return new GoogleSignInOptions(iM17103V16, arrayListM17142u4, account2, zM17099R5, zM17099R6, zM17099R7, strM17138q13, strM17138q14, GoogleSignInOptions.m5271J(arrayListM17142u), strM17138q15);
            case 14:
                int iM17129k11 = AbstractC3352my.m17129k0(parcel);
                String strM17138q16 = null;
                while (parcel.dataPosition() < iM17129k11) {
                    int i14 = parcel.readInt();
                    char c9 = (char) i14;
                    if (c9 == 1) {
                        arrayListM17140s = AbstractC3352my.m17140s(parcel, i14);
                    } else if (c9 != 2) {
                        AbstractC3352my.m17113c0(parcel, i14);
                    } else {
                        strM17138q16 = AbstractC3352my.m17138q(parcel, i14);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k11);
                return new zag(strM17138q16, arrayListM17140s);
            case 15:
                int iM17129k12 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k12) {
                    int i15 = parcel.readInt();
                    char c10 = (char) i15;
                    if (c10 == 1) {
                        iM17103V4 = AbstractC3352my.m17103V(parcel, i15);
                    } else if (c10 != 2) {
                        AbstractC3352my.m17113c0(parcel, i15);
                    } else {
                        zawVar = (zaw) AbstractC3352my.m17137p(parcel, i15, zaw.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k12);
                return new zai(iM17103V4, zawVar);
            case 16:
                int iM17129k13 = AbstractC3352my.m17129k0(parcel);
                zay zayVar = null;
                while (parcel.dataPosition() < iM17129k13) {
                    int i16 = parcel.readInt();
                    char c11 = (char) i16;
                    if (c11 == 1) {
                        iM17103V3 = AbstractC3352my.m17103V(parcel, i16);
                    } else if (c11 == 2) {
                        connectionResult = (ConnectionResult) AbstractC3352my.m17137p(parcel, i16, ConnectionResult.CREATOR);
                    } else if (c11 != 3) {
                        AbstractC3352my.m17113c0(parcel, i16);
                    } else {
                        zayVar = (zay) AbstractC3352my.m17137p(parcel, i16, zay.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k13);
                return new zak(iM17103V3, connectionResult, zayVar);
            case 17:
                int iM17129k14 = AbstractC3352my.m17129k0(parcel);
                int iM17103V17 = 0;
                GoogleSignInAccount googleSignInAccount2 = null;
                while (parcel.dataPosition() < iM17129k14) {
                    int i17 = parcel.readInt();
                    char c12 = (char) i17;
                    if (c12 == 1) {
                        iM17103V2 = AbstractC3352my.m17103V(parcel, i17);
                    } else if (c12 == 2) {
                        account = (Account) AbstractC3352my.m17137p(parcel, i17, Account.CREATOR);
                    } else if (c12 == 3) {
                        iM17103V17 = AbstractC3352my.m17103V(parcel, i17);
                    } else if (c12 != 4) {
                        AbstractC3352my.m17113c0(parcel, i17);
                    } else {
                        googleSignInAccount2 = (GoogleSignInAccount) AbstractC3352my.m17137p(parcel, i17, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k14);
                return new zaw(iM17103V2, account, iM17103V17, googleSignInAccount2);
            case 18:
                int iM17129k15 = AbstractC3352my.m17129k0(parcel);
                int iM17103V18 = 0;
                boolean zM17099R8 = false;
                boolean zM17099R9 = false;
                IBinder iBinderM17102U = null;
                ConnectionResult connectionResult2 = null;
                while (parcel.dataPosition() < iM17129k15) {
                    int i18 = parcel.readInt();
                    char c13 = (char) i18;
                    if (c13 == 1) {
                        iM17103V18 = AbstractC3352my.m17103V(parcel, i18);
                    } else if (c13 == 2) {
                        iBinderM17102U = AbstractC3352my.m17102U(parcel, i18);
                    } else if (c13 == 3) {
                        connectionResult2 = (ConnectionResult) AbstractC3352my.m17137p(parcel, i18, ConnectionResult.CREATOR);
                    } else if (c13 == 4) {
                        zM17099R8 = AbstractC3352my.m17099R(parcel, i18);
                    } else if (c13 != 5) {
                        AbstractC3352my.m17113c0(parcel, i18);
                    } else {
                        zM17099R9 = AbstractC3352my.m17099R(parcel, i18);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k15);
                return new zay(iM17103V18, iBinderM17102U, connectionResult2, zM17099R8, zM17099R9);
            case 19:
                int iM17129k16 = AbstractC3352my.m17129k0(parcel);
                String strM17138q17 = "";
                String strM17138q18 = "";
                while (parcel.dataPosition() < iM17129k16) {
                    int i19 = parcel.readInt();
                    char c14 = (char) i19;
                    if (c14 == 4) {
                        strM17138q17 = AbstractC3352my.m17138q(parcel, i19);
                    } else if (c14 == 7) {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC3352my.m17137p(parcel, i19, GoogleSignInAccount.CREATOR);
                    } else if (c14 != '\b') {
                        AbstractC3352my.m17113c0(parcel, i19);
                    } else {
                        strM17138q18 = AbstractC3352my.m17138q(parcel, i19);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k16);
                return new SignInAccount(strM17138q17, googleSignInAccount, strM17138q18);
            case 20:
                int iM17129k17 = AbstractC3352my.m17129k0(parcel);
                String strM17138q19 = null;
                String strM17138q20 = null;
                String strM17138q21 = null;
                ArrayList arrayListM17140s2 = null;
                GoogleSignInAccount googleSignInAccount3 = null;
                PendingIntent pendingIntent2 = null;
                Bundle bundleM17130l3 = null;
                while (parcel.dataPosition() < iM17129k17) {
                    int i20 = parcel.readInt();
                    switch ((char) i20) {
                        case 1:
                            strM17138q19 = AbstractC3352my.m17138q(parcel, i20);
                            break;
                        case 2:
                            strM17138q20 = AbstractC3352my.m17138q(parcel, i20);
                            break;
                        case 3:
                            strM17138q21 = AbstractC3352my.m17138q(parcel, i20);
                            break;
                        case 4:
                            arrayListM17140s2 = AbstractC3352my.m17140s(parcel, i20);
                            break;
                        case 5:
                            googleSignInAccount3 = (GoogleSignInAccount) AbstractC3352my.m17137p(parcel, i20, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent2 = (PendingIntent) AbstractC3352my.m17137p(parcel, i20, PendingIntent.CREATOR);
                            break;
                        case 7:
                            bundleM17130l3 = AbstractC3352my.m17130l(parcel, i20);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i20);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k17);
                return new AuthorizationResult(strM17138q19, strM17138q20, strM17138q21, arrayListM17140s2, googleSignInAccount3, pendingIntent2, bundleM17130l3);
            case 21:
                int iM17129k18 = AbstractC3352my.m17129k0(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM17129k18) {
                    int i21 = parcel.readInt();
                    char c15 = (char) i21;
                    if (c15 == 2) {
                        strM17138q = AbstractC3352my.m17138q(parcel, i21);
                    } else if (c15 != 5) {
                        AbstractC3352my.m17113c0(parcel, i21);
                    } else {
                        googleSignInOptions = (GoogleSignInOptions) AbstractC3352my.m17137p(parcel, i21, GoogleSignInOptions.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k18);
                return new SignInConfiguration(strM17138q, googleSignInOptions);
            case 22:
                int iM17129k19 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k19) {
                    int i22 = parcel.readInt();
                    if (((char) i22) != 1) {
                        AbstractC3352my.m17113c0(parcel, i22);
                    } else {
                        intent = (Intent) AbstractC3352my.m17137p(parcel, i22, Intent.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k19);
                return new CloudMessage(intent);
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                int iM17129k20 = AbstractC3352my.m17129k0(parcel);
                float fM17101T = 0.0f;
                int iM17103V19 = 0;
                int iM17103V20 = 0;
                int iM17103V21 = 0;
                int iM17103V22 = 0;
                while (parcel.dataPosition() < iM17129k20) {
                    int i23 = parcel.readInt();
                    char c16 = (char) i23;
                    if (c16 == 2) {
                        iM17103V19 = AbstractC3352my.m17103V(parcel, i23);
                    } else if (c16 == 3) {
                        iM17103V20 = AbstractC3352my.m17103V(parcel, i23);
                    } else if (c16 == 4) {
                        iM17103V21 = AbstractC3352my.m17103V(parcel, i23);
                    } else if (c16 == 5) {
                        iM17103V22 = AbstractC3352my.m17103V(parcel, i23);
                    } else if (c16 != 6) {
                        AbstractC3352my.m17113c0(parcel, i23);
                    } else {
                        fM17101T = AbstractC3352my.m17101T(parcel, i23);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k20);
                return new zzab(iM17103V19, iM17103V20, iM17103V21, iM17103V22, fM17101T);
            case 24:
                int iM17129k21 = AbstractC3352my.m17129k0(parcel);
                int iM17103V23 = 0;
                boolean zM17099R10 = false;
                boolean zM17099R11 = false;
                int iM17103V24 = 0;
                int iM17103V25 = 0;
                while (parcel.dataPosition() < iM17129k21) {
                    int i24 = parcel.readInt();
                    char c17 = (char) i24;
                    if (c17 == 1) {
                        iM17103V23 = AbstractC3352my.m17103V(parcel, i24);
                    } else if (c17 == 2) {
                        zM17099R10 = AbstractC3352my.m17099R(parcel, i24);
                    } else if (c17 == 3) {
                        zM17099R11 = AbstractC3352my.m17099R(parcel, i24);
                    } else if (c17 == 4) {
                        iM17103V24 = AbstractC3352my.m17103V(parcel, i24);
                    } else if (c17 != 5) {
                        AbstractC3352my.m17113c0(parcel, i24);
                    } else {
                        iM17103V25 = AbstractC3352my.m17103V(parcel, i24);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k21);
                return new RootTelemetryConfiguration(iM17103V23, zM17099R10, zM17099R11, iM17103V24, iM17103V25);
            case 25:
                int iM17129k22 = AbstractC3352my.m17129k0(parcel);
                float fM17101T2 = 0.0f;
                int iM17103V26 = 0;
                boolean zM17099R12 = false;
                int iM17103V27 = 0;
                int iM17103V28 = 0;
                zzao[] zzaoVarArr = null;
                zzab zzabVar = null;
                zzab zzabVar2 = null;
                zzab zzabVar3 = null;
                String strM17138q22 = null;
                String strM17138q23 = null;
                while (parcel.dataPosition() < iM17129k22) {
                    int i25 = parcel.readInt();
                    switch ((char) i25) {
                        case 2:
                            zzaoVarArr = (zzao[]) AbstractC3352my.m17141t(parcel, i25, zzao.CREATOR);
                            break;
                        case 3:
                            zzabVar = (zzab) AbstractC3352my.m17137p(parcel, i25, zzab.CREATOR);
                            break;
                        case 4:
                            zzabVar2 = (zzab) AbstractC3352my.m17137p(parcel, i25, zzab.CREATOR);
                            break;
                        case 5:
                            zzabVar3 = (zzab) AbstractC3352my.m17137p(parcel, i25, zzab.CREATOR);
                            break;
                        case 6:
                            strM17138q22 = AbstractC3352my.m17138q(parcel, i25);
                            break;
                        case 7:
                            fM17101T2 = AbstractC3352my.m17101T(parcel, i25);
                            break;
                        case '\b':
                            strM17138q23 = AbstractC3352my.m17138q(parcel, i25);
                            break;
                        case '\t':
                            iM17103V26 = AbstractC3352my.m17103V(parcel, i25);
                            break;
                        case '\n':
                            zM17099R12 = AbstractC3352my.m17099R(parcel, i25);
                            break;
                        case 11:
                            iM17103V27 = AbstractC3352my.m17103V(parcel, i25);
                            break;
                        case '\f':
                            iM17103V28 = AbstractC3352my.m17103V(parcel, i25);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i25);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k22);
                return new zzah(zzaoVarArr, zzabVar, zzabVar2, zzabVar3, strM17138q22, fM17101T2, strM17138q23, iM17103V26, zM17099R12, iM17103V27, iM17103V28);
            case 26:
                int iM17129k23 = AbstractC3352my.m17129k0(parcel);
                long jM17104W3 = 0;
                long jM17104W4 = 0;
                int iM17103V29 = 0;
                while (parcel.dataPosition() < iM17129k23) {
                    int i26 = parcel.readInt();
                    char c18 = (char) i26;
                    if (c18 == 1) {
                        jM17104W3 = AbstractC3352my.m17104W(parcel, i26);
                    } else if (c18 == 2) {
                        iM17103V29 = AbstractC3352my.m17103V(parcel, i26);
                    } else if (c18 != 3) {
                        AbstractC3352my.m17113c0(parcel, i26);
                    } else {
                        jM17104W4 = AbstractC3352my.m17104W(parcel, i26);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k23);
                return new zzaf(iM17103V29, jM17104W3, jM17104W4);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                int iM17129k24 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k24) {
                    int i27 = parcel.readInt();
                    if (((char) i27) != 2) {
                        AbstractC3352my.m17113c0(parcel, i27);
                    } else {
                        rect = (Rect) AbstractC3352my.m17137p(parcel, i27, Rect.CREATOR);
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k24);
                return new zzaj(rect);
            case 28:
                int iM17129k25 = AbstractC3352my.m17129k0(parcel);
                long jM17104W5 = 0;
                long jM17104W6 = 0;
                long jM17104W7 = 0;
                boolean zM17099R13 = false;
                String strM17138q24 = null;
                String strM17138q25 = null;
                zzpl zzplVar = null;
                String strM17138q26 = null;
                zzbh zzbhVar = null;
                zzbh zzbhVar2 = null;
                zzbh zzbhVar3 = null;
                while (parcel.dataPosition() < iM17129k25) {
                    int i28 = parcel.readInt();
                    switch ((char) i28) {
                        case 2:
                            strM17138q24 = AbstractC3352my.m17138q(parcel, i28);
                            break;
                        case 3:
                            strM17138q25 = AbstractC3352my.m17138q(parcel, i28);
                            break;
                        case 4:
                            zzplVar = (zzpl) AbstractC3352my.m17137p(parcel, i28, zzpl.CREATOR);
                            break;
                        case 5:
                            jM17104W5 = AbstractC3352my.m17104W(parcel, i28);
                            break;
                        case 6:
                            zM17099R13 = AbstractC3352my.m17099R(parcel, i28);
                            break;
                        case 7:
                            strM17138q26 = AbstractC3352my.m17138q(parcel, i28);
                            break;
                        case '\b':
                            zzbhVar = (zzbh) AbstractC3352my.m17137p(parcel, i28, zzbh.CREATOR);
                            break;
                        case '\t':
                            jM17104W6 = AbstractC3352my.m17104W(parcel, i28);
                            break;
                        case '\n':
                            zzbhVar2 = (zzbh) AbstractC3352my.m17137p(parcel, i28, zzbh.CREATOR);
                            break;
                        case 11:
                            jM17104W7 = AbstractC3352my.m17104W(parcel, i28);
                            break;
                        case '\f':
                            zzbhVar3 = (zzbh) AbstractC3352my.m17137p(parcel, i28, zzbh.CREATOR);
                            break;
                        default:
                            AbstractC3352my.m17113c0(parcel, i28);
                            break;
                    }
                }
                AbstractC3352my.m17145x(parcel, iM17129k25);
                return new com.google.android.gms.measurement.internal.zzah(strM17138q24, strM17138q25, zzplVar, jM17104W5, zM17099R13, strM17138q26, zzbhVar, jM17104W6, zzbhVar2, jM17104W7, zzbhVar3);
            default:
                int iM17129k26 = AbstractC3352my.m17129k0(parcel);
                while (parcel.dataPosition() < iM17129k26) {
                    AbstractC3352my.m17113c0(parcel, parcel.readInt());
                }
                AbstractC3352my.m17145x(parcel, iM17129k26);
                return new zzal();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f69248a) {
            case 0:
                return new TokenEditData[i];
            case 1:
                return new TokenFragmentData[i];
            case 2:
                return new WebViewLoginMethodHandler[i];
            case 3:
                return new GoogleSignInOptionsExtensionParcelable[i];
            case 4:
                return new BitmapTeleporter[i];
            case 5:
                return new ModuleAvailabilityResponse[i];
            case 6:
                return new ModuleInstallIntentResponse[i];
            case 7:
                return new zaa[i];
            case 8:
                return new GoogleSignInAccount[i];
            case 9:
                return new zab[i];
            case 10:
                return new ModuleInstallResponse[i];
            case 11:
                return new ApiFeatureRequest[i];
            case 12:
                return new DataHolder[i];
            case 13:
                return new GoogleSignInOptions[i];
            case 14:
                return new zag[i];
            case 15:
                return new zai[i];
            case 16:
                return new zak[i];
            case 17:
                return new zaw[i];
            case 18:
                return new zay[i];
            case 19:
                return new SignInAccount[i];
            case 20:
                return new AuthorizationResult[i];
            case 21:
                return new SignInConfiguration[i];
            case 22:
                return new CloudMessage[i];
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return new zzab[i];
            case 24:
                return new RootTelemetryConfiguration[i];
            case 25:
                return new zzah[i];
            case 26:
                return new zzaf[i];
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return new zzaj[i];
            case 28:
                return new com.google.android.gms.measurement.internal.zzah[i];
            default:
                return new zzal[i];
        }
    }
}
