package com.lingq.p055ui.home.vocabulary.filter;

import com.lingq.commons.p053ui.views.DiscreteSlider;
import kotlin.Pair;
import p278nh.AbstractC7787n;

/* JADX INFO: renamed from: com.lingq.ui.home.vocabulary.filter.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4082d implements DiscreteSlider.InterfaceC3277a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC7787n.g f26548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4079a f26549b;

    public C4082d(AbstractC7787n.g gVar, C4079a c4079a) {
        this.f26548a = gVar;
        this.f26549b = c4079a;
    }

    @Override // com.lingq.commons.p053ui.views.DiscreteSlider.InterfaceC3277a
    /* JADX INFO: renamed from: a */
    public final void mo9349a(int i10, int i11) {
        AbstractC7787n.g gVar = this.f26548a;
        if (i10 != ((int) gVar.f42757c) || i11 != ((int) gVar.f42758d)) {
            this.f26549b.f26529f.mo9848b(gVar.f42759e, new Pair(Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }
}
