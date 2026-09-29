package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.widget.LinearLayout;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.Collection;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$4", m19206f = "ListeningModeFragment.kt", m19207l = {355}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28766e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28767f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4411a f28768g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$4$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/ui/lesson/player/a$a;", "sentences", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$4$1", m19206f = "ListeningModeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43961 extends SuspendLambda implements InterfaceC2056p<List<? extends C4411a.a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28769e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeFragment f28770f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C4411a f28771g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$4$1$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C4411a f28772a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f28773b;

            public a(C4411a c4411a, ListeningModeFragment listeningModeFragment) {
                this.f28772a = c4411a;
                this.f28773b = listeningModeFragment;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object next;
                Collection collection = this.f28772a.f7471d.f7233f;
                C5207g.m11110e(collection, "adapter.currentList");
                Iterator it = collection.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((C4411a.a) next).f28888b);
                C4411a.a aVar = (C4411a.a) next;
                if (aVar != null) {
                    ListeningModeFragment listeningModeFragment = this.f28773b;
                    if (listeningModeFragment.f6112l0.f6681d.isAtLeast(Lifecycle.State.STARTED)) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                        listeningModeFragment.m10210o0().f45240q.m4207k0(aVar.f28887a.f21895a - 1);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43961(C4411a c4411a, ListeningModeFragment listeningModeFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28770f = listeningModeFragment;
            this.f28771g = c4411a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43961 c43961 = new C43961(this.f28771g, this.f28770f, interfaceC9968c);
            c43961.f28769e = obj;
            return c43961;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C4411a.a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43961) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f28769e;
            boolean z10 = !list.isEmpty();
            ListeningModeFragment listeningModeFragment = this.f28770f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                LinearLayout linearLayout = (LinearLayout) listeningModeFragment.m10210o0().f45238o.f45085a;
                C5207g.m11110e(linearLayout, "binding.loadingViews.root");
                C4924a.m10442U(linearLayout);
            }
            C4411a c4411a = this.f28771g;
            c4411a.f7471d.m4439b((List<T>) list, new a(c4411a, listeningModeFragment));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$4(C4411a c4411a, ListeningModeFragment listeningModeFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28767f = listeningModeFragment;
        this.f28768g = c4411a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$4(this.f28768g, this.f28767f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28766e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28767f;
            ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
            C43961 c43961 = new C43961(this.f28768g, listeningModeFragment, null);
            this.f28766e = 1;
            if (C0062b.m369m0(listeningModeViewModelM10211p0.f28805U, c43961, this) == coroutineSingletons) {
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
