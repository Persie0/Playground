package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchAvailableLocales$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {186}, m19208m = "invokeSuspend")
final class DictionariesManageViewModel$fetchAvailableLocales$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31839e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DictionariesManageViewModel f31840f;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchAvailableLocales$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchAvailableLocales$1$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48891 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends UserDictionaryLocale>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ DictionariesManageViewModel f31841e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48891(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super C48891> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31841e = dictionariesManageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C48891(this.f31841e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends UserDictionaryLocale>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48891) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31841e.f31801I.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchAvailableLocales$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$fetchAvailableLocales$1$2", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C48902 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31842e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ DictionariesManageViewModel f31843f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C48902(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super C48902> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31843f = dictionariesManageViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C48902 c48902 = new C48902(this.f31843f, interfaceC9968c);
            c48902.f31842e = obj;
            return c48902;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48902) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f31842e;
            boolean z10 = !list.isEmpty();
            DictionariesManageViewModel dictionariesManageViewModel = this.f31843f;
            if (z10) {
                dictionariesManageViewModel.f31801I.setValue(Boolean.FALSE);
                dictionariesManageViewModel.f31811k.setValue(list);
            } else {
                dictionariesManageViewModel.f31801I.setValue(Boolean.TRUE);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$fetchAvailableLocales$1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super DictionariesManageViewModel$fetchAvailableLocales$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f31840f = dictionariesManageViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DictionariesManageViewModel$fetchAvailableLocales$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new DictionariesManageViewModel$fetchAvailableLocales$1(this.f31840f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31839e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DictionariesManageViewModel dictionariesManageViewModel = this.f31840f;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C48891(dictionariesManageViewModel, null), dictionariesManageViewModel.f31805e.mo6010j(dictionariesManageViewModel.mo498E1())), dictionariesManageViewModel.f31806f);
            C48902 c48902 = new C48902(dictionariesManageViewModel, null);
            this.f31839e = 1;
            if (C0062b.m369m0(interfaceC7116cM307S0, c48902, this) == coroutineSingletons) {
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
