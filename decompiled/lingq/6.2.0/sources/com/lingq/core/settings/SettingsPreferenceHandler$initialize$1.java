package com.lingq.core.settings;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.settings.domain.C1867f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.eh9;
import p000.p29;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$initialize$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {89}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsPreferenceHandler$initialize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p29 f22665b;

    /* JADX INFO: renamed from: com.lingq.core.settings.SettingsPreferenceHandler$initialize$1$1 */
    @c32(m4290c = "com.lingq.core.settings.SettingsPreferenceHandler$initialize$1$1", m4291f = "SettingsPreferenceHandler.kt", m4292l = {38}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18571 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f22666a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f22667b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ p29 f22668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18571(p29 p29Var, Continuation continuation) {
            super(2, continuation);
            this.f22668c = p29Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18571 c18571 = new C18571(this.f22668c, continuation);
            c18571.f22667b = obj;
            return c18571;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18571) create((Language) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list;
            Language language = (Language) this.f22667b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f22666a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (language != null && (list = language.f19041r) != null) {
                    p29 p29Var = this.f22668c;
                    C1867f c1867f = (C1867f) p29Var.f55498j;
                    String strMo4589b2 = ((cma) p29Var.f55499k).mo4589b2();
                    this.f22667b = null;
                    this.f22666a = 1;
                    if (c1867f.m8630c(strMo4589b2, list, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPreferenceHandler$initialize$1(p29 p29Var, Continuation continuation) {
        super(2, continuation);
        this.f22665b = p29Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPreferenceHandler$initialize$1(this.f22665b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPreferenceHandler$initialize$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22664a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            p29 p29Var = this.f22665b;
            eh9 eh9VarMo4572B0 = ((cma) p29Var.f55499k).mo4572B0();
            C18571 c18571 = new C18571(p29Var, null);
            eh9VarMo4572B0.getClass();
            this.f22664a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo4572B0, c18571, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
