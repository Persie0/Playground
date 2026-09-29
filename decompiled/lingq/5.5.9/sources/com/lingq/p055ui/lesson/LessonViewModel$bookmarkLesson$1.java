package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$bookmarkLesson$1", m19206f = "LessonViewModel.kt", m19207l = {1144, 1152, 1153}, m19208m = "invokeSuspend")
public final class LessonViewModel$bookmarkLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f27610e;

    /* JADX INFO: renamed from: f */
    public int f27611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27612g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f27613h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$bookmarkLesson$1(LessonViewModel lessonViewModel, int i10, InterfaceC9968c<? super LessonViewModel$bookmarkLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27612g = lessonViewModel;
        this.f27613h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$bookmarkLesson$1(this.f27612g, this.f27613h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$bookmarkLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        InterfaceC3324a interfaceC3324a;
        String strMo498E1;
        int iM10152y2;
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f27611f;
        LessonViewModel lessonViewModel = this.f27612g;
        if (i11 != 0) {
            if (i11 == 1) {
                str = this.f27610e;
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                str = this.f27610e;
                C7499b.m14977z0(obj);
                interfaceC3324a = lessonViewModel.f27465d;
                strMo498E1 = lessonViewModel.mo498E1();
                iM10152y2 = lessonViewModel.m10152y2();
                i10 = this.f27613h;
                this.f27610e = null;
                this.f27611f = 3;
                if (interfaceC3324a.mo9532t(iM10152y2, i10, strMo498E1, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        DateTimeZone dateTimeZone = DateTimeZone.f43949a;
        if (dateTimeZone == null) {
            throw new NullPointerException("Zone must not be null");
        }
        String string = new DateTime(dateTimeZone).toString();
        C5207g.m11110e(string, "now(DateTimeZone.UTC).toString()");
        InterfaceC7116c<Map<Integer, LessonStudyBookmark>> interfaceC7116cMo9689m = lessonViewModel.f27402I.mo9689m();
        this.f27610e = string;
        this.f27611f = 1;
        Object objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9689m, this);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        str = string;
        obj = objM14360a;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        linkedHashMapM13467T0.put(new Integer(lessonViewModel.m10152y2()), new LessonStudyBookmark("Android", str, new Integer(this.f27613h), str));
        this.f27610e = str;
        this.f27611f = 2;
        if (lessonViewModel.f27402I.mo9695s(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        interfaceC3324a = lessonViewModel.f27465d;
        strMo498E1 = lessonViewModel.mo498E1();
        iM10152y2 = lessonViewModel.m10152y2();
        i10 = this.f27613h;
        this.f27610e = null;
        this.f27611f = 3;
        if (interfaceC3324a.mo9532t(iM10152y2, i10, strMo498E1, str, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
