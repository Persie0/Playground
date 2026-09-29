package p166i1;

import p351r0.InterfaceC8691j;

/* JADX INFO: renamed from: i1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6135b implements InterfaceC8691j {

    /* JADX INFO: renamed from: a */
    public static final C6135b f35960a = new C6135b();

    /* JADX INFO: renamed from: b */
    public static Boolean f35961b;

    @Override // p351r0.InterfaceC8691j
    /* JADX INFO: renamed from: a */
    public final boolean mo1967a() {
        Boolean bool = f35961b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // p351r0.InterfaceC8691j
    /* JADX INFO: renamed from: b */
    public final void mo1968b(boolean z10) {
        f35961b = Boolean.valueOf(z10);
    }
}
