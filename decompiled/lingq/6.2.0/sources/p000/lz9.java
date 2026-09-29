package p000;

import com.lingq.core.domain.store.AudioUnderlineMode;

/* JADX INFO: loaded from: classes2.dex */
public final class lz9 {

    /* JADX INFO: renamed from: a */
    public final AudioUnderlineMode f50356a;

    /* JADX INFO: renamed from: b */
    public final boolean f50357b;

    /* JADX INFO: renamed from: c */
    public final boolean f50358c;

    /* JADX INFO: renamed from: d */
    public final String f50359d;

    /* JADX INFO: renamed from: e */
    public final String f50360e;

    public lz9(AudioUnderlineMode audioUnderlineMode, boolean z, boolean z2, String str, String str2) {
        audioUnderlineMode.getClass();
        str.getClass();
        str2.getClass();
        this.f50356a = audioUnderlineMode;
        this.f50357b = z;
        this.f50358c = z2;
        this.f50359d = str;
        this.f50360e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz9)) {
            return false;
        }
        lz9 lz9Var = (lz9) obj;
        return this.f50356a == lz9Var.f50356a && this.f50357b == lz9Var.f50357b && this.f50358c == lz9Var.f50358c && fa4.m11650l(this.f50359d, lz9Var.f50359d) && fa4.m11650l(this.f50360e, lz9Var.f50360e);
    }

    public final int hashCode() {
        return this.f50360e.hashCode() + ux5.m22980c(g9a.m12428e(g9a.m12428e(this.f50356a.hashCode() * 31, 31, this.f50357b), 31, this.f50358c), this.f50359d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReadingDisplaySettings(audioUnderlineMode=");
        sb.append(this.f50356a);
        sb.append(", transliterationEnabled=");
        sb.append(this.f50357b);
        sb.append(", showSpacesBetweenWords=");
        hn1.m13367q(", scriptValue=", this.f50359d, ", tokenScriptValue=", sb, this.f50358c);
        return AbstractC3393o1.m17738m(sb, this.f50360e, ")");
    }
}
