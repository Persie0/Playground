package p477x8;

import android.content.Context;
import p371rl.InterfaceC8825a;
import p503y8.C10307c;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: x8.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10123j implements InterfaceC10306b<C10122i> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Context> f51306a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<C10120g> f51307b;

    public C10123j(C10307c c10307c, C10121h c10121h) {
        this.f51306a = c10307c;
        this.f51307b = c10121h;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new C10122i(this.f51306a.get(), this.f51307b.get());
    }
}
