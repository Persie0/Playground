package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.linguist.R;
import dm.C5207g;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$46", m19206f = "LessonFragment.kt", m19207l = {1415}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$46 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27262e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27263f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$46$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$46$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42111 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27264e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27265f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$46$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonFragment f27266a;

            public a(LessonFragment lessonFragment) {
                this.f27266a = lessonFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                LessonViewModel lessonViewModelM10109q0 = this.f27266a.m10109q0();
                C7138s c7138s = lessonViewModelM10109q0.f27391D0;
                UserLanguage value = lessonViewModelM10109q0.mo509w0().getValue();
                if (value == null || (str = value.f21734i) == null) {
                    str = "en";
                }
                c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/learn/", lessonViewModelM10109q0.mo498E1(), "/web/settings/points"));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$46$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f27267a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42111(LessonFragment lessonFragment, InterfaceC9968c<? super C42111> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27265f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42111 c42111 = new C42111(this.f27265f, interfaceC9968c);
            c42111.f27264e = obj;
            return c42111;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends Integer> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42111) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f27264e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            int iIntValue2 = ((Number) pair.f38013b).intValue();
            LessonFragment lessonFragment = this.f27265f;
            C9249b c9249b = new C9249b(lessonFragment.m3578a0());
            c9249b.setTitle(lessonFragment.m3600t(R.string.premium_lesson));
            Locale locale = Locale.getDefault();
            String strM3600t = lessonFragment.m3600t(R.string.not_enough_balance_purchase_lesson_details);
            C5207g.m11110e(strM3600t, "getString(R.string.not_e…_purchase_lesson_details)");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(lessonFragment.m3600t(R.string.ui_buy_points), new a(lessonFragment));
            c9249b.m17610c(lessonFragment.m3600t(R.string.ui_cancel), b.f27267a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$46(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$46> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27263f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$46(this.f27263f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$46) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27262e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27263f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C42111 c42111 = new C42111(lessonFragment, null);
            this.f27262e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27389C0, c42111, this) == coroutineSingletons) {
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
