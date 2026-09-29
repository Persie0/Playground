package p000;

import android.text.StaticLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class px8 {

    /* JADX INFO: renamed from: a */
    public final float f56953a;

    /* JADX INFO: renamed from: b */
    public final float f56954b;

    /* JADX INFO: renamed from: c */
    public final float f56955c;

    /* JADX INFO: renamed from: d */
    public final StaticLayout f56956d;

    public px8(float f, float f2, float f3, StaticLayout staticLayout) {
        this.f56953a = f;
        this.f56954b = f2;
        this.f56955c = f3;
        this.f56956d = staticLayout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof px8)) {
            return false;
        }
        px8 px8Var = (px8) obj;
        return Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f56953a, px8Var.f56953a) == 0 && Float.compare(this.f56954b, px8Var.f56954b) == 0 && Float.compare(this.f56955c, px8Var.f56955c) == 0 && this.f56956d.equals(px8Var.f56956d);
    }

    public final int hashCode() {
        return this.f56956d.hashCode() + wq1.m24105a(wq1.m24105a(wq1.m24105a(Float.hashCode(0.0f) * 31, this.f56953a, 31), this.f56954b, 31), this.f56955c, 31);
    }

    public final String toString() {
        return "SentenceTranslationRenderItem(left=0.0, top=" + this.f56953a + ", clipWidth=" + this.f56954b + ", clipHeight=" + this.f56955c + ", layout=" + this.f56956d + ")";
    }
}
