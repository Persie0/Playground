package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import androidx.fragment.app.C0980t0;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import java.util.ListIterator;
import ki.C6695a;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p304ok.InterfaceC8066b;
import p370rk.C8824d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import pk.InterfaceC8402c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$2", m19206f = "ListeningModeFragment.kt", m19207l = {320}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28754e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28755f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"Lkotlin/Pair;", "Lki/a;", "", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$2$1", m19206f = "ListeningModeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43941 extends SuspendLambda implements InterfaceC2056p<Pair<? extends C6695a, ? extends Double>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28756e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeFragment f28757f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$2$1$a */
        public static final class a implements InterfaceC8402c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ String f28758a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ListeningModeFragment f28759b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ double f28760c;

            public a(String str, ListeningModeFragment listeningModeFragment, double d10) {
                this.f28758a = str;
                this.f28759b = listeningModeFragment;
                this.f28760c = d10;
            }

            @Override // pk.InterfaceC8402c
            /* JADX INFO: renamed from: a */
            public final void mo5247a(InterfaceC8066b interfaceC8066b) {
                List listM13448p0;
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                List listM14273d = new Regex("\\?v=").m14273d(this.f28758a);
                boolean z10 = false;
                if (!listM14273d.isEmpty()) {
                    ListIterator listIterator = listM14273d.listIterator(listM14273d.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            listM13448p0 = EmptyList.f38032a;
                            break;
                        } else {
                            if (!(((String) listIterator.previous()).length() == 0)) {
                                listM13448p0 = C6752c.m13448p0(listM14273d, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                    }
                } else {
                    listM13448p0 = EmptyList.f38032a;
                    break;
                }
                String[] strArr = (String[]) listM13448p0.toArray(new String[0]);
                if (strArr.length > 1) {
                    C0980t0 c0980t0M3601v = this.f28759b.m3601v();
                    c0980t0M3601v.m3813c();
                    C1052r c1052r = c0980t0M3601v.f6415d;
                    String str = (String) new Regex("&").m14273d(strArr[1]).get(0);
                    float f3 = (float) this.f28760c;
                    C5207g.m11111f(c1052r, "lifecycle");
                    C5207g.m11111f(str, "videoId");
                    if (c1052r.f6681d == Lifecycle.State.RESUMED) {
                        z10 = true;
                    }
                    C8824d.m17086a(interfaceC8066b, z10, str, f3);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43941(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super C43941> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28757f = listeningModeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43941 c43941 = new C43941(this.f28757f, interfaceC9968c);
            c43941.f28756e = obj;
            return c43941;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Pair<? extends C6695a, ? extends Double> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43941) mo1336a(pair, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0040  */
        /* JADX WARN: Code duplicated, block: B:12:0x0046  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Pair pair = (Pair) this.f28756e;
            C6695a c6695a = (C6695a) pair.f38012a;
            double dDoubleValue = ((Number) pair.f38013b).doubleValue();
            String str2 = c6695a.f37851e;
            ListeningModeFragment listeningModeFragment = this.f28757f;
            if (str2 == null || c6695a.f37852f != null) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                if (listeningModeFragment.m10209n0().f43763c && listeningModeFragment.m10209n0().f43762b) {
                    str = c6695a.f37851e;
                    if (str == null) {
                        str = "";
                    }
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                    listeningModeFragment.m10210o0().f45247x.m10491a(new a(str, listeningModeFragment, dDoubleValue));
                }
            } else {
                str = c6695a.f37851e;
                if (str == null) {
                    str = "";
                }
                InterfaceC6727j<Object>[] interfaceC6727jArr3 = ListeningModeFragment.f28729F0;
                listeningModeFragment.m10210o0().f45247x.m10491a(new a(str, listeningModeFragment, dDoubleValue));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$2(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super ListeningModeFragment$onViewCreated$7$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28755f = listeningModeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$2(this.f28755f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28754e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28755f;
            ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
            C43941 c43941 = new C43941(listeningModeFragment, null);
            this.f28754e = 1;
            if (C0062b.m369m0(listeningModeViewModelM10211p0.f28799O, c43941, this) == coroutineSingletons) {
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
