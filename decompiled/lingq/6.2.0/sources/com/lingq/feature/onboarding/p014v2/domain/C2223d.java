package com.lingq.feature.onboarding.p014v2.domain;

import com.lingq.core.settings.theme.C1882b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.n83;
import p000.nz9;
import p000.qm3;
import p000.vz5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.domain.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2223d {

    /* JADX INFO: renamed from: a */
    public final qm3 f27471a;

    /* JADX INFO: renamed from: b */
    public final C1882b f27472b;

    public C2223d(qm3 qm3Var, C1882b c1882b) {
        this.f27471a = qm3Var;
        this.f27472b = c1882b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9172a(String str, ContinuationImpl continuationImpl) throws Throwable {
        PraktikaLongCoordinator$loadReaderStyle$1 praktikaLongCoordinator$loadReaderStyle$1;
        if (continuationImpl instanceof PraktikaLongCoordinator$loadReaderStyle$1) {
            praktikaLongCoordinator$loadReaderStyle$1 = (PraktikaLongCoordinator$loadReaderStyle$1) continuationImpl;
            int i = praktikaLongCoordinator$loadReaderStyle$1.f27428c;
            if ((i & Integer.MIN_VALUE) != 0) {
                praktikaLongCoordinator$loadReaderStyle$1.f27428c = i - Integer.MIN_VALUE;
            } else {
                praktikaLongCoordinator$loadReaderStyle$1 = new PraktikaLongCoordinator$loadReaderStyle$1(this, continuationImpl);
            }
        } else {
            praktikaLongCoordinator$loadReaderStyle$1 = new PraktikaLongCoordinator$loadReaderStyle$1(this, continuationImpl);
        }
        Object objM15541t = praktikaLongCoordinator$loadReaderStyle$1.f27426a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = praktikaLongCoordinator$loadReaderStyle$1.f27428c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            str.getClass();
            n83 n83VarM8683a = this.f27472b.m8683a(str, false);
            praktikaLongCoordinator$loadReaderStyle$1.f27428c = 1;
            objM15541t = AbstractC3224d.m15541t(n83VarM8683a, praktikaLongCoordinator$loadReaderStyle$1);
            if (objM15541t == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        nz9 nz9Var = (nz9) objM15541t;
        return new vz5(nz9Var.m17708a(), nz9Var.m17709b(), nz9Var.m17711d(), nz9Var.m17710c());
    }
}
