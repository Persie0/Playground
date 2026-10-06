package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aow extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(13);

    /* JADX INFO: renamed from: a */
    public boolean f1940a;

    public aow(Parcel parcel) {
        super(parcel);
        this.f1940a = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1940a ? 1 : 0);
    }

    public aow(Parcelable parcelable) {
        super(parcelable);
    }
}
