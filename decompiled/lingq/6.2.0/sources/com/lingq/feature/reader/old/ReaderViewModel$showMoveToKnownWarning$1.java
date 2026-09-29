package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showMoveToKnownWarning$1", m4291f = "ReaderViewModel.kt", m4292l = {1718}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showMoveToKnownWarning$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29068a;

    /* JADX INFO: renamed from: b */
    public int f29069b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f29070c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showMoveToKnownWarning$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29070c = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showMoveToKnownWarning$1(this.f29070c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showMoveToKnownWarning$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f29069b;
        C2412n c2412n = this.f29070c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) c2412n.f29316T.getValue()).intValue();
            this.f29068a = iIntValue;
            this.f29069b = 1;
            Object objM9316Y2 = C2412n.m9316Y2(c2412n, iIntValue, this);
            if (objM9316Y2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = objM9316Y2;
            i = iIntValue;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f29068a;
            AbstractC3193b.m15359b(obj);
        }
        List list = (List) obj;
        if (!list.isEmpty()) {
            C3211a c3211a = c2412n.f29420x1;
            Integer num = new Integer(i - 1);
            List list2 = list;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((LessonWord) it.next()).f19314a);
            }
            c3211a.mo4677k(new Pair(num, arrayList));
        }
        return xfa.f68157a;
    }
}
