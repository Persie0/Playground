package com.lingq.p055ui.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel", m19206f = "LessonViewModel.kt", m19207l = {1086, 1091, 1093, 1095, 1097, 1101, 1103}, m19208m = "setupBookmark")
final class LessonViewModel$setupBookmark$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public LessonViewModel f27744d;

    /* JADX INFO: renamed from: e */
    public LessonStudyBookmark f27745e;

    /* JADX INFO: renamed from: f */
    public String f27746f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f27747g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonViewModel f27748h;

    /* JADX INFO: renamed from: i */
    public int f27749i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$setupBookmark$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$setupBookmark$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f27748h = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f27747g = obj;
        this.f27749i |= Integer.MIN_VALUE;
        return LessonViewModel.m10132n2(this.f27748h, null, this);
    }
}
