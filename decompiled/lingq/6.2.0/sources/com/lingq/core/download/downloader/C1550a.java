package com.lingq.core.download.downloader;

import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.ae1;
import p000.cr6;
import p000.dr6;
import p000.kcb;
import p000.ke2;
import p000.ph2;
import p000.t62;
import p000.v72;
import p000.vi3;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.core.download.downloader.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1550a {

    /* JADX INFO: renamed from: a */
    public final dr6 f20238a;

    public C1550a() {
        cr6 cr6Var = new cr6();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        kcb.m15111b();
        cr6Var.f34430u = 60000;
        timeUnit.getClass();
        kcb.m15111b();
        cr6Var.f34429t = 60000;
        this.f20238a = new dr6(cr6Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m8238b(C1550a c1550a, String str, File file, ke2 ke2Var, ContinuationImpl continuationImpl, int i) {
        vi3 ae1Var = ke2Var;
        if ((i & 8) != 0) {
            ae1Var = new ae1(21);
        }
        return c1550a.m8239a(str, file, null, ae1Var, continuationImpl);
    }

    /* JADX INFO: renamed from: a */
    public final Object m8239a(String str, File file, String str2, vi3 vi3Var, ContinuationImpl continuationImpl) {
        v72 v72Var = ph2.f56212a;
        return wfb.m23905G(new FileDownloader$download$3(str, this, file, vi3Var, str2, null), t62.f61909c, continuationImpl);
    }
}
