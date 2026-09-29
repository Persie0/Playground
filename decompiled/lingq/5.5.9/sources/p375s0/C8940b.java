package p375s0;

import ae.C0062b;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8940b {

    /* JADX INFO: renamed from: a */
    public float f46884a = 0.0f;

    /* JADX INFO: renamed from: b */
    public float f46885b = 0.0f;

    /* JADX INFO: renamed from: c */
    public float f46886c = 0.0f;

    /* JADX INFO: renamed from: d */
    public float f46887d = 0.0f;

    /* JADX INFO: renamed from: a */
    public final void m17160a(float f3, float f10, float f11, float f12) {
        this.f46884a = Math.max(f3, this.f46884a);
        this.f46885b = Math.max(f10, this.f46885b);
        this.f46886c = Math.min(f11, this.f46886c);
        this.f46887d = Math.min(f12, this.f46887d);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17161b() {
        return this.f46884a >= this.f46886c || this.f46885b >= this.f46887d;
    }

    public final String toString() {
        return "MutableRect(" + C0062b.m391r2(this.f46884a) + ", " + C0062b.m391r2(this.f46885b) + ", " + C0062b.m391r2(this.f46886c) + ", " + C0062b.m391r2(this.f46887d) + ')';
    }
}
