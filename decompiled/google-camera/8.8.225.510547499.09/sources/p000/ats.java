package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ats implements Parcelable.Creator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f2377a;

    public ats(int i) {
        this.f2377a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.f2377a) {
            case 0:
                return new ParcelImpl(parcel);
            default:
                return new C0917pv(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f2377a) {
            case 0:
                return new ParcelImpl[i];
            default:
                return new C0917pv[i];
        }
    }
}
