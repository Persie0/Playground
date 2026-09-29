package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0156a();

    /* JADX INFO: renamed from: a */
    public final int f395a;

    /* JADX INFO: renamed from: b */
    public final int f396b;

    /* JADX INFO: renamed from: c */
    public final int f397c;

    /* JADX INFO: renamed from: d */
    public final int f398d;

    /* JADX INFO: renamed from: e */
    public final int f399e;

    /* JADX INFO: renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C0156a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i10) {
            return new ParcelableVolumeInfo[i10];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f395a = parcel.readInt();
        this.f397c = parcel.readInt();
        this.f398d = parcel.readInt();
        this.f399e = parcel.readInt();
        this.f396b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f395a);
        parcel.writeInt(this.f397c);
        parcel.writeInt(this.f398d);
        parcel.writeInt(this.f399e);
        parcel.writeInt(this.f396b);
    }
}
