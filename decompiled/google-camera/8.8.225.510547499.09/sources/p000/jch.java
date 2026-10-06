package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jch extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(3);

    /* JADX INFO: renamed from: a */
    public final List f33725a;

    public jch(List list) {
        this.f33725a = Collections.unmodifiableList(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jch) {
            return this.f33725a.equals(((jch) obj).f33725a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33725a});
    }

    public final String toString() {
        return "BatchedLogErrorParcelable[LogErrors: " + this.f33725a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13239A(parcel, 1, this.f33725a);
        jiy.m13283j(parcel, iM13281h);
    }
}
