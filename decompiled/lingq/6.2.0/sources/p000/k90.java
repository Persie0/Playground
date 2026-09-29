package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k90 implements j90 {

    /* JADX INFO: renamed from: a */
    public final List f46882a;

    /* JADX INFO: renamed from: c */
    public kj4 f46884c = null;

    /* JADX INFO: renamed from: d */
    public float f46885d = -1.0f;

    /* JADX INFO: renamed from: b */
    public kj4 f46883b = m15011f(0.0f);

    public k90(List list) {
        this.f46882a = list;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: a */
    public final boolean mo14348a(float f) {
        kj4 kj4Var = this.f46884c;
        kj4 kj4Var2 = this.f46883b;
        if (kj4Var == kj4Var2 && this.f46885d == f) {
            return true;
        }
        this.f46884c = kj4Var2;
        this.f46885d = f;
        return false;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: b */
    public final kj4 mo14349b() {
        return this.f46883b;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: c */
    public final boolean mo14350c(float f) {
        kj4 kj4Var = this.f46883b;
        if (f >= kj4Var.m15270b() && f < kj4Var.m15269a()) {
            return !this.f46883b.m15271c();
        }
        this.f46883b = m15011f(f);
        return true;
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: d */
    public final float mo14351d() {
        List list = this.f46882a;
        return ((kj4) list.get(list.size() - 1)).m15269a();
    }

    @Override // p000.j90
    /* JADX INFO: renamed from: e */
    public final float mo14352e() {
        return ((kj4) this.f46882a.get(0)).m15270b();
    }

    /* JADX INFO: renamed from: f */
    public final kj4 m15011f(float f) {
        List list = this.f46882a;
        kj4 kj4Var = (kj4) list.get(list.size() - 1);
        if (f >= kj4Var.m15270b()) {
            return kj4Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            kj4 kj4Var2 = (kj4) list.get(size);
            if (this.f46883b != kj4Var2 && f >= kj4Var2.m15270b() && f < kj4Var2.m15269a()) {
                return kj4Var2;
            }
        }
        return (kj4) list.get(0);
    }

    @Override // p000.j90
    public final boolean isEmpty() {
        return false;
    }
}
