package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0050aw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(12);

    /* JADX INFO: renamed from: a */
    public final int f882a;

    /* JADX INFO: renamed from: b */
    public final int f883b;

    /* JADX INFO: renamed from: c */
    public final int f884c;

    /* JADX INFO: renamed from: d */
    public final int f885d;

    /* JADX INFO: renamed from: e */
    public final int f886e;

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f882a = parcel.readInt();
        this.f884c = parcel.readInt();
        this.f885d = parcel.readInt();
        this.f886e = parcel.readInt();
        this.f883b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f882a);
        parcel.writeInt(this.f884c);
        parcel.writeInt(this.f885d);
        parcel.writeInt(this.f886e);
        parcel.writeInt(this.f883b);
    }
}
