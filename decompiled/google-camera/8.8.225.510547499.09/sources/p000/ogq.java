package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ogq extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(13);

    /* JADX INFO: renamed from: a */
    public int f45953a;

    /* JADX INFO: renamed from: b */
    public int f45954b;

    /* JADX INFO: renamed from: c */
    public float f45955c;

    /* JADX INFO: renamed from: f */
    public float f45956f;

    public ogq() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45953a = parcel.readInt();
        this.f45954b = parcel.readInt();
        this.f45955c = parcel.readFloat();
        this.f45956f = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f45953a);
        parcel.writeInt(this.f45954b);
        parcel.writeFloat(this.f45955c);
        parcel.writeFloat(this.f45956f);
    }

    public ogq(Parcel parcel) {
        mo18475a(parcel);
    }
}
