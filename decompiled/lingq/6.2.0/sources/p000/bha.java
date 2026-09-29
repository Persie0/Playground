package p000;

import kotlinx.datetime.format.C3251b;

/* JADX INFO: loaded from: classes3.dex */
public final class bha extends AbstractC3021g0 {

    /* JADX INFO: renamed from: a */
    public final vn7 f8550a;

    /* JADX INFO: renamed from: b */
    public final String f8551b;

    /* JADX INFO: renamed from: c */
    public final Integer f8552c;

    /* JADX INFO: renamed from: d */
    public final C3251b f8553d;

    /* JADX INFO: renamed from: e */
    public final int f8554e;

    public bha(vn7 vn7Var, int i, C3251b c3251b, int i2) {
        int i3;
        String str = vn7Var.f65667b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        c3251b = (i2 & 32) != 0 ? null : c3251b;
        str.getClass();
        this.f8550a = vn7Var;
        this.f8551b = str;
        this.f8552c = num;
        this.f8553d = c3251b;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                C3386nv.m17626m(ux5.m22989l("Max value ", i, " is too large"));
                throw null;
            }
            i3 = 3;
        }
        this.f8554e = i3;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: a */
    public final vn7 mo3720a() {
        return this.f8550a;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: b */
    public final Object mo3721b() {
        return this.f8552c;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: c */
    public final String mo3722c() {
        return this.f8551b;
    }

    @Override // p000.AbstractC3021g0
    /* JADX INFO: renamed from: d */
    public final C3251b mo3723d() {
        return this.f8553d;
    }
}
