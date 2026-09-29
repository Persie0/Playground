package p360r9;

import p261m9.C7521v;
import p261m9.InterfaceC7509j;
import p261m9.InterfaceC7520u;
import p261m9.InterfaceC7522w;

/* JADX INFO: renamed from: r9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8751d implements InterfaceC7509j {

    /* JADX INFO: renamed from: a */
    public final long f46399a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7509j f46400b;

    /* JADX INFO: renamed from: r9.d$a */
    public class a implements InterfaceC7520u {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC7520u f46401a;

        public a(InterfaceC7520u interfaceC7520u) {
            this.f46401a = interfaceC7520u;
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: b */
        public final boolean mo14982b() {
            return this.f46401a.mo14982b();
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: h */
        public final InterfaceC7520u.a mo14983h(long j10) {
            InterfaceC7520u.a aVarMo14983h = this.f46401a.mo14983h(j10);
            C7521v c7521v = aVarMo14983h.f41517a;
            long j11 = c7521v.f41522a;
            long j12 = c7521v.f41523b;
            long j13 = C8751d.this.f46399a;
            C7521v c7521v2 = new C7521v(j11, j12 + j13);
            C7521v c7521v3 = aVarMo14983h.f41518b;
            return new InterfaceC7520u.a(c7521v2, new C7521v(c7521v3.f41522a, c7521v3.f41523b + j13));
        }

        @Override // p261m9.InterfaceC7520u
        /* JADX INFO: renamed from: i */
        public final long mo14984i() {
            return this.f46401a.mo14984i();
        }
    }

    public C8751d(long j10, InterfaceC7509j interfaceC7509j) {
        this.f46399a = j10;
        this.f46400b = interfaceC7509j;
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: c */
    public final void mo7364c(InterfaceC7520u interfaceC7520u) {
        this.f46400b.mo7364c(new a(interfaceC7520u));
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: i */
    public final void mo7365i() {
        this.f46400b.mo7365i();
    }

    @Override // p261m9.InterfaceC7509j
    /* JADX INFO: renamed from: q */
    public final InterfaceC7522w mo7366q(int i10, int i11) {
        return this.f46400b.mo7366q(i10, i11);
    }
}
