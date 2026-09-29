package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lingq.util.C4924a;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.C7828f;
import no.InterfaceC7882z;
import p040c4.C1676a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36", m19206f = "LessonFragment.kt", m19207l = {1251}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$36 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27211e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27212f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42001 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonFragment f27213e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1$a */
        public static final class a implements CompoundButton.OnCheckedChangeListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27216a;

            public a(LessonFragment lessonFragment) {
                this.f27216a = lessonFragment;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                if (compoundButton.isPressed()) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                    LessonViewModel lessonViewModelM10109q0 = this.f27216a.m10109q0();
                    C7828f.m15570d(C8573r0.m16767w0(lessonViewModelM10109q0), lessonViewModelM10109q0.f27423P, null, new LessonViewModel$setMoveBlueWordsToKnown$1(lessonViewModelM10109q0, null, z10), 2);
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f27217a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42001(LessonFragment lessonFragment, InterfaceC9968c<? super C42001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27213e = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C42001(this.f27213e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42001) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            final LessonFragment lessonFragment = this.f27213e;
            View viewInflate = LayoutInflater.from(lessonFragment.m3578a0()).inflate(R.layout.view_dialog_move_to_known, (ViewGroup) null, false);
            SwitchMaterial switchMaterial = (SwitchMaterial) C0062b.m298P0(viewInflate, R.id.switchMoveToKnown);
            if (switchMaterial == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.switchMoveToKnown)));
            }
            switchMaterial.setChecked(lessonFragment.m10109q0().m10150w2());
            switchMaterial.setOnCheckedChangeListener(new a(lessonFragment));
            C9249b view = new C9249b(lessonFragment.m3576Y()).setView(viewInflate);
            view.m17615h(R.string.tooltips_move_words_to_known);
            view.setNegativeButton(R.string.ui_ok, b.f27217a).setPositiveButton(R.string.settings_text_lesson_settings, new DialogInterface.OnClickListener() { // from class: com.lingq.ui.lesson.LessonFragment.onViewCreated.8.36.1.3

                /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1$3$1, reason: invalid class name */
                @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
                @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$36$1$3$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
                public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ LessonFragment f27215e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LessonFragment lessonFragment, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                        super(2, interfaceC9968c);
                        this.f27215e = lessonFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: a */
                    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                        return new AnonymousClass1(this.f27215e, interfaceC9968c);
                    }

                    @Override // cm.InterfaceC2056p
                    /* JADX INFO: renamed from: m0 */
                    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                        return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) throws Throwable {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        C7499b.m14977z0(obj);
                        InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                        LessonFragment lessonFragment = this.f27215e;
                        lessonFragment.getClass();
                        C4924a.m10447Z(C8573r0.m16725g0(lessonFragment), new C1676a(R.id.actionToLessonSettings));
                        return C9072e.f47360a;
                    }
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    dialogInterface.dismiss();
                    LessonFragment lessonFragment2 = lessonFragment;
                    C7499b.m14906H(lessonFragment2).m3951d(new AnonymousClass1(lessonFragment2, null));
                }
            }).m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$36(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$36> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27212f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$36(this.f27212f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$36) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27211e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27212f;
            InterfaceC7137r<C9072e> interfaceC7137rMo10044d2 = lessonFragment.m10109q0().mo10044d2();
            C42001 c42001 = new C42001(lessonFragment, null);
            this.f27211e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10044d2, c42001, this) == coroutineSingletons) {
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
