package p060d1;

/* JADX INFO: renamed from: d1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C5036w {

    /* JADX INFO: renamed from: a */
    public final int f32869a;

    public final boolean equals(Object obj) {
        if (obj instanceof C5036w) {
            return this.f32869a == ((C5036w) obj).f32869a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32869a);
    }

    public final String toString() {
        return "PointerKeyboardModifiers(packedValue=" + this.f32869a + ')';
    }
}
