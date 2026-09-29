package com.lingq.feature.review.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.domain.ReviewSettingsProvider", m4291f = "ReviewSettingsProvider.kt", m4292l = {21, 22, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, 24, 25, 26, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, 28}, m4293m = "activityAvailability", m4294v = 2)
final class ReviewSettingsProvider$activityAvailability$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public boolean f32423a;

    /* JADX INFO: renamed from: b */
    public boolean f32424b;

    /* JADX INFO: renamed from: c */
    public boolean f32425c;

    /* JADX INFO: renamed from: d */
    public boolean f32426d;

    /* JADX INFO: renamed from: e */
    public int f32427e;

    /* JADX INFO: renamed from: f */
    public int f32428f;

    /* JADX INFO: renamed from: g */
    public int f32429g;

    /* JADX INFO: renamed from: h */
    public int f32430h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f32431i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2755a f32432j;

    /* JADX INFO: renamed from: k */
    public int f32433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSettingsProvider$activityAvailability$1(C2755a c2755a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32432j = c2755a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32431i = obj;
        this.f32433k |= Integer.MIN_VALUE;
        return this.f32432j.m9594a(false, this);
    }
}
