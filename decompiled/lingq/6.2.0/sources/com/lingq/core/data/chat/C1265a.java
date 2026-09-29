package com.lingq.core.data.chat;

import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.ak1;
import p000.c83;
import p000.c8b;
import p000.gk6;
import p000.hi8;
import p000.sn5;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.zbd;

/* JADX INFO: renamed from: com.lingq.core.data.chat.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1265a {
    private static final sn5 Companion = new sn5();

    /* JADX INFO: renamed from: a */
    public final C0773b f14407a;

    public C1265a(C0773b c0773b) {
        c0773b.getClass();
        this.f14407a = c0773b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7051a(String str, String str2, String str3, boolean z) {
        tx6 tx6Var = new tx6(LynxPrivacySyncWorker.class);
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        networkType2.getClass();
        tx6Var.f46873c.f55781j = new ak1(new gk6(null), networkType2, false, false, false, false, -1L, -1L, u91.m22627s1(linkedHashSet));
        tx6 tx6Var2 = (tx6) tx6Var.m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS);
        Pair[] pairArr = {new Pair("language", str3), new Pair("setting", str2), new Pair("enabled", Boolean.valueOf(z))};
        hi8 hi8Var = new hi8(10);
        for (int i = 0; i < 3; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f14407a.m2913b(str, ExistingWorkPolicy.REPLACE, (ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Serializable m7052b(String str, ContinuationImpl continuationImpl) throws Throwable {
        LynxPrivacySyncImpl$hasPendingWork$1 lynxPrivacySyncImpl$hasPendingWork$1;
        Serializable failure;
        if (continuationImpl instanceof LynxPrivacySyncImpl$hasPendingWork$1) {
            lynxPrivacySyncImpl$hasPendingWork$1 = (LynxPrivacySyncImpl$hasPendingWork$1) continuationImpl;
            int i = lynxPrivacySyncImpl$hasPendingWork$1.f14402c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lynxPrivacySyncImpl$hasPendingWork$1.f14402c = i - Integer.MIN_VALUE;
            } else {
                lynxPrivacySyncImpl$hasPendingWork$1 = new LynxPrivacySyncImpl$hasPendingWork$1(this, continuationImpl);
            }
        } else {
            lynxPrivacySyncImpl$hasPendingWork$1 = new LynxPrivacySyncImpl$hasPendingWork$1(this, continuationImpl);
        }
        Object objM15541t = lynxPrivacySyncImpl$hasPendingWork$1.f14400a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = lynxPrivacySyncImpl$hasPendingWork$1.f14402c;
        boolean z = true;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM15541t);
                C0773b c0773b = this.f14407a;
                c83 c83VarM25543b = zbd.m25543b(c0773b.f7206c.mo2909z(), c0773b.f7207d.f36848b, str);
                lynxPrivacySyncImpl$hasPendingWork$1.f14402c = 1;
                objM15541t = AbstractC3224d.m15541t(c83VarM25543b, lynxPrivacySyncImpl$hasPendingWork$1);
                if (objM15541t == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM15541t);
            }
            Iterable iterable = (Iterable) objM15541t;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                do {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                } while (((c8b) it.next()).f9722b.isFinished());
            } else {
                z = false;
                break;
            }
            failure = Boolean.valueOf(z);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return failure instanceof Result.Failure ? Boolean.FALSE : failure;
    }
}
