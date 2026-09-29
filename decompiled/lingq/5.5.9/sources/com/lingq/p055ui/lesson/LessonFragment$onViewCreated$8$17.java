package com.lingq.p055ui.lesson;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.Locale;
import ki.C6698d;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$17", m19206f = "LessonFragment.kt", m19207l = {756}, m19208m = "invokeSuspend")
public final class LessonFragment$onViewCreated$8$17 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27113e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonFragment f27114f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonFragment$onViewCreated$8$17$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lki/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonFragment$onViewCreated$8$17$1", m19206f = "LessonFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41781 extends SuspendLambda implements InterfaceC2056p<C6698d, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f27115e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonFragment f27116f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41781(LessonFragment lessonFragment, InterfaceC9968c<? super C41781> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27116f = lessonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41781 c41781 = new C41781(this.f27116f, interfaceC9968c);
            c41781.f27115e = obj;
            return c41781;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C6698d c6698d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41781) mo1336a(c6698d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            int i10;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C6698d c6698d = (C6698d) this.f27115e;
            if (c6698d != null) {
                boolean z10 = c6698d.f37876b;
                LessonFragment lessonFragment = this.f27116f;
                if (z10 || (i10 = c6698d.f37877c) <= 0 || i10 >= 100) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
                    TextView textView = lessonFragment.m10107o0().f44704o;
                    C5207g.m11110e(textView, "binding.tbPlayDownloadProgress");
                    C4924a.m10442U(textView);
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = LessonFragment.f27053M0;
                    TextView textView2 = lessonFragment.m10107o0().f44704o;
                    C5207g.m11110e(textView2, "binding.tbPlayDownloadProgress");
                    C4924a.m10457e0(textView2);
                    C0009a.m32u(new Object[]{new Integer(i10)}, 1, Locale.getDefault(), "%d%%", "format(locale, format, *args)", lessonFragment.m10107o0().f44704o);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonFragment$onViewCreated$8$17(LessonFragment lessonFragment, InterfaceC9968c<? super LessonFragment$onViewCreated$8$17> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27114f = lessonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonFragment$onViewCreated$8$17(this.f27114f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonFragment$onViewCreated$8$17) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27113e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LessonFragment.f27053M0;
            LessonFragment lessonFragment = this.f27114f;
            LessonViewModel lessonViewModelM10109q0 = lessonFragment.m10109q0();
            C41781 c41781 = new C41781(lessonFragment, null);
            this.f27113e = 1;
            if (C0062b.m369m0(lessonViewModelM10109q0.f27491k1, c41781, this) == coroutineSingletons) {
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
