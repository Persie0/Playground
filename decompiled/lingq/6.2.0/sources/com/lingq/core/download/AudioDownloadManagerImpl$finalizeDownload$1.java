package com.lingq.core.download;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.AudioDownloadManagerImpl", m4291f = "AudioDownloadManager.kt", m4292l = {180, 188}, m4293m = "finalizeDownload", m4294v = 2)
final class AudioDownloadManagerImpl$finalizeDownload$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public DownloadItem f20184a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20185b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1547b f20186c;

    /* JADX INFO: renamed from: d */
    public int f20187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioDownloadManagerImpl$finalizeDownload$1(C1547b c1547b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f20186c = c1547b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20185b = obj;
        this.f20187d |= Integer.MIN_VALUE;
        return this.f20186c.m8232b(null, null, null, this);
    }
}
