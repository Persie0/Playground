package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: la */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0788la implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(17);

    /* JADX INFO: renamed from: a */
    public int f37798a;

    /* JADX INFO: renamed from: b */
    public int f37799b;

    /* JADX INFO: renamed from: c */
    public boolean f37800c;

    public C0788la() {
    }

    public C0788la(Parcel parcel) {
        this.f37798a = parcel.readInt();
        this.f37799b = parcel.readInt();
        this.f37800c = parcel.readInt() == 1;
    }

    public C0788la(C0788la c0788la) {
        this.f37798a = c0788la.f37798a;
        this.f37799b = c0788la.f37799b;
        this.f37800c = c0788la.f37800c;
    }

    /* JADX INFO: renamed from: a */
    public final void m15112a() {
        this.f37798a = -1;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15113b() {
        return this.f37798a >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37798a);
        parcel.writeInt(this.f37799b);
        parcel.writeInt(this.f37800c ? 1 : 0);
    }
}
