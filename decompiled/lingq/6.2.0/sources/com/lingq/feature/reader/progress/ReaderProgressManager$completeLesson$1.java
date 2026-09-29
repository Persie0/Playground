package com.lingq.feature.reader.progress;

import com.lingq.feature.reader.progress.domain.C2471a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.progress.ReaderProgressManager$completeLesson$1", m4291f = "ReaderProgressManager.kt", m4292l = {69}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderProgressManager$completeLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2470a f29848b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f29849c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f29850d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ List f29851e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderProgressManager$completeLesson$1(C2470a c2470a, String str, int i, List list, Continuation continuation) {
        super(2, continuation);
        this.f29848b = c2470a;
        this.f29849c = str;
        this.f29850d = i;
        this.f29851e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderProgressManager$completeLesson$1(this.f29848b, this.f29849c, this.f29850d, this.f29851e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderProgressManager$completeLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29847a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2471a c2471a = this.f29848b.f29864b;
            this.f29847a = 1;
            if (c2471a.m9376a(this.f29849c, this.f29850d, this.f29851e, this) == coroutineSingletons) {
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
