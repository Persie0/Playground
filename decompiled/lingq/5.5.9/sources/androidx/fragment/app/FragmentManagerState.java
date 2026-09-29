package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0933a();

    /* JADX INFO: renamed from: a */
    public ArrayList<String> f6209a;

    /* JADX INFO: renamed from: b */
    public ArrayList<String> f6210b;

    /* JADX INFO: renamed from: c */
    public BackStackRecordState[] f6211c;

    /* JADX INFO: renamed from: d */
    public int f6212d;

    /* JADX INFO: renamed from: e */
    public String f6213e;

    /* JADX INFO: renamed from: f */
    public final ArrayList<String> f6214f;

    /* JADX INFO: renamed from: g */
    public final ArrayList<BackStackState> f6215g;

    /* JADX INFO: renamed from: h */
    public ArrayList<FragmentManager.LaunchedFragmentInfo> f6216h;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerState$a */
    public class C0933a implements Parcelable.Creator<FragmentManagerState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
        this.f6213e = null;
        this.f6214f = new ArrayList<>();
        this.f6215g = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.f6213e = null;
        this.f6214f = new ArrayList<>();
        this.f6215g = new ArrayList<>();
        this.f6209a = parcel.createStringArrayList();
        this.f6210b = parcel.createStringArrayList();
        this.f6211c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.f6212d = parcel.readInt();
        this.f6213e = parcel.readString();
        this.f6214f = parcel.createStringArrayList();
        this.f6215g = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.f6216h = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f6209a);
        parcel.writeStringList(this.f6210b);
        parcel.writeTypedArray(this.f6211c, i10);
        parcel.writeInt(this.f6212d);
        parcel.writeString(this.f6213e);
        parcel.writeStringList(this.f6214f);
        parcel.writeTypedList(this.f6215g);
        parcel.writeTypedList(this.f6216h);
    }
}
