package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrt extends jij implements Parcelable {
    public static final Parcelable.Creator CREATOR = new jri(7);

    /* JADX INFO: renamed from: a */
    public final String f34687a;

    /* JADX INFO: renamed from: b */
    public final String f34688b;

    /* JADX INFO: renamed from: c */
    public final String f34689c;

    public jrt(String str, String str2, String str3) {
        jib.m13205j(str);
        this.f34687a = str;
        jib.m13205j(str2);
        this.f34688b = str2;
        jib.m13205j(str3);
        this.f34689c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jrt)) {
            return false;
        }
        jrt jrtVar = (jrt) obj;
        return this.f34687a.equals(jrtVar.f34687a) && jib.m13209n(jrtVar.f34688b, this.f34688b) && jib.m13209n(jrtVar.f34689c, this.f34689c);
    }

    public final int hashCode() {
        return this.f34687a.hashCode();
    }

    public final String toString() {
        int i = 0;
        for (char c : this.f34687a.toCharArray()) {
            i += c;
        }
        String strTrim = this.f34687a.trim();
        int length = strTrim.length();
        if (length > 25) {
            strTrim = strTrim.substring(0, 10) + "..." + strTrim.substring(length - 10, length) + "::" + i;
        }
        return "Channel{token=" + strTrim + ", nodeId=" + this.f34688b + ", path=" + this.f34689c + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f34687a);
        jiy.m13296w(parcel, 3, this.f34688b);
        jiy.m13296w(parcel, 4, this.f34689c);
        jiy.m13283j(parcel, iM13281h);
    }
}
