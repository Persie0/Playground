package com.lingq.feature.reader.old;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1295k;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.ix7;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$completeLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {1653, 1654}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$completeLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28927a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28928b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$completeLesson$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28928b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$completeLesson$1(this.f28928b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$completeLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r9 == r3) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        C2412n c2412n = this.f28928b;
        C3211a c3211a = c2412n.f29405s1;
        C3244l c3244l = c2412n.f29306P1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28927a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, Boolean.TRUE));
            this.f28927a = 1;
            if (C2412n.m9318a3(c2412n, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        List list = (List) obj;
        if (list == null || !(!list.isEmpty())) {
            do {
                value2 = c3244l.getValue();
                ((Boolean) value2).getClass();
            } while (!c3244l.m15570h(value2, Boolean.FALSE));
            c3211a.mo4677k(ix7.f44737a);
        } else {
            if (c2412n.f29280H.f58118b.getInt("lessonsCompleted", 0) == 1) {
                wfb.m23926u(lda.m16103C(c2412n), c2412n.f29301O, null, new ReaderViewModel$setMoveBlueWordsToKnown$1(c2412n, true, null), 2);
            }
            ((C1240a) c2412n.f29292L).m7025f("Blue words remaining button click", null);
            do {
                value3 = c3244l.getValue();
                ((Boolean) value3).getClass();
            } while (!c3244l.m15570h(value3, Boolean.FALSE));
            c3211a.mo4677k(ix7.f44738b);
        }
        return xfa.f68157a;
        c83 c83VarM7256N = ((C1295k) c2412n.f29394p).m7256N(c2412n.m9332l3());
        this.f28927a = 2;
        obj = AbstractC3224d.m15542u(c83VarM7256N, this);
    }
}
