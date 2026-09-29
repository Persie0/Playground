package com.lingq.p055ui.info;

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
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$9", m19206f = "LessonInfoFragment.kt", m19207l = {322}, m19208m = "invokeSuspend")
public final class LessonInfoFragment$onViewCreated$7$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26903e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoFragment f26904f;

    /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$9$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$9$1", m19206f = "LessonInfoFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41461 extends SuspendLambda implements InterfaceC2056p<Pair<? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f26905e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonInfoFragment f26906f;

        /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$9$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LessonInfoFragment f26907a;

            public a(LessonInfoFragment lessonInfoFragment) {
                this.f26907a = lessonInfoFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
                LessonInfoViewModel lessonInfoViewModelM10099x0 = this.f26907a.m10099x0();
                C7138s c7138s = lessonInfoViewModelM10099x0.f26947f0;
                UserLanguage value = lessonInfoViewModelM10099x0.mo509w0().getValue();
                if (value == null || (str = value.f21734i) == null) {
                    str = "en";
                }
                c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/learn/", lessonInfoViewModelM10099x0.mo498E1(), "/web/settings/points"));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.info.LessonInfoFragment$onViewCreated$7$9$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f26908a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41461(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super C41461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26906f = lessonInfoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41461 c41461 = new C41461(this.f26906f, interfaceC9968c);
            c41461.f26905e = obj;
            return c41461;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends Integer, ? extends Integer> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41461) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f26905e;
            int iIntValue = ((Number) pair.f38012a).intValue();
            int iIntValue2 = ((Number) pair.f38013b).intValue();
            LessonInfoFragment lessonInfoFragment = this.f26906f;
            C9249b c9249b = new C9249b(lessonInfoFragment.m3578a0());
            c9249b.setTitle(lessonInfoFragment.m3600t(R.string.premium_lesson));
            Locale locale = Locale.getDefault();
            String strM3600t = lessonInfoFragment.m3600t(R.string.not_enough_balance_purchase_lesson_details);
            C5207g.m11110e(strM3600t, "getString(R.string.not_e…_purchase_lesson_details)");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(lessonInfoFragment.m3600t(R.string.ui_buy_points), new a(lessonInfoFragment));
            c9249b.m17610c(lessonInfoFragment.m3600t(R.string.ui_cancel), b.f26908a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoFragment$onViewCreated$7$9(LessonInfoFragment lessonInfoFragment, InterfaceC9968c<? super LessonInfoFragment$onViewCreated$7$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26904f = lessonInfoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoFragment$onViewCreated$7$9(this.f26904f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoFragment$onViewCreated$7$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26903e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonInfoFragment.f26838X0;
            LessonInfoFragment lessonInfoFragment = this.f26904f;
            LessonInfoViewModel lessonInfoViewModelM10099x0 = lessonInfoFragment.m10099x0();
            C41461 c41461 = new C41461(lessonInfoFragment, null);
            this.f26903e = 1;
            if (C0062b.m369m0(lessonInfoViewModelM10099x0.f26945e0, c41461, this) == coroutineSingletons) {
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
