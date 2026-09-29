package androidx.compose.foundation.gestures;

import androidx.compose.foundation.C0392d;
import androidx.compose.foundation.MutatePriority;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p401u.InterfaceC9356i;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", m19206f = "ScrollableState.kt", m19207l = {175}, m19208m = "invokeSuspend")
public final class DefaultScrollableState$scroll$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1994e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DefaultScrollableState f1995f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ MutatePriority f1996g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> f1997h;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lu/i;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", m19206f = "ScrollableState.kt", m19207l = {178}, m19208m = "invokeSuspend")
    public static final class C03991 extends SuspendLambda implements InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f1998e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f1999f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ DefaultScrollableState f2000g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> f2001h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C03991(DefaultScrollableState defaultScrollableState, InterfaceC2056p<? super InterfaceC9356i, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C03991> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f2000g = defaultScrollableState;
            this.f2001h = interfaceC2056p;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C03991 c03991 = new C03991(this.f2000g, this.f2001h, interfaceC9968c);
            c03991.f1999f = obj;
            return c03991;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC9356i interfaceC9356i, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C03991) mo1336a(interfaceC9356i, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f1998e;
            DefaultScrollableState defaultScrollableState = this.f2000g;
            try {
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC9356i interfaceC9356i = (InterfaceC9356i) this.f1999f;
                    defaultScrollableState.f1992d.setValue(Boolean.TRUE);
                    InterfaceC2056p<InterfaceC9356i, InterfaceC9968c<? super C9072e>, Object> interfaceC2056p = this.f2001h;
                    this.f1998e = 1;
                    if (interfaceC2056p.mo1337m0(interfaceC9356i, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                defaultScrollableState.f1992d.setValue(Boolean.FALSE);
                return C9072e.f47360a;
            } catch (Throwable th2) {
                defaultScrollableState.f1992d.setValue(Boolean.FALSE);
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, InterfaceC2056p<? super InterfaceC9356i, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super DefaultScrollableState$scroll$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1995f = defaultScrollableState;
        this.f1996g = mutatePriority;
        this.f1997h = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DefaultScrollableState$scroll$2(this.f1995f, this.f1996g, this.f1997h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DefaultScrollableState$scroll$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1994e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DefaultScrollableState defaultScrollableState = this.f1995f;
            C0392d c0392d = defaultScrollableState.f1991c;
            C03991 c03991 = new C03991(defaultScrollableState, this.f1997h, null);
            this.f1994e = 1;
            if (c0392d.m1430a(defaultScrollableState.f1990b, this.f1996g, c03991, this) == coroutineSingletons) {
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
