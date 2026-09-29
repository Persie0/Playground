package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;
import p000.mpa;
import p000.npa;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new hfb(23);

    /* JADX INFO: renamed from: a */
    public final npa f7109a;

    public ParcelImpl(Parcel parcel) {
        this.f7109a = new mpa(parcel).m16436h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new mpa(parcel).m16440l(this.f7109a);
    }

    public ParcelImpl(npa npaVar) {
        this.f7109a = npaVar;
    }
}
