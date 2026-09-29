package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.NoticeHideWorker;
import com.lingq.core.network.api.requests.RequestNotice;
import com.lingq.core.network.api.result.ResultNotice;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.atc;
import p000.d32;
import p000.df4;
import p000.hi8;
import p000.jm6;
import p000.lm6;
import p000.mm6;
import p000.nm6;
import p000.tx6;
import p000.ux6;
import p000.v91;
import p000.xfa;
import p000.xj1;

/* JADX INFO: renamed from: com.lingq.core.data.repository.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1299o implements mm6 {

    /* JADX INFO: renamed from: a */
    public final lm6 f16523a;

    /* JADX INFO: renamed from: b */
    public final nm6 f16524b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16525c;

    /* JADX INFO: renamed from: d */
    public final df4 f16526d;

    public C1299o(lm6 lm6Var, nm6 nm6Var, C0773b c0773b, df4 df4Var) {
        lm6Var.getClass();
        nm6Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        this.f16523a = lm6Var;
        this.f16524b = nm6Var;
        this.f16525c = c0773b;
        this.f16526d = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7332a(String str, ContinuationImpl continuationImpl) throws Throwable {
        NoticeRepositoryImpl$fetchNotices$1 noticeRepositoryImpl$fetchNotices$1;
        if (continuationImpl instanceof NoticeRepositoryImpl$fetchNotices$1) {
            noticeRepositoryImpl$fetchNotices$1 = (NoticeRepositoryImpl$fetchNotices$1) continuationImpl;
            int i = noticeRepositoryImpl$fetchNotices$1.f15842d;
            if ((i & Integer.MIN_VALUE) != 0) {
                noticeRepositoryImpl$fetchNotices$1.f15842d = i - Integer.MIN_VALUE;
            } else {
                noticeRepositoryImpl$fetchNotices$1 = new NoticeRepositoryImpl$fetchNotices$1(this, continuationImpl);
            }
        } else {
            noticeRepositoryImpl$fetchNotices$1 = new NoticeRepositoryImpl$fetchNotices$1(this, continuationImpl);
        }
        Object objM17497b = noticeRepositoryImpl$fetchNotices$1.f15840b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = noticeRepositoryImpl$fetchNotices$1.f15842d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM17497b);
                nm6 nm6Var = this.f16524b;
                noticeRepositoryImpl$fetchNotices$1.f15839a = str;
                noticeRepositoryImpl$fetchNotices$1.f15842d = 1;
                objM17497b = nm6Var.m17497b(noticeRepositoryImpl$fetchNotices$1);
                if (objM17497b == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str = noticeRepositoryImpl$fetchNotices$1.f15839a;
                AbstractC3193b.m15359b(objM17497b);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM17497b);
            }
            return xfa.f68157a;
            List list = ((Results) objM17497b).f21739d;
            if (list != null) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(atc.m3039a((ResultNotice) it.next(), str));
                }
                lm6 lm6Var = this.f16523a;
                noticeRepositoryImpl$fetchNotices$1.f15839a = null;
                noticeRepositoryImpl$fetchNotices$1.f15842d = 2;
                objM17497b = lm6Var.mo4096w0(arrayList, noticeRepositoryImpl$fetchNotices$1);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7333b(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        NoticeRepositoryImpl$hideNotices$1 noticeRepositoryImpl$hideNotices$1;
        if (continuationImpl instanceof NoticeRepositoryImpl$hideNotices$1) {
            noticeRepositoryImpl$hideNotices$1 = (NoticeRepositoryImpl$hideNotices$1) continuationImpl;
            int i = noticeRepositoryImpl$hideNotices$1.f15846d;
            if ((i & Integer.MIN_VALUE) != 0) {
                noticeRepositoryImpl$hideNotices$1.f15846d = i - Integer.MIN_VALUE;
            } else {
                noticeRepositoryImpl$hideNotices$1 = new NoticeRepositoryImpl$hideNotices$1(this, continuationImpl);
            }
        } else {
            noticeRepositoryImpl$hideNotices$1 = new NoticeRepositoryImpl$hideNotices$1(this, continuationImpl);
        }
        Object obj = noticeRepositoryImpl$hideNotices$1.f15844b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = noticeRepositoryImpl$hideNotices$1.f15846d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            noticeRepositoryImpl$hideNotices$1.f15843a = list;
            noticeRepositoryImpl$hideNotices$1.f15846d = 1;
            lm6 lm6Var = this.f16523a;
            lm6Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE NoticeEntity SET isShown = 1 WHERE language = ? AND id in (");
            d32.m10005B(list.size(), sb);
            sb.append(")");
            String string = sb.toString();
            Object objM2861d = AbstractC0758a.m2861d(new jm6(string, 0, list, str), lm6Var.f49834K, noticeRepositoryImpl$hideNotices$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = noticeRepositoryImpl$hideNotices$1.f15843a;
            AbstractC3193b.m15359b(obj);
        }
        RequestNotice requestNotice = new RequestNotice();
        requestNotice.m8262a(list);
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(NoticeHideWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        df4 df4Var = this.f16526d;
        df4Var.getClass();
        Pair[] pairArr = {new Pair("data", df4Var.m10322b(RequestNotice.Companion.serializer(), requestNotice))};
        hi8 hi8Var = new hi8(10);
        Pair pair = pairArr[0];
        hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        this.f16525c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfaVar;
    }
}
