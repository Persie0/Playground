package com.lingq.p055ui.token;

import ae.C0062b;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7377d;
import no.InterfaceC7882z;
import p138gk.C5814d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$5", m19206f = "TokenFragment.kt", m19207l = {607}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31337e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31338f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/d;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$5$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48221 extends SuspendLambda implements InterfaceC2056p<C7377d, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31339e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31340f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48221(TokenFragment tokenFragment, InterfaceC9968c<? super C48221> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31340f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48221 c48221 = new C48221(this.f31340f, interfaceC9968c);
            c48221.f31339e = obj;
            return c48221;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7377d c7377d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48221) mo1336a(c7377d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C7377d c7377d = (C7377d) this.f31339e;
            if (c7377d != null) {
                List<TokenRelatedPhrase> list = c7377d.f41166a;
                boolean zIsEmpty = list.isEmpty();
                TokenFragment tokenFragment = this.f31340f;
                if (zIsEmpty) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                    TextView textView = tokenFragment.m10362n0().f45360H;
                    C5207g.m11110e(textView, "binding.tvRelatedPhrasesEmpty");
                    C4924a.m10457e0(textView);
                    RecyclerView recyclerView = tokenFragment.m10362n0().f45399u;
                    C5207g.m11110e(recyclerView, "binding.rvRelatedPhrases");
                    C4924a.m10442U(recyclerView);
                    LinearLayout linearLayout = (LinearLayout) tokenFragment.m10362n0().f45376X.f45111a;
                    C5207g.m11110e(linearLayout, "binding.viewLoadingRelatedPhrases.root");
                    C4924a.m10442U(linearLayout);
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                    TextView textView2 = tokenFragment.m10362n0().f45360H;
                    C5207g.m11110e(textView2, "binding.tvRelatedPhrasesEmpty");
                    C4924a.m10442U(textView2);
                    RecyclerView recyclerView2 = tokenFragment.m10362n0().f45399u;
                    C5207g.m11110e(recyclerView2, "binding.rvRelatedPhrases");
                    C4924a.m10457e0(recyclerView2);
                    C5814d c5814d = tokenFragment.f31210H0;
                    if (c5814d == null) {
                        C5207g.m11117l("relatedPhrasesAdapter");
                        throw null;
                    }
                    c5814d.m4529q(list);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$5(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31338f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$5(this.f31338f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31337e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31338f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48221 c48221 = new C48221(tokenFragment, null);
            this.f31337e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31441b0, c48221, this) == coroutineSingletons) {
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
