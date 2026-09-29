package p374s;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: s.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8909h extends AbstractC8911i {

    /* JADX INFO: renamed from: a */
    public float f46814a;

    /* JADX INFO: renamed from: b */
    public float f46815b;

    /* JADX INFO: renamed from: c */
    public float f46816c;

    /* JADX INFO: renamed from: d */
    public float f46817d;

    /* JADX INFO: renamed from: e */
    public final int f46818e = 4;

    public C8909h(float f3, float f10, float f11, float f12) {
        this.f46814a = f3;
        this.f46815b = f10;
        this.f46816c = f11;
        this.f46817d = f12;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: a */
    public final float mo17135a(int i10) {
        if (i10 == 0) {
            return this.f46814a;
        }
        if (i10 == 1) {
            return this.f46815b;
        }
        if (i10 == 2) {
            return this.f46816c;
        }
        if (i10 != 3) {
            return 0.0f;
        }
        return this.f46817d;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: b */
    public final int mo17136b() {
        return this.f46818e;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: c */
    public final AbstractC8911i mo17137c() {
        return new C8909h(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: d */
    public final void mo17138d() {
        this.f46814a = 0.0f;
        this.f46815b = 0.0f;
        this.f46816c = 0.0f;
        this.f46817d = 0.0f;
    }

    @Override // p374s.AbstractC8911i
    /* JADX INFO: renamed from: e */
    public final void mo17139e(int i10, float f3) {
        if (i10 == 0) {
            this.f46814a = f3;
            return;
        }
        if (i10 == 1) {
            this.f46815b = f3;
        } else if (i10 == 2) {
            this.f46816c = f3;
        } else {
            if (i10 != 3) {
                return;
            }
            this.f46817d = f3;
        }
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (obj instanceof C8909h) {
            C8909h c8909h = (C8909h) obj;
            if (c8909h.f46814a == this.f46814a) {
                if (c8909h.f46815b == this.f46815b) {
                    if (c8909h.f46816c == this.f46816c) {
                        if (c8909h.f46817d == this.f46817d) {
                            z10 = true;
                        }
                    }
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        return Float.hashCode(this.f46817d) + C0204c.m846e(this.f46816c, C0204c.m846e(this.f46815b, Float.hashCode(this.f46814a) * 31, 31), 31);
    }

    public final String toString() {
        return "AnimationVector4D: v1 = " + this.f46814a + ", v2 = " + this.f46815b + ", v3 = " + this.f46816c + ", v4 = " + this.f46817d;
    }
}
