package com.lingq.shared.persistent.dao;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.persistent.dao.DictionaryDao", m19206f = "DictionaryDao.kt", m19207l = {103, 104}, m19208m = "removeActiveDictionary$suspendImpl")
public final class DictionaryDao$removeActiveDictionary$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public DictionaryDao f19369d;

    /* JADX INFO: renamed from: e */
    public String f19370e;

    /* JADX INFO: renamed from: f */
    public int f19371f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f19372g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ DictionaryDao f19373h;

    /* JADX INFO: renamed from: i */
    public int f19374i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryDao$removeActiveDictionary$1(DictionaryDao dictionaryDao, InterfaceC9968c<? super DictionaryDao$removeActiveDictionary$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f19373h = dictionaryDao;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f19372g = obj;
        this.f19374i |= Integer.MIN_VALUE;
        return DictionaryDao.m9472u0(this.f19373h, 0, null, this);
    }
}
