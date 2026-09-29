package com.lingq.p055ui.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel", m19206f = "LessonViewModel.kt", m19207l = {1609}, m19208m = "isLessonDownloaded")
final class LessonViewModel$isLessonDownloaded$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f27690d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonViewModel f27691e;

    /* JADX INFO: renamed from: f */
    public int f27692f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$isLessonDownloaded$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$isLessonDownloaded$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f27691e = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f27690d = obj;
        this.f27692f |= Integer.MIN_VALUE;
        return LessonViewModel.m10131m2(this.f27691e, 0, this);
    }
}
