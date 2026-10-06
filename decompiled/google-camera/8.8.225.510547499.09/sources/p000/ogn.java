package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogn extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(11);

    /* JADX INFO: renamed from: a */
    public float f45946a;

    /* JADX INFO: renamed from: b */
    public float f45947b;

    /* JADX INFO: renamed from: c */
    public float f45948c;

    public ogn() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45946a = parcel.readFloat();
        this.f45947b = parcel.readFloat();
        this.f45948c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f45946a);
        parcel.writeFloat(this.f45947b);
        parcel.writeFloat(this.f45948c);
    }

    public ogn(Parcel parcel) {
        mo18475a(parcel);
    }
}
