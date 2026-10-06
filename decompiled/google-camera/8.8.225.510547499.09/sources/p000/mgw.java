package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgw implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f40460a;

    public mgw(int i) {
        this.f40460a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.f40460a) {
            case 0:
                return new mgx(parcel, (ClassLoader) null);
            case 1:
                return new mgc(parcel, null);
            case 2:
                return new mhf(parcel, null);
            case 3:
                return new mis(parcel, null);
            default:
                return new mls(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f40460a) {
            case 0:
                return new mgx[i];
            case 1:
                return new mgc[i];
            case 2:
                return new mhf[i];
            case 3:
                return new mis[i];
            default:
                return new mls[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f40460a) {
            case 0:
                return new mgx(parcel, classLoader);
            case 1:
                return new mgc(parcel, classLoader);
            case 2:
                return new mhf(parcel, classLoader);
            case 3:
                return new mis(parcel, classLoader);
            default:
                return new mls(parcel, classLoader);
        }
    }
}
