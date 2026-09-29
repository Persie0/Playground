package kotlin.coroutines.jvm.internal;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import dm.C5209i;
import dm.InterfaceC5205e;
import kotlin.Metadata;
import p464wl.InterfaceC9968c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lkotlin/coroutines/jvm/internal/SuspendLambda;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Ldm/e;", "", "kotlin-stdlib"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public abstract class SuspendLambda extends ContinuationImpl implements InterfaceC5205e<Object> {

    /* JADX INFO: renamed from: d */
    public final int f38108d;

    public SuspendLambda(int i10, InterfaceC9968c<Object> interfaceC9968c) {
        super(interfaceC9968c);
        this.f38108d = i10;
    }

    @Override // dm.InterfaceC5205e
    /* JADX INFO: renamed from: J */
    public final int mo10978J() {
        return this.f38108d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (this.f38104a != null) {
            return super.toString();
        }
        String strMo11128h = C5209i.f33277a.mo11128h(this);
        C5207g.m11110e(strMo11128h, "renderLambdaToString(this)");
        return strMo11128h;
    }
}
