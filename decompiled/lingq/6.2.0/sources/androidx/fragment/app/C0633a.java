package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.fragment.app.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0633a implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5654a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f5654a) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
                fragmentManager$LaunchedFragmentInfo.f5629a = parcel.readString();
                fragmentManager$LaunchedFragmentInfo.f5630b = parcel.readInt();
                return fragmentManager$LaunchedFragmentInfo;
            case 3:
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f5635e = null;
                fragmentManagerState.f5636f = new ArrayList();
                fragmentManagerState.f5637g = new ArrayList();
                fragmentManagerState.f5631a = parcel.createStringArrayList();
                fragmentManagerState.f5632b = parcel.createStringArrayList();
                fragmentManagerState.f5633c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                fragmentManagerState.f5634d = parcel.readInt();
                fragmentManagerState.f5635e = parcel.readString();
                fragmentManagerState.f5636f = parcel.createStringArrayList();
                fragmentManagerState.f5637g = parcel.createTypedArrayList(BackStackState.CREATOR);
                fragmentManagerState.f5638h = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return fragmentManagerState;
            default:
                return new FragmentState(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f5654a) {
            case 0:
                return new BackStackRecordState[i];
            case 1:
                return new BackStackState[i];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i];
            case 3:
                return new FragmentManagerState[i];
            default:
                return new FragmentState[i];
        }
    }
}
