package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl", m19206f = "CourseRepository.kt", m19207l = {129, 134, 139}, m19208m = "updateCourseLike")
public final class CourseRepositoryImpl$updateCourseLike$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public CourseRepositoryImpl f19619d;

    /* JADX INFO: renamed from: e */
    public String f19620e;

    /* JADX INFO: renamed from: f */
    public int f19621f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19622g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ CourseRepositoryImpl f19623h;

    /* JADX INFO: renamed from: i */
    public int f19624i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$updateCourseLike$1(CourseRepositoryImpl courseRepositoryImpl, InterfaceC9968c<? super CourseRepositoryImpl$updateCourseLike$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19623h = courseRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19622g = obj;
        this.f19624i |= Integer.MIN_VALUE;
        return this.f19623h.mo5995d(0, null, this);
    }
}
