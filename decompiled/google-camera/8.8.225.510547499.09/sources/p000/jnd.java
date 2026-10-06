package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jnd extends jij {
    public static final Parcelable.Creator CREATOR = new jie(18);

    /* JADX INFO: renamed from: a */
    public final long f34394a;

    /* JADX INFO: renamed from: b */
    public final int f34395b;

    /* JADX INFO: renamed from: c */
    public final boolean f34396c;

    /* JADX INFO: renamed from: d */
    public final String f34397d;

    /* JADX INFO: renamed from: e */
    public final jms f34398e;

    public jnd(long j, int i, boolean z, String str, jms jmsVar) {
        this.f34394a = j;
        this.f34395b = i;
        this.f34396c = z;
        this.f34397d = str;
        this.f34398e = jmsVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jnd)) {
            return false;
        }
        jnd jndVar = (jnd) obj;
        return this.f34394a == jndVar.f34394a && this.f34395b == jndVar.f34395b && this.f34396c == jndVar.f34396c && jib.m13209n(this.f34397d, jndVar.f34397d) && jib.m13209n(this.f34398e, jndVar.f34398e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f34394a), Integer.valueOf(this.f34395b), Boolean.valueOf(this.f34396c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        if (this.f34394a != Long.MAX_VALUE) {
            sb.append("maxAge=");
            jnz.m13398a(this.f34394a, sb);
        }
        if (this.f34395b != 0) {
            sb.append(", ");
            sb.append(jpd.m13425f(this.f34395b));
        }
        if (this.f34396c) {
            sb.append(", bypass");
        }
        if (this.f34397d != null) {
            sb.append(", moduleId=");
            sb.append(this.f34397d);
        }
        if (this.f34398e != null) {
            sb.append(", impersonation=");
            sb.append(this.f34398e);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13288o(parcel, 1, this.f34394a);
        jiy.m13287n(parcel, 2, this.f34395b);
        jiy.m13284k(parcel, 3, this.f34396c);
        jiy.m13296w(parcel, 4, this.f34397d);
        jiy.m13295v(parcel, 5, this.f34398e, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
