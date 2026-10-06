package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: np */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class C0857np extends ahx {
    public static final Parcelable.Creator CREATOR = new C0821mg(2);

    /* JADX INFO: renamed from: a */
    public int f44014a;

    /* JADX INFO: renamed from: b */
    public boolean f44015b;

    public C0857np(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f44014a = parcel.readInt();
        this.f44015b = parcel.readInt() != 0;
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f44014a);
        parcel.writeInt(this.f44015b ? 1 : 0);
    }

    public C0857np(Parcelable parcelable) {
        super(parcelable);
    }
}
