package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenViewModel;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$1", m19206f = "DictionaryContentFragment.kt", m19207l = {186}, m19208m = "invokeSuspend")
public final class DictionaryContentFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31881e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionaryContentFragment f31882f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lcom/lingq/shared/uimodel/token/TokenType;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$1$1", m19206f = "DictionaryContentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48991 extends SuspendLambda implements InterfaceC2056p<Pair<? extends TokenType, ? extends List<? extends UserDictionaryData>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31883e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionaryContentFragment f31884f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48991(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super C48991> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31884f = dictionaryContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48991 c48991 = new C48991(this.f31884f, interfaceC9968c);
            c48991.f31883e = obj;
            return c48991;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends TokenType, ? extends List<? extends UserDictionaryData>> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48991) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f31883e;
            List<UserDictionaryData> list = (List) pair.f38013b;
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.f38127a = "";
            for (UserDictionaryData userDictionaryData : list) {
                if (!C5207g.m11106a(userDictionaryData.f21709g, ref$ObjectRef.f38127a)) {
                    ref$ObjectRef.f38127a = userDictionaryData.f21709g;
                    ref$IntRef.f38125a++;
                }
            }
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C4902a.a((UserDictionaryData) it.next(), ref$IntRef.f38125a > 1));
            }
            C4902a c4902a = this.f31884f.f31856Q0;
            if (c4902a != null) {
                c4902a.m4529q(arrayList);
                return C9072e.f47360a;
            }
            C5207g.m11117l("dictionariesAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentFragment$onViewCreated$3$1(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super DictionaryContentFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31882f = dictionaryContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionaryContentFragment$onViewCreated$3$1(this.f31882f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionaryContentFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31881e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment dictionaryContentFragment = this.f31882f;
            TokenViewModel tokenViewModelM10397v0 = dictionaryContentFragment.m10397v0();
            C48991 c48991 = new C48991(dictionaryContentFragment, null);
            this.f31881e = 1;
            if (C0062b.m369m0(tokenViewModelM10397v0.f31468t0, c48991, this) == coroutineSingletons) {
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
