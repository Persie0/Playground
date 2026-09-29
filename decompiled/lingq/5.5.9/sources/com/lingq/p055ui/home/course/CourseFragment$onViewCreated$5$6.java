package com.lingq.p055ui.home.course;

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
import kotlin.Triple;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$6", m19206f = "CourseFragment.kt", m19207l = {518}, m19208m = "invokeSuspend")
public final class CourseFragment$onViewCreated$5$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23736e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseFragment f23737f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$6$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$6$1", m19206f = "CourseFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36371 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends Integer, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23738e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseFragment f23739f;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$6$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CourseFragment f23740a;

            public a(CourseFragment courseFragment) {
                this.f23740a = courseFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                String str;
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = this.f23740a.m9858q0();
                C7138s c7138s = courseViewModelM9858q0.f23968p0;
                UserLanguage value = courseViewModelM9858q0.mo509w0().getValue();
                if (value == null || (str = value.f21734i) == null) {
                    str = "en";
                }
                c7138s.mo14371k(C0166e.m766l("https://www.lingq.com/", str, "/learn/", courseViewModelM9858q0.mo498E1(), "/web/settings/points"));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$6$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f23741a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36371(CourseFragment courseFragment, InterfaceC9968c<? super C36371> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23739f = courseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36371 c36371 = new C36371(this.f23739f, interfaceC9968c);
            c36371.f23738e = obj;
            return c36371;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends Integer, ? extends Boolean> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36371) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f23738e;
            int iIntValue = ((Number) triple.f38021a).intValue();
            int iIntValue2 = ((Number) triple.f38022b).intValue();
            boolean zBooleanValue = ((Boolean) triple.f38023c).booleanValue();
            CourseFragment courseFragment = this.f23739f;
            C9249b c9249b = new C9249b(courseFragment.m3578a0());
            c9249b.setTitle(courseFragment.m3600t(zBooleanValue ? R.string.premium_course : R.string.premium_lesson));
            Locale locale = Locale.getDefault();
            String strM3600t = courseFragment.m3600t(zBooleanValue ? R.string.not_enough_balance_purchase_course_details : R.string.not_enough_balance_purchase_lesson_details);
            C5207g.m11110e(strM3600t, "getString(\n             …                        )");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(courseFragment.m3600t(R.string.ui_buy_points), new a(courseFragment));
            c9249b.m17610c(courseFragment.m3600t(R.string.ui_cancel), b.f23741a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragment$onViewCreated$5$6(CourseFragment courseFragment, InterfaceC9968c<? super CourseFragment$onViewCreated$5$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23737f = courseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseFragment$onViewCreated$5$6(this.f23737f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseFragment$onViewCreated$5$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23736e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
            CourseFragment courseFragment = this.f23737f;
            CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
            C36371 c36371 = new C36371(courseFragment, null);
            this.f23736e = 1;
            if (C0062b.m369m0(courseViewModelM9858q0.f23967o0, c36371, this) == coroutineSingletons) {
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
