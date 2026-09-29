package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.bl2;
import p000.jd0;
import p000.nd0;
import p000.u70;
import p000.v70;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1314b {
    public static final nd0 Companion = new nd0();

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f16998a;

    /* JADX INFO: renamed from: b */
    public final bl2 f16999b;

    /* JADX INFO: renamed from: c */
    public final bl2 f17000c;

    public C1314b(AbstractC0746d abstractC0746d) {
        this.f16998a = abstractC0746d;
        int i = 1;
        this.f16999b = new bl2(new u70(i), new v70(i));
        int i2 = 2;
        this.f17000c = new bl2(new u70(i2), new v70(i2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static Object m7461b(C1314b c1314b, String str, ContinuationImpl continuationImpl) throws Throwable {
        BlacklistDao$clearBlacklist$1 blacklistDao$clearBlacklist$1;
        if (continuationImpl instanceof BlacklistDao$clearBlacklist$1) {
            blacklistDao$clearBlacklist$1 = (BlacklistDao$clearBlacklist$1) continuationImpl;
            int i = blacklistDao$clearBlacklist$1.f16857e;
            if ((i & Integer.MIN_VALUE) != 0) {
                blacklistDao$clearBlacklist$1.f16857e = i - Integer.MIN_VALUE;
            } else {
                blacklistDao$clearBlacklist$1 = new BlacklistDao$clearBlacklist$1(c1314b, continuationImpl);
            }
        } else {
            blacklistDao$clearBlacklist$1 = new BlacklistDao$clearBlacklist$1(c1314b, continuationImpl);
        }
        Object obj = blacklistDao$clearBlacklist$1.f16855c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = blacklistDao$clearBlacklist$1.f16857e;
        int i3 = 2;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            blacklistDao$clearBlacklist$1.f16853a = c1314b;
            blacklistDao$clearBlacklist$1.f16854b = str;
            blacklistDao$clearBlacklist$1.f16857e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new jd0(str, i3), c1314b.f16998a, blacklistDao$clearBlacklist$1, false, true);
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
        str = blacklistDao$clearBlacklist$1.f16854b;
        c1314b = blacklistDao$clearBlacklist$1.f16853a;
        AbstractC3193b.m15359b(obj);
        blacklistDao$clearBlacklist$1.f16853a = null;
        blacklistDao$clearBlacklist$1.f16854b = null;
        blacklistDao$clearBlacklist$1.f16857e = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new jd0(str, i4), c1314b.f16998a, blacklistDao$clearBlacklist$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7462a(String str, ContinuationImpl continuationImpl) {
        Object objM2860c = AbstractC0758a.m2860c(new BlacklistDao_Impl$clearBlacklist$2(this, str, null), this.f16998a, continuationImpl);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
