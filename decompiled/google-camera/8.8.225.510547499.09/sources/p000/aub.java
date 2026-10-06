package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aub extends ahx {
    public static final Parcelable.Creator CREATOR = new C0821mg(5);

    /* JADX INFO: renamed from: a */
    public int f2402a;

    /* JADX INFO: renamed from: b */
    public Parcelable f2403b;

    /* JADX INFO: renamed from: e */
    public ClassLoader f2404e;

    public aub(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.f2402a = parcel.readInt();
        this.f2403b = parcel.readParcelable(classLoader);
        this.f2404e = classLoader;
    }

    public final String toString() {
        return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2402a + "}";
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2402a);
        parcel.writeParcelable(this.f2403b, i);
    }

    public aub(Parcelable parcelable) {
        super(parcelable);
    }
}
