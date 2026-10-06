package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class iva implements Parcelable {
    public static final Parcelable.Creator CREATOR = new iuz();

    /* JADX INFO: renamed from: a */
    public final Parcelable f32252a;

    public iva(Parcelable parcelable) {
        String name = parcelable.getClass().getName();
        if (!name.startsWith("android.os.") && !name.equals("android.content.Intent") && !name.equals("android.app.PendingIntent")) {
            throw new IllegalArgumentException("Only Android system classes can be passed in SystemParcelableWrapper.");
        }
        this.f32252a = parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f32252a, i);
    }
}
