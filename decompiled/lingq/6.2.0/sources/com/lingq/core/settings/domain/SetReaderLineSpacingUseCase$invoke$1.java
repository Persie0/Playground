package com.lingq.core.settings.domain;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetReaderLineSpacingUseCase", m4291f = "SetReaderLineSpacingUseCase.kt", m4292l = {15, 24}, m4293m = "invoke", m4294v = 2)
final class SetReaderLineSpacingUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public int f22817a;

    /* JADX INFO: renamed from: b */
    public String f22818b;

    /* JADX INFO: renamed from: c */
    public List f22819c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f22820d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1867f f22821e;

    /* JADX INFO: renamed from: f */
    public int f22822f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetReaderLineSpacingUseCase$invoke$1(C1867f c1867f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22821e = c1867f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22820d = obj;
        this.f22822f |= Integer.MIN_VALUE;
        return this.f22821e.m8628a(0, null, this);
    }
}
