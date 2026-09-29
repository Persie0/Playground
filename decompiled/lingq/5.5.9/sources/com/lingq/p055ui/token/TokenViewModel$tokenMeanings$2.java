package com.lingq.p055ui.token;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import fk.C5575q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import li.C7374a;
import li.C7375b;
import li.C7376c;
import li.C7378e;
import li.InterfaceC7379f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lfk/q;", "Lli/f;", "token", "Lli/c;", "popular", "", "", "locales", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$tokenMeanings$2", m19206f = "TokenViewModel.kt", m19207l = {288}, m19208m = "invokeSuspend")
final class TokenViewModel$tokenMeanings$2 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super C5575q>, InterfaceC7379f, C7376c, List<? extends String>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31662e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f31663f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ InterfaceC7379f f31664g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ C7376c f31665h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ List f31666i;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$tokenMeanings$2$a */
    public static final class C4857a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(Integer.valueOf(((TokenMeaning) t10).f22091d), Integer.valueOf(((TokenMeaning) t11).f22091d));
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenViewModel$tokenMeanings$2$b */
    public static final class C4858b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return C7499b.m14951m(Integer.valueOf(((TokenMeaning) t10).f22091d), Integer.valueOf(((TokenMeaning) t11).f22091d));
        }
    }

    public TokenViewModel$tokenMeanings$2(InterfaceC9968c<? super TokenViewModel$tokenMeanings$2> interfaceC9968c) {
        super(5, interfaceC9968c);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super C5575q> interfaceC7117d, InterfaceC7379f interfaceC7379f, C7376c c7376c, List<? extends String> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        TokenViewModel$tokenMeanings$2 tokenViewModel$tokenMeanings$2 = new TokenViewModel$tokenMeanings$2(interfaceC9968c);
        tokenViewModel$tokenMeanings$2.f31663f = interfaceC7117d;
        tokenViewModel$tokenMeanings$2.f31664g = interfaceC7379f;
        tokenViewModel$tokenMeanings$2.f31665h = c7376c;
        tokenViewModel$tokenMeanings$2.f31666i = list;
        return tokenViewModel$tokenMeanings$2.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Iterable iterableM13441i0;
        Collection collectionM13451s0;
        TokenType tokenType;
        List<TokenMeaning> list;
        List listM13447o0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31662e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f31663f;
            InterfaceC7379f interfaceC7379f = this.f31664g;
            C7376c c7376c = this.f31665h;
            List list2 = this.f31666i;
            if (c7376c == null || (list = c7376c.f41165a) == null || (listM13447o0 = C6752c.m13447o0(list, new C4857a())) == null || (iterableM13441i0 = C6752c.m13441i0(listM13447o0)) == null) {
                iterableM13441i0 = EmptyList.f38032a;
            }
            boolean z10 = interfaceC7379f instanceof C7374a;
            if (z10) {
                List<TokenMeaning> listMo14772a = interfaceC7379f.mo14772a();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listMo14772a, 10));
                Iterator<T> it = listMo14772a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TokenMeaning) it.next()).f22090c);
                }
                collectionM13451s0 = C6752c.m13451s0(arrayList);
            } else {
                collectionM13451s0 = EmptyList.f38032a;
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : iterableM13441i0) {
                if (!collectionM13451s0.contains(((TokenMeaning) obj2).f22090c)) {
                    arrayList2.add(obj2);
                }
            }
            boolean z11 = interfaceC7379f instanceof C7378e;
            List<TokenMeaning> listM13448p0 = (z11 && (!arrayList2.isEmpty())) ? C6752c.m13448p0(arrayList2, 2) : z11 ? C6752c.m13441i0(C6752c.m13447o0(interfaceC7379f.mo14772a(), new C4858b())) : interfaceC7379f.mo14772a();
            if (z10) {
                tokenType = TokenType.CardType;
            } else if (interfaceC7379f instanceof C7375b) {
                tokenType = TokenType.NewWordOrPhraseType;
            } else {
                if (!z11) {
                    throw new NoWhenBranchMatchedException();
                }
                tokenType = TokenType.WordType;
            }
            C5575q c5575q = new C5575q(tokenType, listM13448p0, arrayList2, list2.size() > 1);
            this.f31663f = null;
            this.f31664g = null;
            this.f31665h = null;
            this.f31662e = 1;
            if (interfaceC7117d.mo1339r(c5575q, this) == coroutineSingletons) {
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
