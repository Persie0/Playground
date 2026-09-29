package no;

import p003a2.C0009a;

/* JADX INFO: renamed from: no.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7844k0 implements InterfaceC7862q0 {

    /* JADX INFO: renamed from: a */
    public final boolean f42942a;

    public C7844k0(boolean z10) {
        this.f42942a = z10;
    }

    @Override // no.InterfaceC7862q0
    /* JADX INFO: renamed from: b */
    public final boolean mo15561b() {
        return this.f42942a;
    }

    @Override // no.InterfaceC7862q0
    /* JADX INFO: renamed from: j */
    public final C7824d1 mo15562j() {
        return null;
    }

    public final String toString() {
        return C0009a.m22j(new StringBuilder("Empty{"), this.f42942a ? "Active" : "New", '}');
    }
}
