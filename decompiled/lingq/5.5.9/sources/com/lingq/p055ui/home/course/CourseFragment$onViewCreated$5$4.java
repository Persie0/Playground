package com.lingq.p055ui.home.course;

import ae.C0062b;
import android.content.DialogInterface;
import android.support.v4.media.C0141b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$4", m19206f = "CourseFragment.kt", m19207l = {478}, m19208m = "invokeSuspend")
public final class CourseFragment$onViewCreated$5$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23720e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseFragment f23721f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$4$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseFragment$onViewCreated$5$4$1", m19206f = "CourseFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36351 extends SuspendLambda implements InterfaceC2056p<Triple<? extends Integer, ? extends Integer, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23722e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseFragment f23723f;

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$4$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ CourseFragment f23724a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f23725b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ int f23726c;

            public a(CourseFragment courseFragment, int i10, int i11) {
                this.f23724a = courseFragment;
                this.f23725b = i10;
                this.f23726c = i11;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
                CourseViewModel courseViewModelM9858q0 = this.f23724a.m9858q0();
                courseViewModelM9858q0.getClass();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(courseViewModelM9858q0);
                StringBuilder sb2 = new StringBuilder("buyCourse ");
                int i11 = this.f23725b;
                sb2.append(i11);
                C7499b.m14933c0(interfaceC7882zM16767w0, courseViewModelM9858q0.f23957i, courseViewModelM9858q0.f23955h, sb2.toString(), new CourseViewModel$buyCourse$1(courseViewModelM9858q0, i11, this.f23726c, null));
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseFragment$onViewCreated$5$4$1$b */
        public static final class b implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public static final b f23727a = new b();

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36351(CourseFragment courseFragment, InterfaceC9968c<? super C36351> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23723f = courseFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36351 c36351 = new C36351(this.f23723f, interfaceC9968c);
            c36351.f23722e = obj;
            return c36351;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends Integer, ? extends Integer, ? extends Integer> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36351) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f23722e;
            int iIntValue = ((Number) triple.f38021a).intValue();
            int iIntValue2 = ((Number) triple.f38022b).intValue();
            int iIntValue3 = ((Number) triple.f38023c).intValue();
            CourseFragment courseFragment = this.f23723f;
            C9249b c9249b = new C9249b(courseFragment.m3578a0());
            c9249b.setTitle(courseFragment.m3600t(R.string.premium_course));
            Locale locale = Locale.getDefault();
            String strM3600t = courseFragment.m3600t(R.string.purchase_item_details);
            C5207g.m11110e(strM3600t, "getString(R.string.purchase_item_details)");
            c9249b.f599a.f579f = C0141b.m613i(new Object[]{new Integer(iIntValue), new Integer(iIntValue2)}, 2, locale, strM3600t, "format(locale, format, *args)");
            c9249b.m17612e(courseFragment.m3600t(R.string.ui_yes), new a(courseFragment, iIntValue3, iIntValue));
            c9249b.m17610c(courseFragment.m3600t(R.string.ui_no), b.f23727a);
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseFragment$onViewCreated$5$4(CourseFragment courseFragment, InterfaceC9968c<? super CourseFragment$onViewCreated$5$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23721f = courseFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseFragment$onViewCreated$5$4(this.f23721f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseFragment$onViewCreated$5$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23720e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = CourseFragment.f23670H0;
            CourseFragment courseFragment = this.f23721f;
            CourseViewModel courseViewModelM9858q0 = courseFragment.m9858q0();
            C36351 c36351 = new C36351(courseFragment, null);
            this.f23720e = 1;
            if (C0062b.m369m0(courseViewModelM9858q0.f23962k0, c36351, this) == coroutineSingletons) {
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
