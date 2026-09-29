package com.lingq.feature.collections.domain;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.user.C1539a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.i78;
import p000.j78;
import p000.nm7;
import p000.qm7;

/* JADX INFO: renamed from: com.lingq.feature.collections.domain.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C2038d {

    /* JADX INFO: renamed from: a */
    public final Object f25651a;

    public C2038d(nm7 nm7Var) {
        nm7Var.getClass();
        this.f25651a = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public Object m8960a(int i, ContinuationImpl continuationImpl) throws Throwable {
        RequestPremiumContentUseCase$invoke$1 requestPremiumContentUseCase$invoke$1;
        if (continuationImpl instanceof RequestPremiumContentUseCase$invoke$1) {
            requestPremiumContentUseCase$invoke$1 = (RequestPremiumContentUseCase$invoke$1) continuationImpl;
            int i2 = requestPremiumContentUseCase$invoke$1.f25636d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                requestPremiumContentUseCase$invoke$1.f25636d = i2 - Integer.MIN_VALUE;
            } else {
                requestPremiumContentUseCase$invoke$1 = new RequestPremiumContentUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            requestPremiumContentUseCase$invoke$1 = new RequestPremiumContentUseCase$invoke$1(this, continuationImpl);
        }
        Object objM8225a = requestPremiumContentUseCase$invoke$1.f25634b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = requestPremiumContentUseCase$invoke$1.f25636d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM8225a);
            C1539a c1539a = (C1539a) this.f25651a;
            requestPremiumContentUseCase$invoke$1.f25633a = i;
            requestPremiumContentUseCase$invoke$1.f25636d = 1;
            objM8225a = c1539a.m8225a(requestPremiumContentUseCase$invoke$1);
            if (objM8225a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = requestPremiumContentUseCase$invoke$1.f25633a;
            AbstractC3193b.m15359b(objM8225a);
        }
        int iIntValue = ((Number) objM8225a).intValue();
        return iIntValue < i ? new j78(i, iIntValue) : new i78(i, iIntValue);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8961b(ContinuationImpl continuationImpl) throws Throwable {
        GetCollectionProfileUsernameUseCase$invoke$1 getCollectionProfileUsernameUseCase$invoke$1;
        if (continuationImpl instanceof GetCollectionProfileUsernameUseCase$invoke$1) {
            getCollectionProfileUsernameUseCase$invoke$1 = (GetCollectionProfileUsernameUseCase$invoke$1) continuationImpl;
            int i = getCollectionProfileUsernameUseCase$invoke$1.f25632c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getCollectionProfileUsernameUseCase$invoke$1.f25632c = i - Integer.MIN_VALUE;
            } else {
                getCollectionProfileUsernameUseCase$invoke$1 = new GetCollectionProfileUsernameUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getCollectionProfileUsernameUseCase$invoke$1 = new GetCollectionProfileUsernameUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = getCollectionProfileUsernameUseCase$invoke$1.f25630a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getCollectionProfileUsernameUseCase$invoke$1.f25632c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) ((nm7) this.f25651a)).f18480m;
            getCollectionProfileUsernameUseCase$invoke$1.f25632c = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, getCollectionProfileUsernameUseCase$invoke$1);
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
        return ((Profile) objM15541t).f19654c;
    }

    public C2038d(C1539a c1539a) {
        this.f25651a = c1539a;
    }
}
