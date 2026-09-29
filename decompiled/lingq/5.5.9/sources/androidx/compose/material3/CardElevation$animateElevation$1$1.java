package androidx.compose.material3;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
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
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material3.CardElevation$animateElevation$1$1", m19206f = "Card.kt", m19207l = {619}, m19208m = "invokeSuspend")
final class CardElevation$animateElevation$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2702e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC9611i f2703f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SnapshotStateList<InterfaceC9610h> f2704g;

    /* JADX INFO: renamed from: androidx.compose.material3.CardElevation$animateElevation$1$1$a */
    public static final class C0457a implements InterfaceC7117d<InterfaceC9610h> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SnapshotStateList<InterfaceC9610h> f2705a;

        public C0457a(SnapshotStateList<InterfaceC9610h> snapshotStateList) {
            this.f2705a = snapshotStateList;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(InterfaceC9610h interfaceC9610h, InterfaceC9968c interfaceC9968c) {
            InterfaceC9610h interfaceC9610h2 = interfaceC9610h;
            boolean z10 = interfaceC9610h2 instanceof C9608f;
            SnapshotStateList<InterfaceC9610h> snapshotStateList = this.f2705a;
            if (z10) {
                snapshotStateList.add(interfaceC9610h2);
            } else if (interfaceC9610h2 instanceof C9609g) {
                snapshotStateList.remove(((C9609g) interfaceC9610h2).f49279a);
            } else if (interfaceC9610h2 instanceof C9606d) {
                snapshotStateList.add(interfaceC9610h2);
            } else if (interfaceC9610h2 instanceof C9607e) {
                snapshotStateList.remove(((C9607e) interfaceC9610h2).f49278a);
            } else if (interfaceC9610h2 instanceof C9615m) {
                snapshotStateList.add(interfaceC9610h2);
            } else if (interfaceC9610h2 instanceof C9616n) {
                snapshotStateList.remove(((C9616n) interfaceC9610h2).f49283a);
            } else if (interfaceC9610h2 instanceof C9614l) {
                snapshotStateList.remove(((C9614l) interfaceC9610h2).f49281a);
            } else if (interfaceC9610h2 instanceof C9604b) {
                snapshotStateList.add(interfaceC9610h2);
            } else if (interfaceC9610h2 instanceof C9605c) {
                snapshotStateList.remove(((C9605c) interfaceC9610h2).f49277a);
            } else if (interfaceC9610h2 instanceof C9603a) {
                snapshotStateList.remove(((C9603a) interfaceC9610h2).f49276a);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$1$1(InterfaceC9611i interfaceC9611i, SnapshotStateList<InterfaceC9610h> snapshotStateList, InterfaceC9968c<? super CardElevation$animateElevation$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2703f = interfaceC9611i;
        this.f2704g = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CardElevation$animateElevation$1$1(this.f2703f, this.f2704g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CardElevation$animateElevation$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2702e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C7138s c7138sMo18072b = this.f2703f.mo18072b();
            C0457a c0457a = new C0457a(this.f2704g);
            this.f2702e = 1;
            c7138sMo18072b.getClass();
            if (C7138s.m14389m(c7138sMo18072b, c0457a, this) == coroutineSingletons) {
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
