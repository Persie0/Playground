package com.lingq.feature.reader.reader;

import com.lingq.feature.reader.content.C2260a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$wireMaxAllowedPage$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$wireMaxAllowedPage$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ int f30129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30130b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f30131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$wireMaxAllowedPage$1(C2493a c2493a, Ref$ObjectRef ref$ObjectRef, Continuation continuation) {
        super(2, continuation);
        this.f30130b = c2493a;
        this.f30131c = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$wireMaxAllowedPage$1 readerComposeViewModel$wireMaxAllowedPage$1 = new ReaderComposeViewModel$wireMaxAllowedPage$1(this.f30130b, this.f30131c, continuation);
        readerComposeViewModel$wireMaxAllowedPage$1.f30129a = ((Number) obj).intValue();
        return readerComposeViewModel$wireMaxAllowedPage$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$wireMaxAllowedPage$1 readerComposeViewModel$wireMaxAllowedPage$1 = (ReaderComposeViewModel$wireMaxAllowedPage$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$wireMaxAllowedPage$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2493a c2493a;
        C2260a c2260a;
        C3244l c3244l;
        Object obj2;
        int i;
        int i2 = this.f30129a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2493a c2493a2 = this.f30130b;
        C2260a c2260a2 = c2493a2.f30212e;
        C3244l c3244l2 = c2260a2.f27949o;
        while (true) {
            Object value = c3244l2.getValue();
            yz4 yz4VarM25387a = (yz4) value;
            if (yz4VarM25387a.f70688v == i2) {
                c2493a = c2493a2;
                c2260a = c2260a2;
                c3244l = c3244l2;
                obj2 = value;
            } else {
                int i3 = i2;
                c2493a = c2493a2;
                c2260a = c2260a2;
                c3244l = c3244l2;
                yz4VarM25387a = yz4.m25387a(yz4VarM25387a, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, i3, false, 6291455);
                i2 = i3;
                obj2 = value;
            }
            if (c3244l.m15570h(obj2, yz4VarM25387a)) {
                break;
            }
            c3244l2 = c3244l;
            c2260a2 = c2260a;
            c2493a2 = c2493a;
        }
        Ref$ObjectRef ref$ObjectRef = this.f30131c;
        Integer num = (Integer) ref$ObjectRef.f47718a;
        ref$ObjectRef.f47718a = new Integer(i2);
        xfa xfaVar = xfa.f68157a;
        if (num != null && i2 < num.intValue()) {
            C2493a c2493a3 = c2493a;
            if (((Boolean) ((C3244l) c2493a3.f30201W.f9311a).getValue()).booleanValue()) {
                C2260a c2260a3 = c2260a;
                yz4 yz4Var = (yz4) ((C3244l) c2260a3.f27957w.f9311a).getValue();
                int i4 = yz4Var.f70681o;
                if (i4 >= 0 && i4 < yz4Var.f70670d.size() && (i = yz4Var.f70680n) > i4) {
                    c2260a3.m9255h(i4);
                    c2493a3.m9394a3(i, i4);
                }
            }
        }
        return xfaVar;
    }
}
