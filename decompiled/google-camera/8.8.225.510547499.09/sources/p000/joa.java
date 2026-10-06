package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joa extends jij implements Comparable {
    public static final Parcelable.Creator CREATOR = new jny(2);

    /* JADX INFO: renamed from: a */
    public final int f34437a;

    /* JADX INFO: renamed from: b */
    public final jof[] f34438b;

    /* JADX INFO: renamed from: c */
    public final String[] f34439c;

    /* JADX INFO: renamed from: d */
    public final Map f34440d = new TreeMap();

    public joa(int i, jof[] jofVarArr, String[] strArr) {
        this.f34437a = i;
        this.f34438b = jofVarArr;
        for (jof jofVar : jofVarArr) {
            this.f34440d.put(jofVar.f34466a, jofVar);
        }
        this.f34439c = strArr;
        if (strArr != null) {
            Arrays.sort(strArr);
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f34437a - ((joa) obj).f34437a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof joa) {
            joa joaVar = (joa) obj;
            if (this.f34437a == joaVar.f34437a && jpd.m13422c(this.f34440d, joaVar.f34440d) && Arrays.equals(this.f34439c, joaVar.f34439c)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Configuration(");
        sb.append(this.f34437a);
        sb.append(", (");
        Iterator it = this.f34440d.values().iterator();
        while (it.hasNext()) {
            sb.append((jof) it.next());
            sb.append(", ");
        }
        sb.append("), (");
        String[] strArr = this.f34439c;
        if (strArr != null) {
            for (String str : strArr) {
                sb.append(str);
                sb.append(", ");
            }
        } else {
            sb.append("null");
        }
        sb.append("))");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34437a);
        jiy.m13299z(parcel, 3, this.f34438b, i);
        jiy.m13297x(parcel, 4, this.f34439c);
        jiy.m13283j(parcel, iM13281h);
    }
}
