package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogg extends ogh {
    public static final Parcelable.Creator CREATOR = new lrq(5);

    /* JADX INFO: renamed from: a */
    public int f45909a;

    /* JADX INFO: renamed from: b */
    public boolean f45910b;

    public ogg() {
    }

    @Override // p000.ogh
    /* JADX INFO: renamed from: a */
    public final void mo18475a(Parcel parcel) {
        super.mo18475a(parcel);
        this.f45909a = parcel.readInt();
        this.f45910b = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // p000.ogh, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f45909a);
        parcel.writeInt(this.f45910b ? 1 : 0);
    }

    public ogg(Parcel parcel) {
        mo18475a(parcel);
    }
}
