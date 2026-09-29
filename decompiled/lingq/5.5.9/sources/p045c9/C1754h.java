package p045c9;

import android.content.Context;
import java.util.concurrent.Executor;
import p030b9.C1347f;
import p068d9.InterfaceC5089c;
import p068d9.InterfaceC5090d;
import p090e9.InterfaceC5385a;
import p113f9.C5479b;
import p113f9.C5480c;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p477x8.InterfaceC10117d;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: c9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1754h implements InterfaceC10306b<C1753g> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Context> f9639a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<InterfaceC10117d> f9640b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<InterfaceC5090d> f9641c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8825a<InterfaceC1757k> f9642d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8825a<Executor> f9643e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8825a<InterfaceC5385a> f9644f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8825a<InterfaceC5478a> f9645g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC8825a<InterfaceC5478a> f9646h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC8825a<InterfaceC5089c> f9647i;

    public C1754h(InterfaceC8825a interfaceC8825a, InterfaceC8825a interfaceC8825a2, InterfaceC8825a interfaceC8825a3, C1347f c1347f, InterfaceC8825a interfaceC8825a4, InterfaceC8825a interfaceC8825a5, InterfaceC8825a interfaceC8825a6) {
        C5479b c5479b = C5479b.a.f34066a;
        C5480c c5480c = C5480c.a.f34067a;
        this.f9639a = interfaceC8825a;
        this.f9640b = interfaceC8825a2;
        this.f9641c = interfaceC8825a3;
        this.f9642d = c1347f;
        this.f9643e = interfaceC8825a4;
        this.f9644f = interfaceC8825a5;
        this.f9645g = c5479b;
        this.f9646h = c5480c;
        this.f9647i = interfaceC8825a6;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new C1753g(this.f9639a.get(), this.f9640b.get(), this.f9641c.get(), this.f9642d.get(), this.f9643e.get(), this.f9644f.get(), this.f9645g.get(), this.f9646h.get(), this.f9647i.get());
    }
}
