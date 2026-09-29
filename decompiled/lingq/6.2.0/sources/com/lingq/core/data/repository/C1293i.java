package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.LanguageEmailNotificationUpdateWorker;
import com.lingq.core.data.workers.LanguageFeedLevelUpdateWorker;
import com.lingq.core.data.workers.LanguageIntensityUpdateWorker;
import com.lingq.core.data.workers.LanguageRepetitionLingqsUpdateWorker;
import com.lingq.core.data.workers.LanguageSiteNotificationUpdateWorker;
import com.lingq.core.data.workers.LanguageTopicsUpdateWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.entity.LanguageCardsTagsEntity;
import com.lingq.core.database.entity.LanguageContextEntity;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.LanguageContextNotification;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.repo.NetworkErrorType;
import com.lingq.core.network.api.requests.RequestDailyStreakTarget;
import com.lingq.core.network.api.requests.RequestFeedLevels;
import com.lingq.core.network.api.requests.RequestLanguageContextEmailNotification;
import com.lingq.core.network.api.requests.RequestLanguageContextNotification;
import com.lingq.core.network.api.requests.RequestLanguageContextRepetitionLingqsNotification;
import com.lingq.core.network.api.requests.RequestLanguageContextSiteNotification;
import com.lingq.core.network.api.requests.RequestTopics;
import com.lingq.core.network.api.result.ResultLanguage;
import com.lingq.core.network.api.result.ResultLanguageContext;
import com.lingq.core.network.api.result.Results;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C0011a9;
import p000.C3386nv;
import p000.C3741x;
import p000.bn4;
import p000.bx0;
import p000.c83;
import p000.hi8;
import p000.i88;
import p000.i93;
import p000.jz1;
import p000.lda;
import p000.lm4;
import p000.m88;
import p000.ml4;
import p000.nl4;
import p000.ol4;
import p000.ql4;
import p000.si7;
import p000.tf4;
import p000.tx6;
import p000.u91;
import p000.ul4;
import p000.um5;
import p000.ux6;
import p000.v91;
import p000.xfa;
import p000.xj1;
import p000.xj6;
import p000.xm5;
import p000.yo1;
import p000.zj6;
import retrofit2.HttpException;

/* JADX INFO: renamed from: com.lingq.core.data.repository.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1293i implements lm4 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16488a;

    /* JADX INFO: renamed from: b */
    public final ul4 f16489b;

    /* JADX INFO: renamed from: c */
    public final bn4 f16490c;

    /* JADX INFO: renamed from: d */
    public final si7 f16491d;

    /* JADX INFO: renamed from: e */
    public final C0773b f16492e;

    public C1293i(LingQDatabase lingQDatabase, ul4 ul4Var, bn4 bn4Var, si7 si7Var, C0773b c0773b) {
        lingQDatabase.getClass();
        ul4Var.getClass();
        bn4Var.getClass();
        si7Var.getClass();
        c0773b.getClass();
        this.f16488a = lingQDatabase;
        this.f16489b = ul4Var;
        this.f16490c = bn4Var;
        this.f16491d = si7Var;
        this.f16492e = c0773b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7204a(ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$allLanguages$1 languageRepositoryImpl$allLanguages$1;
        if (continuationImpl instanceof LanguageRepositoryImpl$allLanguages$1) {
            languageRepositoryImpl$allLanguages$1 = (LanguageRepositoryImpl$allLanguages$1) continuationImpl;
            int i = languageRepositoryImpl$allLanguages$1.f15161c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$allLanguages$1.f15161c = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$allLanguages$1 = new LanguageRepositoryImpl$allLanguages$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$allLanguages$1 = new LanguageRepositoryImpl$allLanguages$1(this, continuationImpl);
        }
        Object objM3894i = languageRepositoryImpl$allLanguages$1.f15159a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$allLanguages$1.f15161c;
        int i3 = 0;
        ul4 ul4Var = this.f16489b;
        int i4 = 1;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3894i);
                bn4 bn4Var = this.f16490c;
                languageRepositoryImpl$allLanguages$1.f15161c = 1;
                objM3894i = bn4Var.m3894i(languageRepositoryImpl$allLanguages$1);
                if (objM3894i == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM3894i);
            } else if (i2 == 2) {
                AbstractC3193b.m15359b(objM3894i);
                languageRepositoryImpl$allLanguages$1.f15161c = 3;
                objM3894i = AbstractC0758a.m2861d(new tf4(i4), ul4Var.f64042K, languageRepositoryImpl$allLanguages$1, true, false);
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3894i);
            }
            List list = (List) objM3894i;
            if (!list.isEmpty()) {
                return list;
            }
            return EmptyList.f47638a;
            List list2 = (List) objM3894i;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3489q9.m19768E((ResultLanguage) it.next()));
            }
            languageRepositoryImpl$allLanguages$1.f15161c = 2;
            Object objM2861d = AbstractC0758a.m2861d(new nl4(ul4Var, arrayList, i3), ul4Var.f64042K, languageRepositoryImpl$allLanguages$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfa.f68157a;
            }
            if (objM2861d != coroutineSingletons) {
                languageRepositoryImpl$allLanguages$1.f15161c = 3;
                objM3894i = AbstractC0758a.m2861d(new tf4(i4), ul4Var.f64042K, languageRepositoryImpl$allLanguages$1, true, false);
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7205b(String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$deleteLanguage$1 languageRepositoryImpl$deleteLanguage$1;
        String str2;
        int i;
        if (continuationImpl instanceof LanguageRepositoryImpl$deleteLanguage$1) {
            languageRepositoryImpl$deleteLanguage$1 = (LanguageRepositoryImpl$deleteLanguage$1) continuationImpl;
            int i2 = languageRepositoryImpl$deleteLanguage$1.f15166e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$deleteLanguage$1.f15166e = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$deleteLanguage$1 = new LanguageRepositoryImpl$deleteLanguage$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$deleteLanguage$1 = new LanguageRepositoryImpl$deleteLanguage$1(this, continuationImpl);
        }
        Object objM2861d = languageRepositoryImpl$deleteLanguage$1.f15164c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$deleteLanguage$1.f15166e;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            languageRepositoryImpl$deleteLanguage$1.f15162a = str;
            languageRepositoryImpl$deleteLanguage$1.f15166e = 1;
            objM2861d = AbstractC0758a.m2861d(new ql4(str, 0), this.f16489b.f64042K, languageRepositoryImpl$deleteLanguage$1, true, false);
            if (objM2861d != coroutineSingletons) {
            }
        }
        if (i3 == 1) {
            str = languageRepositoryImpl$deleteLanguage$1.f15162a;
            AbstractC3193b.m15359b(objM2861d);
        } else {
            if (i3 != 2) {
                if (i3 == 3) {
                    AbstractC3193b.m15359b(objM2861d);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = languageRepositoryImpl$deleteLanguage$1.f15163b;
            str2 = languageRepositoryImpl$deleteLanguage$1.f15162a;
            AbstractC3193b.m15359b(objM2861d);
        }
        LanguageRepositoryImpl$deleteLanguage$2 languageRepositoryImpl$deleteLanguage$2 = new LanguageRepositoryImpl$deleteLanguage$2(this, str2, null);
        languageRepositoryImpl$deleteLanguage$1.f15162a = null;
        languageRepositoryImpl$deleteLanguage$1.f15163b = i;
        languageRepositoryImpl$deleteLanguage$1.f15166e = 3;
        return AbstractC0747e.m2849b(this.f16488a, languageRepositoryImpl$deleteLanguage$2, languageRepositoryImpl$deleteLanguage$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
        LanguageToLearn languageToLearn = (LanguageToLearn) objM2861d;
        if (languageToLearn != null) {
            int i4 = languageToLearn.f19117e;
            languageRepositoryImpl$deleteLanguage$1.f15162a = str;
            languageRepositoryImpl$deleteLanguage$1.f15163b = i4;
            languageRepositoryImpl$deleteLanguage$1.f15166e = 2;
            if (this.f16490c.m3886a(i4, languageRepositoryImpl$deleteLanguage$1) != coroutineSingletons) {
                str2 = str;
                i = i4;
                LanguageRepositoryImpl$deleteLanguage$2 languageRepositoryImpl$deleteLanguage$3 = new LanguageRepositoryImpl$deleteLanguage$2(this, str2, null);
                languageRepositoryImpl$deleteLanguage$1.f15162a = null;
                languageRepositoryImpl$deleteLanguage$1.f15163b = i;
                languageRepositoryImpl$deleteLanguage$1.f15166e = 3;
                if (AbstractC0747e.m2849b(this.f16488a, languageRepositoryImpl$deleteLanguage$3, languageRepositoryImpl$deleteLanguage$1) == coroutineSingletons) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final c83 m7206c(String str) {
        str.getClass();
        ul4 ul4Var = this.f16489b;
        ul4Var.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(ul4Var.f64042K, false, new String[]{"LanguageCardsTagsEntity"}, new ol4(str, ul4Var, 2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7207d(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateEmailNotification$1 languageRepositoryImpl$networkUpdateEmailNotification$1;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateEmailNotification$1) {
            languageRepositoryImpl$networkUpdateEmailNotification$1 = (LanguageRepositoryImpl$networkUpdateEmailNotification$1) continuationImpl;
            int i = languageRepositoryImpl$networkUpdateEmailNotification$1.f15173d;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateEmailNotification$1.f15173d = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateEmailNotification$1 = new LanguageRepositoryImpl$networkUpdateEmailNotification$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateEmailNotification$1 = new LanguageRepositoryImpl$networkUpdateEmailNotification$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$networkUpdateEmailNotification$1.f15171b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$networkUpdateEmailNotification$1.f15173d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$networkUpdateEmailNotification$1.f15170a = str2;
            languageRepositoryImpl$networkUpdateEmailNotification$1.f15173d = 1;
            objM22789A0 = this.f16489b.m22789A0(str, languageRepositoryImpl$networkUpdateEmailNotification$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = languageRepositoryImpl$networkUpdateEmailNotification$1.f15170a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM22789A0);
        }
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            RequestLanguageContextEmailNotification requestLanguageContextEmailNotification = new RequestLanguageContextEmailNotification();
            RequestLanguageContextNotification requestLanguageContextNotification = new RequestLanguageContextNotification();
            requestLanguageContextNotification.m8251a(str2);
            requestLanguageContextEmailNotification.f20371a = requestLanguageContextNotification;
            Integer num = new Integer(languageContextEntity.f17150b);
            languageRepositoryImpl$networkUpdateEmailNotification$1.f15170a = null;
            languageRepositoryImpl$networkUpdateEmailNotification$1.f15173d = 2;
            objM22789A0 = this.f16490c.m3887b(num, requestLanguageContextEmailNotification, languageRepositoryImpl$networkUpdateEmailNotification$1);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7208e(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateFeedLevels$1 languageRepositoryImpl$networkUpdateFeedLevels$1;
        int i;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateFeedLevels$1) {
            languageRepositoryImpl$networkUpdateFeedLevels$1 = (LanguageRepositoryImpl$networkUpdateFeedLevels$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateFeedLevels$1 = new LanguageRepositoryImpl$networkUpdateFeedLevels$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateFeedLevels$1 = new LanguageRepositoryImpl$networkUpdateFeedLevels$1(this, continuationImpl);
        }
        Object objM15541t = languageRepositoryImpl$networkUpdateFeedLevels$1.f15177d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            i93 i93VarM22791z0 = ul4Var.m22791z0(str);
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a = str;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b = list;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f = 1;
            objM15541t = AbstractC3224d.m15541t(i93VarM22791z0, languageRepositoryImpl$networkUpdateFeedLevels$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            list = languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b;
            str = languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a;
            AbstractC3193b.m15359b(objM15541t);
        } else if (i3 == 2) {
            i = languageRepositoryImpl$networkUpdateFeedLevels$1.f15176c;
            List list2 = languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b;
            str = languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a;
            AbstractC3193b.m15359b(objM15541t);
            LanguageContextEntity languageContextEntityM19769F = AbstractC3489q9.m19769F((ResultLanguageContext) objM15541t, str);
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15176c = i;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f = 3;
            objM15541t = ul4Var.mo4095v0(languageContextEntityM19769F, languageRepositoryImpl$networkUpdateFeedLevels$1);
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b;
            AbstractC3193b.m15359b(objM15541t);
        }
        lda.m16122h(((Number) objM15541t).longValue());
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM15541t;
        if (languageContextEntity != null) {
            Integer num = new Integer(languageContextEntity.f17150b);
            RequestFeedLevels requestFeedLevels = new RequestFeedLevels(list);
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a = str;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b = null;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15176c = 0;
            languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f = 2;
            objM15541t = this.f16490c.m3891f(num, requestFeedLevels, languageRepositoryImpl$networkUpdateFeedLevels$1);
            if (objM15541t != coroutineSingletons) {
                i = 0;
                LanguageContextEntity languageContextEntityM19769F2 = AbstractC3489q9.m19769F((ResultLanguageContext) objM15541t, str);
                languageRepositoryImpl$networkUpdateFeedLevels$1.f15174a = null;
                languageRepositoryImpl$networkUpdateFeedLevels$1.f15175b = null;
                languageRepositoryImpl$networkUpdateFeedLevels$1.f15176c = i;
                languageRepositoryImpl$networkUpdateFeedLevels$1.f15179f = 3;
                objM15541t = ul4Var.mo4095v0(languageContextEntityM19769F2, languageRepositoryImpl$networkUpdateFeedLevels$1);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7209f(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateIntensity$1 languageRepositoryImpl$networkUpdateIntensity$1;
        int i;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateIntensity$1) {
            languageRepositoryImpl$networkUpdateIntensity$1 = (LanguageRepositoryImpl$networkUpdateIntensity$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUpdateIntensity$1.f15185f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateIntensity$1.f15185f = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateIntensity$1 = new LanguageRepositoryImpl$networkUpdateIntensity$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateIntensity$1 = new LanguageRepositoryImpl$networkUpdateIntensity$1(this, continuationImpl);
        }
        Object objM15541t = languageRepositoryImpl$networkUpdateIntensity$1.f15183d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUpdateIntensity$1.f15185f;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            i93 i93VarM22791z0 = ul4Var.m22791z0(str);
            languageRepositoryImpl$networkUpdateIntensity$1.f15180a = str;
            languageRepositoryImpl$networkUpdateIntensity$1.f15181b = str2;
            languageRepositoryImpl$networkUpdateIntensity$1.f15185f = 1;
            objM15541t = AbstractC3224d.m15541t(i93VarM22791z0, languageRepositoryImpl$networkUpdateIntensity$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str2 = languageRepositoryImpl$networkUpdateIntensity$1.f15181b;
            str = languageRepositoryImpl$networkUpdateIntensity$1.f15180a;
            AbstractC3193b.m15359b(objM15541t);
        } else if (i3 == 2) {
            i = languageRepositoryImpl$networkUpdateIntensity$1.f15182c;
            str = languageRepositoryImpl$networkUpdateIntensity$1.f15180a;
            AbstractC3193b.m15359b(objM15541t);
            LanguageContextEntity languageContextEntityM19769F = AbstractC3489q9.m19769F((ResultLanguageContext) objM15541t, str);
            languageRepositoryImpl$networkUpdateIntensity$1.f15180a = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f15181b = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f15182c = i;
            languageRepositoryImpl$networkUpdateIntensity$1.f15185f = 3;
            objM15541t = ul4Var.mo4095v0(languageContextEntityM19769F, languageRepositoryImpl$networkUpdateIntensity$1);
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        lda.m16122h(((Number) objM15541t).longValue());
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM15541t;
        if (languageContextEntity != null) {
            Integer num = new Integer(languageContextEntity.f17150b);
            RequestDailyStreakTarget requestDailyStreakTarget = new RequestDailyStreakTarget(null, str2);
            languageRepositoryImpl$networkUpdateIntensity$1.f15180a = str;
            languageRepositoryImpl$networkUpdateIntensity$1.f15181b = null;
            languageRepositoryImpl$networkUpdateIntensity$1.f15182c = 0;
            languageRepositoryImpl$networkUpdateIntensity$1.f15185f = 2;
            objM15541t = this.f16490c.m3889d(num, requestDailyStreakTarget, languageRepositoryImpl$networkUpdateIntensity$1);
            if (objM15541t != coroutineSingletons) {
                i = 0;
                LanguageContextEntity languageContextEntityM19769F2 = AbstractC3489q9.m19769F((ResultLanguageContext) objM15541t, str);
                languageRepositoryImpl$networkUpdateIntensity$1.f15180a = null;
                languageRepositoryImpl$networkUpdateIntensity$1.f15181b = null;
                languageRepositoryImpl$networkUpdateIntensity$1.f15182c = i;
                languageRepositoryImpl$networkUpdateIntensity$1.f15185f = 3;
                objM15541t = ul4Var.mo4095v0(languageContextEntityM19769F2, languageRepositoryImpl$networkUpdateIntensity$1);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007f A[Catch: Exception -> 0x0037, TRY_LEAVE, TryCatch #0 {Exception -> 0x0037, blocks: (B:14:0x0033, B:21:0x0046, B:34:0x007b, B:36:0x007f, B:24:0x004c, B:30:0x0060, B:27:0x0053), top: B:45:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m7210g(String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateLanguageTags$1 languageRepositoryImpl$networkUpdateLanguageTags$1;
        List list;
        int i;
        LanguageContextEntity languageContextEntity;
        Object objM2861d;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateLanguageTags$1) {
            languageRepositoryImpl$networkUpdateLanguageTags$1 = (LanguageRepositoryImpl$networkUpdateLanguageTags$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateLanguageTags$1 = new LanguageRepositoryImpl$networkUpdateLanguageTags$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateLanguageTags$1 = new LanguageRepositoryImpl$networkUpdateLanguageTags$1(this, continuationImpl);
        }
        Object objM3901p = languageRepositoryImpl$networkUpdateLanguageTags$1.f15189d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f;
        xfa xfaVar = xfa.f68157a;
        ul4 ul4Var = this.f16489b;
        int i4 = 0;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM3901p);
                bn4 bn4Var = this.f16490c;
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15186a = str;
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f = 1;
                objM3901p = bn4Var.m3901p(str, languageRepositoryImpl$networkUpdateLanguageTags$1);
                if (objM3901p == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                str = languageRepositoryImpl$networkUpdateLanguageTags$1.f15186a;
                AbstractC3193b.m15359b(objM3901p);
            } else {
                if (i3 != 2) {
                    if (i3 != 3) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    List list2 = languageRepositoryImpl$networkUpdateLanguageTags$1.f15187b;
                    AbstractC3193b.m15359b(objM3901p);
                    return xfaVar;
                }
                i = languageRepositoryImpl$networkUpdateLanguageTags$1.f15188c;
                list = languageRepositoryImpl$networkUpdateLanguageTags$1.f15187b;
                AbstractC3193b.m15359b(objM3901p);
            }
            languageContextEntity = (LanguageContextEntity) objM3901p;
            if (languageContextEntity != null) {
                LanguageCardsTagsEntity languageCardsTagsEntity = new LanguageCardsTagsEntity(languageContextEntity.f17149a, u91.m22622n1(u91.m22627s1(list)));
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15186a = null;
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15187b = null;
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15188c = i;
                languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f = 3;
                objM2861d = AbstractC0758a.m2861d(new ml4(ul4Var, languageCardsTagsEntity, i4), ul4Var.f64042K, languageRepositoryImpl$networkUpdateLanguageTags$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfaVar;
            List list3 = (List) objM3901p;
            i93 i93VarM22791z0 = ul4Var.m22791z0(str);
            languageRepositoryImpl$networkUpdateLanguageTags$1.f15186a = null;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f15187b = list3;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f15188c = 0;
            languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f = 2;
            objM3901p = AbstractC3224d.m15541t(i93VarM22791z0, languageRepositoryImpl$networkUpdateLanguageTags$1);
            if (objM3901p != coroutineSingletons) {
                list = list3;
                i = 0;
                languageContextEntity = (LanguageContextEntity) objM3901p;
                if (languageContextEntity != null) {
                    LanguageCardsTagsEntity languageCardsTagsEntity2 = new LanguageCardsTagsEntity(languageContextEntity.f17149a, u91.m22622n1(u91.m22627s1(list)));
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f15186a = null;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f15187b = null;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f15188c = i;
                    languageRepositoryImpl$networkUpdateLanguageTags$1.f15191f = 3;
                    objM2861d = AbstractC0758a.m2861d(new ml4(ul4Var, languageCardsTagsEntity2, i4), ul4Var.f64042K, languageRepositoryImpl$networkUpdateLanguageTags$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
            return coroutineSingletons;
        } catch (Exception e) {
            e.printStackTrace();
            return xfaVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7211h(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1 languageRepositoryImpl$networkUpdateRepetitionLingqs$1;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1) {
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = (LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15195d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15195d = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = new LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1 = new LanguageRepositoryImpl$networkUpdateRepetitionLingqs$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15193b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15195d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15192a = i;
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15195d = 1;
            objM22789A0 = this.f16489b.m22789A0(str, languageRepositoryImpl$networkUpdateRepetitionLingqs$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15192a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM22789A0);
        }
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            RequestLanguageContextRepetitionLingqsNotification requestLanguageContextRepetitionLingqsNotification = new RequestLanguageContextRepetitionLingqsNotification();
            requestLanguageContextRepetitionLingqsNotification.f20374a = new Integer(i);
            Integer num = new Integer(languageContextEntity.f17150b);
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15192a = i;
            languageRepositoryImpl$networkUpdateRepetitionLingqs$1.f15195d = 2;
            objM22789A0 = this.f16490c.m3899n(num, requestLanguageContextRepetitionLingqsNotification, languageRepositoryImpl$networkUpdateRepetitionLingqs$1);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7212i(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateSiteNotification$1 languageRepositoryImpl$networkUpdateSiteNotification$1;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateSiteNotification$1) {
            languageRepositoryImpl$networkUpdateSiteNotification$1 = (LanguageRepositoryImpl$networkUpdateSiteNotification$1) continuationImpl;
            int i = languageRepositoryImpl$networkUpdateSiteNotification$1.f15199d;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateSiteNotification$1.f15199d = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateSiteNotification$1 = new LanguageRepositoryImpl$networkUpdateSiteNotification$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateSiteNotification$1 = new LanguageRepositoryImpl$networkUpdateSiteNotification$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$networkUpdateSiteNotification$1.f15197b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$networkUpdateSiteNotification$1.f15199d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$networkUpdateSiteNotification$1.f15196a = str2;
            languageRepositoryImpl$networkUpdateSiteNotification$1.f15199d = 1;
            objM22789A0 = this.f16489b.m22789A0(str, languageRepositoryImpl$networkUpdateSiteNotification$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = languageRepositoryImpl$networkUpdateSiteNotification$1.f15196a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM22789A0);
        }
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            RequestLanguageContextSiteNotification requestLanguageContextSiteNotification = new RequestLanguageContextSiteNotification();
            RequestLanguageContextNotification requestLanguageContextNotification = new RequestLanguageContextNotification();
            requestLanguageContextNotification.m8251a(str2);
            requestLanguageContextSiteNotification.f20375a = requestLanguageContextNotification;
            Integer num = new Integer(languageContextEntity.f17150b);
            languageRepositoryImpl$networkUpdateSiteNotification$1.f15196a = null;
            languageRepositoryImpl$networkUpdateSiteNotification$1.f15199d = 2;
            objM22789A0 = this.f16490c.m3900o(num, requestLanguageContextSiteNotification, languageRepositoryImpl$networkUpdateSiteNotification$1);
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r7.f16491d).m7894n0((java.util.Set) r10, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7213j(String str, Set set, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUpdateTopics$1 languageRepositoryImpl$networkUpdateTopics$1;
        int i;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUpdateTopics$1) {
            languageRepositoryImpl$networkUpdateTopics$1 = (LanguageRepositoryImpl$networkUpdateTopics$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUpdateTopics$1.f15204e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUpdateTopics$1.f15204e = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUpdateTopics$1 = new LanguageRepositoryImpl$networkUpdateTopics$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUpdateTopics$1 = new LanguageRepositoryImpl$networkUpdateTopics$1(this, continuationImpl);
        }
        Object objM15541t = languageRepositoryImpl$networkUpdateTopics$1.f15202c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUpdateTopics$1.f15204e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            i93 i93VarM22791z0 = this.f16489b.m22791z0(str);
            languageRepositoryImpl$networkUpdateTopics$1.f15200a = set;
            languageRepositoryImpl$networkUpdateTopics$1.f15204e = 1;
            objM15541t = AbstractC3224d.m15541t(i93VarM22791z0, languageRepositoryImpl$networkUpdateTopics$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            set = languageRepositoryImpl$networkUpdateTopics$1.f15200a;
            AbstractC3193b.m15359b(objM15541t);
        } else if (i3 == 2) {
            i = languageRepositoryImpl$networkUpdateTopics$1.f15201b;
            Set set2 = languageRepositoryImpl$networkUpdateTopics$1.f15200a;
            AbstractC3193b.m15359b(objM15541t);
            languageRepositoryImpl$networkUpdateTopics$1.f15200a = null;
            languageRepositoryImpl$networkUpdateTopics$1.f15201b = i;
            languageRepositoryImpl$networkUpdateTopics$1.f15204e = 3;
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Set set3 = languageRepositoryImpl$networkUpdateTopics$1.f15200a;
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM15541t;
        if (languageContextEntity != null) {
            Integer num = new Integer(languageContextEntity.f17150b);
            RequestTopics requestTopics = new RequestTopics(u91.m22622n1(set));
            languageRepositoryImpl$networkUpdateTopics$1.f15200a = null;
            languageRepositoryImpl$networkUpdateTopics$1.f15201b = 0;
            languageRepositoryImpl$networkUpdateTopics$1.f15204e = 2;
            objM15541t = this.f16490c.m3890e(num, requestTopics, languageRepositoryImpl$networkUpdateTopics$1);
            if (objM15541t != coroutineSingletons) {
                i = 0;
                languageRepositoryImpl$networkUpdateTopics$1.f15200a = null;
                languageRepositoryImpl$networkUpdateTopics$1.f15201b = i;
                languageRepositoryImpl$networkUpdateTopics$1.f15204e = 3;
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7214k(int i, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$networkUserLanguage$1 languageRepositoryImpl$networkUserLanguage$1;
        ResultLanguage resultLanguage;
        String str;
        if (continuationImpl instanceof LanguageRepositoryImpl$networkUserLanguage$1) {
            languageRepositoryImpl$networkUserLanguage$1 = (LanguageRepositoryImpl$networkUserLanguage$1) continuationImpl;
            int i2 = languageRepositoryImpl$networkUserLanguage$1.f15208d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$networkUserLanguage$1.f15208d = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$networkUserLanguage$1 = new LanguageRepositoryImpl$networkUserLanguage$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$networkUserLanguage$1 = new LanguageRepositoryImpl$networkUserLanguage$1(this, continuationImpl);
        }
        Object objM3892g = languageRepositoryImpl$networkUserLanguage$1.f15206b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$networkUserLanguage$1.f15208d;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM3892g);
                bn4 bn4Var = this.f16490c;
                Integer num = new Integer(i);
                languageRepositoryImpl$networkUserLanguage$1.f15205a = i;
                languageRepositoryImpl$networkUserLanguage$1.f15208d = 1;
                objM3892g = bn4Var.m3892g(num, languageRepositoryImpl$networkUserLanguage$1);
                if (objM3892g == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i3 == 1) {
                i = languageRepositoryImpl$networkUserLanguage$1.f15205a;
                AbstractC3193b.m15359b(objM3892g);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3892g);
            }
            lda.m16122h(((Number) objM3892g).longValue());
            return xfa.f68157a;
            ResultLanguageContext resultLanguageContext = (ResultLanguageContext) objM3892g;
            if (resultLanguageContext != null && (resultLanguage = resultLanguageContext.f20883k) != null && (str = resultLanguage.f20864b) != null) {
                LingQDatabase lingQDatabase = this.f16488a;
                LanguageRepositoryImpl$networkUserLanguage$2$1$1 languageRepositoryImpl$networkUserLanguage$2$1$1 = new LanguageRepositoryImpl$networkUserLanguage$2$1$1(this, resultLanguageContext, str, null);
                languageRepositoryImpl$networkUserLanguage$1.f15205a = i;
                languageRepositoryImpl$networkUserLanguage$1.f15208d = 2;
                objM3892g = AbstractC0747e.m2849b(lingQDatabase, languageRepositoryImpl$networkUserLanguage$2$1$1, languageRepositoryImpl$networkUserLanguage$1);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public final c83 m7215l(String str) {
        str.getClass();
        return AbstractC3224d.m15536o(new yo1(this.f16489b.m22791z0(str), 2));
    }

    /* JADX INFO: renamed from: m */
    public final c83 m7216m() {
        ul4 ul4Var = this.f16489b;
        return AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(ul4Var.f64042K, false, new String[]{"LanguageContextEntity"}, new C3741x(ul4Var, 27)), 5));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0097, code lost:
    
        if (r4.mo4095v0(r9, r0) == r1) goto L39;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7217n(String str, jz1 jz1Var, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$setDailyStreakTarget$1 languageRepositoryImpl$setDailyStreakTarget$1;
        m88 m88Var;
        String str2;
        if (continuationImpl instanceof LanguageRepositoryImpl$setDailyStreakTarget$1) {
            languageRepositoryImpl$setDailyStreakTarget$1 = (LanguageRepositoryImpl$setDailyStreakTarget$1) continuationImpl;
            int i = languageRepositoryImpl$setDailyStreakTarget$1.f15223e;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$setDailyStreakTarget$1.f15223e = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$setDailyStreakTarget$1 = new LanguageRepositoryImpl$setDailyStreakTarget$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$setDailyStreakTarget$1 = new LanguageRepositoryImpl$setDailyStreakTarget$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$setDailyStreakTarget$1.f15221c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$setDailyStreakTarget$1.f15223e;
        zj6 zj6Var = zj6.f71653a;
        ul4 ul4Var = this.f16489b;
        String strM16682n = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM22789A0);
                languageRepositoryImpl$setDailyStreakTarget$1.f15219a = str;
                languageRepositoryImpl$setDailyStreakTarget$1.f15220b = jz1Var;
                languageRepositoryImpl$setDailyStreakTarget$1.f15223e = 1;
                objM22789A0 = ul4Var.m22789A0(str, languageRepositoryImpl$setDailyStreakTarget$1);
                if (objM22789A0 == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                jz1Var = languageRepositoryImpl$setDailyStreakTarget$1.f15220b;
                str = languageRepositoryImpl$setDailyStreakTarget$1.f15219a;
                AbstractC3193b.m15359b(objM22789A0);
            } else if (i2 == 2) {
                str2 = languageRepositoryImpl$setDailyStreakTarget$1.f15219a;
                AbstractC3193b.m15359b(objM22789A0);
                LanguageContextEntity languageContextEntityM19769F = AbstractC3489q9.m19769F((ResultLanguageContext) objM22789A0, str2);
                languageRepositoryImpl$setDailyStreakTarget$1.f15219a = null;
                languageRepositoryImpl$setDailyStreakTarget$1.f15220b = null;
                languageRepositoryImpl$setDailyStreakTarget$1.f15223e = 3;
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM22789A0);
            }
            return new xm5(xfa.f68157a);
            LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
            if (languageContextEntity == null) {
                return new um5(zj6Var);
            }
            bn4 bn4Var = this.f16490c;
            Integer num = new Integer(languageContextEntity.f17150b);
            RequestDailyStreakTarget requestDailyStreakTarget = new RequestDailyStreakTarget(jz1Var.mo13592a(), jz1Var.mo13593b());
            languageRepositoryImpl$setDailyStreakTarget$1.f15219a = str;
            languageRepositoryImpl$setDailyStreakTarget$1.f15220b = null;
            languageRepositoryImpl$setDailyStreakTarget$1.f15223e = 2;
            objM22789A0 = bn4Var.m3889d(num, requestDailyStreakTarget, languageRepositoryImpl$setDailyStreakTarget$1);
            if (objM22789A0 != coroutineSingletons) {
                str2 = str;
                LanguageContextEntity languageContextEntityM19769F2 = AbstractC3489q9.m19769F((ResultLanguageContext) objM22789A0, str2);
                languageRepositoryImpl$setDailyStreakTarget$1.f15219a = null;
                languageRepositoryImpl$setDailyStreakTarget$1.f15220b = null;
                languageRepositoryImpl$setDailyStreakTarget$1.f15223e = 3;
            }
            return coroutineSingletons;
        } catch (CancellationException e) {
            throw e;
        } catch (HttpException e2) {
            int i3 = e2.f59169a;
            NetworkErrorType networkErrorTypeM21604O = AbstractC3584sr.m21604O(i3);
            i88 i88Var = e2.f59170b;
            if (i88Var != null && (m88Var = i88Var.f43691c) != null) {
                strM16682n = m88Var.m16682n();
            }
            return new um5(new xj6(i3, networkErrorTypeM21604O, strM16682n));
        } catch (Exception unused) {
            return new um5(zj6Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m7218o(ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateAllLanguages$1 languageRepositoryImpl$updateAllLanguages$1;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateAllLanguages$1) {
            languageRepositoryImpl$updateAllLanguages$1 = (LanguageRepositoryImpl$updateAllLanguages$1) continuationImpl;
            int i = languageRepositoryImpl$updateAllLanguages$1.f15226c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateAllLanguages$1.f15226c = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateAllLanguages$1 = new LanguageRepositoryImpl$updateAllLanguages$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateAllLanguages$1 = new LanguageRepositoryImpl$updateAllLanguages$1(this, continuationImpl);
        }
        Object objM3894i = languageRepositoryImpl$updateAllLanguages$1.f15224a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$updateAllLanguages$1.f15226c;
        xfa xfaVar = xfa.f68157a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3894i);
                bn4 bn4Var = this.f16490c;
                languageRepositoryImpl$updateAllLanguages$1.f15226c = 1;
                objM3894i = bn4Var.m3894i(languageRepositoryImpl$updateAllLanguages$1);
                if (objM3894i == coroutineSingletons) {
                }
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM3894i);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3894i);
            }
            ul4 ul4Var = this.f16489b;
            List list = (List) objM3894i;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3489q9.m19768E((ResultLanguage) it.next()));
            }
            languageRepositoryImpl$updateAllLanguages$1.f15226c = 2;
            Object objM2861d = AbstractC0758a.m2861d(new nl4(ul4Var, arrayList, 0), ul4Var.f64042K, languageRepositoryImpl$updateAllLanguages$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9 A[LOOP:0: B:32:0x00d7->B:33:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: p */
    public final Object m7219p(String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateEmailNotification$1 languageRepositoryImpl$updateEmailNotification$1;
        boolean z2;
        Object objM22789A0;
        String str2;
        LanguageContextNotification languageContextNotification;
        Pair[] pairArr;
        hi8 hi8Var;
        int i;
        String str3 = str;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateEmailNotification$1) {
            languageRepositoryImpl$updateEmailNotification$1 = (LanguageRepositoryImpl$updateEmailNotification$1) continuationImpl;
            int i2 = languageRepositoryImpl$updateEmailNotification$1.f15232f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateEmailNotification$1.f15232f = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateEmailNotification$1 = new LanguageRepositoryImpl$updateEmailNotification$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateEmailNotification$1 = new LanguageRepositoryImpl$updateEmailNotification$1(this, continuationImpl);
        }
        Object obj = languageRepositoryImpl$updateEmailNotification$1.f15230d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$updateEmailNotification$1.f15232f;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            languageRepositoryImpl$updateEmailNotification$1.f15227a = str3;
            z2 = z;
            languageRepositoryImpl$updateEmailNotification$1.f15229c = z2;
            languageRepositoryImpl$updateEmailNotification$1.f15232f = 1;
            objM22789A0 = ul4Var.m22789A0(str3, languageRepositoryImpl$updateEmailNotification$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            boolean z3 = languageRepositoryImpl$updateEmailNotification$1.f15229c;
            String str4 = languageRepositoryImpl$updateEmailNotification$1.f15227a;
            AbstractC3193b.m15359b(obj);
            z2 = z3;
            str3 = str4;
            objM22789A0 = obj;
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            languageContextNotification = languageRepositoryImpl$updateEmailNotification$1.f15228b;
            str2 = languageRepositoryImpl$updateEmailNotification$1.f15227a;
            AbstractC3193b.m15359b(obj);
        }
        String str5 = languageContextNotification.f19044a;
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageEmailNotificationUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str2), new Pair("lotd", str5)};
        hi8Var = new hi8(10);
        for (i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            LanguageContextNotification languageContextNotification2 = languageContextEntity.f17154f;
            if (languageContextNotification2 == null) {
                languageContextNotification2 = new LanguageContextNotification("", "");
            }
            LanguageContextNotification languageContextNotificationM8024a = LanguageContextNotification.m8024a(languageContextNotification2, z2 ? "on" : "off");
            LanguageContextEntity languageContextEntityM7595a = LanguageContextEntity.m7595a(languageContextEntity, 0, languageContextNotificationM8024a, null, null, null, 524255);
            languageRepositoryImpl$updateEmailNotification$1.f15227a = str3;
            languageRepositoryImpl$updateEmailNotification$1.f15228b = languageContextNotificationM8024a;
            languageRepositoryImpl$updateEmailNotification$1.f15229c = z2;
            languageRepositoryImpl$updateEmailNotification$1.f15232f = 2;
            if (ul4Var.mo4095v0(languageContextEntityM7595a, languageRepositoryImpl$updateEmailNotification$1) != coroutineSingletons) {
                str2 = str3;
                languageContextNotification = languageContextNotificationM8024a;
                String str6 = languageContextNotification.f19044a;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageEmailNotificationUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str2), new Pair("lotd", str6)};
                hi8Var = new hi8(10);
                while (i < 2) {
                    Pair pair2 = pairArr[i];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c4 A[LOOP:0: B:27:0x00c2->B:28:0x00c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: q */
    public final Object m7220q(String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateFeedLevels$1 languageRepositoryImpl$updateFeedLevels$1;
        List list;
        String str2;
        List list2;
        int i;
        Pair[] pairArr;
        hi8 hi8Var;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateFeedLevels$1) {
            languageRepositoryImpl$updateFeedLevels$1 = (LanguageRepositoryImpl$updateFeedLevels$1) continuationImpl;
            int i2 = languageRepositoryImpl$updateFeedLevels$1.f15237e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateFeedLevels$1.f15237e = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateFeedLevels$1 = new LanguageRepositoryImpl$updateFeedLevels$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateFeedLevels$1 = new LanguageRepositoryImpl$updateFeedLevels$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$updateFeedLevels$1.f15235c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$updateFeedLevels$1.f15237e;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$updateFeedLevels$1.f15233a = str;
            languageRepositoryImpl$updateFeedLevels$1.f15234b = arrayList;
            languageRepositoryImpl$updateFeedLevels$1.f15237e = 1;
            objM22789A0 = ul4Var.m22789A0(str, languageRepositoryImpl$updateFeedLevels$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            list = arrayList;
            return coroutineSingletons;
        }
        if (i3 == 1) {
            List list3 = languageRepositoryImpl$updateFeedLevels$1.f15234b;
            str = languageRepositoryImpl$updateFeedLevels$1.f15233a;
            AbstractC3193b.m15359b(objM22789A0);
            list = list3;
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list4 = languageRepositoryImpl$updateFeedLevels$1.f15234b;
            str2 = languageRepositoryImpl$updateFeedLevels$1.f15233a;
            AbstractC3193b.m15359b(objM22789A0);
            list2 = list4;
        }
        String[] strArr = (String[]) list2.toArray(new String[0]);
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageFeedLevelUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str2), new Pair("levels", strArr)};
        hi8Var = new hi8(10);
        for (i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        list = arrayList;
        List list5 = list;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            LanguageContextEntity languageContextEntityM7595a = LanguageContextEntity.m7595a(languageContextEntity, 0, null, null, null, list5, 393215);
            languageRepositoryImpl$updateFeedLevels$1.f15233a = str;
            languageRepositoryImpl$updateFeedLevels$1.f15234b = list5;
            languageRepositoryImpl$updateFeedLevels$1.f15237e = 2;
            if (ul4Var.mo4095v0(languageContextEntityM7595a, languageRepositoryImpl$updateFeedLevels$1) != coroutineSingletons) {
                str2 = str;
                list2 = list5;
                String[] strArr2 = (String[]) list2.toArray(new String[0]);
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageFeedLevelUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str2), new Pair("levels", strArr2)};
                hi8Var = new hi8(10);
                while (i < 2) {
                    Pair pair2 = pairArr[i];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            list = arrayList;
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b2 A[LOOP:0: B:27:0x00b0->B:28:0x00b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m7221r(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateIntensity$1 languageRepositoryImpl$updateIntensity$1;
        String str3;
        String str4;
        Pair[] pairArr;
        hi8 hi8Var;
        int i;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateIntensity$1) {
            languageRepositoryImpl$updateIntensity$1 = (LanguageRepositoryImpl$updateIntensity$1) continuationImpl;
            int i2 = languageRepositoryImpl$updateIntensity$1.f15242e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateIntensity$1.f15242e = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateIntensity$1 = new LanguageRepositoryImpl$updateIntensity$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateIntensity$1 = new LanguageRepositoryImpl$updateIntensity$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$updateIntensity$1.f15240c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$updateIntensity$1.f15242e;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$updateIntensity$1.f15238a = str;
            languageRepositoryImpl$updateIntensity$1.f15239b = str2;
            languageRepositoryImpl$updateIntensity$1.f15242e = 1;
            objM22789A0 = ul4Var.m22789A0(str, languageRepositoryImpl$updateIntensity$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str2 = languageRepositoryImpl$updateIntensity$1.f15239b;
            str = languageRepositoryImpl$updateIntensity$1.f15238a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = languageRepositoryImpl$updateIntensity$1.f15239b;
            str3 = languageRepositoryImpl$updateIntensity$1.f15238a;
            AbstractC3193b.m15359b(objM22789A0);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageIntensityUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str3), new Pair("intensity", str4)};
        hi8Var = new hi8(10);
        for (i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        String str5 = str2;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            LanguageContextEntity languageContextEntityM7595a = LanguageContextEntity.m7595a(languageContextEntity, 0, null, null, str5, null, 524031);
            languageRepositoryImpl$updateIntensity$1.f15238a = str;
            languageRepositoryImpl$updateIntensity$1.f15239b = str5;
            languageRepositoryImpl$updateIntensity$1.f15242e = 2;
            if (ul4Var.mo4095v0(languageContextEntityM7595a, languageRepositoryImpl$updateIntensity$1) != coroutineSingletons) {
                str3 = str;
                str4 = str5;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageIntensityUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str3), new Pair("intensity", str4)};
                hi8Var = new hi8(10);
                while (i < 2) {
                    Pair pair2 = pairArr[i];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00b5 A[LOOP:0: B:27:0x00b3->B:28:0x00b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: s */
    public final Object m7222s(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateRepetitionLingqs$1 languageRepositoryImpl$updateRepetitionLingqs$1;
        int i2;
        Pair[] pairArr;
        hi8 hi8Var;
        int i3;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateRepetitionLingqs$1) {
            languageRepositoryImpl$updateRepetitionLingqs$1 = (LanguageRepositoryImpl$updateRepetitionLingqs$1) continuationImpl;
            int i4 = languageRepositoryImpl$updateRepetitionLingqs$1.f15247e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateRepetitionLingqs$1.f15247e = i4 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateRepetitionLingqs$1 = new LanguageRepositoryImpl$updateRepetitionLingqs$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateRepetitionLingqs$1 = new LanguageRepositoryImpl$updateRepetitionLingqs$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$updateRepetitionLingqs$1.f15245c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = languageRepositoryImpl$updateRepetitionLingqs$1.f15247e;
        ul4 ul4Var = this.f16489b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$updateRepetitionLingqs$1.f15243a = str;
            languageRepositoryImpl$updateRepetitionLingqs$1.f15244b = i;
            languageRepositoryImpl$updateRepetitionLingqs$1.f15247e = 1;
            objM22789A0 = ul4Var.m22789A0(str, languageRepositoryImpl$updateRepetitionLingqs$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            i = languageRepositoryImpl$updateRepetitionLingqs$1.f15244b;
            str = languageRepositoryImpl$updateRepetitionLingqs$1.f15243a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i5 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = languageRepositoryImpl$updateRepetitionLingqs$1.f15244b;
            str = languageRepositoryImpl$updateRepetitionLingqs$1.f15243a;
            AbstractC3193b.m15359b(objM22789A0);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageRepetitionLingqsUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str), new Pair("repetitionLingqs", Integer.valueOf(i2))};
        hi8Var = new hi8(10);
        for (i3 = 0; i3 < 2; i3++) {
            Pair pair = pairArr[i3];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        int i6 = i;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            LanguageContextEntity languageContextEntityM7595a = LanguageContextEntity.m7595a(languageContextEntity, i6, null, null, null, null, 524279);
            languageRepositoryImpl$updateRepetitionLingqs$1.f15243a = str;
            languageRepositoryImpl$updateRepetitionLingqs$1.f15244b = i6;
            languageRepositoryImpl$updateRepetitionLingqs$1.f15247e = 2;
            if (ul4Var.mo4095v0(languageContextEntityM7595a, languageRepositoryImpl$updateRepetitionLingqs$1) != coroutineSingletons) {
                i2 = i6;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageRepetitionLingqsUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str), new Pair("repetitionLingqs", Integer.valueOf(i2))};
                hi8Var = new hi8(10);
                while (i3 < 2) {
                    Pair pair2 = pairArr[i3];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00d9 A[LOOP:0: B:32:0x00d7->B:33:0x00d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: t */
    public final Object m7223t(String str, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateSiteNotification$1 languageRepositoryImpl$updateSiteNotification$1;
        boolean z2;
        Object objM22789A0;
        String str2;
        LanguageContextNotification languageContextNotification;
        Pair[] pairArr;
        hi8 hi8Var;
        int i;
        String str3 = str;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateSiteNotification$1) {
            languageRepositoryImpl$updateSiteNotification$1 = (LanguageRepositoryImpl$updateSiteNotification$1) continuationImpl;
            int i2 = languageRepositoryImpl$updateSiteNotification$1.f15253f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateSiteNotification$1.f15253f = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateSiteNotification$1 = new LanguageRepositoryImpl$updateSiteNotification$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateSiteNotification$1 = new LanguageRepositoryImpl$updateSiteNotification$1(this, continuationImpl);
        }
        Object obj = languageRepositoryImpl$updateSiteNotification$1.f15251d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$updateSiteNotification$1.f15253f;
        ul4 ul4Var = this.f16489b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            languageRepositoryImpl$updateSiteNotification$1.f15248a = str3;
            z2 = z;
            languageRepositoryImpl$updateSiteNotification$1.f15250c = z2;
            languageRepositoryImpl$updateSiteNotification$1.f15253f = 1;
            objM22789A0 = ul4Var.m22789A0(str3, languageRepositoryImpl$updateSiteNotification$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            boolean z3 = languageRepositoryImpl$updateSiteNotification$1.f15250c;
            String str4 = languageRepositoryImpl$updateSiteNotification$1.f15248a;
            AbstractC3193b.m15359b(obj);
            z2 = z3;
            str3 = str4;
            objM22789A0 = obj;
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            languageContextNotification = languageRepositoryImpl$updateSiteNotification$1.f15249b;
            str2 = languageRepositoryImpl$updateSiteNotification$1.f15248a;
            AbstractC3193b.m15359b(obj);
        }
        String str5 = languageContextNotification.f19044a;
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageSiteNotificationUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str2), new Pair("lotd", str5)};
        hi8Var = new hi8(10);
        for (i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        LanguageContextEntity languageContextEntity = (LanguageContextEntity) objM22789A0;
        if (languageContextEntity != null) {
            LanguageContextNotification languageContextNotification2 = languageContextEntity.f17155g;
            if (languageContextNotification2 == null) {
                languageContextNotification2 = new LanguageContextNotification("", "");
            }
            LanguageContextNotification languageContextNotificationM8024a = LanguageContextNotification.m8024a(languageContextNotification2, z2 ? "on" : "off");
            LanguageContextEntity languageContextEntityM7595a = LanguageContextEntity.m7595a(languageContextEntity, 0, null, languageContextNotificationM8024a, null, null, 524223);
            languageRepositoryImpl$updateSiteNotification$1.f15248a = str3;
            languageRepositoryImpl$updateSiteNotification$1.f15249b = languageContextNotificationM8024a;
            languageRepositoryImpl$updateSiteNotification$1.f15250c = z2;
            languageRepositoryImpl$updateSiteNotification$1.f15253f = 2;
            if (ul4Var.mo4095v0(languageContextEntityM7595a, languageRepositoryImpl$updateSiteNotification$1) != coroutineSingletons) {
                str2 = str3;
                languageContextNotification = languageContextNotificationM8024a;
                String str6 = languageContextNotification.f19044a;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageSiteNotificationUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str2), new Pair("lotd", str6)};
                hi8Var = new hi8(10);
                while (i < 2) {
                    Pair pair2 = pairArr[i];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd A[LOOP:0: B:26:0x00bb->B:27:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: u */
    public final Object m7224u(String str, Set set, ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateTopics$1 languageRepositoryImpl$updateTopics$1;
        String str2;
        Set set2;
        int i;
        Pair[] pairArr;
        hi8 hi8Var;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateTopics$1) {
            languageRepositoryImpl$updateTopics$1 = (LanguageRepositoryImpl$updateTopics$1) continuationImpl;
            int i2 = languageRepositoryImpl$updateTopics$1.f15258e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateTopics$1.f15258e = i2 - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateTopics$1 = new LanguageRepositoryImpl$updateTopics$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateTopics$1 = new LanguageRepositoryImpl$updateTopics$1(this, continuationImpl);
        }
        Object objM22789A0 = languageRepositoryImpl$updateTopics$1.f15256c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = languageRepositoryImpl$updateTopics$1.f15258e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM22789A0);
            languageRepositoryImpl$updateTopics$1.f15254a = str;
            languageRepositoryImpl$updateTopics$1.f15255b = set;
            languageRepositoryImpl$updateTopics$1.f15258e = 1;
            objM22789A0 = this.f16489b.m22789A0(str, languageRepositoryImpl$updateTopics$1);
            if (objM22789A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            set = languageRepositoryImpl$updateTopics$1.f15255b;
            str = languageRepositoryImpl$updateTopics$1.f15254a;
            AbstractC3193b.m15359b(objM22789A0);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            set2 = languageRepositoryImpl$updateTopics$1.f15255b;
            str2 = languageRepositoryImpl$updateTopics$1.f15254a;
            AbstractC3193b.m15359b(objM22789A0);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(LanguageTopicsUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair pair = new Pair("language", str2);
        pairArr = new Pair[]{pair, new Pair("topics", set2.toArray(new String[0]))};
        hi8Var = new hi8(10);
        for (i = 0; i < 2; i++) {
            Pair pair2 = pairArr[i];
            hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
        }
        this.f16492e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        if (((LanguageContextEntity) objM22789A0) != null) {
            languageRepositoryImpl$updateTopics$1.f15254a = str;
            languageRepositoryImpl$updateTopics$1.f15255b = set;
            languageRepositoryImpl$updateTopics$1.f15258e = 2;
            if (((C1368a) this.f16491d).m7894n0(set, languageRepositoryImpl$updateTopics$1) != coroutineSingletons) {
                Set set3 = set;
                str2 = str;
                set2 = set3;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(LanguageTopicsUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                Pair pair3 = new Pair("language", str2);
                pairArr = new Pair[]{pair3, new Pair("topics", set2.toArray(new String[0]))};
                hi8Var = new hi8(10);
                while (i < 2) {
                    Pair pair4 = pairArr[i];
                    hi8Var.m13287x(pair4.f47624b, (String) pair4.f47623a);
                }
                this.f16492e.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (androidx.room.AbstractC0747e.m2849b(r8, r4, r0) == r1) goto L37;
     */
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7225v(ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$updateUserLanguages$1 languageRepositoryImpl$updateUserLanguages$1;
        String str;
        if (continuationImpl instanceof LanguageRepositoryImpl$updateUserLanguages$1) {
            languageRepositoryImpl$updateUserLanguages$1 = (LanguageRepositoryImpl$updateUserLanguages$1) continuationImpl;
            int i = languageRepositoryImpl$updateUserLanguages$1.f15261c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$updateUserLanguages$1.f15261c = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$updateUserLanguages$1 = new LanguageRepositoryImpl$updateUserLanguages$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$updateUserLanguages$1 = new LanguageRepositoryImpl$updateUserLanguages$1(this, continuationImpl);
        }
        Object objM3895j = languageRepositoryImpl$updateUserLanguages$1.f15259a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$updateUserLanguages$1.f15261c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3895j);
                bn4 bn4Var = this.f16490c;
                languageRepositoryImpl$updateUserLanguages$1.f15261c = 1;
                objM3895j = bn4Var.m3895j(languageRepositoryImpl$updateUserLanguages$1);
                if (objM3895j == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM3895j);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3895j);
            }
            return xfa.f68157a;
            List<ResultLanguageContext> list = ((Results) objM3895j).f21739d;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (ResultLanguageContext resultLanguageContext : list) {
                    ResultLanguage resultLanguage = resultLanguageContext.f20883k;
                    LanguageContextEntity languageContextEntityM19769F = (resultLanguage == null || (str = resultLanguage.f20864b) == null) ? null : AbstractC3489q9.m19769F(resultLanguageContext, str);
                    if (languageContextEntityM19769F != null) {
                        arrayList.add(languageContextEntityM19769F);
                    }
                }
                LingQDatabase lingQDatabase = this.f16488a;
                LanguageRepositoryImpl$updateUserLanguages$2$1 languageRepositoryImpl$updateUserLanguages$2$1 = new LanguageRepositoryImpl$updateUserLanguages$2$1(this, arrayList, null);
                languageRepositoryImpl$updateUserLanguages$1.f15261c = 2;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x008c A[Catch: Exception -> 0x00cd, TryCatch #0 {Exception -> 0x00cd, blocks: (B:13:0x002a, B:43:0x00a1, B:44:0x00b2, B:46:0x00b8, B:47:0x00c6, B:17:0x0035, B:40:0x008c, B:18:0x0039, B:24:0x004b, B:26:0x0051, B:27:0x005c, B:29:0x0062, B:31:0x006c, B:33:0x0070, B:36:0x0078, B:37:0x007c, B:21:0x0040), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009e, code lost:
    
        if (r10 == r1) goto L42;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable m7226w(ContinuationImpl continuationImpl) throws Throwable {
        LanguageRepositoryImpl$userLanguages$1 languageRepositoryImpl$userLanguages$1;
        String str;
        if (continuationImpl instanceof LanguageRepositoryImpl$userLanguages$1) {
            languageRepositoryImpl$userLanguages$1 = (LanguageRepositoryImpl$userLanguages$1) continuationImpl;
            int i = languageRepositoryImpl$userLanguages$1.f15267c;
            if ((i & Integer.MIN_VALUE) != 0) {
                languageRepositoryImpl$userLanguages$1.f15267c = i - Integer.MIN_VALUE;
            } else {
                languageRepositoryImpl$userLanguages$1 = new LanguageRepositoryImpl$userLanguages$1(this, continuationImpl);
            }
        } else {
            languageRepositoryImpl$userLanguages$1 = new LanguageRepositoryImpl$userLanguages$1(this, continuationImpl);
        }
        Object objM3895j = languageRepositoryImpl$userLanguages$1.f15265a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = languageRepositoryImpl$userLanguages$1.f15267c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM3895j);
                bn4 bn4Var = this.f16490c;
                languageRepositoryImpl$userLanguages$1.f15267c = 1;
                objM3895j = bn4Var.m3895j(languageRepositoryImpl$userLanguages$1);
                if (objM3895j == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM3895j);
            } else if (i2 == 2) {
                AbstractC3193b.m15359b(objM3895j);
                ul4 ul4Var = this.f16489b;
                languageRepositoryImpl$userLanguages$1.f15267c = 3;
                objM3895j = AbstractC0758a.m2861d(new C0011a9(ul4Var, 22), ul4Var.f64042K, languageRepositoryImpl$userLanguages$1, true, false);
            } else {
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM3895j);
            }
            Iterable iterable = (Iterable) objM3895j;
            ArrayList arrayList = new ArrayList(v91.m23189q0(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC3423or.m18265l0((LanguageContextEntity) it.next()));
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
            return EmptyList.f47638a;
            List<ResultLanguageContext> list = ((Results) objM3895j).f21739d;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (ResultLanguageContext resultLanguageContext : list) {
                    ResultLanguage resultLanguage = resultLanguageContext.f20883k;
                    LanguageContextEntity languageContextEntityM19769F = (resultLanguage == null || (str = resultLanguage.f20864b) == null) ? null : AbstractC3489q9.m19769F(resultLanguageContext, str);
                    if (languageContextEntityM19769F != null) {
                        arrayList2.add(languageContextEntityM19769F);
                    }
                }
                LingQDatabase lingQDatabase = this.f16488a;
                LanguageRepositoryImpl$userLanguages$2$1 languageRepositoryImpl$userLanguages$2$1 = new LanguageRepositoryImpl$userLanguages$2$1(this, arrayList2, null);
                languageRepositoryImpl$userLanguages$1.f15267c = 2;
                if (AbstractC0747e.m2849b(lingQDatabase, languageRepositoryImpl$userLanguages$2$1, languageRepositoryImpl$userLanguages$1) != coroutineSingletons) {
                    ul4 ul4Var2 = this.f16489b;
                    languageRepositoryImpl$userLanguages$1.f15267c = 3;
                    objM3895j = AbstractC0758a.m2861d(new C0011a9(ul4Var2, 22), ul4Var2.f64042K, languageRepositoryImpl$userLanguages$1, true, false);
                }
            } else {
                ul4 ul4Var3 = this.f16489b;
                languageRepositoryImpl$userLanguages$1.f15267c = 3;
                objM3895j = AbstractC0758a.m2861d(new C0011a9(ul4Var3, 22), ul4Var3.f64042K, languageRepositoryImpl$userLanguages$1, true, false);
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }
}
