package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.os.Bundle;
import androidx.activity.result.C0204c;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5206f;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p155he.C6041e;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$31", m19206f = "LessonFragment.kt", m19207l = {991}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$31 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27185e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27186f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$31$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/lesson/c;", "nav", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$31$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41951 extends SuspendLambda implements InterfaceC2056p<AbstractC4269c, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27187e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27188f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41951(LessonFragment lessonFragment, InterfaceC9968c<? super C41951> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27188f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41951 c41951 = new C41951(this.f27188f, interfaceC9968c);
            c41951.f27187e = obj;
            return c41951;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(AbstractC4269c abstractC4269c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41951) mo1336a(abstractC4269c, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            boolean z10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            AbstractC4269c abstractC4269c = (AbstractC4269c) this.f27187e;
            boolean zM11106a = C5207g.m11106a(abstractC4269c, AbstractC4269c.a.f27844a);
            boolean z11 = true;
            boolean z12 = false;
            LessonFragment lessonFragment = this.f27188f;
            if (zM11106a) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                int iM10152y2 = lessonFragment.m10109q0().m10152y2();
                NavDestination navDestinationM3986g = C8573r0.m16725g0(lessonFragment).m3986g();
                if (navDestinationM3986g != null && navDestinationM3986g.f6834h == R.id.fragment_lesson) {
                    z10 = z12;
                    z10 = z12;
                    z10 = true;
                }
                if (z10) {
                    NavController navControllerM16725g0 = C8573r0.m16725g0(lessonFragment);
                    NavDestination navDestinationM3986g2 = navControllerM16725g0.m3986g();
                    if (navDestinationM3986g2 != null && navDestinationM3986g2.m4016i(R.id.actionToLessonComplete) != null) {
                        Bundle bundle = new Bundle();
                        bundle.putInt("lessonId", iM10152y2);
                        bundle.putBoolean("isCompleting", true);
                        navControllerM16725g0.m3992m(R.id.actionToLessonComplete, bundle, null);
                    }
                } else {
                    C6041e c6041eM12476a = C6041e.m12476a();
                    NavDestination navDestinationM3986g3 = C8573r0.m16725g0(lessonFragment).m3986g();
                    c6041eM12476a.m12477b(new Exception(C0204c.m852k("Current destination not LessonFragment, instead it is ", navDestinationM3986g3 != null ? navDestinationM3986g3.mo4018m() : null)));
                }
            } else if (abstractC4269c instanceof AbstractC4269c.b) {
                String strM3600t = lessonFragment.m3600t(R.string.lingq_grammar_resource);
                String str = ((AbstractC4269c.b) abstractC4269c).f27845a;
                C5207g.m11111f(str, "url");
                NavController navControllerM16725g1 = C8573r0.m16725g0(lessonFragment);
                NavDestination navDestinationM3986g4 = navControllerM16725g1.m3986g();
                if (navDestinationM3986g4 != null && navDestinationM3986g4.m4016i(R.id.actionToWeb) != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("url", str);
                    bundle2.putString("title", strM3600t);
                    navControllerM16725g1.m3992m(R.id.actionToWeb, bundle2, null);
                }
            } else if (abstractC4269c instanceof AbstractC4269c.d) {
                AbstractC4269c.d dVar = (AbstractC4269c.d) abstractC4269c;
                C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), C5206f.m11020r0(dVar.f27850b, dVar.f27849a, false, false, dVar.f27852d, null, null, dVar.f27851c, 96));
            } else if (C5207g.m11106a(abstractC4269c, AbstractC4269c.h.f27856a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                int iM10152y3 = lessonFragment.m10109q0().m10152y2();
                NavController navControllerM16725g2 = C8573r0.m16725g0(lessonFragment);
                NavDestination navDestinationM3986g5 = navControllerM16725g2.m3986g();
                if (navDestinationM3986g5 != null && navDestinationM3986g5.m4016i(R.id.actionToLessonVocabulary) != null) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt("lessonId", iM10152y3);
                    bundle3.putBoolean("isDocked", false);
                    navControllerM16725g2.m3992m(R.id.actionToLessonVocabulary, bundle3, null);
                }
            } else if (C5207g.m11106a(abstractC4269c, AbstractC4269c.f.f27854a)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = LessonFragment.f27053M0;
                int iM10152y4 = lessonFragment.m10109q0().m10152y2();
                NavDestination navDestinationM3986g6 = C8573r0.m16725g0(lessonFragment).m3986g();
                if (navDestinationM3986g6 == null || navDestinationM3986g6.f6834h != R.id.fragment_lesson) {
                    z11 = false;
                }
                if (z11) {
                    NavController navControllerM16725g3 = C8573r0.m16725g0(lessonFragment);
                    NavDestination navDestinationM3986g7 = navControllerM16725g3.m3986g();
                    if (navDestinationM3986g7 != null && navDestinationM3986g7.m4016i(R.id.actionToLessonComplete) != null) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("lessonId", iM10152y4);
                        bundle4.putBoolean("isCompleting", false);
                        navControllerM16725g3.m3992m(R.id.actionToLessonComplete, bundle4, null);
                    }
                } else {
                    C6041e c6041eM12476a2 = C6041e.m12476a();
                    NavDestination navDestinationM3986g8 = C8573r0.m16725g0(lessonFragment).m3986g();
                    c6041eM12476a2.m12477b(new Exception("Current destination not LessonFragment, instead it is " + (navDestinationM3986g8 != null ? new Integer(navDestinationM3986g8.f6834h) : null)));
                }
            } else if (abstractC4269c instanceof AbstractC4269c.g) {
                NavController navControllerM16725g4 = C8573r0.m16725g0(lessonFragment);
                String str2 = ((AbstractC4269c.g) abstractC4269c).f27855a;
                C5207g.m11111f(str2, "attemptedAction");
                NavDestination navDestinationM3986g9 = navControllerM16725g4.m3986g();
                if (navDestinationM3986g9 != null && navDestinationM3986g9.m4016i(R.id.actionToUpgrade) != null) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("attemptedAction", str2);
                    bundle5.putString("offer", "");
                    navControllerM16725g4.m3992m(R.id.actionToUpgrade, bundle5, null);
                }
            } else if (!C5207g.m11106a(abstractC4269c, AbstractC4269c.e.f27853a) && (abstractC4269c instanceof AbstractC4269c.c)) {
                AbstractC4269c.c cVar = (AbstractC4269c.c) abstractC4269c;
                int i10 = cVar.f27846a;
                NavController navControllerM16725g5 = C8573r0.m16725g0(lessonFragment);
                Bundle bundle6 = new Bundle();
                bundle6.putInt("lessonId", i10);
                bundle6.putInt("sentenceIndex", cVar.f27847b);
                bundle6.putBoolean("hasAudio", cVar.f27848c);
                navControllerM16725g5.m3992m(R.id.actionToLessonEdit, bundle6, null);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$31(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$31> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27186f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$31(this.f27186f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$31) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27185e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27186f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C41951 c41951 = new C41951(lessonFragment, null);
            this.f27185e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27516w1, c41951, this) == coroutineSingletons) {
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
