package com.lingq.feature.imports;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ika;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel", m4291f = "UserImportViewModel.kt", m4292l = {468, 469, 470, 471}, m4293m = "saveImportPreferences", m4294v = 2)
final class UserImportViewModel$saveImportPreferences$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ika f26135a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f26136b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2109f f26137c;

    /* JADX INFO: renamed from: d */
    public int f26138d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$saveImportPreferences$1(C2109f c2109f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f26137c = c2109f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f26136b = obj;
        this.f26138d |= Integer.MIN_VALUE;
        return C2109f.m9015V2(this.f26137c, null, this);
    }
}
