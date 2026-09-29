package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1294j;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.util.AbstractC1543a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.oo4;
import p000.si7;
import p000.ui3;
import p000.vma;

/* JADX INFO: renamed from: com.lingq.core.domain.library.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1392g {

    /* JADX INFO: renamed from: a */
    public final oo4 f18839a;

    /* JADX INFO: renamed from: b */
    public final vma f18840b;

    /* JADX INFO: renamed from: c */
    public final si7 f18841c;

    public C1392g(oo4 oo4Var, vma vmaVar, si7 si7Var) {
        oo4Var.getClass();
        vmaVar.getClass();
        si7Var.getClass();
        this.f18839a = oo4Var;
        this.f18840b = vmaVar;
        this.f18841c = si7Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m8010a(final String str) {
        str.getClass();
        return AbstractC3224d.m15536o(AbstractC1543a.m8226a(new ui3() { // from class: com.lingq.core.domain.library.f
            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                C1392g c1392g = this.f18837a;
                oo4 oo4Var = c1392g.f18839a;
                String str2 = str;
                return AbstractC3224d.m15531j(((C1294j) oo4Var).m7237k(str2), ((C1294j) oo4Var).m7238l(str2), ((C1368a) c1392g.f18841c).f18413h1, ((C1371d) c1392g.f18840b).f18588y, new GetStreakInfoUseCase$invoke$1$1(str2, null));
            }
        }, new GetStreakInfoUseCase$invoke$2(this, str, null)));
    }
}
