package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$3", m19206f = "LessonPreviewFragment.kt", m19207l = {95}, m19208m = "invokeSuspend")
public final class LessonPreviewFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24550e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPreviewFragment f24551f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewFragment$onViewCreated$5$3$1", m19206f = "LessonPreviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37481 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f24552e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPreviewFragment f24553f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37481(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super C37481> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24553f = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37481 c37481 = new C37481(this.f24553f, interfaceC9968c);
            c37481.f24552e = ((Boolean) obj).booleanValue();
            return c37481;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37481) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f24552e;
            LessonPreviewFragment lessonPreviewFragment = this.f24553f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
                TextView textView = lessonPreviewFragment.m9930o0().f45098b;
                C5207g.m11110e(textView, "binding.btnDone");
                C4924a.m10442U(textView);
                lessonPreviewFragment.m9930o0().f45100d.m4935d();
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonPreviewFragment.f24530D0;
                TextView textView2 = lessonPreviewFragment.m9930o0().f45098b;
                C5207g.m11110e(textView2, "binding.btnDone");
                C4924a.m10457e0(textView2);
                CircularProgressIndicator circularProgressIndicator = lessonPreviewFragment.m9930o0().f45100d;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgressImport");
                C4924a.m10442U(circularProgressIndicator);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewFragment$onViewCreated$5$3(LessonPreviewFragment lessonPreviewFragment, InterfaceC9968c<? super LessonPreviewFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24551f = lessonPreviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPreviewFragment$onViewCreated$5$3(this.f24551f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPreviewFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24550e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonPreviewFragment.f24530D0;
            LessonPreviewFragment lessonPreviewFragment = this.f24551f;
            LessonPreviewViewModel lessonPreviewViewModelM9931p0 = lessonPreviewFragment.m9931p0();
            C37481 c37481 = new C37481(lessonPreviewFragment, null);
            this.f24550e = 1;
            if (C0062b.m369m0(lessonPreviewViewModelM9931p0.f24579l, c37481, this) == coroutineSingletons) {
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
