package com.lingq.feature.reader.tracking;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.c65;
import p000.fa4;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.tracking.LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1", m4291f = "LessonStudyTrackingController.kt", m4292l = {332}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31135a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2574a f31136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31137c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f31138d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ double f31139e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ c65 f31140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1(C2574a c2574a, String str, long j, double d, c65 c65Var, Continuation continuation) {
        super(2, continuation);
        this.f31136b = c2574a;
        this.f31137c = str;
        this.f31138d = j;
        this.f31139e = d;
        this.f31140f = c65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1(this.f31136b, this.f31137c, this.f31138d, this.f31139e, this.f31140f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2574a c2574a = this.f31136b;
        LinkedHashSet linkedHashSet = c2574a.f31148h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31135a;
        String str = this.f31137c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            StringBuilder sb = new StringBuilder("READ_TIMER waiting key=");
            sb.append(str);
            sb.append(" delayMs=");
            long j = this.f31138d;
            sb.append(j);
            C2574a.m9489i(sb.toString());
            this.f31135a = 1;
            if (AbstractC3208a.m15437d(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C2574a.m9489i("READ_TIMER fired key=" + str);
        boolean zIsEmpty = linkedHashSet.isEmpty();
        xfa xfaVar = xfa.f68157a;
        if (!zIsEmpty) {
            C2574a.m9489i("READ_TIMER skippedNotEligible key=" + str + " readingPauseReasons=" + C2574a.m9490l(linkedHashSet));
            return xfaVar;
        }
        if (!fa4.m11650l(c2574a.f31156p, str)) {
            C2574a.m9489i("READ_TIMER skippedUnitChanged expected=" + str + " actual=" + c2574a.f31156p);
            return xfaVar;
        }
        if (c2574a.f31151k.contains(str)) {
            C2574a.m9489i("READ_TIMER skippedAlreadyCompleted key=" + str);
            return xfaVar;
        }
        c2574a.f31152l.put(str, new Long((long) Math.ceil(this.f31139e)));
        c2574a.f31157q = null;
        LinkedHashMap linkedHashMap = c2574a.f31152l;
        Long l = new Long(0L);
        String str2 = this.f31137c;
        c2574a.m9496d(str2, this.f31140f, ((Number) linkedHashMap.getOrDefault(str2, l)).longValue(), this.f31139e, "readCompletionJob");
        return xfaVar;
    }
}
