package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p448w4.C9811b;
import p448w4.InterfaceC9812c;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1199a();

    /* JADX INFO: renamed from: a */
    public final InterfaceC9812c f7630a;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C1199a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f7630a = new C9811b(parcel).m4630n();
    }

    public ParcelImpl(InterfaceC9812c interfaceC9812c) {
        this.f7630a = interfaceC9812c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        new C9811b(parcel).m4639w(this.f7630a);
    }
}
