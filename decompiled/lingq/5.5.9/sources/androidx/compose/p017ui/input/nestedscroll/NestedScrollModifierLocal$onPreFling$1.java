package androidx.compose.p017ui.input.nestedscroll;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", m19206f = "NestedScrollModifierLocal.kt", m19207l = {ModuleDescriptor.MODULE_VERSION, 89}, m19208m = "onPreFling-QWom1Mo")
public final class NestedScrollModifierLocal$onPreFling$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public NestedScrollModifierLocal f3600d;

    /* JADX INFO: renamed from: e */
    public long f3601e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f3602f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ NestedScrollModifierLocal f3603g;

    /* JADX INFO: renamed from: h */
    public int f3604h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPreFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, InterfaceC9968c<? super NestedScrollModifierLocal$onPreFling$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f3603g = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f3602f = obj;
        this.f3604h |= Integer.MIN_VALUE;
        return this.f3603g.mo2017h(0L, this);
    }
}
