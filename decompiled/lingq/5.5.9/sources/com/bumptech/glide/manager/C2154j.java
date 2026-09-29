package com.bumptech.glide.manager;

import androidx.view.C1052r;
import androidx.view.Lifecycle;

/* JADX INFO: renamed from: com.bumptech.glide.manager.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2154j implements InterfaceC2153i {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lifecycle f10859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2155k f10860b;

    public C2154j(C2155k c2155k, C1052r c1052r) {
        this.f10860b = c2155k;
        this.f10859a = c1052r;
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: a */
    public final void mo6252a() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: b */
    public final void mo6253b() {
    }

    @Override // com.bumptech.glide.manager.InterfaceC2153i
    /* JADX INFO: renamed from: h */
    public final void mo6257h() {
        this.f10860b.f10861a.remove(this.f10859a);
    }
}
