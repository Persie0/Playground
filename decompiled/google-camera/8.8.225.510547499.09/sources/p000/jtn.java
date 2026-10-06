package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jtn extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(17);

    /* JADX INFO: renamed from: a */
    public final String f34783a;

    /* JADX INFO: renamed from: b */
    public final String f34784b;

    /* JADX INFO: renamed from: c */
    public final int f34785c;

    /* JADX INFO: renamed from: d */
    public final boolean f34786d;

    public jtn(String str, String str2, int i, boolean z) {
        this.f34783a = str;
        this.f34784b = str2;
        this.f34785c = i;
        this.f34786d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jtn) {
            return ((jtn) obj).f34783a.equals(this.f34783a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34783a.hashCode();
    }

    public final String toString() {
        return "Node{" + this.f34784b + ", id=" + this.f34783a + ", hops=" + this.f34785c + ", isNearby=" + this.f34786d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34783a);
        jiy.m13296w(parcel, 3, this.f34784b);
        jiy.m13287n(parcel, 4, this.f34785c);
        jiy.m13284k(parcel, 5, this.f34786d);
        jiy.m13283j(parcel, iM13281h);
    }
}
