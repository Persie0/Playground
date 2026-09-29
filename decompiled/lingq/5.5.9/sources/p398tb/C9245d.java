package p398tb;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: tb.d */
/* JADX INFO: loaded from: classes.dex */
public final class C9245d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f47934a = 0;

    static {
        C9245d.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m17607a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m17608b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C0166e.m761g("Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
