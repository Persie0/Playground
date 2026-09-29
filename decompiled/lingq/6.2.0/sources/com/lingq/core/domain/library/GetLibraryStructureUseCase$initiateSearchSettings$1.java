package com.lingq.core.domain.library;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryStructureUseCase", m4291f = "GetLibraryStructureUseCase.kt", m4292l = {53, 70}, m4293m = "initiateSearchSettings", m4294v = 2)
final class GetLibraryStructureUseCase$initiateSearchSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f18763a;

    /* JADX INFO: renamed from: b */
    public String f18764b;

    /* JADX INFO: renamed from: c */
    public Set f18765c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f18766d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1389d f18767e;

    /* JADX INFO: renamed from: f */
    public int f18768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryStructureUseCase$initiateSearchSettings$1(C1389d c1389d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f18767e = c1389d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f18766d = obj;
        this.f18768f |= Integer.MIN_VALUE;
        return C1389d.m8005a(this.f18767e, null, null, null, this);
    }
}
