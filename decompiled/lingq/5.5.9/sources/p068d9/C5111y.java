package p068d9;

import android.content.Context;
import p371rl.InterfaceC8825a;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: d9.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5111y implements InterfaceC10306b<C5110x> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Context> f33074a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<String> f33075b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<Integer> f33076c;

    public C5111y(InterfaceC8825a interfaceC8825a) {
        C5092f c5092f = C5092f.a.f33032a;
        C5093g c5093g = C5093g.a.f33033a;
        this.f33074a = interfaceC8825a;
        this.f33075b = c5092f;
        this.f33076c = c5093g;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new C5110x(this.f33074a.get(), this.f33076c.get().intValue(), this.f33075b.get());
    }
}
