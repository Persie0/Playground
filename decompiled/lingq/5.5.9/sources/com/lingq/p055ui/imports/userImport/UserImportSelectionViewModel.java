package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.content.Context;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2010c;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.UserImportDetailType;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import dm.C5207g;
import fj.C5546g;
import fj.InterfaceC5547h;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.C7785l;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/imports/userImport/UserImportSelectionViewModel;", "Landroidx/lifecycle/h0;", "Lfj/h;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class UserImportSelectionViewModel extends AbstractC1036h0 implements InterfaceC5547h, InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f26725H;

    /* JADX INFO: renamed from: I */
    public final C7138s f26726I;

    /* JADX INFO: renamed from: J */
    public final C7134o f26727J;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2010c f26728d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC5547h f26729e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0113j f26730f;

    /* JADX INFO: renamed from: g */
    public final UserImportDetailType f26731g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f26732h;

    /* JADX INFO: renamed from: i */
    public final C7135p f26733i;

    /* JADX INFO: renamed from: j */
    public final C7138s f26734j;

    /* JADX INFO: renamed from: k */
    public final C7134o f26735k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f26736l;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$1", m19206f = "UserImportSelectionViewModel.kt", m19207l = {69}, m19208m = "invokeSuspend")
    final class C41171 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26737e;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f26739g;

        /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguages", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$1$1", m19206f = "UserImportSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserLanguage>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f26740e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ UserImportSelectionViewModel f26741f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Context f26742g;

            /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$1$1$a */
            public static final class a<T> implements Comparator {
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return C7499b.m14951m(((UserLanguage) t10).f21731f, ((UserLanguage) t11).f21731f);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(UserImportSelectionViewModel userImportSelectionViewModel, Context context, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f26741f = userImportSelectionViewModel;
                this.f26742g = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26741f, this.f26742g, interfaceC9968c);
                anonymousClass1.f26740e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends UserLanguage> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f26740e;
                UserImportSelectionViewModel userImportSelectionViewModel = this.f26741f;
                StateFlowImpl stateFlowImpl = userImportSelectionViewModel.f26736l;
                List<UserLanguage> listM13447o0 = C6752c.m13447o0(list, new a());
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13447o0, 10));
                for (UserLanguage userLanguage : listM13447o0) {
                    arrayList.add(new C7785l(null, C4924a.m10439R(this.f26742g, userLanguage.f21726a), C5207g.m11106a(userLanguage.f21726a, userImportSelectionViewModel.mo10080T1().getValue().f34280a), userLanguage.f21726a, 1));
                }
                stateFlowImpl.setValue(arrayList);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41171(Context context, InterfaceC9968c<? super C41171> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26739g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return UserImportSelectionViewModel.this.new C41171(this.f26739g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41171) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26737e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                UserImportSelectionViewModel userImportSelectionViewModel = UserImportSelectionViewModel.this;
                InterfaceC7142w<List<UserLanguage>> interfaceC7142wMo496B = userImportSelectionViewModel.mo496B();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(userImportSelectionViewModel, this.f26739g, null);
                this.f26737e = 1;
                if (C0062b.m369m0(interfaceC7142wMo496B, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$a */
    public /* synthetic */ class C4118a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26743a;

        static {
            int[] iArr = new int[UserImportDetailType.values().length];
            try {
                iArr[UserImportDetailType.Level.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserImportDetailType.Course.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserImportDetailType.Source.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserImportDetailType.Languages.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26743a = iArr;
        }
    }

    public UserImportSelectionViewModel(Context context, InterfaceC2010c interfaceC2010c, ExecutorC7177a executorC7177a, InterfaceC5547h interfaceC5547h, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2010c, "courseRepository");
        C5207g.m11111f(interfaceC5547h, "userImportDelegate");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f26728d = interfaceC2010c;
        this.f26729e = interfaceC5547h;
        this.f26730f = interfaceC0113j;
        UserImportDetailType userImportDetailType = C4132a.a.m10095a(c1024c0).f26837a;
        this.f26731g = userImportDetailType;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(Boolean.FALSE);
        this.f26732h = stateFlowImplM14379a;
        this.f26733i = C0062b.m306S(stateFlowImplM14379a);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f26734j = c7138sM10448a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f26735k = C0062b.m341d2(c7138sM10448a, interfaceC7882zM16767w0, startedWhileSubscribed);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f26736l = stateFlowImplM14379a2;
        this.f26725H = C0062b.m353h2(C0062b.m399t2(stateFlowImplM14379a2, new UserImportSelectionViewModel$selectionItems$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f26726I = c7138sM10448a2;
        this.f26727J = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        if (userImportDetailType == UserImportDetailType.Languages) {
            C7828f.m15570d(C8573r0.m16767w0(this), executorC7177a, null, new C41171(context, null), 2);
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f26730f.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26730f.mo497B0(interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: C */
    public final InterfaceC7137r<UserImportDetailType> mo10075C() {
        return this.f26729e.mo10075C();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f26730f.mo498E1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: F */
    public final InterfaceC7137r<Integer> mo10076F() {
        return this.f26729e.mo10076F();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26730f.mo499J(profile, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: K1 */
    public final void mo10077K1() {
        this.f26729e.mo10077K1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f26730f.mo500P();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: P0 */
    public final void mo10078P0(Triple<? extends UserImportDetailType, String, Boolean> triple) {
        this.f26729e.mo10078P0(triple);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: R */
    public final InterfaceC7137r<Boolean> mo10079R() {
        return this.f26729e.mo10079R();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: T1 */
    public final InterfaceC7142w<C5546g> mo10080T1() {
        return this.f26729e.mo10080T1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: V1 */
    public final void mo10081V1(int i10) {
        this.f26729e.mo10081V1(i10);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: c2 */
    public final InterfaceC7137r<Boolean> mo10082c2() {
        return this.f26729e.mo10082c2();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26730f.mo501d(str, interfaceC9968c);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: e */
    public final void mo10083e(UserImportDetailType userImportDetailType) {
        C5207g.m11111f(userImportDetailType, "userImportDetailType");
        this.f26729e.mo10083e(userImportDetailType);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f26730f;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26730f.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f26730f.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f26730f.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f26730f.mo506l1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: o1 */
    public final InterfaceC7137r<Triple<UserImportDetailType, String, Boolean>> mo10084o1() {
        return this.f26729e.mo10084o1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f26730f.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f26730f.mo508t1();
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: v0 */
    public final void mo10085v0(C5546g c5546g) {
        this.f26729e.mo10085v0(c5546g);
    }

    @Override // fj.InterfaceC5547h
    /* JADX INFO: renamed from: w */
    public final void mo10086w() {
        this.f26729e.mo10086w();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f26730f.mo509w0();
    }
}
