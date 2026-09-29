package com.lingq.core.token.domain;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.domain.model.lesson.TokenType;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.c83;
import p000.g91;
import p000.um3;
import p000.w3a;

/* JADX INFO: renamed from: com.lingq.core.token.domain.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1907d {

    /* JADX INFO: renamed from: a */
    public final w3a f23861a;

    public C1907d(w3a w3aVar, int i) {
        w3aVar.getClass();
        switch (i) {
            case 1:
                this.f23861a = w3aVar;
                break;
            default:
                this.f23861a = w3aVar;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public c83 m8726a(String str, String str2, TokenType tokenType, String str3, int i) {
        str.getClass();
        str2.getClass();
        tokenType.getClass();
        str3.getClass();
        return AbstractC3224d.m15536o(AbstractC1261a.m7043b(new um3(this, str, str2, tokenType, str3, i), new GetRelatedPhrasesUseCase$invoke$2(this, str, str2, tokenType, str3, i, null)));
    }

    /* JADX INFO: renamed from: b */
    public c83 m8727b(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15546y(AbstractC1261a.m7044c(new g91(this, str, str2, str3, 4), new GetPopularMeaningsUseCase$invoke$2(this, str, str2, str3, null)), new GetPopularMeaningsUseCase$invoke$3(2, null)));
    }
}
