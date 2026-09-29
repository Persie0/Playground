package androidx.glance.session;

import android.content.Context;
import androidx.concurrent.futures.AbstractC0465c;
import androidx.work.WorkInfo$State;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.a45;
import p000.ah1;
import p000.by8;
import p000.c8b;
import p000.e8b;
import p000.f5d;
import p000.gm0;
import p000.ql4;
import p000.vz1;

/* JADX INFO: renamed from: androidx.glance.session.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C0702j {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m2501a(Context context, String str, ContinuationImpl continuationImpl) {
        WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1 workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1;
        if (continuationImpl instanceof WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1) {
            workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1 = (WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1) continuationImpl;
            int i = workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1.f6257c;
            if ((i & Integer.MIN_VALUE) != 0) {
                workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1.f6257c = i - Integer.MIN_VALUE;
            } else {
                workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1 = new WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1(this, continuationImpl);
            }
        } else {
            workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1 = new WorkManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1(this, continuationImpl);
        }
        Object objM1910a = workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1.f6255a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1.f6257c;
        boolean z = true;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM1910a);
            context.getClass();
            C0773b c0773bM2910c = C0773b.m2910c(context);
            c0773bM2910c.getClass();
            WorkDatabase workDatabase = c0773bM2910c.f7206c;
            e8b e8bVar = c0773bM2910c.f7207d;
            workDatabase.getClass();
            e8bVar.getClass();
            str.getClass();
            ql4 ql4Var = new ql4(str, 25);
            by8 by8Var = e8bVar.f36847a;
            by8Var.getClass();
            gm0 gm0VarM11561c = f5d.m11561c(new ah1(by8Var, "loadStatusFuture", new a45(28, ql4Var, workDatabase)));
            workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1.f6257c = 1;
            objM1910a = AbstractC0465c.m1910a(gm0VarM11561c, workManagerProxy$Companion$Default$1$workerIsRunningOrEnqueued$1);
            if (objM1910a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM1910a);
        }
        List list = (List) objM1910a;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (vz1.m23605K(WorkInfo$State.RUNNING, WorkInfo$State.ENQUEUED).contains(((c8b) list.get(i3)).f9722b)) {
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
