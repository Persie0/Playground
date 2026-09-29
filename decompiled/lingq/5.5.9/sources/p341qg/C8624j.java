package p341qg;

import com.kochava.tracker.privacy.internal.ConsentState;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import p243lg.C7360b;
import p243lg.InterfaceC7361c;
import p349qo.C8656b;
import p484xf.C10184a;

/* JADX INFO: renamed from: qg.j */
/* JADX INFO: loaded from: classes.dex */
public final class C8624j implements InterfaceC8625k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7361c f46143a;

    /* JADX INFO: renamed from: e */
    public final List<Object> f46147e = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: f */
    public final List<InterfaceC8615a> f46148f = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: g */
    public final List<Object> f46149g = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC8616b> f46150h = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: i */
    public final ArrayList f46151i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public final HashMap f46152j = new HashMap();

    /* JADX INFO: renamed from: l */
    public final CountDownLatch f46154l = new CountDownLatch(1);

    /* JADX INFO: renamed from: m */
    public boolean f46155m = false;

    /* JADX INFO: renamed from: n */
    public ConsentState f46156n = ConsentState.NOT_ANSWERED;

    /* JADX INFO: renamed from: k */
    public Boolean f46153k = null;

    /* JADX INFO: renamed from: b */
    public final C10184a f46144b = new C10184a();

    /* JADX INFO: renamed from: c */
    public final C10184a f46145c = new C10184a();

    /* JADX INFO: renamed from: d */
    public final C10184a f46146d = new C10184a();

    public C8624j(C7360b c7360b) {
        this.f46143a = c7360b;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized HashMap m16846a() {
        return new HashMap(this.f46152j);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized boolean m16847b() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f46155m;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized void m16848c(boolean z10) {
        try {
            Boolean bool = this.f46153k;
            if (bool == null || bool.booleanValue() != z10) {
                Boolean boolValueOf = Boolean.valueOf(z10);
                this.f46153k = boolValueOf;
                boolean zBooleanValue = boolValueOf.booleanValue();
                ArrayList arrayListM16896W = C8656b.m16896W(this.f46148f);
                if (!arrayListM16896W.isEmpty()) {
                    ((C7360b) this.f46143a).m14769f(new RunnableC8622h(arrayListM16896W, zBooleanValue));
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m16849d(ConsentState consentState) {
        if (this.f46156n == consentState) {
            return;
        }
        this.f46156n = consentState;
        ArrayList arrayListM16896W = C8656b.m16896W(this.f46150h);
        if (!arrayListM16896W.isEmpty()) {
            ((C7360b) this.f46143a).m14769f(new RunnableC8623i(arrayListM16896W, consentState));
        }
    }
}
