package com.lingq.p055ui.token;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$11", m19206f = "TokenFragment.kt", m19207l = {752}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$11 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31251e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31252f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$11$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$11$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48031 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31253e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31254f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48031(TokenFragment tokenFragment, InterfaceC9968c<? super C48031> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31254f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48031 c48031 = new C48031(this.f31254f, interfaceC9968c);
            c48031.f31253e = obj;
            return c48031;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48031) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (((Resource.Status) this.f31253e) == Resource.Status.LOADING) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                TextView textView = this.f31254f.m10362n0().f45365M;
                C5207g.m11110e(textView, "binding.tvTranslationLoading");
                C4924a.m10457e0(textView);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$11(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$11> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31252f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$11(this.f31252f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$11) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31251e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31252f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48031 c48031 = new C48031(tokenFragment, null);
            this.f31251e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31462n0, c48031, this) == coroutineSingletons) {
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
