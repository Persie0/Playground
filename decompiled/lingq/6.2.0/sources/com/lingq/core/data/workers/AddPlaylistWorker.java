package com.lingq.core.data.workers;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.lg5;
import p000.mg5;
import p000.og5;
import p000.sz1;
import p000.xd7;

/* JADX INFO: loaded from: classes2.dex */
public final class AddPlaylistWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: g */
    public final xd7 f16588g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPlaylistWorker(Context context, WorkerParameters workerParameters, xd7 xd7Var) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        xd7Var.getClass();
        this.f16588g = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // androidx.work.CoroutineWorker
    /* JADX INFO: renamed from: d */
    public final Object mo2213d(Continuation continuation) throws Throwable {
        AddPlaylistWorker$doWork$1 addPlaylistWorker$doWork$1;
        String strM21787e;
        String strM21787e2;
        String strM21787e3;
        if (continuation instanceof AddPlaylistWorker$doWork$1) {
            addPlaylistWorker$doWork$1 = (AddPlaylistWorker$doWork$1) continuation;
            int i = addPlaylistWorker$doWork$1.f16591c;
            if ((i & Integer.MIN_VALUE) != 0) {
                addPlaylistWorker$doWork$1.f16591c = i - Integer.MIN_VALUE;
            } else {
                addPlaylistWorker$doWork$1 = new AddPlaylistWorker$doWork$1(this, (ContinuationImpl) continuation);
            }
        } else {
            addPlaylistWorker$doWork$1 = new AddPlaylistWorker$doWork$1(this, (ContinuationImpl) continuation);
        }
        AddPlaylistWorker$doWork$1 addPlaylistWorker$doWork$2 = addPlaylistWorker$doWork$1;
        Object obj = addPlaylistWorker$doWork$2.f16589a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = addPlaylistWorker$doWork$2.f16591c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                WorkerParameters workerParameters = this.f56132b;
                int i3 = workerParameters.f7167c;
                sz1 sz1Var = workerParameters.f7166b;
                if (i3 <= 3 && (strM21787e = sz1Var.m21787e("language")) != null && (strM21787e2 = sz1Var.m21787e("title")) != null && (strM21787e3 = sz1Var.m21787e("titleLanguage")) != null) {
                    Integer num = new Integer(sz1Var.m21785c("itemId", -1));
                    Integer num2 = num.intValue() != -1 ? num : null;
                    String strM21787e4 = sz1Var.m21787e("itemURL");
                    xd7 xd7Var = this.f16588g;
                    addPlaylistWorker$doWork$2.f16591c = 1;
                    if (((C1302r) xd7Var).m7366z(num2, strM21787e, strM21787e2, strM21787e3, strM21787e4, addPlaylistWorker$doWork$2) == coroutineSingletons) {
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
        } catch (Throwable th) {
            th.printStackTrace();
            return new mg5();
        }
    }
}
