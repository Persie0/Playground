package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1128, 1130}, m19208m = "updateSaveAllLessons")
final class LessonRepositoryImpl$updateSaveAllLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonRepositoryImpl f20047d;

    /* JADX INFO: renamed from: e */
    public String f20048e;

    /* JADX INFO: renamed from: f */
    public Iterator f20049f;

    /* JADX INFO: renamed from: g */
    public int f20050g;

    /* JADX INFO: renamed from: h */
    public boolean f20051h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20052i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LessonRepositoryImpl f20053j;

    /* JADX INFO: renamed from: k */
    public int f20054k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$updateSaveAllLessons$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$updateSaveAllLessons$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20053j = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20052i = obj;
        this.f20054k |= Integer.MIN_VALUE;
        return this.f20053j.mo9483E(0, 0, null, this, false);
    }
}
