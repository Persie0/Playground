package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1170, 1171}, m19208m = "updateSaveRemove")
final class LessonRepositoryImpl$updateSaveRemove$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20055d;

    /* JADX INFO: renamed from: e */
    public String f20056e;

    /* JADX INFO: renamed from: f */
    public int f20057f;

    /* JADX INFO: renamed from: g */
    public int f20058g;

    /* JADX INFO: renamed from: h */
    public boolean f20059h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20060i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LessonRepositoryImpl f20061j;

    /* JADX INFO: renamed from: k */
    public int f20062k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateSaveRemove$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateSaveRemove$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20061j = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20060i = obj;
        this.f20062k |= Integer.MIN_VALUE;
        return this.f20061j.mo9490L(0, 0, null, this, false);
    }
}
