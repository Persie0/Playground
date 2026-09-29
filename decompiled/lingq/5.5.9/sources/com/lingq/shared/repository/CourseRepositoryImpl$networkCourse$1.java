package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl", m19206f = "CourseRepository.kt", m19207l = {66, 69}, m19208m = "networkCourse")
final class CourseRepositoryImpl$networkCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19605d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f19606e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseRepositoryImpl f19607f;

    /* JADX INFO: renamed from: g */
    public int f19608g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$networkCourse$1(CourseRepositoryImpl courseRepositoryImpl, InterfaceC9968c<? super CourseRepositoryImpl$networkCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19607f = courseRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19606e = obj;
        this.f19608g |= Integer.MIN_VALUE;
        return this.f19607f.mo5992a(0, null, this);
    }
}
