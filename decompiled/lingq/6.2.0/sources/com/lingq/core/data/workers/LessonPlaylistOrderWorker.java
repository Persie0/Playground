package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.network.api.requests.RequestPlaylistOrder;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.C3474pv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonPlaylistOrderWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16738g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPlaylistOrderWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16738g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        LessonPlaylistOrderWorker$doWork$1 lessonPlaylistOrderWorker$doWork$1;
        String strM21787e;
        int[] iArrM21786d;
        if (continuation instanceof LessonPlaylistOrderWorker$doWork$1) {
            lessonPlaylistOrderWorker$doWork$1 = (LessonPlaylistOrderWorker$doWork$1) continuation;
            int i = lessonPlaylistOrderWorker$doWork$1.f16741c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lessonPlaylistOrderWorker$doWork$1.f16741c = i - Integer.MIN_VALUE;
            } else {
                lessonPlaylistOrderWorker$doWork$1 = new LessonPlaylistOrderWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            lessonPlaylistOrderWorker$doWork$1 = new LessonPlaylistOrderWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = lessonPlaylistOrderWorker$doWork$1.f16739a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lessonPlaylistOrderWorker$doWork$1.f16741c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (iArrM21786d = sz1Var.m21786d("lessonIds")) != null) {
                    C3474pv c3474pv = new C3474pv(iArrM21786d);
                    xd7 xd7Var = this.f16738g;
                    lessonPlaylistOrderWorker$doWork$1.f16741c = 1;
                    C1302r c1302r = (C1302r) xd7Var;
                    c1302r.getClass();
                    Object obj2 = xfa.f68157a;
                    if (!c3474pv.isEmpty()) {
                        RequestPlaylistOrder requestPlaylistOrder = new RequestPlaylistOrder();
                        requestPlaylistOrder.f20421a = c3474pv;
                        Object objM21317h = c1302r.f16537f.m21317h(strM21787e, requestPlaylistOrder, lessonPlaylistOrderWorker$doWork$1);
                        if (objM21317h == coroutineSingletons) {
                            obj2 = objM21317h;
                        }
                    }
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return new lg5();
            }
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            return og5.m17981a();
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
