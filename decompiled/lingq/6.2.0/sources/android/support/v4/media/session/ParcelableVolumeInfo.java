package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new hfb(24);

    /* JADX INFO: renamed from: a */
    public int f962a;

    /* JADX INFO: renamed from: b */
    public int f963b;

    /* JADX INFO: renamed from: c */
    public int f964c;

    /* JADX INFO: renamed from: d */
    public int f965d;

    /* JADX INFO: renamed from: e */
    public int f966e;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f962a);
        parcel.writeInt(this.f964c);
        parcel.writeInt(this.f965d);
        parcel.writeInt(this.f966e);
        parcel.writeInt(this.f963b);
    }
}
