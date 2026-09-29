package com.lingq.feature.reader.reader;

import com.lingq.core.data.repository.C1295k;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3139j9;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.i83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderComposeViewModel$special$$inlined$flatMapLatest$1", m4291f = "ReaderComposeViewModel.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderComposeViewModel$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30083a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30084b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30085c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2493a f30086d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderComposeViewModel$special$$inlined$flatMapLatest$1(C2493a c2493a, Continuation continuation) {
        super(3, continuation);
        this.f30086d = c2493a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderComposeViewModel$special$$inlined$flatMapLatest$1 readerComposeViewModel$special$$inlined$flatMapLatest$1 = new ReaderComposeViewModel$special$$inlined$flatMapLatest$1(this.f30086d, (Continuation) obj3);
        readerComposeViewModel$special$$inlined$flatMapLatest$1.f30084b = (e83) obj;
        readerComposeViewModel$special$$inlined$flatMapLatest$1.f30085c = obj2;
        return readerComposeViewModel$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 i83Var;
        e83 e83Var = this.f30084b;
        Object obj2 = this.f30085c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30083a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = (List) obj2;
            if (list.isEmpty()) {
                i83Var = new i83(EmptyList.f47638a, 1);
            } else {
                C2493a c2493a = this.f30086d;
                if (c2493a.f30194P) {
                    C3139j9 c3139j9 = c2493a.f30183E;
                    int i2 = c2493a.f30190L;
                    c3139j9.getClass();
                    list.getClass();
                    i83Var = ((C1295k) c3139j9.f45229a).m7254L(i2, list);
                } else {
                    i83Var = new i83(EmptyList.f47638a, 1);
                }
            }
            this.f30084b = null;
            this.f30085c = null;
            this.f30083a = 1;
            if (AbstractC3224d.m15537p(e83Var, i83Var, this) == coroutineSingletons) {
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
