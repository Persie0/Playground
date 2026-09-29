package p000;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class pd9 extends vi0 implements w94 {

    /* JADX INFO: renamed from: a */
    public final long f55989a;

    public pd9(long j) {
        this.f55989a = j;
    }

    @Override // p000.w94
    /* JADX INFO: renamed from: a */
    public final Object mo11319a(Object obj, float f) {
        if (obj == null) {
            obj = new pd9(aa1.f411j);
        }
        if (!(obj instanceof pd9)) {
            return null;
        }
        return new pd9(d32.m10026X(this.f55989a, ((pd9) obj).f55989a, f));
    }

    @Override // p000.vi0
    /* JADX INFO: renamed from: b */
    public final void mo13650b(float f, long j, u8a u8aVar) {
        u8aVar.m22553n(1.0f);
        long jM198b = this.f55989a;
        if (f != 1.0f) {
            jM198b = aa1.m198b(aa1.m200d(jM198b) * f, jM198b);
        }
        u8aVar.m22555p(jM198b);
        if (((Shader) u8aVar.f63595d) != null) {
            u8aVar.m22559t(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pd9) {
            return aa1.m199c(this.f55989a, ((pd9) obj).f55989a);
        }
        return false;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f55989a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) aa1.m205i(this.f55989a)) + ')';
    }
}
