package com.amplitude.android.internal;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.dp5;
import p000.fa4;
import p000.kva;
import p000.ph2;
import p000.pj5;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.xq3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1", m4291f = "ViewHierarchyScanner.kt", m4292l = {47}, m4293m = "invokeSuspend")
final class ViewHierarchyScanner$findTarget$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f10821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f10822b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pj5 f10823c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Pair f10824d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewTarget$Type f10825e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ List f10826f;

    /* JADX INFO: renamed from: com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1$1 */
    /* JADX INFO: loaded from: classes2.dex */
    @c32(m4290c = "com.amplitude.android.internal.ViewHierarchyScanner$findTarget$1$1", m4291f = "ViewHierarchyScanner.kt", m4292l = {}, m4293m = "invokeSuspend")
    final class C08831 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f10827a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Pair f10828b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewTarget$Type f10829c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ List f10830d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ pj5 f10831e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08831(pj5 pj5Var, View view, ViewTarget$Type viewTarget$Type, List list, Pair pair, Continuation continuation) {
            super(2, continuation);
            this.f10827a = view;
            this.f10828b = pair;
            this.f10829c = viewTarget$Type;
            this.f10830d = list;
            this.f10831e = pj5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C08831(this.f10831e, this.f10827a, this.f10829c, this.f10830d, this.f10828b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C08831) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            return C0884a.m5071a(this.f10831e, this.f10827a, this.f10829c, this.f10830d, this.f10828b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewHierarchyScanner$findTarget$1(pj5 pj5Var, View view, ViewTarget$Type viewTarget$Type, List list, Pair pair, Continuation continuation) {
        super(2, continuation);
        this.f10822b = view;
        this.f10823c = pj5Var;
        this.f10824d = pair;
        this.f10825e = viewTarget$Type;
        this.f10826f = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ViewHierarchyScanner$findTarget$1(this.f10823c, this.f10822b, this.f10825e, this.f10826f, this.f10824d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewHierarchyScanner$findTarget$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Looper mainLooper;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f10821a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            View view = this.f10822b;
            Handler handler = view.getHandler();
            pj5 pj5Var = this.f10823c;
            if ((handler == null || (mainLooper = handler.getLooper()) == null) && (mainLooper = Looper.getMainLooper()) == null) {
                pj5Var.mo16255a("Unable to get main looper");
                return null;
            }
            boolean zM11650l = fa4.m11650l(mainLooper.getThread(), Thread.currentThread());
            Pair pair = this.f10824d;
            if (zM11650l) {
                return C0884a.m5071a(pj5Var, view, this.f10825e, this.f10826f, pair);
            }
            v72 v72Var = ph2.f56212a;
            xq3 xq3Var = dp5.f36000a;
            C08831 c08831 = new C08831(this.f10823c, view, this.f10825e, this.f10826f, pair, null);
            this.f10821a = 1;
            obj = wfb.m23905G(c08831, xq3Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return (kva) obj;
    }
}
