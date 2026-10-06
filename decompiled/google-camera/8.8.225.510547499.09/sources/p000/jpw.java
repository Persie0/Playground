package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpw extends jij {
    public static final Parcelable.Creator CREATOR;

    /* JADX INFO: renamed from: a */
    public final boolean f34573a;

    /* JADX INFO: renamed from: b */
    public final boolean f34574b;

    /* JADX INFO: renamed from: c */
    private final List f34575c;

    static {
        new jpw(null, false, false);
        CREATOR = new jny(15);
    }

    public jpw(List list, boolean z, boolean z2) {
        this.f34575c = list == null ? new ArrayList(0) : new ArrayList(list);
        this.f34573a = z;
        this.f34574b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jpw)) {
            return false;
        }
        jpw jpwVar = (jpw) obj;
        return jib.m13209n(this.f34575c, jpwVar.f34575c) && jib.m13209n(Boolean.valueOf(this.f34573a), Boolean.valueOf(jpwVar.f34573a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34575c, Boolean.valueOf(this.f34573a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13239A(parcel, 1, new ArrayList(this.f34575c));
        jiy.m13284k(parcel, 2, this.f34573a);
        jiy.m13284k(parcel, 3, this.f34574b);
        jiy.m13283j(parcel, iM13281h);
    }
}
