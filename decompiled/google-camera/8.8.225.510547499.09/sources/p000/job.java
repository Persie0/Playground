package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class job extends jij {
    public static final Parcelable.Creator CREATOR = new jny(3);

    /* JADX INFO: renamed from: a */
    public final String f34441a;

    /* JADX INFO: renamed from: b */
    public final byte[] f34442b;

    /* JADX INFO: renamed from: c */
    public final String f34443c;

    /* JADX INFO: renamed from: d */
    public final joa[] f34444d;

    /* JADX INFO: renamed from: e */
    public final Map f34445e = new TreeMap();

    /* JADX INFO: renamed from: f */
    public final boolean f34446f;

    /* JADX INFO: renamed from: g */
    public final long f34447g;

    public job(String str, String str2, joa[] joaVarArr, boolean z, byte[] bArr, long j) {
        this.f34441a = str;
        this.f34443c = str2;
        this.f34444d = joaVarArr;
        this.f34446f = z;
        this.f34442b = bArr;
        this.f34447g = j;
        for (joa joaVar : joaVarArr) {
            this.f34445e.put(Integer.valueOf(joaVar.f34437a), joaVar);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof job) {
            job jobVar = (job) obj;
            if (jpd.m13422c(this.f34441a, jobVar.f34441a) && jpd.m13422c(this.f34443c, jobVar.f34443c) && this.f34445e.equals(jobVar.f34445e) && this.f34446f == jobVar.f34446f && Arrays.equals(this.f34442b, jobVar.f34442b) && this.f34447g == jobVar.f34447g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34441a, this.f34443c, this.f34445e, Boolean.valueOf(this.f34446f), this.f34442b, Long.valueOf(this.f34447g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configurations('");
        sb.append(this.f34441a);
        sb.append("', '");
        sb.append(this.f34443c);
        sb.append("', (");
        Iterator it = this.f34445e.values().iterator();
        while (it.hasNext()) {
            sb.append((joa) it.next());
            sb.append(", ");
        }
        sb.append("), ");
        sb.append(this.f34446f);
        sb.append(", ");
        byte[] bArr = this.f34442b;
        sb.append(bArr == null ? "null" : Base64.encodeToString(bArr, 3));
        sb.append(", ");
        sb.append(this.f34447g);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34441a);
        jiy.m13296w(parcel, 3, this.f34443c);
        jiy.m13299z(parcel, 4, this.f34444d, i);
        jiy.m13284k(parcel, 5, this.f34446f);
        jiy.m13290q(parcel, 6, this.f34442b);
        jiy.m13288o(parcel, 7, this.f34447g);
        jiy.m13283j(parcel, iM13281h);
    }
}
