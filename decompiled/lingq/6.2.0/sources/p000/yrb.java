package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yrb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f70354a = 0;

    static {
        yrb.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m25305a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
