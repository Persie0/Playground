package p000;

import kotlinx.datetime.format.C3251b;

/* JADX INFO: loaded from: classes3.dex */
public final class cl3 extends AbstractC3021g0 {

    /* JADX INFO: renamed from: a */
    public final vn7 f10225a;

    /* JADX INFO: renamed from: b */
    public final String f10226b;

    /* JADX INFO: renamed from: c */
    public final Object f10227c;

    public cl3(vn7 vn7Var, g32 g32Var, int i) {
        String str = vn7Var.f65667b;
        g32Var = (i & 4) != 0 ? null : g32Var;
        str.getClass();
        this.f10225a = vn7Var;
        this.f10226b = str;
        this.f10227c = g32Var;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: a */
    public final vn7 mo3720a() {
        return this.f10225a;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: b */
    public final Object mo3721b() {
        return this.f10227c;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: c */
    public final String mo3722c() {
        return this.f10226b;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: d */
    public final C3251b mo3723d() {
        return null;
    }
}
