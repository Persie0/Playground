package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ahx implements Parcelable {

    /* JADX INFO: renamed from: d */
    public final Parcelable f394d;

    /* JADX INFO: renamed from: c */
    public static final ahx f393c = new ahw();
    public static final Parcelable.Creator CREATOR = new C0821mg(4);

    public ahx() {
        this.f394d = null;
    }

    protected ahx(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f394d = parcelable == null ? f393c : parcelable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f394d, i);
    }

    protected ahx(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f394d = parcelable == f393c ? null : parcelable;
    }
}
