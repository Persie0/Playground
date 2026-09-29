package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.network.adapters.AbstractC1554b;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.ResultOffer;
import com.lingq.core.network.api.result.Results;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.aq6;
import p000.bq6;
import p000.gm5;
import p000.h0a;
import p000.itc;
import p000.rm5;
import p000.sm5;
import p000.u91;
import p000.um5;
import p000.v91;
import p000.vp6;
import p000.xfa;
import p000.xm5;
import p000.xp6;
import p000.zp6;

/* JADX INFO: renamed from: com.lingq.core.data.repository.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1301q implements aq6 {

    /* JADX INFO: renamed from: a */
    public final xp6 f16530a;

    /* JADX INFO: renamed from: b */
    public final bq6 f16531b;

    public C1301q(xp6 xp6Var, bq6 bq6Var) {
        xp6Var.getClass();
        bq6Var.getClass();
        this.f16530a = xp6Var;
        this.f16531b = bq6Var;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00db A[LOOP:0: B:33:0x00d5->B:35:0x00db, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        if (r6.mo4096w0(r1, r2) == r3) goto L38;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7338a(ContinuationImpl continuationImpl) throws Throwable {
        OfferRepositoryImpl$networkGetOffers$1 offerRepositoryImpl$networkGetOffers$1;
        List list;
        ArrayList arrayList;
        Iterator it;
        if (continuationImpl instanceof OfferRepositoryImpl$networkGetOffers$1) {
            offerRepositoryImpl$networkGetOffers$1 = (OfferRepositoryImpl$networkGetOffers$1) continuationImpl;
            int i = offerRepositoryImpl$networkGetOffers$1.f15867d;
            if ((i & Integer.MIN_VALUE) != 0) {
                offerRepositoryImpl$networkGetOffers$1.f15867d = i - Integer.MIN_VALUE;
            } else {
                offerRepositoryImpl$networkGetOffers$1 = new OfferRepositoryImpl$networkGetOffers$1(this, continuationImpl);
            }
        } else {
            offerRepositoryImpl$networkGetOffers$1 = new OfferRepositoryImpl$networkGetOffers$1(this, continuationImpl);
        }
        Object objM4099a = offerRepositoryImpl$networkGetOffers$1.f15865b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = offerRepositoryImpl$networkGetOffers$1.f15867d;
        xfa xfaVar = xfa.f68157a;
        xp6 xp6Var = this.f16530a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM4099a);
            offerRepositoryImpl$networkGetOffers$1.f15867d = 1;
            objM4099a = this.f16531b.m4099a(offerRepositoryImpl$networkGetOffers$1);
            if (objM4099a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM4099a);
        } else if (i2 == 2) {
            list = offerRepositoryImpl$networkGetOffers$1.f15864a;
            AbstractC3193b.m15359b(objM4099a);
            List list2 = list;
            arrayList = new ArrayList(v91.m23189q0(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(itc.m14144a((ResultOffer) it.next()));
            }
            offerRepositoryImpl$networkGetOffers$1.f15864a = null;
            offerRepositoryImpl$networkGetOffers$1.f15867d = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list3 = offerRepositoryImpl$networkGetOffers$1.f15864a;
            AbstractC3193b.m15359b(objM4099a);
        }
        return new xm5(xfaVar);
        NetworkResponse networkResponse = (NetworkResponse) objM4099a;
        int i4 = 0;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
            if (!(networkResponse instanceof NetworkResponse.Error)) {
                gm5.m12750e();
                return null;
            }
            rm5 rm5Var = sm5.Companion;
            NetworkResponse.Error error = (NetworkResponse.Error) networkResponse;
            String str = "[Offers] networkGetOffers failed: " + AbstractC1554b.m8250a(error);
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str, new Object[0]);
            return new um5(new zp6(AbstractC1554b.m8250a(error)));
        }
        list = ((Results) ((NetworkResponse.Success) networkResponse).getData()).f21739d;
        if (list == null) {
            list = EmptyList.f47638a;
        }
        rm5 rm5Var2 = sm5.Companion;
        String str2 = "[Offers] networkGetOffers " + list.size() + " results: " + u91.m22596N0(list, null, null, null, new vp6(i3), 31);
        rm5Var2.getClass();
        h0a.f41641a.mo11430a(str2, new Object[0]);
        offerRepositoryImpl$networkGetOffers$1.f15864a = list;
        offerRepositoryImpl$networkGetOffers$1.f15867d = 2;
        Object objM2861d = AbstractC0758a.m2861d(new vp6(i4), xp6Var.f68493K, offerRepositoryImpl$networkGetOffers$1, false, true);
        if (objM2861d != coroutineSingletons) {
            objM2861d = xfaVar;
        }
        if (objM2861d != coroutineSingletons) {
            List list4 = list;
            arrayList = new ArrayList(v91.m23189q0(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(itc.m14144a((ResultOffer) it.next()));
            }
            offerRepositoryImpl$networkGetOffers$1.f15864a = null;
            offerRepositoryImpl$networkGetOffers$1.f15867d = 3;
        }
        return coroutineSingletons;
    }
}
