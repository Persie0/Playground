package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogm extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(10);

    /* JADX INFO: renamed from: a */
    public float f45942a;

    /* JADX INFO: renamed from: b */
    public float f45943b;

    /* JADX INFO: renamed from: c */
    public float f45944c;

    /* JADX INFO: renamed from: f */
    public float f45945f;

    public ogm() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45942a = parcel.readFloat();
        this.f45943b = parcel.readFloat();
        this.f45944c = parcel.readFloat();
        this.f45945f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.f45942a);
        parcel.writeFloat(this.f45943b);
        parcel.writeFloat(this.f45944c);
        parcel.writeFloat(this.f45945f);
    }

    public ogm(Parcel parcel) {
        mo18475a(parcel);
    }
}
