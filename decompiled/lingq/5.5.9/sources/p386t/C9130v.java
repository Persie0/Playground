package p386t;

import androidx.compose.p017ui.InterfaceC0500b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p375s0.C8941c;
import p464wl.InterfaceC9968c;
import p470x1.C10025m;
import sl.C9072e;

/* JADX INFO: renamed from: t.v */
/* JADX INFO: loaded from: classes.dex */
public final class C9130v implements InterfaceC9132x {

    /* JADX INFO: renamed from: a */
    public static final C9130v f47638a = new C9130v();

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: a */
    public final InterfaceC0500b mo1394a() {
        int i10 = InterfaceC0500b.f3324m;
        return InterfaceC0500b.a.f3325a;
    }

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: b */
    public final Object mo1395b(long j10, InterfaceC2056p<? super C10025m, ? super InterfaceC9968c<? super C10025m>, ? extends Object> interfaceC2056p, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo1337m0 = interfaceC2056p.mo1337m0(new C10025m(j10), interfaceC9968c);
        return objMo1337m0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo1337m0 : C9072e.f47360a;
    }

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: c */
    public final long mo1396c(long j10, int i10, InterfaceC2052l<? super C8941c, C8941c> interfaceC2052l) {
        return interfaceC2052l.mo528n(new C8941c(j10)).f46892a;
    }

    @Override // p386t.InterfaceC9132x
    /* JADX INFO: renamed from: d */
    public final boolean mo1397d() {
        return false;
    }
}
