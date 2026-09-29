package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertController;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$6", m19206f = "UserImportFragment.kt", m19207l = {148}, m19208m = "invokeSuspend")
public final class UserImportFragment$onViewCreated$3$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26614e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportFragment f26615f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$6$1", m19206f = "UserImportFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C40931 extends SuspendLambda implements InterfaceC2056p<LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26616e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportFragment f26617f;

        /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$6$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ UserImportFragment f26618a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ LessonStudy f26619b;

            public a(UserImportFragment userImportFragment, LessonStudy lessonStudy) {
                this.f26618a = userImportFragment;
                this.f26619b = lessonStudy;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UserImportFragment userImportFragment = this.f26618a;
                if (userImportFragment.m3604y()) {
                    UserImportViewModel userImportViewModelM10090q0 = userImportFragment.m10090q0();
                    C7828f.m15570d(C8573r0.m16767w0(userImportViewModelM10090q0), null, null, new UserImportViewModel$openImportedLesson$1(userImportViewModelM10090q0, this.f26619b.f21815a, null), 3);
                }
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportFragment$onViewCreated$3$6$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ UserImportFragment f26620a;

            public b(UserImportFragment userImportFragment) {
                this.f26620a = userImportFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                UserImportFragment userImportFragment = this.f26620a;
                if (userImportFragment.m3604y()) {
                    UserImportFragment.m10088o0(userImportFragment).mo10086w();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40931(UserImportFragment userImportFragment, InterfaceC9968c<? super C40931> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26617f = userImportFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C40931 c40931 = new C40931(this.f26617f, interfaceC9968c);
            c40931.f26616e = obj;
            return c40931;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C40931) mo1336a(lessonStudy, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LessonStudy lessonStudy = (LessonStudy) this.f26616e;
            if (lessonStudy != null) {
                UserImportFragment userImportFragment = this.f26617f;
                C9249b c9249b = new C9249b(userImportFragment.m3578a0());
                c9249b.setTitle(userImportFragment.m3600t(R.string.feed_import));
                String strM21i = C0009a.m21i(userImportFragment.m3600t(R.string.imports_import_successful), " ", userImportFragment.m3600t(R.string.imports_open_lesson));
                AlertController.C0211b c0211b = c9249b.f599a;
                c0211b.f579f = strM21i;
                c9249b.setPositiveButton(R.string.ui_yes, new a(userImportFragment, lessonStudy));
                b bVar = new b(userImportFragment);
                c0211b.f584k = c0211b.f574a.getText(R.string.ui_no);
                c0211b.f585l = bVar;
                c9249b.m876a();
                CircularProgressIndicator circularProgressIndicator = userImportFragment.m10089p0().f44722c;
                C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                C4924a.m10442U(circularProgressIndicator);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportFragment$onViewCreated$3$6(UserImportFragment userImportFragment, InterfaceC9968c<? super UserImportFragment$onViewCreated$3$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26615f = userImportFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportFragment$onViewCreated$3$6(this.f26615f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportFragment$onViewCreated$3$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26614e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UserImportFragment.f26580E0;
            UserImportFragment userImportFragment = this.f26615f;
            UserImportViewModel userImportViewModelM10090q0 = userImportFragment.m10090q0();
            C40931 c40931 = new C40931(userImportFragment, null);
            this.f26614e = 1;
            if (C0062b.m369m0(userImportViewModelM10090q0.f26794H, c40931, this) == coroutineSingletons) {
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
