package com.lingq.shared.download;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.download.DownloadManagerDelegateImpl$2$1", m19206f = "DownloadManagerDelegate.kt", m19207l = {675}, m19208m = "emit")
public final class DownloadManagerDelegateImpl$2$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DownloadManagerDelegateImpl.C33062.AnonymousClass1 f17915d;

    /* JADX INFO: renamed from: e */
    public SentenceDownloadItem f17916e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f17917f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DownloadManagerDelegateImpl.C33062.AnonymousClass1<T> f17918g;

    /* JADX INFO: renamed from: h */
    public int f17919h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DownloadManagerDelegateImpl$2$1$emit$1(DownloadManagerDelegateImpl.C33062.AnonymousClass1<? super T> anonymousClass1, InterfaceC9968c<? super DownloadManagerDelegateImpl$2$1$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f17918g = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type wl.c to com.lingq.shared.download.DownloadManagerDelegateImpl$2$1$emit$1 for r5v1 'this'  wl.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r6) {
        /*
            r5 = this;
            r1 = r5
            r1.f17917f = r6
            int r6 = r1.f17919h
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3
            r6 = r6 | r0
            r3 = 1
            r1.f17919h = r6
            com.lingq.shared.download.DownloadManagerDelegateImpl$2$1<T> r6 = r1.f17918g
            r3 = 0
            r0 = r3
            java.lang.Object r3 = r6.mo1339r(r0, r1)
            r6 = r3
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.download.DownloadManagerDelegateImpl$2$1$emit$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
