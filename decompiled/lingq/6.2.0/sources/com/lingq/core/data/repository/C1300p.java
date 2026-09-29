package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.NotificationMarkAsReadWorker;
import com.lingq.core.database.entity.NotificationEntity;
import com.lingq.core.network.api.result.ResultNotification;
import com.lingq.core.network.api.result.ResultNotifications;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.d32;
import p000.df4;
import p000.dn6;
import p000.dtc;
import p000.en6;
import p000.fa4;
import p000.fn6;
import p000.hi8;
import p000.jm6;
import p000.ql4;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.v91;
import p000.vk9;
import p000.xfa;
import p000.xj1;

/* JADX INFO: renamed from: com.lingq.core.data.repository.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1300p implements en6 {

    /* JADX INFO: renamed from: a */
    public final dn6 f16527a;

    /* JADX INFO: renamed from: b */
    public final fn6 f16528b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16529c;

    public C1300p(dn6 dn6Var, fn6 fn6Var, C0773b c0773b, df4 df4Var) {
        dn6Var.getClass();
        fn6Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        this.f16527a = dn6Var;
        this.f16528b = fn6Var;
        this.f16529c = c0773b;
    }

    /* JADX INFO: renamed from: a */
    public final void m7334a(String str, List list) {
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(NotificationMarkAsReadWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("ids", u91.m22621m1(list))};
        hi8 hi8Var = new hi8(10);
        for (int i = 0; i < 2; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16529c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7335b(String str, ContinuationImpl continuationImpl) throws Throwable {
        NotificationRepositoryImpl$markAllNotificationAsRead$1 notificationRepositoryImpl$markAllNotificationAsRead$1;
        if (continuationImpl instanceof NotificationRepositoryImpl$markAllNotificationAsRead$1) {
            notificationRepositoryImpl$markAllNotificationAsRead$1 = (NotificationRepositoryImpl$markAllNotificationAsRead$1) continuationImpl;
            int i = notificationRepositoryImpl$markAllNotificationAsRead$1.f15850d;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$markAllNotificationAsRead$1.f15850d = i - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$markAllNotificationAsRead$1 = new NotificationRepositoryImpl$markAllNotificationAsRead$1(this, continuationImpl);
            }
        } else {
            notificationRepositoryImpl$markAllNotificationAsRead$1 = new NotificationRepositoryImpl$markAllNotificationAsRead$1(this, continuationImpl);
        }
        Object obj = notificationRepositoryImpl$markAllNotificationAsRead$1.f15848b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationRepositoryImpl$markAllNotificationAsRead$1.f15850d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            notificationRepositoryImpl$markAllNotificationAsRead$1.f15847a = str;
            notificationRepositoryImpl$markAllNotificationAsRead$1.f15850d = 1;
            Object objM2861d = AbstractC0758a.m2861d(new ql4(str, 8), this.f16527a.f35897K, notificationRepositoryImpl$markAllNotificationAsRead$1, false, true);
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
            str = notificationRepositoryImpl$markAllNotificationAsRead$1.f15847a;
            AbstractC3193b.m15359b(obj);
        }
        m7334a(str, EmptyList.f47638a);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:47:0x010a A[LOOP:1: B:45:0x0104->B:47:0x010a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: c */
    public final Serializable m7336c(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        NotificationRepositoryImpl$networkGetNotifications$1 notificationRepositoryImpl$networkGetNotifications$1;
        ResultNotifications resultNotifications;
        ArrayList arrayList;
        String str2;
        int i2;
        int i3;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        ResultNotifications resultNotifications2;
        NotificationEntity notificationEntity;
        String strM7789i;
        Integer numM8379c;
        int iIntValue;
        int i4 = i;
        String str3 = str;
        if (continuationImpl instanceof NotificationRepositoryImpl$networkGetNotifications$1) {
            notificationRepositoryImpl$networkGetNotifications$1 = (NotificationRepositoryImpl$networkGetNotifications$1) continuationImpl;
            int i5 = notificationRepositoryImpl$networkGetNotifications$1.f15858h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$networkGetNotifications$1.f15858h = i5 - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$networkGetNotifications$1 = new NotificationRepositoryImpl$networkGetNotifications$1(this, continuationImpl);
            }
        } else {
            notificationRepositoryImpl$networkGetNotifications$1 = new NotificationRepositoryImpl$networkGetNotifications$1(this, continuationImpl);
        }
        Object objM11954b = notificationRepositoryImpl$networkGetNotifications$1.f15856f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = notificationRepositoryImpl$networkGetNotifications$1.f15858h;
        if (i6 == 0) {
            AbstractC3193b.m15359b(objM11954b);
            Integer num = new Integer(i4);
            Integer num2 = new Integer(20);
            notificationRepositoryImpl$networkGetNotifications$1.f15851a = str3;
            notificationRepositoryImpl$networkGetNotifications$1.f15854d = i4;
            notificationRepositoryImpl$networkGetNotifications$1.f15858h = 1;
            objM11954b = this.f16528b.m11954b(str3, num, num2, notificationRepositoryImpl$networkGetNotifications$1);
            if (objM11954b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i6 == 1) {
            i4 = notificationRepositoryImpl$networkGetNotifications$1.f15854d;
            str3 = notificationRepositoryImpl$networkGetNotifications$1.f15851a;
            AbstractC3193b.m15359b(objM11954b);
        } else {
            if (i6 == 2) {
                i3 = notificationRepositoryImpl$networkGetNotifications$1.f15855e;
                i2 = notificationRepositoryImpl$networkGetNotifications$1.f15854d;
                arrayList = notificationRepositoryImpl$networkGetNotifications$1.f15853c;
                ResultNotifications resultNotifications3 = notificationRepositoryImpl$networkGetNotifications$1.f15852b;
                str2 = notificationRepositoryImpl$networkGetNotifications$1.f15851a;
                AbstractC3193b.m15359b(objM11954b);
                resultNotifications = resultNotifications3;
                arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    notificationEntity = (NotificationEntity) obj;
                    if (!fa4.m11650l(notificationEntity.m7790j(), Boolean.TRUE) && ((strM7789i = notificationEntity.m7789i()) == null || vk9.m23391n0(strM7789i))) {
                        arrayList2.add(obj);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((NotificationEntity) it.next()).m7785e(), arrayList3);
                    }
                    notificationRepositoryImpl$networkGetNotifications$1.f15851a = null;
                    notificationRepositoryImpl$networkGetNotifications$1.f15852b = resultNotifications;
                    notificationRepositoryImpl$networkGetNotifications$1.f15853c = null;
                    notificationRepositoryImpl$networkGetNotifications$1.f15854d = i2;
                    notificationRepositoryImpl$networkGetNotifications$1.f15855e = i3;
                    notificationRepositoryImpl$networkGetNotifications$1.f15858h = 3;
                    if (m7337d(str2, arrayList3, notificationRepositoryImpl$networkGetNotifications$1) != coroutineSingletons) {
                        resultNotifications2 = resultNotifications;
                    }
                    return coroutineSingletons;
                }
                Integer num3 = new Integer(resultNotifications.m8377a());
                numM8379c = resultNotifications.m8379c();
                if (numM8379c != null) {
                    iIntValue = numM8379c.intValue();
                } else {
                    iIntValue = 0;
                }
                return new Pair(num3, new Integer(iIntValue));
            }
            if (i6 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resultNotifications2 = notificationRepositoryImpl$networkGetNotifications$1.f15852b;
            AbstractC3193b.m15359b(objM11954b);
        }
        resultNotifications = resultNotifications2;
        Integer num4 = new Integer(resultNotifications.m8377a());
        numM8379c = resultNotifications.m8379c();
        if (numM8379c != null) {
            iIntValue = numM8379c.intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(num4, new Integer(iIntValue));
        resultNotifications = (ResultNotifications) objM11954b;
        List listM8378b = resultNotifications.m8378b();
        if (listM8378b != null) {
            List list = listM8378b;
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList4.add(dtc.m10644a((ResultNotification) it2.next(), str3));
            }
            notificationRepositoryImpl$networkGetNotifications$1.f15851a = str3;
            notificationRepositoryImpl$networkGetNotifications$1.f15852b = resultNotifications;
            notificationRepositoryImpl$networkGetNotifications$1.f15853c = arrayList4;
            notificationRepositoryImpl$networkGetNotifications$1.f15854d = i4;
            notificationRepositoryImpl$networkGetNotifications$1.f15855e = 0;
            notificationRepositoryImpl$networkGetNotifications$1.f15858h = 2;
            if (this.f16527a.mo4096w0(arrayList4, notificationRepositoryImpl$networkGetNotifications$1) != coroutineSingletons) {
                arrayList = arrayList4;
                str2 = str3;
                i2 = i4;
                i3 = 0;
                arrayList2 = new ArrayList();
                while (r6.hasNext()) {
                    notificationEntity = (NotificationEntity) obj;
                    if (!fa4.m11650l(notificationEntity.m7790j(), Boolean.TRUE)) {
                    }
                }
                if (!arrayList2.isEmpty()) {
                    arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((NotificationEntity) it.next()).m7785e(), arrayList3);
                    }
                    notificationRepositoryImpl$networkGetNotifications$1.f15851a = null;
                    notificationRepositoryImpl$networkGetNotifications$1.f15852b = resultNotifications;
                    notificationRepositoryImpl$networkGetNotifications$1.f15853c = null;
                    notificationRepositoryImpl$networkGetNotifications$1.f15854d = i2;
                    notificationRepositoryImpl$networkGetNotifications$1.f15855e = i3;
                    notificationRepositoryImpl$networkGetNotifications$1.f15858h = 3;
                    if (m7337d(str2, arrayList3, notificationRepositoryImpl$networkGetNotifications$1) != coroutineSingletons) {
                        resultNotifications2 = resultNotifications;
                        resultNotifications = resultNotifications2;
                    }
                }
            }
            return coroutineSingletons;
        }
        Integer num5 = new Integer(resultNotifications.m8377a());
        numM8379c = resultNotifications.m8379c();
        if (numM8379c != null) {
            iIntValue = numM8379c.intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(num5, new Integer(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7337d(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        NotificationRepositoryImpl$updateNotification$1 notificationRepositoryImpl$updateNotification$1;
        if (continuationImpl instanceof NotificationRepositoryImpl$updateNotification$1) {
            notificationRepositoryImpl$updateNotification$1 = (NotificationRepositoryImpl$updateNotification$1) continuationImpl;
            int i = notificationRepositoryImpl$updateNotification$1.f15863e;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$updateNotification$1.f15863e = i - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$updateNotification$1 = new NotificationRepositoryImpl$updateNotification$1(this, continuationImpl);
            }
        } else {
            notificationRepositoryImpl$updateNotification$1 = new NotificationRepositoryImpl$updateNotification$1(this, continuationImpl);
        }
        Object obj = notificationRepositoryImpl$updateNotification$1.f15861c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationRepositoryImpl$updateNotification$1.f15863e;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            notificationRepositoryImpl$updateNotification$1.f15859a = str;
            notificationRepositoryImpl$updateNotification$1.f15860b = list;
            notificationRepositoryImpl$updateNotification$1.f15863e = 1;
            dn6 dn6Var = this.f16527a;
            dn6Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("UPDATE NotificationEntity SET isNew = 0 WHERE language = ? AND pk in (");
            d32.m10005B(list.size(), sb);
            sb.append(")");
            String string = sb.toString();
            Object objM2861d = AbstractC0758a.m2861d(new jm6(string, 1, list, str), dn6Var.f35897K, notificationRepositoryImpl$updateNotification$1, false, true);
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
            list = notificationRepositoryImpl$updateNotification$1.f15860b;
            str = notificationRepositoryImpl$updateNotification$1.f15859a;
            AbstractC3193b.m15359b(obj);
        }
        m7334a(str, list);
        return xfaVar;
    }
}
