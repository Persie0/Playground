package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtt implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f34798a;

    public jtt(int i) {
        this.f34798a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f34798a) {
            case 0:
                return new jts[i];
            case 1:
                return new jtr[i];
            case 2:
                return new jtu[i];
            case 3:
                return new jtv[i];
            case 4:
                return new jtw[i];
            case 5:
                return new jtx[i];
            case 6:
                return new jty[i];
            case 7:
                return new Barcode[i];
            case 8:
                return new Barcode.Address[i];
            case 9:
                return new Barcode.BoardingPass[i];
            case 10:
                return new Barcode.CalendarDateTime[i];
            case 11:
                return new Barcode.CalendarEvent[i];
            case 12:
                return new Barcode.ContactInfo[i];
            case 13:
                return new Barcode.DriverLicense[i];
            case 14:
                return new Barcode.Email[i];
            case 15:
                return new Barcode.FlightSegment[i];
            case 16:
                return new Barcode.GeoPoint[i];
            case 17:
                return new Barcode.PersonName[i];
            case 18:
                return new Barcode.Phone[i];
            case 19:
                return new Barcode.Sms[i];
            default:
                return new Barcode.UrlBookmark[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iM13243E = 0;
        IBinder iBinderM13248J = null;
        ArrayList arrayListM13253O = null;
        String strM13250L = null;
        jsa jsaVar = null;
        switch (this.f34798a) {
            case 0:
                int iM13245G = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G) {
                    int i = parcel.readInt();
                    switch (jiy.m13241C(i)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i);
                            break;
                        case 2:
                            iBinderM13248J = jiy.m13248J(parcel, i);
                            break;
                        default:
                            jiy.m13256R(parcel, i);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G);
                return new jts(iM13243E, iBinderM13248J);
            case 1:
                int iM13245G2 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G2) {
                    int i2 = parcel.readInt();
                    switch (jiy.m13241C(i2)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i2);
                            break;
                        case 3:
                            jsaVar = (jsa) jiy.m13249K(parcel, i2, jsa.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i2);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G2);
                return new jtr(iM13243E, jsaVar);
            case 2:
                int iM13245G3 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G3) {
                    int i3 = parcel.readInt();
                    switch (jiy.m13241C(i3)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i3);
                            break;
                        default:
                            jiy.m13256R(parcel, i3);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G3);
                return new jtu(iM13243E);
            case 3:
                int iM13245G4 = jiy.m13245G(parcel);
                while (parcel.dataPosition() < iM13245G4) {
                    int i4 = parcel.readInt();
                    switch (jiy.m13241C(i4)) {
                        case 1:
                            strM13250L = jiy.m13250L(parcel, i4);
                            break;
                        default:
                            jiy.m13256R(parcel, i4);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G4);
                return new jtv(strM13250L);
            case 4:
                int iM13245G5 = jiy.m13245G(parcel);
                byte[] bArrM13258T = null;
                int iM13243E2 = 0;
                while (parcel.dataPosition() < iM13245G5) {
                    int i5 = parcel.readInt();
                    switch (jiy.m13241C(i5)) {
                        case 1:
                            iM13243E = jiy.m13243E(parcel, i5);
                            break;
                        case 2:
                            iM13243E2 = jiy.m13243E(parcel, i5);
                            break;
                        case 3:
                            bArrM13258T = jiy.m13258T(parcel, i5);
                            break;
                        default:
                            jiy.m13256R(parcel, i5);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G5);
                return new jtw(iM13243E, iM13243E2, bArrM13258T);
            case 5:
                int iM13245G6 = jiy.m13245G(parcel);
                int iM13243E3 = 0;
                while (parcel.dataPosition() < iM13245G6) {
                    int i6 = parcel.readInt();
                    switch (jiy.m13241C(i6)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i6);
                            break;
                        case 3:
                            iM13243E3 = jiy.m13243E(parcel, i6);
                            break;
                        default:
                            jiy.m13256R(parcel, i6);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G6);
                return new jtx(iM13243E, iM13243E3);
            case 6:
                int iM13245G7 = jiy.m13245G(parcel);
                long jM13246H = 0;
                while (parcel.dataPosition() < iM13245G7) {
                    int i7 = parcel.readInt();
                    switch (jiy.m13241C(i7)) {
                        case 2:
                            iM13243E = jiy.m13243E(parcel, i7);
                            break;
                        case 3:
                            jM13246H = jiy.m13246H(parcel, i7);
                            break;
                        case 4:
                            arrayListM13253O = jiy.m13253O(parcel, i7, jtp.CREATOR);
                            break;
                        default:
                            jiy.m13256R(parcel, i7);
                            break;
                    }
                }
                jiy.m13254P(parcel, iM13245G7);
                return new jty(iM13243E, jM13246H, arrayListM13253O);
            case 7:
                return new Barcode(parcel);
            case 8:
                return new Barcode.Address(parcel);
            case 9:
                return new Barcode.BoardingPass(parcel);
            case 10:
                return new Barcode.CalendarDateTime(parcel);
            case 11:
                return new Barcode.CalendarEvent(parcel);
            case 12:
                return new Barcode.ContactInfo(parcel);
            case 13:
                return new Barcode.DriverLicense(parcel);
            case 14:
                return new Barcode.Email(parcel);
            case 15:
                return new Barcode.FlightSegment(parcel);
            case 16:
                return new Barcode.GeoPoint(parcel);
            case 17:
                return new Barcode.PersonName(parcel);
            case 18:
                return new Barcode.Phone(parcel);
            case 19:
                return new Barcode.Sms(parcel);
            default:
                return new Barcode.UrlBookmark(parcel);
        }
    }
}
