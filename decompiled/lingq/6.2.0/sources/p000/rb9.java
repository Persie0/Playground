package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rb9 implements dy5 {

    /* JADX INFO: renamed from: a */
    public final float f59030a;

    /* JADX INFO: renamed from: b */
    public final int f59031b;

    public rb9(int i, float f) {
        this.f59030a = f;
        this.f59031b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rb9.class == obj.getClass()) {
            rb9 rb9Var = (rb9) obj;
            if (this.f59030a == rb9Var.f59030a && this.f59031b == rb9Var.f59031b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.f59030a).hashCode() + 527) * 31) + this.f59031b;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.f59030a + ", svcTemporalLayerCount=" + this.f59031b;
    }
}
