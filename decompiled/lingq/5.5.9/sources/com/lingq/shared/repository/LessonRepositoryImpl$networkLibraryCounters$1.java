package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {474, 478}, m19208m = "networkLibraryCounters")
public final class LessonRepositoryImpl$networkLibraryCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f19892d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19893e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonRepositoryImpl f19894f;

    /* JADX INFO: renamed from: g */
    public int f19895g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkLibraryCounters$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkLibraryCounters$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19894f = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19893e = obj;
        this.f19895g |= Integer.MIN_VALUE;
        return this.f19894f.m9514e0(null, null, this);
    }
}
