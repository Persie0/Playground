package p000;

import android.os.BadParcelableException;
import android.os.Parcel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class prb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f56734a = 0;

    static {
        prb.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static void m19465a(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(wq1.m24124t(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
