package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;

/* JADX INFO: loaded from: classes2.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new hfb(27);

    /* JADX INFO: renamed from: a */
    public final int f952a;

    /* JADX INFO: renamed from: b */
    public final float f953b;

    public RatingCompat(int i, float f) {
        this.f952a = i;
        this.f953b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f952a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f952a);
        sb.append(" rating=");
        float f = this.f953b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f952a);
        parcel.writeFloat(this.f953b);
    }
}
