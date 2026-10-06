package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcr extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(5);

    /* JADX INFO: renamed from: a */
    public final boolean f33739a;

    public jcr(boolean z) {
        this.f33739a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcr) && this.f33739a == ((jcr) obj).f33739a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f33739a)});
    }

    public final String toString() {
        return "LogVerifierResultParcelable[" + this.f33739a + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13284k(parcel, 1, this.f33739a);
        jiy.m13283j(parcel, iM13281h);
    }
}
