package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl", m19206f = "SearchRepository.kt", m19207l = {346, 352}, m19208m = "networkLoadLessons")
public final class SearchRepositoryImpl$networkLoadLessons$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SearchRepositoryImpl f20534d;

    /* JADX INFO: renamed from: e */
    public String f20535e;

    /* JADX INFO: renamed from: f */
    public List f20536f;

    /* JADX INFO: renamed from: g */
    public Iterator f20537g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20538h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SearchRepositoryImpl f20539i;

    /* JADX INFO: renamed from: j */
    public int f20540j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLessons$1(SearchRepositoryImpl searchRepositoryImpl, InterfaceC9968c<? super SearchRepositoryImpl$networkLoadLessons$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20539i = searchRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20538h = obj;
        this.f20540j |= Integer.MIN_VALUE;
        return this.f20539i.mo6161f(null, null, this);
    }
}
