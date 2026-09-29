package com.lingq.feature.collections.domain;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3368nd;
import p000.C3386nv;
import p000.c32;
import p000.gj2;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.DownloadCollectionCourseUseCase$invoke$1$1", m4291f = "DownloadCollectionCourseUseCase.kt", m4292l = {49}, m4293m = "invokeSuspend", m4294v = 2)
final class DownloadCollectionCourseUseCase$invoke$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25609a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25610b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2037c f25611c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f25612d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f25613e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f25614f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadCollectionCourseUseCase$invoke$1$1(C2037c c2037c, String str, int i, String str2, Continuation continuation) {
        super(2, continuation);
        this.f25611c = c2037c;
        this.f25612d = str;
        this.f25613e = i;
        this.f25614f = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DownloadCollectionCourseUseCase$invoke$1$1 downloadCollectionCourseUseCase$invoke$1$1 = new DownloadCollectionCourseUseCase$invoke$1$1(this.f25611c, this.f25612d, this.f25613e, this.f25614f, continuation);
        downloadCollectionCourseUseCase$invoke$1$1.f25610b = obj;
        return downloadCollectionCourseUseCase$invoke$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DownloadCollectionCourseUseCase$invoke$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object gj2Var = (un1) this.f25610b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25609a;
        int i2 = 27;
        String str = this.f25614f;
        int i3 = 1;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2037c c2037c = this.f25611c;
                String str2 = this.f25612d;
                int i4 = this.f25613e;
                this.f25610b = gj2Var;
                this.f25609a = 1;
                if (C2037c.m8957a(c2037c, str2, i4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            ConcurrentHashMap concurrentHashMap = C2037c.f25643h;
            gj2Var = new gj2(0, new C3368nd(gj2Var, i2));
            concurrentHashMap.compute(str, gj2Var);
            return xfa.f68157a;
        } catch (Throwable th) {
            C2037c.f25643h.compute(str, new gj2(i3, new C3368nd(gj2Var, i2)));
            throw th;
        }
    }
}
