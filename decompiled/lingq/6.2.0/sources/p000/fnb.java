package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fnb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f39353a = 0;

    static {
        fnb.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m11961a(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
