package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ac7 {

    /* JADX INFO: renamed from: a */
    public final float f486a;

    /* JADX INFO: renamed from: b */
    public final String f487b;

    public ac7(String str, float f) {
        this.f486a = f;
        this.f487b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ac7)) {
            return false;
        }
        ac7 ac7Var = (ac7) obj;
        return Float.compare(this.f486a, ac7Var.f486a) == 0 && fa4.m11650l(this.f487b, ac7Var.f487b);
    }

    public final int hashCode() {
        return this.f487b.hashCode() + (Float.hashCode(this.f486a) * 31);
    }

    public final String toString() {
        return "PlayerPlaybackRate(rate=" + this.f486a + ", label=" + this.f487b + ")";
    }

    public /* synthetic */ ac7() {
        this("1x", 1.0f);
    }
}
