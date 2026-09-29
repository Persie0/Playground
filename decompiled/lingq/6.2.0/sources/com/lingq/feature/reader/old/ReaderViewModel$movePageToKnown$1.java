package com.lingq.feature.reader.old;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.h24;
import p000.hm5;
import p000.lda;
import p000.ox7;
import p000.qm7;
import p000.s7b;
import p000.un1;
import p000.v91;
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$movePageToKnown$1", m4291f = "ReaderViewModel.kt", m4292l = {1748, 1761, 1772}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$movePageToKnown$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public h24 f28987a;

    /* JADX INFO: renamed from: b */
    public int f28988b;

    /* JADX INFO: renamed from: c */
    public int f28989c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f28990d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f28991e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f28992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$movePageToKnown$1(int i, C2412n c2412n, String str, Continuation continuation) {
        super(2, continuation);
        this.f28990d = c2412n;
        this.f28991e = i;
        this.f28992f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$movePageToKnown$1(this.f28991e, this.f28990d, this.f28992f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$movePageToKnown$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00fa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        int i2;
        int iIntValue;
        h24 h24Var;
        h24 h24Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.f28989c;
        C2412n c2412n = this.f28990d;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            List list = (List) c2412n.f29269D0.getValue();
            if (!list.isEmpty() && (i2 = (i = this.f28991e) - 1) >= 0 && i < list.size()) {
                List list2 = ((ox7) list.get(i2)).f55132e;
                s7b s7bVar = c2412n.f29403s;
                String strMo4589b2 = c2412n.f29340b.mo4589b2();
                int iM9332l3 = c2412n.m9332l3();
                List list3 = list2;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((xz7) it.next()).f69008e);
                }
                this.f28989c = 1;
                obj = ((C1310z) s7bVar).m7430i(strMo4589b2, iM9332l3, arrayList, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return xfa.f68157a;
        }
        if (i3 == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i3 == 2) {
                iIntValue = this.f28988b;
                AbstractC3193b.m15359b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    h24Var = new h24(InAppNotificationType.WordsKnown, vz1.m23604J(InAppNotificationAction.Understood), new Integer(iIntValue), 6);
                    c2412n.f29384m.mo7013g1(h24Var);
                    this.f28987a = h24Var;
                    this.f28988b = iIntValue;
                    this.f28989c = 3;
                    if (AbstractC3208a.m15437d(10000L, this) != coroutineSingletons) {
                        h24Var2 = h24Var;
                    }
                    return coroutineSingletons;
                }
                return xfa.f68157a;
            }
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h24Var2 = this.f28987a;
            AbstractC3193b.m15359b(obj);
        }
        c2412n.mo7005P1(h24Var2);
        return xfa.f68157a;
        iIntValue = ((Number) obj).intValue();
        if (iIntValue > 0) {
            hm5 hm5Var = c2412n.f29292L;
            Bundle bundle = new Bundle();
            bundle.putString("paging type", this.f28992f);
            bundle.putInt("n words to known", iIntValue);
            ((C1240a) hm5Var).m7025f("Word(s) paged to known", bundle);
            wfb.m23926u(lda.m16103C(c2412n), null, null, new ReaderViewModel$trackAchievements$1(c2412n, null), 3);
            qm7 qm7Var = ((C1369b) c2412n.f29274F).f18488u;
            this.f28988b = iIntValue;
            this.f28989c = 2;
            obj = AbstractC3224d.m15541t(qm7Var, this);
            if (obj != coroutineSingletons) {
                if (!((Boolean) obj).booleanValue()) {
                    h24Var = new h24(InAppNotificationType.WordsKnown, vz1.m23604J(InAppNotificationAction.Understood), new Integer(iIntValue), 6);
                    c2412n.f29384m.mo7013g1(h24Var);
                    this.f28987a = h24Var;
                    this.f28988b = iIntValue;
                    this.f28989c = 3;
                    if (AbstractC3208a.m15437d(10000L, this) != coroutineSingletons) {
                        h24Var2 = h24Var;
                        c2412n.mo7005P1(h24Var2);
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
