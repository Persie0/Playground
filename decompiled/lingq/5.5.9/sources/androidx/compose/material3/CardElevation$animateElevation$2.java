package androidx.compose.material3;

import androidx.compose.animation.core.C0369a;
import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p036c0.C1651g;
import p260m8.C7499b;
import p374s.C8905f;
import p375s0.C8941c;
import p423v.C9604b;
import p423v.C9606d;
import p423v.C9608f;
import p423v.C9615m;
import p423v.InterfaceC9610h;
import p464wl.InterfaceC9968c;
import p470x1.C10017e;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, PreferencesProto$Value.DOUBLE_FIELD_NUMBER, 1}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.material3.CardElevation$animateElevation$2", m19206f = "Card.kt", m19207l = {681, 688}, m19208m = "invokeSuspend")
final class CardElevation$animateElevation$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2706e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f2707f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0369a<C10017e, C8905f> f2708g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0463b f2709h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ float f2710i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC9610h f2711j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardElevation$animateElevation$2(boolean z10, C0369a<C10017e, C8905f> c0369a, C0463b c0463b, float f3, InterfaceC9610h interfaceC9610h, InterfaceC9968c<? super CardElevation$animateElevation$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2707f = z10;
        this.f2708g = c0369a;
        this.f2709h = c0463b;
        this.f2710i = f3;
        this.f2711j = interfaceC9610h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CardElevation$animateElevation$2(this.f2707f, this.f2708g, this.f2709h, this.f2710i, this.f2711j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CardElevation$animateElevation$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC9610h c9604b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2706e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            boolean z10 = this.f2707f;
            float f3 = this.f2710i;
            C0369a<C10017e, C8905f> c0369a = this.f2708g;
            if (z10) {
                float f10 = ((C10017e) c0369a.f1657e.getValue()).f50966a;
                C0463b c0463b = this.f2709h;
                if (C10017e.m18618a(f10, c0463b.f2865b)) {
                    c9604b = new C9615m(C8941c.f46888b);
                } else if (C10017e.m18618a(f10, c0463b.f2867d)) {
                    c9604b = new C9608f();
                } else if (C10017e.m18618a(f10, c0463b.f2866c)) {
                    c9604b = new C9606d();
                } else {
                    c9604b = C10017e.m18618a(f10, c0463b.f2868e) ? new C9604b() : null;
                }
                this.f2706e = 1;
                if (C1651g.m5369a(c0369a, f3, c9604b, this.f2711j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                C10017e c10017e = new C10017e(f3);
                this.f2706e = 2;
                if (c0369a.m1384d(c10017e, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
