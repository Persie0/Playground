package com.lingq.feature.reader.content.state;

import com.lingq.core.data.repository.C1310z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.nha;
import p000.s7b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$moveWordToKnownOrIgnored$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {707}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$moveWordToKnownOrIgnored$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28008c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f28009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$moveWordToKnownOrIgnored$1(C2264a c2264a, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f28007b = c2264a;
        this.f28008c = str;
        this.f28009d = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentStateHolder$moveWordToKnownOrIgnored$1(this.f28007b, this.f28008c, this.f28009d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$moveWordToKnownOrIgnored$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28006a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2264a c2264a = this.f28007b;
            nha nhaVar = c2264a.f28117f;
            String str = (String) c2264a.f28124m.getValue();
            int iIntValue = ((Number) c2264a.f28125n.getValue()).intValue();
            this.f28006a = 1;
            Object objM7429h = ((C1310z) ((s7b) nhaVar.f52742a)).m7429h(iIntValue, str, this.f28008c, this.f28009d, "", this);
            if (objM7429h != coroutineSingletons) {
                objM7429h = xfaVar;
            }
            if (objM7429h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
