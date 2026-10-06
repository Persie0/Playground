package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import p000.ats;
import p000.att;
import p000.atu;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator CREATOR = new ats(0);

    /* JADX INFO: renamed from: a */
    private final atu f1635a;

    public ParcelImpl(Parcel parcel) {
        this.f1635a = new att(parcel).m1995c();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new att(parcel).m2003k(this.f1635a);
    }
}
