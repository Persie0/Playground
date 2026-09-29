package com.lingq.feature.reader.old;

import android.os.Bundle;
import androidx.fragment.app.AbstractC0638f;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.ded;
import p000.du0;
import p000.jfa;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$24", m4291f = "ReaderFragment.kt", m4292l = {1178}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$24 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28312b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$24$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$24$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22921 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28313a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28314b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22921(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28314b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22921 c22921 = new C22921(this.f28314b, continuation);
            c22921.f28313a = obj;
            return c22921;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22921 c22921 = (C22921) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22921.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f28313a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            List list = (List) pair.f47624b;
            Bundle bundle = new Bundle();
            bundle.putInt("page", iIntValue);
            bundle.putStringArrayList("words", new ArrayList<>(list));
            AbstractC0638f abstractC0638fM14427j = jfa.m14427j(this.f28314b);
            int i = R$id.fragment_top;
            if (((LessonMoveKnownFragment) (abstractC0638fM14427j != null ? abstractC0638fM14427j.m2137E(LessonMoveKnownFragment.class.getName()) : null)) == null) {
                LessonMoveKnownFragment lessonMoveKnownFragment = new LessonMoveKnownFragment();
                lessonMoveKnownFragment.m2095W(bundle);
                if (abstractC0638fM14427j != null) {
                    ded.m10316b(abstractC0638fM14427j, lessonMoveKnownFragment, i, LessonMoveKnownFragment.class.getName(), true);
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$24(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28312b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$24(this.f28312b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$24) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28311a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28312b;
            du0 du0Var = readerFragment.m9290W0().f29423y1;
            C22921 c22921 = new C22921(readerFragment, null);
            this.f28311a = 1;
            if (AbstractC3224d.m15529h(du0Var, c22921, this) == coroutineSingletons) {
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
