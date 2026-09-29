package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ey7 {

    /* JADX INFO: renamed from: a */
    public final String f38077a;

    /* JADX INFO: renamed from: b */
    public final String f38078b;

    /* JADX INFO: renamed from: c */
    public final String f38079c;

    /* JADX INFO: renamed from: d */
    public final String f38080d;

    /* JADX INFO: renamed from: e */
    public final float f38081e;

    /* JADX INFO: renamed from: f */
    public final ox7 f38082f;

    /* JADX INFO: renamed from: g */
    public final d27 f38083g;

    /* JADX INFO: renamed from: h */
    public final Map f38084h;

    public ey7(String str, String str2, String str3, String str4, float f, ox7 ox7Var, d27 d27Var, Map map) {
        str.getClass();
        this.f38077a = str;
        this.f38078b = str2;
        this.f38079c = str3;
        this.f38080d = str4;
        this.f38081e = f;
        this.f38082f = ox7Var;
        this.f38083g = d27Var;
        this.f38084h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey7)) {
            return false;
        }
        ey7 ey7Var = (ey7) obj;
        return fa4.m11650l(this.f38077a, ey7Var.f38077a) && this.f38078b.equals(ey7Var.f38078b) && this.f38079c.equals(ey7Var.f38079c) && this.f38080d.equals(ey7Var.f38080d) && xj2.m24560b(this.f38081e, ey7Var.f38081e) && this.f38082f.equals(ey7Var.f38082f) && this.f38083g.equals(ey7Var.f38083g) && this.f38084h.equals(ey7Var.f38084h);
    }

    public final int hashCode() {
        return this.f38084h.hashCode() + ((this.f38083g.hashCode() + ((this.f38082f.hashCode() + wq1.m24105a(ux5.m22980c(ux5.m22980c(ux5.m22980c(this.f38077a.hashCode() * 31, this.f38078b, 31), this.f38079c, 31), this.f38080d, 31), this.f38081e, 31)) * 31)) * 31);
    }

    public final String toString() {
        String strM24561c = xj2.m24561c(this.f38081e);
        StringBuilder sbM23000w = ux5.m23000w("ReaderPageState(language=", this.f38077a, ", lessonTitle=", this.f38078b, ", courseTitle=");
        AbstractC3393o1.m17725C(sbM23000w, this.f38079c, ", imageUrl=", this.f38080d, ", horizontalPadding=");
        sbM23000w.append(strM24561c);
        sbM23000w.append(", pageData=");
        sbM23000w.append(this.f38082f);
        sbM23000w.append(", highlightData=");
        sbM23000w.append(this.f38083g);
        sbM23000w.append(", sentenceTranslationsByIndex=");
        sbM23000w.append(this.f38084h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
