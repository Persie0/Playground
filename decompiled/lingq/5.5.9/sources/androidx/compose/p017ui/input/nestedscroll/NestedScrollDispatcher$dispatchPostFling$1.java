package androidx.compose.p017ui.input.nestedscroll;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m19206f = "NestedScrollModifier.kt", m19207l = {217}, m19208m = "dispatchPostFling-RZ2iAVY")
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f3582d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ NestedScrollDispatcher f3583e;

    /* JADX INFO: renamed from: f */
    public int f3584f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, InterfaceC9968c<? super NestedScrollDispatcher$dispatchPostFling$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f3583e = nestedScrollDispatcher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f3582d = obj;
        this.f3584f |= Integer.MIN_VALUE;
        return this.f3583e.m2014a(0L, 0L, this);
    }
}
