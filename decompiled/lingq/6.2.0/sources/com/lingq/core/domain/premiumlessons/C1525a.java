package com.lingq.core.domain.premiumlessons;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.d65;
import p000.nm7;
import p000.qm7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.premiumlessons.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1525a {

    /* JADX INFO: renamed from: a */
    public final d65 f19958a;

    /* JADX INFO: renamed from: b */
    public final nm7 f19959b;

    public C1525a(d65 d65Var, nm7 nm7Var) {
        d65Var.getClass();
        nm7Var.getClass();
        this.f19958a = d65Var;
        this.f19959b = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r3).m7920g(r11, r0) == r1) goto L27;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m8202a(int i, int i2, int i3, ContinuationImpl continuationImpl) throws Throwable {
        BuyPremiumLessonUseCase$invoke$1 buyPremiumLessonUseCase$invoke$1;
        int i4;
        int i5;
        int i6;
        if (continuationImpl instanceof BuyPremiumLessonUseCase$invoke$1) {
            buyPremiumLessonUseCase$invoke$1 = (BuyPremiumLessonUseCase$invoke$1) continuationImpl;
            int i7 = buyPremiumLessonUseCase$invoke$1.f19957f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                buyPremiumLessonUseCase$invoke$1.f19957f = i7 - Integer.MIN_VALUE;
            } else {
                buyPremiumLessonUseCase$invoke$1 = new BuyPremiumLessonUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            buyPremiumLessonUseCase$invoke$1 = new BuyPremiumLessonUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = buyPremiumLessonUseCase$invoke$1.f19955d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = buyPremiumLessonUseCase$invoke$1.f19957f;
        nm7 nm7Var = this.f19959b;
        if (i8 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            buyPremiumLessonUseCase$invoke$1.f19952a = i;
            buyPremiumLessonUseCase$invoke$1.f19953b = i2;
            buyPremiumLessonUseCase$invoke$1.f19954c = i3;
            buyPremiumLessonUseCase$invoke$1.f19957f = 1;
            if (((C1295k) this.f19958a).m7274f(i, i2, true, buyPremiumLessonUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i8 == 1) {
            i3 = buyPremiumLessonUseCase$invoke$1.f19954c;
            i2 = buyPremiumLessonUseCase$invoke$1.f19953b;
            i = buyPremiumLessonUseCase$invoke$1.f19952a;
            AbstractC3193b.m15359b(objM15541t);
        } else if (i8 == 2) {
            i6 = buyPremiumLessonUseCase$invoke$1.f19954c;
            i5 = buyPremiumLessonUseCase$invoke$1.f19953b;
            i4 = buyPremiumLessonUseCase$invoke$1.f19952a;
            AbstractC3193b.m15359b(objM15541t);
            Profile profile = (Profile) objM15541t;
            profile.f19671t -= i6;
            buyPremiumLessonUseCase$invoke$1.f19952a = i4;
            buyPremiumLessonUseCase$invoke$1.f19953b = i5;
            buyPremiumLessonUseCase$invoke$1.f19954c = i6;
            buyPremiumLessonUseCase$invoke$1.f19957f = 3;
        } else {
            if (i8 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        qm7 qm7Var = ((C1369b) nm7Var).f18480m;
        buyPremiumLessonUseCase$invoke$1.f19952a = i;
        buyPremiumLessonUseCase$invoke$1.f19953b = i2;
        buyPremiumLessonUseCase$invoke$1.f19954c = i3;
        buyPremiumLessonUseCase$invoke$1.f19957f = 2;
        objM15541t = AbstractC3224d.m15541t(qm7Var, buyPremiumLessonUseCase$invoke$1);
        if (objM15541t != coroutineSingletons) {
            int i9 = i2;
            i4 = i;
            i5 = i9;
            i6 = i3;
            Profile profile2 = (Profile) objM15541t;
            profile2.f19671t -= i6;
            buyPremiumLessonUseCase$invoke$1.f19952a = i4;
            buyPremiumLessonUseCase$invoke$1.f19953b = i5;
            buyPremiumLessonUseCase$invoke$1.f19954c = i6;
            buyPremiumLessonUseCase$invoke$1.f19957f = 3;
        }
        return coroutineSingletons;
    }
}
