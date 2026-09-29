package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.FastSearchResult;
import com.lingq.shared.network.result.ResultFastSearch;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl", m19206f = "SearchRepository.kt", m19207l = {216, 233, 272, 277, 289, 337}, m19208m = "networkFastSearch")
final class SearchRepositoryImpl$networkFastSearch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ Object f20497H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ SearchRepositoryImpl f20498I;

    /* JADX INFO: renamed from: J */
    public int f20499J;

    /* JADX INFO: renamed from: d */
    public Object f20500d;

    /* JADX INFO: renamed from: e */
    public Object f20501e;

    /* JADX INFO: renamed from: f */
    public Object f20502f;

    /* JADX INFO: renamed from: g */
    public ResultFastSearch f20503g;

    /* JADX INFO: renamed from: h */
    public List f20504h;

    /* JADX INFO: renamed from: i */
    public List f20505i;

    /* JADX INFO: renamed from: j */
    public List f20506j;

    /* JADX INFO: renamed from: k */
    public Iterator f20507k;

    /* JADX INFO: renamed from: l */
    public FastSearchResult f20508l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkFastSearch$1(SearchRepositoryImpl searchRepositoryImpl, InterfaceC9968c<? super SearchRepositoryImpl$networkFastSearch$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20498I = searchRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20497H = obj;
        this.f20499J |= Integer.MIN_VALUE;
        return this.f20498I.mo6158c(null, null, this);
    }
}
