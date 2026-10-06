package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jog extends jij {
    public static final Parcelable.Creator CREATOR = new jny(7);

    /* JADX INFO: renamed from: a */
    public final String f34474a;

    /* JADX INFO: renamed from: b */
    public final String f34475b;

    /* JADX INFO: renamed from: c */
    public final jof f34476c;

    /* JADX INFO: renamed from: d */
    public final boolean f34477d;

    public jog(String str, String str2, jof jofVar, boolean z) {
        this.f34474a = str;
        this.f34475b = str2;
        this.f34476c = jofVar;
        this.f34477d = z;
    }

    /* JADX INFO: renamed from: a */
    public final String m13406a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.f34474a);
        sb.append(", ");
        sb.append(this.f34475b);
        sb.append(", ");
        this.f34476c.m13405a(sb);
        sb.append(", ");
        sb.append(this.f34477d);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jog)) {
            return false;
        }
        jog jogVar = (jog) obj;
        return jpd.m13422c(this.f34474a, jogVar.f34474a) && jpd.m13422c(this.f34475b, jogVar.f34475b) && jpd.m13422c(this.f34476c, jogVar.f34476c) && this.f34477d == jogVar.f34477d;
    }

    public final String toString() {
        return m13406a(new StringBuilder());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34474a);
        jiy.m13296w(parcel, 3, this.f34475b);
        jiy.m13295v(parcel, 4, this.f34476c, i);
        jiy.m13284k(parcel, 5, this.f34477d);
        jiy.m13283j(parcel, iM13281h);
    }
}
