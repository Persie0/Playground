package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.barhopper.Barcode;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrq implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f39097a;

    public lrq(int i) {
        this.f39097a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ogj ogjVar;
        ogi ogiVar;
        switch (this.f39097a) {
            case 0:
                return new lrr(parcel);
            case 1:
                return new Barcode.WiFi(parcel);
            case 2:
                return new mhl(parcel);
            case 3:
                return new oge(parcel);
            case 4:
                return new ogf(parcel);
            case 5:
                return new ogg(parcel);
            case 6:
                synchronized (ogj.f45923k) {
                    ogjVar = ogj.f45922j.isEmpty() ? new ogj() : (ogj) ogj.f45922j.remove();
                    break;
                }
                ogjVar.mo18477b(parcel);
                return ogjVar;
            case 7:
                synchronized (ogi.f45914b) {
                    ogiVar = ogi.f45913a.isEmpty() ? new ogi() : (ogi) ogi.f45913a.remove();
                    break;
                }
                ogiVar.mo18477b(parcel);
                return ogiVar;
            case 8:
                return new ogk(parcel);
            case 9:
                return new ogl(parcel);
            case 10:
                return new ogm(parcel);
            case 11:
                return new ogn(parcel);
            case 12:
                return new ogo(parcel);
            case 13:
                return new ogq(parcel);
            default:
                return new ogr(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f39097a) {
            case 0:
                return new lrr[i];
            case 1:
                return new Barcode.WiFi[i];
            case 2:
                return new mhl[i];
            case 3:
                return new oge[i];
            case 4:
                return new ogf[i];
            case 5:
                return new ogg[i];
            case 6:
                return new ogj[i];
            case 7:
                return new ogi[i];
            case 8:
                return new ogk[i];
            case 9:
                return new ogl[i];
            case 10:
                return new ogm[i];
            case 11:
                return new ogn[i];
            case 12:
                return new ogo[i];
            case 13:
                return new ogq[i];
            default:
                return new ogr[i];
        }
    }
}
