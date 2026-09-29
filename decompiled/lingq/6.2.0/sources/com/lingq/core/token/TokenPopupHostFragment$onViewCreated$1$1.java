package com.lingq.core.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.lesson.TokenType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c3a;
import p000.c83;
import p000.n2a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenPopupHostFragment$onViewCreated$1$1", m4291f = "TokenPopupHostFragment.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenPopupHostFragment$onViewCreated$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23469a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ TokenPopupHostFragment f23470b;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenPopupHostFragment$onViewCreated$1$1$1 */
    @c32(m4290c = "com.lingq.core.token.TokenPopupHostFragment$onViewCreated$1$1$1", m4291f = "TokenPopupHostFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18921 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f23471a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TokenPopupHostFragment f23472b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18921(TokenPopupHostFragment tokenPopupHostFragment, Continuation continuation) {
            super(2, continuation);
            this.f23472b = tokenPopupHostFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18921 c18921 = new C18921(this.f23472b, continuation);
            c18921.f23471a = obj;
            return c18921;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C18921 c18921 = (C18921) create((TokenPopupData) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18921.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            TokenPopupData tokenPopupData = (TokenPopupData) this.f23471a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            TokenType tokenType = tokenPopupData.f23447c;
            TokenType tokenType2 = TokenType.NewWordOrPhraseType;
            TokenPopupHostFragment tokenPopupHostFragment = this.f23472b;
            if (tokenType == tokenType2) {
                tokenPopupHostFragment.m8689c0().m8760d3(new c3a(tokenPopupData, false));
            } else {
                tokenPopupHostFragment.m8689c0().m8760d3(n2a.f52243a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenPopupHostFragment$onViewCreated$1$1(TokenPopupHostFragment tokenPopupHostFragment, Continuation continuation) {
        super(2, continuation);
        this.f23470b = tokenPopupHostFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TokenPopupHostFragment$onViewCreated$1$1(this.f23470b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TokenPopupHostFragment$onViewCreated$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23469a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TokenPopupHostFragment tokenPopupHostFragment = this.f23470b;
            c83 c83VarMo8779v2 = tokenPopupHostFragment.m8689c0().f23868F.mo8779v2();
            C18921 c18921 = new C18921(tokenPopupHostFragment, null);
            this.f23469a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8779v2, c18921, this) == coroutineSingletons) {
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
