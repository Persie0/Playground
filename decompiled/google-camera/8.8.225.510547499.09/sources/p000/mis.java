package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mis extends ahx {
    public static final Parcelable.Creator CREATOR = new mgw(3);

    /* JADX INFO: renamed from: a */
    public boolean f40639a;

    public mis(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40639a = parcel.readInt() == 1;
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40639a ? 1 : 0);
    }

    public mis(Parcelable parcelable) {
        super(parcelable);
    }
}
