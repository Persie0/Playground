package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p021j$.time.Instant;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class djp extends dkb {
    public static final Parcelable.Creator CREATOR = new C0870ob(16);

    public djp(long j, gyu gyuVar, mws mwsVar, String str, String str2, Instant instant, Instant instant2, Uri uri, boolean z, kbc kbcVar, int i) {
        super(j, gyuVar, mwsVar, str, str2, instant, instant2, uri, z, kbcVar, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11856b);
        parcel.writeParcelable(this.f11857c, i);
        parcel.writeList(this.f11858d);
        parcel.writeString(this.f11859e);
        parcel.writeString(this.f11860f);
        parcel.writeSerializable(this.f11861g);
        parcel.writeSerializable(this.f11862h);
        parcel.writeParcelable(this.f11863i, i);
        parcel.writeInt(this.f11864j ? 1 : 0);
        parcel.writeSerializable(this.f11865k);
        parcel.writeInt(this.f11866l);
    }
}
