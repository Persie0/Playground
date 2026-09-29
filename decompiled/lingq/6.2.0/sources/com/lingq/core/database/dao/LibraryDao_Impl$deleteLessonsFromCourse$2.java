package com.lingq.core.database.dao;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.database.dao.LibraryDao_Impl$deleteLessonsFromCourse$2", m4291f = "LibraryDao_Impl.kt", m4292l = {930}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryDao_Impl$deleteLessonsFromCourse$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f16976a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1321i f16977b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f16978c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f16979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryDao_Impl$deleteLessonsFromCourse$2(C1321i c1321i, int i, List list, Continuation continuation) {
        super(1, continuation);
        this.f16977b = c1321i;
        this.f16978c = i;
        this.f16979d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new LibraryDao_Impl$deleteLessonsFromCourse$2(this.f16977b, this.f16978c, this.f16979d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((LibraryDao_Impl$deleteLessonsFromCourse$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16976a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f16976a = 1;
            if (C1321i.m7503z0(this.f16977b, this.f16978c, this.f16979d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
