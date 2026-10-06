package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ani extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(7);

    /* JADX INFO: renamed from: a */
    public String f1832a;

    public ani(Parcel parcel) {
        super(parcel);
        this.f1832a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f1832a);
    }

    public ani(Parcelable parcelable) {
        super(parcelable);
    }
}
