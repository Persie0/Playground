package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbt implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f33674a;

    public jbt(int i) {
        this.f33674a = i;
    }

    /* JADX INFO: renamed from: a */
    public static void m12849a(jhg jhgVar, Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, jhgVar.f34042c);
        jiy.m13287n(parcel, 2, jhgVar.f34043d);
        jiy.m13287n(parcel, 3, jhgVar.f34044e);
        jiy.m13296w(parcel, 4, jhgVar.f34045f);
        jiy.m13292s(parcel, 5, jhgVar.f34046g);
        jiy.m13299z(parcel, 6, jhgVar.f34047h, i);
        jiy.m13289p(parcel, 7, jhgVar.f34048i);
        jiy.m13295v(parcel, 8, jhgVar.f34049j, i);
        jiy.m13299z(parcel, 10, jhgVar.f34050k, i);
        jiy.m13299z(parcel, 11, jhgVar.f34051l, i);
        jiy.m13284k(parcel, 12, jhgVar.f34052m);
        jiy.m13287n(parcel, 13, jhgVar.f34053n);
        jiy.m13284k(parcel, 14, jhgVar.f34054o);
        jiy.m13296w(parcel, 15, jhgVar.f34055p);
        jiy.m13283j(parcel, iM13281h);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f33674a) {
            case 0:
                return new SignInConfiguration[i];
            case 1:
                return new jbp[i];
            case 2:
                return new jcf[i];
            case 3:
                return new jch[i];
            case 4:
                return new jcp[i];
            case 5:
                return new jcr[i];
            case 6:
                return new jcs[i];
            case 7:
                return new jcu[i];
            case 8:
                return new jcw[i];
            case 9:
                return new jdi[i];
            case 10:
                return new jdj[i];
            case 11:
                return new jdk[i];
            case 12:
                return new Scope[i];
            case 13:
                return new Status[i];
            case 14:
                return new BitmapTeleporter[i];
            case 15:
                return new DataHolder[i];
            case 16:
                return new jgx[i];
            case 17:
                return new jhb[i];
            case 18:
                return new jhc[i];
            case 19:
                return new jhg[i];
            default:
                return new jhx[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String strM13250L = null;
        Bundle bundleM13247I = null;
        String strM13250L2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strM13250L3 = null;
        String strM13250L4 = null;
        String strM13250L5 = null;
        String strM13250L6 = null;
        PendingIntent pendingIntent = null;
        String strM13250L7 = null;
        ArrayList arrayListM13253O = null;
        Bundle bundleM13247I2 = null;
        int iM13243E = 0;
        int iM13243E2 = 0;
        int i = 0;
        int iM13243E3 = 0;
        int iM13243E4 = 0;
        boolean zM13257S = false;
        boolean zM13257S2 = false;
        int iM13243E5 = 0;
        int iM13243E6 = 0;
        boolean zM13257S3 = false;
        int iM13243E7 = 0;
        switch (this.f33674a) {
            case 0:
                int iM13245G = jiy.m13245G(parcel);
                GoogleSignInOptions googleSignInOptions = null;
                while (parcel.dataPosition() < iM13245G) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 2:
                            strM13250L = jiy.m13250L(parcel, i2);
                            break;
                        case 5:
                            googleSignInOptions = (GoogleSignInOptions) jiy.m13249K(parcel, i2, GoogleSignInOptions.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new SignInConfiguration(strM13250L, googleSignInOptions);
            case 1:
                int iM13245G2 = jiy.m13245G(parcel);
                int iM13243E8 = 0;
                while (parcel.dataPosition() < iM13245G2) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i3);
                            break;
                        case 2:
                            iM13243E8 = jiy.m13243E(parcel, i3);
                            break;
                        case 3:
                            bundleM13247I2 = jiy.m13247I(parcel, i3);
                            break;
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new jbp(iM13243E, iM13243E8, bundleM13247I2);
            case 2:
                int iM13245G3 = jiy.m13245G(parcel);
                jcs jcsVar = null;
                byte[] bArrM13258T = null;
                int[] iArrM13259U = null;
                String[] strArrM13261W = null;
                int[] iArrM13259U2 = null;
                byte[][] bArrM13262X = null;
                jod[] jodVarArr = null;
                jcr jcrVar = null;
                String[] strArrM13261W2 = null;
                boolean zM13257S4 = true;
                int iM13243E9 = 0;
                while (parcel.dataPosition() < iM13245G3) {
                    int i4 = parcel.readInt();
                    switch (jiy.m13241C(i4)) {
                        case 2:
                            jcsVar = (jcs) jiy.m13249K(parcel, i4, jcs.CREATOR);
                            break;
                        case 3:
                            bArrM13258T = jiy.m13258T(parcel, i4);
                            break;
                        case 4:
                            iArrM13259U = jiy.m13259U(parcel, i4);
                            break;
                        case 5:
                            strArrM13261W = jiy.m13261W(parcel, i4);
                            break;
                        case 6:
                            iArrM13259U2 = jiy.m13259U(parcel, i4);
                            break;
                        case 7:
                            bArrM13262X = jiy.m13262X(parcel, i4);
                            break;
                        case 8:
                            zM13257S4 = jiy.m13257S(parcel, i4);
                            break;
                        case 9:
                            jodVarArr = (jod[]) jiy.m13260V(parcel, i4, jod.CREATOR);
                            break;
                        case 10:
                        default:
                            jiy.m13256R(parcel, i4);
                            break;
                        case 11:
                            jcrVar = (jcr) jiy.m13249K(parcel, i4, jcr.CREATOR);
                            break;
                        case 12:
                            strArrM13261W2 = jiy.m13261W(parcel, i4);
                            break;
                        case 13:
                            iM13243E9 = jiy.m13243E(parcel, i4);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new jcf(jcsVar, bArrM13258T, iArrM13259U, strArrM13261W, iArrM13259U2, bArrM13262X, zM13257S4, jodVarArr, jcrVar, strArrM13261W2, iM13243E9);
            case 3:
                int iM13245G4 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G4) {
                    int i5 = parcel.readInt();
                    switch (jiy.m13241C(i5)) {
                        case 1:
                            arrayListM13253O = jiy.m13253O(parcel, i5, jcp.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i5);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G4);
                return new jch(arrayListM13253O);
            case 4:
                int iM13245G5 = jiy.m13245G(parcel);
                int iM13243E10 = 0;
                while (parcel.dataPosition() < iM13245G5) {
                    int i6 = parcel.readInt();
                    switch (jiy.m13241C(i6)) {
                        case 1:
                            strM13250L7 = jiy.m13250L(parcel, i6);
                            break;
                        case 2:
                            iM13243E7 = jiy.m13243E(parcel, i6);
                            break;
                        case 3:
                            iM13243E10 = jiy.m13243E(parcel, i6);
                            break;
                        default:
                            jiy.m13256R(parcel, i6);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G5);
                return new jcp(strM13250L7, iM13243E7, iM13243E10);
            case 5:
                int iM13245G6 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G6) {
                    int i7 = parcel.readInt();
                    switch (jiy.m13241C(i7)) {
                        case 1:
                            zM13257S3 = jiy.m13257S(parcel, i7);
                            break;
                        default:
                            jiy.m13256R(parcel, i7);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G6);
                return new jcr(zM13257S3);
            case 6:
                int iM13245G7 = jiy.m13245G(parcel);
                String strM13250L8 = null;
                String strM13250L9 = null;
                String strM13250L10 = null;
                Integer numValueOf = null;
                int iM13243E11 = 0;
                int iM13243E12 = 0;
                boolean zM13257S5 = true;
                boolean zM13257S6 = false;
                int iM13243E13 = 0;
                boolean zM13257S7 = false;
                int iM13243E14 = 0;
                while (parcel.dataPosition() < iM13245G7) {
                    int i8 = parcel.readInt();
                    switch (jiy.m13241C(i8)) {
                        case 2:
                            strM13250L8 = jiy.m13250L(parcel, i8);
                            break;
                        case 3:
                            iM13243E11 = jiy.m13243E(parcel, i8);
                            break;
                        case 4:
                            iM13243E12 = jiy.m13243E(parcel, i8);
                            break;
                        case 5:
                            strM13250L9 = jiy.m13250L(parcel, i8);
                            break;
                        case 6:
                        default:
                            jiy.m13256R(parcel, i8);
                            break;
                        case 7:
                            zM13257S5 = jiy.m13257S(parcel, i8);
                            break;
                        case 8:
                            strM13250L10 = jiy.m13250L(parcel, i8);
                            break;
                        case 9:
                            zM13257S6 = jiy.m13257S(parcel, i8);
                            break;
                        case 10:
                            iM13243E13 = jiy.m13243E(parcel, i8);
                            break;
                        case 11:
                            int iM13244F = jiy.m13244F(parcel, i8);
                            if (iM13244F != 0) {
                                jiy.m13263Y(parcel, iM13244F);
                                numValueOf = Integer.valueOf(parcel.readInt());
                            } else {
                                numValueOf = null;
                            }
                            break;
                        case 12:
                            zM13257S7 = jiy.m13257S(parcel, i8);
                            break;
                        case 13:
                            iM13243E14 = jiy.m13243E(parcel, i8);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G7);
                return new jcs(strM13250L8, iM13243E11, iM13243E12, strM13250L9, zM13257S5, strM13250L10, zM13257S6, iM13243E13, numValueOf, zM13257S7, iM13243E14);
            case 7:
                int iM13245G8 = jiy.m13245G(parcel);
                String strM13250L11 = null;
                int iM13243E15 = 0;
                while (parcel.dataPosition() < iM13245G8) {
                    int i9 = parcel.readInt();
                    switch (jiy.m13241C(i9)) {
                        case 1:
                            iM13243E6 = jiy.m13243E(parcel, i9);
                            break;
                        case 2:
                            iM13243E15 = jiy.m13243E(parcel, i9);
                            break;
                        case 3:
                            pendingIntent = (PendingIntent) jiy.m13249K(parcel, i9, PendingIntent.CREATOR);
                            break;
                        case 4:
                            strM13250L11 = jiy.m13250L(parcel, i9);
                            break;
                        default:
                            jiy.m13256R(parcel, i9);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G8);
                return new jcu(iM13243E6, iM13243E15, pendingIntent, strM13250L11);
            case 8:
                int iM13245G9 = jiy.m13245G(parcel);
                long jM13246H = -1;
                while (parcel.dataPosition() < iM13245G9) {
                    int i10 = parcel.readInt();
                    switch (jiy.m13241C(i10)) {
                        case 1:
                            strM13250L6 = jiy.m13250L(parcel, i10);
                            break;
                        case 2:
                            iM13243E5 = jiy.m13243E(parcel, i10);
                            break;
                        case 3:
                            jM13246H = jiy.m13246H(parcel, i10);
                            break;
                        default:
                            jiy.m13256R(parcel, i10);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G9);
                return new jcw(strM13250L6, iM13243E5, jM13246H);
            case 9:
                int iM13245G10 = jiy.m13245G(parcel);
                String strM13250L12 = null;
                IBinder iBinderM13248J = null;
                boolean zM13257S8 = false;
                boolean zM13257S9 = false;
                boolean zM13257S10 = false;
                boolean zM13257S11 = false;
                while (parcel.dataPosition() < iM13245G10) {
                    int i11 = parcel.readInt();
                    switch (jiy.m13241C(i11)) {
                        case 1:
                            strM13250L12 = jiy.m13250L(parcel, i11);
                            break;
                        case 2:
                            zM13257S8 = jiy.m13257S(parcel, i11);
                            break;
                        case 3:
                            zM13257S9 = jiy.m13257S(parcel, i11);
                            break;
                        case 4:
                            iBinderM13248J = jiy.m13248J(parcel, i11);
                            break;
                        case 5:
                            zM13257S10 = jiy.m13257S(parcel, i11);
                            break;
                        case 6:
                            zM13257S11 = jiy.m13257S(parcel, i11);
                            break;
                        default:
                            jiy.m13256R(parcel, i11);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G10);
                return new jdi(strM13250L12, zM13257S8, zM13257S9, iBinderM13248J, zM13257S10, zM13257S11);
            case 10:
                int iM13245G11 = jiy.m13245G(parcel);
                int iM13243E16 = 0;
                int iM13243E17 = 0;
                while (parcel.dataPosition() < iM13245G11) {
                    int i12 = parcel.readInt();
                    switch (jiy.m13241C(i12)) {
                        case 1:
                            zM13257S2 = jiy.m13257S(parcel, i12);
                            break;
                        case 2:
                            strM13250L5 = jiy.m13250L(parcel, i12);
                            break;
                        case 3:
                            iM13243E16 = jiy.m13243E(parcel, i12);
                            break;
                        case 4:
                            iM13243E17 = jiy.m13243E(parcel, i12);
                            break;
                        default:
                            jiy.m13256R(parcel, i12);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G11);
                return new jdj(zM13257S2, strM13250L5, iM13243E16, iM13243E17);
            case 11:
                int iM13245G12 = jiy.m13245G(parcel);
                IBinder iBinderM13248J2 = null;
                boolean zM13257S12 = false;
                while (parcel.dataPosition() < iM13245G12) {
                    int i13 = parcel.readInt();
                    switch (jiy.m13241C(i13)) {
                        case 1:
                            strM13250L4 = jiy.m13250L(parcel, i13);
                            break;
                        case 2:
                            iBinderM13248J2 = jiy.m13248J(parcel, i13);
                            break;
                        case 3:
                            zM13257S = jiy.m13257S(parcel, i13);
                            break;
                        case 4:
                            zM13257S12 = jiy.m13257S(parcel, i13);
                            break;
                        default:
                            jiy.m13256R(parcel, i13);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G12);
                return new jdk(strM13250L4, iBinderM13248J2, zM13257S, zM13257S12);
            case 12:
                int iM13245G13 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G13) {
                    int i14 = parcel.readInt();
                    switch (jiy.m13241C(i14)) {
                        case 1:
                            iM13243E4 = jiy.m13243E(parcel, i14);
                            break;
                        case 2:
                            strM13250L3 = jiy.m13250L(parcel, i14);
                            break;
                        default:
                            jiy.m13256R(parcel, i14);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G13);
                return new Scope(iM13243E4, strM13250L3);
            case 13:
                int iM13245G14 = jiy.m13245G(parcel);
                String strM13250L13 = null;
                PendingIntent pendingIntent2 = null;
                jcu jcuVar = null;
                int iM13243E18 = 0;
                int iM13243E19 = 0;
                while (parcel.dataPosition() < iM13245G14) {
                    int i15 = parcel.readInt();
                    switch (jiy.m13241C(i15)) {
                        case 1:
                            iM13243E19 = jiy.m13243E(parcel, i15);
                            break;
                        case 2:
                            strM13250L13 = jiy.m13250L(parcel, i15);
                            break;
                        case 3:
                            pendingIntent2 = (PendingIntent) jiy.m13249K(parcel, i15, PendingIntent.CREATOR);
                            break;
                        case 4:
                            jcuVar = (jcu) jiy.m13249K(parcel, i15, jcu.CREATOR);
                            break;
                        case 1000:
                            iM13243E18 = jiy.m13243E(parcel, i15);
                            break;
                        default:
                            jiy.m13256R(parcel, i15);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G14);
                return new Status(iM13243E18, iM13243E19, strM13250L13, pendingIntent2, jcuVar);
            case 14:
                int iM13245G15 = jiy.m13245G(parcel);
                int iM13243E20 = 0;
                while (parcel.dataPosition() < iM13245G15) {
                    int i16 = parcel.readInt();
                    switch (jiy.m13241C(i16)) {
                        case 1:
                            iM13243E3 = jiy.m13243E(parcel, i16);
                            break;
                        case 2:
                            parcelFileDescriptor = (ParcelFileDescriptor) jiy.m13249K(parcel, i16, ParcelFileDescriptor.CREATOR);
                            break;
                        case 3:
                            iM13243E20 = jiy.m13243E(parcel, i16);
                            break;
                        default:
                            jiy.m13256R(parcel, i16);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G15);
                return new BitmapTeleporter(iM13243E3, parcelFileDescriptor, iM13243E20);
            case 15:
                int iM13245G16 = jiy.m13245G(parcel);
                String[] strArrM13261W3 = null;
                CursorWindow[] cursorWindowArr = null;
                Bundle bundleM13247I3 = null;
                int iM13243E21 = 0;
                int iM13243E22 = 0;
                while (parcel.dataPosition() < iM13245G16) {
                    int i17 = parcel.readInt();
                    switch (jiy.m13241C(i17)) {
                        case 1:
                            strArrM13261W3 = jiy.m13261W(parcel, i17);
                            break;
                        case 2:
                            cursorWindowArr = (CursorWindow[]) jiy.m13260V(parcel, i17, CursorWindow.CREATOR);
                            break;
                        case 3:
                            iM13243E22 = jiy.m13243E(parcel, i17);
                            break;
                        case 4:
                            bundleM13247I3 = jiy.m13247I(parcel, i17);
                            break;
                        case 1000:
                            iM13243E21 = jiy.m13243E(parcel, i17);
                            break;
                        default:
                            jiy.m13256R(parcel, i17);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G16);
                DataHolder dataHolder = new DataHolder(iM13243E21, strArrM13261W3, cursorWindowArr, iM13243E22, bundleM13247I3);
                dataHolder.f7628c = new Bundle();
                int i18 = 0;
                while (true) {
                    String[] strArr = dataHolder.f7627b;
                    if (i18 < strArr.length) {
                        dataHolder.f7628c.putInt(strArr[i18], i18);
                        i18++;
                    } else {
                        dataHolder.f7632g = new int[dataHolder.f7629d.length];
                        int numRows = 0;
                        while (true) {
                            CursorWindow[] cursorWindowArr2 = dataHolder.f7629d;
                            if (i >= cursorWindowArr2.length) {
                                dataHolder.f7633h = numRows;
                                return dataHolder;
                            }
                            dataHolder.f7632g[i] = numRows;
                            numRows += dataHolder.f7629d[i].getNumRows() - (numRows - cursorWindowArr2[i].getStartPosition());
                            i++;
                        }
                    }
                }
                break;
            case 16:
                int iM13245G17 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G17) {
                    int i19 = parcel.readInt();
                    switch (jiy.m13241C(i19)) {
                        case 1:
                            iM13243E2 = jiy.m13243E(parcel, i19);
                            break;
                        case 2:
                            strM13250L2 = jiy.m13250L(parcel, i19);
                            break;
                        default:
                            jiy.m13256R(parcel, i19);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G17);
                return new jgx(iM13243E2, strM13250L2);
            case 17:
                int iM13245G18 = jiy.m13245G(parcel);
                jcw[] jcwVarArr = null;
                jhc jhcVar = null;
                int iM13243E23 = 0;
                while (parcel.dataPosition() < iM13245G18) {
                    int i20 = parcel.readInt();
                    switch (jiy.m13241C(i20)) {
                        case 1:
                            bundleM13247I = jiy.m13247I(parcel, i20);
                            break;
                        case 2:
                            jcwVarArr = (jcw[]) jiy.m13260V(parcel, i20, jcw.CREATOR);
                            break;
                        case 3:
                            iM13243E23 = jiy.m13243E(parcel, i20);
                            break;
                        case 4:
                            jhcVar = (jhc) jiy.m13249K(parcel, i20, jhc.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i20);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G18);
                return new jhb(bundleM13247I, jcwVarArr, iM13243E23, jhcVar);
            case 18:
                int iM13245G19 = jiy.m13245G(parcel);
                jig jigVar = null;
                int[] iArrM13259U3 = null;
                int[] iArrM13259U4 = null;
                boolean zM13257S13 = false;
                boolean zM13257S14 = false;
                int iM13243E24 = 0;
                while (parcel.dataPosition() < iM13245G19) {
                    int i21 = parcel.readInt();
                    switch (jiy.m13241C(i21)) {
                        case 1:
                            jigVar = (jig) jiy.m13249K(parcel, i21, jig.CREATOR);
                            break;
                        case 2:
                            zM13257S13 = jiy.m13257S(parcel, i21);
                            break;
                        case 3:
                            zM13257S14 = jiy.m13257S(parcel, i21);
                            break;
                        case 4:
                            iArrM13259U3 = jiy.m13259U(parcel, i21);
                            break;
                        case 5:
                            iM13243E24 = jiy.m13243E(parcel, i21);
                            break;
                        case 6:
                            iArrM13259U4 = jiy.m13259U(parcel, i21);
                            break;
                        default:
                            jiy.m13256R(parcel, i21);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G19);
                return new jhc(jigVar, zM13257S13, zM13257S14, iArrM13259U3, iM13243E24, iArrM13259U4);
            case 19:
                int iM13245G20 = jiy.m13245G(parcel);
                Scope[] scopeArr = jhg.f34040a;
                String strM13250L14 = null;
                IBinder iBinderM13248J3 = null;
                Account account = null;
                String strM13250L15 = null;
                Bundle bundle = new Bundle();
                jcw[] jcwVarArr2 = jhg.f34041b;
                jcw[] jcwVarArr3 = jcwVarArr2;
                int iM13243E25 = 0;
                int iM13243E26 = 0;
                int iM13243E27 = 0;
                boolean zM13257S15 = false;
                int iM13243E28 = 0;
                boolean zM13257S16 = false;
                while (parcel.dataPosition() < iM13245G20) {
                    int i22 = parcel.readInt();
                    switch (jiy.m13241C(i22)) {
                        case 1:
                            iM13243E25 = jiy.m13243E(parcel, i22);
                            break;
                        case 2:
                            iM13243E26 = jiy.m13243E(parcel, i22);
                            break;
                        case 3:
                            iM13243E27 = jiy.m13243E(parcel, i22);
                            break;
                        case 4:
                            strM13250L14 = jiy.m13250L(parcel, i22);
                            break;
                        case 5:
                            iBinderM13248J3 = jiy.m13248J(parcel, i22);
                            break;
                        case 6:
                            scopeArr = (Scope[]) jiy.m13260V(parcel, i22, Scope.CREATOR);
                            break;
                        case 7:
                            bundle = jiy.m13247I(parcel, i22);
                            break;
                        case 8:
                            account = (Account) jiy.m13249K(parcel, i22, Account.CREATOR);
                            break;
                        case 9:
                        default:
                            jiy.m13256R(parcel, i22);
                            break;
                        case 10:
                            jcwVarArr2 = (jcw[]) jiy.m13260V(parcel, i22, jcw.CREATOR);
                            break;
                        case 11:
                            jcwVarArr3 = (jcw[]) jiy.m13260V(parcel, i22, jcw.CREATOR);
                            break;
                        case 12:
                            zM13257S15 = jiy.m13257S(parcel, i22);
                            break;
                        case 13:
                            iM13243E28 = jiy.m13243E(parcel, i22);
                            break;
                        case 14:
                            zM13257S16 = jiy.m13257S(parcel, i22);
                            break;
                        case 15:
                            strM13250L15 = jiy.m13250L(parcel, i22);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G20);
                return new jhg(iM13243E25, iM13243E26, iM13243E27, strM13250L14, iBinderM13248J3, scopeArr, bundle, account, jcwVarArr2, jcwVarArr3, zM13257S15, iM13243E28, zM13257S16, strM13250L15);
            default:
                int iM13245G21 = jiy.m13245G(parcel);
                String strM13250L16 = null;
                String strM13250L17 = null;
                long jM13246H2 = 0;
                long jM13246H3 = 0;
                int iM13243E29 = 0;
                int iM13243E30 = 0;
                int iM13243E31 = 0;
                int iM13243E32 = 0;
                int iM13243E33 = -1;
                while (parcel.dataPosition() < iM13245G21) {
                    int i23 = parcel.readInt();
                    switch (jiy.m13241C(i23)) {
                        case 1:
                            iM13243E29 = jiy.m13243E(parcel, i23);
                            break;
                        case 2:
                            iM13243E30 = jiy.m13243E(parcel, i23);
                            break;
                        case 3:
                            iM13243E31 = jiy.m13243E(parcel, i23);
                            break;
                        case 4:
                            jM13246H2 = jiy.m13246H(parcel, i23);
                            break;
                        case 5:
                            jM13246H3 = jiy.m13246H(parcel, i23);
                            break;
                        case 6:
                            strM13250L16 = jiy.m13250L(parcel, i23);
                            break;
                        case 7:
                            strM13250L17 = jiy.m13250L(parcel, i23);
                            break;
                        case 8:
                            iM13243E32 = jiy.m13243E(parcel, i23);
                            break;
                        case 9:
                            iM13243E33 = jiy.m13243E(parcel, i23);
                            break;
                        default:
                            jiy.m13256R(parcel, i23);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G21);
                return new jhx(iM13243E29, iM13243E30, iM13243E31, jM13246H2, jM13246H3, strM13250L16, strM13250L17, iM13243E32, iM13243E33);
        }
    }
}
