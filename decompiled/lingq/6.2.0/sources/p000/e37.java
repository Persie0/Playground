package p000;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e37 {

    /* JADX INFO: renamed from: a */
    public final int f36652a;

    /* JADX INFO: renamed from: b */
    public final String f36653b;

    /* JADX INFO: renamed from: c */
    public final List f36654c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f36655d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f36656e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f36657f;

    public e37(int i, String str, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.f36652a = i;
        this.f36653b = str;
        this.f36654c = list;
        this.f36655d = arrayList;
        this.f36656e = arrayList2;
        this.f36657f = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e37)) {
            return false;
        }
        e37 e37Var = (e37) obj;
        return this.f36652a == e37Var.f36652a && this.f36653b.equals(e37Var.f36653b) && this.f36654c.equals(e37Var.f36654c) && this.f36655d.equals(e37Var.f36655d) && this.f36656e.equals(e37Var.f36656e) && this.f36657f.equals(e37Var.f36657f);
    }

    public final int hashCode() {
        return this.f36657f.hashCode() + ((this.f36656e.hashCode() + ((this.f36655d.hashCode() + ux5.m22979b(ux5.m22980c(Integer.hashCode(this.f36652a) * 31, this.f36653b, 31), 31, this.f36654c)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f36652a, "ParagraphData(index=", ", text=", this.f36653b, ", sentences=");
        sbM22995r.append(this.f36654c);
        sbM22995r.append(", words=");
        sbM22995r.append(this.f36655d);
        sbM22995r.append(", phrases=");
        sbM22995r.append(this.f36656e);
        sbM22995r.append(", phraseStructures=");
        sbM22995r.append(this.f36657f);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
