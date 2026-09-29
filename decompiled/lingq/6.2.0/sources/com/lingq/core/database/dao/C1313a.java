package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.bl2;
import p000.bq1;
import p000.s70;
import p000.t70;
import p000.u70;
import p000.v70;
import p000.w70;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1313a extends bq1 {
    public static final w70 Companion = new w70();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f16996K;

    /* JADX INFO: renamed from: L */
    public final bl2 f16997L;

    public C1313a(AbstractC0746d abstractC0746d) {
        this.f16996K = abstractC0746d;
        int i = 0;
        this.f16997L = new bl2(new u70(i), new v70(i));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: z0 */
    public static Object m7459z0(C1313a c1313a, String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        BadgeDao$replaceBadges$1 badgeDao$replaceBadges$1;
        if (continuationImpl instanceof BadgeDao$replaceBadges$1) {
            badgeDao$replaceBadges$1 = (BadgeDao$replaceBadges$1) continuationImpl;
            int i = badgeDao$replaceBadges$1.f16848e;
            if ((i & Integer.MIN_VALUE) != 0) {
                badgeDao$replaceBadges$1.f16848e = i - Integer.MIN_VALUE;
            } else {
                badgeDao$replaceBadges$1 = new BadgeDao$replaceBadges$1(c1313a, continuationImpl);
            }
        } else {
            badgeDao$replaceBadges$1 = new BadgeDao$replaceBadges$1(c1313a, continuationImpl);
        }
        Object obj = badgeDao$replaceBadges$1.f16846c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = badgeDao$replaceBadges$1.f16848e;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            badgeDao$replaceBadges$1.f16844a = c1313a;
            badgeDao$replaceBadges$1.f16845b = arrayList;
            badgeDao$replaceBadges$1.f16848e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new t70(str, i3), c1313a.f16996K, badgeDao$replaceBadges$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        arrayList = badgeDao$replaceBadges$1.f16845b;
        c1313a = badgeDao$replaceBadges$1.f16844a;
        AbstractC3193b.m15359b(obj);
        badgeDao$replaceBadges$1.f16844a = null;
        badgeDao$replaceBadges$1.f16845b = null;
        badgeDao$replaceBadges$1.f16848e = 2;
        return c1313a.mo4096w0(arrayList, badgeDao$replaceBadges$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new s70(0, this, list), this.f16996K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7460y0(String str, ArrayList arrayList, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new BadgeDao_Impl$replaceBadges$2(this, str, arrayList, null), this.f16996K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
