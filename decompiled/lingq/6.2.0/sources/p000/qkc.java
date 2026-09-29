package p000;

import com.google.android.gms.measurement.internal.C1045d;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class qkc implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f57883a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57884b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57885c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ eoc f57886d;

    public qkc(eoc eocVar, String str, String str2, String str3) {
        this.f57883a = str;
        this.f57884b = str2;
        this.f57885c = str3;
        this.f57886d = eocVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        eoc eocVar = this.f57886d;
        eocVar.f37647f.m5902V();
        nnb nnbVar = eocVar.f37647f.f12360c;
        C1045d.m5885T(nnbVar);
        return nnbVar.m17510B0(this.f57883a, this.f57884b, this.f57885c);
    }
}
