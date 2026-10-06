package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogf extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(4);

    /* JADX INFO: renamed from: a */
    public int f45907a;

    /* JADX INFO: renamed from: b */
    public boolean f45908b;

    public ogf() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45907a = parcel.readInt();
        this.f45908b = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f45907a);
        parcel.writeInt(this.f45908b ? 1 : 0);
    }

    public ogf(Parcel parcel) {
        mo18475a(parcel);
    }
}
