package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl", m19206f = "SearchRepository.kt", m19207l = {197, 200}, m19208m = "networkCourse")
final class SearchRepositoryImpl$networkCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SearchRepositoryImpl f20489d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20490e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SearchRepositoryImpl f20491f;

    /* JADX INFO: renamed from: g */
    public int f20492g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkCourse$1(SearchRepositoryImpl searchRepositoryImpl, InterfaceC9968c<? super SearchRepositoryImpl$networkCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20491f = searchRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20490e = obj;
        this.f20492g |= Integer.MIN_VALUE;
        return this.f20491f.m9545h(0, null, this);
    }
}
