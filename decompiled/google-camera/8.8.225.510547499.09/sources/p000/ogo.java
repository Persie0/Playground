package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ogo extends ofy {
    public static final Parcelable.Creator CREATOR = new lrq(12);

    public ogo() {
    }

    @Override // p000.ofy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ogo) {
            return Arrays.equals(((ogo) obj).f45896a, this.f45896a);
        }
        return false;
    }

    public ogo(Parcel parcel) {
        super(parcel);
    }
}
