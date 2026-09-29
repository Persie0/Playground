package com.lingq.core.settings.domain;

import com.lingq.core.domain.model.theme.ReaderFont;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetReaderFontUseCase", m4291f = "SetReaderFontUseCase.kt", m4292l = {13, 15}, m4293m = "invoke", m4294v = 2)
final class SetReaderFontUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f22812a;

    /* JADX INFO: renamed from: b */
    public ReaderFont f22813b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f22814c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1867f f22815d;

    /* JADX INFO: renamed from: e */
    public int f22816e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetReaderFontUseCase$invoke$1(C1867f c1867f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22815d = c1867f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22814c = obj;
        this.f22816e |= Integer.MIN_VALUE;
        return this.f22815d.m8629b(null, null, this);
    }
}
