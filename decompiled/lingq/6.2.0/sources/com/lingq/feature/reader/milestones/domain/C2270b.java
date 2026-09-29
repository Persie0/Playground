package com.lingq.feature.reader.milestones.domain;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1294j;
import com.lingq.core.data.repository.C1298n;
import com.lingq.core.database.dao.C1319g;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.GoalMetType;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3509qs;
import p000.b5d;
import p000.cma;
import p000.fj9;
import p000.gm5;
import p000.go3;
import p000.h24;
import p000.ho3;
import p000.io3;
import p000.jj8;
import p000.jo3;
import p000.ke2;
import p000.nm7;
import p000.oo4;
import p000.qm7;
import p000.si7;
import p000.ty1;
import p000.vi7;
import p000.xy5;

/* JADX INFO: renamed from: com.lingq.feature.reader.milestones.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2270b {

    /* JADX INFO: renamed from: a */
    public final si7 f28195a;

    /* JADX INFO: renamed from: b */
    public final C3509qs f28196b;

    /* JADX INFO: renamed from: c */
    public final oo4 f28197c;

    /* JADX INFO: renamed from: d */
    public final nm7 f28198d;

    /* JADX INFO: renamed from: e */
    public final xy5 f28199e;

    /* JADX INFO: renamed from: f */
    public final cma f28200f;

    public C2270b(si7 si7Var, C3509qs c3509qs, oo4 oo4Var, nm7 nm7Var, xy5 xy5Var, cma cmaVar) {
        si7Var.getClass();
        c3509qs.getClass();
        oo4Var.getClass();
        nm7Var.getClass();
        xy5Var.getClass();
        cmaVar.getClass();
        this.f28195a = si7Var;
        this.f28196b = c3509qs;
        this.f28197c = oo4Var;
        this.f28198d = nm7Var;
        this.f28199e = xy5Var;
        this.f28200f = cmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0115  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:57:0x014a  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m9281a(go3 go3Var, ContinuationImpl continuationImpl) throws Throwable {
        RouteGoalMetUseCase$invoke$1 routeGoalMetUseCase$invoke$1;
        go3 go3Var2;
        boolean zBooleanValue;
        String str;
        DailyGoalMet dailyGoalMet;
        Object objM2861d;
        go3 go3Var3;
        LanguageStudyStats languageStudyStats;
        Object objM15541t;
        boolean z;
        LanguageStudyStats languageStudyStats2;
        go3 go3Var4;
        String str2;
        Object objM15541t2;
        String str3;
        LanguageStudyStats languageStudyStats3;
        DailyGoalMet dailyGoalMet2;
        go3 go3Var5;
        InAppNotificationType inAppNotificationType;
        if (continuationImpl instanceof RouteGoalMetUseCase$invoke$1) {
            routeGoalMetUseCase$invoke$1 = (RouteGoalMetUseCase$invoke$1) continuationImpl;
            int i = routeGoalMetUseCase$invoke$1.f28187h;
            if ((i & Integer.MIN_VALUE) != 0) {
                routeGoalMetUseCase$invoke$1.f28187h = i - Integer.MIN_VALUE;
            } else {
                routeGoalMetUseCase$invoke$1 = new RouteGoalMetUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            routeGoalMetUseCase$invoke$1 = new RouteGoalMetUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t3 = routeGoalMetUseCase$invoke$1.f28185f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = routeGoalMetUseCase$invoke$1.f28187h;
        si7 si7Var = this.f28195a;
        ho3 ho3Var = ho3.f42685a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t3);
            vi7 vi7Var = ((C1368a) si7Var).f18413h1;
            go3Var2 = go3Var;
            routeGoalMetUseCase$invoke$1.f28180a = go3Var2;
            routeGoalMetUseCase$invoke$1.f28187h = 1;
            objM15541t3 = AbstractC3224d.m15541t(vi7Var, routeGoalMetUseCase$invoke$1);
            if (objM15541t3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            go3Var2 = routeGoalMetUseCase$invoke$1.f28180a;
            AbstractC3193b.m15359b(objM15541t3);
        } else {
            if (i2 == 2) {
                boolean z2 = routeGoalMetUseCase$invoke$1.f28184e;
                dailyGoalMet = routeGoalMetUseCase$invoke$1.f28181b;
                go3Var3 = routeGoalMetUseCase$invoke$1.f28180a;
                AbstractC3193b.m15359b(objM15541t3);
                objM2861d = objM15541t3;
                zBooleanValue = z2;
                languageStudyStats = (LanguageStudyStats) objM2861d;
                if (languageStudyStats != null) {
                    qm7 qm7Var = ((C1369b) this.f28198d).f18481n;
                    routeGoalMetUseCase$invoke$1.f28180a = go3Var3;
                    routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
                    routeGoalMetUseCase$invoke$1.f28182c = languageStudyStats;
                    routeGoalMetUseCase$invoke$1.f28184e = zBooleanValue;
                    routeGoalMetUseCase$invoke$1.f28187h = 3;
                    objM15541t = AbstractC3224d.m15541t(qm7Var, routeGoalMetUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        boolean z3 = zBooleanValue;
                        objM15541t3 = objM15541t;
                        z = z3;
                        languageStudyStats2 = languageStudyStats;
                        go3Var4 = go3Var3;
                        str2 = ((ProfileAccount) objM15541t3).f19690n;
                        vi7 vi7Var2 = ((C1368a) si7Var).f18356L0;
                        routeGoalMetUseCase$invoke$1.f28180a = go3Var4;
                        routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
                        routeGoalMetUseCase$invoke$1.f28182c = languageStudyStats2;
                        routeGoalMetUseCase$invoke$1.f28183d = str2;
                        routeGoalMetUseCase$invoke$1.f28184e = z;
                        routeGoalMetUseCase$invoke$1.f28187h = 4;
                        objM15541t2 = AbstractC3224d.m15541t(vi7Var2, routeGoalMetUseCase$invoke$1);
                        if (objM15541t2 != coroutineSingletons) {
                            objM15541t3 = objM15541t2;
                            str3 = str2;
                            languageStudyStats3 = languageStudyStats2;
                            dailyGoalMet2 = dailyGoalMet;
                            go3Var5 = go3Var4;
                        }
                    }
                    return coroutineSingletons;
                }
                return ho3Var;
            }
            if (i2 == 3) {
                z = routeGoalMetUseCase$invoke$1.f28184e;
                languageStudyStats2 = routeGoalMetUseCase$invoke$1.f28182c;
                dailyGoalMet = routeGoalMetUseCase$invoke$1.f28181b;
                go3Var4 = routeGoalMetUseCase$invoke$1.f28180a;
                AbstractC3193b.m15359b(objM15541t3);
                str2 = ((ProfileAccount) objM15541t3).f19690n;
                vi7 vi7Var3 = ((C1368a) si7Var).f18356L0;
                routeGoalMetUseCase$invoke$1.f28180a = go3Var4;
                routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
                routeGoalMetUseCase$invoke$1.f28182c = languageStudyStats2;
                routeGoalMetUseCase$invoke$1.f28183d = str2;
                routeGoalMetUseCase$invoke$1.f28184e = z;
                routeGoalMetUseCase$invoke$1.f28187h = 4;
                objM15541t2 = AbstractC3224d.m15541t(vi7Var3, routeGoalMetUseCase$invoke$1);
                if (objM15541t2 != coroutineSingletons) {
                    objM15541t3 = objM15541t2;
                    str3 = str2;
                    languageStudyStats3 = languageStudyStats2;
                    dailyGoalMet2 = dailyGoalMet;
                    go3Var5 = go3Var4;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM15541t3);
                return ho3Var;
            }
            str3 = routeGoalMetUseCase$invoke$1.f28183d;
            languageStudyStats3 = routeGoalMetUseCase$invoke$1.f28182c;
            dailyGoalMet2 = routeGoalMetUseCase$invoke$1.f28181b;
            go3Var5 = routeGoalMetUseCase$invoke$1.f28180a;
            AbstractC3193b.m15359b(objM15541t3);
        }
        fj9 fj9VarM3326d = b5d.m3326d(languageStudyStats3, str3, (String) objM15541t3);
        if (dailyGoalMet2.f19518e) {
            inAppNotificationType = InAppNotificationType.DailyGoalDouble;
        } else {
            inAppNotificationType = InAppNotificationType.DailyGoal;
        }
        return new io3(new h24(inAppNotificationType, null, new ty1(dailyGoalMet2, fj9VarM3326d.f39204a, fj9VarM3326d.f39205b), 14), go3Var5);
        zBooleanValue = ((Boolean) objM15541t3).booleanValue();
        String strMo4589b2 = this.f28200f.mo4589b2();
        if (!zBooleanValue) {
            Object obj = go3Var2.f41067b;
            if (obj instanceof DailyGoalMet) {
                str = ((DailyGoalMet) obj).f19519f;
            } else {
                str = obj instanceof Milestone ? ((Milestone) obj).f19533b : "";
            }
            if (str.length() > 0) {
                routeGoalMetUseCase$invoke$1.f28180a = null;
                routeGoalMetUseCase$invoke$1.f28181b = null;
                routeGoalMetUseCase$invoke$1.f28184e = zBooleanValue;
                routeGoalMetUseCase$invoke$1.f28187h = 5;
                if (((C1298n) this.f28199e).m7330a(strMo4589b2, str, "", routeGoalMetUseCase$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return ho3Var;
        }
        if (this.f28196b.f58118b.getInt("lessonsOpened", 0) > 1) {
            GoalMetType goalMetType = go3Var2.f41066a;
            Object obj2 = go3Var2.f41067b;
            int i3 = jj8.f45630a[goalMetType.ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    InAppNotificationType inAppNotificationType2 = InAppNotificationType.Milestone;
                    obj2.getClass();
                    return new io3(new h24(inAppNotificationType2, null, (Milestone) obj2, 14), go3Var2);
                }
                if (i3 == 4) {
                    return jo3.f45909a;
                }
                gm5.m12750e();
                return null;
            }
            obj2.getClass();
            dailyGoalMet = (DailyGoalMet) obj2;
            routeGoalMetUseCase$invoke$1.f28180a = go3Var2;
            routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
            routeGoalMetUseCase$invoke$1.f28184e = zBooleanValue;
            routeGoalMetUseCase$invoke$1.f28187h = 2;
            C1319g c1319g = ((C1294j) this.f28197c).f16493a;
            objM2861d = AbstractC0758a.m2861d(new ke2(13, strMo4589b2, c1319g), c1319g.f17026K, routeGoalMetUseCase$invoke$1, true, false);
            if (objM2861d != coroutineSingletons) {
                go3Var3 = go3Var2;
                languageStudyStats = (LanguageStudyStats) objM2861d;
                if (languageStudyStats != null) {
                    qm7 qm7Var2 = ((C1369b) this.f28198d).f18481n;
                    routeGoalMetUseCase$invoke$1.f28180a = go3Var3;
                    routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
                    routeGoalMetUseCase$invoke$1.f28182c = languageStudyStats;
                    routeGoalMetUseCase$invoke$1.f28184e = zBooleanValue;
                    routeGoalMetUseCase$invoke$1.f28187h = 3;
                    objM15541t = AbstractC3224d.m15541t(qm7Var2, routeGoalMetUseCase$invoke$1);
                    if (objM15541t != coroutineSingletons) {
                        boolean z4 = zBooleanValue;
                        objM15541t3 = objM15541t;
                        z = z4;
                        languageStudyStats2 = languageStudyStats;
                        go3Var4 = go3Var3;
                        str2 = ((ProfileAccount) objM15541t3).f19690n;
                        vi7 vi7Var4 = ((C1368a) si7Var).f18356L0;
                        routeGoalMetUseCase$invoke$1.f28180a = go3Var4;
                        routeGoalMetUseCase$invoke$1.f28181b = dailyGoalMet;
                        routeGoalMetUseCase$invoke$1.f28182c = languageStudyStats2;
                        routeGoalMetUseCase$invoke$1.f28183d = str2;
                        routeGoalMetUseCase$invoke$1.f28184e = z;
                        routeGoalMetUseCase$invoke$1.f28187h = 4;
                        objM15541t2 = AbstractC3224d.m15541t(vi7Var4, routeGoalMetUseCase$invoke$1);
                        if (objM15541t2 != coroutineSingletons) {
                            objM15541t3 = objM15541t2;
                            str3 = str2;
                            languageStudyStats3 = languageStudyStats2;
                            dailyGoalMet2 = dailyGoalMet;
                            go3Var5 = go3Var4;
                            fj9 fj9VarM3326d2 = b5d.m3326d(languageStudyStats3, str3, (String) objM15541t3);
                            if (dailyGoalMet2.f19518e) {
                                inAppNotificationType = InAppNotificationType.DailyGoalDouble;
                            } else {
                                inAppNotificationType = InAppNotificationType.DailyGoal;
                            }
                            return new io3(new h24(inAppNotificationType, null, new ty1(dailyGoalMet2, fj9VarM3326d2.f39204a, fj9VarM3326d2.f39205b), 14), go3Var5);
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return ho3Var;
    }
}
