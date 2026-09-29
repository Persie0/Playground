package p278nh;

import androidx.activity.result.C0204c;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import p003a2.C0009a;
import p301oh.C8046e;

/* JADX INFO: renamed from: nh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7779f {

    /* JADX INFO: renamed from: a */
    public final int f42713a;

    /* JADX INFO: renamed from: b */
    public final int f42714b;

    /* JADX INFO: renamed from: c */
    public final List<C8046e> f42715c;

    /* JADX INFO: renamed from: d */
    public final String f42716d;

    public C7779f(int i10, int i11, List<C8046e> list, String str) {
        C5207g.m11111f(list, "coordinates");
        C5207g.m11111f(str, "valueForTitle");
        this.f42713a = i10;
        this.f42714b = i11;
        this.f42715c = list;
        this.f42716d = str;
    }

    public /* synthetic */ C7779f(EmptyList emptyList) {
        this(R.string.placeholder, 0, emptyList, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7779f)) {
            return false;
        }
        C7779f c7779f = (C7779f) obj;
        return this.f42713a == c7779f.f42713a && this.f42714b == c7779f.f42714b && C5207g.m11106a(this.f42715c, c7779f.f42715c) && C5207g.m11106a(this.f42716d, c7779f.f42716d);
    }

    public final int hashCode() {
        return this.f42716d.hashCode() + C0204c.m848g(this.f42715c, C0009a.m16d(this.f42714b, Integer.hashCode(this.f42713a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LineGraphItem(title=");
        sb2.append(this.f42713a);
        sb2.append(", lineColor=");
        sb2.append(this.f42714b);
        sb2.append(", coordinates=");
        sb2.append(this.f42715c);
        sb2.append(", valueForTitle=");
        return C0009a.m23l(sb2, this.f42716d, ")");
    }
}
