package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jms extends jij {
    public static final Parcelable.Creator CREATOR = new jie(17);

    /* JADX INFO: renamed from: a */
    public final int f34368a;

    /* JADX INFO: renamed from: b */
    public final int f34369b;

    /* JADX INFO: renamed from: c */
    public final String f34370c;

    /* JADX INFO: renamed from: d */
    public final String f34371d;

    /* JADX INFO: renamed from: e */
    public final int f34372e;

    /* JADX INFO: renamed from: f */
    public final String f34373f;

    /* JADX INFO: renamed from: g */
    public final jms f34374g;

    /* JADX INFO: renamed from: h */
    public final List f34375h;

    static {
        Process.myUid();
        Process.myPid();
    }

    public jms(int i, int i2, String str, String str2, String str3, int i3, List list, jms jmsVar) {
        this.f34368a = i;
        this.f34369b = i2;
        this.f34370c = str;
        this.f34371d = str2;
        this.f34373f = str3;
        this.f34372e = i3;
        this.f34375h = mws.m17095j(list);
        this.f34374g = jmsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jms) {
            jms jmsVar = (jms) obj;
            if (this.f34368a == jmsVar.f34368a && this.f34369b == jmsVar.f34369b && this.f34372e == jmsVar.f34372e && this.f34370c.equals(jmsVar.f34370c) && mpw.m16768g(this.f34371d, jmsVar.f34371d) && mpw.m16768g(this.f34373f, jmsVar.f34373f) && mpw.m16768g(this.f34374g, jmsVar.f34374g) && this.f34375h.equals(jmsVar.f34375h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34368a), this.f34370c, this.f34371d, this.f34373f});
    }

    public final String toString() {
        int length = this.f34370c.length() + 18;
        String str = this.f34371d;
        if (str != null) {
            length += str.length();
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(this.f34368a);
        sb.append("/");
        sb.append(this.f34370c);
        if (this.f34371d != null) {
            sb.append("[");
            if (this.f34371d.startsWith(this.f34370c)) {
                sb.append((CharSequence) this.f34371d, this.f34370c.length(), this.f34371d.length());
            } else {
                sb.append(this.f34371d);
            }
            sb.append("]");
        }
        if (this.f34373f != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.f34373f.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34368a);
        jiy.m13287n(parcel, 2, this.f34369b);
        jiy.m13296w(parcel, 3, this.f34370c);
        jiy.m13296w(parcel, 4, this.f34371d);
        jiy.m13287n(parcel, 5, this.f34372e);
        jiy.m13296w(parcel, 6, this.f34373f);
        jiy.m13295v(parcel, 7, this.f34374g, i);
        jiy.m13239A(parcel, 8, this.f34375h);
        jiy.m13283j(parcel, iM13281h);
    }
}
