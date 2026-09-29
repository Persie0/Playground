package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1310z;
import com.lingq.core.domain.model.status.WordStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$onIgnore$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1483}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$onIgnore$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28674c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f28675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$onIgnore$1(int i, C2411m c2411m, String str, Continuation continuation) {
        super(2, continuation);
        this.f28673b = c2411m;
        this.f28674c = i;
        this.f28675d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$onIgnore$1(this.f28674c, this.f28673b, this.f28675d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$onIgnore$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28672a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28673b;
            s7b s7bVar = c2411m.f29231f;
            String strMo4589b2 = c2411m.f29223b.mo4589b2();
            String value = WordStatus.Ignored.getValue();
            this.f28672a = 1;
            if (((C1310z) s7bVar).m7429h(this.f28674c, strMo4589b2, this.f28675d, value, "Deal with blue word pop up", this) == coroutineSingletons) {
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
