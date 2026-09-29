package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.player.PlayerContentController;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import java.util.ArrayList;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$setupPlayerForLesson$1", m19206f = "LessonViewModel.kt", m19207l = {1630}, m19208m = "invokeSuspend")
final class LessonViewModel$setupPlayerForLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27750e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27751f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonStudy f27752g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f27753h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$setupPlayerForLesson$1(LessonViewModel lessonViewModel, LessonStudy lessonStudy, String str, InterfaceC9968c<? super LessonViewModel$setupPlayerForLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27751f = lessonViewModel;
        this.f27752g = lessonStudy;
        this.f27753h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$setupPlayerForLesson$1(this.f27751f, this.f27752g, this.f27753h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$setupPlayerForLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM10131m2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27750e;
        LessonStudy lessonStudy = this.f27752g;
        LessonViewModel lessonViewModel = this.f27751f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            int i11 = lessonStudy.f21815a;
            this.f27750e = 1;
            objM10131m2 = LessonViewModel.m10131m2(lessonViewModel, i11, this);
            if (objM10131m2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
            objM10131m2 = obj;
        }
        boolean zBooleanValue = ((Boolean) objM10131m2).booleanValue();
        int i12 = lessonStudy.f21815a;
        String str = this.f27753h;
        String str2 = lessonStudy.f21816b;
        String str3 = lessonStudy.f21823i;
        String str4 = str3 == null ? "" : str3;
        int i13 = lessonStudy.f21821g * 1000;
        String str5 = lessonStudy.f21819e;
        PlayerContentController.PlayerContentItem playerContentItem = new PlayerContentController.PlayerContentItem(i12, str, str2, str4, i13, str5 == null ? "" : str5, zBooleanValue, lessonStudy.f21822h, lessonViewModel.mo498E1(), null, 512, null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(playerContentItem);
        lessonViewModel.mo9401L1(arrayList);
        return C9072e.f47360a;
    }
}
