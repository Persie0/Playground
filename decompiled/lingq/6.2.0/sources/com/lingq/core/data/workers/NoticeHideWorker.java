package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1299o;
import com.lingq.core.network.api.requests.RequestNotice;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.df4;
import p000.lg5;
import p000.mg5;
import p000.mm6;
import p000.og5;
import p000.vz1;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final class NoticeHideWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final mm6 f16766g;

    /* JADX INFO: renamed from: h */
    public final df4 f16767h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NoticeHideWorker(Context context, WorkerParameters workerParameters, mm6 mm6Var, df4 df4Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        mm6Var.getClass();
        df4Var.getClass();
        this.f16766g = mm6Var;
        this.f16767h = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        NoticeHideWorker$doWork$1 noticeHideWorker$doWork$1;
        String strM21787e;
        int i;
        Iterator it;
        if (continuation instanceof NoticeHideWorker$doWork$1) {
            noticeHideWorker$doWork$1 = (NoticeHideWorker$doWork$1) continuation;
            int i2 = noticeHideWorker$doWork$1.f16772e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                noticeHideWorker$doWork$1.f16772e = i2 - Integer.MIN_VALUE;
            } else {
                noticeHideWorker$doWork$1 = new NoticeHideWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            noticeHideWorker$doWork$1 = new NoticeHideWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        Object obj = noticeHideWorker$doWork$1.f16770c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = noticeHideWorker$doWork$1.f16772e;
        try {
            if (i3 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                if (workerParameters.f7167c <= 3 && (strM21787e = workerParameters.f7166b.m21787e("data")) != null) {
                    df4 df4Var = this.f16767h;
                    df4Var.getClass();
                    List list = ((RequestNotice) df4Var.m10321a(strM21787e, RequestNotice.Companion.serializer())).f20410a;
                    if (list != null) {
                        i = 0;
                        it = list.iterator();
                    }
                    return og5.m17981a();
                }
                return new lg5();
            }
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = noticeHideWorker$doWork$1.f16769b;
            it = noticeHideWorker$doWork$1.f16768a;
            AbstractC3193b.m15359b(obj);
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                mm6 mm6Var = this.f16766g;
                noticeHideWorker$doWork$1.f16768a = it;
                noticeHideWorker$doWork$1.f16769b = i;
                noticeHideWorker$doWork$1.f16772e = 1;
                C1299o c1299o = (C1299o) mm6Var;
                c1299o.getClass();
                RequestNotice requestNotice = new RequestNotice();
                requestNotice.f20410a = vz1.m23604J(new Integer(iIntValue));
                Object objM17496a = c1299o.f16524b.m17496a(requestNotice, noticeHideWorker$doWork$1);
                if (objM17496a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM17496a = xfa.f68157a;
                }
                if (objM17496a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return og5.m17981a();
        } catch (Throwable unused) {
            return new mg5();
        }
    }
}
