package p307oo;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.android.C7080a;
import kotlinx.coroutines.internal.InterfaceC7161k;
import no.AbstractC7821c1;

/* JADX INFO: renamed from: oo.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8097a implements InterfaceC7161k {
    @Override // kotlinx.coroutines.internal.InterfaceC7161k
    /* JADX INFO: renamed from: a */
    public String mo14458a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // kotlinx.coroutines.internal.InterfaceC7161k
    /* JADX INFO: renamed from: b */
    public AbstractC7821c1 mo14459b(List<? extends InterfaceC7161k> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C7080a(C8102f.m16008a(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // kotlinx.coroutines.internal.InterfaceC7161k
    /* JADX INFO: renamed from: c */
    public int mo14460c() {
        return 1073741823;
    }
}
