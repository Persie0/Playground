package p000;

import android.os.Parcel;
import android.os.Parcelable;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrj extends jij {
    public static final Parcelable.Creator CREATOR = new jri(2);

    /* JADX INFO: renamed from: a */
    public final String f34662a;

    /* JADX INFO: renamed from: b */
    public final String f34663b;

    /* JADX INFO: renamed from: c */
    public final jui f34664c;

    /* JADX INFO: renamed from: d */
    public final String f34665d;

    /* JADX INFO: renamed from: e */
    public final String f34666e;

    /* JADX INFO: renamed from: f */
    public final Float f34667f;

    /* JADX INFO: renamed from: g */
    public final jrl f34668g;

    public jrj(String str, String str2, jui juiVar, String str3, String str4, Float f, jrl jrlVar) {
        this.f34662a = str;
        this.f34663b = str2;
        this.f34664c = juiVar;
        this.f34665d = str3;
        this.f34666e = str4;
        this.f34667f = f;
        this.f34668g = jrlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        jrj jrjVar = (jrj) obj;
        return Objects.equals(this.f34662a, jrjVar.f34662a) && Objects.equals(this.f34663b, jrjVar.f34663b) && Objects.equals(this.f34664c, jrjVar.f34664c) && Objects.equals(this.f34665d, jrjVar.f34665d) && Objects.equals(this.f34666e, jrjVar.f34666e) && Objects.equals(this.f34667f, jrjVar.f34667f) && Objects.equals(this.f34668g, jrjVar.f34668g);
    }

    public final int hashCode() {
        return Objects.hash(this.f34662a, this.f34663b, this.f34664c, this.f34665d, this.f34666e, this.f34667f, this.f34668g);
    }

    public final String toString() {
        return "AppParcelable{title='" + this.f34663b + "', developerName='" + this.f34665d + "', formattedPrice='" + this.f34666e + "', starRating=" + this.f34667f + ", wearDetails=" + String.valueOf(this.f34668g) + ", deepLinkUri='" + this.f34662a + "', icon=" + String.valueOf(this.f34664c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34662a);
        jiy.m13296w(parcel, 2, this.f34663b);
        jiy.m13295v(parcel, 3, this.f34664c, i);
        jiy.m13296w(parcel, 4, this.f34665d);
        jiy.m13296w(parcel, 5, this.f34666e);
        Float f = this.f34667f;
        if (f != null) {
            jiy.m13286m(parcel, 6, 4);
            parcel.writeFloat(f.floatValue());
        }
        jiy.m13295v(parcel, 7, this.f34668g, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
