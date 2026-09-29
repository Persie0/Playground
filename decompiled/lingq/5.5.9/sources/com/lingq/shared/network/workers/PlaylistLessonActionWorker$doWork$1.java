package com.lingq.shared.network.workers;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.network.workers.PlaylistLessonActionWorker", m19206f = "PlaylistLessonActionWorker.kt", m19207l = {35}, m19208m = "doWork")
public final class PlaylistLessonActionWorker$doWork$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f19322d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ PlaylistLessonActionWorker f19323e;

    /* JADX INFO: renamed from: f */
    public int f19324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistLessonActionWorker$doWork$1(PlaylistLessonActionWorker playlistLessonActionWorker, InterfaceC9968c<? super PlaylistLessonActionWorker$doWork$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19323e = playlistLessonActionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19322d = obj;
        this.f19324f |= Integer.MIN_VALUE;
        return this.f19323e.mo4698g(this);
    }
}
