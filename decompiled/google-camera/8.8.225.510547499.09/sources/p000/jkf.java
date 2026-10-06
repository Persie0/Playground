package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM13245G = jiy.m13245G(parcel);
        String strM13250L = null;
        Account account = null;
        Bundle bundleM13247I = null;
        String strM13250L2 = null;
        String strM13250L3 = null;
        Bitmap bitmap = null;
        ArrayList arrayListM13252N = null;
        Bundle bundleM13247I2 = null;
        Bitmap bitmap2 = null;
        byte[] bArrM13258T = null;
        String strM13250L4 = null;
        Uri uri = null;
        ArrayList arrayListM13253O = null;
        jkb jkbVar = null;
        ArrayList arrayListM13253O2 = null;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        PendingIntent pendingIntent = null;
        String strM13250L5 = null;
        String strM13250L6 = null;
        ND4CSettings nD4CSettings = null;
        ArrayList arrayListM13253O3 = null;
        String strM13250L7 = null;
        int iM13243E = 0;
        boolean zM13257S = false;
        boolean zM13257S2 = false;
        int iM13243E2 = 0;
        int iM13243E3 = 0;
        int iM13243E4 = 0;
        boolean zM13257S3 = false;
        int iM13243E5 = 0;
        int iM13243E6 = 0;
        boolean zM13257S4 = false;
        boolean zM13257S5 = false;
        int iM13243E7 = 0;
        boolean zM13257S6 = false;
        boolean zM13257S7 = false;
        boolean zM13257S8 = false;
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
                    account = (Account) jiy.m13249K(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    bundleM13247I = jiy.m13247I(parcel, i);
                    break;
                case 5:
                    zM13257S = jiy.m13257S(parcel, i);
                    break;
                case 6:
                    zM13257S2 = jiy.m13257S(parcel, i);
                    break;
                case 7:
                    arrayListM13252N = jiy.m13252N(parcel, i);
                    break;
                case 8:
                case 9:
                case 12:
                case 13:
                case 24:
                case 26:
                case 27:
                case 29:
                case 30:
                default:
                    jiy.m13256R(parcel, i);
                    break;
                case 10:
                    bundleM13247I2 = jiy.m13247I(parcel, i);
                    break;
                case 11:
                    bitmap2 = (Bitmap) jiy.m13249K(parcel, i, Bitmap.CREATOR);
                    break;
                case 14:
                    strM13250L4 = jiy.m13250L(parcel, i);
                    break;
                case 15:
                    uri = (Uri) jiy.m13249K(parcel, i, Uri.CREATOR);
                    break;
                case 16:
                    arrayListM13253O = jiy.m13253O(parcel, i, jkr.CREATOR);
                    break;
                case 17:
                    iM13243E4 = jiy.m13243E(parcel, i);
                    break;
                case 18:
                    arrayListM13253O2 = jiy.m13253O(parcel, i, jkj.CREATOR);
                    break;
                case 19:
                    bArrM13258T = jiy.m13258T(parcel, i);
                    break;
                case 20:
                    iM13243E2 = jiy.m13243E(parcel, i);
                    break;
                case 21:
                    iM13243E3 = jiy.m13243E(parcel, i);
                    break;
                case 22:
                    zM13257S3 = jiy.m13257S(parcel, i);
                    break;
                case 23:
                    errorReport = (ErrorReport) jiy.m13249K(parcel, i, ErrorReport.CREATOR);
                    break;
                case 25:
                    jkbVar = (jkb) jiy.m13249K(parcel, i, jkb.CREATOR);
                    break;
                case 28:
                    strM13250L2 = jiy.m13250L(parcel, i);
                    break;
                case 31:
                    togglingData = (TogglingData) jiy.m13249K(parcel, i, TogglingData.CREATOR);
                    break;
                case 32:
                    iM13243E5 = jiy.m13243E(parcel, i);
                    break;
                case 33:
                    pendingIntent = (PendingIntent) jiy.m13249K(parcel, i, PendingIntent.CREATOR);
                    break;
                case 34:
                    strM13250L3 = jiy.m13250L(parcel, i);
                    break;
                case 35:
                    bitmap = (Bitmap) jiy.m13249K(parcel, i, Bitmap.CREATOR);
                    break;
                case 36:
                    iM13243E6 = jiy.m13243E(parcel, i);
                    break;
                case 37:
                    zM13257S4 = jiy.m13257S(parcel, i);
                    break;
                case 38:
                    zM13257S5 = jiy.m13257S(parcel, i);
                    break;
                case 39:
                    iM13243E7 = jiy.m13243E(parcel, i);
                    break;
                case 40:
                    strM13250L5 = jiy.m13250L(parcel, i);
                    break;
                case 41:
                    zM13257S6 = jiy.m13257S(parcel, i);
                    break;
                case 42:
                    strM13250L6 = jiy.m13250L(parcel, i);
                    break;
                case 43:
                    zM13257S7 = jiy.m13257S(parcel, i);
                    break;
                case 44:
                    nD4CSettings = (ND4CSettings) jiy.m13249K(parcel, i, ND4CSettings.CREATOR);
                    break;
                case 45:
                    zM13257S8 = jiy.m13257S(parcel, i);
                    break;
                case 46:
                    arrayListM13253O3 = jiy.m13253O(parcel, i, FRDProductSpecificDataEntry.CREATOR);
                    break;
                case 47:
                    strM13250L7 = jiy.m13250L(parcel, i);
                    break;
            }
        }
        jiy.m13254P(parcel, iM13245G);
        return new GoogleHelp(iM13243E, strM13250L, account, bundleM13247I, strM13250L2, strM13250L3, bitmap, zM13257S, zM13257S2, arrayListM13252N, bundleM13247I2, bitmap2, bArrM13258T, iM13243E2, iM13243E3, strM13250L4, uri, arrayListM13253O, iM13243E4, jkbVar, arrayListM13253O2, zM13257S3, errorReport, togglingData, iM13243E5, pendingIntent, iM13243E6, zM13257S4, zM13257S5, iM13243E7, strM13250L5, zM13257S6, strM13250L6, zM13257S7, nD4CSettings, zM13257S8, arrayListM13253O3, strM13250L7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
