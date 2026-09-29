package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {303, 307}, m19208m = "networkCourseCounters")
public final class LibraryRepositoryImpl$networkCourseCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryRepositoryImpl f20082d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f20083e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryRepositoryImpl f20084f;

    /* JADX INFO: renamed from: g */
    public int f20085g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$networkCourseCounters$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$networkCourseCounters$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20084f = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20083e = obj;
        this.f20085g |= Integer.MIN_VALUE;
        return this.f20084f.mo6059e(null, null, this);
    }
}
