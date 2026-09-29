package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$onPlayAudio$1$1", m19206f = "LessonViewModel.kt", m19207l = {1115}, m19208m = "invokeSuspend")
final class LessonViewModel$onPlayAudio$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27718e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27719f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f27720g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$onPlayAudio$1$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$onPlayAudio$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27719f = lessonViewModel;
        this.f27720g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$onPlayAudio$1$1(this.f27719f, this.f27720g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$onPlayAudio$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27718e;
        int i11 = this.f27720g;
        LessonViewModel lessonViewModel = this.f27719f;
        boolean z10 = true;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f27718e = 1;
            obj = LessonViewModel.m10131m2(lessonViewModel, i11, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            lessonViewModel.f27463c1.mo14371k(new Integer(i11));
        } else {
            LessonStudy lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
            if (lessonStudy != null) {
                String str = lessonStudy.f21820f;
                if (str == null) {
                    z10 = false;
                } else {
                    if (!(str.length() > 0)) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    str = "";
                }
                if (str == null) {
                    str = "";
                }
                if (C5207g.m11106a(str, "")) {
                    lessonViewModel.f27410K1.mo14371k(C9072e.f47360a);
                } else {
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(lessonViewModel);
                    StringBuilder sb2 = new StringBuilder("download ");
                    int i12 = lessonStudy.f21815a;
                    sb2.append(i12);
                    C7499b.m14935d0(interfaceC7882zM16767w0, lessonViewModel.f27426Q, sb2.toString(), new LessonViewModel$downloadTrack$1(lessonViewModel, i12, str, null));
                }
            }
        }
        return C9072e.f47360a;
    }
}
