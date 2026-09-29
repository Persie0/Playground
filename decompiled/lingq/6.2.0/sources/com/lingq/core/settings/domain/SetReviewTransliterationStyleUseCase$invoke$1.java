package com.lingq.core.settings.domain;

import com.lingq.core.domain.model.settings.ReviewSettingsKeys;
import com.lingq.core.settings.ViewKeys;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.SetReviewTransliterationStyleUseCase", m4291f = "SetReviewTransliterationStyleUseCase.kt", m4292l = {18, 20, 29}, m4293m = "invoke", m4294v = 2)
final class SetReviewTransliterationStyleUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ViewKeys f22823a;

    /* JADX INFO: renamed from: b */
    public String f22824b;

    /* JADX INFO: renamed from: c */
    public String f22825c;

    /* JADX INFO: renamed from: d */
    public ReviewSettingsKeys f22826d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22827e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1868g f22828f;

    /* JADX INFO: renamed from: g */
    public int f22829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetReviewTransliterationStyleUseCase$invoke$1(C1868g c1868g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22828f = c1868g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22827e = obj;
        this.f22829g |= Integer.MIN_VALUE;
        return this.f22828f.m8631a(null, null, null, this);
    }
}
