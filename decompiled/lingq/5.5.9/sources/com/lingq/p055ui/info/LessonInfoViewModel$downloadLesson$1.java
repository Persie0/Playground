package com.lingq.p055ui.info;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.download.DownloadItem;
import com.lingq.shared.uimodel.library.LessonInfo;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$downloadLesson$1", m19206f = "LessonInfoViewModel.kt", m19207l = {343, 346, 351}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$downloadLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f26961e;

    /* JADX INFO: renamed from: f */
    public int f26962f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonInfoViewModel f26963g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonInfo f26964h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$downloadLesson$1(LessonInfoViewModel lessonInfoViewModel, LessonInfo lessonInfo, InterfaceC9968c<? super LessonInfoViewModel$downloadLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26963g = lessonInfoViewModel;
        this.f26964h = lessonInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$downloadLesson$1(this.f26963g, this.f26964h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$downloadLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26962f;
        LessonInfoViewModel lessonInfoViewModel = this.f26963g;
        LessonInfo lessonInfo = this.f26964h;
        boolean z11 = true;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                str = this.f26961e;
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        lessonInfoViewModel.f26924L.setValue(Boolean.TRUE);
        String str2 = lessonInfo.f21968e;
        if (str2 == null) {
            z10 = false;
        } else {
            if (str2.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        str = "";
        String str3 = z10 ? lessonInfo.f21968e : str;
        if (str3 != null) {
            str = str3;
        }
        String strMo498E1 = lessonInfoViewModel.mo498E1();
        this.f26961e = str;
        this.f26962f = 1;
        if (lessonInfoViewModel.f26942d.mo9511d(lessonInfo.f21964a, strMo498E1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (str.length() != 0) {
            z11 = false;
        }
        if (!z11) {
            DownloadItem downloadItem = new DownloadItem(lessonInfoViewModel.mo498E1(), lessonInfo.f21964a, str, false);
            this.f26961e = null;
            this.f26962f = 3;
            if (lessonInfoViewModel.mo9405S1(downloadItem, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (lessonInfo.f21963N == null) {
            DownloadItem downloadItem2 = new DownloadItem(lessonInfoViewModel.mo498E1(), lessonInfo.f21964a, str, false);
            this.f26961e = null;
            this.f26962f = 2;
            if (lessonInfoViewModel.mo9422x0(downloadItem2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
