package com.lingq.core.download;

import com.lingq.core.domain.model.theme.ReaderFont;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.download.FontDownloadManagerImpl$1$1", m4291f = "FontDownloadManager.kt", m4292l = {62, 66}, m4293m = "emit", m4294v = 2)
final class FontDownloadManagerImpl$1$1$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ReaderFont f20209a;

    /* JADX INFO: renamed from: b */
    public String f20210b;

    /* JADX INFO: renamed from: c */
    public File f20211c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20212d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1548c f20213e;

    /* JADX INFO: renamed from: f */
    public int f20214f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontDownloadManagerImpl$1$1$emit$1(C1548c c1548c, Continuation continuation) {
        super(continuation);
        this.f20213e = c1548c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f20212d = obj;
        this.f20214f |= Integer.MIN_VALUE;
        return this.f20213e.emit(null, this);
    }
}
