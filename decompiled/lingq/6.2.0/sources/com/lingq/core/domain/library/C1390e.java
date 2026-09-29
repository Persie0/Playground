package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1296l;
import com.lingq.core.domain.model.library.LibraryShelf;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.y95;

/* JADX INFO: renamed from: com.lingq.core.domain.library.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C1390e {

    /* JADX INFO: renamed from: a */
    public final y95 f18836a;

    public C1390e(y95 y95Var) {
        y95Var.getClass();
        this.f18836a = y95Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m8009a(String str, ContinuationImpl continuationImpl) throws Throwable {
        GetRecommendationsShelfUseCase$invoke$1 getRecommendationsShelfUseCase$invoke$1;
        LibraryShelf libraryShelf;
        Object objM7507E0;
        if (continuationImpl instanceof GetRecommendationsShelfUseCase$invoke$1) {
            getRecommendationsShelfUseCase$invoke$1 = (GetRecommendationsShelfUseCase$invoke$1) continuationImpl;
            int i = getRecommendationsShelfUseCase$invoke$1.f18783d;
            if ((i & Integer.MIN_VALUE) != 0) {
                getRecommendationsShelfUseCase$invoke$1.f18783d = i - Integer.MIN_VALUE;
            } else {
                getRecommendationsShelfUseCase$invoke$1 = new GetRecommendationsShelfUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getRecommendationsShelfUseCase$invoke$1 = new GetRecommendationsShelfUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7507E1 = getRecommendationsShelfUseCase$invoke$1.f18781b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getRecommendationsShelfUseCase$invoke$1.f18783d;
        y95 y95Var = this.f18836a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7507E1);
            getRecommendationsShelfUseCase$invoke$1.f18780a = str;
            getRecommendationsShelfUseCase$invoke$1.f18783d = 1;
            objM7507E1 = ((C1296l) y95Var).f16514d.m7507E0(str, "recommendations", getRecommendationsShelfUseCase$invoke$1);
            if (objM7507E1 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str = getRecommendationsShelfUseCase$invoke$1.f18780a;
            AbstractC3193b.m15359b(objM7507E1);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM7507E1);
                    return objM7507E1;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = getRecommendationsShelfUseCase$invoke$1.f18780a;
            AbstractC3193b.m15359b(objM7507E1);
        }
        libraryShelf = (LibraryShelf) objM7507E1;
        if (libraryShelf == null) {
            getRecommendationsShelfUseCase$invoke$1.f18780a = null;
            getRecommendationsShelfUseCase$invoke$1.f18783d = 3;
            objM7507E0 = ((C1296l) y95Var).f16514d.m7507E0(str, "feed", getRecommendationsShelfUseCase$invoke$1);
            if (objM7507E0 != coroutineSingletons) {
                return coroutineSingletons;
            }
            return objM7507E0;
        }
        return libraryShelf;
        libraryShelf = (LibraryShelf) objM7507E1;
        if (libraryShelf == null) {
            getRecommendationsShelfUseCase$invoke$1.f18780a = str;
            getRecommendationsShelfUseCase$invoke$1.f18783d = 2;
            objM7507E1 = ((C1296l) y95Var).f16514d.m7507E0(str, "lesson_library", getRecommendationsShelfUseCase$invoke$1);
            if (objM7507E1 != coroutineSingletons) {
                libraryShelf = (LibraryShelf) objM7507E1;
                if (libraryShelf == null) {
                    getRecommendationsShelfUseCase$invoke$1.f18780a = null;
                    getRecommendationsShelfUseCase$invoke$1.f18783d = 3;
                    objM7507E0 = ((C1296l) y95Var).f16514d.m7507E0(str, "feed", getRecommendationsShelfUseCase$invoke$1);
                    if (objM7507E0 != coroutineSingletons) {
                        return objM7507E0;
                    }
                }
            }
            return coroutineSingletons;
        }
        return libraryShelf;
    }
}
