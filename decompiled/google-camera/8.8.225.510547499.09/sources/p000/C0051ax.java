package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: ax */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0051ax implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(0);

    /* JADX INFO: renamed from: a */
    final List f2625a;

    /* JADX INFO: renamed from: b */
    final List f2626b;

    public C0051ax(Parcel parcel) {
        this.f2625a = parcel.createStringArrayList();
        this.f2626b = parcel.createTypedArrayList(C0049av.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f2625a);
        parcel.writeTypedList(this.f2626b);
    }
}
