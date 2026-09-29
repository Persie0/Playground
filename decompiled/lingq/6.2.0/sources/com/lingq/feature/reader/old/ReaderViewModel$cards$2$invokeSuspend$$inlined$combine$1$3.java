package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonCard;
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
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3", m4291f = "ReaderViewModel.kt", m4292l = {288}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28911a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28912b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f28913c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f28914d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f28914d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 readerViewModel$cards$2$invokeSuspend$$inlined$combine$1$3 = new ReaderViewModel$cards$2$invokeSuspend$$inlined$combine$1$3(this.f28914d, (Continuation) obj3);
        readerViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.f28912b = (e83) obj;
        readerViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.f28913c = (Object[]) obj2;
        return readerViewModel$cards$2$invokeSuspend$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28912b;
        Object[] objArr = this.f28913c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28911a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM23190r0 = v91.m23190r0(AbstractC3550rv.m20852t0((List[]) objArr));
            int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(arrayListM23190r0, 10));
            if (iM15363P < 16) {
                iM15363P = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
            for (Object obj2 : arrayListM23190r0) {
                String str = ((LessonCard) obj2).f19178a;
                Locale locale = this.f28914d.f29334Z;
                locale.getClass();
                linkedHashMap.put(vz1.m23610P(str, locale), obj2);
            }
            this.f28912b = null;
            this.f28913c = null;
            this.f28911a = 1;
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
