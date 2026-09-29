package com.lingq.p055ui.home.library;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$4", m19206f = "LessonPreviewViewModel.kt", m19207l = {63, 65, 78, 81}, m19208m = "emit")
public final class LessonPreviewViewModel$importLesson$1$4$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public Object f24594d;

    /* JADX INFO: renamed from: e */
    public LessonPreviewViewModel f24595e;

    /* JADX INFO: renamed from: f */
    public LessonStudy f24596f;

    /* JADX INFO: renamed from: g */
    public int f24597g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f24598h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ LessonPreviewViewModel$importLesson$1.C37544 f24599i;

    /* JADX INFO: renamed from: j */
    public int f24600j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewViewModel$importLesson$1$4$emit$1(LessonPreviewViewModel$importLesson$1.C37544 c37544, InterfaceC9968c<? super LessonPreviewViewModel$importLesson$1$4$emit$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f24599i = c37544;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f24598h = obj;
        this.f24600j |= Integer.MIN_VALUE;
        return this.f24599i.mo1339r(null, this);
    }
}
