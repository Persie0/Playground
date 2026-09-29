package com.lingq.p055ui.info;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0018\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/library/LessonInfo;", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "lesson", "counters", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$lessonWithCounters$1", m19206f = "LessonInfoViewModel.kt", m19207l = {116}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$lessonWithCounters$1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Pair<? extends LessonInfo, ? extends LibraryItemCounter>>, LessonInfo, LibraryItemCounter, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27014e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f27015f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ LessonInfo f27016g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ LibraryItemCounter f27017h;

    public LessonInfoViewModel$lessonWithCounters$1(InterfaceC9968c<? super LessonInfoViewModel$lessonWithCounters$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(InterfaceC7117d<? super Pair<? extends LessonInfo, ? extends LibraryItemCounter>> interfaceC7117d, LessonInfo lessonInfo, LibraryItemCounter libraryItemCounter, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonInfoViewModel$lessonWithCounters$1 lessonInfoViewModel$lessonWithCounters$1 = new LessonInfoViewModel$lessonWithCounters$1(interfaceC9968c);
        lessonInfoViewModel$lessonWithCounters$1.f27015f = interfaceC7117d;
        lessonInfoViewModel$lessonWithCounters$1.f27016g = lessonInfo;
        lessonInfoViewModel$lessonWithCounters$1.f27017h = libraryItemCounter;
        return lessonInfoViewModel$lessonWithCounters$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27014e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f27015f;
            Pair pair = new Pair(this.f27016g, this.f27017h);
            this.f27015f = null;
            this.f27016g = null;
            this.f27014e = 1;
            if (interfaceC7117d.mo1339r(pair, this) == coroutineSingletons) {
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
