package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhf extends ahx {
    public static final Parcelable.Creator CREATOR = new mgw(2);

    /* JADX INFO: renamed from: a */
    public boolean f40489a;

    public mhf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            getClass().getClassLoader();
        }
        this.f40489a = parcel.readInt() == 1;
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f40489a ? 1 : 0);
    }

    public mhf(Parcelable parcelable) {
        super(parcelable);
    }
}
