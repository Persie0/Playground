package p406u4;

import android.util.SparseArray;
import com.google.android.play.core.assetpacks.C3112c;
import com.google.android.play.core.assetpacks.C3118i;
import p326q.C8446b;
import p326q.C8449e;
import p338qd.C8561n0;
import td.C9269q;
import td.C9270r;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: u4.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9427o0 implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final Object f48376a;

    /* JADX INFO: renamed from: b */
    public final Object f48377b;

    /* JADX INFO: renamed from: c */
    public final Object f48378c;

    /* JADX INFO: renamed from: d */
    public final Object f48379d;

    public C9427o0() {
        this.f48376a = new C8446b();
        this.f48378c = new SparseArray();
        this.f48379d = new C8449e();
        this.f48377b = new C8446b();
    }

    public C9427o0(InterfaceC9271s interfaceC9271s, C9269q c9269q, InterfaceC9271s interfaceC9271s2, InterfaceC9271s interfaceC9271s3) {
        this.f48376a = interfaceC9271s;
        this.f48377b = c9269q;
        this.f48378c = interfaceC9271s2;
        this.f48379d = interfaceC9271s3;
    }

    @Override // td.InterfaceC9271s
    public final /* bridge */ /* synthetic */ Object zza() {
        Object objZza = ((InterfaceC9271s) this.f48376a).zza();
        return new C3118i((C3112c) objZza, C9270r.m17630a((InterfaceC9271s) this.f48377b), (C8561n0) ((InterfaceC9271s) this.f48378c).zza(), C9270r.m17630a((InterfaceC9271s) this.f48379d));
    }
}
