package com.lingq.core.data.repository;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Translation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.fa4;
import p000.j65;
import p000.vk9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.LessonRepositoryImpl$observeSentenceTranslations$1", m4291f = "LessonRepositoryImpl.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonRepositoryImpl$observeSentenceTranslations$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f15478a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f15479b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f15480c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$observeSentenceTranslations$1(String str, Continuation continuation) {
        super(3, continuation);
        this.f15480c = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LessonRepositoryImpl$observeSentenceTranslations$1 lessonRepositoryImpl$observeSentenceTranslations$1 = new LessonRepositoryImpl$observeSentenceTranslations$1(this.f15480c, (Continuation) obj3);
        lessonRepositoryImpl$observeSentenceTranslations$1.f15478a = (List) obj;
        lessonRepositoryImpl$observeSentenceTranslations$1.f15479b = (List) obj2;
        return lessonRepositoryImpl$observeSentenceTranslations$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        List<j65> list = this.f15478a;
        List<LessonTranslationSentence> list2 = this.f15479b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (LessonTranslationSentence lessonTranslationSentence : list2) {
            List list3 = lessonTranslationSentence.f19297f;
            int i = lessonTranslationSentence.f19292a;
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((Translation) next).f19335b, this.f15480c));
            Translation translation = (Translation) next;
            if (translation != null) {
                String str = translation.f19334a;
                if (!vk9.m23391n0(str)) {
                    linkedHashMap.put(new Integer(i), str);
                    arrayList.add(new Integer(i));
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (j65 j65Var : list) {
            String str2 = j65Var.f45116c;
            int i2 = j65Var.f45115b;
            if (!vk9.m23391n0(str2)) {
                linkedHashMap.put(new Integer(i2), j65Var.f45116c);
                arrayList2.add(new Integer(i2));
            }
        }
        return AbstractC3194a.m15371X(linkedHashMap);
    }
}
