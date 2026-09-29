package p045c9;

import java.util.concurrent.Executor;
import p030b9.C1347f;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p371rl.InterfaceC8825a;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: c9.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1756j implements InterfaceC10306b<C1755i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Executor> f9652a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<InterfaceC5090d> f9653b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<InterfaceC1757k> f9654c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8825a<InterfaceC5385a> f9655d;

    public C1756j(InterfaceC8825a interfaceC8825a, InterfaceC8825a interfaceC8825a2, C1347f c1347f, InterfaceC8825a interfaceC8825a3) {
        this.f9652a = interfaceC8825a;
        this.f9653b = interfaceC8825a2;
        this.f9654c = c1347f;
        this.f9655d = interfaceC8825a3;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new C1755i(this.f9652a.get(), this.f9653b.get(), this.f9654c.get(), this.f9655d.get());
    }
}
