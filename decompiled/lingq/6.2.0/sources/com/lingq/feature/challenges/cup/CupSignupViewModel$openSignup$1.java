package com.lingq.feature.challenges.cup;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupTeamEntry;
import com.lingq.core.domain.model.language.Language;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.C3540rl;
import p000.c32;
import p000.cma;
import p000.eh9;
import p000.ew1;
import p000.fa4;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vv1;
import p000.wv1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.cup.CupSignupViewModel$openSignup$1", m4291f = "CupSignupViewModel.kt", m4292l = {92, 93}, m4293m = "invokeSuspend", m4294v = 2)
final class CupSignupViewModel$openSignup$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ew1 f24623a;

    /* JADX INFO: renamed from: b */
    public int f24624b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1978e f24625c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupSignupViewModel$openSignup$1(C1978e c1978e, Continuation continuation) {
        super(2, continuation);
        this.f24625c = c1978e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupSignupViewModel$openSignup$1(this.f24625c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupSignupViewModel$openSignup$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r0 == r3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15541t;
        ew1 ew1Var;
        Object objM15540s;
        String strMo4589b2;
        Object next;
        Object failure;
        Object next2;
        C1978e c1978e = this.f24625c;
        cma cmaVar = c1978e.f24691b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24624b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3540rl c3540rl = new C3540rl(c1978e.f24695f, 5);
            this.f24624b = 1;
            objM15541t = AbstractC3224d.m15541t(c3540rl, this);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            objM15541t = obj;
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ew1 ew1Var2 = this.f24623a;
            AbstractC3193b.m15359b(obj);
            ew1Var = ew1Var2;
            objM15540s = obj;
        }
        List<Language> list = (List) objM15540s;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        for (Language language : list) {
            String str = language.f19024a;
            Iterator it = ew1Var.f37984j.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!fa4.m11650l(((CupTeamEntry) next2).f18996a, language.f19024a));
            CupTeamEntry cupTeamEntry = (CupTeamEntry) next2;
            arrayList.add(new wv1(str, cupTeamEntry != null ? cupTeamEntry.f18997b : 0));
        }
        CupTeam cupTeam = ew1Var.f37981g;
        if (cupTeam == null || (strMo4589b2 = cupTeam.f18994b) == null) {
            strMo4589b2 = cmaVar.mo4589b2();
            if (arrayList.isEmpty()) {
                strMo4589b2 = null;
                break;
            }
            Iterator it2 = arrayList.iterator();
            do {
                if (!it2.hasNext()) {
                    strMo4589b2 = null;
                    break;
                }
            } while (!fa4.m11650l(((wv1) it2.next()).f67329a, strMo4589b2));
            if (strMo4589b2 == null) {
                wv1 wv1Var = (wv1) u91.m22591I0(arrayList);
                strMo4589b2 = wv1Var != null ? wv1Var.f67329a : null;
                if (strMo4589b2 == null) {
                    strMo4589b2 = cmaVar.mo4589b2();
                }
            }
        }
        String str2 = strMo4589b2;
        C3244l c3244l = c1978e.f24696g;
        while (true) {
            Object value = c3244l.getValue();
            Iterator it3 = arrayList.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!fa4.m11650l(((wv1) next).f67329a, str2));
            wv1 wv1Var2 = (wv1) next;
            int i2 = wv1Var2 != null ? wv1Var2.f67330b : 0;
            boolean z = arrayList.size() > 1;
            boolean z2 = arrayList.size() > 1;
            try {
                failure = Integer.valueOf((int) ChronoUnit.DAYS.between(LocalDate.parse(ew1Var.f37977c), LocalDate.parse(ew1Var.f37978d)));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            Integer num = (Integer) failure;
            ArrayList arrayList2 = arrayList;
            if (c3244l.m15570h(value, new vv1(str2, i2, true, false, z, z2, false, arrayList2, false, num != null ? num.intValue() : 0))) {
                ((C1240a) c1978e.f24694e.f53179a).m7025f("Cup signup opened", null);
                return xfa.f68157a;
            }
            arrayList = arrayList2;
        }
        ew1Var = (ew1) objM15541t;
        eh9 eh9VarMo4573B1 = cmaVar.mo4573B1();
        CupSignupViewModel$openSignup$1$userLanguages$1 cupSignupViewModel$openSignup$1$userLanguages$1 = new CupSignupViewModel$openSignup$1$userLanguages$1(2, null);
        this.f24623a = ew1Var;
        this.f24624b = 2;
        objM15540s = AbstractC3224d.m15540s(eh9VarMo4573B1, cupSignupViewModel$openSignup$1$userLanguages$1, this);
    }
}
