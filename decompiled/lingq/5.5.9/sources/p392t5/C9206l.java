package p392t5;

import p272n6.AbstractC7712d;
import p272n6.C7709a;

/* JADX INFO: renamed from: t5.l */
/* JADX INFO: loaded from: classes.dex */
public final class C9206l<Z> implements InterfaceC9207m<Z>, C7709a.d {

    /* JADX INFO: renamed from: e */
    public static final C7709a.c f47764e = C7709a.m15302a(20, new a());

    /* JADX INFO: renamed from: a */
    public final AbstractC7712d.a f47765a = new AbstractC7712d.a();

    /* JADX INFO: renamed from: b */
    public InterfaceC9207m<Z> f47766b;

    /* JADX INFO: renamed from: c */
    public boolean f47767c;

    /* JADX INFO: renamed from: d */
    public boolean f47768d;

    /* JADX INFO: renamed from: t5.l$a */
    public class a implements C7709a.b<C9206l<?>> {
        @Override // p272n6.C7709a.b
        /* JADX INFO: renamed from: a */
        public final C9206l<?> mo6320a() {
            return new C9206l<>();
        }
    }

    @Override // p272n6.C7709a.d
    /* JADX INFO: renamed from: a */
    public final AbstractC7712d.a mo6281a() {
        return this.f47765a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: b */
    public final synchronized void mo157b() {
        try {
            this.f47765a.m15304a();
            this.f47768d = true;
            if (!this.f47767c) {
                this.f47766b.mo157b();
                this.f47766b = null;
                f47764e.mo11464a(this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: c */
    public final int mo158c() {
        return this.f47766b.mo158c();
    }

    @Override // p392t5.InterfaceC9207m
    /* JADX INFO: renamed from: d */
    public final Class<Z> mo159d() {
        return this.f47766b.mo159d();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m17546e() {
        this.f47765a.m15304a();
        if (!this.f47767c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f47767c = false;
        if (this.f47768d) {
            mo157b();
        }
    }

    @Override // p392t5.InterfaceC9207m
    public final Z get() {
        return this.f47766b.get();
    }
}
