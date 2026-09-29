package com.lingq.feature.reader.milestones.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.language.LanguageStudyStats;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.eda;
import p000.go3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.milestones.domain.RouteGoalMetUseCase", m4291f = "RouteGoalMetUseCase.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 46, eda.f37086g, 49, 93}, m4293m = "invoke", m4294v = 2)
final class RouteGoalMetUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public go3 f28180a;

    /* JADX INFO: renamed from: b */
    public DailyGoalMet f28181b;

    /* JADX INFO: renamed from: c */
    public LanguageStudyStats f28182c;

    /* JADX INFO: renamed from: d */
    public String f28183d;

    /* JADX INFO: renamed from: e */
    public boolean f28184e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f28185f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2270b f28186g;

    /* JADX INFO: renamed from: h */
    public int f28187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteGoalMetUseCase$invoke$1(C2270b c2270b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f28186g = c2270b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f28185f = obj;
        this.f28187h |= Integer.MIN_VALUE;
        return this.f28186g.m9281a(null, this);
    }
}
