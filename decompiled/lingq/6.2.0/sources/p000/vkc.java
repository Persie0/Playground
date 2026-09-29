package p000;

import com.google.android.gms.measurement.internal.C1045d;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class vkc implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65551a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f65552b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f65553c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f65554d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ eoc f65555e;

    public /* synthetic */ vkc(eoc eocVar, String str, String str2, String str3, int i) {
        this.f65551a = i;
        this.f65552b = str;
        this.f65553c = str2;
        this.f65554d = str3;
        this.f65555e = eocVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.f65551a;
        String str = this.f65554d;
        String str2 = this.f65553c;
        String str3 = this.f65552b;
        eoc eocVar = this.f65555e;
        switch (i) {
            case 0:
                eocVar.f37647f.m5902V();
                nnb nnbVar = eocVar.f37647f.f12360c;
                C1045d.m5885T(nnbVar);
                return nnbVar.m17510B0(str3, str2, str);
            case 1:
                eocVar.f37647f.m5902V();
                nnb nnbVar2 = eocVar.f37647f.f12360c;
                C1045d.m5885T(nnbVar2);
                return nnbVar2.m17514F0(str3, str2, str);
            default:
                eocVar.f37647f.m5902V();
                nnb nnbVar3 = eocVar.f37647f.f12360c;
                C1045d.m5885T(nnbVar3);
                return nnbVar3.m17514F0(str3, str2, str);
        }
    }
}
