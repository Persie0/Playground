package com.lingq.core.download;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl", m4291f = "AudioDownloadManager.kt", m4292l = {194, 197, 201}, m4293m = "handleDownloadError", m4294v = 2)
final class AudioDownloadManagerImpl$handleDownloadError$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public DownloadItem f20188a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20189b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1547b f20190c;

    /* JADX INFO: renamed from: d */
    public int f20191d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$handleDownloadError$1(C1547b c1547b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20190c = c1547b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20189b = obj;
        this.f20191d |= Integer.MIN_VALUE;
        return C1547b.m8230a(this.f20190c, null, this);
    }
}
