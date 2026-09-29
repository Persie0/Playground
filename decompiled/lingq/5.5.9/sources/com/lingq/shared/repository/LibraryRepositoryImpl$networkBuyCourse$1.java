package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {430}, m19208m = "networkBuyCourse")
public final class LibraryRepositoryImpl$networkBuyCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f20079d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LibraryRepositoryImpl f20080e;

    /* JADX INFO: renamed from: f */
    public int f20081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$networkBuyCourse$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$networkBuyCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20080e = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20079d = obj;
        this.f20081f |= Integer.MIN_VALUE;
        return this.f20080e.m9540v(0, null, this);
    }
}
