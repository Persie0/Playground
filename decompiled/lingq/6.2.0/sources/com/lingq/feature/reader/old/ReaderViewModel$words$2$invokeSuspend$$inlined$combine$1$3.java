package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3550rv;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.v91;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3", m4291f = "ReaderViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29171a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29172b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f29173c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29174d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3 readerViewModel$words$2$invokeSuspend$$inlined$combine$1$3 = new ReaderViewModel$words$2$invokeSuspend$$inlined$combine$1$3(this.f29174d, (Continuation) obj3);
        readerViewModel$words$2$invokeSuspend$$inlined$combine$1$3.f29172b = (e83) obj;
        readerViewModel$words$2$invokeSuspend$$inlined$combine$1$3.f29173c = (Object[]) obj2;
        return readerViewModel$words$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f29172b;
        Object[] objArr = this.f29173c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29171a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM23190r0 = v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr));
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayListM23190r0, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj2 : arrayListM23190r0) {
                String str = ((LessonWord) obj2).f19314a;
                Locale locale = this.f29174d.f29334Z;
                locale.getClass();
                linkedHashMap.put(vz1.m23610P(str, locale), obj2);
            }
            this.f29172b = null;
            this.f29173c = null;
            this.f29171a = 1;
            if (e83Var.emit(linkedHashMap, this) == coroutineSingletons) {
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
