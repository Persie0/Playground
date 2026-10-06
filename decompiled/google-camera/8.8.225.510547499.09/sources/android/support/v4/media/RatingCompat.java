package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C0050aw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(8);

    /* JADX INFO: renamed from: a */
    private final int f876a;

    /* JADX INFO: renamed from: b */
    private final float f877b;

    public RatingCompat(int i, float f) {
        this.f876a = i;
        this.f877b = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f876a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rating:style=");
        sb.append(this.f876a);
        sb.append(" rating=");
        float f = this.f877b;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f876a);
        parcel.writeFloat(this.f877b);
    }
}
