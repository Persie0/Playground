package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.domain.model.lesson.Translation;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3489q9;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.fa4;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$prepareSentenceTranslation$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1276}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$prepareSentenceTranslation$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f28684a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2411m f28685b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28686c;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageViewModel$prepareSentenceTranslation$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$prepareSentenceTranslation$1$1", m4291f = "ReaderPageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23671 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28687a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2411m f28688b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28689c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f28690d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23671(int i, C2411m c2411m, String str, Continuation continuation) {
            super(2, continuation);
            this.f28688b = c2411m;
            this.f28689c = i;
            this.f28690d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23671 c23671 = new C23671(this.f28689c, this.f28688b, this.f28690d, continuation);
            c23671.f28687a = obj;
            return c23671;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23671 c23671 = (C23671) create((LessonTranslationSentence) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23671.invokeSuspend(xfaVar);
            return xfaVar;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x006c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object next;
            Translation translation;
            String str;
            String lowerCase;
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) this.f28687a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int i = this.f28689c;
            C2411m c2411m = this.f28688b;
            if (lessonTranslationSentence != null) {
                HashSet hashSetM19788r = AbstractC3489q9.m19788r("zh-cn", "zh-t", "zh-tw", "zh");
                Iterator it = lessonTranslationSentence.f19297f.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    translation = (Translation) next;
                    Locale locale = Locale.ROOT;
                    str = this.f28690d;
                    lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                } while (!(hashSetM19788r.contains(lowerCase) ? hashSetM19788r.contains(translation.f19335b) : fa4.m11650l(translation.f19335b, str)));
                Translation translation2 = (Translation) next;
                if (translation2 != null) {
                    String str2 = translation2.f19334a;
                    if (str2.length() > 0) {
                        C3244l c3244l = c2411m.f29224b0;
                        c3244l.getClass();
                        c3244l.m15572j(null, str2);
                    } else {
                        c2411m.m9304Y2(i);
                    }
                } else {
                    c2411m.m9304Y2(i);
                }
            } else {
                c2411m.m9304Y2(i);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$prepareSentenceTranslation$1(C2411m c2411m, int i, Continuation continuation) {
        super(1, continuation);
        this.f28685b = c2411m;
        this.f28686c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderPageViewModel$prepareSentenceTranslation$1(this.f28685b, this.f28686c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderPageViewModel$prepareSentenceTranslation$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28684a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2411m c2411m = this.f28685b;
            String strMo4580K1 = c2411m.f29223b.mo4580K1();
            d65 d65Var = c2411m.f29233g;
            int i2 = c2411m.f29249q;
            int i3 = this.f28686c;
            c83 c83VarM7253K = ((C1295k) d65Var).m7253K(i3, i2);
            C23671 c23671 = new C23671(i3, c2411m, strMo4580K1, null);
            this.f28684a = 1;
            if (AbstractC3224d.m15529h(c83VarM7253K, c23671, this) == coroutineSingletons) {
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
