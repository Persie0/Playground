package com.lingq.feature.review.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.eda;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 46, 47, eda.f37086g, 49}, m4293m = "flashcardFrontSettings", m4294v = 2)
final class ReviewSettingsProvider$flashcardFrontSettings$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32442a;

    /* JADX INFO: renamed from: b */
    public boolean f32443b;

    /* JADX INFO: renamed from: c */
    public boolean f32444c;

    /* JADX INFO: renamed from: d */
    public boolean f32445d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f32446e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2755a f32447f;

    /* JADX INFO: renamed from: g */
    public int f32448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$flashcardFrontSettings$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32447f = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32446e = obj;
        this.f32448g |= Integer.MIN_VALUE;
        return this.f32447f.m9596c(this);
    }
}
