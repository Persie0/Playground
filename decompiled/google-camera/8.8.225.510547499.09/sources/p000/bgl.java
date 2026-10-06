package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgl extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0870ob(14);

    /* JADX INFO: renamed from: a */
    public String f3165a;

    /* JADX INFO: renamed from: b */
    public int f3166b;

    /* JADX INFO: renamed from: c */
    public float f3167c;

    /* JADX INFO: renamed from: d */
    public boolean f3168d;

    /* JADX INFO: renamed from: e */
    public String f3169e;

    /* JADX INFO: renamed from: f */
    public int f3170f;

    /* JADX INFO: renamed from: g */
    public int f3171g;

    public bgl(Parcel parcel) {
        super(parcel);
        this.f3165a = parcel.readString();
        this.f3167c = parcel.readFloat();
        this.f3168d = parcel.readInt() == 1;
        this.f3169e = parcel.readString();
        this.f3170f = parcel.readInt();
        this.f3171g = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f3165a);
        parcel.writeFloat(this.f3167c);
        parcel.writeInt(this.f3168d ? 1 : 0);
        parcel.writeString(this.f3169e);
        parcel.writeInt(this.f3170f);
        parcel.writeInt(this.f3171g);
    }

    public bgl(Parcelable parcelable) {
        super(parcelable);
    }
}
