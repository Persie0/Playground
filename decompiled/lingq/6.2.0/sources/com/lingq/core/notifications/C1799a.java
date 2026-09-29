package com.lingq.core.notifications;

import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.user.ProfileAccount;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3540rl;
import p000.c18;
import p000.c83;
import p000.cd4;
import p000.cma;
import p000.do7;
import p000.du0;
import p000.eh9;
import p000.en6;
import p000.h24;
import p000.nn1;
import p000.qn6;
import p000.un1;
import p000.vma;
import p000.wfb;
import p000.xfa;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.notifications.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1799a implements qn6, cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f21875a;

    /* JADX INFO: renamed from: b */
    public final en6 f21876b;

    /* JADX INFO: renamed from: c */
    public final vma f21877c;

    /* JADX INFO: renamed from: d */
    public final un1 f21878d;

    /* JADX INFO: renamed from: e */
    public final nn1 f21879e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f21880f;

    /* JADX INFO: renamed from: g */
    public final C3211a f21881g;

    /* JADX INFO: renamed from: h */
    public final du0 f21882h;

    /* JADX INFO: renamed from: i */
    public final C3211a f21883i;

    /* JADX INFO: renamed from: j */
    public final du0 f21884j;

    /* JADX INFO: renamed from: k */
    public final C3211a f21885k;

    /* JADX INFO: renamed from: l */
    public final du0 f21886l;

    /* JADX INFO: renamed from: m */
    public final c18 f21887m;

    /* JADX INFO: renamed from: n */
    public final LinkedHashMap f21888n;

    public C1799a(en6 en6Var, vma vmaVar, cma cmaVar, un1 un1Var, nn1 nn1Var) {
        en6Var.getClass();
        vmaVar.getClass();
        cmaVar.getClass();
        un1Var.getClass();
        this.f21875a = cmaVar;
        this.f21876b = en6Var;
        this.f21877c = vmaVar;
        this.f21878d = un1Var;
        this.f21879e = nn1Var;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f21880f = linkedHashSet;
        C3540rl c3540rl = new C3540rl(AbstractC3224d.m15521C(((C1371d) vmaVar).f18589z, new NotificationsControllerImpl$_unreadNotificationsCount$1(this, null)), 5);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f21881g = c3211aM10525a;
        this.f21882h = AbstractC3224d.m15519A(c3211aM10525a);
        C3211a c3211aM10525a2 = do7.m10525a(-1, 6, null);
        this.f21883i = c3211aM10525a2;
        this.f21884j = AbstractC3224d.m15519A(c3211aM10525a2);
        C3211a c3211aM10525a3 = do7.m10525a(-1, 6, null);
        this.f21885k = c3211aM10525a3;
        this.f21886l = AbstractC3224d.m15519A(c3211aM10525a3);
        this.f21887m = AbstractC3224d.m15520B(c3540rl, un1Var, xi9.f68262a, 0);
        this.f21888n = new LinkedHashMap();
        linkedHashSet.clear();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f21875a.mo4571A();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f21885k.mo4677k(inAppNotificationAction);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f21875a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f21875a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f21875a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f21875a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f21875a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f21875a.mo4577H();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r3).m7972l(r6, r0) == r1) goto L21;
     */
    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7002H0(int i, Continuation continuation) throws Throwable {
        NotificationsControllerImpl$updateUnreadNotifications$1 notificationsControllerImpl$updateUnreadNotifications$1;
        if (continuation instanceof NotificationsControllerImpl$updateUnreadNotifications$1) {
            notificationsControllerImpl$updateUnreadNotifications$1 = (NotificationsControllerImpl$updateUnreadNotifications$1) continuation;
            int i2 = notificationsControllerImpl$updateUnreadNotifications$1.f21874d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                notificationsControllerImpl$updateUnreadNotifications$1.f21874d = i2 - Integer.MIN_VALUE;
            } else {
                notificationsControllerImpl$updateUnreadNotifications$1 = new NotificationsControllerImpl$updateUnreadNotifications$1(this, continuation);
            }
        } else {
            notificationsControllerImpl$updateUnreadNotifications$1 = new NotificationsControllerImpl$updateUnreadNotifications$1(this, continuation);
        }
        Object objM15541t = notificationsControllerImpl$updateUnreadNotifications$1.f21872b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = notificationsControllerImpl$updateUnreadNotifications$1.f21874d;
        vma vmaVar = this.f21877c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18589z;
            notificationsControllerImpl$updateUnreadNotifications$1.f21871a = i;
            notificationsControllerImpl$updateUnreadNotifications$1.f21874d = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, notificationsControllerImpl$updateUnreadNotifications$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = notificationsControllerImpl$updateUnreadNotifications$1.f21871a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(this.f21875a.mo4589b2(), new Integer(i));
        Map mapM15371X = AbstractC3194a.m15371X(linkedHashMapM15372Y);
        notificationsControllerImpl$updateUnreadNotifications$1.f21871a = i;
        notificationsControllerImpl$updateUnreadNotifications$1.f21874d = 2;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f21875a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f21875a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f21875a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f21875a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f21875a.mo4582N();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r3).m7972l(r6, r0) == r1) goto L21;
     */
    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo7003O(Continuation continuation) throws Throwable {
        NotificationsControllerImpl$clearNotifications$1 notificationsControllerImpl$clearNotifications$1;
        if (continuation instanceof NotificationsControllerImpl$clearNotifications$1) {
            notificationsControllerImpl$clearNotifications$1 = (NotificationsControllerImpl$clearNotifications$1) continuation;
            int i = notificationsControllerImpl$clearNotifications$1.f21861c;
            if ((i & Integer.MIN_VALUE) != 0) {
                notificationsControllerImpl$clearNotifications$1.f21861c = i - Integer.MIN_VALUE;
            } else {
                notificationsControllerImpl$clearNotifications$1 = new NotificationsControllerImpl$clearNotifications$1(this, (ContinuationImpl) continuation);
            }
        } else {
            notificationsControllerImpl$clearNotifications$1 = new NotificationsControllerImpl$clearNotifications$1(this, (ContinuationImpl) continuation);
        }
        Object objM15541t = notificationsControllerImpl$clearNotifications$1.f21859a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = notificationsControllerImpl$clearNotifications$1.f21861c;
        vma vmaVar = this.f21877c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18589z;
            notificationsControllerImpl$clearNotifications$1.f21861c = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, notificationsControllerImpl$clearNotifications$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(this.f21875a.mo4589b2(), new Integer(0));
        Map mapM15371X = AbstractC3194a.m15371X(linkedHashMapM15372Y);
        notificationsControllerImpl$clearNotifications$1.f21861c = 2;
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f21884j;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f21875a.mo4583O1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f21883i.mo4677k(h24Var);
        mo7014i0(h24Var);
        this.f21880f.remove(h24Var);
        this.f21881g.mo4677k(null);
        wfb.m23926u(this.f21878d, null, null, new NotificationsControllerImpl$showNotifications$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f21875a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f21875a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f21875a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f21875a.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        wfb.m23926u(this.f21878d, this.f21879e, null, new NotificationsControllerImpl$networkNotifications$2(this, null), 2);
        return xfa.f68157a;
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f21887m;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f21875a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f21875a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f21875a.mo4590d0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f21882h;
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        LinkedHashSet linkedHashSet = this.f21880f;
        if (linkedHashSet == null || !linkedHashSet.isEmpty()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                if (((h24) it.next()).f41695a == h24Var.f41695a) {
                    return;
                }
            }
        }
        linkedHashSet.add(h24Var);
        wfb.m23926u(this.f21878d, null, null, new NotificationsControllerImpl$showNotifications$1(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f21875a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        LinkedHashMap linkedHashMap = this.f21888n;
        cd4 cd4Var = (cd4) linkedHashMap.get(h24Var);
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
        linkedHashMap.remove(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f21875a.mo4592m0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f21886l;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f21875a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f21875a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f21875a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f21875a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f21875a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f21875a.mo4598w2();
    }
}
