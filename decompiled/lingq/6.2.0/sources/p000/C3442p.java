package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.fragment.app.Fragment$SavedState;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: renamed from: p */
/* JADX INFO: loaded from: classes.dex */
public final class C3442p implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55347a;

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f55347a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbsSavedState.f5562b;
                }
                C3386nv.m17633t("superState must be null");
                return null;
            case 1:
                return new Fragment$SavedState(parcel, classLoader);
            default:
                return new ParcelableSparseArray(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f55347a) {
            case 0:
                return new AbsSavedState[i];
            case 1:
                return new Fragment$SavedState[i];
            default:
                return new ParcelableSparseArray[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f55347a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbsSavedState.f5562b;
                }
                C3386nv.m17633t("superState must be null");
                return null;
            case 1:
                return new Fragment$SavedState(parcel, null);
            default:
                return new ParcelableSparseArray(parcel, null);
        }
    }
}
