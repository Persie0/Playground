package com.lingq.p055ui.home.course;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181ii.C6332a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lii/a;", "course", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "counter", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$isPremiumCourse$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class CourseViewModel$isPremiumCourse$1 extends SuspendLambda implements InterfaceC2057q<C6332a, LibraryItemCounter, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ C6332a f24102e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ LibraryItemCounter f24103f;

    public CourseViewModel$isPremiumCourse$1(InterfaceC9968c<? super CourseViewModel$isPremiumCourse$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(C6332a c6332a, LibraryItemCounter libraryItemCounter, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        CourseViewModel$isPremiumCourse$1 courseViewModel$isPremiumCourse$1 = new CourseViewModel$isPremiumCourse$1(interfaceC9968c);
        courseViewModel$isPremiumCourse$1.f24102e = c6332a;
        courseViewModel$isPremiumCourse$1.f24103f = libraryItemCounter;
        return courseViewModel$isPremiumCourse$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return Boolean.valueOf(this.f24102e.f36594U > 0 && !this.f24103f.f22016m);
    }
}
