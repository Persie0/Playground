package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jcp extends jij {
    public static final Parcelable.Creator CREATOR = new jbt(4);

    /* JADX INFO: renamed from: a */
    public final String f33730a;

    /* JADX INFO: renamed from: b */
    public final int f33731b;

    /* JADX INFO: renamed from: c */
    public final int f33732c;

    public jcp(String str, int i, int i2) {
        this.f33730a = str;
        this.f33731b = i;
        this.f33732c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcp)) {
            return false;
        }
        jcp jcpVar = (jcp) obj;
        return Objects.equals(this.f33730a, jcpVar.f33730a) && this.f33731b == jcpVar.f33731b && this.f33732c == jcpVar.f33732c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f33730a, Integer.valueOf(this.f33731b), Integer.valueOf(this.f33732c)});
    }

    public final String toString() {
        return "LogErrorParcelable[LogSourceName: " + this.f33730a + ", ClearcutStatusCode: " + this.f33731b + ", ErrorCount: " + this.f33732c + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f33730a);
        jiy.m13287n(parcel, 2, this.f33731b);
        jiy.m13287n(parcel, 3, this.f33732c);
        jiy.m13283j(parcel, iM13281h);
    }
}
