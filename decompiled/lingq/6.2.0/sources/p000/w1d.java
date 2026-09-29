package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.internal.measurement.zzmk;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1d implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ w1d f66235a = new w1d();

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) {
        ApiException apiException = (ApiException) obj;
        throw new zzmk(apiException.f11645a.f11662a, apiException.getMessage(), apiException);
    }
}
