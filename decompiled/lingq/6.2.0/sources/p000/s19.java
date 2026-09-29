package p000;

import com.lingq.feature.search.filter.model.ViewKeys;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class s19 extends g29 {

    /* JADX INFO: renamed from: a */
    public final String f60159a;

    /* JADX INFO: renamed from: b */
    public final Integer f60160b;

    /* JADX INFO: renamed from: c */
    public final List f60161c;

    /* JADX INFO: renamed from: d */
    public final ViewKeys f60162d;

    public s19(String str, Integer num, ArrayList arrayList, ViewKeys viewKeys, int i) {
        num = (i & 2) != 0 ? null : num;
        arrayList = (i & 4) != 0 ? null : arrayList;
        viewKeys.getClass();
        this.f60159a = str;
        this.f60160b = num;
        this.f60161c = arrayList;
        this.f60162d = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s19)) {
            return false;
        }
        s19 s19Var = (s19) obj;
        return fa4.m11650l(this.f60159a, s19Var.f60159a) && fa4.m11650l(this.f60160b, s19Var.f60160b) && fa4.m11650l(this.f60161c, s19Var.f60161c) && this.f60162d == s19Var.f60162d;
    }

    public final int hashCode() {
        String str = this.f60159a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f60160b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f60161c;
        return this.f60162d.hashCode() + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "HintSelection(value=" + this.f60159a + ", hint=" + this.f60160b + ", hints=" + this.f60161c + ", key=" + this.f60162d + ")";
    }
}
