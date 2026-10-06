package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: cn */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0095cn implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(2);

    /* JADX INFO: renamed from: a */
    final String f6333a;

    /* JADX INFO: renamed from: b */
    final int f6334b;

    public C0095cn(Parcel parcel) {
        this.f6333a = parcel.readString();
        this.f6334b = parcel.readInt();
    }

    public C0095cn(String str, int i) {
        this.f6333a = str;
        this.f6334b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6333a);
        parcel.writeInt(this.f6334b);
    }
}
