package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class joh extends jij {
    public static final Parcelable.Creator CREATOR = new jny(8);

    /* JADX INFO: renamed from: a */
    public final List f34478a;

    public joh(List list) {
        this.f34478a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof joh) {
            return this.f34478a.equals(((joh) obj).f34478a);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (jog jogVar : this.f34478a) {
            if (!z) {
                sb.append(", ");
            }
            jogVar.m13406a(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13239A(parcel, 2, this.f34478a);
        jiy.m13283j(parcel, iM13281h);
    }
}
