package com.lingq.feature.widget;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.widget.WidgetUpdateNotifierImpl", m4291f = "WidgetUpdateNotifierImpl.kt", m4292l = {DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER}, m4293m = "hasPinnedStreakWidget", m4294v = 2)
final class WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f33825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2864b f33826b;

    /* JADX INFO: renamed from: c */
    public int f33827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetUpdateNotifierImpl$hasPinnedStreakWidget$1(C2864b c2864b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f33826b = c2864b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f33825a = obj;
        this.f33827c |= Integer.MIN_VALUE;
        return C2864b.m9777a(this.f33826b, this);
    }
}
