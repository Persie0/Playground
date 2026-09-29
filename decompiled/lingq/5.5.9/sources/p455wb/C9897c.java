package p455wb;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: wb.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9897c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f50531a = 0;

    static {
        C9897c.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m18402a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m18403b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C0166e.m761g("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m18404c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
