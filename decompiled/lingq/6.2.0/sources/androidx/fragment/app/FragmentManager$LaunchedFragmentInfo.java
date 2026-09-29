package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C0633a(2);

    /* JADX INFO: renamed from: a */
    public String f5629a;

    /* JADX INFO: renamed from: b */
    public int f5630b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i) {
        this.f5629a = str;
        this.f5630b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5629a);
        parcel.writeInt(this.f5630b);
    }
}
