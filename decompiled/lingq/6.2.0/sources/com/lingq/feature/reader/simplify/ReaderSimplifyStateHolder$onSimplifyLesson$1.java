package com.lingq.feature.reader.simplify;

import com.lingq.core.common.network.C1262a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.a89;
import p000.c32;
import p000.c83;
import p000.c89;
import p000.cma;
import p000.e89;
import p000.f89;
import p000.fa4;
import p000.gm5;
import p000.i89;
import p000.m23;
import p000.q79;
import p000.s79;
import p000.u79;
import p000.un1;
import p000.w79;
import p000.xfa;
import p000.y79;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.simplify.ReaderSimplifyStateHolder$onSimplifyLesson$1", m4291f = "ReaderSimplifyStateHolder.kt", m4292l = {147, 149, 151, 152, 162}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSimplifyStateHolder$onSimplifyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30444a;

    /* JADX INFO: renamed from: b */
    public int f30445b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2518a f30446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSimplifyStateHolder$onSimplifyLesson$1(C2518a c2518a, Continuation continuation) {
        super(2, continuation);
        this.f30446c = c2518a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSimplifyStateHolder$onSimplifyLesson$1(this.f30446c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSimplifyStateHolder$onSimplifyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[PHI: r4 r14
      0x008e: PHI (r4v3 int) = (r4v2 int), (r4v6 int) binds: [B:26:0x008b, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x008e: PHI (r14v20 java.lang.Object) = (r14v19 java.lang.Object), (r14v0 java.lang.Object) binds: [B:26:0x008b, B:14:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0 A[PHI: r4
      0x00a0: PHI (r4v4 int) = (r4v3 int), (r4v7 int) binds: [B:29:0x009d, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 == r3) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ef, code lost:
    
        if (r13 == r3) goto L50;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        ProfileAccount profileAccount;
        Object objM7262T;
        C2518a c2518a = this.f30446c;
        C3244l c3244l = c2518a.f30502k;
        cma cmaVar = c2518a.f30499h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30445b;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            iIntValue = ((Number) c2518a.f30504m.getValue()).intValue();
            a89 a89Var = (a89) ((C3244l) c2518a.f30506o.f9311a).getValue();
            if (fa4.m11650l(a89Var, s79.f60490a)) {
                C1262a c1262a = c2518a.f30498g;
                this.f30444a = iIntValue;
                this.f30445b = 1;
                obj = c1262a.m7045a(this);
                if (obj != coroutineSingletons) {
                    if (((Boolean) obj).booleanValue()) {
                        c3244l.getClass();
                        c3244l.m15572j(null, c89.f9719a);
                        return xfaVar;
                    }
                    if (cmaVar.mo4581L0()) {
                        c2518a.f30500i.mo3737M1(UpgradeReason.SIMPLIFY);
                        return xfaVar;
                    }
                    c83 c83VarMo4583O1 = cmaVar.mo4583O1();
                    this.f30444a = iIntValue;
                    this.f30445b = 2;
                    obj = AbstractC3224d.m15541t(c83VarMo4583O1, this);
                    if (obj != coroutineSingletons) {
                        profileAccount = (ProfileAccount) obj;
                        profileAccount.f19687k++;
                        this.f30444a = iIntValue;
                        this.f30445b = 3;
                        if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                            m23 m23Var = c2518a.f30496e;
                            String strMo4589b2 = cmaVar.mo4589b2();
                            this.f30444a = iIntValue;
                            this.f30445b = 4;
                            objM7262T = ((C1295k) m23Var.f50448a).m7262T(strMo4589b2, iIntValue, true, this);
                            if (objM7262T != coroutineSingletons) {
                                objM7262T = xfaVar;
                            }
                        }
                    }
                }
            } else {
                if (!fa4.m11650l(a89Var, u79.f63521a)) {
                    if ((a89Var instanceof w79) || (a89Var instanceof y79)) {
                        return xfaVar;
                    }
                    if (!fa4.m11650l(a89Var, q79.f57353a)) {
                        gm5.m12750e();
                        return null;
                    }
                    c3244l.getClass();
                    c3244l.m15572j(null, e89.f36846a);
                    return xfaVar;
                }
                m23 m23Var2 = c2518a.f30497f;
                String strMo4589b3 = cmaVar.mo4589b2();
                this.f30444a = iIntValue;
                this.f30445b = 5;
                Object objM7266X = ((C1295k) m23Var2.f50448a).m7266X(strMo4589b3, iIntValue, false, this);
                if (objM7266X != coroutineSingletons) {
                    objM7266X = xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            iIntValue = this.f30444a;
            AbstractC3193b.m15359b(obj);
            if (((Boolean) obj).booleanValue()) {
                c3244l.getClass();
                c3244l.m15572j(null, c89.f9719a);
                return xfaVar;
            }
            if (cmaVar.mo4581L0()) {
                c2518a.f30500i.mo3737M1(UpgradeReason.SIMPLIFY);
                return xfaVar;
            }
            c83 c83VarMo4583O2 = cmaVar.mo4583O1();
            this.f30444a = iIntValue;
            this.f30445b = 2;
            obj = AbstractC3224d.m15541t(c83VarMo4583O2, this);
            if (obj != coroutineSingletons) {
                profileAccount = (ProfileAccount) obj;
                profileAccount.f19687k++;
                this.f30444a = iIntValue;
                this.f30445b = 3;
                if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                    m23 m23Var3 = c2518a.f30496e;
                    String strMo4589b4 = cmaVar.mo4589b2();
                    this.f30444a = iIntValue;
                    this.f30445b = 4;
                    objM7262T = ((C1295k) m23Var3.f50448a).m7262T(strMo4589b4, iIntValue, true, this);
                    if (objM7262T != coroutineSingletons) {
                        objM7262T = xfaVar;
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i == 2) {
            iIntValue = this.f30444a;
            AbstractC3193b.m15359b(obj);
            profileAccount = (ProfileAccount) obj;
            profileAccount.f19687k++;
            this.f30444a = iIntValue;
            this.f30445b = 3;
            if (cmaVar.mo4591h0(profileAccount, this) != coroutineSingletons) {
                m23 m23Var4 = c2518a.f30496e;
                String strMo4589b5 = cmaVar.mo4589b2();
                this.f30444a = iIntValue;
                this.f30445b = 4;
                objM7262T = ((C1295k) m23Var4.f50448a).m7262T(strMo4589b5, iIntValue, true, this);
                if (objM7262T != coroutineSingletons) {
                    objM7262T = xfaVar;
                }
            }
            return coroutineSingletons;
        }
        if (i == 3) {
            iIntValue = this.f30444a;
            AbstractC3193b.m15359b(obj);
            m23 m23Var5 = c2518a.f30496e;
            String strMo4589b6 = cmaVar.mo4589b2();
            this.f30444a = iIntValue;
            this.f30445b = 4;
            objM7262T = ((C1295k) m23Var5.f50448a).m7262T(strMo4589b6, iIntValue, true, this);
            if (objM7262T != coroutineSingletons) {
                objM7262T = xfaVar;
            }
        } else {
            if (i != 4) {
                if (i != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                c3244l.getClass();
                c3244l.m15572j(null, f89.f38633a);
                return xfaVar;
            }
            AbstractC3193b.m15359b(obj);
        }
        c3244l.getClass();
        c3244l.m15572j(null, i89.f43692a);
        return xfaVar;
    }
}
