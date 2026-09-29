package com.lingq.p055ui.token;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import no.InterfaceC7882z;
import p138gk.C5811a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$setupTagsPopup$2$1", m19206f = "TokenFragment.kt", m19207l = {1649}, m19208m = "invokeSuspend")
final class TokenFragment$setupTagsPopup$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31369e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenFragment f31370f;

    /* JADX INFO: renamed from: com.lingq.ui.token.TokenFragment$setupTagsPopup$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042*\u0010\u0003\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Triple;", "", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenFragment$setupTagsPopup$2$1$1", m19206f = "TokenFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48291 extends SuspendLambda implements InterfaceC2056p<Triple<? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31371e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ TokenFragment f31372f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48291(TokenFragment tokenFragment, InterfaceC9968c<? super C48291> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31372f = tokenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48291 c48291 = new C48291(this.f31372f, interfaceC9968c);
            c48291.f31371e = obj;
            return c48291;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Triple<? extends List<? extends String>, ? extends List<? extends String>, ? extends List<? extends String>> triple, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48291) mo1336a(triple, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Triple triple = (Triple) this.f31371e;
            List list = (List) triple.f38021a;
            List list2 = (List) triple.f38022b;
            List list3 = (List) triple.f38023c;
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31372f;
            List list4 = (List) tokenFragment.m10363o0().f31432U0.getValue();
            if (C5207g.m11106a(list2, list4)) {
                list2 = list4;
            } else {
                TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
                C5207g.m11111f(list2, "tags");
                tokenViewModelM10363o0.f31432U0.setValue(list2);
            }
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C7076b.m14277B3((String) it.next()).toString());
            }
            Set setM13457y0 = C6752c.m13457y0(arrayList);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            loop1: while (true) {
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    String str = (String) it2.next();
                    if (str.length() > 0) {
                        arrayList2.add(new C5811a.b(str, setM13457y0.contains(C7076b.m14277B3(str).toString()), true ^ list3.contains(C7076b.m14277B3(str).toString())));
                    }
                }
            }
            C5811a c5811a = tokenFragment.f31214L0;
            if (c5811a != null) {
                c5811a.m4529q(arrayList2);
                return C9072e.f47360a;
            }
            C5207g.m11117l("availableTagsAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenFragment$setupTagsPopup$2$1(TokenFragment tokenFragment, InterfaceC9968c<? super TokenFragment$setupTagsPopup$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31370f = tokenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenFragment$setupTagsPopup$2$1(this.f31370f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenFragment$setupTagsPopup$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31369e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = TokenFragment.f31202R0;
            TokenFragment tokenFragment = this.f31370f;
            TokenViewModel tokenViewModelM10363o0 = tokenFragment.m10363o0();
            C48291 c48291 = new C48291(tokenFragment, null);
            this.f31369e = 1;
            if (C0062b.m369m0(tokenViewModelM10363o0.f31448f0, c48291, this) == coroutineSingletons) {
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
