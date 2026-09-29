package com.lingq.core.data.repository;

import com.lingq.core.database.dao.C1313a;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.ResultBadge;
import com.lingq.core.network.api.result.ResultBadgeObject;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.Instant;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.b80;
import p000.c83;
import p000.cl9;
import p000.g74;
import p000.kuc;
import p000.t70;
import p000.v91;
import p000.xfa;
import p000.y70;
import p000.yy5;

/* JADX INFO: renamed from: com.lingq.core.data.repository.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1285a implements b80 {

    /* JADX INFO: renamed from: a */
    public final C1313a f16447a;

    /* JADX INFO: renamed from: b */
    public final yy5 f16448b;

    public C1285a(C1313a c1313a, yy5 yy5Var) {
        c1313a.getClass();
        yy5Var.getClass();
        this.f16447a = c1313a;
        this.f16448b = yy5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: a */
    public final Object m7097a(String str, ContinuationImpl continuationImpl) throws Throwable {
        BadgeRepositoryImpl$fetchBadgesForLanguage$1 badgeRepositoryImpl$fetchBadgesForLanguage$1;
        String str2;
        String strM15695a;
        String str3 = str;
        if (continuationImpl instanceof BadgeRepositoryImpl$fetchBadgesForLanguage$1) {
            badgeRepositoryImpl$fetchBadgesForLanguage$1 = (BadgeRepositoryImpl$fetchBadgesForLanguage$1) continuationImpl;
            int i = badgeRepositoryImpl$fetchBadgesForLanguage$1.f14597d;
            if ((i & Integer.MIN_VALUE) != 0) {
                badgeRepositoryImpl$fetchBadgesForLanguage$1.f14597d = i - Integer.MIN_VALUE;
            } else {
                badgeRepositoryImpl$fetchBadgesForLanguage$1 = new BadgeRepositoryImpl$fetchBadgesForLanguage$1(this, continuationImpl);
            }
        } else {
            badgeRepositoryImpl$fetchBadgesForLanguage$1 = new BadgeRepositoryImpl$fetchBadgesForLanguage$1(this, continuationImpl);
        }
        Object objM25384c = badgeRepositoryImpl$fetchBadgesForLanguage$1.f14595b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = badgeRepositoryImpl$fetchBadgesForLanguage$1.f14597d;
        xfa xfaVar = xfa.f68157a;
        String str4 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM25384c);
            badgeRepositoryImpl$fetchBadgesForLanguage$1.f14594a = str3;
            badgeRepositoryImpl$fetchBadgesForLanguage$1.f14597d = 1;
            objM25384c = this.f16448b.m25384c(str3, 100, "recent", badgeRepositoryImpl$fetchBadgesForLanguage$1);
            if (objM25384c != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM25384c);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = badgeRepositoryImpl$fetchBadgesForLanguage$1.f14594a;
        AbstractC3193b.m15359b(objM25384c);
        String str5 = str3;
        NetworkResponse networkResponse = (NetworkResponse) objM25384c;
        if (networkResponse instanceof NetworkResponse.Success) {
            Iterable iterable = ((Results) ((NetworkResponse.Success) networkResponse).getData()).f21739d;
            if (iterable == null) {
                iterable = EmptyList.f47638a;
            }
            Iterable<ResultBadge> iterable2 = iterable;
            ArrayList arrayList = new ArrayList(v91.m23189q0(iterable2, 10));
            for (ResultBadge resultBadge : iterable2) {
                resultBadge.getClass();
                ResultBadgeObject resultBadgeObject = resultBadge.f20611h;
                str5.getClass();
                String str6 = resultBadge.f20605b;
                String strM17735j = AbstractC3393o1.m17735j(str5, "_", str6);
                if (str6 == null) {
                    str6 = "";
                }
                if ((resultBadgeObject == null || (str2 = resultBadgeObject.f20614c) == null) && (str2 = resultBadge.f20606c) == null) {
                    str2 = "";
                }
                int i3 = resultBadge.f20607d;
                String str7 = resultBadge.f20608e;
                String str8 = str7 == null ? "" : str7;
                String str9 = resultBadge.f20609f;
                String str10 = str9 == null ? "" : str9;
                String str11 = resultBadge.f20610g;
                if (str11 != null) {
                    strM15695a = cl9.m4840W(str11, ' ', 'T');
                } else {
                    Instant instantMo3285e = g74.f40314a.mo3285e();
                    instantMo3285e.getClass();
                    strM15695a = kuc.m15695a(instantMo3285e);
                }
                arrayList.add(new y70(strM17735j, str5, str6, str2, i3, str8, str10, strM15695a, resultBadgeObject != null ? resultBadgeObject.f20613b : null));
                str4 = null;
            }
            badgeRepositoryImpl$fetchBadgesForLanguage$1.f14594a = str4;
            badgeRepositoryImpl$fetchBadgesForLanguage$1.f14597d = 2;
            if (this.f16447a.m7460y0(str5, arrayList, badgeRepositoryImpl$fetchBadgesForLanguage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: b */
    public final c83 m7098b(String str) {
        str.getClass();
        C1313a c1313a = this.f16447a;
        c1313a.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1313a.f16996K, false, new String[]{"BadgeEntity"}, new t70(str, 0)));
    }
}
