package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {190, 197, 220, 241}, m19208m = "updateLibraryItems")
public final class LibraryRepositoryImpl$updateLibraryItems$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: H */
    public int f20107H;

    /* JADX INFO: renamed from: d */
    public Object f20108d;

    /* JADX INFO: renamed from: e */
    public String f20109e;

    /* JADX INFO: renamed from: f */
    public String f20110f;

    /* JADX INFO: renamed from: g */
    public String f20111g;

    /* JADX INFO: renamed from: h */
    public String f20112h;

    /* JADX INFO: renamed from: i */
    public String f20113i;

    /* JADX INFO: renamed from: j */
    public int f20114j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f20115k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ LibraryRepositoryImpl f20116l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$updateLibraryItems$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$updateLibraryItems$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20116l = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20115k = obj;
        this.f20107H |= Integer.MIN_VALUE;
        return this.f20116l.mo6064j(null, null, null, false, null, null, null, 0, this);
    }
}
