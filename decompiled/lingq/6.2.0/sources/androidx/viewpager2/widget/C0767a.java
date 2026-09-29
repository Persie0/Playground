package androidx.viewpager2.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: androidx.viewpager2.widget.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C0767a implements Parcelable.ClassLoaderCreator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, null);
        savedState.f7130a = parcel.readInt();
        savedState.f7131b = parcel.readInt();
        savedState.f7132c = parcel.readParcelable(null);
        return savedState;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ViewPager2.SavedState[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        ViewPager2.SavedState savedState = new ViewPager2.SavedState(parcel, classLoader);
        savedState.f7130a = parcel.readInt();
        savedState.f7131b = parcel.readInt();
        savedState.f7132c = parcel.readParcelable(classLoader);
        return savedState;
    }
}
