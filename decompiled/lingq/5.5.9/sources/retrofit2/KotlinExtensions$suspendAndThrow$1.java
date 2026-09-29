package retrofit2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00060\u0000j\u0002`\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0080@"}, m13365d2 = {"Ljava/lang/Exception;", "Lkotlin/Exception;", "Lwl/c;", "", "continuation", "", "suspendAndThrow"}, m13366k = 3, m13367mv = {1, 4, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "retrofit2.KotlinExtensions", m19206f = "KotlinExtensions.kt", m19207l = {113}, m19208m = "suspendAndThrow")
public final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f46519d;

    /* JADX INFO: renamed from: e */
    public int f46520e;

    public KotlinExtensions$suspendAndThrow$1(InterfaceC9968c interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f46519d = obj;
        this.f46520e |= Integer.MIN_VALUE;
        return KotlinExtensions.m17021a(null, this);
    }
}
