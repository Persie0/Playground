package p000;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jie implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34118a;

    public jie(int i) {
        this.f34118a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final ErrorReport m13223a(Parcel parcel) {
        int iM13245G = jiy.m13245G(parcel);
        ApplicationErrorReport applicationErrorReport = null;
        String strM13250L = null;
        String strM13250L2 = null;
        String strM13250L3 = null;
        String strM13250L4 = null;
        String strM13250L5 = null;
        String strM13250L6 = null;
        String strM13250L7 = null;
        String strM13250L8 = null;
        String strM13250L9 = null;
        String strM13250L10 = null;
        String strM13250L11 = null;
        String strM13250L12 = null;
        String strM13250L13 = null;
        String[] strArrM13261W = null;
        String[] strArrM13261W2 = null;
        String[] strArrM13261W3 = null;
        String strM13250L14 = null;
        String strM13250L15 = null;
        byte[] bArrM13258T = null;
        String strM13250L16 = null;
        String strM13250L17 = null;
        String strM13250L18 = null;
        Bundle bundleM13247I = null;
        String strM13250L19 = null;
        String strM13250L20 = null;
        String strM13250L21 = null;
        String strM13250L22 = null;
        String strM13250L23 = null;
        String strM13250L24 = null;
        String strM13250L25 = null;
        String strM13250L26 = null;
        String strM13250L27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String strM13250L28 = null;
        jjz[] jjzVarArr = null;
        String[] strArrM13261W4 = null;
        String strM13250L29 = null;
        jkb jkbVar = null;
        jka jkaVar = null;
        String strM13250L30 = null;
        Bundle bundleM13247I2 = null;
        ArrayList arrayListM13253O = null;
        Bitmap bitmap = null;
        String strM13250L31 = null;
        ArrayList arrayListM13252N = null;
        String[] strArrM13261W5 = null;
        String[] strArrM13261W6 = null;
        String[] strArrM13261W7 = null;
        int iM13243E = 0;
        int iM13243E2 = 0;
        int iM13243E3 = 0;
        int iM13243E4 = 0;
        int iM13243E5 = 0;
        int iM13243E6 = 0;
        boolean zM13257S = false;
        int iM13243E7 = 0;
        int iM13243E8 = 0;
        boolean zM13257S2 = false;
        int iM13243E9 = 0;
        boolean zM13257S3 = false;
        boolean zM13257S4 = false;
        boolean zM13257S5 = false;
        int iM13243E10 = 0;
        int iM13243E11 = 0;
        boolean zM13257S6 = false;
        boolean zM13257S7 = false;
        while (parcel.dataPosition() < iM13245G) {
            int iM13242D = jiy.m13242D(parcel);
            switch (jiy.m13241C(iM13242D)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) jiy.m13249K(parcel, iM13242D, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    strM13250L = jiy.m13250L(parcel, iM13242D);
                    break;
                case 4:
                    iM13243E = jiy.m13243E(parcel, iM13242D);
                    break;
                case 5:
                    strM13250L2 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 6:
                    strM13250L3 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 7:
                    strM13250L4 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 8:
                    strM13250L5 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 9:
                    strM13250L6 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 10:
                    strM13250L7 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 11:
                    strM13250L8 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 12:
                    iM13243E2 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 13:
                    strM13250L9 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 14:
                    strM13250L10 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 15:
                    strM13250L11 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 16:
                    strM13250L12 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 17:
                    strM13250L13 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 18:
                    strArrM13261W = jiy.m13261W(parcel, iM13242D);
                    break;
                case 19:
                    strArrM13261W2 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 20:
                    strArrM13261W3 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 21:
                    strM13250L14 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 22:
                    strM13250L15 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 23:
                    bArrM13258T = jiy.m13258T(parcel, iM13242D);
                    break;
                case 24:
                    iM13243E3 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 25:
                    iM13243E4 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 26:
                    iM13243E5 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 27:
                    iM13243E6 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 28:
                    strM13250L16 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 29:
                    strM13250L17 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 30:
                    strM13250L18 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 31:
                    bundleM13247I = jiy.m13247I(parcel, iM13242D);
                    break;
                case 32:
                    zM13257S = jiy.m13257S(parcel, iM13242D);
                    break;
                case 33:
                    iM13243E7 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 34:
                    iM13243E8 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 35:
                    zM13257S2 = jiy.m13257S(parcel, iM13242D);
                    break;
                case 36:
                    strM13250L19 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 37:
                    strM13250L20 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 38:
                    iM13243E9 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 39:
                    strM13250L21 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 40:
                    strM13250L22 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 41:
                    strM13250L23 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 42:
                    strM13250L24 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 43:
                    strM13250L25 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 44:
                    strM13250L26 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 45:
                    strM13250L27 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 46:
                    bitmapTeleporter = (BitmapTeleporter) jiy.m13249K(parcel, iM13242D, BitmapTeleporter.CREATOR);
                    break;
                case 47:
                    strM13250L28 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 48:
                    jjzVarArr = (jjz[]) jiy.m13260V(parcel, iM13242D, jjz.CREATOR);
                    break;
                case 49:
                    strArrM13261W4 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 50:
                    zM13257S3 = jiy.m13257S(parcel, iM13242D);
                    break;
                case 51:
                    strM13250L29 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 52:
                    jkbVar = (jkb) jiy.m13249K(parcel, iM13242D, jkb.CREATOR);
                    break;
                case 53:
                    jkaVar = (jka) jiy.m13249K(parcel, iM13242D, jka.CREATOR);
                    break;
                case 54:
                    strM13250L30 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 55:
                    zM13257S4 = jiy.m13257S(parcel, iM13242D);
                    break;
                case 56:
                    bundleM13247I2 = jiy.m13247I(parcel, iM13242D);
                    break;
                case 57:
                    arrayListM13253O = jiy.m13253O(parcel, iM13242D, RectF.CREATOR);
                    break;
                case 58:
                    zM13257S5 = jiy.m13257S(parcel, iM13242D);
                    break;
                case 59:
                    bitmap = (Bitmap) jiy.m13249K(parcel, iM13242D, Bitmap.CREATOR);
                    break;
                case 60:
                    strM13250L31 = jiy.m13250L(parcel, iM13242D);
                    break;
                case 61:
                    arrayListM13252N = jiy.m13252N(parcel, iM13242D);
                    break;
                case 62:
                    iM13243E10 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 63:
                    iM13243E11 = jiy.m13243E(parcel, iM13242D);
                    break;
                case 64:
                    strArrM13261W5 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 65:
                    strArrM13261W6 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 66:
                    strArrM13261W7 = jiy.m13261W(parcel, iM13242D);
                    break;
                case 67:
                    zM13257S6 = jiy.m13257S(parcel, iM13242D);
                    break;
                case 68:
                    zM13257S7 = jiy.m13257S(parcel, iM13242D);
                    break;
                default:
                    jiy.m13256R(parcel, iM13242D);
                    break;
            }
        }
        jiy.m13254P(parcel, iM13245G);
        return new ErrorReport(applicationErrorReport, strM13250L, iM13243E, strM13250L2, strM13250L3, strM13250L4, strM13250L5, strM13250L6, strM13250L7, strM13250L8, iM13243E2, strM13250L9, strM13250L10, strM13250L11, strM13250L12, strM13250L13, strArrM13261W, strArrM13261W2, strArrM13261W3, strM13250L14, strM13250L15, bArrM13258T, iM13243E3, iM13243E4, iM13243E5, iM13243E6, strM13250L16, strM13250L17, strM13250L18, bundleM13247I, zM13257S, iM13243E7, iM13243E8, zM13257S2, strM13250L19, strM13250L20, iM13243E9, strM13250L21, strM13250L22, strM13250L23, strM13250L24, strM13250L25, strM13250L26, strM13250L27, bitmapTeleporter, strM13250L28, jjzVarArr, strArrM13261W4, zM13257S3, strM13250L29, jkbVar, jkaVar, strM13250L30, zM13257S4, bundleM13247I2, arrayListM13253O, zM13257S5, bitmap, strM13250L31, arrayListM13252N, iM13243E10, iM13243E11, strArrM13261W5, strArrM13261W6, strArrM13261W7, zM13257S6, zM13257S7);
    }

    /* JADX INFO: renamed from: b */
    public static void m13224b(jki jkiVar, Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 1, jkiVar.f34235a, i);
        jiy.m13296w(parcel, 2, jkiVar.f34236b);
        jiy.m13296w(parcel, 3, jkiVar.f34237c);
        jiy.m13287n(parcel, 4, jkiVar.f34238d);
        jiy.m13296w(parcel, 5, jkiVar.f34239e);
        jiy.m13287n(parcel, 6, jkiVar.f34240f);
        jiy.m13283j(parcel, iM13281h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f34118a) {
            case 0:
                return new jid[i];
            case 1:
                return new jic[i];
            case 2:
                return new jig[i];
            case 3:
                return new jih[i];
            case 4:
                return new ErrorReport[i];
            case 5:
                return new jjz[i];
            case 6:
                return new jka[i];
            case 7:
                return new jkb[i];
            case 8:
                return new FRDProductSpecificDataEntry[i];
            case 9:
                return new jki[i];
            case 10:
                return new ND4CSettings[i];
            case 11:
                return new jkj[i];
            case 12:
                return new jkr[i];
            case 13:
                return new TogglingData[i];
            case 14:
                return new jle[i];
            case 15:
                return new jlf[i];
            case 16:
                return new jlg[i];
            case 17:
                return new jms[i];
            case 18:
                return new jnd[i];
            case 19:
                return new jng[i];
            default:
                return new jnv[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long jM13246H = 0;
        int iM13243E = 0;
        int iM13243E2 = 0;
        boolean zM13257S = false;
        int iM13243E3 = 0;
        boolean zM13257S2 = false;
        int iM13243E4 = 0;
        int iM13243E5 = 0;
        Account account = null;
        Status status = null;
        String strM13250L = null;
        String strM13250L2 = null;
        String strM13250L3 = null;
        String strM13250L4 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        ArrayList arrayListM13253O = null;
        switch (this.f34118a) {
            case 0:
                int iM13245G = jiy.m13245G(parcel);
                IBinder iBinderM13248J = null;
                jcu jcuVar = null;
                int iM13243E6 = 0;
                boolean zM13257S3 = false;
                boolean zM13257S4 = false;
                while (parcel.dataPosition() < iM13245G) {
                    int i = parcel.readInt();
                    switch (jiy.m13241C(i)) {
                        case 1:
                            iM13243E6 = jiy.m13243E(parcel, i);
                            break;
                        case 2:
                            iBinderM13248J = jiy.m13248J(parcel, i);
                            break;
                        case 3:
                            jcuVar = (jcu) jiy.m13249K(parcel, i, jcu.CREATOR);
                            break;
                        case 4:
                            zM13257S3 = jiy.m13257S(parcel, i);
                            break;
                        case 5:
                            zM13257S4 = jiy.m13257S(parcel, i);
                            break;
                        default:
                            jiy.m13256R(parcel, i);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new jid(iM13243E6, iBinderM13248J, jcuVar, zM13257S3, zM13257S4);
            case 1:
                int iM13245G2 = jiy.m13245G(parcel);
                GoogleSignInAccount googleSignInAccount = null;
                int iM13243E7 = 0;
                while (parcel.dataPosition() < iM13245G2) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i2);
                            break;
                        case 2:
                            account = (Account) jiy.m13249K(parcel, i2, Account.CREATOR);
                            break;
                        case 3:
                            iM13243E7 = jiy.m13243E(parcel, i2);
                            break;
                        case 4:
                            googleSignInAccount = (GoogleSignInAccount) jiy.m13249K(parcel, i2, GoogleSignInAccount.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new jic(iM13243E, account, iM13243E7, googleSignInAccount);
            case 2:
                int iM13245G3 = jiy.m13245G(parcel);
                int iM13243E8 = 0;
                boolean zM13257S5 = false;
                boolean zM13257S6 = false;
                int iM13243E9 = 0;
                int iM13243E10 = 0;
                while (parcel.dataPosition() < iM13245G3) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 1:
                            iM13243E8 = jiy.m13243E(parcel, i3);
                            break;
                        case 2:
                            zM13257S5 = jiy.m13257S(parcel, i3);
                            break;
                        case 3:
                            zM13257S6 = jiy.m13257S(parcel, i3);
                            break;
                        case 4:
                            iM13243E9 = jiy.m13243E(parcel, i3);
                            break;
                        case 5:
                            iM13243E10 = jiy.m13243E(parcel, i3);
                            break;
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new jig(iM13243E8, zM13257S5, zM13257S6, iM13243E9, iM13243E10);
            case 3:
                int iM13245G4 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G4) {
                    int i4 = parcel.readInt();
                    switch (jiy.m13241C(i4)) {
                        case 1:
                            iM13243E5 = jiy.m13243E(parcel, i4);
                            break;
                        case 2:
                            arrayListM13253O = jiy.m13253O(parcel, i4, jhx.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i4);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G4);
                return new jih(iM13243E5, arrayListM13253O);
            case 4:
                return m13223a(parcel);
            case 5:
                int iM13245G5 = jiy.m13245G(parcel);
                String strM13250L5 = null;
                String strM13250L6 = null;
                while (parcel.dataPosition() < iM13245G5) {
                    int i5 = parcel.readInt();
                    switch (jiy.m13241C(i5)) {
                        case 2:
                            parcelFileDescriptor = (ParcelFileDescriptor) jiy.m13249K(parcel, i5, ParcelFileDescriptor.CREATOR);
                            break;
                        case 3:
                            strM13250L5 = jiy.m13250L(parcel, i5);
                            break;
                        case 4:
                            strM13250L6 = jiy.m13250L(parcel, i5);
                            break;
                        default:
                            jiy.m13256R(parcel, i5);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G5);
                return new jjz(parcelFileDescriptor, strM13250L5, strM13250L6);
            case 6:
                int iM13245G6 = jiy.m13245G(parcel);
                String strM13250L7 = null;
                boolean zM13257S7 = false;
                boolean zM13257S8 = false;
                boolean zM13257S9 = false;
                boolean zM13257S10 = false;
                while (parcel.dataPosition() < iM13245G6) {
                    int i6 = parcel.readInt();
                    switch (jiy.m13241C(i6)) {
                        case 2:
                            strM13250L7 = jiy.m13250L(parcel, i6);
                            break;
                        case 3:
                            zM13257S7 = jiy.m13257S(parcel, i6);
                            break;
                        case 4:
                            zM13257S8 = jiy.m13257S(parcel, i6);
                            break;
                        case 5:
                            zM13257S9 = jiy.m13257S(parcel, i6);
                            break;
                        case 6:
                            zM13257S10 = jiy.m13257S(parcel, i6);
                            break;
                        default:
                            jiy.m13256R(parcel, i6);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G6);
                return new jka(strM13250L7, zM13257S7, zM13257S8, zM13257S9, zM13257S10);
            case 7:
                int iM13245G7 = jiy.m13245G(parcel);
                int iM13243E11 = 0;
                while (parcel.dataPosition() < iM13245G7) {
                    int i7 = parcel.readInt();
                    switch (jiy.m13241C(i7)) {
                        case 2:
                            iM13243E4 = jiy.m13243E(parcel, i7);
                            break;
                        case 3:
                            iM13243E11 = jiy.m13243E(parcel, i7);
                            break;
                        default:
                            jiy.m13256R(parcel, i7);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G7);
                return new jkb(iM13243E4, iM13243E11);
            case 8:
                int iM13245G8 = jiy.m13245G(parcel);
                Boolean boolValueOf = null;
                ArrayList arrayListM13252N = null;
                ArrayList arrayListM13251M = null;
                ArrayList arrayListM13252N2 = null;
                ArrayList arrayListM13251M2 = null;
                byte[][] bArrM13262X = null;
                int iM13243E12 = 0;
                int iM13243E13 = 0;
                while (parcel.dataPosition() < iM13245G8) {
                    int i8 = parcel.readInt();
                    switch (jiy.m13241C(i8)) {
                        case 2:
                            iM13243E12 = jiy.m13243E(parcel, i8);
                            break;
                        case 3:
                            iM13243E13 = jiy.m13243E(parcel, i8);
                            break;
                        case 4:
                            arrayListM13252N = jiy.m13252N(parcel, i8);
                            break;
                        case 5:
                            arrayListM13251M = jiy.m13251M(parcel, i8);
                            break;
                        case 6:
                            arrayListM13252N2 = jiy.m13252N(parcel, i8);
                            break;
                        case 7:
                            arrayListM13251M2 = jiy.m13251M(parcel, i8);
                            break;
                        case 8:
                            bArrM13262X = jiy.m13262X(parcel, i8);
                            break;
                        case 9:
                            int iM13244F = jiy.m13244F(parcel, i8);
                            if (iM13244F != 0) {
                                jiy.m13263Y(parcel, iM13244F);
                                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                            } else {
                                boolValueOf = null;
                            }
                            break;
                        default:
                            jiy.m13256R(parcel, i8);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G8);
                return new FRDProductSpecificDataEntry(iM13243E12, iM13243E13, arrayListM13252N, arrayListM13251M, arrayListM13252N2, arrayListM13251M2, bArrM13262X, boolValueOf.booleanValue());
            case 9:
                int iM13245G9 = jiy.m13245G(parcel);
                GoogleHelp googleHelp = null;
                String strM13250L8 = null;
                String strM13250L9 = null;
                String strM13250L10 = null;
                int iM13243E14 = 0;
                int iM13243E15 = 0;
                while (parcel.dataPosition() < iM13245G9) {
                    int i9 = parcel.readInt();
                    switch (jiy.m13241C(i9)) {
                        case 1:
                            googleHelp = (GoogleHelp) jiy.m13249K(parcel, i9, GoogleHelp.CREATOR);
                            break;
                        case 2:
                            strM13250L8 = jiy.m13250L(parcel, i9);
                            break;
                        case 3:
                            strM13250L9 = jiy.m13250L(parcel, i9);
                            break;
                        case 4:
                            iM13243E14 = jiy.m13243E(parcel, i9);
                            break;
                        case 5:
                            strM13250L10 = jiy.m13250L(parcel, i9);
                            break;
                        case 6:
                            iM13243E15 = jiy.m13243E(parcel, i9);
                            break;
                        default:
                            jiy.m13256R(parcel, i9);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G9);
                return new jki(googleHelp, strM13250L8, strM13250L9, iM13243E14, strM13250L10, iM13243E15);
            case 10:
                int iM13245G10 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G10) {
                    int i10 = parcel.readInt();
                    switch (jiy.m13241C(i10)) {
                        case 2:
                            zM13257S2 = jiy.m13257S(parcel, i10);
                            break;
                        case 3:
                            strM13250L4 = jiy.m13250L(parcel, i10);
                            break;
                        default:
                            jiy.m13256R(parcel, i10);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G10);
                return new ND4CSettings(zM13257S2, strM13250L4);
            case 11:
                int iM13245G11 = jiy.m13245G(parcel);
                String strM13250L11 = null;
                String strM13250L12 = null;
                String strM13250L13 = null;
                while (parcel.dataPosition() < iM13245G11) {
                    int i11 = parcel.readInt();
                    switch (jiy.m13241C(i11)) {
                        case 2:
                            strM13250L3 = jiy.m13250L(parcel, i11);
                            break;
                        case 3:
                            strM13250L11 = jiy.m13250L(parcel, i11);
                            break;
                        case 4:
                            strM13250L13 = jiy.m13250L(parcel, i11);
                            break;
                        case 5:
                            strM13250L12 = jiy.m13250L(parcel, i11);
                            break;
                        default:
                            jiy.m13256R(parcel, i11);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G11);
                return new jkj(strM13250L3, strM13250L11, strM13250L12, strM13250L13);
            case 12:
                int iM13245G12 = jiy.m13245G(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM13245G12) {
                    int i12 = parcel.readInt();
                    switch (jiy.m13241C(i12)) {
                        case 2:
                            iM13243E3 = jiy.m13243E(parcel, i12);
                            break;
                        case 3:
                            strM13250L2 = jiy.m13250L(parcel, i12);
                            break;
                        case 4:
                            intent = (Intent) jiy.m13249K(parcel, i12, Intent.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i12);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G12);
                return new jkr(iM13243E3, strM13250L2, intent);
            case 13:
                int iM13245G13 = jiy.m13245G(parcel);
                String strM13250L14 = null;
                String strM13250L15 = null;
                while (parcel.dataPosition() < iM13245G13) {
                    int i13 = parcel.readInt();
                    switch (jiy.m13241C(i13)) {
                        case 2:
                            strM13250L = jiy.m13250L(parcel, i13);
                            break;
                        case 3:
                            strM13250L14 = jiy.m13250L(parcel, i13);
                            break;
                        case 4:
                            strM13250L15 = jiy.m13250L(parcel, i13);
                            break;
                        default:
                            jiy.m13256R(parcel, i13);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G13);
                return new TogglingData(strM13250L, strM13250L14, strM13250L15);
            case 14:
                int iM13245G14 = jiy.m13245G(parcel);
                long jM13246H2 = 0;
                String strM13250L16 = null;
                String strM13250L17 = null;
                Uri uri = null;
                jlf jlfVar = null;
                Uri uri2 = null;
                jlg jlgVar = null;
                byte[] bArrM13258T = null;
                Uri uri3 = null;
                int iM13243E16 = 0;
                boolean zM13257S11 = false;
                int iM13243E17 = 0;
                while (parcel.dataPosition() < iM13245G14) {
                    int i14 = parcel.readInt();
                    switch (jiy.m13241C(i14)) {
                        case 1:
                            strM13250L16 = jiy.m13250L(parcel, i14);
                            break;
                        case 2:
                            iM13243E16 = jiy.m13243E(parcel, i14);
                            break;
                        case 3:
                            zM13257S11 = jiy.m13257S(parcel, i14);
                            break;
                        case 4:
                            strM13250L17 = jiy.m13250L(parcel, i14);
                            break;
                        case 5:
                            iM13243E17 = jiy.m13243E(parcel, i14);
                            break;
                        case 6:
                            uri = (Uri) jiy.m13249K(parcel, i14, Uri.CREATOR);
                            break;
                        case 7:
                        case 8:
                        default:
                            jiy.m13256R(parcel, i14);
                            break;
                        case 9:
                            jlfVar = (jlf) jiy.m13249K(parcel, i14, jlf.CREATOR);
                            break;
                        case 10:
                            jM13246H2 = jiy.m13246H(parcel, i14);
                            break;
                        case 11:
                            uri2 = (Uri) jiy.m13249K(parcel, i14, Uri.CREATOR);
                            break;
                        case 12:
                            jlgVar = (jlg) jiy.m13249K(parcel, i14, jlg.CREATOR);
                            break;
                        case 13:
                            bArrM13258T = jiy.m13258T(parcel, i14);
                            break;
                        case 14:
                            uri3 = (Uri) jiy.m13249K(parcel, i14, Uri.CREATOR);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G14);
                return new jle(strM13250L16, iM13243E16, zM13257S11, strM13250L17, iM13243E17, uri, jlfVar, jM13246H2, uri2, jlgVar, bArrM13258T, uri3);
            case 15:
                int iM13245G15 = jiy.m13245G(parcel);
                boolean zM13257S12 = false;
                boolean zM13257S13 = false;
                while (parcel.dataPosition() < iM13245G15) {
                    int i15 = parcel.readInt();
                    switch (jiy.m13241C(i15)) {
                        case 1:
                            zM13257S = jiy.m13257S(parcel, i15);
                            break;
                        case 2:
                            zM13257S12 = jiy.m13257S(parcel, i15);
                            break;
                        case 3:
                            zM13257S13 = jiy.m13257S(parcel, i15);
                            break;
                        default:
                            jiy.m13256R(parcel, i15);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G15);
                return new jlf(zM13257S, zM13257S12, zM13257S13);
            case 16:
                int iM13245G16 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G16) {
                    int i16 = parcel.readInt();
                    switch (jiy.m13241C(i16)) {
                        case 1:
                            iM13243E2 = jiy.m13243E(parcel, i16);
                            break;
                        case 2:
                            jM13246H = jiy.m13246H(parcel, i16);
                            break;
                        default:
                            jiy.m13256R(parcel, i16);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G16);
                return new jlg(iM13243E2, jM13246H);
            case 17:
                int iM13245G17 = jiy.m13245G(parcel);
                int i17 = mws.f41739d;
                List listM13253O = mzr.f41857a;
                String strM13250L18 = null;
                String strM13250L19 = null;
                String strM13250L20 = null;
                jms jmsVar = null;
                int iM13243E18 = 0;
                int iM13243E19 = 0;
                int iM13243E20 = 0;
                while (parcel.dataPosition() < iM13245G17) {
                    int i18 = parcel.readInt();
                    switch (jiy.m13241C(i18)) {
                        case 1:
                            iM13243E18 = jiy.m13243E(parcel, i18);
                            break;
                        case 2:
                            iM13243E19 = jiy.m13243E(parcel, i18);
                            break;
                        case 3:
                            strM13250L18 = jiy.m13250L(parcel, i18);
                            break;
                        case 4:
                            strM13250L19 = jiy.m13250L(parcel, i18);
                            break;
                        case 5:
                            iM13243E20 = jiy.m13243E(parcel, i18);
                            break;
                        case 6:
                            strM13250L20 = jiy.m13250L(parcel, i18);
                            break;
                        case 7:
                            jmsVar = (jms) jiy.m13249K(parcel, i18, jms.CREATOR);
                            break;
                        case 8:
                            listM13253O = jiy.m13253O(parcel, i18, jcw.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i18);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G17);
                return new jms(iM13243E18, iM13243E19, strM13250L18, strM13250L19, strM13250L20, iM13243E20, listM13253O, jmsVar);
            case 18:
                int iM13245G18 = jiy.m13245G(parcel);
                long jM13246H3 = Long.MAX_VALUE;
                String strM13250L21 = null;
                jms jmsVar2 = null;
                int iM13243E21 = 0;
                boolean zM13257S14 = false;
                while (parcel.dataPosition() < iM13245G18) {
                    int i19 = parcel.readInt();
                    switch (jiy.m13241C(i19)) {
                        case 1:
                            jM13246H3 = jiy.m13246H(parcel, i19);
                            break;
                        case 2:
                            iM13243E21 = jiy.m13243E(parcel, i19);
                            break;
                        case 3:
                            zM13257S14 = jiy.m13257S(parcel, i19);
                            break;
                        case 4:
                            strM13250L21 = jiy.m13250L(parcel, i19);
                            break;
                        case 5:
                            jmsVar2 = (jms) jiy.m13249K(parcel, i19, jms.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i19);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G18);
                return new jnd(jM13246H3, iM13243E21, zM13257S14, strM13250L21, jmsVar2);
            case 19:
                int iM13245G19 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G19) {
                    int i20 = parcel.readInt();
                    switch (jiy.m13241C(i20)) {
                        case 1:
                            status = (Status) jiy.m13249K(parcel, i20, Status.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i20);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G19);
                return new jng(status);
            default:
                int iM13245G20 = jiy.m13245G(parcel);
                IBinder iBinderM13248J2 = null;
                IBinder iBinderM13248J3 = null;
                PendingIntent pendingIntent = null;
                String strM13250L22 = null;
                int iM13243E22 = 0;
                while (parcel.dataPosition() < iM13245G20) {
                    int i21 = parcel.readInt();
                    switch (jiy.m13241C(i21)) {
                        case 1:
                            iM13243E22 = jiy.m13243E(parcel, i21);
                            break;
                        case 2:
                            iBinderM13248J2 = jiy.m13248J(parcel, i21);
                            break;
                        case 3:
                            iBinderM13248J3 = jiy.m13248J(parcel, i21);
                            break;
                        case 4:
                            pendingIntent = (PendingIntent) jiy.m13249K(parcel, i21, PendingIntent.CREATOR);
                            break;
                        case 5:
                            jiy.m13250L(parcel, i21);
                            break;
                        case 6:
                            strM13250L22 = jiy.m13250L(parcel, i21);
                            break;
                        default:
                            jiy.m13256R(parcel, i21);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G20);
                return new jnv(iM13243E22, iBinderM13248J2, iBinderM13248J3, pendingIntent, strM13250L22);
        }
    }
}
