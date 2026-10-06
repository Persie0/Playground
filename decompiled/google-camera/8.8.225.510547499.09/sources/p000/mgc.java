package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgc extends ahx {
    public static final Parcelable.Creator CREATOR = new mgw(1);

    /* JADX INFO: renamed from: a */
    public boolean f40412a;

    /* JADX INFO: renamed from: b */
    public boolean f40413b;

    /* JADX INFO: renamed from: e */
    public int f40414e;

    /* JADX INFO: renamed from: f */
    public float f40415f;

    /* JADX INFO: renamed from: g */
    public boolean f40416g;

    public mgc(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f40412a = parcel.readByte() != 0;
        this.f40413b = parcel.readByte() != 0;
        this.f40414e = parcel.readInt();
        this.f40415f = parcel.readFloat();
        this.f40416g = parcel.readByte() != 0;
    }

    @Override // p000.ahx, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f40412a ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f40413b ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f40414e);
        parcel.writeFloat(this.f40415f);
        parcel.writeByte(this.f40416g ? (byte) 1 : (byte) 0);
    }

    public mgc(Parcelable parcelable) {
        super(parcelable);
    }
}
