package androidx.compose.runtime;

import ae.C0062b;
import androidx.compose.runtime.snapshots.AbstractC0497b;
import androidx.compose.runtime.snapshots.C0496a;
import androidx.compose.runtime.snapshots.SnapshotKt;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7840j;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p081e0.InterfaceC5297b0;
import p081e0.InterfaceC5321l;
import p126g0.InterfaceC5635e;
import p186j0.C6399b;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m19206f = "Recomposer.kt", m19207l = {898}, m19208m = "invokeSuspend")
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public C0496a f3078e;

    /* JADX INFO: renamed from: f */
    public int f3079f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f3080g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Recomposer f3081h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC2057q<InterfaceC7882z, InterfaceC5297b0, InterfaceC9968c<? super C9072e>, Object> f3082i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC5297b0 f3083j;

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", m19206f = "Recomposer.kt", m19207l = {899}, m19208m = "invokeSuspend")
    public static final class C04732 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f3084e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f3085f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ InterfaceC2057q<InterfaceC7882z, InterfaceC5297b0, InterfaceC9968c<? super C9072e>, Object> f3086g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC5297b0 f3087h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04732(InterfaceC2057q<? super InterfaceC7882z, ? super InterfaceC5297b0, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC5297b0 interfaceC5297b0, InterfaceC9968c<? super C04732> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f3086g = interfaceC2057q;
            this.f3087h = interfaceC5297b0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C04732 c04732 = new C04732(this.f3086g, this.f3087h, interfaceC9968c);
            c04732.f3085f = obj;
            return c04732;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C04732) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f3084e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f3085f;
                this.f3084e = 1;
                if (this.f3086g.mo1343M(interfaceC7882z, this.f3087h, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, InterfaceC2057q<? super InterfaceC7882z, ? super InterfaceC5297b0, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC5297b0 interfaceC5297b0, InterfaceC9968c<? super Recomposer$recompositionRunner$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3081h = recomposer;
        this.f3082i = interfaceC2057q;
        this.f3083j = interfaceC5297b0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.f3081h, this.f3082i, this.f3083j, interfaceC9968c);
        recomposer$recompositionRunner$2.f3080g = obj;
        return recomposer$recompositionRunner$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((Recomposer$recompositionRunner$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x011a A[EDGE_INSN: B:115:0x011a->B:58:0x011a BREAK  A[LOOP:0: B:53:0x0101->B:117:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x015b A[EDGE_INSN: B:118:0x015b->B:81:0x015b BREAK  A[LOOP:1: B:76:0x0142->B:120:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[Catch: all -> 0x011e, TryCatch #6 {, blocks: (B:47:0x00ea, B:49:0x00f0, B:50:0x00f4), top: B:113:0x00ea }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x0134 A[Catch: all -> 0x015c, TryCatch #4 {all -> 0x015c, blocks: (B:70:0x012f, B:72:0x0134, B:73:0x0137), top: B:109:0x012f }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Unreachable blocks removed: 4, instructions: 4 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7875v0 interfaceC7875v0M352h1;
        StateFlowImpl stateFlowImpl;
        InterfaceC5635e interfaceC5635e;
        C6399b c6399bMo12009w;
        C0496a c0496a;
        Recomposer recomposer;
        Recomposer.C0472c c0472c;
        StateFlowImpl stateFlowImpl2;
        InterfaceC5635e interfaceC5635e2;
        C6399b c6399bRemove;
        Recomposer recomposer2;
        Recomposer.C0472c c0472c2;
        StateFlowImpl stateFlowImpl3;
        InterfaceC5635e interfaceC5635e3;
        C6399b c6399bRemove2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f3079f;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0496a = this.f3078e;
            interfaceC7875v0M352h1 = (InterfaceC7875v0) this.f3080g;
            try {
                C7499b.m14977z0(obj);
                c0496a.mo1914a();
                recomposer2 = this.f3081h;
                synchronized (recomposer2.f3053b) {
                    if (recomposer2.f3054c == interfaceC7875v0M352h1) {
                        recomposer2.f3054c = null;
                    }
                    recomposer2.m1711t();
                }
                StateFlowImpl stateFlowImpl4 = Recomposer.f3050s;
                c0472c2 = this.f3081h.f3069r;
                do {
                    stateFlowImpl3 = Recomposer.f3050s;
                    interfaceC5635e3 = (InterfaceC5635e) stateFlowImpl3.getValue();
                    c6399bRemove2 = interfaceC5635e3.remove((Object) c0472c2);
                    if (interfaceC5635e3 != c6399bRemove2) {
                        break;
                    }
                } while (!stateFlowImpl3.mo14366c(interfaceC5635e3, c6399bRemove2));
                return C9072e.f47360a;
            } catch (Throwable th2) {
                th = th2;
                c0496a.mo1914a();
                recomposer = this.f3081h;
                synchronized (recomposer.f3053b) {
                    try {
                        if (recomposer.f3054c == interfaceC7875v0M352h1) {
                            recomposer.f3054c = null;
                        }
                        recomposer.m1711t();
                        StateFlowImpl stateFlowImpl5 = Recomposer.f3050s;
                        c0472c = this.f3081h.f3069r;
                        do {
                            stateFlowImpl2 = Recomposer.f3050s;
                            interfaceC5635e2 = (InterfaceC5635e) stateFlowImpl2.getValue();
                            c6399bRemove = interfaceC5635e2.remove((Object) c0472c);
                            if (interfaceC5635e2 != c6399bRemove) {
                                break;
                            }
                        } while (!stateFlowImpl2.mo14366c(interfaceC5635e2, c6399bRemove));
                        throw th;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        C7499b.m14977z0(obj);
        interfaceC7875v0M352h1 = C0062b.m352h1(((InterfaceC7882z) this.f3080g).getF6528b());
        Recomposer recomposer3 = this.f3081h;
        synchronized (recomposer3.f3053b) {
            try {
                Throwable th4 = recomposer3.f3055d;
                if (th4 != null) {
                    throw th4;
                }
                if (((Recomposer.State) recomposer3.f3066o.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down".toString());
                }
                if (recomposer3.f3054c != null) {
                    throw new IllegalStateException("Recomposer already running".toString());
                }
                recomposer3.f3054c = interfaceC7875v0M352h1;
                recomposer3.m1711t();
            } catch (Throwable th5) {
                throw th5;
            }
        }
        final Recomposer recomposer4 = this.f3081h;
        InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e> interfaceC2056p = new InterfaceC2056p<Set<? extends Object>, AbstractC0497b, C9072e>() { // from class: androidx.compose.runtime.Recomposer$recompositionRunner$2$unregisterApplyObserver$1
            {
                super(2);
            }

            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final C9072e mo1337m0(Set<? extends Object> set, AbstractC0497b abstractC0497b) {
                InterfaceC7840j<C9072e> interfaceC7840jM1711t;
                Set<? extends Object> set2 = set;
                C5207g.m11111f(set2, "changed");
                C5207g.m11111f(abstractC0497b, "<anonymous parameter 1>");
                Recomposer recomposer5 = recomposer4;
                synchronized (recomposer5.f3053b) {
                    if (((Recomposer.State) recomposer5.f3066o.getValue()).compareTo(Recomposer.State.Idle) >= 0) {
                        recomposer5.f3057f.addAll(set2);
                        interfaceC7840jM1711t = recomposer5.m1711t();
                    } else {
                        interfaceC7840jM1711t = null;
                    }
                }
                if (interfaceC7840jM1711t != null) {
                    interfaceC7840jM1711t.mo2031y(C9072e.f47360a);
                }
                return C9072e.f47360a;
            }
        };
        SnapshotKt.m1887f(SnapshotKt.f3260a);
        synchronized (SnapshotKt.f3262c) {
            SnapshotKt.f3266g.add(interfaceC2056p);
        }
        C0496a c0496a2 = new C0496a(interfaceC2056p);
        StateFlowImpl stateFlowImpl6 = Recomposer.f3050s;
        Recomposer.C0472c c0472c3 = this.f3081h.f3069r;
        do {
            stateFlowImpl = Recomposer.f3050s;
            interfaceC5635e = (InterfaceC5635e) stateFlowImpl.getValue();
            c6399bMo12009w = interfaceC5635e.mo12009w(c0472c3);
            if (interfaceC5635e == c6399bMo12009w) {
                break;
            }
        } while (!stateFlowImpl.mo14366c(interfaceC5635e, c6399bMo12009w));
        try {
            Recomposer recomposer5 = this.f3081h;
            synchronized (recomposer5.f3053b) {
                ArrayList arrayList = recomposer5.f3056e;
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((InterfaceC5321l) arrayList.get(i11)).mo1741u();
                }
                C9072e c9072e = C9072e.f47360a;
            }
            C04732 c04732 = new C04732(this.f3082i, this.f3083j, null);
            this.f3080g = interfaceC7875v0M352h1;
            this.f3078e = c0496a2;
            this.f3079f = 1;
            if (C7499b.m14963s(c04732, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            c0496a = c0496a2;
            c0496a.mo1914a();
            recomposer2 = this.f3081h;
            synchronized (recomposer2.f3053b) {
                if (recomposer2.f3054c == interfaceC7875v0M352h1) {
                    recomposer2.f3054c = null;
                }
                recomposer2.m1711t();
                StateFlowImpl stateFlowImpl7 = Recomposer.f3050s;
                c0472c2 = this.f3081h.f3069r;
                do {
                    stateFlowImpl3 = Recomposer.f3050s;
                    interfaceC5635e3 = (InterfaceC5635e) stateFlowImpl3.getValue();
                    c6399bRemove2 = interfaceC5635e3.remove((Object) c0472c2);
                    if (interfaceC5635e3 != c6399bRemove2) {
                        break;
                        break;
                    }
                } while (!stateFlowImpl3.mo14366c(interfaceC5635e3, c6399bRemove2));
                return C9072e.f47360a;
            }
        } catch (Throwable th6) {
            th = th6;
            c0496a = c0496a2;
            c0496a.mo1914a();
            recomposer = this.f3081h;
            synchronized (recomposer.f3053b) {
                if (recomposer.f3054c == interfaceC7875v0M352h1) {
                    recomposer.f3054c = null;
                }
                recomposer.m1711t();
            }
            StateFlowImpl stateFlowImpl8 = Recomposer.f3050s;
            c0472c = this.f3081h.f3069r;
            do {
                stateFlowImpl2 = Recomposer.f3050s;
                interfaceC5635e2 = (InterfaceC5635e) stateFlowImpl2.getValue();
                c6399bRemove = interfaceC5635e2.remove((Object) c0472c);
                if (interfaceC5635e2 != c6399bRemove) {
                    break;
                    break;
                }
            } while (!stateFlowImpl2.mo14366c(interfaceC5635e2, c6399bRemove));
            throw th;
        }
    }
}
