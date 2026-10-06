package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: mh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0822mh extends ahx {
    public static final Parcelable.Creator CREATOR = new C0821mg(0);

    /* JADX INFO: renamed from: a */
    public Parcelable f40471a;

    public C0822mh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40471a = parcel.readParcelable(classLoader == null ? AbstractC0812ly.class.getClassLoader() : classLoader);
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f40471a, 0);
    }

    public C0822mh(Parcelable parcelable) {
        super(parcelable);
    }
}
