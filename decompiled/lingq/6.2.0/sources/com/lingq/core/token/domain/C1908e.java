package com.lingq.core.token.domain;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.token.TokenControllerType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3509qs;
import p000.c83;
import p000.si7;
import p000.vi7;

/* JADX INFO: renamed from: com.lingq.core.token.domain.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1908e {

    /* JADX INFO: renamed from: a */
    public final si7 f23862a;

    public C1908e(C3509qs c3509qs, si7 si7Var) {
        c3509qs.getClass();
        si7Var.getClass();
        this.f23862a = si7Var;
    }

    /* JADX INFO: renamed from: a */
    public c83 m8728a() {
        return AbstractC3224d.m15536o(AbstractC3224d.m15546y(((C1368a) this.f23862a).f18353K0, new ShouldShowKnownWordSuggestionUseCase$invoke$1(2, null)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8729b(TokenControllerType tokenControllerType, ContinuationImpl continuationImpl) throws Throwable {
        ShouldAutoCreateLingqUseCase$invoke$1 shouldAutoCreateLingqUseCase$invoke$1;
        if (continuationImpl instanceof ShouldAutoCreateLingqUseCase$invoke$1) {
            shouldAutoCreateLingqUseCase$invoke$1 = (ShouldAutoCreateLingqUseCase$invoke$1) continuationImpl;
            int i = shouldAutoCreateLingqUseCase$invoke$1.f23837d;
            if ((i & Integer.MIN_VALUE) != 0) {
                shouldAutoCreateLingqUseCase$invoke$1.f23837d = i - Integer.MIN_VALUE;
            } else {
                shouldAutoCreateLingqUseCase$invoke$1 = new ShouldAutoCreateLingqUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            shouldAutoCreateLingqUseCase$invoke$1 = new ShouldAutoCreateLingqUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = shouldAutoCreateLingqUseCase$invoke$1.f23835b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = shouldAutoCreateLingqUseCase$invoke$1.f23837d;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            vi7 vi7Var = ((C1368a) this.f23862a).f18381V0;
            shouldAutoCreateLingqUseCase$invoke$1.f23834a = tokenControllerType;
            shouldAutoCreateLingqUseCase$invoke$1.f23837d = 1;
            objM15541t = AbstractC3224d.m15541t(vi7Var, shouldAutoCreateLingqUseCase$invoke$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tokenControllerType = shouldAutoCreateLingqUseCase$invoke$1.f23834a;
            AbstractC3193b.m15359b(objM15541t);
        }
        if (!((Boolean) objM15541t).booleanValue() || (tokenControllerType != TokenControllerType.Lesson && tokenControllerType != TokenControllerType.LessonExpanded && tokenControllerType != TokenControllerType.LessonVideo)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public C1908e(si7 si7Var) {
        si7Var.getClass();
        this.f23862a = si7Var;
    }
}
