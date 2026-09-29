package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0633a(1);

    /* JADX INFO: renamed from: a */
    public final ArrayList f5612a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5613b;

    public BackStackState(Parcel parcel) {
        this.f5612a = parcel.createStringArrayList();
        this.f5613b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5612a);
        parcel.writeTypedList(this.f5613b);
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f5612a = arrayList;
        this.f5613b = arrayList2;
    }
}
