package com.lingq.feature.reader.old;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.token.TokenPopupData;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$14", m4291f = "ReaderFragment.kt", m4292l = {978}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$14 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28271b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$14$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$14$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22811 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28272a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderFragment f28273b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22811(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28273b = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22811 c22811 = new C22811(this.f28273b, continuation);
            c22811.f28272a = obj;
            return c22811;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22811 c22811 = (C22811) create((TokenPopupData) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22811.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TokenPopupData tokenPopupData = (TokenPopupData) this.f28272a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28273b;
            if (!readerFragment.m9287T0().f58118b.getBoolean("blueWordClicked", false) && tokenPopupData.f23447c == TokenType.WordType) {
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                c2412nM9290W0.getClass();
                ((C1240a) c2412nM9290W0.f29292L).m7025f("Blue word clicked", new Bundle());
                SharedPreferences.Editor editorEdit = c2412nM9290W0.f29280H.f58118b.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("blueWordClicked", true);
                editorEdit.apply();
            }
            if (tokenPopupData.f23454j != -1) {
                readerFragment.m9290W0().m9321b3(tokenPopupData.f23454j);
            }
            ReaderFragment.m9285R0(readerFragment, tokenPopupData);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$14(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28271b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$14(this.f28271b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$14) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28270a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28271b;
            c83 c83VarMo8756b0 = readerFragment.m9290W0().f29344c.mo8756b0();
            C22811 c22811 = new C22811(readerFragment, null);
            this.f28270a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8756b0, c22811, this) == coroutineSingletons) {
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
