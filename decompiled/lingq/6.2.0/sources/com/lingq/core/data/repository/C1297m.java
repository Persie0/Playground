package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.network.api.result.ResultDictionaryLocale;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.qf2;
import p000.tf4;
import p000.v91;
import p000.wi5;
import p000.xfa;
import p000.yf2;

/* JADX INFO: renamed from: com.lingq.core.data.repository.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1297m {

    /* JADX INFO: renamed from: a */
    public final wi5 f16518a;

    /* JADX INFO: renamed from: b */
    public final yf2 f16519b;

    public C1297m(LingQDatabase lingQDatabase, wi5 wi5Var, yf2 yf2Var) {
        lingQDatabase.getClass();
        wi5Var.getClass();
        yf2Var.getClass();
        this.f16518a = wi5Var;
        this.f16519b = yf2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7327a(ContinuationImpl continuationImpl) throws Throwable {
        LocaleRepositoryImpl$availableLocales$1 localeRepositoryImpl$availableLocales$1;
        if (continuationImpl instanceof LocaleRepositoryImpl$availableLocales$1) {
            localeRepositoryImpl$availableLocales$1 = (LocaleRepositoryImpl$availableLocales$1) continuationImpl;
            int i = localeRepositoryImpl$availableLocales$1.f15824c;
            if ((i & Integer.MIN_VALUE) != 0) {
                localeRepositoryImpl$availableLocales$1.f15824c = i - Integer.MIN_VALUE;
            } else {
                localeRepositoryImpl$availableLocales$1 = new LocaleRepositoryImpl$availableLocales$1(this, continuationImpl);
            }
        } else {
            localeRepositoryImpl$availableLocales$1 = new LocaleRepositoryImpl$availableLocales$1(this, continuationImpl);
        }
        Object objM2861d = localeRepositoryImpl$availableLocales$1.f15822a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = localeRepositoryImpl$availableLocales$1.f15824c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM2861d);
                localeRepositoryImpl$availableLocales$1.f15824c = 1;
                if (m7328b(localeRepositoryImpl$availableLocales$1) == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM2861d);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM2861d);
            }
            List list = (List) objM2861d;
            if (!list.isEmpty()) {
                return list;
            }
            return EmptyList.f47638a;
            wi5 wi5Var = this.f16518a;
            localeRepositoryImpl$availableLocales$1.f15824c = 2;
            objM2861d = AbstractC0758a.m2861d(new tf4(16), wi5Var.f66849K, localeRepositoryImpl$availableLocales$1, true, true);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7328b(ContinuationImpl continuationImpl) throws Throwable {
        LocaleRepositoryImpl$fetchAvailableLocales$1 localeRepositoryImpl$fetchAvailableLocales$1;
        if (continuationImpl instanceof LocaleRepositoryImpl$fetchAvailableLocales$1) {
            localeRepositoryImpl$fetchAvailableLocales$1 = (LocaleRepositoryImpl$fetchAvailableLocales$1) continuationImpl;
            int i = localeRepositoryImpl$fetchAvailableLocales$1.f15827c;
            if ((i & Integer.MIN_VALUE) != 0) {
                localeRepositoryImpl$fetchAvailableLocales$1.f15827c = i - Integer.MIN_VALUE;
            } else {
                localeRepositoryImpl$fetchAvailableLocales$1 = new LocaleRepositoryImpl$fetchAvailableLocales$1(this, continuationImpl);
            }
        } else {
            localeRepositoryImpl$fetchAvailableLocales$1 = new LocaleRepositoryImpl$fetchAvailableLocales$1(this, continuationImpl);
        }
        Object objM25112d = localeRepositoryImpl$fetchAvailableLocales$1.f15825a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = localeRepositoryImpl$fetchAvailableLocales$1.f15827c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM25112d);
            localeRepositoryImpl$fetchAvailableLocales$1.f15827c = 1;
            objM25112d = this.f16519b.m25112d(localeRepositoryImpl$fetchAvailableLocales$1);
            if (objM25112d != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM25112d);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM25112d);
        List<ResultDictionaryLocale> list = (List) objM25112d;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (ResultDictionaryLocale resultDictionaryLocale : list) {
            resultDictionaryLocale.getClass();
            arrayList.add(new qf2(resultDictionaryLocale.f20838a, resultDictionaryLocale.f20839b));
        }
        localeRepositoryImpl$fetchAvailableLocales$1.f15827c = 2;
        Object objMo4096w0 = this.f16518a.mo4096w0(arrayList, localeRepositoryImpl$fetchAvailableLocales$1);
        if (objMo4096w0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo4096w0 = xfaVar;
        }
        return objMo4096w0 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX INFO: renamed from: c */
    public final c83 m7329c() {
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(this.f16518a.f66849K, true, new String[]{"DictionaryLocaleEntity"}, new tf4(17)));
    }
}
