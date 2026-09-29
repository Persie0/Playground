package com.lingq.core.domain.token;

import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.lesson.TokenType;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.kk8;
import p000.o7b;
import p000.s7b;
import p000.vz1;
import p000.xca;

/* JADX INFO: renamed from: com.lingq.core.domain.token.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1537e {

    /* JADX INFO: renamed from: a */
    public final s7b f20103a;

    public C1537e(s7b s7bVar, int i) {
        s7bVar.getClass();
        switch (i) {
            case 1:
                this.f20103a = s7bVar;
                break;
            default:
                this.f20103a = s7bVar;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public kk8 m8222a(String str, List list) {
        str.getClass();
        list.getClass();
        return new kk8(new GetWordsForTokensUseCase$invoke$1(list, this, str, Locale.forLanguageTag(str), null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Enum m8223b(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetTokenTypeForTermUseCase$invoke$1 getTokenTypeForTermUseCase$invoke$1;
        if (continuationImpl instanceof GetTokenTypeForTermUseCase$invoke$1) {
            getTokenTypeForTermUseCase$invoke$1 = (GetTokenTypeForTermUseCase$invoke$1) continuationImpl;
            int i = getTokenTypeForTermUseCase$invoke$1.f20072c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getTokenTypeForTermUseCase$invoke$1.f20072c = i - Integer.MIN_VALUE;
            } else {
                getTokenTypeForTermUseCase$invoke$1 = new GetTokenTypeForTermUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getTokenTypeForTermUseCase$invoke$1 = new GetTokenTypeForTermUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = getTokenTypeForTermUseCase$invoke$1.f20070a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getTokenTypeForTermUseCase$invoke$1.f20072c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            C1310z c1310z = (C1310z) this.f20103a;
            c1310z.getClass();
            str.getClass();
            str2.getClass();
            o7b o7bVar = c1310z.f16576a;
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            o7bVar.getClass();
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(o7bVar.f53957K, false, new String[]{"WordEntity"}, new xca(strM23629f, 5)));
            getTokenTypeForTermUseCase$invoke$1.f20072c = 1;
            objM15541t = AbstractC3224d.m15541t(c83VarM15536o, getTokenTypeForTermUseCase$invoke$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        Integer num = (Integer) objM15541t;
        return (num != null ? num.intValue() : 0) > 0 ? TokenType.WordType : TokenType.NewWordOrPhraseType;
    }
}
