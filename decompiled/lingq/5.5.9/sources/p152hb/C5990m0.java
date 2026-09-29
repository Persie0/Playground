package p152hb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C2548c;
import com.google.android.gms.common.C2549d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C2542a;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import gb.InterfaceC5740d;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p071dc.C5142a;
import p071dc.InterfaceC5147f;
import p176ib.C6254b;
import p176ib.C6272i;

/* JADX INFO: renamed from: hb.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5990m0 implements InterfaceC5951a1, InterfaceC6030z1 {

    /* JADX INFO: renamed from: a */
    public final Lock f35530a;

    /* JADX INFO: renamed from: b */
    public final Condition f35531b;

    /* JADX INFO: renamed from: c */
    public final Context f35532c;

    /* JADX INFO: renamed from: d */
    public final C2549d f35533d;

    /* JADX INFO: renamed from: e */
    public final HandlerC5987l0 f35534e;

    /* JADX INFO: renamed from: f */
    public final Map<C2542a.b<?>, C2542a.e> f35535f;

    /* JADX INFO: renamed from: g */
    public final HashMap f35536g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final C6254b f35537h;

    /* JADX INFO: renamed from: i */
    public final Map<C2542a<?>, Boolean> f35538i;

    /* JADX INFO: renamed from: j */
    public final C2542a.a<? extends InterfaceC5147f, C5142a> f35539j;

    /* JADX INFO: renamed from: k */
    @NotOnlyInitialized
    public volatile InterfaceC5981j0 f35540k;

    /* JADX INFO: renamed from: l */
    public int f35541l;

    /* JADX INFO: renamed from: m */
    public final C5978i0 f35542m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC6026y0 f35543n;

    public C5990m0(Context context, C5978i0 c5978i0, Lock lock, Looper looper, C2548c c2548c, Map map, C6254b c6254b, Map map2, C2542a.a aVar, ArrayList arrayList, InterfaceC6026y0 interfaceC6026y0) {
        this.f35532c = context;
        this.f35530a = lock;
        this.f35533d = c2548c;
        this.f35535f = map;
        this.f35537h = c6254b;
        this.f35538i = map2;
        this.f35539j = aVar;
        this.f35542m = c5978i0;
        this.f35543n = interfaceC6026y0;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((C6027y1) arrayList.get(i10)).f35629c = this;
        }
        this.f35534e = new HandlerC5987l0(this, looper);
        this.f35531b = lock.newCondition();
        this.f35540k = new C5969f0(this);
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: a */
    public final void mo12386a() {
        this.f35540k.mo12408b();
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: b */
    public final boolean mo12387b(InterfaceC5983k interfaceC5983k) {
        return false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: b1 */
    public final void mo12397b1(Bundle bundle) {
        this.f35530a.lock();
        try {
            this.f35540k.mo12407a(bundle);
            this.f35530a.unlock();
        } catch (Throwable th2) {
            this.f35530a.unlock();
            throw th2;
        }
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: c */
    public final boolean mo12388c() {
        return this.f35540k instanceof C6013u;
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: d */
    public final <A, T extends AbstractC2546a<? extends InterfaceC5740d, A>> T mo12389d(T t10) {
        t10.m7570i();
        return (T) this.f35540k.mo12413g(t10);
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: e */
    public final void mo12390e() {
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: f */
    public final void mo12391f() {
        if (this.f35540k.mo12412f()) {
            this.f35536g.clear();
        }
    }

    @Override // p152hb.InterfaceC5951a1
    /* JADX INFO: renamed from: g */
    public final void mo12392g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String strConcat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append("mState=").println(this.f35540k);
        for (C2542a<?> c2542a : this.f35538i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) c2542a.f13886c).println(":");
            C2542a.e eVar = this.f35535f.get(c2542a.f13885b);
            C6272i.m12915i(eVar);
            eVar.mo7546j(strConcat, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p152hb.InterfaceC5957c
    /* JADX INFO: renamed from: h */
    public final void mo12398h(int i10) {
        this.f35530a.lock();
        try {
            this.f35540k.mo12410d(i10);
            this.f35530a.unlock();
        } catch (Throwable th2) {
            this.f35530a.unlock();
            throw th2;
        }
    }

    @Override // p152hb.InterfaceC6030z1
    /* JADX INFO: renamed from: h0 */
    public final void mo12439h0(ConnectionResult connectionResult, C2542a<?> c2542a, boolean z10) {
        this.f35530a.lock();
        try {
            this.f35540k.mo12409c(connectionResult, c2542a, z10);
            this.f35530a.unlock();
        } catch (Throwable th2) {
            this.f35530a.unlock();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12440i() {
        this.f35530a.lock();
        try {
            this.f35540k = new C5969f0(this);
            this.f35540k.mo12411e();
            this.f35531b.signalAll();
        } finally {
            this.f35530a.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m12441j(AbstractC5984k0 abstractC5984k0) {
        HandlerC5987l0 handlerC5987l0 = this.f35534e;
        handlerC5987l0.sendMessage(handlerC5987l0.obtainMessage(1, abstractC5984k0));
    }
}
