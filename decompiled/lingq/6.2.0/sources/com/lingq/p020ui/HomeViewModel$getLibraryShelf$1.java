package com.lingq.p020ui;

import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.ui.HomeViewModel", m4291f = "HomeViewModel.kt", m4292l = {232, 236, 244, 271, 273}, m4293m = "getLibraryShelf", m4294v = 2)
final class HomeViewModel$getLibraryShelf$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f33953a;

    /* JADX INFO: renamed from: b */
    public String f33954b;

    /* JADX INFO: renamed from: c */
    public LibraryShelf f33955c;

    /* JADX INFO: renamed from: d */
    public LibrarySearchQuery f33956d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f33957e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2888d f33958f;

    /* JADX INFO: renamed from: g */
    public int f33959g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeViewModel$getLibraryShelf$1(C2888d c2888d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33958f = c2888d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33957e = obj;
        this.f33959g |= Integer.MIN_VALUE;
        return this.f33958f.m9808W2(null, null, this);
    }
}
