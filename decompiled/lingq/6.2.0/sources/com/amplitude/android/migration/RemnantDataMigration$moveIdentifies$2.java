package com.amplitude.android.migration;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.u02;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RemnantDataMigration$moveIdentifies$2 extends FunctionReferenceImpl implements vi3 {
    public RemnantDataMigration$moveIdentifies$2(u02 u02Var) {
        super(1, u02Var, u02.class, "removeIdentify", "removeIdentify(J)V", 0);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long jLongValue = ((Number) obj).longValue();
        u02 u02Var = (u02) this.f47704b;
        synchronized (u02Var) {
            u02Var.m22371q("identifys", jLongValue);
        }
        return xfa.f68157a;
    }
}
