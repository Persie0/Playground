package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcs extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(6);

    /* JADX INFO: renamed from: a */
    public final String f33740a;

    /* JADX INFO: renamed from: b */
    public final int f33741b;

    /* JADX INFO: renamed from: c */
    public final int f33742c;

    /* JADX INFO: renamed from: d */
    public final String f33743d;

    /* JADX INFO: renamed from: e */
    public final boolean f33744e;

    /* JADX INFO: renamed from: f */
    public final String f33745f;

    /* JADX INFO: renamed from: g */
    public final boolean f33746g;

    /* JADX INFO: renamed from: h */
    public final int f33747h;

    /* JADX INFO: renamed from: i */
    public final Integer f33748i;

    /* JADX INFO: renamed from: j */
    public final boolean f33749j;

    /* JADX INFO: renamed from: k */
    public final int f33750k;

    public jcs(String str, int i, int i2, String str2, boolean z, String str3, boolean z2, int i3, Integer num, boolean z3, int i4) {
        this.f33740a = str;
        this.f33741b = i;
        this.f33742c = i2;
        this.f33743d = str2;
        this.f33744e = z;
        this.f33745f = str3;
        this.f33746g = z2;
        this.f33747h = i3;
        this.f33748i = num;
        this.f33749j = z3;
        this.f33750k = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jcs) {
            jcs jcsVar = (jcs) obj;
            if (jib.m13209n(this.f33740a, jcsVar.f33740a) && this.f33741b == jcsVar.f33741b && this.f33742c == jcsVar.f33742c && jib.m13209n(this.f33745f, jcsVar.f33745f) && jib.m13209n(this.f33743d, jcsVar.f33743d) && this.f33744e == jcsVar.f33744e && this.f33746g == jcsVar.f33746g && this.f33747h == jcsVar.f33747h && jib.m13209n(this.f33748i, jcsVar.f33748i) && this.f33749j == jcsVar.f33749j && this.f33750k == jcsVar.f33750k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33740a, Integer.valueOf(this.f33741b), Integer.valueOf(this.f33742c), this.f33745f, this.f33743d, Boolean.valueOf(this.f33744e), Boolean.valueOf(this.f33746g), Integer.valueOf(this.f33747h), this.f33748i, Boolean.valueOf(this.f33749j), Integer.valueOf(this.f33750k)});
    }

    public final String toString() {
        return "PlayLoggerContext[package=" + this.f33740a + ",packageVersionCode=" + this.f33741b + ",logSource=" + this.f33742c + ",logSourceName=" + this.f33745f + ",uploadAccount=" + this.f33743d + ",logAndroidId=" + this.f33744e + ",isAnonymous=" + this.f33746g + ",qosTier=" + this.f33747h + ",appMobilespecId=" + this.f33748i + ",scrubMccMnc=" + this.f33749j + "piiLevelset=" + this.f33750k + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f33740a);
        jiy.m13287n(parcel, 3, this.f33741b);
        jiy.m13287n(parcel, 4, this.f33742c);
        jiy.m13296w(parcel, 5, this.f33743d);
        jiy.m13284k(parcel, 7, this.f33744e);
        jiy.m13296w(parcel, 8, this.f33745f);
        jiy.m13284k(parcel, 9, this.f33746g);
        jiy.m13287n(parcel, 10, this.f33747h);
        Integer num = this.f33748i;
        if (num != null) {
            jiy.m13286m(parcel, 11, 4);
            parcel.writeInt(num.intValue());
        }
        jiy.m13284k(parcel, 12, this.f33749j);
        jiy.m13287n(parcel, 13, this.f33750k);
        jiy.m13283j(parcel, iM13281h);
    }
}
