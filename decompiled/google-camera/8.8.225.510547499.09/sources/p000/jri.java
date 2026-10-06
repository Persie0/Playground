package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.wearable.AppTheme;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jri implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34661a;

    public jri(int i) {
        this.f34661a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f34661a) {
            case 0:
                return new jrh[i];
            case 1:
                return new jrg[i];
            case 2:
                return new jrj[i];
            case 3:
                return new jrk[i];
            case 4:
                return new jrl[i];
            case 5:
                return new jrq[i];
            case 6:
                return new jrs[i];
            case 7:
                return new jrt[i];
            case 8:
                return new jru[i];
            case 9:
                return new jrv[i];
            case 10:
                return new jrw[i];
            case 11:
                return new jrx[i];
            case 12:
                return new jry[i];
            case 13:
                return new DataItemAssetParcelable[i];
            case 14:
                return new jsa[i];
            case 15:
                return new jsc[i];
            case 16:
                return new jsd[i];
            case 17:
                return new jse[i];
            case 18:
                return new jsf[i];
            case 19:
                return new jsg[i];
            default:
                return new jsh[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        byte bM13240B = 0;
        int iM13243E = 0;
        int iM13243E2 = 0;
        int iM13243E3 = 0;
        int iM13243E4 = 0;
        int iM13243E5 = 0;
        int iM13243E6 = 0;
        int iM13243E7 = 0;
        int iM13243E8 = 0;
        int iM13243E9 = 0;
        int iM13243E10 = 0;
        int iM13243E11 = 0;
        boolean zM13257S = false;
        int iM13243E12 = 0;
        ArrayList arrayListM13253O = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        jrq jrqVar = null;
        AppTheme appTheme = null;
        ArrayList arrayListM13253O2 = null;
        Uri uri = null;
        String strM13250L = null;
        String strM13250L2 = null;
        String strM13250L3 = null;
        String strM13250L4 = null;
        ArrayList arrayListM13252N = null;
        switch (this.f34661a) {
            case 0:
                int iM13245G = jiy.m13245G(parcel);
                String strM13250L5 = null;
                String strM13250L6 = null;
                String strM13250L7 = null;
                String strM13250L8 = null;
                String strM13250L9 = null;
                String strM13250L10 = null;
                String strM13250L11 = null;
                int iM13243E13 = 0;
                byte bM13240B2 = 0;
                byte bM13240B3 = 0;
                byte bM13240B4 = 0;
                byte bM13240B5 = 0;
                while (parcel.dataPosition() < iM13245G) {
                    int i = parcel.readInt();
                    switch (jiy.m13241C(i)) {
                        case 2:
                            iM13243E13 = jiy.m13243E(parcel, i);
                            break;
                        case 3:
                            strM13250L5 = jiy.m13250L(parcel, i);
                            break;
                        case 4:
                            strM13250L6 = jiy.m13250L(parcel, i);
                            break;
                        case 5:
                            strM13250L7 = jiy.m13250L(parcel, i);
                            break;
                        case 6:
                            strM13250L8 = jiy.m13250L(parcel, i);
                            break;
                        case 7:
                            strM13250L9 = jiy.m13250L(parcel, i);
                            break;
                        case 8:
                            strM13250L10 = jiy.m13250L(parcel, i);
                            break;
                        case 9:
                            bM13240B2 = jiy.m13240B(parcel, i);
                            break;
                        case 10:
                            bM13240B3 = jiy.m13240B(parcel, i);
                            break;
                        case 11:
                            bM13240B4 = jiy.m13240B(parcel, i);
                            break;
                        case 12:
                            bM13240B5 = jiy.m13240B(parcel, i);
                            break;
                        case 13:
                            strM13250L11 = jiy.m13250L(parcel, i);
                            break;
                        default:
                            jiy.m13256R(parcel, i);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new jrh(iM13243E13, strM13250L5, strM13250L6, strM13250L7, strM13250L8, strM13250L9, strM13250L10, bM13240B2, bM13240B3, bM13240B4, bM13240B5, strM13250L11);
            case 1:
                int iM13245G2 = jiy.m13245G(parcel);
                String strM13250L12 = null;
                byte bM13240B6 = 0;
                while (parcel.dataPosition() < iM13245G2) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 2:
                            bM13240B = jiy.m13240B(parcel, i2);
                            break;
                        case 3:
                            bM13240B6 = jiy.m13240B(parcel, i2);
                            break;
                        case 4:
                            strM13250L12 = jiy.m13250L(parcel, i2);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new jrg(bM13240B, bM13240B6, strM13250L12);
            case 2:
                int iM13245G3 = jiy.m13245G(parcel);
                String strM13250L13 = null;
                String strM13250L14 = null;
                jui juiVar = null;
                String strM13250L15 = null;
                String strM13250L16 = null;
                Float fValueOf = null;
                jrl jrlVar = null;
                while (parcel.dataPosition() < iM13245G3) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 1:
                            strM13250L13 = jiy.m13250L(parcel, i3);
                            break;
                        case 2:
                            strM13250L14 = jiy.m13250L(parcel, i3);
                            break;
                        case 3:
                            juiVar = (jui) jiy.m13249K(parcel, i3, jui.CREATOR);
                            break;
                        case 4:
                            strM13250L15 = jiy.m13250L(parcel, i3);
                            break;
                        case 5:
                            strM13250L16 = jiy.m13250L(parcel, i3);
                            break;
                        case 6:
                            int iM13244F = jiy.m13244F(parcel, i3);
                            if (iM13244F != 0) {
                                jiy.m13263Y(parcel, iM13244F);
                                fValueOf = Float.valueOf(parcel.readFloat());
                            } else {
                                fValueOf = null;
                            }
                            break;
                        case 7:
                            jrlVar = (jrl) jiy.m13249K(parcel, i3, jrl.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new jrj(strM13250L13, strM13250L14, juiVar, strM13250L15, strM13250L16, fValueOf, jrlVar);
            case 3:
                int iM13245G4 = jiy.m13245G(parcel);
                jui juiVar2 = null;
                while (parcel.dataPosition() < iM13245G4) {
                    int i4 = parcel.readInt();
                    switch (jiy.m13241C(i4)) {
                        case 1:
                            iM13243E12 = jiy.m13243E(parcel, i4);
                            break;
                        case 2:
                            arrayListM13253O = jiy.m13253O(parcel, i4, jrj.CREATOR);
                            break;
                        case 3:
                            juiVar2 = (jui) jiy.m13249K(parcel, i4, jui.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i4);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G4);
                return new jrk(iM13243E12, arrayListM13253O, juiVar2);
            case 4:
                int iM13245G5 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G5) {
                    int i5 = parcel.readInt();
                    switch (jiy.m13241C(i5)) {
                        case 1:
                            zM13257S = jiy.m13257S(parcel, i5);
                            break;
                        case 2:
                            arrayListM13252N = jiy.m13252N(parcel, i5);
                            break;
                        default:
                            jiy.m13256R(parcel, i5);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G5);
                return new jrl(zM13257S, arrayListM13252N);
            case 5:
                int iM13245G6 = jiy.m13245G(parcel);
                ArrayList arrayListM13253O3 = null;
                while (parcel.dataPosition() < iM13245G6) {
                    int i6 = parcel.readInt();
                    switch (jiy.m13241C(i6)) {
                        case 2:
                            strM13250L4 = jiy.m13250L(parcel, i6);
                            break;
                        case 3:
                            arrayListM13253O3 = jiy.m13253O(parcel, i6, jtn.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i6);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G6);
                return new jrq(strM13250L4, arrayListM13253O3);
            case 6:
                int iM13245G7 = jiy.m13245G(parcel);
                jrt jrtVar = null;
                int iM13243E14 = 0;
                int iM13243E15 = 0;
                while (parcel.dataPosition() < iM13245G7) {
                    int i7 = parcel.readInt();
                    switch (jiy.m13241C(i7)) {
                        case 2:
                            jrtVar = (jrt) jiy.m13249K(parcel, i7, jrt.CREATOR);
                            break;
                        case 3:
                            iM13243E11 = jiy.m13243E(parcel, i7);
                            break;
                        case 4:
                            iM13243E14 = jiy.m13243E(parcel, i7);
                            break;
                        case 5:
                            iM13243E15 = jiy.m13243E(parcel, i7);
                            break;
                        default:
                            jiy.m13256R(parcel, i7);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G7);
                return new jrs(jrtVar, iM13243E11, iM13243E14, iM13243E15);
            case 7:
                int iM13245G8 = jiy.m13245G(parcel);
                String strM13250L17 = null;
                String strM13250L18 = null;
                while (parcel.dataPosition() < iM13245G8) {
                    int i8 = parcel.readInt();
                    switch (jiy.m13241C(i8)) {
                        case 2:
                            strM13250L3 = jiy.m13250L(parcel, i8);
                            break;
                        case 3:
                            strM13250L17 = jiy.m13250L(parcel, i8);
                            break;
                        case 4:
                            strM13250L18 = jiy.m13250L(parcel, i8);
                            break;
                        default:
                            jiy.m13256R(parcel, i8);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G8);
                return new jrt(strM13250L3, strM13250L17, strM13250L18);
            case 8:
                int iM13245G9 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G9) {
                    int i9 = parcel.readInt();
                    switch (jiy.m13241C(i9)) {
                        case 2:
                            iM13243E10 = jiy.m13243E(parcel, i9);
                            break;
                        default:
                            jiy.m13256R(parcel, i9);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G9);
                return new jru(iM13243E10);
            case 9:
                int iM13245G10 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G10) {
                    int i10 = parcel.readInt();
                    switch (jiy.m13241C(i10)) {
                        case 2:
                            iM13243E9 = jiy.m13243E(parcel, i10);
                            break;
                        default:
                            jiy.m13256R(parcel, i10);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G10);
                return new jrv(iM13243E9);
            case 10:
                int iM13245G11 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G11) {
                    int i11 = parcel.readInt();
                    switch (jiy.m13241C(i11)) {
                        case 2:
                            iM13243E8 = jiy.m13243E(parcel, i11);
                            break;
                        default:
                            jiy.m13256R(parcel, i11);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G11);
                return new jrw(iM13243E8);
            case 11:
                int iM13245G12 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G12) {
                    int i12 = parcel.readInt();
                    switch (jiy.m13241C(i12)) {
                        case 1:
                            iM13243E7 = jiy.m13243E(parcel, i12);
                            break;
                        case 2:
                            strM13250L2 = jiy.m13250L(parcel, i12);
                            break;
                        default:
                            jiy.m13256R(parcel, i12);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G12);
                return new jrx(iM13243E7, strM13250L2);
            case 12:
                int iM13245G13 = jiy.m13245G(parcel);
                int iM13243E16 = 0;
                boolean zM13257S2 = false;
                boolean zM13257S3 = false;
                boolean zM13257S4 = false;
                boolean zM13257S5 = false;
                while (parcel.dataPosition() < iM13245G13) {
                    int i13 = parcel.readInt();
                    switch (jiy.m13241C(i13)) {
                        case 1:
                            iM13243E16 = jiy.m13243E(parcel, i13);
                            break;
                        case 2:
                            zM13257S2 = jiy.m13257S(parcel, i13);
                            break;
                        case 3:
                            zM13257S3 = jiy.m13257S(parcel, i13);
                            break;
                        case 4:
                            zM13257S4 = jiy.m13257S(parcel, i13);
                            break;
                        case 5:
                            zM13257S5 = jiy.m13257S(parcel, i13);
                            break;
                        default:
                            jiy.m13256R(parcel, i13);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G13);
                return new jry(iM13243E16, zM13257S2, zM13257S3, zM13257S4, zM13257S5);
            case 13:
                int iM13245G14 = jiy.m13245G(parcel);
                String strM13250L19 = null;
                while (parcel.dataPosition() < iM13245G14) {
                    int i14 = parcel.readInt();
                    switch (jiy.m13241C(i14)) {
                        case 2:
                            strM13250L = jiy.m13250L(parcel, i14);
                            break;
                        case 3:
                            strM13250L19 = jiy.m13250L(parcel, i14);
                            break;
                        default:
                            jiy.m13256R(parcel, i14);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G14);
                return new DataItemAssetParcelable(strM13250L, strM13250L19);
            case 14:
                int iM13245G15 = jiy.m13245G(parcel);
                Bundle bundleM13247I = null;
                byte[] bArrM13258T = null;
                while (parcel.dataPosition() < iM13245G15) {
                    int i15 = parcel.readInt();
                    switch (jiy.m13241C(i15)) {
                        case 2:
                            uri = (Uri) jiy.m13249K(parcel, i15, Uri.CREATOR);
                            break;
                        case 3:
                        default:
                            jiy.m13256R(parcel, i15);
                            break;
                        case 4:
                            bundleM13247I = jiy.m13247I(parcel, i15);
                            break;
                        case 5:
                            bArrM13258T = jiy.m13258T(parcel, i15);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G15);
                return new jsa(uri, bundleM13247I, bArrM13258T);
            case 15:
                int iM13245G16 = jiy.m13245G(parcel);
                int iM13243E17 = 0;
                while (parcel.dataPosition() < iM13245G16) {
                    int i16 = parcel.readInt();
                    switch (jiy.m13241C(i16)) {
                        case 2:
                            iM13243E6 = jiy.m13243E(parcel, i16);
                            break;
                        case 3:
                            iM13243E17 = jiy.m13243E(parcel, i16);
                            break;
                        default:
                            jiy.m13256R(parcel, i16);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G16);
                return new jsc(iM13243E6, iM13243E17);
            case 16:
                int iM13245G17 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G17) {
                    int i17 = parcel.readInt();
                    switch (jiy.m13241C(i17)) {
                        case 2:
                            iM13243E5 = jiy.m13243E(parcel, i17);
                            break;
                        case 3:
                            arrayListM13253O2 = jiy.m13253O(parcel, i17, jrq.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i17);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G17);
                return new jsd(iM13243E5, arrayListM13253O2);
            case 17:
                int iM13245G18 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G18) {
                    int i18 = parcel.readInt();
                    switch (jiy.m13241C(i18)) {
                        case 2:
                            iM13243E4 = jiy.m13243E(parcel, i18);
                            break;
                        case 3:
                            appTheme = (AppTheme) jiy.m13249K(parcel, i18, AppTheme.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i18);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G18);
                return new jse(iM13243E4, appTheme);
            case 18:
                int iM13245G19 = jiy.m13245G(parcel);
                boolean zM13257S6 = false;
                while (parcel.dataPosition() < iM13245G19) {
                    int i19 = parcel.readInt();
                    switch (jiy.m13241C(i19)) {
                        case 1:
                            iM13243E3 = jiy.m13243E(parcel, i19);
                            break;
                        case 2:
                            zM13257S6 = jiy.m13257S(parcel, i19);
                            break;
                        default:
                            jiy.m13256R(parcel, i19);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G19);
                return new jsf(iM13243E3, zM13257S6);
            case 19:
                int iM13245G20 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G20) {
                    int i20 = parcel.readInt();
                    switch (jiy.m13241C(i20)) {
                        case 2:
                            iM13243E2 = jiy.m13243E(parcel, i20);
                            break;
                        case 3:
                            jrqVar = (jrq) jiy.m13249K(parcel, i20, jrq.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i20);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G20);
                return new jsg(iM13243E2, jrqVar);
            default:
                int iM13245G21 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G21) {
                    int i21 = parcel.readInt();
                    switch (jiy.m13241C(i21)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i21);
                            break;
                        case 3:
                            parcelFileDescriptor = (ParcelFileDescriptor) jiy.m13249K(parcel, i21, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i21);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G21);
                return new jsh(iM13243E, parcelFileDescriptor);
        }
    }
}
