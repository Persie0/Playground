package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl", m19206f = "SearchRepository.kt", m19207l = {141, 143}, m19208m = "networkLoadLesson")
final class SearchRepositoryImpl$networkLoadLesson$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SearchRepositoryImpl f20521d;

    /* JADX INFO: renamed from: e */
    public String f20522e;

    /* JADX INFO: renamed from: f */
    public int f20523f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20524g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SearchRepositoryImpl f20525h;

    /* JADX INFO: renamed from: i */
    public int f20526i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLesson$1(SearchRepositoryImpl searchRepositoryImpl, InterfaceC9968c<? super SearchRepositoryImpl$networkLoadLesson$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20525h = searchRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20524g = obj;
        this.f20526i |= Integer.MIN_VALUE;
        return this.f20525h.m9548k(0, null, this);
    }
}
