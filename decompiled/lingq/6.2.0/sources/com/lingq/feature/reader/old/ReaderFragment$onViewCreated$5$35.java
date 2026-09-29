package com.lingq.feature.reader.old;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$layout;
import com.lingq.feature.reader.R$string;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.c83;
import p000.fr5;
import p000.iw7;
import p000.lfa;
import p000.ow7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$35", m4291f = "ReaderFragment.kt", m4292l = {1567}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderFragment$onViewCreated$5$35 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28356a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderFragment f28357b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$35$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderFragment$onViewCreated$5$35$1", m4291f = "ReaderFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23041 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ReaderFragment f28358a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23041(ReaderFragment readerFragment, Continuation continuation) {
            super(2, continuation);
            this.f28358a = readerFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C23041(this.f28358a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23041 c23041 = (C23041) create((xfa) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23041.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderFragment readerFragment = this.f28358a;
            View viewInflate = LayoutInflater.from(readerFragment.m2090R()).inflate(R$layout.view_dialog_move_to_known, (ViewGroup) null, false);
            int i = R$id.switchMoveToKnown;
            MaterialSwitch materialSwitch = (MaterialSwitch) lfa.m16159c(viewInflate, i);
            if (materialSwitch == null) {
                C3386nv.m17635v("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
                return null;
            }
            materialSwitch.setChecked(readerFragment.m9290W0().m9330j3());
            materialSwitch.setOnCheckedChangeListener(new C2404f(readerFragment));
            fr5 fr5VarM12029l = new fr5(readerFragment.m2089Q(), 0).m12029l(viewInflate);
            fr5VarM12029l.m12028k(R$string.tooltips_move_words_to_known);
            fr5VarM12029l.m12022e(com.lingq.core.p012ui.R$string.ui_ok, ow7.f55076b).m12025h(com.lingq.core.p012ui.R$string.settings_text_lesson_settings, new iw7(1, readerFragment)).m25557a();
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderFragment$onViewCreated$5$35(ReaderFragment readerFragment, Continuation continuation) {
        super(2, continuation);
        this.f28357b = readerFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderFragment$onViewCreated$5$35(this.f28357b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderFragment$onViewCreated$5$35) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28356a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            ReaderFragment readerFragment = this.f28357b;
            c83 c83VarMo8743L2 = readerFragment.m9290W0().f29344c.mo8743L2();
            C23041 c23041 = new C23041(readerFragment, null);
            this.f28356a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8743L2, c23041, this) == coroutineSingletons) {
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
