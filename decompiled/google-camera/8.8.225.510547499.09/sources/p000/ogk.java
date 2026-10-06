package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogk extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(8);

    /* JADX INFO: renamed from: a */
    public float f45934a;

    /* JADX INFO: renamed from: b */
    public float f45935b;

    /* JADX INFO: renamed from: c */
    public float f45936c;

    public ogk() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45934a = parcel.readFloat();
        this.f45935b = parcel.readFloat();
        this.f45936c = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f45934a);
        parcel.writeFloat(this.f45935b);
        parcel.writeFloat(this.f45936c);
    }

    public ogk(Parcel parcel) {
        mo18475a(parcel);
    }
}
