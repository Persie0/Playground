package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jlg extends jij {
    public static final Parcelable.Creator CREATOR = new jie(16);

    /* JADX INFO: renamed from: a */
    public final int f34299a;

    /* JADX INFO: renamed from: b */
    public final long f34300b;

    public jlg(int i, long j) {
        boolean z = true;
        if (i == 0) {
            i = 0;
            if (j <= 0) {
                z = false;
            }
        }
        jib.m13197b(z, "Recurrent jobs cannot have non-positive minimal interval.");
        this.f34299a = i;
        this.f34300b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlg)) {
            return false;
        }
        jlg jlgVar = (jlg) obj;
        return this.f34299a == jlgVar.f34299a && this.f34300b == jlgVar.f34300b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f34299a), Long.valueOf(this.f34300b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34299a);
        jiy.m13288o(parcel, 2, this.f34300b);
        jiy.m13283j(parcel, iM13281h);
    }
}
