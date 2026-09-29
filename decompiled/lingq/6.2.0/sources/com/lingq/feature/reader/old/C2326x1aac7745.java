package com.lingq.feature.reader.old;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "ReaderPageFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2326x1aac7745 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ReaderPageFragment f28463b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f28464c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderPageFragment f28465d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f28466e;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderPageFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "ReaderPageFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ReaderPageFragment f28468b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f28469c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, ReaderPageFragment readerPageFragment, Continuation continuation) {
            super(2, continuation);
            this.f28468b = readerPageFragment;
            this.f28469c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28469c, this.f28468b, continuation);
            anonymousClass1.f28467a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            anonymousClass1.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BufferedReader bufferedReader;
            String line;
            un1 un1Var = (un1) this.f28467a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ReaderPageFragment readerPageFragment = this.f28468b;
            BufferedReader bufferedReader2 = null;
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$1(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$2(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$3(readerPageFragment, null), 3);
            int i = this.f28469c;
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$4(i, readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$5(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$6(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$7(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$8(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$9(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$10(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$11(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$12(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$13(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$14(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$15(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$16(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$17(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$18(i, readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$19(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$20(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$21(readerPageFragment, null), 3);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.miui.ui.version.name").getInputStream()), 1024);
                try {
                    line = bufferedReader.readLine();
                    line.getClass();
                    bufferedReader.close();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (IOException unused) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    }
                    line = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
            }
            if (!TextUtils.isEmpty(line)) {
                wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$22(readerPageFragment, null), 3);
            }
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$23(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$24(readerPageFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new ReaderPageFragment$onViewCreated$2$25(readerPageFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2326x1aac7745(ReaderPageFragment readerPageFragment, Lifecycle$State lifecycle$State, Continuation continuation, ReaderPageFragment readerPageFragment2, int i) {
        super(2, continuation);
        this.f28463b = readerPageFragment;
        this.f28464c = lifecycle$State;
        this.f28465d = readerPageFragment2;
        this.f28466e = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2326x1aac7745(this.f28463b, this.f28464c, continuation, this.f28465d, this.f28466e);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2326x1aac7745) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28462a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f28463b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28466e, this.f28465d, null);
            this.f28462a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f28464c, anonymousClass1, this) == coroutineSingletons) {
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
