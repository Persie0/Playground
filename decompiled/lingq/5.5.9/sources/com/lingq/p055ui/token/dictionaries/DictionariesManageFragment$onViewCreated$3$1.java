package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageFragment$onViewCreated$3$1", m19206f = "DictionariesManageFragment.kt", m19207l = {116}, m19208m = "invokeSuspend")
public final class DictionariesManageFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31790e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionariesManageFragment f31791f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/token/dictionaries/DictionariesManageAdapter$b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageFragment$onViewCreated$3$1$1", m19206f = "DictionariesManageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48811 extends SuspendLambda implements InterfaceC2056p<List<? extends DictionariesManageAdapter.AbstractC4874b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31792e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionariesManageFragment f31793f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48811(DictionariesManageFragment dictionariesManageFragment, InterfaceC9968c<? super C48811> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31793f = dictionariesManageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48811 c48811 = new C48811(this.f31793f, interfaceC9968c);
            c48811.f31792e = obj;
            return c48811;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends DictionariesManageAdapter.AbstractC4874b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48811) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f31792e;
            DictionariesManageAdapter dictionariesManageAdapter = this.f31793f.f31776Q0;
            if (dictionariesManageAdapter != null) {
                dictionariesManageAdapter.m4529q(list);
                return C9072e.f47360a;
            }
            C5207g.m11117l("dictionariesManageAdapter");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageFragment$onViewCreated$3$1(DictionariesManageFragment dictionariesManageFragment, InterfaceC9968c<? super DictionariesManageFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31791f = dictionariesManageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesManageFragment$onViewCreated$3$1(this.f31791f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesManageFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31790e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionariesManageFragment dictionariesManageFragment = this.f31791f;
            DictionariesManageViewModel dictionariesManageViewModelM10393u0 = DictionariesManageFragment.m10393u0(dictionariesManageFragment);
            C48811 c48811 = new C48811(dictionariesManageFragment, null);
            this.f31790e = 1;
            if (C0062b.m369m0(dictionariesManageViewModelM10393u0.f31803K, c48811, this) == coroutineSingletons) {
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
