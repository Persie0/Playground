package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.ae1;
import p000.bl2;
import p000.dt1;
import p000.qn3;
import p000.s70;
import p000.st1;
import p000.t70;
import p000.tt1;
import p000.u70;
import p000.ut1;
import p000.v70;
import p000.vt1;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1317e {
    public static final vt1 Companion = new vt1();

    /* JADX INFO: renamed from: a */
    public final AbstractC0746d f17014a;

    /* JADX INFO: renamed from: b */
    public final bl2 f17015b;

    /* JADX INFO: renamed from: c */
    public final qn3 f17016c = new qn3(20);

    /* JADX INFO: renamed from: d */
    public final bl2 f17017d;

    /* JADX INFO: renamed from: e */
    public final bl2 f17018e;

    /* JADX INFO: renamed from: f */
    public final bl2 f17019f;

    /* JADX INFO: renamed from: g */
    public final bl2 f17020g;

    public C1317e(AbstractC0746d abstractC0746d) {
        this.f17014a = abstractC0746d;
        int i = 0;
        this.f17015b = new bl2(new tt1(this, i), new ut1(this, i));
        int i2 = 1;
        this.f17017d = new bl2(new tt1(this, i2), new ut1(this, i2));
        int i3 = 7;
        this.f17018e = new bl2(new u70(5), new v70(i3));
        int i4 = 6;
        this.f17019f = new bl2(new u70(i4), new v70(8));
        this.f17020g = new bl2(new u70(i3), new v70(i4));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d3 A[DONT_INVERT, PHI: r11 r13
      0x00d3: PHI (r11v4 dt1) = (r11v3 dt1), (r11v8 dt1) binds: [B:35:0x00b3, B:43:0x00d2] A[DONT_GENERATE, DONT_INLINE]
      0x00d3: PHI (r13v4 com.lingq.core.database.dao.e) = (r13v3 com.lingq.core.database.dao.e), (r13v5 com.lingq.core.database.dao.e) binds: [B:35:0x00b3, B:43:0x00d2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX INFO: renamed from: b */
    public static Object m7467b(C1317e c1317e, String str, ArrayList arrayList, dt1 dt1Var, ContinuationImpl continuationImpl) throws Throwable {
        CupDao$replaceContributors$1 cupDao$replaceContributors$1;
        ?? r12;
        C1317e c1317e2;
        dt1 dt1Var2;
        Object objM2861d;
        C1317e c1317e3;
        Object objM2861d2;
        if (continuationImpl instanceof CupDao$replaceContributors$1) {
            cupDao$replaceContributors$1 = (CupDao$replaceContributors$1) continuationImpl;
            int i = cupDao$replaceContributors$1.f16887g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupDao$replaceContributors$1.f16887g = i - Integer.MIN_VALUE;
            } else {
                cupDao$replaceContributors$1 = new CupDao$replaceContributors$1(c1317e, continuationImpl);
            }
        } else {
            cupDao$replaceContributors$1 = new CupDao$replaceContributors$1(c1317e, continuationImpl);
        }
        Object obj = cupDao$replaceContributors$1.f16885e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupDao$replaceContributors$1.f16887g;
        int i3 = 2;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            cupDao$replaceContributors$1.f16881a = c1317e;
            cupDao$replaceContributors$1.f16882b = str;
            cupDao$replaceContributors$1.f16883c = arrayList;
            cupDao$replaceContributors$1.f16884d = dt1Var;
            cupDao$replaceContributors$1.f16887g = 1;
            Object objM2861d3 = AbstractC0758a.m2861d(new t70(str, 18), c1317e.f17014a, cupDao$replaceContributors$1, false, true);
            if (objM2861d3 != coroutineSingletons) {
                objM2861d3 = xfaVar;
            }
            if (objM2861d3 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            dt1Var = cupDao$replaceContributors$1.f16884d;
            arrayList = cupDao$replaceContributors$1.f16883c;
            str = cupDao$replaceContributors$1.f16882b;
            c1317e = cupDao$replaceContributors$1.f16881a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 == 2) {
                dt1Var2 = cupDao$replaceContributors$1.f16884d;
                List list = cupDao$replaceContributors$1.f16883c;
                c1317e2 = cupDao$replaceContributors$1.f16881a;
                AbstractC3193b.m15359b(obj);
                r12 = list;
                if (!((Collection) r12).isEmpty()) {
                    if (dt1Var2 != null) {
                        cupDao$replaceContributors$1.f16881a = null;
                        cupDao$replaceContributors$1.f16882b = null;
                        cupDao$replaceContributors$1.f16883c = null;
                        cupDao$replaceContributors$1.f16884d = null;
                        cupDao$replaceContributors$1.f16887g = 4;
                        objM2861d2 = AbstractC0758a.m2861d(new s70(27, c1317e2, dt1Var2), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 == coroutineSingletons) {
                        }
                    }
                    return xfaVar;
                }
                cupDao$replaceContributors$1.f16881a = c1317e2;
                cupDao$replaceContributors$1.f16882b = null;
                cupDao$replaceContributors$1.f16883c = null;
                cupDao$replaceContributors$1.f16884d = dt1Var2;
                cupDao$replaceContributors$1.f16887g = 3;
                objM2861d = AbstractC0758a.m2861d(new st1(c1317e2, r12, i3), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
                if (objM2861d != coroutineSingletons) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    c1317e3 = c1317e2;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list2 = cupDao$replaceContributors$1.f16883c;
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            dt1Var2 = cupDao$replaceContributors$1.f16884d;
            List list3 = cupDao$replaceContributors$1.f16883c;
            c1317e3 = cupDao$replaceContributors$1.f16881a;
            AbstractC3193b.m15359b(obj);
        }
        c1317e2 = c1317e3;
        if (dt1Var2 != null) {
            cupDao$replaceContributors$1.f16881a = null;
            cupDao$replaceContributors$1.f16882b = null;
            cupDao$replaceContributors$1.f16883c = null;
            cupDao$replaceContributors$1.f16884d = null;
            cupDao$replaceContributors$1.f16887g = 4;
            objM2861d2 = AbstractC0758a.m2861d(new s70(27, c1317e2, dt1Var2), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
            if (objM2861d2 != coroutineSingletons) {
                objM2861d2 = xfaVar;
            }
            if (objM2861d2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        cupDao$replaceContributors$1.f16881a = c1317e;
        cupDao$replaceContributors$1.f16882b = null;
        cupDao$replaceContributors$1.f16883c = (List) arrayList;
        cupDao$replaceContributors$1.f16884d = dt1Var;
        cupDao$replaceContributors$1.f16887g = 2;
        Object objM2861d4 = AbstractC0758a.m2861d(new t70(str, 16), c1317e.f17014a, cupDao$replaceContributors$1, false, true);
        if (objM2861d4 != coroutineSingletons) {
            objM2861d4 = xfaVar;
        }
        if (objM2861d4 != coroutineSingletons) {
            r12 = arrayList;
            c1317e2 = c1317e;
            dt1Var2 = dt1Var;
            if (!((Collection) r12).isEmpty()) {
                if (dt1Var2 != null) {
                    cupDao$replaceContributors$1.f16881a = null;
                    cupDao$replaceContributors$1.f16882b = null;
                    cupDao$replaceContributors$1.f16883c = null;
                    cupDao$replaceContributors$1.f16884d = null;
                    cupDao$replaceContributors$1.f16887g = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new s70(27, c1317e2, dt1Var2), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
            cupDao$replaceContributors$1.f16881a = c1317e2;
            cupDao$replaceContributors$1.f16882b = null;
            cupDao$replaceContributors$1.f16883c = null;
            cupDao$replaceContributors$1.f16884d = dt1Var2;
            cupDao$replaceContributors$1.f16887g = 3;
            objM2861d = AbstractC0758a.m2861d(new st1(c1317e2, r12, i3), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
                c1317e3 = c1317e2;
                c1317e2 = c1317e3;
                if (dt1Var2 != null) {
                    cupDao$replaceContributors$1.f16881a = null;
                    cupDao$replaceContributors$1.f16882b = null;
                    cupDao$replaceContributors$1.f16883c = null;
                    cupDao$replaceContributors$1.f16884d = null;
                    cupDao$replaceContributors$1.f16887g = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new s70(27, c1317e2, dt1Var2), c1317e2.f17014a, cupDao$replaceContributors$1, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public static Object m7468d(C1317e c1317e, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        CupDao$replacePrizes$1 cupDao$replacePrizes$1;
        if (continuationImpl instanceof CupDao$replacePrizes$1) {
            cupDao$replacePrizes$1 = (CupDao$replacePrizes$1) continuationImpl;
            int i = cupDao$replacePrizes$1.f16892e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupDao$replacePrizes$1.f16892e = i - Integer.MIN_VALUE;
            } else {
                cupDao$replacePrizes$1 = new CupDao$replacePrizes$1(c1317e, continuationImpl);
            }
        } else {
            cupDao$replacePrizes$1 = new CupDao$replacePrizes$1(c1317e, continuationImpl);
        }
        Object obj = cupDao$replacePrizes$1.f16890c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupDao$replacePrizes$1.f16892e;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            cupDao$replacePrizes$1.f16888a = c1317e;
            cupDao$replacePrizes$1.f16889b = arrayList;
            cupDao$replacePrizes$1.f16892e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ae1(13), c1317e.f17014a, cupDao$replacePrizes$1, false, true);
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
        arrayList = cupDao$replacePrizes$1.f16889b;
        c1317e = cupDao$replacePrizes$1.f16888a;
        AbstractC3193b.m15359b(obj);
        cupDao$replacePrizes$1.f16888a = null;
        cupDao$replacePrizes$1.f16889b = null;
        cupDao$replacePrizes$1.f16892e = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new st1(c1317e, arrayList, i3), c1317e.f17014a, cupDao$replacePrizes$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static Object m7469f(C1317e c1317e, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        CupDao$replaceTeams$1 cupDao$replaceTeams$1;
        if (continuationImpl instanceof CupDao$replaceTeams$1) {
            cupDao$replaceTeams$1 = (CupDao$replaceTeams$1) continuationImpl;
            int i = cupDao$replaceTeams$1.f16897e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupDao$replaceTeams$1.f16897e = i - Integer.MIN_VALUE;
            } else {
                cupDao$replaceTeams$1 = new CupDao$replaceTeams$1(c1317e, continuationImpl);
            }
        } else {
            cupDao$replaceTeams$1 = new CupDao$replaceTeams$1(c1317e, continuationImpl);
        }
        Object obj = cupDao$replaceTeams$1.f16895c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupDao$replaceTeams$1.f16897e;
        int i3 = 0;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            cupDao$replaceTeams$1.f16893a = c1317e;
            cupDao$replaceTeams$1.f16894b = arrayList;
            cupDao$replaceTeams$1.f16897e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ae1(15), c1317e.f17014a, cupDao$replaceTeams$1, false, true);
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
        arrayList = cupDao$replaceTeams$1.f16894b;
        c1317e = cupDao$replaceTeams$1.f16893a;
        AbstractC3193b.m15359b(obj);
        cupDao$replaceTeams$1.f16893a = null;
        cupDao$replaceTeams$1.f16894b = null;
        cupDao$replaceTeams$1.f16897e = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new st1(c1317e, arrayList, i3), c1317e.f17014a, cupDao$replaceTeams$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        return objM2861d2 == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX INFO: renamed from: a */
    public final Object m7470a(String str, ArrayList arrayList, dt1 dt1Var, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new CupDao_Impl$replaceContributors$2(this, str, arrayList, dt1Var, null), this.f17014a, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7471c(ArrayList arrayList, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new CupDao_Impl$replacePrizes$2(this, arrayList, null), this.f17014a, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m7472e(ArrayList arrayList, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new CupDao_Impl$replaceTeams$2(this, arrayList, null), this.f17014a, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
