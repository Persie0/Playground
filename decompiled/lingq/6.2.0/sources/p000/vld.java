package p000;

import com.google.android.gms.internal.measurement.zzvr;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vld implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65576a;

    public /* synthetic */ vld(int i) {
        this.f65576a = i;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        switch (this.f65576a) {
            case 0:
                if (obj != null) {
                    throw new ClassCastException();
                }
                zzvr zzvrVar = wld.f67030g;
                throw null;
            default:
                throw g9a.m12430g(obj);
        }
    }
}
