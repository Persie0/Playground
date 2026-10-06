package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bou extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0870ob(15);

    /* JADX INFO: renamed from: a */
    public boolean f4028a;

    /* JADX INFO: renamed from: b */
    public boolean f4029b;

    public bou(Parcel parcel) {
        super(parcel);
        this.f4028a = ((Boolean) parcel.readValue(null)).booleanValue();
        this.f4029b = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "MainSwitchBar.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " checked=" + this.f4028a + " visible=" + this.f4029b + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.f4028a));
        parcel.writeValue(Boolean.valueOf(this.f4029b));
    }

    public bou(Parcelable parcelable) {
        super(parcelable);
    }
}
