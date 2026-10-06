package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahn extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0870ob(6);

    /* JADX INFO: renamed from: a */
    public int f392a;

    public ahn(Parcel parcel) {
        super(parcel);
        this.f392a = parcel.readInt();
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f392a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f392a);
    }

    public ahn(Parcelable parcelable) {
        super(parcelable);
    }
}
