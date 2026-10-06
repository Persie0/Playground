package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aut extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0821mg(6);

    /* JADX INFO: renamed from: a */
    public int f2436a;

    /* JADX INFO: renamed from: b */
    public int f2437b;

    /* JADX INFO: renamed from: c */
    public Parcelable f2438c;

    public aut(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2436a = parcel.readInt();
        this.f2437b = parcel.readInt();
        this.f2438c = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f2436a);
        parcel.writeInt(this.f2437b);
        parcel.writeParcelable(this.f2438c, i);
    }

    public aut(Parcelable parcelable) {
        super(parcelable);
    }
}
