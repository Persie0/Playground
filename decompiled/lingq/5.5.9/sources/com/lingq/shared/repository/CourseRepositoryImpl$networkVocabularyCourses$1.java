package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CourseRepositoryImpl", m19206f = "CourseRepository.kt", m19207l = {109, 112}, m19208m = "networkVocabularyCourses")
public final class CourseRepositoryImpl$networkVocabularyCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f19609d;

    /* JADX INFO: renamed from: e */
    public String f19610e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f19611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CourseRepositoryImpl f19612g;

    /* JADX INFO: renamed from: h */
    public int f19613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseRepositoryImpl$networkVocabularyCourses$1(CourseRepositoryImpl courseRepositoryImpl, InterfaceC9968c<? super CourseRepositoryImpl$networkVocabularyCourses$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19612g = courseRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19611f = obj;
        this.f19613h |= Integer.MIN_VALUE;
        return this.f19612g.mo5993b(null, this);
    }
}
