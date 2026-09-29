package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$prepareSentenceToSpeak$1", m19206f = "LessonViewModel.kt", m19207l = {1425, 1439}, m19208m = "invokeSuspend")
public final class LessonViewModel$prepareSentenceToSpeak$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Double f27735e;

    /* JADX INFO: renamed from: f */
    public Double f27736f;

    /* JADX INFO: renamed from: g */
    public int f27737g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonViewModel f27738h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f27739i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f27740j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$prepareSentenceToSpeak$1(LessonViewModel lessonViewModel, int i10, float f3, InterfaceC9968c<? super LessonViewModel$prepareSentenceToSpeak$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27738h = lessonViewModel;
        this.f27739i = i10;
        this.f27740j = f3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$prepareSentenceToSpeak$1(this.f27738h, this.f27739i, this.f27740j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$prepareSentenceToSpeak$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00af  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0109  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Double d10;
        Double d11;
        Double d12;
        LessonStudy lessonStudy;
        String str;
        boolean z10;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27737g;
        float f3 = this.f27740j;
        LessonViewModel lessonViewModel = this.f27738h;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Double d13 = this.f27736f;
                d10 = this.f27735e;
                C7499b.m14977z0(obj);
                d12 = d13;
            }
            if (((Boolean) obj).booleanValue()) {
                lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
                if (lessonStudy != null) {
                    str = lessonStudy.f21820f;
                } else {
                    str = null;
                }
                if (str != null || C7661i.m15250P2(str)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    LessonStudy lessonStudy2 = (LessonStudy) lessonViewModel.f27515w0.getValue();
                    str2 = lessonStudy2 != null ? lessonStudy2.f21835u : null;
                    if (str2 != null || C7661i.m15250P2(str2)) {
                        LessonViewModel.m10133o2(lessonViewModel, f3);
                    } else {
                        lessonViewModel.f27395F0.mo14371k(new AbstractC4272e.a(d10.doubleValue(), d12.doubleValue()));
                    }
                } else {
                    lessonViewModel.f27408K.mo9337M1(lessonViewModel.m10152y2(), d10.doubleValue(), d12, this.f27740j);
                }
            } else {
                LessonViewModel.m10133o2(lessonViewModel, f3);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC3324a interfaceC3324a = lessonViewModel.f27465d;
        int iM10152y2 = lessonViewModel.m10152y2();
        LessonStudy lessonStudy3 = (LessonStudy) lessonViewModel.f27515w0.getValue();
        String str3 = lessonStudy3 != null ? lessonStudy3.f21820f : null;
        if (str3 != null) {
            C7661i.m15250P2(str3);
        }
        this.f27737g = 1;
        obj = interfaceC3324a.mo9534v(iM10152y2, this.f27739i, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        List list = (List) obj;
        if (!(list == null || list.isEmpty())) {
            d10 = ((LessonStudyTranslationSentence) C6752c.m13423Q(list)).f21897c;
            Double d14 = ((LessonStudyTranslationSentence) C6752c.m13423Q(list)).f21898d;
            if (d14 == null) {
                d11 = list.size() > 1 ? ((LessonStudyTranslationSentence) list.get(1)).f21897c : null;
            } else {
                d11 = d14;
            }
            if (d10 == null || d11 == null || ((int) d11.doubleValue()) == 0) {
                LessonViewModel.m10133o2(lessonViewModel, f3);
            } else {
                PreferenceStoreImpl$special$$inlined$map$8 preferenceStoreImpl$special$$inlined$map$8Mo9583b0 = lessonViewModel.f27492l.mo9583b0();
                this.f27735e = d10;
                this.f27736f = d11;
                this.f27737g = 2;
                Object objM14360a = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$8Mo9583b0, this);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                d12 = d11;
                obj = objM14360a;
                if (((Boolean) obj).booleanValue()) {
                    lessonStudy = (LessonStudy) lessonViewModel.f27515w0.getValue();
                    if (lessonStudy != null) {
                        str = lessonStudy.f21820f;
                    } else {
                        str = null;
                    }
                    if (str != null) {
                        z10 = true;
                    } else {
                        z10 = true;
                    }
                    if (z10) {
                        lessonViewModel.f27408K.mo9337M1(lessonViewModel.m10152y2(), d10.doubleValue(), d12, this.f27740j);
                    } else {
                        LessonStudy lessonStudy4 = (LessonStudy) lessonViewModel.f27515w0.getValue();
                        if (lessonStudy4 != null) {
                        }
                        if (str2 != null || C7661i.m15250P2(str2)) {
                            lessonViewModel.f27395F0.mo14371k(new AbstractC4272e.a(d10.doubleValue(), d12.doubleValue()));
                        } else {
                            LessonViewModel.m10133o2(lessonViewModel, f3);
                        }
                    }
                } else {
                    LessonViewModel.m10133o2(lessonViewModel, f3);
                }
            }
        }
        return C9072e.f47360a;
    }
}
