package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrr implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new lrq(0);

    /* JADX INFO: renamed from: a */
    public final String f39098a;

    /* JADX INFO: renamed from: b */
    public final long f39099b;

    /* JADX INFO: renamed from: c */
    public final int f39100c;

    /* JADX INFO: renamed from: d */
    public final String f39101d;

    public lrr(Parcel parcel) {
        this.f39098a = parcel.readString();
        this.f39099b = parcel.readLong();
        this.f39100c = parcel.readInt();
        this.f39101d = parcel.readString();
    }

    public lrr(String str, long j, int i) {
        this.f39098a = str;
        this.f39099b = j;
        this.f39100c = i;
        this.f39101d = "";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f39098a.compareTo(((lrr) obj).f39098a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lrr) {
            return this.f39098a.equals(((lrr) obj).f39098a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f39098a.hashCode();
    }

    public final String toString() {
        return this.f39098a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f39098a);
        parcel.writeLong(this.f39099b);
        parcel.writeInt(this.f39100c);
        parcel.writeString(this.f39101d);
    }
}
