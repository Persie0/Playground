package com.lingq.shared.repository;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LibraryRepositoryImpl", m19206f = "LibraryRepository.kt", m19207l = {287, 289, 296}, m19208m = "networkLessonCounters")
public final class LibraryRepositoryImpl$networkLessonCounters$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LibraryRepositoryImpl f20099d;

    /* JADX INFO: renamed from: e */
    public Collection f20100e;

    /* JADX INFO: renamed from: f */
    public Iterator f20101f;

    /* JADX INFO: renamed from: g */
    public Map.Entry f20102g;

    /* JADX INFO: renamed from: h */
    public Collection f20103h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f20104i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LibraryRepositoryImpl f20105j;

    /* JADX INFO: renamed from: k */
    public int f20106k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryRepositoryImpl$networkLessonCounters$1(LibraryRepositoryImpl libraryRepositoryImpl, InterfaceC9968c<? super LibraryRepositoryImpl$networkLessonCounters$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f20105j = libraryRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f20104i = obj;
        this.f20106k |= Integer.MIN_VALUE;
        return this.f20105j.mo6061g(null, null, this);
    }
}
