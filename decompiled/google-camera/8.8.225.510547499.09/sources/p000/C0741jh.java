package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: jh */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0741jh extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = new C0050aw(16);

    /* JADX INFO: renamed from: a */
    boolean f34022a;

    public C0741jh(Parcel parcel) {
        super(parcel);
        this.f34022a = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f34022a ? (byte) 1 : (byte) 0);
    }

    public C0741jh(Parcelable parcelable) {
        super(parcelable);
    }
}
