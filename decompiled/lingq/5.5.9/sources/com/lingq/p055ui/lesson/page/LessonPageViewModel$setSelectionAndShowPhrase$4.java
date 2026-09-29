package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenType;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$setSelectionAndShowPhrase$4", m19206f = "LessonPageViewModel.kt", m19207l = {790}, m19208m = "invokeSuspend")
public final class LessonPageViewModel$setSelectionAndShowPhrase$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28649e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f28650f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonPageViewModel f28651g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C7570d f28652h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ List<C7570d> f28653i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$setSelectionAndShowPhrase$4(boolean z10, LessonPageViewModel lessonPageViewModel, C7570d c7570d, List<C7570d> list, InterfaceC9968c<? super LessonPageViewModel$setSelectionAndShowPhrase$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28650f = z10;
        this.f28651g = lessonPageViewModel;
        this.f28652h = c7570d;
        this.f28653i = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$setSelectionAndShowPhrase$4(this.f28650f, this.f28651g, this.f28652h, this.f28653i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$setSelectionAndShowPhrase$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28649e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            if (this.f28650f) {
                this.f28649e = 1;
                if (C7828f.m15567a(500L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        this.f28651g.f28563k0.mo16479j(new LessonPageViewModel.C4373a(this.f28652h, TokenType.NewWordOrPhraseType, this.f28653i, null, false));
        return C9072e.f47360a;
    }
}
