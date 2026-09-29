package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class f4a {

    /* JADX INFO: renamed from: a */
    public final String f38416a;

    /* JADX INFO: renamed from: b */
    public final String f38417b;

    /* JADX INFO: renamed from: c */
    public final List f38418c;

    public f4a(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f38416a = str;
        this.f38417b = str2;
        this.f38418c = list;
    }

    /* JADX INFO: renamed from: a */
    public static f4a m11530a(f4a f4aVar, ArrayList arrayList) {
        String str = f4aVar.f38416a;
        String str2 = f4aVar.f38417b;
        str.getClass();
        str2.getClass();
        return new f4a(str, str2, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4a)) {
            return false;
        }
        f4a f4aVar = (f4a) obj;
        return fa4.m11650l(this.f38416a, f4aVar.f38416a) && fa4.m11650l(this.f38417b, f4aVar.f38417b) && fa4.m11650l(this.f38418c, f4aVar.f38418c);
    }

    public final int hashCode() {
        return this.f38418c.hashCode() + ux5.m22980c(this.f38416a.hashCode() * 31, this.f38417b, 31);
    }

    public final String toString() {
        return hn1.m13356f(ux5.m23000w("TokenPopularMeaningsEntity(termWithLanguage=", this.f38416a, ", locale=", this.f38417b, ", popularMeanings="), this.f38418c, ")");
    }
}
