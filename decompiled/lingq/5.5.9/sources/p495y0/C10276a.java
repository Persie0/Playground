package p495y0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.activity.result.C0204c;
import dm.C5207g;
import org.xmlpull.v1.XmlPullParser;
import p286o2.C7903c;
import p286o2.C7911k;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10276a {

    /* JADX INFO: renamed from: a */
    public final XmlPullParser f51720a;

    /* JADX INFO: renamed from: b */
    public int f51721b = 0;

    public C10276a(XmlResourceParser xmlResourceParser) {
        this.f51720a = xmlResourceParser;
    }

    /* JADX INFO: renamed from: a */
    public final C7903c m19245a(TypedArray typedArray, Resources.Theme theme, String str, int i10) {
        C7903c c7903cM15686d = C7911k.m15686d(typedArray, this.f51720a, theme, str, i10);
        m19250f(typedArray.getChangingConfigurations());
        return c7903cM15686d;
    }

    /* JADX INFO: renamed from: b */
    public final float m19246b(TypedArray typedArray, String str, int i10, float f3) {
        float fM15687e = C7911k.m15687e(typedArray, this.f51720a, str, i10, f3);
        m19250f(typedArray.getChangingConfigurations());
        return fM15687e;
    }

    /* JADX INFO: renamed from: c */
    public final int m19247c(TypedArray typedArray, String str, int i10, int i11) {
        int iM15688f = C7911k.m15688f(typedArray, this.f51720a, str, i10, i11);
        m19250f(typedArray.getChangingConfigurations());
        return iM15688f;
    }

    /* JADX INFO: renamed from: d */
    public final String m19248d(TypedArray typedArray, int i10) {
        String string = typedArray.getString(i10);
        m19250f(typedArray.getChangingConfigurations());
        return string;
    }

    /* JADX INFO: renamed from: e */
    public final TypedArray m19249e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayM15693k = C7911k.m15693k(resources, theme, attributeSet, iArr);
        C5207g.m11110e(typedArrayM15693k, "obtainAttributes(\n      …          attrs\n        )");
        m19250f(typedArrayM15693k.getChangingConfigurations());
        return typedArrayM15693k;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10276a)) {
            return false;
        }
        C10276a c10276a = (C10276a) obj;
        return C5207g.m11106a(this.f51720a, c10276a.f51720a) && this.f51721b == c10276a.f51721b;
    }

    /* JADX INFO: renamed from: f */
    public final void m19250f(int i10) {
        this.f51721b = i10 | this.f51721b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51721b) + (this.f51720a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f51720a);
        sb2.append(", config=");
        return C0204c.m853l(sb2, this.f51721b, ')');
    }
}
