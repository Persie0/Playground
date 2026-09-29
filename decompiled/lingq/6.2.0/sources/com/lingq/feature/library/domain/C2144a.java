package com.lingq.feature.library.domain;

import com.lingq.core.datastore.C1371d;
import java.time.LocalDate;
import kotlinx.coroutines.flow.C3228h;
import p000.cm3;
import p000.km3;
import p000.vma;

/* JADX INFO: renamed from: com.lingq.feature.library.domain.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2144a {
    private static final km3 Companion = new km3();

    /* JADX INFO: renamed from: a */
    public final cm3 f26647a;

    /* JADX INFO: renamed from: b */
    public final vma f26648b;

    public C2144a(cm3 cm3Var, vma vmaVar) {
        vmaVar.getClass();
        this.f26647a = cm3Var;
        this.f26648b = vmaVar;
    }

    /* JADX INFO: renamed from: a */
    public static C3228h m9061a(C2144a c2144a, String str) {
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        c2144a.getClass();
        str.getClass();
        return new C3228h(cm3.m4856b(c2144a.f26647a, str), ((C1371d) c2144a.f26648b).f18586w, new GetLibraryCupBannerUseCase$invoke$1(c2144a, localDateNow, null));
    }
}
