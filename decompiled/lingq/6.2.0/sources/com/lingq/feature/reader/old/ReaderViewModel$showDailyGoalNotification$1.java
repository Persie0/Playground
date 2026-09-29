package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.b5d;
import p000.c32;
import p000.c83;
import p000.fj9;
import p000.h24;
import p000.ty1;
import p000.un1;
import p000.vi7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$showDailyGoalNotification$1", m4291f = "ReaderViewModel.kt", m4292l = {2762, 2763}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$showDailyGoalNotification$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2412n f29059a;

    /* JADX INFO: renamed from: b */
    public DailyGoalMet f29060b;

    /* JADX INFO: renamed from: c */
    public LanguageStudyStats f29061c;

    /* JADX INFO: renamed from: d */
    public String f29062d;

    /* JADX INFO: renamed from: e */
    public int f29063e;

    /* JADX INFO: renamed from: f */
    public int f29064f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2412n f29065g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DailyGoalMet f29066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$showDailyGoalNotification$1(C2412n c2412n, DailyGoalMet dailyGoalMet, Continuation continuation) {
        super(2, continuation);
        this.f29065g = c2412n;
        this.f29066h = dailyGoalMet;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$showDailyGoalNotification$1(this.f29065g, this.f29066h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$showDailyGoalNotification$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0088  */
    /* JADX WARN: Code duplicated, block: B:23:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n;
        LanguageStudyStats languageStudyStats;
        int i;
        Object objM15541t;
        DailyGoalMet dailyGoalMet;
        C2412n c2412n2;
        String str;
        DailyGoalMet dailyGoalMet2;
        InAppNotificationType inAppNotificationType;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f29064f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            c2412n = this.f29065g;
            languageStudyStats = (LanguageStudyStats) c2412n.f29374j1.getValue();
            if (languageStudyStats != null) {
                c83 c83VarMo4583O1 = c2412n.f29340b.mo4583O1();
                this.f29059a = c2412n;
                DailyGoalMet dailyGoalMet3 = this.f29066h;
                this.f29060b = dailyGoalMet3;
                this.f29061c = languageStudyStats;
                i = 0;
                this.f29063e = 0;
                this.f29064f = 1;
                objM15541t = AbstractC3224d.m15541t(c83VarMo4583O1, this);
                if (objM15541t != coroutineSingletons) {
                    dailyGoalMet = dailyGoalMet3;
                }
                return coroutineSingletons;
            }
            return xfa.f68157a;
        }
        if (i2 == 1) {
            int i3 = this.f29063e;
            LanguageStudyStats languageStudyStats2 = this.f29061c;
            dailyGoalMet = this.f29060b;
            C2412n c2412n3 = this.f29059a;
            AbstractC3193b.m15359b(obj);
            i = i3;
            languageStudyStats = languageStudyStats2;
            objM15541t = obj;
            c2412n = c2412n3;
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.f29062d;
            languageStudyStats = this.f29061c;
            dailyGoalMet2 = this.f29060b;
            c2412n2 = this.f29059a;
            AbstractC3193b.m15359b(obj);
        }
        fj9 fj9VarM3326d = b5d.m3326d(languageStudyStats, str, (String) obj);
        if (dailyGoalMet2.f19518e) {
            inAppNotificationType = InAppNotificationType.DailyGoalDouble;
        } else {
            inAppNotificationType = InAppNotificationType.DailyGoal;
        }
        h24 h24Var = new h24(inAppNotificationType, null, new ty1(dailyGoalMet2, fj9VarM3326d.f39204a, fj9VarM3326d.f39205b), 14);
        c2412n2.getClass();
        c2412n2.f29384m.mo7013g1(h24Var);
        return xfa.f68157a;
        String str2 = ((ProfileAccount) objM15541t).f19690n;
        vi7 vi7Var = ((C1368a) c2412n.f29271E).f18356L0;
        this.f29059a = c2412n;
        this.f29060b = dailyGoalMet;
        this.f29061c = languageStudyStats;
        this.f29062d = str2;
        this.f29063e = i;
        this.f29064f = 2;
        Object objM15541t2 = AbstractC3224d.m15541t(vi7Var, this);
        if (objM15541t2 != coroutineSingletons) {
            C2412n c2412n4 = c2412n;
            obj = objM15541t2;
            c2412n2 = c2412n4;
            str = str2;
            dailyGoalMet2 = dailyGoalMet;
            fj9 fj9VarM3326d2 = b5d.m3326d(languageStudyStats, str, (String) obj);
            if (dailyGoalMet2.f19518e) {
                inAppNotificationType = InAppNotificationType.DailyGoalDouble;
            } else {
                inAppNotificationType = InAppNotificationType.DailyGoal;
            }
            h24 h24Var2 = new h24(inAppNotificationType, null, new ty1(dailyGoalMet2, fj9VarM3326d2.f39204a, fj9VarM3326d2.f39205b), 14);
            c2412n2.getClass();
            c2412n2.f29384m.mo7013g1(h24Var2);
            return xfa.f68157a;
        }
        return coroutineSingletons;
    }
}
