package com.lingq.feature.reader.reader;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.ox7;
import p000.u91;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$observeSentenceNotes$2", m4291f = "ReaderComposeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderComposeViewModel$observeSentenceNotes$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f30058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2493a f30059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$observeSentenceNotes$2(C2493a c2493a, Continuation continuation) {
        super(2, continuation);
        this.f30059b = c2493a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ReaderComposeViewModel$observeSentenceNotes$2 readerComposeViewModel$observeSentenceNotes$2 = new ReaderComposeViewModel$observeSentenceNotes$2(this.f30059b, continuation);
        readerComposeViewModel$observeSentenceNotes$2.f30058a = obj;
        return readerComposeViewModel$observeSentenceNotes$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ReaderComposeViewModel$observeSentenceNotes$2 readerComposeViewModel$observeSentenceNotes$2 = (ReaderComposeViewModel$observeSentenceNotes$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        readerComposeViewModel$observeSentenceNotes$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f30058a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            xz7 xz7Var = (xz7) u91.m22591I0(((ox7) it.next()).f55132e);
            Integer num = xz7Var != null ? new Integer(xz7Var.f69010g) : null;
            if (num != null) {
                arrayList.add(num);
            }
        }
        this.f30059b.f30221k.m9273b(arrayList);
        return xfa.f68157a;
    }
}
