package com.lingq.p055ui.token.dictionaries;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import ci.InterfaceC2011d;
import ci.InterfaceC2015h;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserDictionaryData;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/token/dictionaries/DictionariesManageViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DictionariesManageViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final StateFlowImpl f31800H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f31801I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f31802J;

    /* JADX INFO: renamed from: K */
    public final C7135p f31803K;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2015h f31804d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2011d f31805e;

    /* JADX INFO: renamed from: f */
    public final CoroutineDispatcher f31806f;

    /* JADX INFO: renamed from: g */
    public final CoroutineJobManager f31807g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0113j f31808h;

    /* JADX INFO: renamed from: i */
    public final StateFlowImpl f31809i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f31810j;

    /* JADX INFO: renamed from: k */
    public final StateFlowImpl f31811k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f31812l;

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {53}, m19208m = "invokeSuspend")
    final class C48821 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31813e;

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$1$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryData>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DictionariesManageViewModel f31815e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31815e = dictionariesManageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f31815e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends UserDictionaryData> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = this.f31815e;
                if (!((Boolean) dictionariesManageViewModel.f31809i.getValue()).booleanValue()) {
                    dictionariesManageViewModel.f31802J.setValue(DictionariesManageViewModel.m10395l2(dictionariesManageViewModel));
                }
                return C9072e.f47360a;
            }
        }

        public C48821(InterfaceC9968c<? super C48821> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DictionariesManageViewModel.this.new C48821(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48821) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31813e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = DictionariesManageViewModel.this;
                StateFlowImpl stateFlowImpl = dictionariesManageViewModel.f31812l;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dictionariesManageViewModel, null);
                this.f31813e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$2", m19206f = "DictionariesManageViewModel.kt", m19207l = {61}, m19208m = "invokeSuspend")
    final class C48832 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31816e;

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryData;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$2$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryData>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DictionariesManageViewModel f31818e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31818e = dictionariesManageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f31818e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends UserDictionaryData> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = this.f31818e;
                dictionariesManageViewModel.f31802J.setValue(DictionariesManageViewModel.m10395l2(dictionariesManageViewModel));
                return C9072e.f47360a;
            }
        }

        public C48832(InterfaceC9968c<? super C48832> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DictionariesManageViewModel.this.new C48832(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48832) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31816e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = DictionariesManageViewModel.this;
                StateFlowImpl stateFlowImpl = dictionariesManageViewModel.f31800H;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dictionariesManageViewModel, null);
                this.f31816e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$3", m19206f = "DictionariesManageViewModel.kt", m19207l = {67}, m19208m = "invokeSuspend")
    final class C48843 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31819e;

        /* JADX INFO: renamed from: com.lingq.ui.token.dictionaries.DictionariesManageViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.token.dictionaries.DictionariesManageViewModel$3$1", m19206f = "DictionariesManageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DictionariesManageViewModel f31821e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DictionariesManageViewModel dictionariesManageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31821e = dictionariesManageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f31821e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = this.f31821e;
                dictionariesManageViewModel.f31802J.setValue(DictionariesManageViewModel.m10395l2(dictionariesManageViewModel));
                return C9072e.f47360a;
            }
        }

        public C48843(InterfaceC9968c<? super C48843> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DictionariesManageViewModel.this.new C48843(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C48843) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31819e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DictionariesManageViewModel dictionariesManageViewModel = DictionariesManageViewModel.this;
                StateFlowImpl stateFlowImpl = dictionariesManageViewModel.f31811k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(dictionariesManageViewModel, null);
                this.f31819e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    public DictionariesManageViewModel(InterfaceC2015h interfaceC2015h, InterfaceC2011d interfaceC2011d, InterfaceC0113j interfaceC0113j, ExecutorC7177a executorC7177a, CoroutineJobManager coroutineJobManager) {
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        this.f31804d = interfaceC2015h;
        this.f31805e = interfaceC2011d;
        this.f31806f = executorC7177a;
        this.f31807g = coroutineJobManager;
        this.f31808h = interfaceC0113j;
        Boolean bool = Boolean.FALSE;
        this.f31809i = C7120g.m14379a(bool);
        this.f31810j = C7120g.m14379a(mo507p1());
        EmptyList emptyList = EmptyList.f38032a;
        this.f31811k = C7120g.m14379a(emptyList);
        this.f31812l = C7120g.m14379a(emptyList);
        this.f31800H = C7120g.m14379a(emptyList);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(bool);
        this.f31801I = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f31802J = stateFlowImplM14379a2;
        this.f31803K = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48821(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48832(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C48843(null), 3);
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "observableActiveDictionaries", new DictionariesManageViewModel$fetchActiveDictionaries$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "observableAvailableDictionaries", new DictionariesManageViewModel$fetchAvailableDictionaries$1(this, null));
        C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, "observableAvailableLocales", new DictionariesManageViewModel$fetchAvailableLocales$1(this, null));
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new DictionariesManageViewModel$updateActiveDictionaries$1(this, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new DictionariesManageViewModel$updateAvailableLocales$1(this, null), 3);
    }

    /* JADX INFO: renamed from: l2 */
    public static final ArrayList m10395l2(DictionariesManageViewModel dictionariesManageViewModel) {
        dictionariesManageViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        List list = (List) dictionariesManageViewModel.f31812l.getValue();
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new DictionariesManageAdapter.AbstractC4874b.a((UserDictionaryData) it.next()));
        }
        arrayList.addAll(arrayList2);
        arrayList.add(new DictionariesManageAdapter.AbstractC4874b.c((List) dictionariesManageViewModel.f31811k.getValue(), (String) dictionariesManageViewModel.f31810j.getValue()));
        List list2 = (List) dictionariesManageViewModel.f31800H.getValue();
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new DictionariesManageAdapter.AbstractC4874b.b((UserDictionaryData) it2.next()));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f31808h.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31808h.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f31808h.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31808h.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f31808h.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31808h.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f31808h;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31808h.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f31808h.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31808h.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f31808h.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f31808h.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f31808h.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f31808h.mo509w0();
    }
}
