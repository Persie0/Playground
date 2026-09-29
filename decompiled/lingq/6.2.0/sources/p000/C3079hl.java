package p000;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: hl */
/* JADX INFO: loaded from: classes.dex */
public final class C3079hl {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f42557a;

    /* JADX INFO: renamed from: b */
    public int f42558b = 0;

    /* JADX INFO: renamed from: c */
    public final C3400o8 f42559c;

    public C3079hl(XmlResourceParser xmlResourceParser) {
        this.f42557a = xmlResourceParser;
        C3400o8 c3400o8 = new C3400o8();
        c3400o8.f53965b = new float[64];
        this.f42559c = c3400o8;
    }

    /* JADX INFO: renamed from: a */
    public final float m13322a(TypedArray typedArray, String str, int i, float f) {
        if (nda.m17382f(this.f42557a, str)) {
            f = typedArray.getFloat(i, f);
        }
        m13323b(typedArray.getChangingConfigurations());
        return f;
    }

    /* JADX INFO: renamed from: b */
    public final void m13323b(int i) {
        this.f42558b = i | this.f42558b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3079hl)) {
            return false;
        }
        C3079hl c3079hl = (C3079hl) obj;
        return fa4.m11650l(this.f42557a, c3079hl.f42557a) && this.f42558b == c3079hl.f42558b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42558b) + (this.f42557a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f42557a);
        sb.append(", config=");
        return wq1.m24122r(sb, this.f42558b, ')');
    }
}
