package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$2", m19206f = "DictionaryContentFragment.kt", m19207l = {203}, m19208m = "invokeSuspend")
public final class DictionaryContentFragment$onViewCreated$3$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31885e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionaryContentFragment f31886f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionaryContentFragment$onViewCreated$3$2$1", m19206f = "DictionaryContentFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49001 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f31887e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionaryContentFragment f31888f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49001(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super C49001> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31888f = dictionaryContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C49001 c49001 = new C49001(this.f31888f, interfaceC9968c);
            c49001.f31887e = ((Boolean) obj).booleanValue();
            return c49001;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49001) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f31887e;
            DictionaryContentFragment dictionaryContentFragment = this.f31888f;
            if (z10) {
                DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
                dictionaryContentFragment.m10396u0().f44882j.m4935d();
            } else {
                DictionaryContentFragment.C4892a c4892a2 = DictionaryContentFragment.f31854X0;
                dictionaryContentFragment.m10396u0().f44882j.m4933b();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentFragment$onViewCreated$3$2(DictionaryContentFragment dictionaryContentFragment, InterfaceC9968c<? super DictionaryContentFragment$onViewCreated$3$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31886f = dictionaryContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DictionaryContentFragment$onViewCreated$3$2(this.f31886f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionaryContentFragment$onViewCreated$3$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31885e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionaryContentFragment.C4892a c4892a = DictionaryContentFragment.f31854X0;
            DictionaryContentFragment dictionaryContentFragment = this.f31886f;
            C7138s c7138s = dictionaryContentFragment.m10397v0().f31408I0;
            C49001 c49001 = new C49001(dictionaryContentFragment, null);
            this.f31885e = 1;
            if (C0062b.m369m0(c7138s, c49001, this) == coroutineSingletons) {
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
