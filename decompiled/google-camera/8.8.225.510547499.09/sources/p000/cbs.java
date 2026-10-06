package p000;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cbs {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f4964a = 0;

    static {
        cbs.class.getClassLoader();
    }

    private cbs() {
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m3402a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m3403b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail <= 0) {
            return;
        }
        throw new BadParcelableException("Parcel data not fully consumed, unread size: " + iDataAvail);
    }

    /* JADX INFO: renamed from: c */
    public static void m3404c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static void m3405d(Parcel parcel, IInterface iInterface) {
        if (iInterface == 0) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface);
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m3406e(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
