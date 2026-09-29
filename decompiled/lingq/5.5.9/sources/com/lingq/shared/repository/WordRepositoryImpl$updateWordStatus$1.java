package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.WordRepositoryImpl", m19206f = "WordRepository.kt", m19207l = {158, 196}, m19208m = "updateWordStatus")
public final class WordRepositoryImpl$updateWordStatus$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20698d;

    /* JADX INFO: renamed from: e */
    public String f20699e;

    /* JADX INFO: renamed from: f */
    public String f20700f;

    /* JADX INFO: renamed from: g */
    public String f20701g;

    /* JADX INFO: renamed from: h */
    public int f20702h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20703i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ WordRepositoryImpl f20704j;

    /* JADX INFO: renamed from: k */
    public int f20705k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WordRepositoryImpl$updateWordStatus$1(WordRepositoryImpl wordRepositoryImpl, InterfaceC9968c<? super WordRepositoryImpl$updateWordStatus$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20704j = wordRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20703i = obj;
        this.f20705k |= Integer.MIN_VALUE;
        return this.f20704j.mo6192b(null, 0, null, null, null, this);
    }
}
