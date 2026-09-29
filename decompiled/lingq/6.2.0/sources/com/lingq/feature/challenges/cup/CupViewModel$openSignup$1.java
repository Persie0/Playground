package com.lingq.feature.challenges.cup;

import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupTeamEntry;
import com.lingq.core.domain.model.language.Language;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
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
@c32(m4290c = "com.lingq.feature.challenges.cup.CupViewModel$openSignup$1", m4291f = "CupViewModel.kt", m4292l = {222}, m4293m = "invokeSuspend", m4294v = 2)
final class CupViewModel$openSignup$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1980g f24652b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ew1 f24653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CupViewModel$openSignup$1(C1980g c1980g, ew1 ew1Var, Continuation continuation) {
        super(2, continuation);
        this.f24652b = c1980g;
        this.f24653c = ew1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CupViewModel$openSignup$1(this.f24652b, this.f24653c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CupViewModel$openSignup$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15540s;
        ew1 ew1Var;
        String strMo4589b2;
        Object next;
        Object next2;
        C1980g c1980g = this.f24652b;
        cma cmaVar = c1980g.f24706b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24651a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            eh9 eh9VarMo4573B1 = cmaVar.mo4573B1();
            CupViewModel$openSignup$1$userLanguages$1 cupViewModel$openSignup$1$userLanguages$1 = new CupViewModel$openSignup$1$userLanguages$1(2, null);
            this.f24651a = 1;
            objM15540s = AbstractC3224d.m15540s(eh9VarMo4573B1, cupViewModel$openSignup$1$userLanguages$1, this);
            if (objM15540s == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            objM15540s = obj;
        }
        List list = (List) objM15540s;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ew1Var = this.f24653c;
            if (!zHasNext) {
                break;
            }
            Language language = (Language) it.next();
            String str = language.f19024a;
            Iterator it2 = ew1Var.f37984j.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!fa4.m11650l(((CupTeamEntry) next2).f18996a, language.f19024a));
            CupTeamEntry cupTeamEntry = (CupTeamEntry) next2;
            arrayList.add(new wv1(str, cupTeamEntry != null ? cupTeamEntry.f18997b : 0));
        }
        CupTeam cupTeam = ew1Var.f37981g;
        if (cupTeam == null || (strMo4589b2 = cupTeam.f18994b) == null) {
            strMo4589b2 = cmaVar.mo4589b2();
            if (!arrayList.isEmpty()) {
                Iterator it3 = arrayList.iterator();
                do {
                    if (!it3.hasNext()) {
                        strMo4589b2 = null;
                        break;
                    }
                } while (!fa4.m11650l(((wv1) it3.next()).f67329a, strMo4589b2));
            } else {
                strMo4589b2 = null;
                break;
            }
            if (strMo4589b2 == null) {
                wv1 wv1Var = (wv1) u91.m22591I0(arrayList);
                strMo4589b2 = wv1Var != null ? wv1Var.f67329a : null;
                if (strMo4589b2 == null) {
                    strMo4589b2 = cmaVar.mo4589b2();
                }
            }
        }
        String str2 = strMo4589b2;
        C3244l c3244l = c1980g.f24714j;
        while (true) {
            Object value = c3244l.getValue();
            Iterator it4 = arrayList.iterator();
            do {
                if (!it4.hasNext()) {
                    next = null;
                    break;
                }
                next = it4.next();
            } while (!fa4.m11650l(((wv1) next).f67329a, str2));
            wv1 wv1Var2 = (wv1) next;
            ew1 ew1Var2 = ew1Var;
            if (c3244l.m15570h(value, new vv1(str2, wv1Var2 != null ? wv1Var2.f67330b : 0, true, false, arrayList.size() > 1, arrayList.size() > 1, false, arrayList, false, C1980g.m8843W2(ew1Var)))) {
                ((C1240a) c1980g.f24713i.f53179a).m7025f("Cup signup opened", null);
                return xfa.f68157a;
            }
            ew1Var = ew1Var2;
        }
    }
}
