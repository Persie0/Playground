package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.textfield.TextInputEditText;
import com.lingq.shared.network.result.ResultRegistrationError;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8287g1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$4", m19206f = "RegisterFragment.kt", m19207l = {308}, m19208m = "invokeSuspend")
public final class RegisterFragment$onViewCreated$4$11$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30764e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisterFragment f30765f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8287g1 f30766g;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationError;", "error", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$4$1", m19206f = "RegisterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47461 extends SuspendLambda implements InterfaceC2056p<ResultRegistrationError, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30767e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C8287g1 f30768f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47461(C8287g1 c8287g1, InterfaceC9968c<? super C47461> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30768f = c8287g1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47461 c47461 = new C47461(this.f30768f, interfaceC9968c);
            c47461.f30767e = obj;
            return c47461;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ResultRegistrationError resultRegistrationError, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47461) mo1336a(resultRegistrationError, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ResultRegistrationError resultRegistrationError = (ResultRegistrationError) this.f30767e;
            C8287g1 c8287g1 = this.f30768f;
            c8287g1.f44810n.setError((CharSequence) C6752c.m13425S(resultRegistrationError.f18919b));
            c8287g1.f44810n.requestFocus();
            CharSequence charSequence = (CharSequence) C6752c.m13425S(resultRegistrationError.f18918a);
            TextInputEditText textInputEditText = c8287g1.f44804h;
            textInputEditText.setError(charSequence);
            textInputEditText.requestFocus();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$onViewCreated$4$11$4(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30765f = registerFragment;
        this.f30766g = c8287g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RegisterFragment$onViewCreated$4$11$4(this.f30766g, this.f30765f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RegisterFragment$onViewCreated$4$11$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30764e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            AuthenticationViewModel authenticationViewModelM10343q0 = this.f30765f.m10343q0();
            C47461 c47461 = new C47461(this.f30766g, null);
            this.f30764e = 1;
            if (C0062b.m369m0(authenticationViewModelM10343q0.f30542T, c47461, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
