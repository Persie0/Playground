package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0907a();

    /* JADX INFO: renamed from: a */
    public final List<String> f6067a;

    /* JADX INFO: renamed from: b */
    public final List<BackStackRecordState> f6068b;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackState$a */
    public class C0907a implements Parcelable.Creator<BackStackState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(Parcel parcel) {
        this.f6067a = parcel.createStringArrayList();
        this.f6068b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    public BackStackState(ArrayList arrayList, ArrayList arrayList2) {
        this.f6067a = arrayList;
        this.f6068b = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6067a);
        parcel.writeTypedList(this.f6068b);
    }
}
