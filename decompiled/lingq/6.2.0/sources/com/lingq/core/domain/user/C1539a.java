package com.lingq.core.domain.user;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.nm7;
import p000.qm7;

/* JADX INFO: renamed from: com.lingq.core.domain.user.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1539a {

    /* JADX INFO: renamed from: a */
    public final nm7 f20108a;

    public C1539a(nm7 nm7Var) {
        nm7Var.getClass();
        this.f20108a = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8225a(ContinuationImpl continuationImpl) throws Throwable {
        GetUserBalanceUseCase$invoke$1 getUserBalanceUseCase$invoke$1;
        if (continuationImpl instanceof GetUserBalanceUseCase$invoke$1) {
            getUserBalanceUseCase$invoke$1 = (GetUserBalanceUseCase$invoke$1) continuationImpl;
            int i = getUserBalanceUseCase$invoke$1.f20107c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getUserBalanceUseCase$invoke$1.f20107c = i - Integer.MIN_VALUE;
            } else {
                getUserBalanceUseCase$invoke$1 = new GetUserBalanceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getUserBalanceUseCase$invoke$1 = new GetUserBalanceUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = getUserBalanceUseCase$invoke$1.f20105a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getUserBalanceUseCase$invoke$1.f20107c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) this.f20108a).f18480m;
            getUserBalanceUseCase$invoke$1.f20107c = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, getUserBalanceUseCase$invoke$1);
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
        return new Integer(((Profile) objM15541t).f19671t);
    }
}
