package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.ConnectionConfiguration;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsj implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34724a;

    public jsj(int i) {
        this.f34724a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f34724a) {
            case 0:
                return new jsk[i];
            case 1:
                return new jsi[i];
            case 2:
                return new jsl[i];
            case 3:
                return new jsm[i];
            case 4:
                return new jsn[i];
            case 5:
                return new jso[i];
            case 6:
                return new jsp[i];
            case 7:
                return new jsq[i];
            case 8:
                return new jsr[i];
            case 9:
                return new jss[i];
            case 10:
                return new jst[i];
            case 11:
                return new jsu[i];
            case 12:
                return new jsv[i];
            case 13:
                return new jsw[i];
            case 14:
                return new jui[i];
            case 15:
                return new jtk[i];
            case 16:
                return new jtm[i];
            case 17:
                return new jtn[i];
            case 18:
                return new jto[i];
            case 19:
                return new jtp[i];
            default:
                return new jtq[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        String strM13250L = null;
        String strM13250L2 = null;
        jrt jrtVar = null;
        String strM13250L3 = null;
        String strM13250L4 = null;
        String strM13250L5 = null;
        String strM13250L6 = null;
        String strM13250L7 = null;
        jtn jtnVar = null;
        ParcelFileDescriptor parcelFileDescriptor2 = null;
        String strM13250L8 = null;
        jsa jsaVar = null;
        ArrayList arrayListM13253O = null;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        ConnectionConfiguration connectionConfiguration = null;
        String strM13250L9 = null;
        int iM13243E = 0;
        switch (this.f34724a) {
            case 0:
                int iM13245G = jiy.m13245G(parcel);
                boolean zM13257S = false;
                while (parcel.dataPosition() < iM13245G) {
                    int i = parcel.readInt();
                    switch (jiy.m13241C(i)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i);
                            break;
                        case 3:
                            zM13257S = jiy.m13257S(parcel, i);
                            break;
                        default:
                            jiy.m13256R(parcel, i);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new jsk(iM13243E, zM13257S);
            case 1:
                int iM13245G2 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G2) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i2);
                            break;
                        case 3:
                            parcelFileDescriptor = (ParcelFileDescriptor) jiy.m13249K(parcel, i2, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new jsi(iM13243E, parcelFileDescriptor);
            case 2:
                int iM13245G3 = jiy.m13245G(parcel);
                boolean zM13257S2 = false;
                boolean zM13257S3 = false;
                while (parcel.dataPosition() < iM13245G3) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i3);
                            break;
                        case 3:
                            zM13257S2 = jiy.m13257S(parcel, i3);
                            break;
                        case 4:
                            zM13257S3 = jiy.m13257S(parcel, i3);
                            break;
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new jsl(iM13243E, zM13257S2, zM13257S3);
            case 3:
                int iM13245G4 = jiy.m13245G(parcel);
                boolean zM13257S4 = false;
                while (parcel.dataPosition() < iM13245G4) {
                    int i4 = parcel.readInt();
                    switch (jiy.m13241C(i4)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i4);
                            break;
                        case 3:
                            zM13257S4 = jiy.m13257S(parcel, i4);
                            break;
                        default:
                            jiy.m13256R(parcel, i4);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G4);
                return new jsm(iM13243E, zM13257S4);
            case 4:
                int iM13245G5 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G5) {
                    int i5 = parcel.readInt();
                    switch (jiy.m13241C(i5)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i5);
                            break;
                        case 3:
                            strM13250L9 = jiy.m13250L(parcel, i5);
                            break;
                        default:
                            jiy.m13256R(parcel, i5);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G5);
                return new jsn(iM13243E, strM13250L9);
            case 5:
                int iM13245G6 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G6) {
                    int i6 = parcel.readInt();
                    switch (jiy.m13241C(i6)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i6);
                            break;
                        case 3:
                            connectionConfiguration = (ConnectionConfiguration) jiy.m13249K(parcel, i6, ConnectionConfiguration.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i6);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G6);
                return new jso(iM13243E, connectionConfiguration);
            case 6:
                int iM13245G7 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G7) {
                    int i7 = parcel.readInt();
                    switch (jiy.m13241C(i7)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i7);
                            break;
                        case 3:
                            connectionConfigurationArr = (ConnectionConfiguration[]) jiy.m13260V(parcel, i7, ConnectionConfiguration.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i7);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G7);
                return new jsp(iM13243E, connectionConfigurationArr);
            case 7:
                int iM13245G8 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G8) {
                    int i8 = parcel.readInt();
                    switch (jiy.m13241C(i8)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i8);
                            break;
                        case 3:
                            arrayListM13253O = jiy.m13253O(parcel, i8, jtn.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i8);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G8);
                return new jsq(iM13243E, arrayListM13253O);
            case 8:
                int iM13245G9 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G9) {
                    int i9 = parcel.readInt();
                    switch (jiy.m13241C(i9)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i9);
                            break;
                        case 3:
                            jsaVar = (jsa) jiy.m13249K(parcel, i9, jsa.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i9);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G9);
                return new jsr(iM13243E, jsaVar);
            case 9:
                int iM13245G10 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G10) {
                    int i10 = parcel.readInt();
                    switch (jiy.m13241C(i10)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i10);
                            break;
                        case 3:
                            strM13250L8 = jiy.m13250L(parcel, i10);
                            break;
                        default:
                            jiy.m13256R(parcel, i10);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G10);
                return new jss(iM13243E, strM13250L8);
            case 10:
                int iM13245G11 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G11) {
                    int i11 = parcel.readInt();
                    switch (jiy.m13241C(i11)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i11);
                            break;
                        case 3:
                            parcelFileDescriptor2 = (ParcelFileDescriptor) jiy.m13249K(parcel, i11, ParcelFileDescriptor.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i11);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G11);
                return new jst(iM13243E, parcelFileDescriptor2);
            case 11:
                int iM13245G12 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G12) {
                    int i12 = parcel.readInt();
                    switch (jiy.m13241C(i12)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i12);
                            break;
                        case 3:
                            jtnVar = (jtn) jiy.m13249K(parcel, i12, jtn.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i12);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G12);
                return new jsu(iM13243E, jtnVar);
            case 12:
                int iM13245G13 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G13) {
                    int i13 = parcel.readInt();
                    switch (jiy.m13241C(i13)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i13);
                            break;
                        case 3:
                            strM13250L7 = jiy.m13250L(parcel, i13);
                            break;
                        default:
                            jiy.m13256R(parcel, i13);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G13);
                return new jsv(iM13243E, strM13250L7);
            case 13:
                int iM13245G14 = jiy.m13245G(parcel);
                boolean zM13257S5 = false;
                while (parcel.dataPosition() < iM13245G14) {
                    int i14 = parcel.readInt();
                    switch (jiy.m13241C(i14)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i14);
                            break;
                        case 2:
                            zM13257S5 = jiy.m13257S(parcel, i14);
                            break;
                        default:
                            jiy.m13256R(parcel, i14);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G14);
                return new jsw(iM13243E, zM13257S5);
            case 14:
                int iM13245G15 = jiy.m13245G(parcel);
                int iM13243E2 = 0;
                while (parcel.dataPosition() < iM13245G15) {
                    int i15 = parcel.readInt();
                    switch (jiy.m13241C(i15)) {
                        case 1:
                            strM13250L6 = jiy.m13250L(parcel, i15);
                            break;
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i15);
                            break;
                        case 3:
                            iM13243E2 = jiy.m13243E(parcel, i15);
                            break;
                        default:
                            jiy.m13256R(parcel, i15);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G15);
                return new jui(strM13250L6, iM13243E, iM13243E2);
            case 15:
                int iM13245G16 = jiy.m13245G(parcel);
                byte[] bArrM13258T = null;
                String strM13250L10 = null;
                int iM13243E3 = 0;
                while (parcel.dataPosition() < iM13245G16) {
                    int i16 = parcel.readInt();
                    switch (jiy.m13241C(i16)) {
                        case 2:
                            iM13243E3 = jiy.m13243E(parcel, i16);
                            break;
                        case 3:
                            strM13250L5 = jiy.m13250L(parcel, i16);
                            break;
                        case 4:
                            bArrM13258T = jiy.m13258T(parcel, i16);
                            break;
                        case 5:
                            strM13250L10 = jiy.m13250L(parcel, i16);
                            break;
                        default:
                            jiy.m13256R(parcel, i16);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G16);
                return new jtk(iM13243E3, strM13250L5, bArrM13258T, strM13250L10);
            case 16:
                int iM13245G17 = jiy.m13245G(parcel);
                DataHolder dataHolder = null;
                while (parcel.dataPosition() < iM13245G17) {
                    int i17 = parcel.readInt();
                    switch (jiy.m13241C(i17)) {
                        case 1:
                            strM13250L4 = jiy.m13250L(parcel, i17);
                            break;
                        case 2:
                            dataHolder = (DataHolder) jiy.m13249K(parcel, i17, DataHolder.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i17);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G17);
                return new jtm(strM13250L4, dataHolder);
            case 17:
                int iM13245G18 = jiy.m13245G(parcel);
                String strM13250L11 = null;
                int iM13243E4 = 0;
                boolean zM13257S6 = false;
                while (parcel.dataPosition() < iM13245G18) {
                    int i18 = parcel.readInt();
                    switch (jiy.m13241C(i18)) {
                        case 2:
                            strM13250L3 = jiy.m13250L(parcel, i18);
                            break;
                        case 3:
                            strM13250L11 = jiy.m13250L(parcel, i18);
                            break;
                        case 4:
                            iM13243E4 = jiy.m13243E(parcel, i18);
                            break;
                        case 5:
                            zM13257S6 = jiy.m13257S(parcel, i18);
                            break;
                        default:
                            jiy.m13256R(parcel, i18);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G18);
                return new jtn(strM13250L3, strM13250L11, iM13243E4, zM13257S6);
            case 18:
                int iM13245G19 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G19) {
                    int i19 = parcel.readInt();
                    switch (jiy.m13241C(i19)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i19);
                            break;
                        case 3:
                            jrtVar = (jrt) jiy.m13249K(parcel, i19, jrt.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i19);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G19);
                return new jto(iM13243E, jrtVar);
            case 19:
                int iM13245G20 = jiy.m13245G(parcel);
                long jM13246H = 0;
                String strM13250L12 = null;
                while (parcel.dataPosition() < iM13245G20) {
                    int i20 = parcel.readInt();
                    switch (jiy.m13241C(i20)) {
                        case 2:
                            strM13250L2 = jiy.m13250L(parcel, i20);
                            break;
                        case 3:
                            strM13250L12 = jiy.m13250L(parcel, i20);
                            break;
                        case 4:
                            jM13246H = jiy.m13246H(parcel, i20);
                            break;
                        default:
                            jiy.m13256R(parcel, i20);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G20);
                return new jtp(strM13250L2, strM13250L12, jM13246H);
            default:
                int iM13245G21 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G21) {
                    int i21 = parcel.readInt();
                    switch (jiy.m13241C(i21)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i21);
                            break;
                        case 3:
                            strM13250L = jiy.m13250L(parcel, i21);
                            break;
                        default:
                            jiy.m13256R(parcel, i21);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G21);
                return new jtq(iM13243E, strM13250L);
        }
    }
}
