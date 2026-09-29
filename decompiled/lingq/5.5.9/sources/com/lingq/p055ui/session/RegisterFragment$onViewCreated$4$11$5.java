package com.lingq.p055ui.session;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.network.result.ResultRegistrationValidation;
import com.lingq.shared.network.result.ValidationMessage;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8287g1;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$5", m19206f = "RegisterFragment.kt", m19207l = {319}, m19208m = "invokeSuspend")
public final class RegisterFragment$onViewCreated$4$11$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30769e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RegisterFragment f30770f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C8287g1 f30771g;

    /* JADX INFO: renamed from: com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultRegistrationValidation;", "error", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.session.RegisterFragment$onViewCreated$4$11$5$1", m19206f = "RegisterFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47471 extends SuspendLambda implements InterfaceC2056p<ResultRegistrationValidation, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30772e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RegisterFragment f30773f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C8287g1 f30774g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47471(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30773f = registerFragment;
            this.f30774g = c8287g1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47471 c47471 = new C47471(this.f30774g, this.f30773f, interfaceC9968c);
            c47471.f30772e = obj;
            return c47471;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ResultRegistrationValidation resultRegistrationValidation, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47471) mo1336a(resultRegistrationValidation, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String strM3600t;
            List<String> list;
            String str;
            String str2;
            List<String> list2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            ResultRegistrationValidation resultRegistrationValidation = (ResultRegistrationValidation) this.f30772e;
            ValidationMessage validationMessage = resultRegistrationValidation.f18924b;
            String str3 = "";
            RegisterFragment registerFragment = this.f30773f;
            C8287g1 c8287g1 = this.f30774g;
            if (validationMessage != null) {
                if (validationMessage == null || (list2 = validationMessage.f19142a) == null || (str2 = (String) C6752c.m13425S(list2)) == null) {
                    str2 = str3;
                }
                String strM3600t2 = (!C7661i.m15256V2(str2, "This username is already taken", false) && C7661i.m15256V2(str2, "The username must have 2 or more symbols", false)) ? registerFragment.m3600t(R.string.register_username_short) : registerFragment.m3600t(R.string.register_username_taken);
                C5207g.m11110e(strM3600t2, "if (message.startsWith(\"…                        }");
                c8287g1.f44810n.setError(strM3600t2);
            }
            ValidationMessage validationMessage2 = resultRegistrationValidation.f18923a;
            if (validationMessage2 != null) {
                if (validationMessage2 != null && (list = validationMessage2.f19142a) != null && (str = (String) C6752c.m13425S(list)) != null) {
                    str3 = str;
                }
                if (C7661i.m15256V2(str3, "Enter a valid email address", false)) {
                    strM3600t = registerFragment.m3600t(R.string.register_email_invalid);
                } else {
                    strM3600t = C7661i.m15256V2(str3, "It looks like you already have an account with this email", false) ? registerFragment.m3600t(R.string.register_email_taken) : registerFragment.m3600t(R.string.register_email_taken);
                }
                C5207g.m11110e(strM3600t, "if (message.startsWith(\"…                        }");
                c8287g1.f44804h.setError(strM3600t);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFragment$onViewCreated$4$11$5(C8287g1 c8287g1, RegisterFragment registerFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30770f = registerFragment;
        this.f30771g = c8287g1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RegisterFragment$onViewCreated$4$11$5(this.f30771g, this.f30770f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RegisterFragment$onViewCreated$4$11$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30769e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RegisterFragment.f30733J0;
            RegisterFragment registerFragment = this.f30770f;
            AuthenticationViewModel authenticationViewModelM10343q0 = registerFragment.m10343q0();
            C47471 c47471 = new C47471(this.f30771g, registerFragment, null);
            this.f30769e = 1;
            if (C0062b.m369m0(authenticationViewModelM10343q0.f30544V, c47471, this) == coroutineSingletons) {
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
