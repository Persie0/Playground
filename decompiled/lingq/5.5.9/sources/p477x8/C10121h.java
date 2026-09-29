package p477x8;

import android.content.Context;
import p113f9.C5479b;
import p113f9.C5480c;
import p113f9.InterfaceC5478a;
import p371rl.InterfaceC8825a;
import p503y8.C10307c;
import p503y8.InterfaceC10306b;

/* JADX INFO: renamed from: x8.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10121h implements InterfaceC10306b<C10120g> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8825a<Context> f51298a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8825a<InterfaceC5478a> f51299b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8825a<InterfaceC5478a> f51300c;

    public C10121h(C10307c c10307c) {
        C5479b c5479b = C5479b.a.f34066a;
        C5480c c5480c = C5480c.a.f34067a;
        this.f51298a = c10307c;
        this.f51299b = c5479b;
        this.f51300c = c5480c;
    }

    @Override // p371rl.InterfaceC8825a
    public final Object get() {
        return new C10120g(this.f51298a.get(), this.f51299b.get(), this.f51300c.get());
    }
}
