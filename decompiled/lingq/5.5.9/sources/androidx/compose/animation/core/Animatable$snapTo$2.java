package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p374s.AbstractC8911i;
import p374s.C8903e;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Ls/i;", "V", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.animation.core.Animatable$snapTo$2", m19206f = "Animatable.kt", m19207l = {}, m19208m = "invokeSuspend")
final class Animatable$snapTo$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0369a<Object, AbstractC8911i> f1522e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f1523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$snapTo$2(C0369a<Object, AbstractC8911i> c0369a, Object obj, InterfaceC9968c<? super Animatable$snapTo$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f1522e = c0369a;
        this.f1523f = obj;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((Animatable$snapTo$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new Animatable$snapTo$2(this.f1522e, this.f1523f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        C0369a<Object, AbstractC8911i> c0369a = this.f1522e;
        C8903e<Object, V> c8903e = c0369a.f1655c;
        c8903e.f46800c.mo17138d();
        c8903e.f46801d = Long.MIN_VALUE;
        c0369a.f1656d.setValue(Boolean.FALSE);
        Object objM1381a = C0369a.m1381a(c0369a, this.f1523f);
        c0369a.f1655c.f46799b.setValue(objM1381a);
        c0369a.f1657e.setValue(objM1381a);
        return C9072e.f47360a;
    }
}
