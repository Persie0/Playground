package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jui extends jij {
    public static final Parcelable.Creator CREATOR = new jsj(14);

    /* JADX INFO: renamed from: a */
    public final String f34832a;

    /* JADX INFO: renamed from: b */
    public final int f34833b;

    /* JADX INFO: renamed from: c */
    public final int f34834c;

    public jui(String str, int i, int i2) {
        this.f34832a = str;
        this.f34833b = i;
        this.f34834c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jui juiVar = (jui) obj;
        return this.f34833b == juiVar.f34833b && this.f34834c == juiVar.f34834c && Objects.equals(this.f34832a, juiVar.f34832a);
    }

    public final int hashCode() {
        return Objects.hash(this.f34832a, Integer.valueOf(this.f34833b), Integer.valueOf(this.f34834c));
    }

    public final String toString() {
        return String.format(Locale.US, "WebIconParcelable{%dx%d - %s}", Integer.valueOf(this.f34833b), Integer.valueOf(this.f34834c), this.f34832a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34832a);
        jiy.m13287n(parcel, 2, this.f34833b);
        jiy.m13287n(parcel, 3, this.f34834c);
        jiy.m13283j(parcel, iM13281h);
    }
}
