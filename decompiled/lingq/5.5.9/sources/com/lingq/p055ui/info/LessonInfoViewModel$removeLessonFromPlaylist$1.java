package com.lingq.p055ui.info;

import ci.InterfaceC2019l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$removeLessonFromPlaylist$1", m19206f = "LessonInfoViewModel.kt", m19207l = {144}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$removeLessonFromPlaylist$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27024e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f27025f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27026g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$removeLessonFromPlaylist$1(LessonInfoViewModel lessonInfoViewModel, String str, InterfaceC9968c<? super LessonInfoViewModel$removeLessonFromPlaylist$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27025f = lessonInfoViewModel;
        this.f27026g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$removeLessonFromPlaylist$1(this.f27025f, this.f27026g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$removeLessonFromPlaylist$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27024e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonInfoViewModel lessonInfoViewModel = this.f27025f;
            InterfaceC2019l interfaceC2019l = lessonInfoViewModel.f26946f;
            String strMo498E1 = lessonInfoViewModel.mo498E1();
            int i11 = lessonInfoViewModel.f26921I.f35086a;
            this.f27024e = 1;
            if (interfaceC2019l.mo6128w(i11, strMo498E1, this.f27026g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
