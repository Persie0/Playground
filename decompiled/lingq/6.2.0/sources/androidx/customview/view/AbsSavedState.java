package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import p000.C3386nv;
import p000.C3442p;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbsSavedState implements Parcelable {

    /* JADX INFO: renamed from: a */
    public final Parcelable f5563a;

    /* JADX INFO: renamed from: b */
    public static final AbsSavedState f5562b = new C04841();
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C3442p(0);

    /* JADX INFO: renamed from: androidx.customview.view.AbsSavedState$1 */
    /* JADX INFO: loaded from: classes2.dex */
    public class C04841 extends AbsSavedState {
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f5563a = parcelable == f5562b ? null : parcelable;
        } else {
            C3386nv.m17626m("superState must not be null");
            throw null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5563a, i);
    }

    public AbsSavedState() {
        this.f5563a = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f5563a = parcelable == null ? f5562b : parcelable;
    }
}
