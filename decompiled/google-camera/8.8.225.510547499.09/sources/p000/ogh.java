package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ogh implements Parcelable {

    /* JADX INFO: renamed from: d */
    public long f45911d;

    /* JADX INFO: renamed from: e */
    public int f45912e = 0;

    /* JADX INFO: renamed from: a */
    public void mo18475a(Parcel parcel) {
        this.f45911d = parcel.readLong();
        this.f45912e = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f45911d);
        parcel.writeInt(this.f45912e);
    }
}
