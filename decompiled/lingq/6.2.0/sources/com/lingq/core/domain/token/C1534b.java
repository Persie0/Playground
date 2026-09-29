package com.lingq.core.domain.token;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.token.TokenMeaning;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.si7;
import p000.vi7;
import p000.w3a;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.token.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1534b {

    /* JADX INFO: renamed from: a */
    public final Object f20097a;

    public C1534b(si7 si7Var) {
        si7Var.getClass();
        this.f20097a = si7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m8212a(boolean z, ContinuationImpl continuationImpl) throws Throwable {
        ShouldAutoPlayTtsUseCase$invoke$1 shouldAutoPlayTtsUseCase$invoke$1;
        if (continuationImpl instanceof ShouldAutoPlayTtsUseCase$invoke$1) {
            shouldAutoPlayTtsUseCase$invoke$1 = (ShouldAutoPlayTtsUseCase$invoke$1) continuationImpl;
            int i = shouldAutoPlayTtsUseCase$invoke$1.f20095d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shouldAutoPlayTtsUseCase$invoke$1.f20095d = i - Integer.MIN_VALUE;
            } else {
                shouldAutoPlayTtsUseCase$invoke$1 = new ShouldAutoPlayTtsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            shouldAutoPlayTtsUseCase$invoke$1 = new ShouldAutoPlayTtsUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = shouldAutoPlayTtsUseCase$invoke$1.f20093b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shouldAutoPlayTtsUseCase$invoke$1.f20095d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            vi7 vi7Var = ((C1368a) ((si7) this.f20097a)).f18362N0;
            shouldAutoPlayTtsUseCase$invoke$1.f20092a = z;
            shouldAutoPlayTtsUseCase$invoke$1.f20095d = 1;
            objM15541t = AbstractC3224d.m15541t(vi7Var, shouldAutoPlayTtsUseCase$invoke$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = shouldAutoPlayTtsUseCase$invoke$1.f20092a;
            AbstractC3193b.m15359b(objM15541t);
        }
        return Boolean.valueOf(((Boolean) objM15541t).booleanValue() && z);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public Object m8213b(String str, String str2, TokenMeaning tokenMeaning, String str3, ContinuationImpl continuationImpl) {
        FlagMeaningUseCase$invoke$1 flagMeaningUseCase$invoke$1;
        if (continuationImpl instanceof FlagMeaningUseCase$invoke$1) {
            flagMeaningUseCase$invoke$1 = (FlagMeaningUseCase$invoke$1) continuationImpl;
            int i = flagMeaningUseCase$invoke$1.f20011c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flagMeaningUseCase$invoke$1.f20011c = i - Integer.MIN_VALUE;
            } else {
                flagMeaningUseCase$invoke$1 = new FlagMeaningUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            flagMeaningUseCase$invoke$1 = new FlagMeaningUseCase$invoke$1(this, continuationImpl);
        }
        FlagMeaningUseCase$invoke$1 flagMeaningUseCase$invoke$2 = flagMeaningUseCase$invoke$1;
        Object obj = flagMeaningUseCase$invoke$2.f20009a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flagMeaningUseCase$invoke$2.f20011c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                w3a w3aVar = (w3a) this.f20097a;
                Integer num = new Integer(0);
                flagMeaningUseCase$invoke$2.f20011c = 1;
                if (w3a.m23700b(w3aVar, str, str2, tokenMeaning, str3, null, num, flagMeaningUseCase$invoke$2, 16) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        } catch (Exception e) {
            return new Result.Failure(e);
        }
    }

    public C1534b(w3a w3aVar) {
        w3aVar.getClass();
        this.f20097a = w3aVar;
    }
}
