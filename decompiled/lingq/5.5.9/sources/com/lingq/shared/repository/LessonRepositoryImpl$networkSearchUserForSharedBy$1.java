package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl", m19206f = "LessonRepository.kt", m19207l = {1052, 1066, 1067}, m19208m = "networkSearchUserForSharedBy")
public final class LessonRepositoryImpl$networkSearchUserForSharedBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19902d;

    /* JADX INFO: renamed from: e */
    public Object f19903e;

    /* JADX INFO: renamed from: f */
    public Serializable f19904f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19905g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonRepositoryImpl f19906h;

    /* JADX INFO: renamed from: i */
    public int f19907i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$networkSearchUserForSharedBy$1(LessonRepositoryImpl lessonRepositoryImpl, InterfaceC9968c<? super LessonRepositoryImpl$networkSearchUserForSharedBy$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19906h = lessonRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19905g = obj;
        this.f19907i |= Integer.MIN_VALUE;
        return this.f19906h.mo9519h(null, null, this);
    }
}
