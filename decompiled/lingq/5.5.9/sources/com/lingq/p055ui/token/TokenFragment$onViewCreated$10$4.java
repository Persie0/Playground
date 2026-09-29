package com.lingq.p055ui.token;

import ae.C0062b;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
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
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$4", m19206f = "TokenFragment.kt", m19207l = {580}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31332e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31333f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$4$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48211 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31334e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31335f;

        /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$4$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f31336a;

            static {
                int[] iArr = new int[Resource.Status.values().length];
                try {
                    iArr[Resource.Status.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Resource.Status.EMPTY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f31336a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48211(TokenFragment tokenFragment, InterfaceC9968c<? super C48211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31335f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48211 c48211 = new C48211(this.f31335f, interfaceC9968c);
            c48211.f31334e = obj;
            return c48211;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48211) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = a.f31336a[((Resource.Status) this.f31334e).ordinal()];
            TokenFragment tokenFragment = this.f31335f;
            if (i10 == 1) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                LinearLayout linearLayout = (LinearLayout) tokenFragment.m10362n0().f45376X.f45111a;
                C5207g.m11110e(linearLayout, "binding.viewLoadingRelatedPhrases.root");
                C4924a.m10457e0(linearLayout);
                TextView textView = tokenFragment.m10362n0().f45360H;
                C5207g.m11110e(textView, "binding.tvRelatedPhrasesEmpty");
                C4924a.m10442U(textView);
            } else if (i10 != 2) {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
                LinearLayout linearLayout2 = (LinearLayout) tokenFragment.m10362n0().f45376X.f45111a;
                C5207g.m11110e(linearLayout2, "binding.viewLoadingRelatedPhrases.root");
                C4924a.m10442U(linearLayout2);
                TextView textView2 = tokenFragment.m10362n0().f45360H;
                C5207g.m11110e(textView2, "binding.tvRelatedPhrasesEmpty");
                C4924a.m10442U(textView2);
            } else if (C7777d.m15481b(tokenFragment)) {
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = TokenFragment.f31202R0;
                TextView textView3 = tokenFragment.m10362n0().f45360H;
                C5207g.m11110e(textView3, "binding.tvRelatedPhrasesEmpty");
                C4924a.m10457e0(textView3);
                RecyclerView recyclerView = tokenFragment.m10362n0().f45399u;
                C5207g.m11110e(recyclerView, "binding.rvRelatedPhrases");
                C4924a.m10442U(recyclerView);
                LinearLayout linearLayout3 = (LinearLayout) tokenFragment.m10362n0().f45376X.f45111a;
                C5207g.m11110e(linearLayout3, "binding.viewLoadingRelatedPhrases.root");
                C4924a.m10442U(linearLayout3);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr4 = TokenFragment.f31202R0;
                TextView textView4 = tokenFragment.m10362n0().f45360H;
                C5207g.m11110e(textView4, "binding.tvRelatedPhrasesEmpty");
                LinearLayout linearLayout4 = (LinearLayout) tokenFragment.m10362n0().f45376X.f45111a;
                C5207g.m11110e(linearLayout4, "binding.viewLoadingRelatedPhrases.root");
                int i11 = 0;
                if (!(true ^ (linearLayout4.getVisibility() == 0))) {
                    i11 = 4;
                }
                textView4.setVisibility(i11);
                RecyclerView recyclerView2 = tokenFragment.m10362n0().f45399u;
                C5207g.m11110e(recyclerView2, "binding.rvRelatedPhrases");
                C4924a.m10442U(recyclerView2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$4(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31333f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$4(this.f31333f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31332e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31333f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48211 c48211 = new C48211(tokenFragment, null);
            this.f31332e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31456j0, c48211, this) == coroutineSingletons) {
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
