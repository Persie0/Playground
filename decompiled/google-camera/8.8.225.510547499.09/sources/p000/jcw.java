package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcw extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(8);

    /* JADX INFO: renamed from: a */
    public final String f33761a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public final int f33762b;

    /* JADX INFO: renamed from: c */
    private final long f33763c;

    public jcw(String str, int i, long j) {
        this.f33761a = str;
        this.f33762b = i;
        this.f33763c = j;
    }

    public jcw(String str, long j) {
        this.f33761a = str;
        this.f33763c = j;
        this.f33762b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final long m12896a() {
        long j = this.f33763c;
        return j == -1 ? this.f33762b : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jcw) {
            jcw jcwVar = (jcw) obj;
            String str = this.f33761a;
            if (((str != null && str.equals(jcwVar.f33761a)) || (this.f33761a == null && jcwVar.f33761a == null)) && m12896a() == jcwVar.m12896a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33761a, Long.valueOf(m12896a())});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        jib.m13211p("name", this.f33761a, arrayList);
        jib.m13211p("version", Long.valueOf(m12896a()), arrayList);
        return jib.m13210o(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f33761a);
        jiy.m13287n(parcel, 2, this.f33762b);
        jiy.m13288o(parcel, 3, m12896a());
        jiy.m13283j(parcel, iM13281h);
    }
}
