package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aou extends anr {
    public static final Parcelable.Creator CREATOR = new C0870ob(12);

    /* JADX INFO: renamed from: a */
    public int f1935a;

    /* JADX INFO: renamed from: b */
    public int f1936b;

    /* JADX INFO: renamed from: c */
    public int f1937c;

    public aou(Parcel parcel) {
        super(parcel);
        this.f1935a = parcel.readInt();
        this.f1936b = parcel.readInt();
        this.f1937c = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1935a);
        parcel.writeInt(this.f1936b);
        parcel.writeInt(this.f1937c);
    }

    public aou(Parcelable parcelable) {
        super(parcelable);
    }
}
