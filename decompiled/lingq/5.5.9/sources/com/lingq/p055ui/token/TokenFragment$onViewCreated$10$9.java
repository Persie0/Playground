package com.lingq.p055ui.token;

import ae.C0062b;
import android.widget.ArrayAdapter;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$9", m19206f = "TokenFragment.kt", m19207l = {688}, m19208m = "invokeSuspend")
public final class TokenFragment$onViewCreated$10$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31354e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31355f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$onViewCreated$10$9$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$onViewCreated$10$9$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48261 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31356e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31357f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48261(TokenFragment tokenFragment, InterfaceC9968c<? super C48261> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31357f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48261 c48261 = new C48261(this.f31357f, interfaceC9968c);
            c48261.f31356e = obj;
            return c48261;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48261) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            TokenFragment tokenFragment;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f31356e;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                tokenFragment = this.f31357f;
                if (!zHasNext) {
                    break;
                }
                arrayList.add(C4924a.m10439R(tokenFragment.m3578a0(), ((UserDictionaryLocale) it.next()).f21721a));
            }
            C9326n.m17682B(arrayList, new TokenFragment.C4799m(new InterfaceC2056p<String, String, Integer>() { // from class: com.lingq.ui.token.TokenFragment.onViewCreated.10.9.1.1
                @Override // cm.InterfaceC2056p
                /* JADX INFO: renamed from: m0 */
                public final Integer mo1337m0(String str, String str2) {
                    String str3 = str2;
                    C5207g.m11110e(str3, "t1");
                    return Integer.valueOf(str.compareTo(str3));
                }
            }));
            ArrayAdapter<String> arrayAdapter = tokenFragment.f31215M0;
            if (arrayAdapter != null) {
                arrayAdapter.addAll(arrayList);
            }
            ArrayAdapter<String> arrayAdapter2 = tokenFragment.f31215M0;
            if (arrayAdapter2 != null) {
                arrayAdapter2.notifyDataSetChanged();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$onViewCreated$10$9(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$onViewCreated$10$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31355f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$onViewCreated$10$9(this.f31355f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$onViewCreated$10$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31354e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31355f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48261 c48261 = new C48261(tokenFragment, null);
            this.f31354e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31464p0, c48261, this) == coroutineSingletons) {
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
