package p219ka;

import java.util.List;
import p218k9.AbstractC6636f;

/* JADX INFO: renamed from: ka.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6650k extends AbstractC6636f implements InterfaceC6646g {

    /* JADX INFO: renamed from: c */
    public InterfaceC6646g f37701c;

    /* JADX INFO: renamed from: d */
    public long f37702d;

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: a */
    public final int mo11452a(long j10) {
        InterfaceC6646g interfaceC6646g = this.f37701c;
        interfaceC6646g.getClass();
        return interfaceC6646g.mo11452a(j10 - this.f37702d);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: f */
    public final long mo11455f(int i10) {
        InterfaceC6646g interfaceC6646g = this.f37701c;
        interfaceC6646g.getClass();
        return interfaceC6646g.mo11455f(i10) + this.f37702d;
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: g */
    public final List<C6640a> mo11456g(long j10) {
        InterfaceC6646g interfaceC6646g = this.f37701c;
        interfaceC6646g.getClass();
        return interfaceC6646g.mo11456g(j10 - this.f37702d);
    }

    @Override // p219ka.InterfaceC6646g
    /* JADX INFO: renamed from: i */
    public final int mo11457i() {
        InterfaceC6646g interfaceC6646g = this.f37701c;
        interfaceC6646g.getClass();
        return interfaceC6646g.mo11457i();
    }

    /* JADX INFO: renamed from: q */
    public final void m13282q(long j10, InterfaceC6646g interfaceC6646g, long j11) {
        this.f37616b = j10;
        this.f37701c = interfaceC6646g;
        if (j11 != Long.MAX_VALUE) {
            j10 = j11;
        }
        this.f37702d = j10;
    }
}
