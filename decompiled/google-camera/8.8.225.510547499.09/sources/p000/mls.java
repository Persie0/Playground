package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mls extends ahx {
    public static final Parcelable.Creator CREATOR = new mgw(4);

    /* JADX INFO: renamed from: a */
    public final C1117xf f40999a;

    public mls(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f40999a = new C1117xf(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f40999a.put(strArr[i2], bundleArr[i2]);
        }
    }

    public final String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f40999a.toString() + "}";
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int i2 = this.f40999a.f48004d;
        parcel.writeInt(i2);
        String[] strArr = new String[i2];
        Bundle[] bundleArr = new Bundle[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = (String) this.f40999a.m19559d(i3);
            bundleArr[i3] = (Bundle) this.f40999a.m19560g(i3);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public mls(Parcelable parcelable) {
        super(parcelable);
        this.f40999a = new C1117xf();
    }
}
