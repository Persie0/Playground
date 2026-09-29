package com.lingq.feature.dictionary;

import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.data.workers.DictionaryOrderWorker;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.network.api.requests.RequestDictionariesOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.ak1;
import p000.c32;
import p000.df4;
import p000.gk6;
import p000.hi8;
import p000.lda;
import p000.tx6;
import p000.u91;
import p000.un1;
import p000.ux6;
import p000.v91;
import p000.vi3;
import p000.wfb;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$reorderActiveDictionaries$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$reorderActiveDictionaries$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2057b f25704a;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$reorderActiveDictionaries$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$reorderActiveDictionaries$1$1", m4291f = "DictManageViewModel.kt", m4292l = {232}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20531 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f25705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2057b f25706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20531(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25706b = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20531(this.f25706b, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C20531) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f25705a;
            xfa xfaVar = xfa.f68157a;
            C2057b c2057b = this.f25706b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                xf2 xf2Var = c2057b.f25793c;
                String strMo4589b2 = c2057b.f25792b.mo4589b2();
                Iterable iterable = (Iterable) c2057b.f25798h.getValue();
                ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    AbstractC3393o1.m17749x(((DictionaryData) it.next()).f19008a, arrayList);
                }
                this.f25705a = 1;
                C1292h c1292h = (C1292h) xf2Var;
                c1292h.getClass();
                RequestDictionariesOrder requestDictionariesOrder = new RequestDictionariesOrder();
                requestDictionariesOrder.f20356a = arrayList;
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                NetworkType networkType2 = NetworkType.CONNECTED;
                networkType2.getClass();
                ak1 ak1Var = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
                tx6 tx6Var = (tx6) new tx6(DictionaryOrderWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
                tx6Var.f46873c.f55781j = ak1Var;
                Pair pair = new Pair("language", strMo4589b2);
                df4 df4Var = c1292h.f16487f;
                df4Var.getClass();
                Pair[] pairArr = {pair, new Pair("data", df4Var.m10322b(RequestDictionariesOrder.Companion.serializer(), requestDictionariesOrder))};
                hi8 hi8Var = new hi8(10);
                for (int i2 = 0; i2 < 2; i2++) {
                    Pair pair2 = pairArr[i2];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                c1292h.f16486e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
                if (xfaVar == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            AbstractC1263a.m7047b(lda.m16103C(c2057b), c2057b.f25794d, "observableActiveDictionaries", new DictManageViewModel$fetchActiveDictionaries$1(c2057b, null));
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$reorderActiveDictionaries$1(C2057b c2057b, Continuation continuation) {
        super(1, continuation);
        this.f25704a = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictManageViewModel$reorderActiveDictionaries$1(this.f25704a, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        DictManageViewModel$reorderActiveDictionaries$1 dictManageViewModel$reorderActiveDictionaries$1 = (DictManageViewModel$reorderActiveDictionaries$1) create((Continuation) obj);
        xfa xfaVar = xfa.f68157a;
        dictManageViewModel$reorderActiveDictionaries$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C2057b c2057b = this.f25704a;
        wfb.m23926u(lda.m16103C(c2057b), c2057b.f25794d, null, new C20531(c2057b, null), 2);
        return xfa.f68157a;
    }
}
