package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.session.C0166e;
import androidx.view.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$50", m19206f = "LessonFragment.kt", m19207l = {1494}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$50 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27302e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27303f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$50$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$50$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42161 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends Integer, ? extends String>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27304e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27305f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$50$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final a f27306a = new a();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$50$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27307a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f27308b;

            public b(LessonFragment lessonFragment, int i10) {
                this.f27307a = lessonFragment;
                this.f27308b = i10;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                dialogInterface.dismiss();
                LessonFragment lessonFragment = this.f27307a;
                if (lessonFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.RESUMED)) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                    ViewPager2 viewPager2 = lessonFragment.m10107o0().f44701l;
                    int i11 = this.f27308b;
                    viewPager2.m4683b(i11, false);
                    lessonFragment.m10109q0().m10139F2(i11, false);
                    lessonFragment.m10107o0().f44700k.setCurrentPage(i11);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42161(LessonFragment lessonFragment, InterfaceC9968c<? super C42161> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27305f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42161 c42161 = new C42161(this.f27305f, interfaceC9968c);
            c42161.f27304e = obj;
            return c42161;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends Integer, ? extends String> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42161) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f27304e;
            int iIntValue = ((Number) triple.f38021a).intValue();
            int iIntValue2 = ((Number) triple.f38022b).intValue();
            String str = (String) triple.f38023c;
            LessonFragment lessonFragment = this.f27305f;
            C9249b c9249b = new C9249b(lessonFragment.m3576Y());
            c9249b.m17615h(R.string.texts_update_lesson_position_title);
            String strM3600t = lessonFragment.m3600t(R.string.texts_update_lesson_position);
            C5207g.m11110e(strM3600t, "getString(R.string.texts_update_lesson_position)");
            c9249b.f599a.f579f = C0166e.m770q(new Object[]{new Integer(iIntValue + 1), new Integer(iIntValue2 + 1), str}, 3, strM3600t, "format(format, *args)");
            c9249b.setNegativeButton(R.string.ui_no, a.f27306a).setPositiveButton(R.string.ui_yes, new b(lessonFragment, iIntValue2)).m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$50(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$50> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27303f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$50(this.f27303f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$50) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27302e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27303f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42161 c42161 = new C42161(lessonFragment, null);
            this.f27302e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27409K0, c42161, this) == coroutineSingletons) {
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
