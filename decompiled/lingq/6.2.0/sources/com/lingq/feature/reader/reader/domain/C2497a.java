package com.lingq.feature.reader.reader.domain;

import com.lingq.core.data.repository.C1290f;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.ux5;
import p000.xfa;
import p000.xo1;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2497a {

    /* JADX INFO: renamed from: a */
    public final xo1 f30275a;

    public C2497a(xo1 xo1Var) {
        xo1Var.getClass();
        this.f30275a = xo1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9398a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        FetchCourseUseCase$invoke$1 fetchCourseUseCase$invoke$1;
        Object failure;
        if (continuationImpl instanceof FetchCourseUseCase$invoke$1) {
            fetchCourseUseCase$invoke$1 = (FetchCourseUseCase$invoke$1) continuationImpl;
            int i2 = fetchCourseUseCase$invoke$1.f30264e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchCourseUseCase$invoke$1.f30264e = i2 - Integer.MIN_VALUE;
            } else {
                fetchCourseUseCase$invoke$1 = new FetchCourseUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchCourseUseCase$invoke$1 = new FetchCourseUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7179c = fetchCourseUseCase$invoke$1.f30262c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = fetchCourseUseCase$invoke$1.f30264e;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(objM7179c);
                xo1 xo1Var = this.f30275a;
                fetchCourseUseCase$invoke$1.f30261b = str;
                fetchCourseUseCase$invoke$1.f30260a = i;
                fetchCourseUseCase$invoke$1.f30264e = 1;
                objM7179c = ((C1290f) xo1Var).m7179c(i, str, fetchCourseUseCase$invoke$1);
                if (objM7179c == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = fetchCourseUseCase$invoke$1.f30260a;
                str = fetchCourseUseCase$invoke$1.f30261b;
                AbstractC3193b.m15359b(objM7179c);
            }
            failure = new Integer(((Number) objM7179c).intValue());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable thM15355a = Result.m15355a(failure);
        if (thM15355a != null) {
            if (thM15355a instanceof CancellationException) {
                throw thM15355a;
            }
            rm5 rm5Var = sm5.Companion;
            String message = thM15355a.getMessage();
            StringBuilder sbM22995r = ux5.m22995r(i, "FetchCourseUseCase: failed to cache course=", " language=", str, ": ");
            sbM22995r.append(message);
            String string = sbM22995r.toString();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(string, new Object[0]);
        }
        return xfa.f68157a;
    }
}
