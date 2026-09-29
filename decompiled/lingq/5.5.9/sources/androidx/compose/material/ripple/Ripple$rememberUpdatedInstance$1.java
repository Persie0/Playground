package androidx.compose.material.ripple;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p021b0.AbstractC1283h;
import p021b0.C1278c;
import p021b0.C1284i;
import p021b0.C1286k;
import p081e0.InterfaceC5301c1;
import p260m8.C7499b;
import p374s.C8904e0;
import p374s.C8927q;
import p423v.C9603a;
import p423v.C9604b;
import p423v.C9605c;
import p423v.C9606d;
import p423v.C9607e;
import p423v.C9608f;
import p423v.C9609g;
import p423v.C9614l;
import p423v.C9615m;
import p423v.C9616n;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9611i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1", m19206f = "Ripple.kt", m19207l = {136}, m19208m = "invokeSuspend")
final class Ripple$rememberUpdatedInstance$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2584e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2585f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC9611i f2586g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ AbstractC1283h f2587h;

    /* JADX INFO: renamed from: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$a */
    public static final class C0448a implements InterfaceC7117d<InterfaceC9610h> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AbstractC1283h f2588a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC7882z f2589b;

        public C0448a(AbstractC1283h abstractC1283h, InterfaceC7882z interfaceC7882z) {
            this.f2588a = abstractC1283h;
            this.f2589b = interfaceC7882z;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(InterfaceC9610h interfaceC9610h, InterfaceC9968c interfaceC9968c) {
            float f3;
            InterfaceC9610h interfaceC9610h2 = interfaceC9610h;
            boolean z10 = interfaceC9610h2 instanceof C9615m;
            InterfaceC7882z interfaceC7882z = this.f2589b;
            AbstractC1283h abstractC1283h = this.f2588a;
            if (z10) {
                abstractC1283h.mo1548e((C9615m) interfaceC9610h2, interfaceC7882z);
            } else if (interfaceC9610h2 instanceof C9616n) {
                abstractC1283h.mo1549g(((C9616n) interfaceC9610h2).f49283a);
            } else if (interfaceC9610h2 instanceof C9614l) {
                abstractC1283h.mo1549g(((C9614l) interfaceC9610h2).f49281a);
            } else {
                abstractC1283h.getClass();
                C5207g.m11111f(interfaceC9610h2, "interaction");
                C5207g.m11111f(interfaceC7882z, "scope");
                C1286k c1286k = abstractC1283h.f7976a;
                c1286k.getClass();
                boolean z11 = interfaceC9610h2 instanceof C9608f;
                ArrayList arrayList = c1286k.f7981d;
                if (z11) {
                    arrayList.add(interfaceC9610h2);
                } else if (interfaceC9610h2 instanceof C9609g) {
                    arrayList.remove(((C9609g) interfaceC9610h2).f49279a);
                } else if (interfaceC9610h2 instanceof C9606d) {
                    arrayList.add(interfaceC9610h2);
                } else if (interfaceC9610h2 instanceof C9607e) {
                    arrayList.remove(((C9607e) interfaceC9610h2).f49278a);
                } else if (interfaceC9610h2 instanceof C9604b) {
                    arrayList.add(interfaceC9610h2);
                } else if (interfaceC9610h2 instanceof C9605c) {
                    arrayList.remove(((C9605c) interfaceC9610h2).f49277a);
                } else if (interfaceC9610h2 instanceof C9603a) {
                    arrayList.remove(((C9603a) interfaceC9610h2).f49276a);
                }
                InterfaceC9610h interfaceC9610h3 = (InterfaceC9610h) C6752c.m13433a0(arrayList);
                if (!C5207g.m11106a(c1286k.f7982e, interfaceC9610h3)) {
                    if (interfaceC9610h3 != null) {
                        InterfaceC5301c1<C1278c> interfaceC5301c1 = c1286k.f7979b;
                        if (z11) {
                            f3 = interfaceC5301c1.getValue().f7959c;
                        } else if (interfaceC9610h2 instanceof C9606d) {
                            f3 = interfaceC5301c1.getValue().f7958b;
                        } else {
                            f3 = interfaceC9610h2 instanceof C9604b ? interfaceC5301c1.getValue().f7957a : 0.0f;
                        }
                        C8904e0<Float> c8904e0 = C1284i.f7977a;
                        C8904e0<Float> c8904e1 = (!(interfaceC9610h3 instanceof C9608f) && ((interfaceC9610h3 instanceof C9606d) || (interfaceC9610h3 instanceof C9604b))) ? new C8904e0<>(45, C8927q.f46849c, 2) : C1284i.f7977a;
                        C7828f.m15570d(interfaceC7882z, null, null, new StateLayer$handleInteraction$1(c1286k, f3, c8904e1, null), 3);
                    } else {
                        InterfaceC9610h interfaceC9610h4 = c1286k.f7982e;
                        C8904e0<Float> c8904e2 = C1284i.f7977a;
                        C7828f.m15570d(interfaceC7882z, null, null, new StateLayer$handleInteraction$2(c1286k, ((interfaceC9610h4 instanceof C9608f) || (interfaceC9610h4 instanceof C9606d) || !(interfaceC9610h4 instanceof C9604b)) ? C1284i.f7977a : new C8904e0<>(150, C8927q.f46849c, 2), null), 3);
                    }
                    c1286k.f7982e = interfaceC9610h3;
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1(InterfaceC9611i interfaceC9611i, AbstractC1283h abstractC1283h, InterfaceC9968c<? super Ripple$rememberUpdatedInstance$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2586g = interfaceC9611i;
        this.f2587h = abstractC1283h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        Ripple$rememberUpdatedInstance$1 ripple$rememberUpdatedInstance$1 = new Ripple$rememberUpdatedInstance$1(this.f2586g, this.f2587h, interfaceC9968c);
        ripple$rememberUpdatedInstance$1.f2585f = obj;
        return ripple$rememberUpdatedInstance$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((Ripple$rememberUpdatedInstance$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2584e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f2585f;
            C7138s c7138sMo18072b = this.f2586g.mo18072b();
            C0448a c0448a = new C0448a(this.f2587h, interfaceC7882z);
            this.f2584e = 1;
            c7138sMo18072b.getClass();
            if (C7138s.m14389m(c7138sMo18072b, c0448a, this) == coroutineSingletons) {
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
