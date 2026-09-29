package com.lingq.feature.reader.video;

import com.lingq.feature.reader.progress.domain.C2472b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e37;
import p000.lw8;
import p000.q7b;
import p000.un1;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$markSentenceKnown$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {898}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$markSentenceKnown$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$markSentenceKnown$1(C2583a c2583a, int i, Continuation continuation) {
        super(2, continuation);
        this.f31202b = c2583a;
        this.f31203c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$markSentenceKnown$1(this.f31202b, this.f31203c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$markSentenceKnown$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f31201a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C2583a c2583a = this.f31202b;
        Iterator it = ((List) ((C3244l) c2583a.f31359R.f9311a).getValue()).iterator();
        loop0: while (true) {
            boolean zHasNext = it.hasNext();
            i = this.f31203c;
            if (!zHasNext) {
                break;
            }
            Object next = it.next();
            List list = ((e37) next).f36654c;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((lw8) it2.next()).f50212a == i) {
                        obj2 = next;
                        break loop0;
                    }
                }
            }
        }
        e37 e37Var = (e37) obj2;
        if (e37Var != null) {
            ArrayList arrayList = e37Var.f36655d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((q7b) obj3).f57357a.f69010g == i) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(((q7b) it3.next()).f57357a.f69008e);
            }
            if (!arrayList3.isEmpty()) {
                C2472b c2472b = c2583a.f31379l;
                String strMo4589b2 = c2583a.f31369b.mo4589b2();
                int i3 = c2583a.f31348G;
                this.f31201a = 1;
                if (c2472b.m9378b(strMo4589b2, i3, arrayList3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return xfaVar;
    }
}
