package com.lingq.core.data.web2wave;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.nj0;
import p000.nn1;
import p000.o2b;
import p000.ob1;
import p000.ui3;

/* JADX INFO: renamed from: com.lingq.core.data.web2wave.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1312a {
    private static final o2b Companion = new o2b();

    /* JADX INFO: renamed from: a */
    public final nn1 f16587a;

    public C1312a(ob1 ob1Var, nn1 nn1Var) {
        ob1Var.getClass();
        this.f16587a = nn1Var;
        nj0.f52798Q = ob1Var.m17892f("web2wave_key");
    }

    /* JADX INFO: renamed from: a */
    public final Object m7431a(ui3 ui3Var, ContinuationImpl continuationImpl) {
        return AbstractC3208a.m15447n(10000L, new Web2WaveClient$request$2(this, ui3Var, null), continuationImpl);
    }
}
