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
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl", m19206f = "SearchRepository.kt", m19207l = {361, 367}, m19208m = "networkLoadCourses")
public final class SearchRepositoryImpl$networkLoadCourses$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public SearchRepositoryImpl f20514d;

    /* JADX INFO: renamed from: e */
    public String f20515e;

    /* JADX INFO: renamed from: f */
    public List f20516f;

    /* JADX INFO: renamed from: g */
    public Iterator f20517g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20518h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SearchRepositoryImpl f20519i;

    /* JADX INFO: renamed from: j */
    public int f20520j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadCourses$1(SearchRepositoryImpl searchRepositoryImpl, InterfaceC9968c<? super SearchRepositoryImpl$networkLoadCourses$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20519i = searchRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20518h = obj;
        this.f20520j |= Integer.MIN_VALUE;
        return this.f20519i.mo6162g(null, null, this);
    }
}
