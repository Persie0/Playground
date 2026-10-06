package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogr extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(14);

    /* JADX INFO: renamed from: a */
    public int f45957a = 0;

    public ogr() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        int iDataPosition = parcel.dataPosition() + parcel.readInt();
        super.mo18475a(parcel);
        this.f45957a = parcel.readInt();
        parcel.setDataPosition(iDataPosition);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(20);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f45957a);
        if (parcel.dataPosition() - iDataPosition != 20) {
            throw new IllegalStateException("Parcelable implemented incorrectly, getByteSize() must return the correct size for each ControllerEvent subclass.");
        }
    }

    public ogr(Parcel parcel) {
        mo18475a(parcel);
    }
}
