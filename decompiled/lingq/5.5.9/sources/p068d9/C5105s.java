package p068d9;

import p113f9.C5479b;
import p113f9.C5480c;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: d9.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5105s implements InterfaceC10306b<C5104r> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<InterfaceC5478a> f33063a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<InterfaceC5478a> f33064b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<AbstractC5091e> f33065c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8825a<C5110x> f33066d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8825a<String> f33067e;

    public C5105s(InterfaceC8825a interfaceC8825a, InterfaceC8825a interfaceC8825a2) {
        C5479b c5479b = C5479b.a.f34066a;
        C5480c c5480c = C5480c.a.f34067a;
        C5094h c5094h = C5094h.a.f33034a;
        this.f33063a = c5479b;
        this.f33064b = c5480c;
        this.f33065c = c5094h;
        this.f33066d = interfaceC8825a;
        this.f33067e = interfaceC8825a2;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        InterfaceC5478a interfaceC5478a = this.f33063a.get();
        InterfaceC5478a interfaceC5478a2 = this.f33064b.get();
        AbstractC5091e abstractC5091e = this.f33065c.get();
        return new C5104r(interfaceC5478a, interfaceC5478a2, abstractC5091e, this.f33066d.get(), this.f33067e);
    }
}
