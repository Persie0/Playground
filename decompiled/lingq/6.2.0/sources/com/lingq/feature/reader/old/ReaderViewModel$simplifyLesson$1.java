package com.lingq.feature.reader.old;

import com.lingq.core.common.network.C1262a;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.b89;
import p000.c32;
import p000.cma;
import p000.d65;
import p000.d89;
import p000.fa4;
import p000.g89;
import p000.gm5;
import p000.j89;
import p000.qm7;
import p000.r79;
import p000.t79;
import p000.un1;
import p000.v79;
import p000.x79;
import p000.xfa;
import p000.z79;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$simplifyLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2679, 2681, 2683, 2684, 2699}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$simplifyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29088a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29089b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$simplifyLesson$1(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f29089b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$simplifyLesson$1(this.f29089b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$simplifyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    /* JADX WARN: Code duplicated, block: B:25:0x006d  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[PHI: r14
      0x007c: PHI (r14v19 java.lang.Object) = (r14v18 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x0079, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r2).m7262T(r14, r0, true, r13) == r5) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c7, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r2).m7266X(r14, r0, false, r13) == r5) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProfileAccount profileAccount;
        C2412n c2412n = this.f29089b;
        C3211a c3211a = c2412n.f29328X;
        d65 d65Var = c2412n.f29394p;
        C3211a c3211a2 = c2412n.f29355e2;
        cma cmaVar = c2412n.f29340b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29088a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            b89 b89Var = (b89) ((C3244l) c2412n.f29367h2.f9311a).getValue();
            if (fa4.m11650l(b89Var, t79.f61954a)) {
                C1262a c1262a = c2412n.f29295M;
                this.f29088a = 1;
                obj = c1262a.m7045a(this);
                if (obj != coroutineSingletons) {
                    if (((Boolean) obj).booleanValue()) {
                        c3211a2.mo4677k(d89.f35183a);
                    } else if (cmaVar.mo4581L0()) {
                        qm7 qm7Var = ((C1369b) c2412n.f29274F).f18481n;
                        this.f29088a = 2;
                        obj = AbstractC3224d.m15541t(qm7Var, this);
                        if (obj != coroutineSingletons) {
                            profileAccount = (ProfileAccount) obj;
                            profileAccount.f19687k++;
                            this.f29088a = 3;
                            if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                                String strMo4589b2 = cmaVar.mo4589b2();
                                int iM9332l3 = c2412n.m9332l3();
                                this.f29088a = 4;
                            }
                        }
                    } else {
                        c2412n.mo3737M1(UpgradeReason.SIMPLIFY);
                    }
                }
            } else if (fa4.m11650l(b89Var, v79.f64982a)) {
                String strMo4589b3 = cmaVar.mo4589b2();
                int iM9332l4 = c2412n.m9332l3();
                this.f29088a = 5;
            } else if (b89Var instanceof x79) {
                c3211a.mo4677k(Integer.valueOf(((x79) b89Var).f67904a));
            } else if (b89Var instanceof z79) {
                c3211a.mo4677k(Integer.valueOf(((z79) b89Var).f71028a));
            } else if (!fa4.m11650l(b89Var, r79.f58859a)) {
                gm5.m12750e();
                return null;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            if (((Boolean) obj).booleanValue()) {
                c3211a2.mo4677k(d89.f35183a);
            } else {
                if (cmaVar.mo4581L0()) {
                    qm7 qm7Var2 = ((C1369b) c2412n.f29274F).f18481n;
                    this.f29088a = 2;
                    obj = AbstractC3224d.m15541t(qm7Var2, this);
                    if (obj != coroutineSingletons) {
                        profileAccount = (ProfileAccount) obj;
                        profileAccount.f19687k++;
                        this.f29088a = 3;
                        if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                            String strMo4589b4 = cmaVar.mo4589b2();
                            int iM9332l5 = c2412n.m9332l3();
                            this.f29088a = 4;
                        }
                    }
                    return coroutineSingletons;
                }
                c2412n.mo3737M1(UpgradeReason.SIMPLIFY);
            }
        } else {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                profileAccount = (ProfileAccount) obj;
                profileAccount.f19687k++;
                this.f29088a = 3;
                if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                    String strMo4589b5 = cmaVar.mo4589b2();
                    int iM9332l6 = c2412n.m9332l3();
                    this.f29088a = 4;
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                AbstractC3193b.m15359b(obj);
                String strMo4589b6 = cmaVar.mo4589b2();
                int iM9332l7 = c2412n.m9332l3();
                this.f29088a = 4;
            } else if (i == 4) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                c3211a2.mo4677k(g89.f40390a);
            }
        }
        c3211a2.mo4677k(j89.f45213a);
        return xfa.f68157a;
    }
}
