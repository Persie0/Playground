package com.lingq.feature.reader.content.state;

import com.lingq.core.domain.token.C1535c;
import java.util.ArrayList;
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
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$fillMissingSentenceCwts$2", m4291f = "ReaderContentStateHolder.kt", m4292l = {368}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$fillMissingSentenceCwts$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f28001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28002d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ArrayList f28003e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$fillMissingSentenceCwts$2(C2264a c2264a, String str, int i, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f28000b = c2264a;
        this.f28001c = str;
        this.f28002d = i;
        this.f28003e = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentStateHolder$fillMissingSentenceCwts$2(this.f28000b, this.f28001c, this.f28002d, this.f28003e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$fillMissingSentenceCwts$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27999a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2264a c2264a = this.f28000b;
            C1535c c1535c = c2264a.f28121j;
            String str = (String) c2264a.f28124m.getValue();
            this.f27999a = 1;
            if (c1535c.m8215b(str, this.f28001c, this.f28002d, this.f28003e, this) == coroutineSingletons) {
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
