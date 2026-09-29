package com.lingq.p055ui.token;

import ae.C0062b;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.dictionaries.C4902a;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.token.TokenType;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$8", m19206f = "TokenFragment.kt", m19207l = {660}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31350e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31351f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$8$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/token/TokenType;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$8$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48251 extends SuspendLambda implements InterfaceC2056p<Pair<? extends TokenType, ? extends List<? extends UserDictionaryData>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31352e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31353f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48251(TokenFragment tokenFragment, InterfaceC9968c<? super C48251> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31353f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48251 c48251 = new C48251(this.f31353f, interfaceC9968c);
            c48251.f31352e = obj;
            return c48251;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends TokenType, ? extends List<? extends UserDictionaryData>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48251) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00fc  */
        /* JADX WARN: Code duplicated, block: B:38:0x0103  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6, types: [T, java.lang.String] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            C4902a c4902a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f31352e;
            TokenType tokenType = (TokenType) pair.f38012a;
            List list = (List) pair.f38013b;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f38127a = "";
            Iterator it = list.iterator();
            loop0: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    UserDictionaryData userDictionaryData = (UserDictionaryData) it.next();
                    if (!C5207g.m11106a(userDictionaryData.f21709g, ref$ObjectRef.f38127a)) {
                        ref$ObjectRef.f38127a = userDictionaryData.f21709g;
                        ref$IntRef.f38125a++;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(new C4902a.a((UserDictionaryData) it2.next(), ref$IntRef.f38125a > 1));
            }
            boolean zIsEmpty = arrayList.isEmpty();
            TokenFragment tokenFragment = this.f31353f;
            if (!zIsEmpty) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
                if (tokenFragment.m10363o0().mo9741p0(TooltipStep.LingQExpanded) || tokenFragment.m10363o0().f31431U.f34366a.f31181g != TokenControllerType.Lesson) {
                    if (tokenType == TokenType.WordType || tokenType == TokenType.NewWordOrPhraseType) {
                        RecyclerView recyclerView = tokenFragment.m10362n0().f45397s;
                        C5207g.m11110e(recyclerView, "binding.rvDictionariesSmall");
                        C4924a.m10457e0(recyclerView);
                    } else {
                        RecyclerView recyclerView2 = tokenFragment.m10362n0().f45397s;
                        C5207g.m11110e(recyclerView2, "binding.rvDictionariesSmall");
                        C4924a.m10442U(recyclerView2);
                    }
                }
                c4902a = tokenFragment.f31209G0;
                if (c4902a != null) {
                    c4902a.m4529q(arrayList);
                    return C9072e.f47360a;
                }
                C5207g.m11117l("dictionariesAdapter");
                throw null;
            }
            InterfaceC6727j<Object>[] interfaceC6727jArr2 = TokenFragment.f31202R0;
            RecyclerView recyclerView3 = tokenFragment.m10362n0().f45397s;
            C5207g.m11110e(recyclerView3, "binding.rvDictionariesSmall");
            C4924a.m10442U(recyclerView3);
            c4902a = tokenFragment.f31209G0;
            if (c4902a != null) {
                c4902a.m4529q(arrayList);
                return C9072e.f47360a;
            }
            C5207g.m11117l("dictionariesAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$8(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31351f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$8(this.f31351f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31350e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31351f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48251 c48251 = new C48251(tokenFragment, null);
            this.f31350e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31468t0, c48251, this) == coroutineSingletons) {
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
