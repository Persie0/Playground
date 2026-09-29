package com.lingq.feature.onboarding.dictionary;

import android.content.Context;
import com.lingq.core.data.repository.C1297m;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.c18;
import p000.g41;
import p000.hm5;
import p000.l83;
import p000.lda;
import p000.lp4;
import p000.m83;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.dictionary.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2206a extends wta {

    /* JADX INFO: renamed from: b */
    public final C1297m f27214b;

    /* JADX INFO: renamed from: c */
    public final Context f27215c;

    /* JADX INFO: renamed from: d */
    public final C3244l f27216d;

    /* JADX INFO: renamed from: e */
    public final c18 f27217e;

    public C2206a(hm5 hm5Var, C1297m c1297m, Context context) {
        hm5Var.getClass();
        c1297m.getClass();
        this.f27214b = c1297m;
        this.f27215c = context;
        l83 l83Var = new l83(new m83(AbstractC3224d.m15546y(c1297m.m7329c(), new OnboardingDictionaryLocaleViewModel$_locales$1(this, null)), new OnboardingDictionaryLocaleViewModel$_locales$2(this, null)), new OnboardingDictionaryLocaleViewModel$_locales$3(3, null), 1);
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        EmptyList emptyList = EmptyList.f47638a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(l83Var, g41VarM16103C, c3243k, emptyList);
        C3244l c3244lM17114d = AbstractC3352my.m17114d("");
        this.f27216d = c3244lM17114d;
        this.f27217e = AbstractC3224d.m15520B(new C3228h(c18VarM15520B, c3244lM17114d, new OnboardingDictionaryLocaleViewModel$languagesListUiState$1(3, null)), lda.m16103C(this), c3243k, new lp4(emptyList, ""));
    }
}
