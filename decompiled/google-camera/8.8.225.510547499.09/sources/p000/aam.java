package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aam extends ahx {
    public static final Parcelable.Creator CREATOR = new C0821mg(3);

    /* JADX INFO: renamed from: a */
    public SparseArray f31a;

    public aam(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f31a = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f31a.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f31a;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f31a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f31a.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }

    public aam(Parcelable parcelable) {
        super(parcelable);
    }
}
