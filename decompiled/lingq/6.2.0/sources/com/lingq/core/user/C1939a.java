package com.lingq.core.user;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.profile.C1267a;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.TimeZone;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.C3509qs;
import p000.C3540rl;
import p000.aq6;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.do7;
import p000.du0;
import p000.eb5;
import p000.eh9;
import p000.hm5;
import p000.i59;
import p000.iy5;
import p000.km7;
import p000.lm4;
import p000.nm7;
import p000.nn1;
import p000.ql4;
import p000.qm7;
import p000.si7;
import p000.un1;
import p000.vk9;
import p000.wfb;
import p000.wi7;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.user.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1939a implements cma {

    /* JADX INFO: renamed from: A */
    public final c18 f24284A;

    /* JADX INFO: renamed from: B */
    public final C3211a f24285B;

    /* JADX INFO: renamed from: C */
    public final du0 f24286C;

    /* JADX INFO: renamed from: D */
    public final C3211a f24287D;

    /* JADX INFO: renamed from: E */
    public final du0 f24288E;

    /* JADX INFO: renamed from: a */
    public final km7 f24289a;

    /* JADX INFO: renamed from: b */
    public final lm4 f24290b;

    /* JADX INFO: renamed from: c */
    public final aq6 f24291c;

    /* JADX INFO: renamed from: d */
    public final nm7 f24292d;

    /* JADX INFO: renamed from: e */
    public final C3509qs f24293e;

    /* JADX INFO: renamed from: f */
    public final hm5 f24294f;

    /* JADX INFO: renamed from: g */
    public final si7 f24295g;

    /* JADX INFO: renamed from: h */
    public final C1307w f24296h;

    /* JADX INFO: renamed from: i */
    public final un1 f24297i;

    /* JADX INFO: renamed from: j */
    public final qm7 f24298j;

    /* JADX INFO: renamed from: k */
    public final qm7 f24299k;

    /* JADX INFO: renamed from: l */
    public final qm7 f24300l;

    /* JADX INFO: renamed from: m */
    public final c18 f24301m;

    /* JADX INFO: renamed from: n */
    public final c18 f24302n;

    /* JADX INFO: renamed from: o */
    public final c18 f24303o;

    /* JADX INFO: renamed from: p */
    public final c18 f24304p;

    /* JADX INFO: renamed from: q */
    public final c18 f24305q;

    /* JADX INFO: renamed from: r */
    public final c18 f24306r;

    /* JADX INFO: renamed from: s */
    public final c18 f24307s;

    /* JADX INFO: renamed from: t */
    public final c18 f24308t;

    /* JADX INFO: renamed from: u */
    public final c18 f24309u;

    /* JADX INFO: renamed from: v */
    public final c18 f24310v;

    /* JADX INFO: renamed from: w */
    public final c18 f24311w;

    /* JADX INFO: renamed from: x */
    public final c18 f24312x;

    /* JADX INFO: renamed from: y */
    public final c18 f24313y;

    /* JADX INFO: renamed from: z */
    public final c18 f24314z;

    public C1939a(km7 km7Var, lm4 lm4Var, aq6 aq6Var, nm7 nm7Var, C3509qs c3509qs, hm5 hm5Var, si7 si7Var, C1307w c1307w, un1 un1Var, nn1 nn1Var) {
        km7Var.getClass();
        lm4Var.getClass();
        aq6Var.getClass();
        nm7Var.getClass();
        c3509qs.getClass();
        hm5Var.getClass();
        si7Var.getClass();
        c1307w.getClass();
        un1Var.getClass();
        this.f24289a = km7Var;
        this.f24290b = lm4Var;
        this.f24291c = aq6Var;
        this.f24292d = nm7Var;
        this.f24293e = c3509qs;
        this.f24294f = hm5Var;
        this.f24295g = si7Var;
        this.f24296h = c1307w;
        this.f24297i = un1Var;
        C1369b c1369b = (C1369b) nm7Var;
        qm7 qm7Var = c1369b.f18480m;
        this.f24298j = qm7Var;
        qm7 qm7Var2 = c1369b.f18481n;
        this.f24299k = qm7Var2;
        qm7 qm7Var3 = c1369b.f18483p;
        this.f24300l = qm7Var3;
        C3540rl c3540rl = new C3540rl(AbstractC3224d.m15536o(qm7Var), 10);
        iy5 iy5Var = i59.f43549a;
        this.f24301m = AbstractC3224d.m15520B(c3540rl, un1Var, iy5Var, "");
        this.f24302n = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$_activeLocale$1(3, null)), un1Var, iy5Var, "");
        C3235e c3235eM15521C = AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_isUserPremium$1(3, null));
        Boolean bool = Boolean.FALSE;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, un1Var, iy5Var, bool);
        this.f24303o = c18VarM15520B;
        c18 c18VarM15520B2 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_isUserPlus$1(3, null)), un1Var, iy5Var, bool);
        this.f24304p = c18VarM15520B2;
        c18 c18VarM15520B3 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var3, new UserSessionViewModelDelegateImpl$_isStaff$1(3, null)), un1Var, iy5Var, bool);
        this.f24305q = c18VarM15520B3;
        AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_isUserComplimentary$1(3, null)), un1Var, iy5Var, bool);
        this.f24306r = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$_isUserOverTranscriptionLimit$1(3, null)), un1Var, iy5Var, bool);
        this.f24307s = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$_roleIsChiefOrLibrarian$1(3, null)), un1Var, iy5Var, bool);
        AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var3, new UserSessionViewModelDelegateImpl$_isGrandfatheredSubscriber$1(3, null)), un1Var, iy5Var, bool);
        this.f24308t = AbstractC3224d.m15520B(AbstractC3224d.m15533l(c18VarM15520B, c18VarM15520B2, c18VarM15520B3, qm7Var3, new UserSessionViewModelDelegateImpl$_canSimplifyLesson$1(null)), un1Var, iy5Var, bool);
        C3235e c3235eM15521C2 = AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_isUserWithinLimit$1(3, null));
        Boolean bool2 = Boolean.TRUE;
        c18 c18VarM15520B4 = AbstractC3224d.m15520B(c3235eM15521C2, un1Var, iy5Var, bool2);
        this.f24309u = c18VarM15520B4;
        this.f24310v = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_hasNoCardsLimit$1(3, null)), un1Var, iy5Var, bool);
        AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var2, new UserSessionViewModelDelegateImpl$_isCardsLimitInOfferRange$1(3, null)), un1Var, iy5Var, bool);
        this.f24311w = AbstractC3224d.m15520B(AbstractC3224d.m15546y(c18VarM15520B4, new UserSessionViewModelDelegateImpl$_canCreateLingQs$1(2, null)), un1Var, iy5Var, bool2);
        this.f24312x = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var3, new UserSessionViewModelDelegateImpl$_hasLynxCredits$1(3, null)), un1Var, iy5Var, bool2);
        C3235e c3235eM15521C3 = AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$languages$1(this, null));
        C3243k c3243k = xi9.f68262a;
        EmptyList emptyList = EmptyList.f47638a;
        this.f24313y = AbstractC3224d.m15520B(c3235eM15521C3, un1Var, c3243k, emptyList);
        c18 c18VarM15520B5 = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$userActiveLanguage$1(this, null)), un1Var, c3243k, null);
        this.f24314z = c18VarM15520B5;
        this.f24284A = AbstractC3224d.m15520B(AbstractC3224d.m15521C(qm7Var, new UserSessionViewModelDelegateImpl$userDictionaryLocales$1(3, null)), un1Var, c3243k, emptyList);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f24285B = c3211aM10525a;
        this.f24286C = AbstractC3224d.m15519A(c3211aM10525a);
        AbstractC3224d.m15520B(new eb5(new C3540rl(c18VarM15520B5, 5), 1), un1Var, c3243k, 0);
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f24287D = c3211aM10525a2;
        this.f24288E = AbstractC3224d.m15519A(c3211aM10525a2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public static final Object m8804a(C1939a c1939a, ContinuationImpl continuationImpl) throws Throwable {
        UserSessionViewModelDelegateImpl$migrateSettings$1 userSessionViewModelDelegateImpl$migrateSettings$1;
        si7 si7Var = c1939a.f24295g;
        if (continuationImpl instanceof UserSessionViewModelDelegateImpl$migrateSettings$1) {
            userSessionViewModelDelegateImpl$migrateSettings$1 = (UserSessionViewModelDelegateImpl$migrateSettings$1) continuationImpl;
            int i = userSessionViewModelDelegateImpl$migrateSettings$1.f24247c;
            if ((i & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$migrateSettings$1.f24247c = i - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$migrateSettings$1 = new UserSessionViewModelDelegateImpl$migrateSettings$1(c1939a, continuationImpl);
            }
        } else {
            userSessionViewModelDelegateImpl$migrateSettings$1 = new UserSessionViewModelDelegateImpl$migrateSettings$1(c1939a, continuationImpl);
        }
        Object objM15542u = userSessionViewModelDelegateImpl$migrateSettings$1.f24245a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userSessionViewModelDelegateImpl$migrateSettings$1.f24247c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15542u);
            wi7 wi7Var = ((C1368a) si7Var).f18440q1;
            userSessionViewModelDelegateImpl$migrateSettings$1.f24247c = 1;
            objM15542u = AbstractC3224d.m15542u(wi7Var, userSessionViewModelDelegateImpl$migrateSettings$1);
            if (objM15542u != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15542u);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM15542u);
        String str = (String) objM15542u;
        if (str != null && str.length() > 0 && str.equals("Furigana")) {
            userSessionViewModelDelegateImpl$migrateSettings$1.f24247c = 2;
            if (((C1368a) si7Var).m7888k0("Hiragana", userSessionViewModelDelegateImpl$migrateSettings$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24286C;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24314z;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24313y;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24298j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (((com.lingq.core.data.repository.C1293i) r5).m7218o(r0) == r1) goto L21;
     */
    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4575D0(Continuation continuation) throws Throwable {
        UserSessionViewModelDelegateImpl$updateLanguages$1 userSessionViewModelDelegateImpl$updateLanguages$1;
        if (continuation instanceof UserSessionViewModelDelegateImpl$updateLanguages$1) {
            userSessionViewModelDelegateImpl$updateLanguages$1 = (UserSessionViewModelDelegateImpl$updateLanguages$1) continuation;
            int i = userSessionViewModelDelegateImpl$updateLanguages$1.f24262c;
            if ((i & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$updateLanguages$1.f24262c = i - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$updateLanguages$1 = new UserSessionViewModelDelegateImpl$updateLanguages$1(this, continuation);
            }
        } else {
            userSessionViewModelDelegateImpl$updateLanguages$1 = new UserSessionViewModelDelegateImpl$updateLanguages$1(this, continuation);
        }
        Object obj = userSessionViewModelDelegateImpl$updateLanguages$1.f24260a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userSessionViewModelDelegateImpl$updateLanguages$1.f24262c;
        lm4 lm4Var = this.f24290b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            userSessionViewModelDelegateImpl$updateLanguages$1.f24262c = 1;
            if (((C1293i) lm4Var).m7225v(userSessionViewModelDelegateImpl$updateLanguages$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        userSessionViewModelDelegateImpl$updateLanguages$1.f24262c = 2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) throws Throwable {
        UserSessionViewModelDelegateImpl$updateActiveLanguage$1 userSessionViewModelDelegateImpl$updateActiveLanguage$1;
        boolean zBooleanValue;
        boolean z;
        if (continuation instanceof UserSessionViewModelDelegateImpl$updateActiveLanguage$1) {
            userSessionViewModelDelegateImpl$updateActiveLanguage$1 = (UserSessionViewModelDelegateImpl$updateActiveLanguage$1) continuation;
            int i = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f;
            if ((i & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f = i - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$updateActiveLanguage$1 = new UserSessionViewModelDelegateImpl$updateActiveLanguage$1(this, continuation);
            }
        } else {
            userSessionViewModelDelegateImpl$updateActiveLanguage$1 = new UserSessionViewModelDelegateImpl$updateActiveLanguage$1(this, continuation);
        }
        Object objM2861d = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24257d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f;
        int i3 = 0;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24254a = str;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f = 1;
            objM2861d = AbstractC0758a.m2861d(new ql4(str, i3), ((C1293i) this.f24290b).f16489b.f64042K, userSessionViewModelDelegateImpl$updateActiveLanguage$1, true, false);
            if (objM2861d != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24254a;
            AbstractC3193b.m15359b(objM2861d);
        } else {
            if (i2 == 2) {
                i3 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24255b;
                AbstractC3193b.m15359b(objM2861d);
                zBooleanValue = ((Boolean) objM2861d).booleanValue();
                if (zBooleanValue) {
                    this.f24294f.getClass();
                }
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24254a = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24255b = i3;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24256c = zBooleanValue;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f = 3;
                if (mo4575D0(userSessionViewModelDelegateImpl$updateActiveLanguage$1) != obj) {
                    z = zBooleanValue;
                }
                return obj;
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24256c;
            AbstractC3193b.m15359b(objM2861d);
        }
        return Boolean.valueOf(z);
        if (((LanguageToLearn) objM2861d) == null) {
            return Boolean.FALSE;
        }
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24254a = str;
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24255b = 0;
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f = 2;
        objM2861d = ((C1267a) this.f24289a).m7092v(str, userSessionViewModelDelegateImpl$updateActiveLanguage$1);
        if (objM2861d != obj) {
            zBooleanValue = ((Boolean) objM2861d).booleanValue();
            if (zBooleanValue) {
                this.f24294f.getClass();
            }
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24254a = null;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24255b = i3;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24256c = zBooleanValue;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f24259f = 3;
            if (mo4575D0(userSessionViewModelDelegateImpl$updateActiveLanguage$1) != obj) {
                z = zBooleanValue;
                return Boolean.valueOf(z);
            }
        }
        return obj;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24312x;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) throws Throwable {
        Object objM7405t = this.f24296h.m7405t(continuation);
        return objM7405t == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7405t : xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) throws Throwable {
        UserSessionViewModelDelegateImpl$checkTimezone$1 userSessionViewModelDelegateImpl$checkTimezone$1;
        String id;
        Object objM15541t;
        String str;
        String str2;
        Object objM15541t2;
        String str3;
        String str4;
        if (continuation instanceof UserSessionViewModelDelegateImpl$checkTimezone$1) {
            userSessionViewModelDelegateImpl$checkTimezone$1 = (UserSessionViewModelDelegateImpl$checkTimezone$1) continuation;
            int i = userSessionViewModelDelegateImpl$checkTimezone$1.f24241e;
            if ((i & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = i - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$checkTimezone$1 = new UserSessionViewModelDelegateImpl$checkTimezone$1(this, continuation);
            }
        } else {
            userSessionViewModelDelegateImpl$checkTimezone$1 = new UserSessionViewModelDelegateImpl$checkTimezone$1(this, continuation);
        }
        Object objM15541t3 = userSessionViewModelDelegateImpl$checkTimezone$1.f24239c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userSessionViewModelDelegateImpl$checkTimezone$1.f24241e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t3);
            wi7 wi7Var = ((C1368a) this.f24295g).f18455v1;
            userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 1;
            objM15541t3 = AbstractC3224d.m15541t(wi7Var, userSessionViewModelDelegateImpl$checkTimezone$1);
            if (objM15541t3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM15541t3);
        } else {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM15541t3);
                id = TimeZone.getDefault().getID();
                userSessionViewModelDelegateImpl$checkTimezone$1.f24237a = id;
                userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 3;
                objM15541t = AbstractC3224d.m15541t(this.f24298j, userSessionViewModelDelegateImpl$checkTimezone$1);
                if (objM15541t != coroutineSingletons) {
                    str = id;
                    objM15541t3 = objM15541t;
                    str2 = ((Profile) objM15541t3).f19662k;
                    qm7 qm7Var = ((C1369b) this.f24292d).f18487t;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24237a = str;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24238b = str2;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 4;
                    objM15541t2 = AbstractC3224d.m15541t(qm7Var, userSessionViewModelDelegateImpl$checkTimezone$1);
                    if (objM15541t2 != coroutineSingletons) {
                        str3 = str2;
                        objM15541t3 = objM15541t2;
                        str4 = str;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                str = userSessionViewModelDelegateImpl$checkTimezone$1.f24237a;
                AbstractC3193b.m15359b(objM15541t3);
                str2 = ((Profile) objM15541t3).f19662k;
                qm7 qm7Var2 = ((C1369b) this.f24292d).f18487t;
                userSessionViewModelDelegateImpl$checkTimezone$1.f24237a = str;
                userSessionViewModelDelegateImpl$checkTimezone$1.f24238b = str2;
                userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 4;
                objM15541t2 = AbstractC3224d.m15541t(qm7Var2, userSessionViewModelDelegateImpl$checkTimezone$1);
                if (objM15541t2 != coroutineSingletons) {
                    str3 = str2;
                    objM15541t3 = objM15541t2;
                    str4 = str;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str3 = userSessionViewModelDelegateImpl$checkTimezone$1.f24238b;
            str4 = userSessionViewModelDelegateImpl$checkTimezone$1.f24237a;
            AbstractC3193b.m15359b(objM15541t3);
        }
        String str5 = (String) objM15541t3;
        if ((vk9.m23391n0(str3) || !str3.equalsIgnoreCase(str4)) && (vk9.m23391n0(str5) || !str5.equalsIgnoreCase(str4))) {
            str4.getClass();
            this.f24285B.mo4677k(str4);
        }
        return xfaVar;
        if (((Boolean) objM15541t3).booleanValue() && this.f24293e.f58118b.getInt("lessonsOpened", 0) > 2) {
            userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 2;
            if (((C1267a) this.f24289a).m7074c(userSessionViewModelDelegateImpl$checkTimezone$1) != coroutineSingletons) {
                id = TimeZone.getDefault().getID();
                userSessionViewModelDelegateImpl$checkTimezone$1.f24237a = id;
                userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 3;
                objM15541t = AbstractC3224d.m15541t(this.f24298j, userSessionViewModelDelegateImpl$checkTimezone$1);
                if (objM15541t != coroutineSingletons) {
                    str = id;
                    objM15541t3 = objM15541t;
                    str2 = ((Profile) objM15541t3).f19662k;
                    qm7 qm7Var3 = ((C1369b) this.f24292d).f18487t;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24237a = str;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24238b = str2;
                    userSessionViewModelDelegateImpl$checkTimezone$1.f24241e = 4;
                    objM15541t2 = AbstractC3224d.m15541t(qm7Var3, userSessionViewModelDelegateImpl$checkTimezone$1);
                    if (objM15541t2 != coroutineSingletons) {
                        str3 = str2;
                        objM15541t3 = objM15541t2;
                        str4 = str;
                        String str6 = (String) objM15541t3;
                        if (vk9.m23391n0(str3)) {
                            str4.getClass();
                            this.f24285B.mo4677k(str4);
                        } else {
                            str4.getClass();
                            this.f24285B.mo4677k(str4);
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return (String) ((C3244l) this.f24302n.f9311a).getValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return ((Boolean) ((C3244l) this.f24308t.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24288E;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24299k;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        Language language = (Language) this.f24314z.getValue();
        if (language != null) {
            return language.f19025b;
        }
        return 0;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24284A;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return ((Boolean) ((C3244l) this.f24306r.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24287D.mo4677k(xfa.f68157a);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return ((Boolean) ((C3244l) this.f24304p.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return (String) ((C3244l) this.f24301m.f9311a).getValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return ((Boolean) ((C3244l) this.f24307s.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        Object objM7921h = ((C1369b) this.f24292d).m7921h(profileAccount, continuation);
        return objM7921h == CoroutineSingletons.COROUTINE_SUSPENDED ? objM7921h : xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return ((Boolean) ((C3244l) this.f24305q.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return ((Boolean) ((C3244l) this.f24303o.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24311w;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return ((Boolean) ((C3244l) this.f24309u.f9311a).getValue()).booleanValue();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24300l;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        UserSessionViewModelDelegateImpl$updateUserProfile$2 userSessionViewModelDelegateImpl$updateUserProfile$2 = new UserSessionViewModelDelegateImpl$updateUserProfile$2(this, null);
        un1 un1Var = this.f24297i;
        wfb.m23926u(un1Var, null, null, userSessionViewModelDelegateImpl$updateUserProfile$2, 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$3(this, null), 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$4(this, null), 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$5(this, null), 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$6(this, null), 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$7(this, null), 3);
        wfb.m23926u(un1Var, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$8(this, null), 3);
        return xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return ((Boolean) ((C3244l) this.f24303o.f9311a).getValue()).booleanValue() || ((Boolean) ((C3244l) this.f24310v.f9311a).getValue()).booleanValue();
    }
}
