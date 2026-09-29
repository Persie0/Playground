package com.lingq.p055ui.home.language;

import ae.C0062b;
import androidx.view.Lifecycle;
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
import ph.C8262c0;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.LanguageSelectorFragment$onViewCreated$3$1", m19206f = "LanguageSelectorFragment.kt", m19207l = {91}, m19208m = "invokeSuspend")
public final class LanguageSelectorFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24183e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageSelectorFragment f24184f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/home/language/a$a;", "items", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.LanguageSelectorFragment$onViewCreated$3$1$1", m19206f = "LanguageSelectorFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36921 extends SuspendLambda implements InterfaceC2056p<List<? extends C3700a.a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24185e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageSelectorFragment f24186f;

        /* JADX INFO: renamed from: com.lingq.ui.home.language.LanguageSelectorFragment$onViewCreated$3$1$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LanguageSelectorFragment f24187a;

            public a(LanguageSelectorFragment languageSelectorFragment) {
                this.f24187a = languageSelectorFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                LanguageSelectorFragment languageSelectorFragment = this.f24187a;
                if (languageSelectorFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.RESUMED)) {
                    ((C8262c0) languageSelectorFragment.f24171Q0.m10489a(languageSelectorFragment, LanguageSelectorFragment.f24170U0[0])).f44636c.m4200g0(0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36921(LanguageSelectorFragment languageSelectorFragment, InterfaceC9968c<? super C36921> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24186f = languageSelectorFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36921 c36921 = new C36921(this.f24186f, interfaceC9968c);
            c36921.f24185e = obj;
            return c36921;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C3700a.a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36921) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f24185e;
            if (!list.isEmpty()) {
                LanguageSelectorFragment languageSelectorFragment = this.f24186f;
                C3700a c3700a = languageSelectorFragment.f24174T0;
                if (c3700a == null) {
                    C5207g.m11117l("contentAdapter");
                    throw null;
                }
                c3700a.f7471d.m4439b((List<T>) list, new a(languageSelectorFragment));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorFragment$onViewCreated$3$1(LanguageSelectorFragment languageSelectorFragment, InterfaceC9968c<? super LanguageSelectorFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24184f = languageSelectorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageSelectorFragment$onViewCreated$3$1(this.f24184f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageSelectorFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24183e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageSelectorFragment languageSelectorFragment = this.f24184f;
            LanguageSelectorViewModel languageSelectorViewModel = (LanguageSelectorViewModel) languageSelectorFragment.f24173S0.getValue();
            C36921 c36921 = new C36921(languageSelectorFragment, null);
            this.f24183e = 1;
            if (C0062b.m369m0(languageSelectorViewModel.f24199f, c36921, this) == coroutineSingletons) {
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
