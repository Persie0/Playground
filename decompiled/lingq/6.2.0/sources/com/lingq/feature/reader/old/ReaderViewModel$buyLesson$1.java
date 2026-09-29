package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.datastore.C1369b;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.user.Profile;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.mk0;
import p000.nm7;
import p000.qm7;
import p000.un1;
import p000.wx4;
import p000.xfa;
import p000.xx4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$buyLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2556, 2562, 2564}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$buyLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28905c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f28906d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$buyLesson$1(C2412n c2412n, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.f28904b = c2412n;
        this.f28905c = i;
        this.f28906d = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$buyLesson$1(this.f28904b, this.f28905c, this.f28906d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$buyLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (((com.lingq.core.datastore.C1369b) r1).m7920g(r10, r9) == r3) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n = this.f28904b;
        nm7 nm7Var = c2412n.f29274F;
        mk0 mk0Var = c2412n.f29360g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28903a;
        int i2 = this.f28905c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            mk0Var.mo9326g2(wx4.f67471a);
            d65 d65Var = c2412n.f29394p;
            Language language = (Language) c2412n.f29340b.mo4572B0().getValue();
            int i3 = language != null ? language.f19025b : 0;
            this.f28903a = 1;
            if (((C1295k) d65Var).m7274f(i3, i2, true, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
            Profile profile = (Profile) obj;
            profile.f19671t -= this.f28906d;
            this.f28903a = 3;
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        mk0Var.mo9326g2(xx4.f68925a);
        c2412n.f29328X.mo4677k(Integer.valueOf(i2));
        return xfa.f68157a;
        qm7 qm7Var = ((C1369b) nm7Var).f18480m;
        this.f28903a = 2;
        obj = AbstractC3224d.m15541t(qm7Var, this);
        if (obj != coroutineSingletons) {
            Profile profile2 = (Profile) obj;
            profile2.f19671t -= this.f28906d;
            this.f28903a = 3;
        }
        return coroutineSingletons;
    }
}
