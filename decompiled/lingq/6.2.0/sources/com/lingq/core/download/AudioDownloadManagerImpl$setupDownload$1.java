package com.lingq.core.download;

import com.lingq.core.domain.model.audio.DownloadItem;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl", m4291f = "AudioDownloadManager.kt", m4292l = {50, 61, 69, 81}, m4293m = "setupDownload", m4294v = 2)
final class AudioDownloadManagerImpl$setupDownload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public DownloadItem f20192a;

    /* JADX INFO: renamed from: b */
    public File f20193b;

    /* JADX INFO: renamed from: c */
    public int f20194c;

    /* JADX INFO: renamed from: d */
    public int f20195d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20196e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1547b f20197f;

    /* JADX INFO: renamed from: g */
    public int f20198g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$setupDownload$1(C1547b c1547b, Continuation continuation) {
        super(continuation);
        this.f20197f = c1547b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20196e = obj;
        this.f20198g |= Integer.MIN_VALUE;
        return this.f20197f.mo8234r(null, this);
    }
}
