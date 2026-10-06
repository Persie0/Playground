package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class anl extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(8);

    /* JADX INFO: renamed from: a */
    public String f1838a;

    public anl(Parcel parcel) {
        super(parcel);
        this.f1838a = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f1838a);
    }

    public anl(Parcelable parcelable) {
        super(parcelable);
    }
}
