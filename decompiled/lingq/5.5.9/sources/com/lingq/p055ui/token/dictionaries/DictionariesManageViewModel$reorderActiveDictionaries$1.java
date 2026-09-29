package com.lingq.p055ui.token.dictionaries;

import ci.InterfaceC2011d;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$reorderActiveDictionaries$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class DictionariesManageViewModel$reorderActiveDictionaries$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DictionariesManageViewModel f31847e;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$reorderActiveDictionaries$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$reorderActiveDictionaries$1$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {233}, m19208m = "invokeSuspend")
    public static final class C48911 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31848e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionariesManageViewModel f31849f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48911(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super C48911> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31849f = dictionariesManageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48911(this.f31849f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48911) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31848e;
            DictionariesManageViewModel dictionariesManageViewModel = this.f31849f;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2011d interfaceC2011d = dictionariesManageViewModel.f31805e;
                String strMo498E1 = dictionariesManageViewModel.mo498E1();
                Iterable iterable = (Iterable) dictionariesManageViewModel.f31812l.getValue();
                ArrayList arrayList = new ArrayList(C9325m.m17681z(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((UserDictionaryData) it.next()).f21703a, arrayList);
                }
                this.f31848e = 1;
                if (interfaceC2011d.mo6007g(strMo498E1, arrayList) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            dictionariesManageViewModel.getClass();
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(dictionariesManageViewModel);
            DictionariesManageViewModel$fetchActiveDictionaries$1 dictionariesManageViewModel$fetchActiveDictionaries$1 = new DictionariesManageViewModel$fetchActiveDictionaries$1(dictionariesManageViewModel, null);
            C7499b.m14933c0(interfaceC7882zM16767w0, dictionariesManageViewModel.f31807g, dictionariesManageViewModel.f31806f, "observableActiveDictionaries", dictionariesManageViewModel$fetchActiveDictionaries$1);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$reorderActiveDictionaries$1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super DictionariesManageViewModel$reorderActiveDictionaries$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f31847e = dictionariesManageViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesManageViewModel$reorderActiveDictionaries$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesManageViewModel$reorderActiveDictionaries$1(this.f31847e, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        DictionariesManageViewModel dictionariesManageViewModel = this.f31847e;
        C7828f.m15570d(C8573r0.m16767w0(dictionariesManageViewModel), dictionariesManageViewModel.f31806f, null, new C48911(dictionariesManageViewModel, null), 2);
        return C9072e.f47360a;
    }
}
