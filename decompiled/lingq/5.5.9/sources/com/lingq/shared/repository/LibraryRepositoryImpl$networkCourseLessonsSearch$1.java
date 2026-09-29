package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {321, 328}, m19208m = "networkCourseLessonsSearch")
public final class LibraryRepositoryImpl$networkCourseLessonsSearch$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f20086d;

    /* JADX INFO: renamed from: e */
    public int f20087e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f20088f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryRepositoryImpl f20089g;

    /* JADX INFO: renamed from: h */
    public int f20090h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$networkCourseLessonsSearch$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$networkCourseLessonsSearch$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20089g = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20088f = obj;
        this.f20090h |= Integer.MIN_VALUE;
        return this.f20089g.mo6071q(null, 0, null, null, this);
    }
}
