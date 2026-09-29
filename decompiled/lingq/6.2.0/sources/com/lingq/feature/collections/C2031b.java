package com.lingq.feature.collections;

import p000.lda;
import p000.vi3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.collections.b */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2031b implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2034d f25537a;

    public /* synthetic */ C2031b(C2034d c2034d) {
        this.f25537a = c2034d;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            C2034d c2034d = this.f25537a;
            wfb.m23926u(lda.m16103C(c2034d), null, null, new CollectionViewModel$handleDialogConfirmed$2$1$1(c2034d, null), 3);
        }
        return xfa.f68157a;
    }
}
