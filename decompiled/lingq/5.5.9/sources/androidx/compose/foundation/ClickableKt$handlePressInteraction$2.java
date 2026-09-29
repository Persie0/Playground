package androidx.compose.foundation;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7875v0;
import no.InterfaceC7882z;
import p081e0.InterfaceC5301c1;
import p081e0.InterfaceC5312g0;
import p260m8.C7499b;
import p401u.InterfaceC9354g;
import p423v.C9614l;
import p423v.C9615m;
import p423v.C9616n;
import p423v.InterfaceC9610h;
import p423v.InterfaceC9612j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2", m19206f = "Clickable.kt", m19207l = {445, 447, 454, 455, 464}, m19208m = "invokeSuspend")
final class ClickableKt$handlePressInteraction$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public boolean f1786e;

    /* JADX INFO: renamed from: f */
    public int f1787f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f1788g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC9354g f1789h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f1790i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC9612j f1791j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC5312g0<C9615m> f1792k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC5301c1<InterfaceC2041a<Boolean>> f1793l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ClickableKt$handlePressInteraction$2(InterfaceC9354g interfaceC9354g, long j10, InterfaceC9612j interfaceC9612j, InterfaceC5312g0<C9615m> interfaceC5312g0, InterfaceC5301c1<? extends InterfaceC2041a<Boolean>> interfaceC5301c1, InterfaceC9968c<? super ClickableKt$handlePressInteraction$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1789h = interfaceC9354g;
        this.f1790i = j10;
        this.f1791j = interfaceC9612j;
        this.f1792k = interfaceC5312g0;
        this.f1793l = interfaceC5301c1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ClickableKt$handlePressInteraction$2 clickableKt$handlePressInteraction$2 = new ClickableKt$handlePressInteraction$2(this.f1789h, this.f1790i, this.f1791j, this.f1792k, this.f1793l, interfaceC9968c);
        clickableKt$handlePressInteraction$2.f1788g = obj;
        return clickableKt$handlePressInteraction$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ClickableKt$handlePressInteraction$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7875v0 interfaceC7875v0M15570d;
        Object objMo1465x0;
        boolean z10;
        C9615m c9615m;
        C9616n c9616n;
        C9616n c9616n2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1787f;
        InterfaceC5312g0<C9615m> interfaceC5312g0 = this.f1792k;
        InterfaceC9612j interfaceC9612j = this.f1791j;
        if (i10 != 0) {
            if (i10 == 1) {
                interfaceC7875v0M15570d = (InterfaceC7875v0) this.f1788g;
                C7499b.m14977z0(obj);
                objMo1465x0 = obj;
            } else if (i10 == 2) {
                z10 = this.f1786e;
                C7499b.m14977z0(obj);
                if (z10) {
                    c9615m = new C9615m(this.f1790i);
                    c9616n = new C9616n(c9615m);
                    this.f1788g = c9616n;
                    this.f1787f = 3;
                    if (interfaceC9612j.mo18074c(c9615m, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c9616n2 = c9616n;
                    this.f1788g = null;
                    this.f1787f = 4;
                    if (interfaceC9612j.mo18074c(c9616n2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else if (i10 == 3) {
                c9616n2 = (C9616n) this.f1788g;
                C7499b.m14977z0(obj);
                this.f1788g = null;
                this.f1787f = 4;
                if (interfaceC9612j.mo18074c(c9616n2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 4 && i10 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            interfaceC5312g0.setValue(null);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        interfaceC7875v0M15570d = C7828f.m15570d((InterfaceC7882z) this.f1788g, null, null, new ClickableKt$handlePressInteraction$2$delayJob$1(this.f1793l, this.f1790i, this.f1791j, this.f1792k, null), 3);
        this.f1788g = interfaceC7875v0M15570d;
        this.f1787f = 1;
        objMo1465x0 = this.f1789h.mo1465x0(this);
        if (objMo1465x0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        boolean zBooleanValue = ((Boolean) objMo1465x0).booleanValue();
        if (interfaceC7875v0M15570d.mo15547b()) {
            this.f1788g = null;
            this.f1786e = zBooleanValue;
            this.f1787f = 2;
            interfaceC7875v0M15570d.mo15618a(null);
            Object objMo15615E = interfaceC7875v0M15570d.mo15615E(this);
            if (objMo15615E != coroutineSingletons) {
                objMo15615E = C9072e.f47360a;
            }
            if (objMo15615E == coroutineSingletons) {
                return coroutineSingletons;
            }
            z10 = zBooleanValue;
            if (z10) {
                c9615m = new C9615m(this.f1790i);
                c9616n = new C9616n(c9615m);
                this.f1788g = c9616n;
                this.f1787f = 3;
                if (interfaceC9612j.mo18074c(c9615m, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c9616n2 = c9616n;
                this.f1788g = null;
                this.f1787f = 4;
                if (interfaceC9612j.mo18074c(c9616n2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            C9615m value = interfaceC5312g0.getValue();
            if (value != null) {
                InterfaceC9610h c9616n3 = zBooleanValue ? new C9616n(value) : new C9614l(value);
                this.f1788g = null;
                this.f1787f = 5;
                if (interfaceC9612j.mo18074c(c9616n3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        interfaceC5312g0.setValue(null);
        return C9072e.f47360a;
    }
}
