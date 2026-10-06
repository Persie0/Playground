package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrq extends jij implements jqq {
    public static final Parcelable.Creator CREATOR = new jri(5);

    /* JADX INFO: renamed from: a */
    public final String f34678a;

    /* JADX INFO: renamed from: b */
    public final List f34679b;

    /* JADX INFO: renamed from: c */
    private final Object f34680c = new Object();

    /* JADX INFO: renamed from: d */
    private Set f34681d = null;

    public jrq(String str, List list) {
        this.f34678a = str;
        this.f34679b = list;
        jib.m13205j(str);
        jib.m13205j(list);
    }

    @Override // p000.jqq
    /* JADX INFO: renamed from: a */
    public final Set mo13472a() {
        Set set;
        synchronized (this.f34680c) {
            if (this.f34681d == null) {
                this.f34681d = new HashSet(this.f34679b);
            }
            set = this.f34681d;
        }
        return set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jrq jrqVar = (jrq) obj;
        String str = this.f34678a;
        if (str == null ? jrqVar.f34678a != null : !str.equals(jrqVar.f34678a)) {
            return false;
        }
        List list = this.f34679b;
        return list == null ? jrqVar.f34679b == null : list.equals(jrqVar.f34679b);
    }

    public final int hashCode() {
        String str = this.f34678a;
        int iHashCode = str != null ? str.hashCode() : 0;
        List list = this.f34679b;
        return ((iHashCode + 31) * 31) + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "CapabilityInfo{" + this.f34678a + ", " + String.valueOf(this.f34679b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34678a);
        jiy.m13239A(parcel, 3, this.f34679b);
        jiy.m13283j(parcel, iM13281h);
    }
}
