package com.lingq.core.p012ui.highlightedtext.domain;

import com.lingq.core.data.repository.C1287c;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3741x;
import p000.c83;
import p000.un0;
import p000.wz0;
import p000.xa2;

/* JADX INFO: renamed from: com.lingq.core.ui.highlightedtext.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1933a {

    /* JADX INFO: renamed from: a */
    public final xa2 f24150a;

    public C1933a(xa2 xa2Var) {
        this.f24150a = xa2Var;
    }

    /* JADX INFO: renamed from: a */
    public final c83 m8800a(String str, Map map) {
        map.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeForLanguageTag2 = Locale.forLanguageTag(str);
        un0 un0Var = ((C1287c) this.f24150a.f67988a).f16453b;
        return AbstractC3224d.m15536o(AbstractC3224d.m15521C(new wz0(8, AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity"}, new C3741x(un0Var, 5))), localeForLanguageTag2), new GetPhrasesForContentUseCase$invoke$1(map, localeForLanguageTag, null)));
    }
}
