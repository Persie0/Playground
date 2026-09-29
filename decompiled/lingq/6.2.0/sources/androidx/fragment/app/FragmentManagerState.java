package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0633a(3);

    /* JADX INFO: renamed from: a */
    public ArrayList f5631a;

    /* JADX INFO: renamed from: b */
    public ArrayList f5632b;

    /* JADX INFO: renamed from: c */
    public BackStackRecordState[] f5633c;

    /* JADX INFO: renamed from: d */
    public int f5634d;

    /* JADX INFO: renamed from: e */
    public String f5635e;

    /* JADX INFO: renamed from: f */
    public ArrayList f5636f;

    /* JADX INFO: renamed from: g */
    public ArrayList f5637g;

    /* JADX INFO: renamed from: h */
    public ArrayList f5638h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f5631a);
        parcel.writeStringList(this.f5632b);
        parcel.writeTypedArray(this.f5633c, i);
        parcel.writeInt(this.f5634d);
        parcel.writeString(this.f5635e);
        parcel.writeStringList(this.f5636f);
        parcel.writeTypedList(this.f5637g);
        parcel.writeTypedList(this.f5638h);
    }
}
