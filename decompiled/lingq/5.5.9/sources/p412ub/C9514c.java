package p412ub;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ub.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9514c {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f49018a = 0;

    static {
        C9514c.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static <T extends Parcelable> T m17979a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }
}
