package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aog extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(11);

    /* JADX INFO: renamed from: a */
    public final int f1887a;

    public aog(Parcel parcel) {
        super(parcel);
        this.f1887a = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1887a);
    }

    public aog(Parcelable parcelable, int i) {
        super(parcelable);
        this.f1887a = i;
    }
}
