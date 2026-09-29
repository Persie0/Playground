package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.player.data.PlayerState;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cj3;
import p000.hc7;
import p000.ox7;
import p000.xfa;
import p000.xz7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$playerPosition$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$playerPosition$1 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ ox7 f28680a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ hc7 f28681b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f28682c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ AudioUnderlineMode f28683d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ReaderPageViewModel$playerPosition$1 readerPageViewModel$playerPosition$1 = new ReaderPageViewModel$playerPosition$1(5, (Continuation) obj5);
        readerPageViewModel$playerPosition$1.f28680a = (ox7) obj;
        readerPageViewModel$playerPosition$1.f28681b = (hc7) obj2;
        readerPageViewModel$playerPosition$1.f28682c = (List) obj3;
        readerPageViewModel$playerPosition$1.f28683d = (AudioUnderlineMode) obj4;
        return readerPageViewModel$playerPosition$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object next2;
        ox7 ox7Var = this.f28680a;
        hc7 hc7Var = this.f28681b;
        List list = this.f28682c;
        AudioUnderlineMode audioUnderlineMode = this.f28683d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        Object obj2 = null;
        if (audioUnderlineMode != AudioUnderlineMode.Off && hc7Var.f42174b == PlayerState.Playing) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) next;
                Double d = lessonTranslationSentence.f19294c;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                Double d2 = lessonTranslationSentence.f19295d;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                long j = hc7Var.f42177e;
                if (j >= ((long) (dDoubleValue * 1000.0d)) && j < ((long) (dDoubleValue2 * 1000.0d))) {
                    break;
                }
            }
            LessonTranslationSentence lessonTranslationSentence2 = (LessonTranslationSentence) next;
            int i = lessonTranslationSentence2 != null ? lessonTranslationSentence2.f19292a : -1;
            if (i != -1) {
                Iterator it2 = ox7Var.f55132e.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (((xz7) next2).f69010g != i);
                List list2 = ox7Var.f55132e;
                ListIterator listIterator = list2.listIterator(list2.size());
                while (listIterator.hasPrevious()) {
                    Object objPrevious = listIterator.previous();
                    if (((xz7) objPrevious).f69010g == i) {
                        obj2 = objPrevious;
                        break;
                    }
                }
                return new Pair(next2, obj2);
            }
        }
        return null;
    }
}
