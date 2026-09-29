package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl", m19206f = "CourseRepository.kt", m19207l = {80, 82, 101}, m19208m = "loadMyCourses")
public final class CourseRepositoryImpl$loadMyCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19596d;

    /* JADX INFO: renamed from: e */
    public String f19597e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19598f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CourseRepositoryImpl f19599g;

    /* JADX INFO: renamed from: h */
    public int f19600h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$loadMyCourses$1(CourseRepositoryImpl courseRepositoryImpl, InterfaceC9968c<? super CourseRepositoryImpl$loadMyCourses$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19599g = courseRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19598f = obj;
        this.f19600h |= Integer.MIN_VALUE;
        return this.f19599g.mo5996e(null, this);
    }
}
