package p000;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrh extends jij {
    public static final Parcelable.Creator CREATOR = new jri(0);

    /* JADX INFO: renamed from: a */
    public final int f34649a;

    /* JADX INFO: renamed from: b */
    public final String f34650b;

    /* JADX INFO: renamed from: c */
    public final String f34651c;

    /* JADX INFO: renamed from: d */
    public final String f34652d;

    /* JADX INFO: renamed from: e */
    public final String f34653e;

    /* JADX INFO: renamed from: f */
    public final String f34654f;

    /* JADX INFO: renamed from: g */
    public final byte f34655g;

    /* JADX INFO: renamed from: h */
    public final byte f34656h;

    /* JADX INFO: renamed from: i */
    public final byte f34657i;

    /* JADX INFO: renamed from: j */
    public final byte f34658j;

    /* JADX INFO: renamed from: k */
    public final String f34659k;

    /* JADX INFO: renamed from: l */
    private final String f34660l;

    public jrh(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f34649a = i;
        this.f34650b = str;
        this.f34651c = str2;
        this.f34652d = str3;
        this.f34653e = str4;
        this.f34654f = str5;
        this.f34660l = str6;
        this.f34655g = b;
        this.f34656h = b2;
        this.f34657i = b3;
        this.f34658j = b4;
        this.f34659k = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jrh jrhVar = (jrh) obj;
        if (this.f34649a != jrhVar.f34649a || this.f34655g != jrhVar.f34655g || this.f34656h != jrhVar.f34656h || this.f34657i != jrhVar.f34657i || this.f34658j != jrhVar.f34658j || !this.f34650b.equals(jrhVar.f34650b)) {
            return false;
        }
        String str = this.f34651c;
        if (str == null ? jrhVar.f34651c != null : !str.equals(jrhVar.f34651c)) {
            return false;
        }
        if (!this.f34652d.equals(jrhVar.f34652d) || !this.f34653e.equals(jrhVar.f34653e) || !this.f34654f.equals(jrhVar.f34654f)) {
            return false;
        }
        String str2 = this.f34660l;
        if (str2 == null ? jrhVar.f34660l != null : !str2.equals(jrhVar.f34660l)) {
            return false;
        }
        String str3 = this.f34659k;
        if (str3 != null) {
            return str3.equals(jrhVar.f34659k);
        }
        return jrhVar.f34659k == null;
    }

    public final int hashCode() {
        int iHashCode = ((this.f34649a + 31) * 31) + this.f34650b.hashCode();
        String str = this.f34651c;
        int iHashCode2 = ((((((((iHashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.f34652d.hashCode()) * 31) + this.f34653e.hashCode()) * 31) + this.f34654f.hashCode()) * 31;
        String str2 = this.f34660l;
        int iHashCode3 = (((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f34655g) * 31) + this.f34656h) * 31) + this.f34657i) * 31) + this.f34658j) * 31;
        String str3 = this.f34659k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        int i = this.f34649a;
        String str = this.f34650b;
        String str2 = this.f34651c;
        byte b = this.f34655g;
        byte b2 = this.f34656h;
        byte b3 = this.f34657i;
        byte b4 = this.f34658j;
        return "AncsNotificationParcelable{, id=" + i + ", appId='" + str + "', dateTime='" + str2 + "', eventId=" + ((int) b) + ", eventFlags=" + ((int) b2) + ", categoryId=" + ((int) b3) + ", categoryCount=" + ((int) b4) + VCYBIzY.PpdzVjFaQZgtQ + this.f34659k + "'}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 2, this.f34649a);
        jiy.m13296w(parcel, 3, this.f34650b);
        jiy.m13296w(parcel, 4, this.f34651c);
        jiy.m13296w(parcel, 5, this.f34652d);
        jiy.m13296w(parcel, 6, this.f34653e);
        jiy.m13296w(parcel, 7, this.f34654f);
        String str = this.f34660l;
        if (str == null) {
            str = this.f34650b;
        }
        jiy.m13296w(parcel, 8, str);
        jiy.m13285l(parcel, 9, this.f34655g);
        jiy.m13285l(parcel, 10, this.f34656h);
        jiy.m13285l(parcel, 11, this.f34657i);
        jiy.m13285l(parcel, 12, this.f34658j);
        jiy.m13296w(parcel, 13, this.f34659k);
        jiy.m13283j(parcel, iM13281h);
    }
}
