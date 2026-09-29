package p000;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bqb {

    /* JADX INFO: renamed from: a */
    public static final ClassLoader f8878a = bqb.class.getClassLoader();

    /* JADX INFO: renamed from: a */
    public static boolean m4104a(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: b */
    public static Parcelable m4105b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: c */
    public static void m4106c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m4107d(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* JADX INFO: renamed from: e */
    public static HashMap m4108e(Parcel parcel) {
        return parcel.readHashMap(f8878a);
    }

    /* JADX INFO: renamed from: f */
    public static void m4109f(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(wq1.m24124t(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
