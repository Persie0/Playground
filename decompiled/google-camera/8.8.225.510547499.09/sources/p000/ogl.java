package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new lrq(9);

    /* JADX INFO: renamed from: a */
    public boolean f45937a;

    /* JADX INFO: renamed from: b */
    public boolean f45938b;

    /* JADX INFO: renamed from: c */
    public boolean f45939c;

    /* JADX INFO: renamed from: d */
    public boolean f45940d;

    /* JADX INFO: renamed from: e */
    public boolean f45941e;

    public ogl() {
        this.f45937a = true;
        this.f45940d = true;
    }

    public ogl(int i) {
        if ((i & 1) != 0) {
            this.f45937a = true;
        }
        if ((i & 2) != 0) {
            this.f45940d = true;
        }
        if ((i & 4) != 0) {
            this.f45938b = true;
        }
        if ((i & 8) != 0) {
            this.f45939c = true;
        }
        if ((i & 16) != 0) {
            this.f45941e = true;
        }
    }

    public ogl(Parcel parcel) {
        this.f45937a = parcel.readInt() != 0;
        this.f45938b = parcel.readInt() != 0;
        this.f45939c = parcel.readInt() != 0;
        this.f45940d = parcel.readInt() != 0;
        this.f45941e = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format(Locale.US, "ori=%b, gyro=%b, accel=%b, touch=%b, gestures=%b", Boolean.valueOf(this.f45937a), Boolean.valueOf(this.f45938b), Boolean.valueOf(this.f45939c), Boolean.valueOf(this.f45940d), Boolean.valueOf(this.f45941e));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f45937a ? 1 : 0);
        parcel.writeInt(this.f45938b ? 1 : 0);
        parcel.writeInt(this.f45939c ? 1 : 0);
        parcel.writeInt(this.f45940d ? 1 : 0);
        parcel.writeInt(this.f45941e ? 1 : 0);
    }
}
