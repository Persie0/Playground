package com.lingq.core.data.repository;

import com.lingq.core.data.web2wave.C1312a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.g1b;
import p000.h0a;
import p000.j79;
import p000.p2b;
import p000.q2b;
import p000.r2b;
import p000.sm5;
import p000.um5;
import p000.vk9;
import p000.w2b;
import p000.xm5;
import p000.y2b;
import p000.z2b;

/* JADX INFO: renamed from: com.lingq.core.data.repository.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1309y {
    private static final r2b Companion = new r2b();

    /* JADX INFO: renamed from: a */
    public final C1312a f16575a;

    public C1309y(C1312a c1312a) {
        c1312a.getClass();
        this.f16575a = c1312a;
    }

    /* JADX INFO: renamed from: d */
    public static um5 m7419d(String str) {
        sm5.Companion.getClass();
        h0a.f41641a.mo11431b("[Web2Wave] " + str + " failed", new Object[0]);
        return new um5(p2b.f55501a);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7420a(String str, ContinuationImpl continuationImpl) throws Throwable {
        Web2WaveRepositoryImpl$fetchSubscriptionStatus$1 web2WaveRepositoryImpl$fetchSubscriptionStatus$1;
        Iterable iterable;
        w2b w2bVar;
        String string;
        if (continuationImpl instanceof Web2WaveRepositoryImpl$fetchSubscriptionStatus$1) {
            web2WaveRepositoryImpl$fetchSubscriptionStatus$1 = (Web2WaveRepositoryImpl$fetchSubscriptionStatus$1) continuationImpl;
            int i = web2WaveRepositoryImpl$fetchSubscriptionStatus$1.f16417c;
            if ((i & Integer.MIN_VALUE) != 0) {
                web2WaveRepositoryImpl$fetchSubscriptionStatus$1.f16417c = i - Integer.MIN_VALUE;
            } else {
                web2WaveRepositoryImpl$fetchSubscriptionStatus$1 = new Web2WaveRepositoryImpl$fetchSubscriptionStatus$1(this, continuationImpl);
            }
        } else {
            web2WaveRepositoryImpl$fetchSubscriptionStatus$1 = new Web2WaveRepositoryImpl$fetchSubscriptionStatus$1(this, continuationImpl);
        }
        Object objM7431a = web2WaveRepositoryImpl$fetchSubscriptionStatus$1.f16415a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = web2WaveRepositoryImpl$fetchSubscriptionStatus$1.f16417c;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7431a);
            web2WaveRepositoryImpl$fetchSubscriptionStatus$1.f16417c = 1;
            C1312a c1312a = this.f16575a;
            c1312a.getClass();
            objM7431a = c1312a.m7431a(new j79(str, i3), web2WaveRepositoryImpl$fetchSubscriptionStatus$1);
            if (objM7431a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7431a);
        }
        Map map = (Map) objM7431a;
        if (map == null) {
            return m7419d("fetchSubscriptionStatus");
        }
        Object obj = map.get("subscription");
        List list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            iterable = EmptyList.f47638a;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!(obj2 instanceof Map)) {
                    obj2 = null;
                }
                Map map2 = (Map) obj2;
                if (map2 != null) {
                    arrayList.add(map2);
                }
            }
            iterable = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object obj3 = ((Map) it.next()).get("status");
            if (obj3 == null || (string = obj3.toString()) == null) {
                w2bVar = null;
            } else {
                if (vk9.m23391n0(string)) {
                    string = null;
                }
                if (string != null) {
                    w2bVar = new w2b(string);
                } else {
                    w2bVar = null;
                }
            }
            if (w2bVar != null) {
                arrayList2.add(w2bVar);
            }
        }
        return new xm5(new y2b(arrayList2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7421b(String str, ContinuationImpl continuationImpl) throws Throwable {
        Web2WaveRepositoryImpl$fetchUserProperties$1 web2WaveRepositoryImpl$fetchUserProperties$1;
        String string;
        String string2;
        if (continuationImpl instanceof Web2WaveRepositoryImpl$fetchUserProperties$1) {
            web2WaveRepositoryImpl$fetchUserProperties$1 = (Web2WaveRepositoryImpl$fetchUserProperties$1) continuationImpl;
            int i = web2WaveRepositoryImpl$fetchUserProperties$1.f16420c;
            if ((i & Integer.MIN_VALUE) != 0) {
                web2WaveRepositoryImpl$fetchUserProperties$1.f16420c = i - Integer.MIN_VALUE;
            } else {
                web2WaveRepositoryImpl$fetchUserProperties$1 = new Web2WaveRepositoryImpl$fetchUserProperties$1(this, continuationImpl);
            }
        } else {
            web2WaveRepositoryImpl$fetchUserProperties$1 = new Web2WaveRepositoryImpl$fetchUserProperties$1(this, continuationImpl);
        }
        Object objM7431a = web2WaveRepositoryImpl$fetchUserProperties$1.f16418a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = web2WaveRepositoryImpl$fetchUserProperties$1.f16420c;
        String str2 = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7431a);
            web2WaveRepositoryImpl$fetchUserProperties$1.f16420c = 1;
            C1312a c1312a = this.f16575a;
            c1312a.getClass();
            objM7431a = c1312a.m7431a(new j79(str, 2), web2WaveRepositoryImpl$fetchUserProperties$1);
            if (objM7431a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7431a);
        }
        Map map = (Map) objM7431a;
        if (map == null) {
            return m7419d("fetchUserProperties");
        }
        Object obj = map.get("lingq_user_id");
        if (obj == null || (string = obj.toString()) == null || vk9.m23391n0(string)) {
            string = null;
        }
        Object obj2 = map.get("lingq_login_code");
        if (obj2 != null && (string2 = obj2.toString()) != null && !vk9.m23391n0(string2)) {
            str2 = string2;
        }
        return new xm5(new z2b(string, str2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7422c(ContinuationImpl continuationImpl) throws Throwable {
        Web2WaveRepositoryImpl$identify$1 web2WaveRepositoryImpl$identify$1;
        Object obj;
        String string;
        if (continuationImpl instanceof Web2WaveRepositoryImpl$identify$1) {
            web2WaveRepositoryImpl$identify$1 = (Web2WaveRepositoryImpl$identify$1) continuationImpl;
            int i = web2WaveRepositoryImpl$identify$1.f16423c;
            if ((i & Integer.MIN_VALUE) != 0) {
                web2WaveRepositoryImpl$identify$1.f16423c = i - Integer.MIN_VALUE;
            } else {
                web2WaveRepositoryImpl$identify$1 = new Web2WaveRepositoryImpl$identify$1(this, continuationImpl);
            }
        } else {
            web2WaveRepositoryImpl$identify$1 = new Web2WaveRepositoryImpl$identify$1(this, continuationImpl);
        }
        Object objM7431a = web2WaveRepositoryImpl$identify$1.f16421a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = web2WaveRepositoryImpl$identify$1.f16423c;
        int i3 = 1;
        String str = null;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7431a);
            web2WaveRepositoryImpl$identify$1.f16423c = 1;
            objM7431a = this.f16575a.m7431a(new g1b(i3), web2WaveRepositoryImpl$identify$1);
            if (objM7431a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7431a);
        }
        Map map = (Map) objM7431a;
        if (map == null) {
            return m7419d("identify");
        }
        if (String.valueOf(map.get("success")).equals("1") && (obj = map.get("user_id")) != null && (string = obj.toString()) != null && !vk9.m23391n0(string)) {
            str = string;
        }
        return new xm5(new q2b(str));
    }
}
