package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {140, 141, 142}, m19208m = "updateLibraryShelves")
final class LibraryRepositoryImpl$updateLibraryShelves$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryRepositoryImpl f20125d;

    /* JADX INFO: renamed from: e */
    public String f20126e;

    /* JADX INFO: renamed from: f */
    public Object f20127f;

    /* JADX INFO: renamed from: g */
    public Object f20128g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20129h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LibraryRepositoryImpl f20130i;

    /* JADX INFO: renamed from: j */
    public int f20131j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryShelves$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$updateLibraryShelves$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20130i = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20129h = obj;
        this.f20131j |= Integer.MIN_VALUE;
        return this.f20130i.mo6070p(null, null, this);
    }
}
