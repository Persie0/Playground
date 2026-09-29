package com.lingq.core.domain.language;

import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.fa4;
import p000.lm4;

/* JADX INFO: renamed from: com.lingq.core.domain.language.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1377a {

    /* JADX INFO: renamed from: a */
    public final lm4 f18643a;

    public C1377a(lm4 lm4Var) {
        lm4Var.getClass();
        this.f18643a = lm4Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:24:0x0064->B:32:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7983a(String str, ContinuationImpl continuationImpl) throws Throwable {
        DeleteLanguageUseCase$invoke$1 deleteLanguageUseCase$invoke$1;
        String str2;
        if (continuationImpl instanceof DeleteLanguageUseCase$invoke$1) {
            deleteLanguageUseCase$invoke$1 = (DeleteLanguageUseCase$invoke$1) continuationImpl;
            int i = deleteLanguageUseCase$invoke$1.f18639d;
            if ((i & Integer.MIN_VALUE) != 0) {
                deleteLanguageUseCase$invoke$1.f18639d = i - Integer.MIN_VALUE;
            } else {
                deleteLanguageUseCase$invoke$1 = new DeleteLanguageUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            deleteLanguageUseCase$invoke$1 = new DeleteLanguageUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = deleteLanguageUseCase$invoke$1.f18637b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = deleteLanguageUseCase$invoke$1.f18639d;
        lm4 lm4Var = this.f18643a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            deleteLanguageUseCase$invoke$1.f18636a = str;
            deleteLanguageUseCase$invoke$1.f18639d = 1;
            if (((C1293i) lm4Var).m7205b(str, deleteLanguageUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = deleteLanguageUseCase$invoke$1.f18636a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = deleteLanguageUseCase$invoke$1.f18636a;
            AbstractC3193b.m15359b(objM15541t);
        }
        for (Object obj : (Iterable) objM15541t) {
            if (!fa4.m11650l(((Language) obj).f19024a, str2)) {
                return obj;
            }
        }
        return null;
        c83 c83VarM7216m = ((C1293i) lm4Var).m7216m();
        deleteLanguageUseCase$invoke$1.f18636a = str;
        deleteLanguageUseCase$invoke$1.f18639d = 2;
        objM15541t = AbstractC3224d.m15541t(c83VarM7216m, deleteLanguageUseCase$invoke$1);
        if (objM15541t != coroutineSingletons) {
            str2 = str;
            while (r7.hasNext()) {
                if (!fa4.m11650l(((Language) obj).f19024a, str2)) {
                    return obj;
                }
            }
            return null;
        }
        return coroutineSingletons;
    }
}
