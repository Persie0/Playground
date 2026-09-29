package com.lingq.shared.repository;

import ae.C0062b;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1518r3;
import ci.InterfaceC2018k;
import com.lingq.entity.Notification;
import com.lingq.shared.network.requests.RequestNotification;
import com.lingq.shared.network.result.ResultNotification;
import com.lingq.shared.network.result.ResultNotifications;
import com.lingq.shared.network.workers.NotificationMarkAsReadWorker;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p203ji.C6479a;
import p260m8.C7499b;
import p460wh.InterfaceC9942j;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationRepositoryImpl implements InterfaceC2018k {

    /* JADX INFO: renamed from: a */
    public final AbstractC1518r3 f20177a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9942j f20178b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f20179c;

    /* JADX INFO: renamed from: d */
    public final C4955q f20180d;

    public NotificationRepositoryImpl(AbstractC1518r3 abstractC1518r3, InterfaceC9942j interfaceC9942j, AbstractC1317j abstractC1317j, C4955q c4955q) {
        C5207g.m11111f(abstractC1518r3, "notificationDao");
        C5207g.m11111f(interfaceC9942j, "notificationService");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        this.f20177a = abstractC1518r3;
        this.f20178b = interfaceC9942j;
        this.f20179c = abstractC1317j;
        this.f20180d = c4955q;
    }

    @Override // ci.InterfaceC2018k
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<List<C6479a>> mo6090a(String str, int i10) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f20177a.mo5163k0(str, i10));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2018k
    /* JADX INFO: renamed from: b */
    public final Serializable mo6091b(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        NotificationRepositoryImpl$networkGetNotifications$1 notificationRepositoryImpl$networkGetNotifications$1;
        NotificationRepositoryImpl notificationRepositoryImpl;
        ResultNotifications resultNotifications;
        ResultNotifications resultNotifications2;
        Integer num;
        int iIntValue;
        String str2 = str;
        if (interfaceC9968c instanceof NotificationRepositoryImpl$networkGetNotifications$1) {
            notificationRepositoryImpl$networkGetNotifications$1 = (NotificationRepositoryImpl$networkGetNotifications$1) interfaceC9968c;
            int i11 = notificationRepositoryImpl$networkGetNotifications$1.f20190h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$networkGetNotifications$1.f20190h = i11 - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$networkGetNotifications$1 = new NotificationRepositoryImpl$networkGetNotifications$1(this, interfaceC9968c);
            }
        } else {
            notificationRepositoryImpl$networkGetNotifications$1 = new NotificationRepositoryImpl$networkGetNotifications$1(this, interfaceC9968c);
        }
        Object objM18491a = notificationRepositoryImpl$networkGetNotifications$1.f20188f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = notificationRepositoryImpl$networkGetNotifications$1.f20190h;
        if (i12 != 0) {
            if (i12 == 1) {
                str2 = notificationRepositoryImpl$networkGetNotifications$1.f20187e;
                notificationRepositoryImpl = (NotificationRepositoryImpl) notificationRepositoryImpl$networkGetNotifications$1.f20186d;
                C7499b.m14977z0(objM18491a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resultNotifications2 = (ResultNotifications) notificationRepositoryImpl$networkGetNotifications$1.f20186d;
                C7499b.m14977z0(objM18491a);
            }
            resultNotifications = resultNotifications2;
            Integer num2 = new Integer(resultNotifications.f18810a);
            num = resultNotifications.f18813d;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            return new Pair(num2, new Integer(iIntValue));
        }
        C7499b.m14977z0(objM18491a);
        Integer num3 = new Integer(i10);
        Integer num4 = new Integer(20);
        notificationRepositoryImpl$networkGetNotifications$1.f20186d = this;
        notificationRepositoryImpl$networkGetNotifications$1.f20187e = str2;
        notificationRepositoryImpl$networkGetNotifications$1.f20190h = 1;
        objM18491a = this.f20178b.m18491a(str2, num3, num4, notificationRepositoryImpl$networkGetNotifications$1);
        if (objM18491a == coroutineSingletons) {
            return coroutineSingletons;
        }
        notificationRepositoryImpl = this;
        resultNotifications = (ResultNotifications) objM18491a;
        List<ResultNotification> list = resultNotifications.f18814e;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (ResultNotification resultNotification : list) {
                C5207g.m11111f(resultNotification, "<this>");
                C5207g.m11111f(str2, "language");
                CoroutineSingletons coroutineSingletons2 = coroutineSingletons;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new Notification(resultNotification.f18796a, resultNotification.f18797b, str2, resultNotification.f18798c, resultNotification.f18799d, resultNotification.f18800e, resultNotification.f18801f, resultNotification.f18802g, resultNotification.f18803h, resultNotification.f18804i));
                str2 = str2;
                arrayList = arrayList2;
                coroutineSingletons = coroutineSingletons2;
            }
            CoroutineSingletons coroutineSingletons3 = coroutineSingletons;
            AbstractC1518r3 abstractC1518r3 = notificationRepositoryImpl.f20177a;
            notificationRepositoryImpl$networkGetNotifications$1.f20186d = resultNotifications;
            notificationRepositoryImpl$networkGetNotifications$1.f20187e = null;
            notificationRepositoryImpl$networkGetNotifications$1.f20190h = 2;
            Object objMo599i0 = abstractC1518r3.mo599i0(arrayList, notificationRepositoryImpl$networkGetNotifications$1);
            if (objMo599i0 == coroutineSingletons3) {
                return coroutineSingletons3;
            }
            resultNotifications2 = resultNotifications;
            objM18491a = objMo599i0;
            resultNotifications = resultNotifications2;
        }
        Integer num5 = new Integer(resultNotifications.f18810a);
        num = resultNotifications.f18813d;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(num5, new Integer(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2018k
    /* JADX INFO: renamed from: c */
    public final Object mo6092c(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NotificationRepositoryImpl$markAllNotificationAsRead$1 notificationRepositoryImpl$markAllNotificationAsRead$1;
        NotificationRepositoryImpl notificationRepositoryImpl;
        if (interfaceC9968c instanceof NotificationRepositoryImpl$markAllNotificationAsRead$1) {
            notificationRepositoryImpl$markAllNotificationAsRead$1 = (NotificationRepositoryImpl$markAllNotificationAsRead$1) interfaceC9968c;
            int i10 = notificationRepositoryImpl$markAllNotificationAsRead$1.f20185h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$markAllNotificationAsRead$1.f20185h = i10 - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$markAllNotificationAsRead$1 = new NotificationRepositoryImpl$markAllNotificationAsRead$1(this, interfaceC9968c);
            }
        } else {
            notificationRepositoryImpl$markAllNotificationAsRead$1 = new NotificationRepositoryImpl$markAllNotificationAsRead$1(this, interfaceC9968c);
        }
        Object obj = notificationRepositoryImpl$markAllNotificationAsRead$1.f20183f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = notificationRepositoryImpl$markAllNotificationAsRead$1.f20185h;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            notificationRepositoryImpl$markAllNotificationAsRead$1.f20181d = this;
            notificationRepositoryImpl$markAllNotificationAsRead$1.f20182e = str;
            notificationRepositoryImpl$markAllNotificationAsRead$1.f20185h = 1;
            if (this.f20177a.mo5164l0(str, notificationRepositoryImpl$markAllNotificationAsRead$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            notificationRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = notificationRepositoryImpl$markAllNotificationAsRead$1.f20182e;
            notificationRepositoryImpl = notificationRepositoryImpl$markAllNotificationAsRead$1.f20181d;
            C7499b.m14977z0(obj);
        }
        RequestNotification requestNotification = new RequestNotification();
        requestNotification.f18137a = EmptyList.f38032a;
        notificationRepositoryImpl.m9541f(str, requestNotification);
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // ci.InterfaceC2018k
    /* JADX INFO: renamed from: d */
    public final Object mo6093d(String str, List<Integer> list, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NotificationRepositoryImpl$updateNotification$1 notificationRepositoryImpl$updateNotification$1;
        NotificationRepositoryImpl notificationRepositoryImpl;
        if (interfaceC9968c instanceof NotificationRepositoryImpl$updateNotification$1) {
            notificationRepositoryImpl$updateNotification$1 = (NotificationRepositoryImpl$updateNotification$1) interfaceC9968c;
            int i10 = notificationRepositoryImpl$updateNotification$1.f20196i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                notificationRepositoryImpl$updateNotification$1.f20196i = i10 - Integer.MIN_VALUE;
            } else {
                notificationRepositoryImpl$updateNotification$1 = new NotificationRepositoryImpl$updateNotification$1(this, interfaceC9968c);
            }
        } else {
            notificationRepositoryImpl$updateNotification$1 = new NotificationRepositoryImpl$updateNotification$1(this, interfaceC9968c);
        }
        Object obj = notificationRepositoryImpl$updateNotification$1.f20194g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = notificationRepositoryImpl$updateNotification$1.f20196i;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            notificationRepositoryImpl$updateNotification$1.f20191d = this;
            notificationRepositoryImpl$updateNotification$1.f20192e = str;
            notificationRepositoryImpl$updateNotification$1.f20193f = list;
            notificationRepositoryImpl$updateNotification$1.f20196i = 1;
            if (this.f20177a.mo5165m0(str, list, notificationRepositoryImpl$updateNotification$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            notificationRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = notificationRepositoryImpl$updateNotification$1.f20193f;
            str = notificationRepositoryImpl$updateNotification$1.f20192e;
            notificationRepositoryImpl = notificationRepositoryImpl$updateNotification$1.f20191d;
            C7499b.m14977z0(obj);
        }
        RequestNotification requestNotification = new RequestNotification();
        requestNotification.f18137a = list;
        notificationRepositoryImpl.m9541f(str, requestNotification);
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2018k
    /* JADX INFO: renamed from: e */
    public final Object mo6094e(String str, RequestNotification requestNotification, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18492b = this.f20178b.m18492b(str, requestNotification, interfaceC9968c);
        return objM18492b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18492b : C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m9541f(String str, RequestNotification requestNotification) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(NotificationMarkAsReadWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str);
        Pair[] pairArr = {pair, new Pair("data", this.f20180d.m10563a(RequestNotification.class).m10535e(requestNotification))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i10 = 0; i10 < 2; i10++) {
            Pair pair2 = pairArr[i10];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f20179c.m4877b(aVar.m4879a());
    }
}
