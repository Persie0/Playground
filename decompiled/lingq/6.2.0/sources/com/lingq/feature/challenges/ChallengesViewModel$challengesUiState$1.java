package com.lingq.feature.challenges;

import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.challenge.ChallengeStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.a6d;
import p000.c32;
import p000.dj3;
import p000.et0;
import p000.f6d;
import p000.pr0;
import p000.qr0;
import p000.u91;
import p000.v91;
import p000.ws1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.ChallengesViewModel$challengesUiState$1", m4291f = "ChallengesViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ChallengesViewModel$challengesUiState$1 extends SuspendLambda implements dj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ boolean f24470a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f24471b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ boolean f24472c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ List f24473d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ ws1 f24474e;

    public ChallengesViewModel$challengesUiState$1(Continuation continuation) {
        super(6, continuation);
    }

    @Override // p000.dj3
    /* JADX INFO: renamed from: h */
    public final Object mo1290h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
        ChallengesViewModel$challengesUiState$1 challengesViewModel$challengesUiState$1 = new ChallengesViewModel$challengesUiState$1((Continuation) obj6);
        challengesViewModel$challengesUiState$1.f24470a = zBooleanValue;
        challengesViewModel$challengesUiState$1.f24471b = zBooleanValue2;
        challengesViewModel$challengesUiState$1.f24472c = zBooleanValue3;
        challengesViewModel$challengesUiState$1.f24473d = (List) obj4;
        challengesViewModel$challengesUiState$1.f24474e = (ws1) obj5;
        return challengesViewModel$challengesUiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Long lM11577b;
        boolean z = this.f24470a;
        boolean z2 = this.f24471b;
        boolean z3 = this.f24472c;
        List list = this.f24473d;
        ws1 ws1Var = this.f24474e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        ws1 ws1Var2 = (ws1Var == null || ws1Var.f67237m) ? null : ws1Var;
        list.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new qr0((Challenge) it.next()));
        }
        if (ws1Var != null && ws1Var.f67237m) {
            String str2 = ws1Var.f67233i;
            Long lM11577b2 = str2 != null ? f6d.m11577b(str2) : null;
            Iterator it2 = arrayList.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                Challenge challenge = ((qr0) it2.next()).f58098a;
                ChallengeStatus challengeStatusM148f = a6d.m148f(challenge);
                challengeStatusM148f.getClass();
                if (challengeStatusM148f != ChallengeStatus.Joined && challengeStatusM148f != ChallengeStatus.CanJoin && (str = challenge.f18858f) != null && (lM11577b = f6d.m11577b(str)) != null) {
                    long jLongValue = lM11577b.longValue();
                    if (lM11577b2 == null || jLongValue < lM11577b2.longValue()) {
                        break;
                    }
                }
                i++;
            }
            arrayList = i < 0 ? u91.m22604V0(arrayList, new pr0(ws1Var)) : u91.m22603U0(arrayList.subList(i, arrayList.size()), u91.m22604V0(arrayList.subList(0, i), new pr0(ws1Var)));
        }
        return new et0(z, z3, z2, list, ws1Var2, arrayList);
    }
}
