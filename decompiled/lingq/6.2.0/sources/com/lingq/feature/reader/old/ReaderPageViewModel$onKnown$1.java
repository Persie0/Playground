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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$onKnown$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1471}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$onKnown$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28678c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f28679d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$onKnown$1(int i, C2411m c2411m, String str, Continuation continuation) {
        super(2, continuation);
        this.f28677b = c2411m;
        this.f28678c = i;
        this.f28679d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$onKnown$1(this.f28678c, this.f28677b, this.f28679d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$onKnown$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28676a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28677b;
            s7b s7bVar = c2411m.f29231f;
            String strMo4589b2 = c2411m.f29223b.mo4589b2();
            String value = WordStatus.Known.getValue();
            this.f28676a = 1;
            if (((C1310z) s7bVar).m7429h(this.f28678c, strMo4589b2, this.f28679d, value, "Deal with blue word pop up", this) == coroutineSingletons) {
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
