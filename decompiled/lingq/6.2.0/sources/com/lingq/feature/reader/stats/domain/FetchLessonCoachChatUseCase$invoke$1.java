package com.lingq.feature.reader.stats.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.domain.FetchLessonCoachChatUseCase", m4291f = "FetchLessonCoachChatUseCase.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 55, 57, 59, 62, 63, 64}, m4293m = "invoke", m4294v = 2)
final class FetchLessonCoachChatUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public String f30739a;

    /* JADX INFO: renamed from: b */
    public String f30740b;

    /* JADX INFO: renamed from: c */
    public vi3 f30741c;

    /* JADX INFO: renamed from: d */
    public Ref$IntRef f30742d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f30743e;

    /* JADX INFO: renamed from: f */
    public Ref$BooleanRef f30744f;

    /* JADX INFO: renamed from: g */
    public int f30745g;

    /* JADX INFO: renamed from: h */
    public int f30746h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f30747i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2529a f30748j;

    /* JADX INFO: renamed from: k */
    public int f30749k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchLessonCoachChatUseCase$invoke$1(C2529a c2529a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f30748j = c2529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f30747i = obj;
        this.f30749k |= Integer.MIN_VALUE;
        return this.f30748j.m9459a(null, null, 0, null, null, this);
    }
}
