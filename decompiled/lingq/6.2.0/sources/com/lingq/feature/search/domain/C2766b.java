package com.lingq.feature.search.domain;

import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.nm7;
import p000.qm7;

/* JADX INFO: renamed from: com.lingq.feature.search.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2766b {

    /* JADX INFO: renamed from: a */
    public final nm7 f32830a;

    public C2766b(nm7 nm7Var) {
        nm7Var.getClass();
        this.f32830a = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9674a(ContinuationImpl continuationImpl) throws Throwable {
        GetSearchProfileUsernameUseCase$invoke$1 getSearchProfileUsernameUseCase$invoke$1;
        if (continuationImpl instanceof GetSearchProfileUsernameUseCase$invoke$1) {
            getSearchProfileUsernameUseCase$invoke$1 = (GetSearchProfileUsernameUseCase$invoke$1) continuationImpl;
            int i = getSearchProfileUsernameUseCase$invoke$1.f32827c;
            if ((i & Integer.MIN_VALUE) != 0) {
                getSearchProfileUsernameUseCase$invoke$1.f32827c = i - Integer.MIN_VALUE;
            } else {
                getSearchProfileUsernameUseCase$invoke$1 = new GetSearchProfileUsernameUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getSearchProfileUsernameUseCase$invoke$1 = new GetSearchProfileUsernameUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = getSearchProfileUsernameUseCase$invoke$1.f32825a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getSearchProfileUsernameUseCase$invoke$1.f32827c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            qm7 qm7Var = ((C1369b) this.f32830a).f18480m;
            getSearchProfileUsernameUseCase$invoke$1.f32827c = 1;
            objM15541t = AbstractC3224d.m15541t(qm7Var, getSearchProfileUsernameUseCase$invoke$1);
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
}
