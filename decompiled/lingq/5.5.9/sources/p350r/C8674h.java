package p350r;

import dm.C5207g;
import p374s.InterfaceC8929r;

/* JADX INFO: renamed from: r.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8674h {

    /* JADX INFO: renamed from: a */
    public final float f46259a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8929r<Float> f46260b;

    public C8674h(float f3, InterfaceC8929r<Float> interfaceC8929r) {
        C5207g.m11111f(interfaceC8929r, "animationSpec");
        this.f46259a = f3;
        this.f46260b = interfaceC8929r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8674h)) {
            return false;
        }
        C8674h c8674h = (C8674h) obj;
        return Float.compare(this.f46259a, c8674h.f46259a) == 0 && C5207g.m11106a(this.f46260b, c8674h.f46260b);
    }

    public final int hashCode() {
        return this.f46260b.hashCode() + (Float.hashCode(this.f46259a) * 31);
    }

    public final String toString() {
        return "Fade(alpha=" + this.f46259a + ", animationSpec=" + this.f46260b + ')';
    }
}
