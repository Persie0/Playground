package com.bumptech.glide.load.engine;

import ae.C0062b;
import p356r5.InterfaceC8732b;
import p392t5.InterfaceC9207m;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2121g<Z> implements InterfaceC9207m<Z> {

    /* JADX INFO: renamed from: a */
    public final boolean f10773a;

    /* JADX INFO: renamed from: b */
    public final boolean f10774b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9207m<Z> f10775c;

    /* JADX INFO: renamed from: d */
    public final a f10776d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8732b f10777e;

    /* JADX INFO: renamed from: f */
    public int f10778f;

    /* JADX INFO: renamed from: g */
    public boolean f10779g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo6316a(InterfaceC8732b interfaceC8732b, C2121g<?> c2121g);
    }

    public C2121g(InterfaceC9207m<Z> interfaceC9207m, boolean z10, boolean z11, InterfaceC8732b interfaceC8732b, a aVar) {
        C0062b.m345f0(interfaceC9207m);
        this.f10775c = interfaceC9207m;
        this.f10773a = z10;
        this.f10774b = z11;
        this.f10777e = interfaceC8732b;
        C0062b.m345f0(aVar);
        this.f10776d = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6329a() {
        try {
            if (this.f10779g) {
                throw new IllegalStateException("Cannot acquire a recycled resource");
            }
            this.f10778f++;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final synchronized void mo157b() {
        try {
            if (this.f10778f > 0) {
                throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
            }
            if (this.f10779g) {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
            this.f10779g = true;
            if (this.f10774b) {
                this.f10775c.mo157b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        return this.f10775c.mo158c();
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<Z> mo159d() {
        return this.f10775c.mo159d();
    }

    /* JADX INFO: renamed from: e */
    public final void m6330e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f10778f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f10778f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f10776d.mo6316a(this.f10777e, this);
        }
    }

    @Override // p392t5.InterfaceC9207m
    public final Z get() {
        return this.f10775c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f10773a + ", listener=" + this.f10776d + ", key=" + this.f10777e + ", acquired=" + this.f10778f + ", isRecycled=" + this.f10779g + ", resource=" + this.f10775c + '}';
    }
}
