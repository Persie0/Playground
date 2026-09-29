package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p155he.C6041e;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9327o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$checkLessonUpdate$1", m19206f = "LessonViewModel.kt", m19207l = {2012, 2014, 2015}, m19208m = "invokeSuspend")
final class LessonViewModel$checkLessonUpdate$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public LessonStudyBookmark f27646e;

    /* JADX INFO: renamed from: f */
    public int f27647f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonViewModel f27648g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$checkLessonUpdate$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$checkLessonUpdate$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27648g = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$checkLessonUpdate$1(this.f27648g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$checkLessonUpdate$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x008f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0091  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[LOOP:0: B:31:0x00aa->B:33:0x00b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:76:0x0168  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f1 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonStudyBookmark lessonStudyBookmark;
        Object objMo9525m;
        LessonStudyBookmark lessonStudyBookmark2;
        LessonStudyBookmark lessonStudyBookmark3;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        Object next;
        String str;
        String str2;
        String str3;
        C7570d c7570d;
        boolean z10;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27647f;
        LessonViewModel lessonViewModel = this.f27648g;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            if (!((Collection) lessonViewModel.f27424P0.getValue()).isEmpty()) {
                int iM10152y2 = lessonViewModel.m10152y2();
                this.f27647f = 1;
                obj = lessonViewModel.f27465d.mo9525m(iM10152y2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C9072e.f47360a;
        }
        if (i10 == 1) {
            C7499b.m14977z0(obj);
        } else if (i10 == 2) {
            LessonStudyBookmark lessonStudyBookmark4 = this.f27646e;
            C7499b.m14977z0(obj);
            lessonStudyBookmark = lessonStudyBookmark4;
            InterfaceC3324a interfaceC3324a = lessonViewModel.f27465d;
            int iM10152y3 = lessonViewModel.m10152y2();
            this.f27646e = lessonStudyBookmark;
            this.f27647f = 3;
            objMo9525m = interfaceC3324a.mo9525m(iM10152y3, this);
            if (objMo9525m == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonStudyBookmark2 = lessonStudyBookmark;
            obj = objMo9525m;
        } else {
            if (i10 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lessonStudyBookmark2 = this.f27646e;
            C7499b.m14977z0(obj);
        }
        lessonStudyBookmark3 = (LessonStudyBookmark) obj;
        Iterable iterable = (Iterable) lessonViewModel.f27424P0.getValue();
        arrayList = new ArrayList();
        it = iterable.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((C7567a) it.next()).f41703c, arrayList);
        }
        it2 = arrayList.iterator();
        do {
            if (it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            c7570d = (C7570d) next;
            if (lessonStudyBookmark3 != null) {
                int i11 = c7570d.f41726f;
                num = lessonStudyBookmark3.f21841a;
                if (num == null && num.intValue() == i11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } while (!z10);
        C7570d c7570d2 = (C7570d) next;
        str = "";
        if (lessonStudyBookmark2 != null || (str2 = lessonStudyBookmark2.f21843c) == null) {
            str2 = str;
        }
        if (lessonStudyBookmark3 != null && (str3 = lessonStudyBookmark3.f21843c) != null) {
            str = str3;
        }
        if (lessonStudyBookmark2 == null && lessonStudyBookmark3 != null) {
            try {
                if (!C5207g.m11106a(lessonStudyBookmark2.f21841a, lessonStudyBookmark3.f21841a) && str2.compareTo(str) < 0) {
                    if (c7570d2 != null && c7570d2.f41733m != lessonViewModel.m10147t2()) {
                        lessonViewModel.f27412L0.setValue(new Triple(new Integer(lessonViewModel.m10147t2()), new Integer(c7570d2.f41733m), C4924a.m10472m(1, str, "dd MMM, yyyy")));
                    }
                    lessonViewModel.f27400H0.mo14371k(C9072e.f47360a);
                }
            } catch (Exception e10) {
                C6041e.m12476a().m12477b(e10);
            }
        }
        return C9072e.f47360a;
        lessonStudyBookmark = (LessonStudyBookmark) obj;
        InterfaceC3324a interfaceC3324a2 = lessonViewModel.f27465d;
        String strMo498E1 = lessonViewModel.mo498E1();
        int iM10152y4 = lessonViewModel.m10152y2();
        this.f27646e = lessonStudyBookmark;
        this.f27647f = 2;
        if (interfaceC3324a2.mo9497S(iM10152y4, strMo498E1, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        InterfaceC3324a interfaceC3324a3 = lessonViewModel.f27465d;
        int iM10152y5 = lessonViewModel.m10152y2();
        this.f27646e = lessonStudyBookmark;
        this.f27647f = 3;
        objMo9525m = interfaceC3324a3.mo9525m(iM10152y5, this);
        if (objMo9525m == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonStudyBookmark2 = lessonStudyBookmark;
        obj = objMo9525m;
        lessonStudyBookmark3 = (LessonStudyBookmark) obj;
        Iterable iterable2 = (Iterable) lessonViewModel.f27424P0.getValue();
        arrayList = new ArrayList();
        it = iterable2.iterator();
        while (it.hasNext()) {
            C9327o.m17684D(((C7567a) it.next()).f41703c, arrayList);
        }
        it2 = arrayList.iterator();
        do {
            if (it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            c7570d = (C7570d) next;
            if (lessonStudyBookmark3 != null) {
                int i12 = c7570d.f41726f;
                num = lessonStudyBookmark3.f21841a;
                if (num == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                z10 = false;
            }
        } while (!z10);
        C7570d c7570d3 = (C7570d) next;
        str = "";
        if (lessonStudyBookmark2 != null) {
            str2 = str;
        } else {
            str2 = str;
        }
        if (lessonStudyBookmark3 != null) {
            str = str3;
        }
        if (lessonStudyBookmark2 == null) {
        }
        return C9072e.f47360a;
    }
}
