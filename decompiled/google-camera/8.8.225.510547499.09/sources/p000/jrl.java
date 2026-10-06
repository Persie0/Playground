package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrl extends jij {
    public static final Parcelable.Creator CREATOR = new jri(4);

    /* JADX INFO: renamed from: a */
    public final boolean f34672a;

    /* JADX INFO: renamed from: b */
    public final List f34673b;

    public jrl(boolean z, List list) {
        this.f34672a = z;
        this.f34673b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jrl jrlVar = (jrl) obj;
        return this.f34672a == jrlVar.f34672a && Objects.equals(this.f34673b, jrlVar.f34673b);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f34672a), this.f34673b);
    }

    public final String toString() {
        return "AppWearDetailsParcelable{isWatchface=" + this.f34672a + ", watchfaceCategories=" + String.valueOf(this.f34673b) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13284k(parcel, 1, this.f34672a);
        jiy.m13298y(parcel, 2, this.f34673b);
        jiy.m13283j(parcel, iM13281h);
    }
}
