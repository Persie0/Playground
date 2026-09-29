package com.lingq.core.common;

import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3513qw;
import p000.ae1;
import p000.c83;
import p000.do7;
import p000.kk8;
import p000.m83;
import p000.nr2;
import p000.q02;
import p000.t83;
import p000.ui3;
import p000.vi3;
import p000.yz0;

/* JADX INFO: renamed from: com.lingq.core.common.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1261a {
    /* JADX INFO: renamed from: a */
    public static final C3211a m7042a() {
        return do7.m10525a(0, 6, null);
    }

    /* JADX INFO: renamed from: b */
    public static kk8 m7043b(ui3 ui3Var, vi3 vi3Var) {
        ae1 ae1Var = new ae1(22);
        c83 c83Var = (c83) ui3Var.mo0a();
        FlowExtensionsKt$dataFlow$2 flowExtensionsKt$dataFlow$2 = new FlowExtensionsKt$dataFlow$2(ae1Var, vi3Var, null);
        c83Var.getClass();
        return new kk8(new FlowExtensionsKt$withDataFetch$1(c83Var, nr2.f53163a, flowExtensionsKt$dataFlow$2, null));
    }

    /* JADX INFO: renamed from: c */
    public static t83 m7044c(ui3 ui3Var, vi3 vi3Var) {
        c83 c83Var = (c83) ui3Var.mo0a();
        c83Var.getClass();
        return new t83(new q02(), AbstractC3224d.m15547z(new C3513qw(c83Var, 6), new yz0(new m83(AbstractC3224d.m15528g(new FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$1(nr2.f53163a, vi3Var, null)), new FlowExtensionsKt$withDataFetchAndResults$refreshResultFlow$2(null)), 2)), new FlowExtensionsKt$withDataFetchAndResults$1());
    }
}
