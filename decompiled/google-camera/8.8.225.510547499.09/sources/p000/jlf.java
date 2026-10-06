package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlf extends jij {
    public static final Parcelable.Creator CREATOR = new jie(15);

    /* JADX INFO: renamed from: a */
    public final boolean f34296a;

    /* JADX INFO: renamed from: b */
    public final boolean f34297b;

    /* JADX INFO: renamed from: c */
    public final boolean f34298c;

    public jlf(boolean z, boolean z2, boolean z3) {
        this.f34296a = z;
        this.f34297b = z2;
        this.f34298c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlf)) {
            return false;
        }
        jlf jlfVar = (jlf) obj;
        return this.f34296a == jlfVar.f34296a && this.f34297b == jlfVar.f34297b && this.f34298c == jlfVar.f34298c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f34296a), Boolean.valueOf(this.f34297b), Boolean.valueOf(this.f34298c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13284k(parcel, 1, this.f34296a);
        jiy.m13284k(parcel, 2, this.f34297b);
        jiy.m13284k(parcel, 3, this.f34298c);
        jiy.m13283j(parcel, iM13281h);
    }
}
