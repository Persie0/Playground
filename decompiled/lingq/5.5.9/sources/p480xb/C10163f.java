package p480xb;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: xb.f */
/* JADX INFO: loaded from: classes.dex */
public final class C10163f {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f51462a = 0;

    static {
        C10163f.class.getClassLoader();
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m19181a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }
}
