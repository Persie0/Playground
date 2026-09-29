package com.lingq.shared.download;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$1$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {675}, m19208m = "emit")
public final class DownloadManagerDelegateImpl$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f17899d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DownloadManagerDelegateImpl.C33051.AnonymousClass1<T> f17900e;

    /* JADX INFO: renamed from: f */
    public int f17901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadManagerDelegateImpl$1$1$emit$1(DownloadManagerDelegateImpl.C33051.AnonymousClass1<? super T> anonymousClass1, InterfaceC9968c<? super DownloadManagerDelegateImpl$1$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f17900e = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to com.lingq.shared.download.DownloadManagerDelegateImpl$1$1$emit$1 for r2v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r3) {
        /*
            r2 = this;
            r2.f17899d = r3
            int r3 = r2.f17901f
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r1
            r3 = r3 | r0
            r2.f17901f = r3
            com.lingq.shared.download.DownloadManagerDelegateImpl$1$1<T> r3 = r2.f17900e
            r1 = 0
            r0 = r1
            java.lang.Object r1 = r3.mo1339r(r0, r2)
            r3 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.download.DownloadManagerDelegateImpl$1$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
