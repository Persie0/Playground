package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {412, 414, 418, 420, 421, 422}, m19208m = "buyCourse")
public final class LibraryRepositoryImpl$buyCourse$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryRepositoryImpl f20068d;

    /* JADX INFO: renamed from: e */
    public ArrayList f20069e;

    /* JADX INFO: renamed from: f */
    public int f20070f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f20071g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibraryRepositoryImpl f20072h;

    /* JADX INFO: renamed from: i */
    public int f20073i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$buyCourse$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$buyCourse$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20072h = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20071g = obj;
        this.f20073i |= Integer.MIN_VALUE;
        return this.f20072h.mo6060f(0, null, this);
    }
}
