package com.lingq.p055ui.lesson;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7117d;
import ni.C7793a;
import p159hi.C6052c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
public final class LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2<T> implements InterfaceC7117d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7117d f27726a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonViewModel f27727b;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2$1 */
    @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2", m19206f = "LessonViewModel.kt", m19207l = {223}, m19208m = "emit")
    public static final class C42561 extends ContinuationImpl {

        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object f27728d;

        /* JADX INFO: renamed from: e */
        public int f27729e;

        public C42561(InterfaceC9968c interfaceC9968c) {
            super(interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) {
            this.f27728d = obj;
            this.f27729e |= Integer.MIN_VALUE;
            return LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2.this.mo1339r(null, this);
        }
    }

    public LessonViewModel$phrases$2$invokeSuspend$$inlined$map$1$2(InterfaceC7117d interfaceC7117d, LessonViewModel lessonViewModel) {
        this.f27726a = interfaceC7117d;
        this.f27727b = lessonViewModel;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
        C42561 c42561;
        if (interfaceC9968c instanceof C42561) {
            c42561 = (C42561) interfaceC9968c;
            int i10 = c42561.f27729e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c42561.f27729e = i10 - Integer.MIN_VALUE;
            } else {
                c42561 = new C42561(interfaceC9968c);
            }
        } else {
            c42561 = new C42561(interfaceC9968c);
        }
        Object obj2 = c42561.f27728d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c42561.f27729e;
        if (i11 == 0) {
            C7499b.m14977z0(obj2);
            List list = (List) obj;
            int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(list, 10));
            if (iM14941g0 < 16) {
                iM14941g0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
            for (T t10 : list) {
                String str = ((C6052c) t10).f35735a;
                Locale locale = this.f27727b.f27495m0;
                C5207g.m11110e(locale, "locale");
                linkedHashMap.put(C7793a.m15502f(str, locale), t10);
            }
            c42561.f27729e = 1;
            if (this.f27726a.mo1339r(linkedHashMap, c42561) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj2);
        }
        return C9072e.f47360a;
    }
}
