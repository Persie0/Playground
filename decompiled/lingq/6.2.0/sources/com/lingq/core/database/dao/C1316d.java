package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3704w;
import p000.bl2;
import p000.bq1;
import p000.jd0;
import p000.qn0;
import p000.r91;
import p000.s70;
import p000.s91;
import p000.sv0;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1316d extends bq1 {
    public static final r91 Companion = new r91();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17012K;

    /* JADX INFO: renamed from: L */
    public final bl2 f17013L = new bl2(new sv0(6), new qn0(7));

    public C1316d(AbstractC0746d abstractC0746d) {
        this.f17012K = abstractC0746d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z0 */
    public static Object m7465z0(C1316d c1316d, String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        CollectionSubscriptionDao$replaceForLanguage$1 collectionSubscriptionDao$replaceForLanguage$1;
        if (continuationImpl instanceof CollectionSubscriptionDao$replaceForLanguage$1) {
            collectionSubscriptionDao$replaceForLanguage$1 = (CollectionSubscriptionDao$replaceForLanguage$1) continuationImpl;
            int i = collectionSubscriptionDao$replaceForLanguage$1.f16876e;
            if ((i & Integer.MIN_VALUE) != 0) {
                collectionSubscriptionDao$replaceForLanguage$1.f16876e = i - Integer.MIN_VALUE;
            } else {
                collectionSubscriptionDao$replaceForLanguage$1 = new CollectionSubscriptionDao$replaceForLanguage$1(c1316d, continuationImpl);
            }
        } else {
            collectionSubscriptionDao$replaceForLanguage$1 = new CollectionSubscriptionDao$replaceForLanguage$1(c1316d, continuationImpl);
        }
        Object obj = collectionSubscriptionDao$replaceForLanguage$1.f16874c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = collectionSubscriptionDao$replaceForLanguage$1.f16876e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            collectionSubscriptionDao$replaceForLanguage$1.f16872a = c1316d;
            collectionSubscriptionDao$replaceForLanguage$1.f16873b = list;
            collectionSubscriptionDao$replaceForLanguage$1.f16876e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new jd0(str, 5), c1316d.f17012K, collectionSubscriptionDao$replaceForLanguage$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list2 = collectionSubscriptionDao$replaceForLanguage$1.f16873b;
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        list = collectionSubscriptionDao$replaceForLanguage$1.f16873b;
        c1316d = collectionSubscriptionDao$replaceForLanguage$1.f16872a;
        AbstractC3193b.m15359b(obj);
        collectionSubscriptionDao$replaceForLanguage$1.f16872a = null;
        collectionSubscriptionDao$replaceForLanguage$1.f16873b = null;
        collectionSubscriptionDao$replaceForLanguage$1.f16876e = 2;
        return c1316d.mo4096w0(list, collectionSubscriptionDao$replaceForLanguage$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: v0 */
    public final Object mo4095v0(Object obj, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(24, this, (s91) obj), this.f17012K, continuation, false, true);
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new C3704w(9, this, list), this.f17012K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7466y0(String str, List list, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new CollectionSubscriptionDao_Impl$replaceForLanguage$2(this, str, list, null), this.f17012K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
