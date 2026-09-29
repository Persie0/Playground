package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.DictionaryData;
import com.lingq.shared.persistent.dao.DictionaryDao;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.DictionaryRepositoryImpl", m19206f = "DictionaryRepository.kt", m19207l = {143, 148, 153, 149, 159, 168, 185, 188}, m19208m = "storeDictionaries")
public final class DictionaryRepositoryImpl$storeDictionaries$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public DictionaryDao f19667H;

    /* JADX INFO: renamed from: I */
    public Collection f19668I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f19669J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ DictionaryRepositoryImpl f19670K;

    /* JADX INFO: renamed from: L */
    public int f19671L;

    /* JADX INFO: renamed from: d */
    public DictionaryRepositoryImpl f19672d;

    /* JADX INFO: renamed from: e */
    public String f19673e;

    /* JADX INFO: renamed from: f */
    public Object f19674f;

    /* JADX INFO: renamed from: g */
    public Object f19675g;

    /* JADX INFO: renamed from: h */
    public Object f19676h;

    /* JADX INFO: renamed from: i */
    public Object f19677i;

    /* JADX INFO: renamed from: j */
    public Object f19678j;

    /* JADX INFO: renamed from: k */
    public Object f19679k;

    /* JADX INFO: renamed from: l */
    public DictionaryData f19680l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryRepositoryImpl$storeDictionaries$1(DictionaryRepositoryImpl dictionaryRepositoryImpl, InterfaceC9968c<? super DictionaryRepositoryImpl$storeDictionaries$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19670K = dictionaryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19669J = obj;
        this.f19671L |= Integer.MIN_VALUE;
        return this.f19670K.m9476o(null, null, this);
    }
}
