package com.lingq.feature.widget.layout.network;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.widget.layout.network.PlaylistDataUpdateWorker", m4291f = "PlaylistDataUpdateWorker.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER}, m4293m = "doWork", m4294v = 2)
final class PlaylistDataUpdateWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33842a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ PlaylistDataUpdateWorker f33843b;

    /* JADX INFO: renamed from: c */
    public int f33844c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistDataUpdateWorker$doWork$1(PlaylistDataUpdateWorker playlistDataUpdateWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33843b = playlistDataUpdateWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33842a = obj;
        this.f33844c |= Integer.MIN_VALUE;
        return this.f33843b.mo2213d(this);
    }
}
