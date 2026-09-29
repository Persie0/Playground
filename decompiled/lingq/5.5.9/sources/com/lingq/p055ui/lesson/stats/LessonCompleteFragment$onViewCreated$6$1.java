package com.lingq.p055ui.lesson.stats;

import ae.C0062b;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.app.AlertController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7796d;
import no.InterfaceC7882z;
import p159hi.C6050a;
import p225kk.C6704a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1", m19206f = "LessonCompleteFragment.kt", m19207l = {221}, m19208m = "invokeSuspend")
public final class LessonCompleteFragment$onViewCreated$6$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonCompleteFragment f28914f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lhi/a;", "lessonData", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1", m19206f = "LessonCompleteFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C44171 extends SuspendLambda implements InterfaceC2056p<C6050a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28915e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonCompleteFragment f28916f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonCompleteFragment f28917a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C6050a f28918b;

            /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1$a$a, reason: collision with other inner class name */
            public static final class DialogInterfaceOnClickListenerC10631a implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LessonCompleteFragment f28919a;

                public DialogInterfaceOnClickListenerC10631a(LessonCompleteFragment lessonCompleteFragment) {
                    this.f28919a = lessonCompleteFragment;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    LessonCompleteFragment lessonCompleteFragment = this.f28919a;
                    lessonCompleteFragment.m10215o0().f37891b.edit().putBoolean("shouldShowRate2", false).apply();
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + lessonCompleteFragment.m3576Y().getPackageName()));
                    intent.addFlags(1208483840);
                    try {
                        lessonCompleteFragment.m3595l0(intent);
                    } catch (ActivityNotFoundException unused) {
                        lessonCompleteFragment.m3595l0(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + lessonCompleteFragment.m3576Y().getPackageName())));
                    }
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1$a$b */
            public static final class b implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LessonCompleteFragment f28920a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C6050a f28921b;

                public b(LessonCompleteFragment lessonCompleteFragment, C6050a c6050a) {
                    this.f28920a = lessonCompleteFragment;
                    this.f28921b = c6050a;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    LessonCompleteFragment.m10214n0(this.f28920a, this.f28921b);
                }
            }

            /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1$a$c */
            public static final class c implements DialogInterface.OnClickListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ LessonCompleteFragment f28922a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C6050a f28923b;

                public c(LessonCompleteFragment lessonCompleteFragment, C6050a c6050a) {
                    this.f28922a = lessonCompleteFragment;
                    this.f28923b = c6050a;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    LessonCompleteFragment lessonCompleteFragment = this.f28922a;
                    lessonCompleteFragment.m10215o0().f37891b.edit().putBoolean("shouldShowRate2", false).apply();
                    LessonCompleteFragment.m10214n0(lessonCompleteFragment, this.f28923b);
                }
            }

            public a(LessonCompleteFragment lessonCompleteFragment, C6050a c6050a) {
                this.f28917a = lessonCompleteFragment;
                this.f28918b = c6050a;
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LessonCompleteFragment lessonCompleteFragment = this.f28917a;
                C7796d c7796d = lessonCompleteFragment.f28900F0;
                if (c7796d == null) {
                    C5207g.m11117l("analytics");
                    throw null;
                }
                c7796d.m15505b(null, "Next lesson button clicked");
                C6704a c6704aM10215o0 = lessonCompleteFragment.m10215o0();
                c6704aM10215o0.f37891b.edit().putInt("times_rate_shown2", lessonCompleteFragment.m10215o0().m13301c() + 1).apply();
                boolean z10 = lessonCompleteFragment.m10215o0().f37891b.getBoolean("shouldShowRate2", true);
                C6050a c6050a = this.f28918b;
                if (!z10 || (lessonCompleteFragment.m10215o0().m13301c() != 2 && lessonCompleteFragment.m10215o0().m13301c() != 4 && lessonCompleteFragment.m10215o0().m13301c() != 8 && lessonCompleteFragment.m10215o0().m13301c() != 15 && lessonCompleteFragment.m10215o0().m13301c() != 30)) {
                    LessonCompleteFragment.m10214n0(lessonCompleteFragment, c6050a);
                    return;
                }
                C9249b c9249b = new C9249b(lessonCompleteFragment.m3578a0());
                c9249b.setTitle(lessonCompleteFragment.m3600t(R.string.rate_lingq_title));
                String strM3600t = lessonCompleteFragment.m3600t(R.string.rate_lingq_desc);
                AlertController.C0211b c0211b = c9249b.f599a;
                c0211b.f579f = strM3600t;
                c9249b.setPositiveButton(R.string.review_yes, new DialogInterfaceOnClickListenerC10631a(lessonCompleteFragment));
                c9249b.m17610c(lessonCompleteFragment.m3600t(R.string.ui_ask_later), new b(lessonCompleteFragment, c6050a));
                c cVar = new c(lessonCompleteFragment, c6050a);
                c0211b.f584k = c0211b.f574a.getText(R.string.ui_dont_show_again);
                c0211b.f585l = cVar;
                c9249b.m876a();
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.stats.LessonCompleteFragment$onViewCreated$6$1$1$b */
        public static final class b implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonCompleteFragment f28924a;

            public b(LessonCompleteFragment lessonCompleteFragment) {
                this.f28924a = lessonCompleteFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8573r0.m16725g0(this.f28924a).m3996q(R.id.fragment_home, false);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44171(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super C44171> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28916f = lessonCompleteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C44171 c44171 = new C44171(this.f28916f, interfaceC9968c);
            c44171.f28915e = obj;
            return c44171;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6050a c6050a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44171) mo1336a(c6050a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Integer num;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6050a c6050a = (C6050a) this.f28915e;
            Integer num2 = c6050a != null ? c6050a.f35722b : null;
            LessonCompleteFragment lessonCompleteFragment = this.f28916f;
            if (num2 == null || ((num = c6050a.f35722b) != null && num.intValue() == 0)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
                lessonCompleteFragment.m10216p0().f44753b.setText(lessonCompleteFragment.m3600t(R.string.complete_back_library));
                lessonCompleteFragment.m10216p0().f44753b.setOnClickListener(new b(lessonCompleteFragment));
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonCompleteFragment.f28894G0;
                lessonCompleteFragment.m10216p0().f44753b.setText(lessonCompleteFragment.m3600t(R.string.lesson_next_lesson));
                lessonCompleteFragment.m10216p0().f44753b.setOnClickListener(new a(lessonCompleteFragment, c6050a));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteFragment$onViewCreated$6$1(LessonCompleteFragment lessonCompleteFragment, InterfaceC9968c<? super LessonCompleteFragment$onViewCreated$6$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28914f = lessonCompleteFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteFragment$onViewCreated$6$1(this.f28914f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteFragment$onViewCreated$6$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28913e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonCompleteFragment.f28894G0;
            LessonCompleteFragment lessonCompleteFragment = this.f28914f;
            LessonCompleteViewModel lessonCompleteViewModelM10217q0 = lessonCompleteFragment.m10217q0();
            C44171 c44171 = new C44171(lessonCompleteFragment, null);
            this.f28913e = 1;
            if (C0062b.m369m0(lessonCompleteViewModelM10217q0.f28977L, c44171, this) == coroutineSingletons) {
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
