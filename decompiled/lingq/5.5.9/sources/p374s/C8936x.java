package p374s;

import androidx.activity.result.C0204c;
import dm.C5207g;

/* JADX INFO: renamed from: s.x */
/* JADX INFO: loaded from: classes.dex */
public final class C8936x<T> implements InterfaceC8929r<T> {

    /* JADX INFO: renamed from: a */
    public final float f46868a;

    /* JADX INFO: renamed from: b */
    public final float f46869b;

    /* JADX INFO: renamed from: c */
    public final T f46870c;

    public C8936x() {
        this(null, 7);
    }

    public C8936x(float f3, float f10, T t10) {
        this.f46868a = f3;
        this.f46869b = f10;
        this.f46870c = t10;
    }

    public /* synthetic */ C8936x(Object obj, int i10) {
        this((i10 & 1) != 0 ? 1.0f : 0.0f, (i10 & 2) != 0 ? 1500.0f : 0.0f, (i10 & 4) != 0 ? null : obj);
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8936x) {
            C8936x c8936x = (C8936x) obj;
            if (c8936x.f46868a == this.f46868a) {
                if ((c8936x.f46869b == this.f46869b) && C5207g.m11106a(c8936x.f46870c, this.f46870c)) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    @Override // p374s.InterfaceC8901d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends AbstractC8911i> C8926p0<V> mo17134a(InterfaceC8906f0<T, V> interfaceC8906f0) {
        C5207g.m11111f(interfaceC8906f0, "converter");
        T t10 = this.f46870c;
        return new C8926p0<>(this.f46868a, this.f46869b, t10 == null ? null : interfaceC8906f0.mo17140a().mo528n(t10));
    }

    public final int hashCode() {
        T t10 = this.f46870c;
        return Float.hashCode(this.f46869b) + C0204c.m846e(this.f46868a, (t10 != null ? t10.hashCode() : 0) * 31, 31);
    }
}
