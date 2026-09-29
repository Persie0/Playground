package androidx.compose.foundation.interaction;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p423v.C9606d;
import p423v.C9607e;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9611i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", m19206f = "FocusInteraction.kt", m19207l = {69}, m19208m = "invokeSuspend")
final class FocusInteractionKt$collectIsFocusedAsState$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f2292e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC9611i f2293f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC5312g0<Boolean> f2294g;

    /* JADX INFO: renamed from: androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1$a */
    public static final class C0416a implements InterfaceC7117d<InterfaceC9610h> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List<C9606d> f2295a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC5312g0<Boolean> f2296b;

        public C0416a(ArrayList arrayList, InterfaceC5312g0 interfaceC5312g0) {
            this.f2295a = arrayList;
            this.f2296b = interfaceC5312g0;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(InterfaceC9610h interfaceC9610h, InterfaceC9968c interfaceC9968c) {
            InterfaceC9610h interfaceC9610h2 = interfaceC9610h;
            boolean z10 = interfaceC9610h2 instanceof C9606d;
            List<C9606d> list = this.f2295a;
            if (z10) {
                list.add((C9606d) interfaceC9610h2);
            } else if (interfaceC9610h2 instanceof C9607e) {
                list.remove(((C9607e) interfaceC9610h2).f49278a);
            }
            this.f2296b.setValue(Boolean.valueOf(!list.isEmpty()));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusInteractionKt$collectIsFocusedAsState$1$1(InterfaceC9611i interfaceC9611i, InterfaceC5312g0<Boolean> interfaceC5312g0, InterfaceC9968c<? super FocusInteractionKt$collectIsFocusedAsState$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f2293f = interfaceC9611i;
        this.f2294g = interfaceC5312g0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new FocusInteractionKt$collectIsFocusedAsState$1$1(this.f2293f, this.f2294g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((FocusInteractionKt$collectIsFocusedAsState$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f2292e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ArrayList arrayList = new ArrayList();
            C7138s c7138sMo18072b = this.f2293f.mo18072b();
            C0416a c0416a = new C0416a(arrayList, this.f2294g);
            this.f2292e = 1;
            c7138sMo18072b.getClass();
            if (C7138s.m14389m(c7138sMo18072b, c0416a, this) == coroutineSingletons) {
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
