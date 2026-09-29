package com.lingq.feature.edit;

import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Note;
import com.lingq.core.domain.model.lesson.Translation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3849zx;
import p000.aj3;
import p000.c32;
import p000.cma;
import p000.e83;
import p000.fa4;
import p000.kx8;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zaa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3", m4291f = "LessonEditViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f25894a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f25895b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f25896c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f25897d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2077c f25898e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3(int i, C2077c c2077c, Continuation continuation) {
        super(3, continuation);
        this.f25897d = i;
        this.f25898e = c2077c;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3 lessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3 = new LessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3(this.f25897d, this.f25898e, (Continuation) obj3);
        lessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3.f25895b = (e83) obj;
        lessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3.f25896c = (Object[]) obj2;
        return lessonEditViewModel$buildPageStateFlow$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [e83, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object next2;
        kx8 kx8Var;
        ?? r2;
        C2077c c2077c = this.f25898e;
        cma cmaVar = c2077c.f25940j;
        e83 e83Var = this.f25895b;
        Object[] objArr = this.f25896c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25894a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = objArr[0];
            LessonTranslationSentence lessonTranslationSentence = obj2 instanceof LessonTranslationSentence ? (LessonTranslationSentence) obj2 : null;
            Object obj3 = objArr[1];
            obj3.getClass();
            boolean zBooleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = objArr[2];
            obj4.getClass();
            boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
            Object obj5 = objArr[3];
            obj5.getClass();
            boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
            Object obj6 = objArr[4];
            obj6.getClass();
            long jLongValue = ((Long) obj6).longValue();
            Object obj7 = objArr[5];
            obj7.getClass();
            List list = (List) obj7;
            Object obj8 = objArr[6];
            obj8.getClass();
            int iIntValue = ((Integer) obj8).intValue();
            if (lessonTranslationSentence == null) {
                r2 = 0;
                kx8Var = new kx8(null, null, null, null, 1023);
            } else {
                Double d = lessonTranslationSentence.f19295d;
                Double d2 = lessonTranslationSentence.f19294c;
                List list2 = lessonTranslationSentence.f19298g;
                List list3 = lessonTranslationSentence.f19297f;
                boolean z = iIntValue == this.f25897d;
                boolean z2 = z ? zBooleanValue : false;
                boolean z3 = z ? zBooleanValue2 : false;
                boolean z4 = z ? zBooleanValue3 : false;
                if (!z) {
                    jLongValue = 0;
                }
                long j = jLongValue;
                List list4 = list3;
                Iterator it = list4.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fa4.m11650l(((Translation) next).f19335b, cmaVar.mo4580K1()));
                Translation translation = (Translation) next;
                zaa zaaVar = translation != null ? new zaa(translation.f19335b, translation.f19334a) : null;
                ArrayList<Translation> arrayList = new ArrayList();
                for (Object obj9 : list4) {
                    if (!fa4.m11650l(((Translation) obj9).f19335b, cmaVar.mo4580K1())) {
                        arrayList.add(obj9);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                for (Translation translation2 : arrayList) {
                    arrayList2.add(new zaa(translation2.f19335b, translation2.f19334a));
                }
                List list5 = list2;
                Iterator it2 = list5.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!fa4.m11650l(((Note) next2).f19332a, cmaVar.mo4580K1()));
                Note note = (Note) next2;
                zaa zaaVar2 = note != null ? new zaa(note.f19332a, note.f19333b) : null;
                ArrayList<Note> arrayList3 = new ArrayList();
                for (Object obj10 : list5) {
                    zaa zaaVar3 = zaaVar;
                    Double d3 = d;
                    if (!fa4.m11650l(((Note) obj10).f19332a, cmaVar.mo4580K1())) {
                        arrayList3.add(obj10);
                    }
                    zaaVar = zaaVar3;
                    d = d3;
                }
                zaa zaaVar4 = zaaVar;
                Double d4 = d;
                ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
                for (Note note2 : arrayList3) {
                    arrayList4.add(new zaa(note2.f19332a, note2.f19333b));
                }
                C3849zx c3849zx = (!c2077c.f25943m && d2 == null && d4 == null) ? null : new C3849zx(Math.round((d2 != null ? d2.doubleValue() : 0.0d) * 10.0d) / 10.0d, Math.round((d4 != null ? d4.doubleValue() : 0.0d) * 10.0d) / 10.0d, z4, j);
                ArrayList arrayList5 = new ArrayList(v91.m23189q0(list4, 10));
                Iterator it3 = list4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((Translation) it3.next()).f19335b);
                }
                Set setM22627s1 = u91.m22627s1(arrayList5);
                List list6 = list;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj11 : list6) {
                    if (!setM22627s1.contains(((DictionaryLocale) obj11).f19021a)) {
                        arrayList6.add(obj11);
                    }
                }
                ArrayList arrayList7 = new ArrayList(v91.m23189q0(list5, 10));
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arrayList7.add(((Note) it4.next()).f19332a);
                }
                Set setM22627s2 = u91.m22627s1(arrayList7);
                ArrayList arrayList8 = new ArrayList();
                for (Object obj12 : list6) {
                    if (!setM22627s2.contains(((DictionaryLocale) obj12).f19021a)) {
                        arrayList8.add(obj12);
                    }
                }
                String str = lessonTranslationSentence.f19296e;
                zaa zaaVar5 = zaaVar4 == null ? new zaa(cmaVar.mo4580K1(), "") : zaaVar4;
                if (zaaVar2 == null) {
                    zaaVar2 = new zaa(cmaVar.mo4580K1(), "");
                }
                kx8Var = new kx8(str, zaaVar5, arrayList2, zaaVar2, arrayList4, z3, arrayList8, c3849zx, z2, arrayList6);
                r2 = 0;
            }
            this.f25895b = r2;
            this.f25896c = r2;
            this.f25894a = 1;
            if (e83Var.emit(kx8Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
