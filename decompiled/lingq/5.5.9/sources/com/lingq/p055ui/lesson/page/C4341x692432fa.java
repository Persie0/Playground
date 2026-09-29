package com.lingq.p055ui.lesson.page;

import android.text.TextUtils;
import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "LessonPageFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4341x692432fa extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28361e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f28362f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f28363g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonPageFragment f28364h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f28365i;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28366e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28367f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f28368g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28367f = lessonPageFragment;
            this.f28368g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28368g, this.f28367f, interfaceC9968c);
            anonymousClass1.f28366e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            BufferedReader bufferedReader;
            String line;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f28366e;
            LessonPageFragment lessonPageFragment = this.f28367f;
            BufferedReader bufferedReader2 = null;
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$1(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$2(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$3(lessonPageFragment, null), 3);
            int i10 = this.f28368g;
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$4(i10, lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$5(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$6(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$7(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$8(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$9(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$10(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$11(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$12(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$13(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$14(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$15(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$16(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$17(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$18(i10, lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$19(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$20(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$21(i10, lessonPageFragment, null), 3);
            List<Integer> list = C6716m.f37937a;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
                try {
                    line = bufferedReader.readLine();
                    C5207g.m11110e(line, "input.readLine()");
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                } catch (IOException unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                    }
                    line = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
            if (!TextUtils.isEmpty(line)) {
                C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$22(lessonPageFragment, null), 3);
            }
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$23(lessonPageFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LessonPageFragment$onViewCreated$2$24(lessonPageFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4341x692432fa(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, LessonPageFragment lessonPageFragment, int i10) {
        super(2, interfaceC9968c);
        this.f28362f = fragment;
        this.f28363g = state;
        this.f28364h = lessonPageFragment;
        this.f28365i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4341x692432fa(this.f28362f, this.f28363g, interfaceC9968c, this.f28364h, this.f28365i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4341x692432fa) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28361e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f28362f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28365i, this.f28364h, null);
            this.f28361e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f28363g, anonymousClass1, this) == coroutineSingletons) {
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
