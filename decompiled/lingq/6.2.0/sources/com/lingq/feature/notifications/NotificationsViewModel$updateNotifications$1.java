package com.lingq.feature.notifications;

import com.lingq.core.data.repository.C1300p;
import com.lingq.core.datastore.C1371d;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.cma;
import p000.en6;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.notifications.NotificationsViewModel$updateNotifications$1", m4291f = "NotificationsViewModel.kt", m4292l = {138, 140, 146, 150}, m4293m = "invokeSuspend", m4294v = 2)
final class NotificationsViewModel$updateNotifications$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26878a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f26879b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2168b f26880c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f26881d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsViewModel$updateNotifications$1(boolean z, C2168b c2168b, List list, Continuation continuation) {
        super(2, continuation);
        this.f26879b = z;
        this.f26880c = c2168b;
        this.f26881d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NotificationsViewModel$updateNotifications$1(this.f26879b, this.f26880c, this.f26881d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NotificationsViewModel$updateNotifications$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r12 == r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0084, code lost:
    
        if (r0.f26886f.mo7002H0(r4, r11) == r2) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2168b c2168b = this.f26880c;
        cma cmaVar = c2168b.f26882b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26878a;
        int iIntValue = 0;
        List list = this.f26881d;
        boolean z = this.f26879b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            en6 en6Var = c2168b.f26883c;
            if (z) {
                String strMo4589b2 = cmaVar.mo4589b2();
                this.f26878a = 1;
                if (((C1300p) en6Var).m7335b(strMo4589b2, this) != coroutineSingletons) {
                }
            } else {
                String strMo4589b3 = cmaVar.mo4589b2();
                this.f26878a = 2;
                if (((C1300p) en6Var).m7337d(strMo4589b3, list, this) != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        if (i == 1 || i == 2) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 3) {
            AbstractC3193b.m15359b(obj);
            Integer num = (Integer) ((Map) obj).get(cmaVar.mo4589b2());
            iIntValue = (num != null ? num.intValue() : 0) - list.size();
            this.f26878a = 4;
        } else {
            if (i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        if (z) {
            this.f26878a = 4;
        } else {
            c83 c83Var = ((C1371d) c2168b.f26884d).f18589z;
            this.f26878a = 3;
            obj = AbstractC3224d.m15541t(c83Var, this);
        }
        return coroutineSingletons;
    }
}
