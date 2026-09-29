package com.lingq.feature.reader.content.state;

import com.lingq.core.domain.lesson.C1384f;
import com.lingq.core.domain.model.lesson.ReaderBookmarkMode;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$saveBookmark$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {473}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderContentStateHolder$saveBookmark$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28012a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2264a f28013b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28014c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderBookmarkMode f28015d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$saveBookmark$1(C2264a c2264a, int i, ReaderBookmarkMode readerBookmarkMode, Continuation continuation) {
        super(2, continuation);
        this.f28013b = c2264a;
        this.f28014c = i;
        this.f28015d = readerBookmarkMode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderContentStateHolder$saveBookmark$1(this.f28013b, this.f28014c, this.f28015d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderContentStateHolder$saveBookmark$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28012a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2264a c2264a = this.f28013b;
            C1384f c1384f = c2264a.f28116e;
            String str = (String) c2264a.f28124m.getValue();
            int iIntValue = ((Number) c2264a.f28125n.getValue()).intValue();
            Integer num = new Integer(((Number) ((Pair) ((C3244l) c2264a.f28105A.f9311a).getValue()).f47624b).intValue());
            this.f28012a = 1;
            if (c1384f.m7995a(str, iIntValue, this.f28014c, this.f28015d, num, this) == coroutineSingletons) {
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
