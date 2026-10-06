package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: mg */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0821mg implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f40404a;

    public C0821mg(int i) {
        this.f40404a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final ahx m16348a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return ahx.f393c;
        }
        throw new IllegalStateException("superState must be null");
    }

    /* JADX INFO: renamed from: b */
    public static final aut m16349b(Parcel parcel, ClassLoader classLoader) {
        return new aut(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.f40404a) {
            case 0:
                return new C0822mh(parcel, null);
            case 1:
                return new C0076bv(parcel, null);
            case 2:
                return new C0857np(parcel, null);
            case 3:
                return new aam(parcel, null);
            case 4:
                return m16348a(parcel, null);
            case 5:
                return new aub(parcel, null);
            default:
                return m16349b(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.f40404a) {
            case 0:
                return new C0822mh[i];
            case 1:
                return new C0076bv[i];
            case 2:
                return new C0857np[i];
            case 3:
                return new aam[i];
            case 4:
                return new ahx[i];
            case 5:
                return new aub[i];
            default:
                return new aut[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f40404a) {
            case 0:
                return new C0822mh(parcel, classLoader);
            case 1:
                return new C0076bv(parcel, classLoader);
            case 2:
                return new C0857np(parcel, classLoader);
            case 3:
                return new aam(parcel, classLoader);
            case 4:
                return m16348a(parcel, classLoader);
            case 5:
                return new aub(parcel, classLoader);
            default:
                return m16349b(parcel, classLoader);
        }
    }
}
