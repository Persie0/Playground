package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhl extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new lrq(2);

    /* JADX INFO: renamed from: a */
    int f40510a;

    public mhl(Parcel parcel) {
        super(parcel);
        this.f40510a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
    }

    public final String toString() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        switch (this.f40510a) {
            case 1:
                str = "checked";
                break;
            case 2:
                str = "indeterminate";
                break;
            default:
                str = "unchecked";
                break;
        }
        return "MaterialCheckBox.SavedState{" + hexString + " CheckedState=" + str + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f40510a));
    }

    public mhl(Parcelable parcelable) {
        super(parcelable);
    }
}
