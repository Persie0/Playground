package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jgx extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(16);

    /* JADX INFO: renamed from: a */
    public final int f34007a;

    /* JADX INFO: renamed from: b */
    public final String f34008b;

    public jgx(int i, String str) {
        this.f34007a = i;
        this.f34008b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jgx)) {
            return false;
        }
        jgx jgxVar = (jgx) obj;
        return jgxVar.f34007a == this.f34007a && jib.m13209n(jgxVar.f34008b, this.f34008b);
    }

    public final int hashCode() {
        return this.f34007a;
    }

    public final String toString() {
        return this.f34007a + ":" + this.f34008b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34007a);
        jiy.m13296w(parcel, 2, this.f34008b);
        jiy.m13283j(parcel, iM13281h);
    }
}
